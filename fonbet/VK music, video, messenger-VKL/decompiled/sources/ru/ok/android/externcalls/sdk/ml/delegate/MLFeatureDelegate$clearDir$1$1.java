package ru.ok.android.externcalls.sdk.ml.delegate;

import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.izs;
import xsna.s3q0;

/* compiled from: MLFeatureDelegate.kt */
/* loaded from: classes9.dex */
public final /* synthetic */ class MLFeatureDelegate$clearDir$1$1 extends FunctionReferenceImpl implements izs<String, s3q0> {
    public MLFeatureDelegate$clearDir$1$1(Object obj) {
        super(1, obj, MLFeatureDelegate.class, "log", "log(Ljava/lang/String;)V", 0);
    }

    @Override // xsna.izs
    public /* bridge */ /* synthetic */ s3q0 invoke(String str) {
        invoke2(str);
        return s3q0.a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        ((MLFeatureDelegate) this.receiver).log(str);
    }
}
