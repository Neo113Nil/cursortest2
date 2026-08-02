package ru.ok.android.externcalls.sdk.audio;

import java.util.Set;
import ru.ok.android.externcalls.sdk.audio.CallsAudioManager;

/* compiled from: AudioDeviceSelector.kt */
/* loaded from: classes9.dex */
public interface AudioDeviceSelector {
    CallsAudioManager.AudioDeviceType selectPreferableDevice(CallsAudioManager.State state, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, Set<? extends CallsAudioManager.AudioDeviceType> set, CallsAudioManager.AudioDeviceType audioDeviceType, VideoTracker videoTracker, ProximityTracker proximityTracker);
}
