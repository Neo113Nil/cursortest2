package defpackage;

import com.monetization.ads.quality.base.AdQualityVerifierAdapter;

/* loaded from: classes7.dex */
public final class nr81 implements eo81 {
    public final AdQualityVerifierAdapter a;

    public nr81(AdQualityVerifierAdapter adQualityVerifierAdapter) {
        new zl71();
        this.a = adQualityVerifierAdapter;
    }

    @Override // defpackage.eo81
    public final void onInvalidated() {
        try {
            this.a.onInvalidated();
        } catch (Throwable unused) {
        }
    }
}
