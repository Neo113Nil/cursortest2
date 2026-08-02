package ru.ok.android.externcalls.sdk.audio.internal.impl3;

import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.gzs;
import xsna.s3q0;

/* compiled from: CallsAudioManagerV3Impl.kt */
/* loaded from: classes9.dex */
public /* synthetic */ class CallsAudioManagerV3Impl$requestAudioFocusAsync$1 extends FunctionReferenceImpl implements gzs<s3q0> {
    public CallsAudioManagerV3Impl$requestAudioFocusAsync$1(Object obj) {
        super(0, obj, CallsAudioManagerV3Impl.class, "requestAudioFocus", "requestAudioFocus()V", 0);
    }

    @Override // xsna.gzs
    public /* bridge */ /* synthetic */ s3q0 invoke() {
        invoke2();
        return s3q0.a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((CallsAudioManagerV3Impl) this.receiver).requestAudioFocus();
    }
}
