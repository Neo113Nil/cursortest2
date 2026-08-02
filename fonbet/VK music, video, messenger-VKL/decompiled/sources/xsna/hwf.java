package xsna;

import android.os.Bundle;
import xsna.gwf;

/* compiled from: ClosingBannerAdsDelegateFactoryImpl.kt */
/* loaded from: classes6.dex */
public final class hwf implements com.vk.superapp.ads.js.bridge.api.di.b {
    public final del0 a;
    public final mel0 b;

    public hwf(del0 del0Var, mel0 mel0Var) {
        this.a = del0Var;
        this.b = mel0Var;
    }

    @Override // com.vk.superapp.ads.js.bridge.api.di.b
    public final gwf a(izs<? super Bundle, s3q0> izsVar, gzs<Boolean> gzsVar, gwf.a aVar) {
        return new iwf(this.a, this.b, izsVar, gzsVar, aVar);
    }
}
