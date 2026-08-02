package ru.ok.android.externcalls.sdk.audio;

import io.reactivex.rxjava3.core.y;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.izs;
import xsna.s3q0;

/* compiled from: Adapters.kt */
/* loaded from: classes9.dex */
public /* synthetic */ class AdaptersKt$hasWiredHeadsetSingle$1$1 extends FunctionReferenceImpl implements izs<Boolean, s3q0> {
    public AdaptersKt$hasWiredHeadsetSingle$1$1(Object obj) {
        super(1, obj, y.class, "onSuccess", "onSuccess(Ljava/lang/Object;)V", 0);
    }

    @Override // xsna.izs
    public /* bridge */ /* synthetic */ s3q0 invoke(Boolean bool) {
        invoke2(bool);
        return s3q0.a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Boolean bool) {
        ((y) this.receiver).onSuccess(bool);
    }
}
