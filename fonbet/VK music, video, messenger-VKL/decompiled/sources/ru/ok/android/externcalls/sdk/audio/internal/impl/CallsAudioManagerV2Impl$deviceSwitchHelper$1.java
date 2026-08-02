package ru.ok.android.externcalls.sdk.audio.internal.impl;

import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.externcalls.sdk.audio.CallsAudioManager;
import xsna.izs;
import xsna.s3q0;

/* compiled from: CallsAudioManagerV2Impl.kt */
/* loaded from: classes9.dex */
public /* synthetic */ class CallsAudioManagerV2Impl$deviceSwitchHelper$1 extends FunctionReferenceImpl implements izs<CallsAudioManager.AudioDeviceType, s3q0> {
    public CallsAudioManagerV2Impl$deviceSwitchHelper$1(Object obj) {
        super(1, obj, CallsAudioManagerV2Impl.class, "selectAudioDeviceImpl", "selectAudioDeviceImpl(Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$AudioDeviceType;)V", 0);
    }

    @Override // xsna.izs
    public /* bridge */ /* synthetic */ s3q0 invoke(CallsAudioManager.AudioDeviceType audioDeviceType) {
        invoke2(audioDeviceType);
        return s3q0.a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(CallsAudioManager.AudioDeviceType audioDeviceType) {
        ((CallsAudioManagerV2Impl) this.receiver).selectAudioDeviceImpl(audioDeviceType);
    }
}
