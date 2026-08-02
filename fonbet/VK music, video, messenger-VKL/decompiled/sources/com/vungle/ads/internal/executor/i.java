package com.vungle.ads.internal.executor;

import com.iab.omid.library.vungle.internal.l;
import com.vungle.ads.OutOfMemory;
import kotlin.jvm.internal.Lambda;
import xsna.gzs;
import xsna.s3q0;

/* loaded from: classes7.dex */
public final class i extends Lambda implements gzs {
    public final /* synthetic */ j a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar) {
        super(0);
        this.a = jVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        StringBuilder a = l.a("submit callable error in ");
        a.append(this.a.a());
        new OutOfMemory(a.toString()).logErrorNoReturnValue$vungle_ads_release();
        return s3q0.a;
    }
}
