package yads;

import com.monetization.ads.quality.base.AdQualityVerifierAdapter;
import com.monetization.ads.quality.base.model.configuration.AdQualityVerifierAdapterConfiguration;
import xsna.s3q0;

/* loaded from: classes10.dex */
public final class b8 implements a9 {
    public final AdQualityVerifierAdapter a;
    public final AdQualityVerifierAdapterConfiguration b;
    public final long c;
    public final y8 d;
    public final n8 e;
    public final o8 f;

    public /* synthetic */ b8(AdQualityVerifierAdapter adQualityVerifierAdapter, AdQualityVerifierAdapterConfiguration adQualityVerifierAdapterConfiguration, long j, y8 y8Var, n8 n8Var) {
        this(adQualityVerifierAdapter, adQualityVerifierAdapterConfiguration, j, y8Var, n8Var, new o8());
    }

    @Override // yads.a9
    public final void onAdWillDisplay() {
        try {
            this.a.onAdWillDisplay();
            s3q0 s3q0Var = s3q0.a;
        } catch (Throwable unused) {
        }
    }

    @Override // yads.a9
    public final void onInvalidated() {
        try {
            this.a.onInvalidated();
            s3q0 s3q0Var = s3q0.a;
        } catch (Throwable unused) {
        }
    }

    public b8(AdQualityVerifierAdapter adQualityVerifierAdapter, AdQualityVerifierAdapterConfiguration adQualityVerifierAdapterConfiguration, long j, y8 y8Var, n8 n8Var, o8 o8Var) {
        this.a = adQualityVerifierAdapter;
        this.b = adQualityVerifierAdapterConfiguration;
        this.c = j;
        this.d = y8Var;
        this.e = n8Var;
        this.f = o8Var;
    }
}
