package ru.ok.android.externcalls.sdk.ml;

import java.io.File;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.izs;
import xsna.s3q0;

/* compiled from: MLFeaturesManagerImpl.kt */
/* loaded from: classes9.dex */
public final /* synthetic */ class MLFeaturesManagerImpl$delegates$1$1 extends FunctionReferenceImpl implements izs<File, s3q0> {
    public MLFeaturesManagerImpl$delegates$1$1(Object obj) {
        super(1, obj, MLFeaturesManagerImpl.class, "setNsParams", "setNsParams(Ljava/io/File;)V", 0);
    }

    @Override // xsna.izs
    public /* bridge */ /* synthetic */ s3q0 invoke(File file) {
        invoke2(file);
        return s3q0.a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(File file) {
        ((MLFeaturesManagerImpl) this.receiver).setNsParams(file);
    }
}
