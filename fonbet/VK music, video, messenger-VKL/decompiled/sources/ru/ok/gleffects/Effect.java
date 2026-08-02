package ru.ok.gleffects;

import androidx.annotation.NonNull;
import java.util.List;
import ru.ok.gleffects.recognition.GalleryAsset;

/* loaded from: classes11.dex */
public interface Effect {
    void applyRecordingTime(long j);

    void clearMusicInfo();

    void handleBodyPatternMatches(float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4, float[] fArr5, float[] fArr6);

    void handleCats(float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4, float[] fArr5, float[] fArr6);

    void handleFaceMeshes(float[][] fArr);

    void handleFaces(float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4, float[] fArr5, float[] fArr6, float[] fArr7);

    void handleFriendsData(int[] iArr, float[] fArr, List<String> list, List<String> list2, List<String> list3, int[] iArr2, int[] iArr3);

    void handleGalleryItemSelected(GalleryAsset galleryAsset);

    void handleGestures(@NonNull String[] strArr, @NonNull String[] strArr2, @NonNull float[] fArr, @NonNull float[][] fArr2, @NonNull float[][] fArr3, @NonNull float[][] fArr4, @NonNull float[] fArr5, @NonNull float[] fArr6, @NonNull float[] fArr7, @NonNull float[] fArr8, @NonNull float[] fArr9, @NonNull float[] fArr10, @NonNull float[] fArr11, @NonNull float[] fArr12, @NonNull float[] fArr13, @NonNull float[] fArr14);

    void handleMorph(long j);

    void handleTracksInfo(int[] iArr, float[] fArr, List<String> list, List<String> list2, List<String> list3);

    void onClick(float f, float f2);

    void onFirstFrame(int i);

    void onPinch(float f);

    void onRotation(float f);

    void onStartRecording();

    void onStopRecording();

    void onTouch(float f, float f2, int i);

    void receiveDeviceRotationMatrix(float[] fArr);

    void render(int i, int i2, int i3, int i4, int i5, boolean z, boolean z2);

    void renderTip();

    void setCameraFOV(float f);

    void setMusicInfo(long[] jArr, long j);

    void setUserData(int i, float f, String str, String str2, String str3, int i2, int i3);

    void updateMusicDelay(long j);

    void updateTextures();

    void updateVideoInfo(int i, int i2, long j);
}
