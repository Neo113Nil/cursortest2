package com.vungle.ads.internal;

import com.vungle.ads.BaseAdListener;
import com.vungle.ads.VungleError;
import kotlin.jvm.internal.Lambda;
import xsna.gzs;
import xsna.s3q0;

/* loaded from: classes7.dex */
public final class g0 extends Lambda implements gzs {
    public final /* synthetic */ i0 a;
    public final /* synthetic */ VungleError b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(i0 i0Var, VungleError vungleError) {
        super(0);
        this.a = i0Var;
        this.b = vungleError;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        BaseAdListener adListener = this.a.getAdListener();
        if (adListener != null) {
            adListener.onAdFailedToPlay(this.a, this.b);
        }
        return s3q0.a;
    }
}
