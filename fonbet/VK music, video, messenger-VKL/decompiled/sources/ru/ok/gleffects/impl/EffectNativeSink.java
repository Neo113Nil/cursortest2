package ru.ok.gleffects.impl;

import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import ru.ok.gleffects.BuildConfig;
import ru.ok.gleffects.Effect;
import ru.ok.gleffects.EffectAudioController;
import ru.ok.gleffects.EffectListener;
import ru.ok.gleffects.EffectRegistry;
import ru.ok.gleffects.EffectResourceProvider;
import ru.ok.gleffects.EffectVideoController;
import ru.ok.gleffects.impl.EffectNativeSink;
import ru.ok.gleffects.recognition.DynamicRequirements;
import ru.ok.gleffects.recognition.GalleryAsset;
import ru.ok.gleffects.recognition.GalleryPanelSettings;
import ru.ok.gleffects.util.TextureHelper;
import xsna.eo1;
import xsna.gc3;
import xsna.hc3;
import xsna.jtd;
import xsna.lhg;
import xsna.o7j;
import xsna.p69;
import xsna.rc4;
import xsna.s9p;
import xsna.wd2;
import xsna.y;
import xsna.z;

/* loaded from: classes11.dex */
public final class EffectNativeSink implements Effect, EffectListener {
    private static final String TAG = "EffectNativeSink";
    private final EffectAudioController audioController;
    HashMap<Integer, Integer> audioIds;
    private final Typeface defaultTypeface;
    private int firstTouch;

    @Nullable
    private Typeface[] fonts;
    private volatile boolean isReleased;
    private boolean isResourceReady;
    private boolean isUpdateTexturesNeeded;
    private EffectListener listener;
    private final Object lock;
    private volatile Handler mainHandler;
    private final long nativeInstance;
    private final HashSet<Integer> postTexIds;
    private File rpFile;
    public boolean texturesAreUpdated;
    private final ArrayList<Touch> touches;
    private final EffectVideoController videoController;

    /* loaded from: classes9.dex */
    public static final class Builder {
        private EffectAudioController audioController;
        private Typeface defaultTypeface;
        private final long effectHandle;
        private final EffectRegistry.EffectId effectId;
        private int height;
        private EffectListener listener;
        private String maskFolder;
        private EffectResourceProvider resourceProvider;
        private EffectVideoController videoController;
        private int width;

        public Builder(@NonNull EffectRegistry.EffectId effectId, long j) {
            this.effectId = effectId;
            this.effectHandle = j;
        }

        public EffectNativeSink build() {
            if (this.audioController != null) {
                return new EffectNativeSink(this);
            }
            throw new IllegalStateException("Cant create effect without audioController EffectNativeSink");
        }

        public Builder setAudioController(EffectAudioController effectAudioController) {
            this.audioController = effectAudioController;
            return this;
        }

        public Builder setDefaultTypeface(Typeface typeface) {
            this.defaultTypeface = typeface;
            return this;
        }

        public Builder setListener(EffectListener effectListener) {
            this.listener = effectListener;
            return this;
        }

        public Builder setMaskFolder(String str) {
            this.maskFolder = str;
            return this;
        }

        public Builder setResourceProvider(EffectResourceProvider effectResourceProvider) {
            this.resourceProvider = effectResourceProvider;
            return this;
        }

        public Builder setSize(int i, int i2) {
            this.width = i;
            this.height = i2;
            return this;
        }

        public Builder setVideoController(EffectVideoController effectVideoController) {
            this.videoController = effectVideoController;
            return this;
        }
    }

    /* loaded from: classes9.dex */
    public enum ImageTypes {
        IMAGE(0),
        MASK(1),
        WRAPPING(2);

        private final int value;

        ImageTypes(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    /* loaded from: classes9.dex */
    public static class SVGErrorInfo {
        public int errorCode;
        public String errorDescription;

        public SVGErrorInfo(int i, String str) {
            this.errorCode = i;
            this.errorDescription = str;
        }
    }

    /* loaded from: classes9.dex */
    public class Touch {
        public int action;
        public float x;
        public float y;

        public Touch(float f, float f2, int i) {
            this.x = f;
            this.y = f2;
            this.action = i;
        }
    }

    private static native void applyRecordingTime(long j, long j2);

    private boolean checkAudioCorrectness(int i) {
        HashMap<Integer, Integer> hashMap = this.audioIds;
        if (hashMap != null && hashMap.containsKey(Integer.valueOf(i))) {
            return true;
        }
        Log.e(TAG, "Wrong usage of start audio");
        return false;
    }

    private static native void clearMusicInfo(long j);

    private static native long createEffect(long j, int i, int i2, EffectNativeSink effectNativeSink);

    private void dispatchToUi(Runnable runnable) {
        Handler handler = this.mainHandler;
        if (handler != null) {
            handler.post(runnable);
        }
    }

    private static native String[] getAudioPaths(long j);

    private static native String[] getFontPaths(long j);

    public static int getLibVersionCode() {
        return BuildConfig.GL_EFFECTS_LIB_VERSION;
    }

    public static long getMasksEngineFaceModelVersion() {
        return 20L;
    }

    private static native void handleBodyPatternMatches(long j, float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4, float[] fArr5, float[] fArr6);

    private static native void handleCats(long j, float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4, float[] fArr5, float[] fArr6);

    private static native void handleFaceMeshes(long j, float[][] fArr);

    private static native void handleFaces(long j, float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4, float[] fArr5, float[] fArr6, float[] fArr7);

    private static native void handleFullSegmentation(long j, int i, int i2, int i3);

    private static native void handleGalleryItemDeselected(long j);

    private static native void handleGalleryItemSelected(long j, int i, String str, int i2);

    private static native void handleGestures(long j, String[] strArr, String[] strArr2, float[] fArr, float[][] fArr2, float[][] fArr3, float[][] fArr4, float[] fArr5, float[] fArr6, float[] fArr7, float[] fArr8, float[] fArr9, float[] fArr10, float[] fArr11, float[] fArr12, float[] fArr13, float[] fArr14);

    private static native void handleImageFloat(long j, int i, int i2, int i3, int i4, int i5, float[] fArr, float f, float f2, float f3, float f4, float f5);

    private static native void handleImageInt(long j, int i, int i2, int i3, int i4, int i5, int[] iArr, float f, float f2, float f3, float f4, float f5);

    private static native void handleMorph(long j, long j2);

    private static native void handleSkySegmentation(long j, int i, int i2, int i3);

    private static native void handleTextureId(long j, int i, int i2, int i3);

    private static native boolean isGPUResourcesLoaded(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$clearSavedStorage$3() {
        EffectListener effectListener = this.listener;
        if (effectListener != null) {
            effectListener.clearSavedStorage();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(Builder builder, File file) {
        synchronized (this.lock) {
            try {
                if (!this.isReleased) {
                    if (file != null) {
                        if (builder.effectId == EffectRegistry.EffectId.API_PROGRAM) {
                            setMaskPath(this.nativeInstance, file.getAbsolutePath());
                        } else {
                            setupResourcepack(file);
                        }
                    }
                    this.isResourceReady = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onChangeAudioPitch$10(float f) {
        EffectListener effectListener = this.listener;
        if (effectListener != null) {
            effectListener.onChangeAudioPitch(f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onChangeMicMute$6(boolean z) {
        EffectListener effectListener = this.listener;
        if (effectListener != null) {
            effectListener.onChangeMicMute(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onChangePreferRecordingDuration$4(long j) {
        EffectListener effectListener = this.listener;
        if (effectListener != null) {
            effectListener.onChangePreferRecordingDuration(j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onChangeReadyToStartRecording$5(boolean z) {
        EffectListener effectListener = this.listener;
        if (effectListener != null) {
            effectListener.onChangeReadyToStartRecording(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onNewMessage$7(String str) {
        EffectListener effectListener = this.listener;
        if (effectListener != null) {
            effectListener.onNewMessage(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onRequirementsChanged$14(DynamicRequirements dynamicRequirements) {
        if (this.listener != null) {
            dynamicRequirements.toString();
            this.listener.onRequirementsChanged(dynamicRequirements);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onUsingGesturesChanged$8(String[] strArr) {
        EffectListener effectListener = this.listener;
        if (effectListener != null) {
            effectListener.onUsingGesturesChanged(strArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$registerForFrugalReceive$9(boolean z) {
        EffectListener effectListener = this.listener;
        if (effectListener != null) {
            effectListener.registerForFrugalReceive(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setMusicById$11(String str) {
        EffectListener effectListener = this.listener;
        if (effectListener != null) {
            effectListener.setMusicById(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startRecording$1() {
        EffectListener effectListener = this.listener;
        if (effectListener != null) {
            effectListener.startRecording();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$stopRecording$2() {
        EffectListener effectListener = this.listener;
        if (effectListener != null) {
            effectListener.stopRecording();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$submitTaskOnWorkerThread$13(Runnable runnable) {
        EffectListener effectListener = this.listener;
        if (effectListener != null) {
            effectListener.submitTaskOnWorkerThread(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$toggleGalleryPanel$12(boolean z, GalleryPanelSettings galleryPanelSettings) {
        EffectListener effectListener = this.listener;
        if (effectListener != null) {
            effectListener.toggleGalleryPanel(z, galleryPanelSettings);
        }
    }

    private static native SVGErrorInfo nativeValidateSvg(String str);

    private static native void onClick(long j, float f, float f2);

    private static native void onFirstFrame(long j, int i);

    private static native void onPinch(long j, float f);

    private static native void onRotation(long j, float f);

    private static native void onStartRecording(long j);

    private static native void onStopRecording(long j);

    private static native void onTouch(long j, float f, float f2, int i);

    private static native void receiveDeviceRotationMatrix(long j, float[] fArr);

    private static native void release(long j);

    private static native void render(long j, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2);

    private static native void renderTip(long j);

    private void requireVideoTexture(int i, int i2, int i3, int i4, int i5) {
        EffectVideoController.RenderMode renderMode;
        if (i5 == 0) {
            renderMode = EffectVideoController.RenderMode.DEFAULT_VIDEO;
        } else if (i5 == 1) {
            renderMode = EffectVideoController.RenderMode.DUET_VIDEO;
        } else if (i5 == 2) {
            renderMode = EffectVideoController.RenderMode.UGC_BACKGROUND_VIDEO;
        } else if (i5 == 3) {
            renderMode = EffectVideoController.RenderMode.CELEBRITY_CALL_VIDEO;
        } else {
            if (i5 != 4) {
                throw new IllegalArgumentException(lhg.a(i5, "No such render mode: "));
            }
            renderMode = EffectVideoController.RenderMode.EPICA_VIDEO;
        }
        this.videoController.controlVideo(i, i2, i3, i4, this.rpFile, renderMode);
    }

    private static native void resetEffectToInitialState(long j);

    private static native void selectBeautyMode(long j, boolean z);

    private static native void setBeautyEPS(long j, int i);

    private static native void setCameraFOV(long j, float f);

    private static native void setCustomIntParameter(long j, int i);

    private static native void setForceUseNewFaceModel(long j, boolean z);

    private static native void setFriendsData(long j, int[] iArr, float[] fArr, String[] strArr, String[] strArr2, String[] strArr3, int[] iArr2, int[] iArr3);

    private static native void setMaskPath(long j, String str);

    private static native void setMusicInfo(long j, long[] jArr, long j2);

    private static native void setMusicTracksInfo(long j, int[] iArr, float[] fArr, String[] strArr, String[] strArr2, String[] strArr3);

    private void setPlayWhenReady(boolean z) {
        this.videoController.setPlayWhenReady(z);
    }

    private static native void setResourcepack(long j, String str);

    private static native void setResourcepackLocale(long j, String str);

    private static native void setUserData(long j, int i, float f, String str, String str2, String str3, int i2, int i3);

    private static native void setVmojiBgColor(long j, int i);

    private static native void setVmojiLandmarks(long j, float[] fArr);

    private static native void setVmojiSvgData(long j, String str, int i);

    private void setupAudios(@Nullable String[] strArr) {
        if (strArr == null) {
            return;
        }
        stopAudios();
        for (int i = 0; i < strArr.length; i++) {
            this.audioIds.put(Integer.valueOf(i), Integer.valueOf(this.audioController.addAudioStream(strArr[i])));
        }
    }

    private void setupFonts(@Nullable String[] strArr) {
        if (strArr == null) {
            return;
        }
        this.fonts = new Typeface[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            this.fonts[i] = Typeface.createFromFile(strArr[i]);
        }
    }

    private void setupResourcepack(File file) {
        this.rpFile = file;
        setResourcepackLocale(this.nativeInstance, Locale.getDefault().toString().toLowerCase());
        setResourcepack(this.nativeInstance, file.getAbsolutePath());
        setupAudios(getAudioPaths(this.nativeInstance));
        setupFonts(getFontPaths(this.nativeInstance));
    }

    public static Bitmap softwareRasterizeSvg(String str, int i, int i2) {
        int[] iArr = new int[i * i2];
        softwareRasterizeSvg(str, i, i2, iArr);
        return Bitmap.createBitmap(iArr, i, i2, Bitmap.Config.ARGB_8888);
    }

    private static native void softwareRasterizeSvg(String str, int i, int i2, int[] iArr);

    private void stopAudios() {
        HashMap<Integer, Integer> hashMap = this.audioIds;
        if (hashMap == null) {
            return;
        }
        Iterator<Integer> it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            stopAudio(it.next().intValue());
        }
        this.audioIds.clear();
    }

    private static native void updateMusicDelay(long j, long j2);

    private static native void updateTextures(long j);

    private static native void updateVideoInfo(long j, int i, int i2, long j2);

    @Nullable
    public static SVGErrorInfo validateSvg(String str) {
        return nativeValidateSvg(str);
    }

    @Override // ru.ok.gleffects.Effect
    public void applyRecordingTime(long j) {
        applyRecordingTime(this.nativeInstance, j);
    }

    @Override // ru.ok.gleffects.Effect
    public void clearMusicInfo() {
        clearMusicInfo(this.nativeInstance);
    }

    @Override // ru.ok.gleffects.EffectListener
    public void clearSavedStorage() {
        dispatchToUi(new rc4(this, 6));
    }

    public int[] createTextTexture(int i, String str, float f, int i2, int i3, float f2) {
        Typeface[] typefaceArr = this.fonts;
        int[] loadTextureFromText = TextureHelper.loadTextureFromText(i, str, f, i2, f2, (typefaceArr == null || i3 < 0 || i3 >= typefaceArr.length) ? this.defaultTypeface : typefaceArr[i3]);
        this.postTexIds.add(Integer.valueOf(loadTextureFromText[0]));
        return loadTextureFromText;
    }

    @Override // ru.ok.gleffects.Effect
    public void handleBodyPatternMatches(float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4, float[] fArr5, float[] fArr6) {
        handleBodyPatternMatches(this.nativeInstance, fArr, fArr2, fArr3, fArr4, fArr5, fArr6);
    }

    @Override // ru.ok.gleffects.Effect
    public void handleCats(float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4, float[] fArr5, float[] fArr6) {
        handleCats(this.nativeInstance, fArr, fArr2, fArr3, fArr4, fArr5, fArr6);
    }

    @Override // ru.ok.gleffects.Effect
    public void handleFaceMeshes(float[][] fArr) {
        handleFaceMeshes(this.nativeInstance, fArr);
    }

    @Override // ru.ok.gleffects.Effect
    public void handleFaces(float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4, float[] fArr5, float[] fArr6, float[] fArr7) {
        handleFaces(this.nativeInstance, fArr, fArr2, fArr3, fArr4, fArr5, fArr6, fArr7);
    }

    @Override // ru.ok.gleffects.Effect
    public void handleFriendsData(int[] iArr, float[] fArr, List<String> list, List<String> list2, List<String> list3, int[] iArr2, int[] iArr3) {
        setFriendsData(this.nativeInstance, iArr, fArr, (String[]) list.toArray(new String[0]), (String[]) list2.toArray(new String[0]), (String[]) list3.toArray(new String[0]), iArr2, iArr3);
    }

    public void handleFullSegmentation(int i, int i2, int i3) {
        handleFullSegmentation(this.nativeInstance, i, i2, i3);
    }

    public void handleGalleryItemDeselected() {
        handleGalleryItemDeselected(this.nativeInstance);
    }

    @Override // ru.ok.gleffects.Effect
    public void handleGalleryItemSelected(GalleryAsset galleryAsset) {
        handleGalleryItemSelected(this.nativeInstance, galleryAsset.type.ordinal(), galleryAsset.filename, galleryAsset.defaultIndex);
    }

    @Override // ru.ok.gleffects.Effect
    public void handleGestures(@NonNull String[] strArr, @NonNull String[] strArr2, @NonNull float[] fArr, @NonNull float[][] fArr2, @NonNull float[][] fArr3, @NonNull float[][] fArr4, @NonNull float[] fArr5, @NonNull float[] fArr6, @NonNull float[] fArr7, @NonNull float[] fArr8, @NonNull float[] fArr9, @NonNull float[] fArr10, @NonNull float[] fArr11, @NonNull float[] fArr12, @NonNull float[] fArr13, @NonNull float[] fArr14) {
        handleGestures(this.nativeInstance, strArr, strArr2, fArr, fArr2, fArr3, fArr4, fArr5, fArr6, fArr7, fArr8, fArr9, fArr10, fArr11, fArr12, fArr13, fArr14);
    }

    public void handleImageFloat(ImageTypes imageTypes, int i, int i2, int i3, int i4, float[] fArr, float f, float f2, float f3, float f4, float f5) {
        handleImageFloat(this.nativeInstance, imageTypes.getValue(), i, i2, i3, i4, fArr, f, f2, f3, f4, f5);
    }

    public void handleImageInt(ImageTypes imageTypes, int i, int i2, int i3, int i4, int[] iArr, float f, float f2, float f3, float f4, float f5) {
        handleImageInt(this.nativeInstance, imageTypes.getValue(), i, i2, i3, i4, iArr, f, f2, f3, f4, f5);
    }

    @Override // ru.ok.gleffects.Effect
    public void handleMorph(long j) {
        handleMorph(this.nativeInstance, j);
    }

    public void handleSkySegmentation(int i, int i2, int i3) {
        handleSkySegmentation(this.nativeInstance, i, i2, i3);
    }

    public void handleTextureId(int i, int i2, int i3) {
        handleTextureId(this.nativeInstance, i, i2, i3);
    }

    @Override // ru.ok.gleffects.Effect
    public void handleTracksInfo(int[] iArr, float[] fArr, List<String> list, List<String> list2, List<String> list3) {
        setMusicTracksInfo(this.nativeInstance, iArr, fArr, (String[]) list.toArray(new String[0]), (String[]) list2.toArray(new String[0]), (String[]) list3.toArray(new String[0]));
    }

    @Override // ru.ok.gleffects.EffectListener
    public void onChangeAudioPitch(final float f) {
        dispatchToUi(new Runnable() { // from class: xsna.q9p
            @Override // java.lang.Runnable
            public final void run() {
                EffectNativeSink.this.lambda$onChangeAudioPitch$10(f);
            }
        });
    }

    @Override // ru.ok.gleffects.EffectListener
    public void onChangeMicMute(final boolean z) {
        dispatchToUi(new Runnable() { // from class: xsna.p9p
            @Override // java.lang.Runnable
            public final void run() {
                EffectNativeSink.this.lambda$onChangeMicMute$6(z);
            }
        });
    }

    @Override // ru.ok.gleffects.EffectListener
    public void onChangePreferRecordingDuration(final long j) {
        dispatchToUi(new Runnable() { // from class: xsna.r9p
            @Override // java.lang.Runnable
            public final void run() {
                EffectNativeSink.this.lambda$onChangePreferRecordingDuration$4(j);
            }
        });
    }

    @Override // ru.ok.gleffects.EffectListener
    public void onChangeReadyToStartRecording(boolean z) {
        dispatchToUi(new jtd(this, z, 1));
    }

    @Override // ru.ok.gleffects.Effect
    public void onClick(float f, float f2) {
        onClick(this.nativeInstance, f, f2);
    }

    @Override // ru.ok.gleffects.Effect
    public void onFirstFrame(int i) {
        onFirstFrame(this.nativeInstance, i);
    }

    @Override // ru.ok.gleffects.EffectListener
    public void onNewMessage(String str) {
        dispatchToUi(new y(5, this, str));
    }

    @Override // ru.ok.gleffects.Effect
    public void onPinch(float f) {
        onPinch(this.nativeInstance, f);
    }

    @Override // ru.ok.gleffects.EffectListener
    public void onRequirementsChanged(DynamicRequirements dynamicRequirements) {
        dispatchToUi(new z(3, this, dynamicRequirements));
    }

    @Override // ru.ok.gleffects.Effect
    public void onRotation(float f) {
        onRotation(this.nativeInstance, f);
    }

    @Override // ru.ok.gleffects.Effect
    public void onStartRecording() {
        onStartRecording(this.nativeInstance);
    }

    @Override // ru.ok.gleffects.Effect
    public void onStopRecording() {
        onStopRecording(this.nativeInstance);
    }

    @Override // ru.ok.gleffects.Effect
    public void onTouch(float f, float f2, int i) {
        if (this.touches.size() <= 100) {
            this.touches.add(new Touch(f, f2, i));
            return;
        }
        synchronized (this.touches) {
            this.touches.add(new Touch(f, f2, i));
        }
    }

    @Override // ru.ok.gleffects.EffectListener
    public void onUsingGesturesChanged(String[] strArr) {
        dispatchToUi(new eo1(3, this, strArr));
    }

    public void pauseAudio(int i) {
        if (checkAudioCorrectness(i)) {
            this.audioController.pause(this.audioIds.get(Integer.valueOf(i)).intValue());
        }
    }

    public void preloadAudioFromFile(int i, String str) {
        int addAudioStream;
        if (checkAudioCorrectness(i) || this.audioIds == null || (addAudioStream = this.audioController.addAudioStream(str)) < 0) {
            return;
        }
        this.audioIds.put(Integer.valueOf(i), Integer.valueOf(addAudioStream));
    }

    @Override // ru.ok.gleffects.Effect
    public void receiveDeviceRotationMatrix(float[] fArr) {
        receiveDeviceRotationMatrix(this.nativeInstance, fArr);
    }

    @Override // ru.ok.gleffects.EffectListener
    public void registerForFrugalReceive(boolean z) {
        dispatchToUi(new s9p(this, z, 0));
    }

    public void release() {
        synchronized (this.lock) {
            this.isReleased = true;
        }
        this.videoController.interrupt();
        if (!this.postTexIds.isEmpty()) {
            int[] iArr = new int[this.postTexIds.size()];
            Iterator<Integer> it = this.postTexIds.iterator();
            int i = 0;
            while (it.hasNext()) {
                iArr[i] = it.next().intValue();
                i++;
            }
            TextureHelper.deleteTexture(iArr);
        }
        HashMap<Integer, Integer> hashMap = this.audioIds;
        if (hashMap != null) {
            for (Integer num : hashMap.keySet()) {
                num.intValue();
                this.audioController.release(this.audioIds.get(num).intValue());
            }
        }
        Typeface[] typefaceArr = this.fonts;
        if (typefaceArr != null) {
            for (Typeface typeface : typefaceArr) {
            }
        }
        this.listener = null;
        release(this.nativeInstance);
    }

    public void releaseMain() {
        synchronized (this.lock) {
            this.isReleased = true;
        }
    }

    @Override // ru.ok.gleffects.Effect
    public void render(int i, int i2, int i3, int i4, int i5, boolean z, boolean z2) {
        if (this.isUpdateTexturesNeeded) {
            updateTextures();
            return;
        }
        if (isGPUResourcesLoaded(this.nativeInstance)) {
            if (this.touches.size() != 0 && this.firstTouch != this.touches.size()) {
                int size = this.touches.size();
                for (int i6 = this.firstTouch; i6 < size; i6++) {
                    onTouch(this.nativeInstance, this.touches.get(i6).x, this.touches.get(i6).y, this.touches.get(i6).action);
                }
                this.firstTouch = size;
                if (size > 100) {
                    synchronized (this.touches) {
                        this.touches.clear();
                        this.firstTouch = 0;
                    }
                }
            }
            this.videoController.onRender();
            render(this.nativeInstance, i, i2, i3, i4, i5, z, z2);
            renderTip(this.nativeInstance);
        }
    }

    @Override // ru.ok.gleffects.Effect
    public void renderTip() {
        renderTip(this.nativeInstance);
    }

    public void resetEffectToInitialState() {
        resetEffectToInitialState(this.nativeInstance);
    }

    public void resumeAudio(int i) {
        if (checkAudioCorrectness(i)) {
            this.audioController.resume(this.audioIds.get(Integer.valueOf(i)).intValue());
        }
    }

    public void selectBeautyMode(boolean z) {
        selectBeautyMode(this.nativeInstance, z);
    }

    public void setAudioVolume(int i, float f) {
        if (checkAudioCorrectness(i)) {
            this.audioController.setVolume(this.audioIds.get(Integer.valueOf(i)).intValue(), f);
        }
    }

    public void setBeautyEPS(int i) {
        setBeautyEPS(this.nativeInstance, i);
    }

    @Override // ru.ok.gleffects.Effect
    public void setCameraFOV(float f) {
        setCameraFOV(this.nativeInstance, f);
    }

    public void setCustomIntParameter(int i) {
        setCustomIntParameter(this.nativeInstance, i);
    }

    @Override // ru.ok.gleffects.EffectListener
    public void setMusicById(String str) {
        dispatchToUi(new hc3(6, this, str));
    }

    @Override // ru.ok.gleffects.Effect
    public void setMusicInfo(@Nullable long[] jArr, long j) {
        setMusicInfo(this.nativeInstance, jArr, j);
    }

    @Override // ru.ok.gleffects.Effect
    public void setUserData(int i, float f, String str, String str2, String str3, int i2, int i3) {
        setUserData(this.nativeInstance, i, f, str, str2, str3, i2, i3);
    }

    public void setVmojiBgColor(int i) {
        setVmojiBgColor(this.nativeInstance, i);
    }

    public void setVmojiLandmarks(float[] fArr) {
        setVmojiLandmarks(this.nativeInstance, fArr);
    }

    public void setVmojiSvg(byte[] bArr, int i) {
        setVmojiSvgData(this.nativeInstance, new String(bArr), i);
    }

    public void startAudio(int i, boolean z, boolean z2, float f, long j) {
        if (checkAudioCorrectness(i)) {
            this.audioController.start(this.audioIds.get(Integer.valueOf(i)).intValue(), z, z2, f, j);
        }
    }

    public void startAudioFromFile(int i, String str, boolean z, float f, boolean z2, long j) {
        preloadAudioFromFile(i, str);
        this.audioController.start(this.audioIds.get(Integer.valueOf(i)).intValue(), z, z2, f, j);
    }

    @Override // ru.ok.gleffects.EffectListener
    public void startRecording() {
        dispatchToUi(new wd2(this, 4));
    }

    public void stopAudio(int i) {
        if (checkAudioCorrectness(i)) {
            this.audioController.stop(this.audioIds.get(Integer.valueOf(i)).intValue());
        }
    }

    public void stopHandleEvents() {
        if (this.mainHandler != null) {
            this.mainHandler.removeCallbacksAndMessages(null);
            this.mainHandler = null;
        }
    }

    @Override // ru.ok.gleffects.EffectListener
    public void stopRecording() {
        dispatchToUi(new p69(this, 6));
    }

    @Override // ru.ok.gleffects.EffectListener
    public void submitTaskOnWorkerThread(Runnable runnable) {
        dispatchToUi(new gc3(2, this, runnable));
    }

    @Override // ru.ok.gleffects.EffectListener
    public void toggleGalleryPanel(final boolean z, final GalleryPanelSettings galleryPanelSettings) {
        dispatchToUi(new Runnable() { // from class: xsna.t9p
            @Override // java.lang.Runnable
            public final void run() {
                EffectNativeSink.this.lambda$toggleGalleryPanel$12(z, galleryPanelSettings);
            }
        });
    }

    @Override // ru.ok.gleffects.Effect
    public void updateMusicDelay(long j) {
        updateMusicDelay(this.nativeInstance, j);
    }

    public void updateResourcepack(File file) {
        synchronized (this.lock) {
            setupResourcepack(file);
        }
    }

    @Override // ru.ok.gleffects.Effect
    public void updateTextures() {
        if (!this.isResourceReady) {
            this.isUpdateTexturesNeeded = true;
            return;
        }
        this.isUpdateTexturesNeeded = false;
        this.videoController.clear();
        this.postTexIds.clear();
        updateTextures(this.nativeInstance);
        this.texturesAreUpdated = true;
    }

    @Override // ru.ok.gleffects.Effect
    public void updateVideoInfo(int i, int i2, long j) {
        updateVideoInfo(this.nativeInstance, i, i2, j);
    }

    private EffectNativeSink(final Builder builder) {
        this.lock = new Object();
        this.postTexIds = new HashSet<>();
        this.mainHandler = new Handler(Looper.getMainLooper());
        this.audioIds = new HashMap<>();
        this.touches = new ArrayList<>();
        this.firstTouch = 0;
        this.audioController = builder.audioController;
        this.videoController = builder.videoController;
        this.listener = builder.listener;
        this.defaultTypeface = builder.defaultTypeface;
        long createEffect = createEffect(builder.effectHandle, builder.width, builder.height, this);
        this.nativeInstance = createEffect;
        if (builder.resourceProvider != null) {
            setForceUseNewFaceModel(createEffect, true);
            builder.resourceProvider.getEffectResourcepackFile(builder.effectId, new o7j() { // from class: ru.ok.gleffects.impl.a
                @Override // xsna.o7j
                public final void accept(Object obj) {
                    EffectNativeSink.this.lambda$new$0(builder, (File) obj);
                }
            });
        } else {
            this.isResourceReady = true;
            Objects.toString(builder.effectId);
            int i = builder.effectId.id;
        }
    }
}
