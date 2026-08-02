package com.vungle.ads.internal;

import com.vungle.ads.SdkNotInitialized;
import kotlin.jvm.internal.Lambda;
import xsna.gzs;
import xsna.s3q0;

/* loaded from: classes7.dex */
public final class t2 extends Lambda implements gzs {
    public final /* synthetic */ w2 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(w2 w2Var) {
        super(0);
        this.a = w2Var;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        this.a.a(new SdkNotInitialized("Network permissions not granted").logError$vungle_ads_release());
        return s3q0.a;
    }
}
