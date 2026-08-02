package ru.ok.gleffects;

import androidx.annotation.Nullable;
import ru.ok.gleffects.recognition.DynamicRequirements;
import ru.ok.gleffects.recognition.GalleryPanelSettings;

/* loaded from: classes11.dex */
public interface EffectListener {
    void clearSavedStorage();

    void onChangeAudioPitch(float f);

    void onChangeMicMute(boolean z);

    void onChangePreferRecordingDuration(long j);

    void onChangeReadyToStartRecording(boolean z);

    void onNewMessage(String str);

    void onRequirementsChanged(DynamicRequirements dynamicRequirements);

    void onUsingGesturesChanged(String[] strArr);

    void registerForFrugalReceive(boolean z);

    void setMusicById(String str);

    void startRecording();

    void stopRecording();

    void submitTaskOnWorkerThread(Runnable runnable);

    void toggleGalleryPanel(boolean z, @Nullable GalleryPanelSettings galleryPanelSettings);
}
