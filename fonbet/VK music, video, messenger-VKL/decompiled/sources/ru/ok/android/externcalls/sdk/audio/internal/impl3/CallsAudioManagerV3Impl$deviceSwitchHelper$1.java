package ru.ok.android.externcalls.sdk.audio.internal.impl3;

import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo;
import xsna.izs;
import xsna.s3q0;

/* compiled from: CallsAudioManagerV3Impl.kt */
/* loaded from: classes9.dex */
public /* synthetic */ class CallsAudioManagerV3Impl$deviceSwitchHelper$1 extends FunctionReferenceImpl implements izs<CallsAudioDeviceInfo, s3q0> {
    public CallsAudioManagerV3Impl$deviceSwitchHelper$1(Object obj) {
        super(1, obj, CallsAudioManagerV3Impl.class, "selectAudioDeviceImpl", "selectAudioDeviceImpl(Lru/ok/android/externcalls/sdk/audio/CallsAudioDeviceInfo;)V", 0);
    }

    @Override // xsna.izs
    public /* bridge */ /* synthetic */ s3q0 invoke(CallsAudioDeviceInfo callsAudioDeviceInfo) {
        invoke2(callsAudioDeviceInfo);
        return s3q0.a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(CallsAudioDeviceInfo callsAudioDeviceInfo) {
        ((CallsAudioManagerV3Impl) this.receiver).selectAudioDeviceImpl(callsAudioDeviceInfo);
    }
}
