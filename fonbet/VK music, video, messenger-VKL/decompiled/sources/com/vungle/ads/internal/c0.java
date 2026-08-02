package com.vungle.ads.internal;

import com.vungle.ads.BaseAdListener;
import kotlin.jvm.internal.Lambda;
import xsna.gzs;
import xsna.s3q0;

/* loaded from: classes7.dex */
public final class c0 extends Lambda implements gzs {
    public final /* synthetic */ i0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(i0 i0Var) {
        super(0);
        this.a = i0Var;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        BaseAdListener adListener = this.a.getAdListener();
        if (adListener != null) {
            adListener.onAdEnd(this.a);
        }
        return s3q0.a;
    }
}
