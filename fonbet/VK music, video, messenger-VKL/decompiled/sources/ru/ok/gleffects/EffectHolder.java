package ru.ok.gleffects;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.media.ExifInterface;
import android.media.MediaMetadataRetriever;
import android.opengl.GLES20;
import android.util.Log;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.unity3d.services.UnityAdsConstants;
import com.vk.upload.impl.tasks.cover.CoverVideoUploadTask;
import java.io.File;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.gleffects.EffectHolder;
import ru.ok.gleffects.EffectRegistry;
import ru.ok.gleffects.EffectVideoController;
import ru.ok.gleffects.dto.MusicTrackInfo;
import ru.ok.gleffects.dto.UserInfo;
import ru.ok.gleffects.impl.EffectFactory;
import ru.ok.gleffects.impl.EffectNativeSink;
import ru.ok.gleffects.recognition.CatData;
import ru.ok.gleffects.recognition.FaceData;
import ru.ok.gleffects.recognition.FaceMorphingData;
import ru.ok.gleffects.recognition.FigureData;
import ru.ok.gleffects.recognition.GalleryAsset;
import ru.ok.gleffects.recognition.PatternMatchData;
import ru.ok.gleffects.util.TextureHelper;
import ru.ok.proto.PublisherConfiguration;
import xsna.a72;
import xsna.atv0;
import xsna.d9p;
import xsna.f9p;
import xsna.h;
import xsna.h73;
import xsna.h9p;
import xsna.i73;
import xsna.j9p;
import xsna.jk9;
import xsna.ke9;
import xsna.m9p;
import xsna.n52;
import xsna.u8p;
import xsna.ux3;
import xsna.x8p;
import xsna.xh9;
import xsna.y8p;

/* loaded from: classes11.dex */
public class EffectHolder {
    private static final String TAG = "EffectHolder";
    private EffectAudioController audioController;
    private EffectRegistry.EffectId currentEffectName;
    private int duetHeight;
    private int duetRenderMode;
    private int duetWidth;
    private EffectNativeSink effect;
    private final EffectFactory factory;
    private List<Integer> freeTextureList;
    private final GlView glView;
    private int imgTextureId;
    private EffectListener listener;
    private int maskTextureId;
    private float receivedCameraFOVDeg;
    private final EffectRegistry registry;
    private boolean released;
    private boolean renderTip;
    private EffectVideoController videoController;

    public EffectHolder(@NonNull GlView glView, @NonNull EffectAudioController effectAudioController, @NonNull EffectVideoController effectVideoController) {
        EffectRegistry effectRegistry = new EffectRegistry();
        this.registry = effectRegistry;
        this.renderTip = false;
        this.duetWidth = PublisherConfiguration.DEFAULT_MAX_RES;
        this.duetHeight = CoverVideoUploadTask.y;
        this.duetRenderMode = 1;
        this.receivedCameraFOVDeg = -1.0f;
        this.released = false;
        this.imgTextureId = 0;
        this.maskTextureId = 0;
        this.freeTextureList = new ArrayList();
        this.glView = glView;
        this.factory = new EffectFactory(glView.getContext(), effectRegistry);
        this.audioController = effectAudioController;
        this.videoController = effectVideoController;
        effectVideoController.addOnFirstFrameListener(new EffectVideoController.OnFirstFrameListener() { // from class: xsna.i9p
            @Override // ru.ok.gleffects.EffectVideoController.OnFirstFrameListener
            public final void onFirstFrame(int i) {
                EffectHolder.this.onFirstFrame(i);
            }
        });
    }

    private Bitmap createBitmapFromFile(@NonNull File file) {
        Bitmap bitmap = null;
        try {
            Bitmap decodeFile = BitmapFactory.decodeFile(file.getAbsolutePath(), null);
            try {
                int imageRotation = getImageRotation(file);
                if (imageRotation == 0) {
                    return decodeFile;
                }
                Matrix matrix = new Matrix();
                matrix.postRotate(imageRotation);
                bitmap = Bitmap.createBitmap(decodeFile, 0, 0, decodeFile.getWidth(), decodeFile.getHeight(), matrix, true);
                decodeFile.recycle();
                return bitmap;
            } catch (Exception e) {
                e = e;
                bitmap = decodeFile;
                Log.e(TAG, "Failed to create bitmap from file, filePath = " + file.getAbsolutePath(), e);
                return bitmap;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    private int createOrUpdateTexture(int i, Bitmap bitmap) {
        if (i != 0) {
            TextureHelper.updateTextureData(i, bitmap);
            return i;
        }
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i2 = iArr[0];
        TextureHelper.drawBitmapOnTexture(i2, bitmap);
        this.freeTextureList.add(Integer.valueOf(i2));
        return i2;
    }

    private void dispatchToGlThread(Runnable runnable) {
        this.glView.queueEvent(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: doSelectEffect, reason: merged with bridge method [inline-methods] */
    public void lambda$selectEffect$1(@Nullable EffectRegistry.EffectId effectId, @Nullable EffectResourceProvider effectResourceProvider) {
        if (effectId == null || this.released || (effectId.equals(this.currentEffectName) && effectId != EffectRegistry.EffectId.API_PROGRAM)) {
            if (effectId == null) {
                releaseEffect();
                return;
            }
            return;
        }
        releaseEffect();
        this.effect = this.factory.createEffect(effectId, this.glView.getWidth(), this.glView.getHeight(), this.audioController, this.videoController, this.listener, effectResourceProvider);
        this.currentEffectName = effectId;
        EffectRegistry effectRegistry = this.registry;
        this.renderTip = effectRegistry.tipsRenderRequired(effectRegistry.getEffectHandle(effectId));
        if (effectId == EffectRegistry.EffectId.DUETS) {
            this.effect.updateVideoInfo(this.duetWidth, this.duetHeight, 0L);
            this.effect.setCustomIntParameter(this.duetRenderMode);
        }
        maybeSendCameraFOV(this.receivedCameraFOVDeg);
        this.effect.updateTextures();
    }

    private int getImageRotation(File file) {
        try {
            int attributeInt = new ExifInterface(file.getAbsolutePath()).getAttributeInt("Orientation", 1);
            if (attributeInt == 3) {
                return 180;
            }
            if (attributeInt == 6) {
                return 90;
            }
            if (attributeInt != 8) {
                return 0;
            }
            return atv0.b;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    private static int getLibVersionCode() {
        return EffectNativeSink.getLibVersionCode();
    }

    public static int getMasksEngineFaceModelVersion() {
        return (int) EffectNativeSink.getMasksEngineFaceModelVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$applyRecordingTime$5(long j) {
        EffectNativeSink effectNativeSink = this.effect;
        if (effectNativeSink != null) {
            effectNativeSink.applyRecordingTime(j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$clearMusicInfo$8() {
        EffectNativeSink effectNativeSink = this.effect;
        if (effectNativeSink != null) {
            effectNativeSink.clearMusicInfo();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$handleGalleryItemDeselected$25(EffectNativeSink effectNativeSink) {
        EffectNativeSink effectNativeSink2 = this.effect;
        if (effectNativeSink != effectNativeSink2) {
            return;
        }
        effectNativeSink2.handleGalleryItemDeselected();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$handleGalleryItemSelected$26(EffectNativeSink effectNativeSink, GalleryAsset galleryAsset) {
        EffectNativeSink effectNativeSink2 = this.effect;
        if (effectNativeSink != effectNativeSink2) {
            return;
        }
        effectNativeSink2.handleGalleryItemSelected(galleryAsset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$handleGestures$14(String[] strArr, String[] strArr2, float[] fArr, float[][] fArr2, float[][] fArr3, float[][] fArr4, float[] fArr5, float[] fArr6, float[] fArr7, float[] fArr8, float[] fArr9, float[] fArr10, float[] fArr11, float[] fArr12, float[] fArr13, float[] fArr14) {
        EffectNativeSink effectNativeSink = this.effect;
        if (effectNativeSink != null) {
            effectNativeSink.handleGestures(strArr, strArr2, fArr, fArr2, fArr3, fArr4, fArr5, fArr6, fArr7, fArr8, fArr9, fArr10, fArr11, fArr12, fArr13, fArr14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$handleVideoTexture$24(EffectNativeSink effectNativeSink, MediaMetadataRetriever mediaMetadataRetriever, String str) {
        if (effectNativeSink != this.effect) {
            return;
        }
        int parseInt = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
        int parseInt2 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
        int parseInt3 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
        long parseLong = Long.parseLong(mediaMetadataRetriever.extractMetadata(9));
        if (parseInt == 90 || parseInt == 270) {
            parseInt3 = parseInt2;
            parseInt2 = parseInt3;
        }
        this.videoController.registerGalleryVideoPath(str);
        effectNativeSink.updateVideoInfo(parseInt2, parseInt3, parseLong);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onClick$10(float f, float f2) {
        EffectNativeSink effectNativeSink = this.effect;
        if (effectNativeSink != null) {
            effectNativeSink.onClick(f, f2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onPinch$11(float f) {
        EffectNativeSink effectNativeSink = this.effect;
        if (effectNativeSink != null) {
            effectNativeSink.onPinch(f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onRotation$12(float f) {
        EffectNativeSink effectNativeSink = this.effect;
        if (effectNativeSink != null) {
            effectNativeSink.onRotation(f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onStartRecording$3() {
        EffectNativeSink effectNativeSink = this.effect;
        if (effectNativeSink != null) {
            effectNativeSink.onStartRecording();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onStopRecording$4() {
        EffectNativeSink effectNativeSink = this.effect;
        if (effectNativeSink != null) {
            effectNativeSink.onStopRecording();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$pushBitmapImage$23(EffectNativeSink effectNativeSink, Bitmap bitmap, boolean z) {
        int width;
        int height;
        if (effectNativeSink != this.effect) {
            return;
        }
        if (bitmap.isRecycled()) {
            Log.e(TAG, "tried to push recycled bitmap to effect");
            width = 1;
            height = 1;
        } else {
            width = bitmap.getWidth();
            height = bitmap.getHeight();
        }
        int[] loadTextureFromBitmap = TextureHelper.loadTextureFromBitmap(bitmap, z);
        effectNativeSink.handleTextureId(loadTextureFromBitmap[0], width, height);
        TextureHelper.deleteTexture(loadTextureFromBitmap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$pushImage$21(EffectNativeSink effectNativeSink, Bitmap bitmap) {
        if (effectNativeSink != this.effect) {
            return;
        }
        int[] loadTextureFromBitmap = TextureHelper.loadTextureFromBitmap(bitmap, true);
        effectNativeSink.handleTextureId(loadTextureFromBitmap[0], bitmap.getWidth(), bitmap.getHeight());
        TextureHelper.deleteTexture(loadTextureFromBitmap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$pushImage$22(String str, EffectNativeSink effectNativeSink) {
        Bitmap createBitmapFromFile = createBitmapFromFile(new File(str));
        if (createBitmapFromFile == null) {
            return;
        }
        dispatchToGlThread(new f9p(this, effectNativeSink, createBitmapFromFile, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$receiveDeviceRotationMatrix$13(float[] fArr) {
        EffectNativeSink effectNativeSink = this.effect;
        if (effectNativeSink != null) {
            effectNativeSink.receiveDeviceRotationMatrix(fArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$resetEffectToInitialState$29() {
        EffectNativeSink effectNativeSink = this.effect;
        if (effectNativeSink != null) {
            effectNativeSink.resetEffectToInitialState();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$selectBeautyMode$27(boolean z) {
        EffectNativeSink effectNativeSink = this.effect;
        if (effectNativeSink != null) {
            effectNativeSink.selectBeautyMode(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setBeautyEPS$28(int i) {
        EffectNativeSink effectNativeSink = this.effect;
        if (effectNativeSink != null) {
            effectNativeSink.setBeautyEPS(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setCameraFOVDeg$7(float f) {
        this.receivedCameraFOVDeg = f;
        maybeSendCameraFOV(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setCustomIntParameter$30(int i) {
        EffectNativeSink effectNativeSink = this.effect;
        if (effectNativeSink != null) {
            effectNativeSink.setCustomIntParameter(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setFriendsData$15(int i, List list, List list2, List list3, List list4, List list5) {
        int i2;
        if (this.effect == null) {
            return;
        }
        int[] iArr = new int[i];
        float[] fArr = new float[i];
        int[] iArr2 = new int[i];
        int[] iArr3 = new int[i];
        for (int i3 = 0; i3 < i; i3++) {
            Bitmap bitmap = (Bitmap) list.get(i3);
            float f = 1.0f;
            if (bitmap != null) {
                f = (bitmap.getWidth() * 1.0f) / bitmap.getHeight();
                i2 = TextureHelper.loadTextureFromBitmap(bitmap, true)[0];
            } else {
                i2 = 0;
            }
            iArr[i3] = i2;
            fArr[i3] = f;
            iArr2[i3] = ((UserInfo) list2.get(i3)).userGender.rawValue;
            iArr3[i3] = ((UserInfo) list2.get(i3)).age;
        }
        this.effect.handleFriendsData(iArr, fArr, list3, list4, list5, iArr2, iArr3);
        TextureHelper.deleteTexture(iArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setFriendsData$16(final List list, final int i) {
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        final ArrayList arrayList3 = new ArrayList();
        final ArrayList arrayList4 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            UserInfo userInfo = (UserInfo) it.next();
            String str = userInfo.userName;
            File file = userInfo.userAvatarFile;
            arrayList.add(file != null ? createBitmapFromFile(file) : null);
            File file2 = userInfo.userAvatarFile;
            arrayList2.add(file2 != null ? file2.getAbsolutePath() : "");
            arrayList3.add(str);
            arrayList4.add(userInfo.userCity);
        }
        dispatchToGlThread(new Runnable() { // from class: xsna.t8p
            @Override // java.lang.Runnable
            public final void run() {
                EffectHolder.this.lambda$setFriendsData$15(i, arrayList, list, arrayList2, arrayList3, arrayList4);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setMaskEngineAsset$0(String str) {
        this.registry.setMaskEngineAsset(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setMusicInfo$6(long[] jArr, long j) {
        EffectNativeSink effectNativeSink = this.effect;
        if (effectNativeSink != null) {
            effectNativeSink.setMusicInfo(jArr, j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setTracksInfo$19(EffectNativeSink effectNativeSink, int i, List list, List list2, List list3, List list4) {
        int i2;
        if (effectNativeSink != this.effect) {
            return;
        }
        int[] iArr = new int[i];
        float[] fArr = new float[i];
        for (int i3 = 0; i3 < i; i3++) {
            Bitmap bitmap = (Bitmap) list.get(i3);
            float f = 1.0f;
            if (bitmap != null) {
                f = (bitmap.getWidth() * 1.0f) / bitmap.getHeight();
                i2 = TextureHelper.loadTextureFromBitmap(bitmap, true)[0];
            } else {
                i2 = 0;
            }
            iArr[i3] = i2;
            fArr[i3] = f;
        }
        effectNativeSink.handleTracksInfo(iArr, fArr, list2, list3, list4);
        TextureHelper.deleteTexture(iArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setTracksInfo$20(List list, final EffectNativeSink effectNativeSink, final int i) {
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        final ArrayList arrayList3 = new ArrayList();
        final ArrayList arrayList4 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MusicTrackInfo musicTrackInfo = (MusicTrackInfo) it.next();
            Bitmap createBitmapFromFile = createBitmapFromFile(musicTrackInfo.trackCoverFile);
            arrayList.add(musicTrackInfo.trackMusicId);
            arrayList2.add(musicTrackInfo.trackTitle);
            arrayList3.add(musicTrackInfo.trackArtist);
            arrayList4.add(createBitmapFromFile);
        }
        dispatchToGlThread(new Runnable() { // from class: xsna.g9p
            @Override // java.lang.Runnable
            public final void run() {
                EffectHolder.this.lambda$setTracksInfo$19(effectNativeSink, i, arrayList4, arrayList, arrayList2, arrayList3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setUserData$17(Bitmap bitmap, String str, UserInfo userInfo) {
        if (this.effect == null) {
            return;
        }
        int[] iArr = {0};
        float f = 1.0f;
        if (bitmap != null) {
            f = (bitmap.getWidth() * 1.0f) / bitmap.getHeight();
            iArr = TextureHelper.loadTextureFromBitmap(bitmap, true);
        }
        this.effect.setUserData(iArr[0], f, str, userInfo.userName, userInfo.userCity, userInfo.userGender.rawValue, userInfo.age);
        TextureHelper.deleteTexture(iArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setUserData$18(UserInfo userInfo) {
        File file = userInfo.userAvatarFile;
        Bitmap createBitmapFromFile = file != null ? createBitmapFromFile(file) : null;
        File file2 = userInfo.userAvatarFile;
        dispatchToGlThread(new xh9(1, createBitmapFromFile, this, file2 != null ? file2.getAbsolutePath() : "", userInfo));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateMusicDelay$9(long j) {
        EffectNativeSink effectNativeSink = this.effect;
        if (effectNativeSink != null) {
            effectNativeSink.updateMusicDelay(j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateResourcepack$2(File file) {
        EffectNativeSink effectNativeSink = this.effect;
        if (effectNativeSink != null) {
            effectNativeSink.updateResourcepack(file);
        }
    }

    private void maybeSendCameraFOV(float f) {
        EffectNativeSink effectNativeSink = this.effect;
        if (effectNativeSink == null || f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        effectNativeSink.setCameraFOV(f);
    }

    private float[] rect2Array(RectF rectF) {
        return new float[]{rectF.top, rectF.right, rectF.bottom, rectF.left};
    }

    private void releaseEffect() {
        EffectNativeSink effectNativeSink = this.effect;
        if (effectNativeSink != null) {
            this.currentEffectName = null;
            this.effect = null;
            effectNativeSink.releaseMain();
            effectNativeSink.release();
        }
    }

    private void releaseEffectSure() {
        EffectNativeSink effectNativeSink = this.effect;
        if (effectNativeSink != null) {
            effectNativeSink.releaseMain();
        }
        Iterator<Integer> it = this.freeTextureList.iterator();
        while (it.hasNext()) {
            GLES20.glDeleteTextures(1, new int[]{it.next().intValue()}, 0);
        }
        this.imgTextureId = 0;
        this.maskTextureId = 0;
    }

    private void safeSubmitTaskOnWorkerThread(EffectListener effectListener, Runnable runnable) {
        if (effectListener == null || runnable == null) {
            return;
        }
        effectListener.submitTaskOnWorkerThread(runnable);
    }

    public void applyRecordingTime(long j) {
        dispatchToGlThread(new y8p(this, j, 0));
    }

    public void clearMusicInfo() {
        dispatchToGlThread(new n52(this, 9));
    }

    @Nullable
    public Long getCurrentEffectHandle() {
        return this.registry.getEffectHandle(this.currentEffectName);
    }

    public EffectRegistry.EffectId getCurrentEffectName() {
        return this.currentEffectName;
    }

    @NonNull
    public EffectRegistry getEffectRegistry() {
        return this.registry;
    }

    public void handleBodyPatternMatches(List<PatternMatchData> list) {
        if (this.effect == null || list.size() == 0) {
            return;
        }
        int size = list.size();
        float[] fArr = new float[size];
        float[] fArr2 = new float[size];
        float[] fArr3 = new float[size];
        float[] fArr4 = new float[size];
        float[] fArr5 = new float[size];
        float[] fArr6 = new float[size];
        for (int i = 0; i < size; i++) {
            fArr[i] = list.get(i).getPositionX();
            fArr2[i] = list.get(i).getPositionY();
            fArr3[i] = list.get(i).getScale();
            fArr4[i] = list.get(i).getPitchAngle();
            fArr5[i] = list.get(i).getYawAngle();
            fArr6[i] = list.get(i).getRollAngle();
        }
        this.effect.handleBodyPatternMatches(fArr, fArr2, fArr3, fArr4, fArr5, fArr6);
    }

    public void handleCats(List<CatData> list) {
        if (this.effect == null || list.size() == 0) {
            return;
        }
        int size = list.size();
        int length = list.get(0).getKeyPointLocations().length;
        float[] fArr = new float[size];
        float[] fArr2 = new float[size];
        float[] fArr3 = new float[size];
        float[] fArr4 = new float[size];
        float[] fArr5 = new float[length * size];
        float[] fArr6 = new float[size * 3];
        for (int i = 0; i < list.size(); i++) {
            System.arraycopy(list.get(i).getKeyPointLocations(), 0, fArr5, length * i, length);
            System.arraycopy(list.get(i).getAngles(), 0, fArr6, i * 3, 3);
            RectF position = list.get(i).getPosition();
            fArr[i] = position.top;
            fArr2[i] = position.right;
            fArr3[i] = position.bottom;
            fArr4[i] = position.left;
        }
        this.effect.handleCats(fArr, fArr2, fArr3, fArr4, fArr5, fArr6);
    }

    public void handleFaceMeshes(List<float[]> list) {
        if (this.effect == null || list.size() == 0) {
            return;
        }
        float[][] fArr = new float[list.size()][];
        for (int i = 0; i < list.size(); i++) {
            fArr[i] = list.get(i);
        }
        this.effect.handleFaceMeshes(fArr);
    }

    public void handleFaces(List<FaceData> list) {
        if (this.effect == null || list.size() == 0) {
            return;
        }
        int size = list.size();
        float[] fArr = new float[size];
        float[] fArr2 = new float[size];
        float[] fArr3 = new float[size];
        float[] fArr4 = new float[size];
        int i = size * 6;
        float[] fArr5 = new float[i];
        float[] fArr6 = new float[i];
        float[] fArr7 = new float[size * 9];
        for (int i2 = 0; i2 < list.size(); i2++) {
            int i3 = i2 * 6;
            System.arraycopy(list.get(i2).getKeyPointLocations(), 0, fArr5, i3, 6);
            System.arraycopy(list.get(i2).getKeyPointLocations(), 6, fArr6, i3, 6);
            System.arraycopy(list.get(i2).getFaceRotationMatrix(), 0, fArr7, i2 * 9, 9);
            RectF position = list.get(i2).getPosition();
            fArr[i2] = position.top;
            fArr2[i2] = position.right;
            fArr3[i2] = position.bottom;
            fArr4[i2] = position.left;
        }
        this.effect.handleFaces(fArr, fArr2, fArr3, fArr4, fArr5, fArr6, fArr7);
    }

    public void handleFullSegmentation(Bitmap bitmap) {
        if (this.effect == null || bitmap == null) {
            return;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int[] loadTextureFromBitmap = TextureHelper.loadTextureFromBitmap(bitmap, false);
        this.effect.handleFullSegmentation(loadTextureFromBitmap[0], width, height);
        TextureHelper.deleteTexture(loadTextureFromBitmap);
    }

    public void handleGalleryItemDeselected() {
        EffectNativeSink effectNativeSink = this.effect;
        if (effectNativeSink != null) {
            dispatchToGlThread(new i73(3, this, effectNativeSink));
        }
    }

    public void handleGalleryItemSelected(GalleryAsset galleryAsset) {
        EffectNativeSink effectNativeSink = this.effect;
        if (effectNativeSink != null) {
            dispatchToGlThread(new d9p(this, effectNativeSink, galleryAsset, 0));
        }
    }

    public void handleGestures(List<FigureData> list, boolean z) {
        if (this.effect == null) {
            return;
        }
        int size = list.size();
        final String[] strArr = new String[size];
        final String[] strArr2 = new String[size];
        Class cls = Float.TYPE;
        final float[][] fArr = (float[][]) Array.newInstance((Class<?>) cls, size, 4);
        final float[][] fArr2 = (float[][]) Array.newInstance((Class<?>) cls, size, 4);
        final float[][] fArr3 = (float[][]) Array.newInstance((Class<?>) cls, size, 4);
        final float[] fArr4 = new float[size];
        final float[] fArr5 = new float[size];
        final float[] fArr6 = new float[size];
        final float[] fArr7 = new float[size];
        final float[] fArr8 = new float[size];
        final float[] fArr9 = new float[size];
        final float[] fArr10 = new float[size];
        final float[] fArr11 = new float[size];
        final float[] fArr12 = new float[size];
        final float[] fArr13 = new float[size];
        final float[] fArr14 = new float[size];
        int i = 0;
        while (i < size) {
            int i2 = size;
            FigureData figureData = list.get(i);
            strArr[i] = figureData.getAverageGestureHandle();
            strArr2[i] = figureData.getLastGestureHandle();
            fArr[i] = rect2Array(figureData.getGestureRect());
            if (z) {
                fArr2[i] = rect2Array(figureData.getGestureRectLeft());
                fArr3[i] = rect2Array(figureData.getGestureRectRight());
            }
            fArr4[i] = figureData.getAngle();
            fArr5[i] = figureData.getForefingerX();
            fArr6[i] = figureData.getForefingerY();
            fArr7[i] = figureData.getForefingerBaseX();
            fArr8[i] = figureData.getForefingerBaseY();
            fArr9[i] = figureData.getMiddleFingerBaseX();
            fArr10[i] = figureData.getMiddleFingerBaseY();
            fArr11[i] = figureData.getRingFingerBaseX();
            fArr12[i] = figureData.getRingFingerBaseY();
            fArr13[i] = figureData.getPalmBaseX();
            fArr14[i] = figureData.getPalmBaseY();
            i++;
            size = i2;
        }
        dispatchToGlThread(new Runnable() { // from class: xsna.a9p
            @Override // java.lang.Runnable
            public final void run() {
                EffectHolder.this.lambda$handleGestures$14(strArr, strArr2, fArr4, fArr, fArr2, fArr3, fArr5, fArr6, fArr7, fArr8, fArr9, fArr10, fArr11, fArr12, fArr13, fArr14);
            }
        });
    }

    public void handleMorph(FaceMorphingData faceMorphingData) {
        if (this.effect == null) {
            return;
        }
        int cropWidth = faceMorphingData.getCropWidth();
        int cropHeight = faceMorphingData.getCropHeight();
        float centerX = faceMorphingData.getPosition().centerX();
        float centerY = faceMorphingData.getPosition().centerY();
        float width = faceMorphingData.getPosition().width();
        float height = faceMorphingData.getPosition().height();
        this.effect.handleImageInt(EffectNativeSink.ImageTypes.IMAGE, cropWidth, cropHeight, 4, faceMorphingData.getImgData().textureId, null, centerX, centerY, width, height, faceMorphingData.getCropRotation());
        this.effect.handleImageInt(EffectNativeSink.ImageTypes.MASK, cropWidth, cropHeight, 4, faceMorphingData.getMaskData().textureId, null, centerX, centerY, width, height, faceMorphingData.getCropRotation());
        this.effect.handleImageFloat(EffectNativeSink.ImageTypes.WRAPPING, cropWidth, cropHeight, 2, faceMorphingData.getWarpData().textureId, null, centerX, centerY, width, height, faceMorphingData.getCropRotation());
    }

    public void handleSkySegmentation(Bitmap bitmap) {
        if (this.effect == null || bitmap == null) {
            return;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int[] loadTextureFromBitmap = TextureHelper.loadTextureFromBitmap(bitmap, false);
        this.effect.handleSkySegmentation(loadTextureFromBitmap[0], width, height);
        TextureHelper.deleteTexture(loadTextureFromBitmap);
    }

    public void handleVideoTexture(final String str) {
        final EffectNativeSink effectNativeSink = this.effect;
        if (effectNativeSink == null) {
            return;
        }
        final MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        mediaMetadataRetriever.setDataSource(str);
        dispatchToGlThread(new Runnable() { // from class: xsna.k9p
            @Override // java.lang.Runnable
            public final void run() {
                EffectHolder.this.lambda$handleVideoTexture$24(effectNativeSink, mediaMetadataRetriever, str);
            }
        });
    }

    public void onClick(MotionEvent motionEvent) {
        final float x = motionEvent.getX();
        final float y = motionEvent.getY();
        if (motionEvent.getAction() == 0) {
            dispatchToGlThread(new Runnable() { // from class: xsna.b9p
                @Override // java.lang.Runnable
                public final void run() {
                    EffectHolder.this.lambda$onClick$10(x, y);
                }
            });
        }
    }

    public void onFirstFrame(int i) {
        EffectNativeSink effectNativeSink = this.effect;
        if (effectNativeSink != null) {
            effectNativeSink.onFirstFrame(i);
        }
    }

    public void onPinch(final float f) {
        dispatchToGlThread(new Runnable() { // from class: xsna.r8p
            @Override // java.lang.Runnable
            public final void run() {
                EffectHolder.this.lambda$onPinch$11(f);
            }
        });
    }

    public void onRotation(final float f) {
        dispatchToGlThread(new Runnable() { // from class: xsna.n9p
            @Override // java.lang.Runnable
            public final void run() {
                EffectHolder.this.lambda$onRotation$12(f);
            }
        });
    }

    public void onStartRecording() {
        dispatchToGlThread(new a72(this, 9));
    }

    public void onStopRecording() {
        dispatchToGlThread(new jk9(this, 4));
    }

    public void onTouch(MotionEvent motionEvent) {
        EffectNativeSink effectNativeSink = this.effect;
        if (effectNativeSink == null || !effectNativeSink.texturesAreUpdated) {
            return;
        }
        effectNativeSink.onTouch(motionEvent.getX(), motionEvent.getY(), motionEvent.getAction());
    }

    public void presetDuetRenderMode(int i) {
        this.duetRenderMode = i;
    }

    public void pushBitmapImage(final Bitmap bitmap, final boolean z) {
        final EffectNativeSink effectNativeSink = this.effect;
        if (effectNativeSink == null) {
            return;
        }
        dispatchToGlThread(new Runnable() { // from class: xsna.c9p
            @Override // java.lang.Runnable
            public final void run() {
                EffectHolder.this.lambda$pushBitmapImage$23(effectNativeSink, bitmap, z);
            }
        });
    }

    public void pushImage(String str) {
        EffectNativeSink effectNativeSink = this.effect;
        if (effectNativeSink == null) {
            return;
        }
        safeSubmitTaskOnWorkerThread(this.listener, new u8p(this, str, effectNativeSink, 0));
    }

    public void receiveDeviceRotationMatrix(float[] fArr) {
        dispatchToGlThread(new h73(3, this, fArr));
    }

    public void releaseFromGl() {
        this.registry.release();
        EffectNativeSink effectNativeSink = this.effect;
        if (effectNativeSink != null) {
            effectNativeSink.stopHandleEvents();
        }
        releaseEffect();
        this.released = true;
    }

    public void removeEffectListener() {
        this.listener = null;
    }

    public void render(int i, int i2, int i3, int i4, int i5, boolean z, boolean z2) {
        EffectNativeSink effectNativeSink = this.effect;
        if (effectNativeSink != null) {
            effectNativeSink.render(i, i2, i3, i2, i3, z, z2);
        }
    }

    public void renderTip() {
        EffectNativeSink effectNativeSink = this.effect;
        if (effectNativeSink == null || !this.renderTip) {
            return;
        }
        effectNativeSink.renderTip();
    }

    public void resetEffectToInitialState() {
        dispatchToGlThread(new ux3(this, 5));
    }

    public void selectBeautyMode(boolean z) {
        dispatchToGlThread(new m9p(this, z, 0));
    }

    public void selectEffect(@Nullable EffectRegistry.EffectId effectId, @Nullable EffectResourceProvider effectResourceProvider) {
        if (this.effect != null && (effectId == null || !effectId.equals(this.currentEffectName))) {
            this.effect.stopHandleEvents();
            releaseEffectSure();
        }
        dispatchToGlThread(new h9p(this, effectId, effectResourceProvider, 0));
    }

    public void selectEffectSync(@Nullable EffectRegistry.EffectId effectId, @Nullable EffectResourceProvider effectResourceProvider) {
        if (this.effect != null && (effectId == null || !effectId.equals(this.currentEffectName))) {
            this.effect.stopHandleEvents();
            releaseEffectSure();
        }
        lambda$selectEffect$1(effectId, effectResourceProvider);
    }

    public void setBeautyEPS(final int i) {
        dispatchToGlThread(new Runnable() { // from class: xsna.l9p
            @Override // java.lang.Runnable
            public final void run() {
                EffectHolder.this.lambda$setBeautyEPS$28(i);
            }
        });
    }

    public void setCameraFOVDeg(final float f) {
        dispatchToGlThread(new Runnable() { // from class: xsna.e9p
            @Override // java.lang.Runnable
            public final void run() {
                EffectHolder.this.lambda$setCameraFOVDeg$7(f);
            }
        });
    }

    public void setCustomIntParameter(final int i) {
        dispatchToGlThread(new Runnable() { // from class: xsna.z8p
            @Override // java.lang.Runnable
            public final void run() {
                EffectHolder.this.lambda$setCustomIntParameter$30(i);
            }
        });
    }

    public void setDefaultTypeface(@Nullable Typeface typeface) {
        this.factory.setDefaultTypeface(typeface);
    }

    public void setEffectListener(@NonNull EffectListener effectListener) {
        this.listener = effectListener;
    }

    public void setFriendsData(final List<UserInfo> list) {
        if (list.isEmpty()) {
            return;
        }
        final int size = list.size();
        safeSubmitTaskOnWorkerThread(this.listener, new Runnable() { // from class: xsna.s8p
            @Override // java.lang.Runnable
            public final void run() {
                EffectHolder.this.lambda$setFriendsData$16(list, size);
            }
        });
    }

    public void setMaskEngineAsset(String str) {
        dispatchToGlThread(new h(5, this, str));
    }

    public void setMusicInfo(@Nullable long[] jArr, long j) {
        dispatchToGlThread(new j9p(j, this, jArr, 0));
    }

    public void setTracksInfo(final List<MusicTrackInfo> list) {
        if (this.effect == null || list.isEmpty()) {
            return;
        }
        final EffectNativeSink effectNativeSink = this.effect;
        final int size = list.size();
        safeSubmitTaskOnWorkerThread(this.listener, new Runnable() { // from class: xsna.w8p
            @Override // java.lang.Runnable
            public final void run() {
                EffectHolder.this.lambda$setTracksInfo$20(list, effectNativeSink, size);
            }
        });
    }

    public void setUserData(UserInfo userInfo) {
        safeSubmitTaskOnWorkerThread(this.listener, new x8p(0, this, userInfo));
    }

    public void setVideoSize(int i, int i2) {
        this.duetWidth = i;
        this.duetHeight = i2;
    }

    public void setVmojiBgColor(int i) {
        EffectNativeSink effectNativeSink = this.effect;
        if (effectNativeSink != null) {
            effectNativeSink.setVmojiBgColor(i);
        }
    }

    public void setVmojiLandmarks(float[] fArr) {
        EffectNativeSink effectNativeSink = this.effect;
        if (effectNativeSink != null) {
            effectNativeSink.setVmojiLandmarks(fArr);
        }
    }

    public void setVmojiSvg(byte[] bArr, int i) {
        EffectNativeSink effectNativeSink = this.effect;
        if (effectNativeSink != null) {
            effectNativeSink.setVmojiSvg(bArr, i);
        }
    }

    public void updateMusicDelay(final long j) {
        dispatchToGlThread(new Runnable() { // from class: xsna.v8p
            @Override // java.lang.Runnable
            public final void run() {
                EffectHolder.this.lambda$updateMusicDelay$9(j);
            }
        });
    }

    public void updateResourcepack(File file) {
        dispatchToGlThread(new ke9(2, this, file));
    }

    public void updateTextures() {
        EffectNativeSink effectNativeSink = this.effect;
        if (effectNativeSink != null) {
            effectNativeSink.updateTextures();
        }
    }
}
