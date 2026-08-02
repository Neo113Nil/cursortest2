package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.Build;

/* loaded from: classes4.dex */
public final class j93 extends q85 {
    public final String f;

    public j93(int i) {
        this.f = "PublicSuffixDatabase.list";
    }

    @Override // defpackage.q85
    public final String a() {
        return this.f;
    }

    @Override // defpackage.q85
    public final v0w b() {
        d72 d72Var = dvc0.a;
        d72 d72Var2 = dvc0.a;
        if (d72Var2 == null) {
            d72Var2 = null;
        }
        Context applicationContext = d72Var2 != null ? d72Var2.getApplicationContext() : null;
        AssetManager assets = applicationContext != null ? applicationContext.getAssets() : null;
        if (assets != null) {
            return vng.H(assets.open(this.f));
        }
        if (Build.FINGERPRINT == null) {
            ny61.v("Platform applicationContext not initialized. Possibly running Android unit test without Robolectric. Android tests should run with Robolectric and call OkHttp.initialize before test");
            return null;
        }
        ny61.v("Platform applicationContext not initialized. Startup Initializer possibly disabled, call OkHttp.initialize before test.");
        return null;
    }

    public j93() {
        this(0);
    }
}
