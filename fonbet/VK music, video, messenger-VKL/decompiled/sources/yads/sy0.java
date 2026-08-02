package yads;

import android.view.ViewGroup;
import com.monetization.ads.nativeads.ExtendedNativeAdView;

/* loaded from: classes10.dex */
public final class sy0 implements zf0 {
    public final zf0 a;

    public sy0(zf0 zf0Var) {
        this.a = zf0Var;
    }

    @Override // yads.zf0
    public final void a(ViewGroup viewGroup) {
        this.a.a((ExtendedNativeAdView) viewGroup);
    }

    @Override // yads.zf0
    public final void c() {
        this.a.c();
    }
}
