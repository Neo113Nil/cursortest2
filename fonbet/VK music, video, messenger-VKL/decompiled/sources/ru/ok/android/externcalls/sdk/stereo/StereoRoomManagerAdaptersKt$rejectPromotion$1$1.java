package ru.ok.android.externcalls.sdk.stereo;

import io.reactivex.rxjava3.core.b;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.gzs;
import xsna.s3q0;

/* compiled from: StereoRoomManagerAdapters.kt */
/* loaded from: classes9.dex */
public final /* synthetic */ class StereoRoomManagerAdaptersKt$rejectPromotion$1$1 extends FunctionReferenceImpl implements gzs<s3q0> {
    public StereoRoomManagerAdaptersKt$rejectPromotion$1$1(Object obj) {
        super(0, obj, b.class, "onComplete", "onComplete()V", 0);
    }

    @Override // xsna.gzs
    public /* bridge */ /* synthetic */ s3q0 invoke() {
        invoke2();
        return s3q0.a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((b) this.receiver).onComplete();
    }
}
