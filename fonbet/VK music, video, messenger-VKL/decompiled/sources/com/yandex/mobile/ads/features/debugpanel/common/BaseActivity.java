package com.yandex.mobile.ads.features.debugpanel.common;

import android.app.Activity;
import android.os.Bundle;
import xsna.vii0;
import xsna.yvj;
import xsna.zvj;
import yads.bm3;
import yads.m70;
import yads.mn;
import yads.nc1;
import yads.z10;

/* loaded from: classes8.dex */
public abstract class BaseActivity<T extends nc1> extends Activity {
    private final yvj a;
    private nc1 c;

    public BaseActivity() {
        yvj b;
        b = z10.b(null);
        this.a = b;
        getLastNonConfigurationInstance();
    }

    public final yvj a() {
        return this.a;
    }

    public final nc1 b() {
        nc1 nc1Var = this.c;
        if (nc1Var != null) {
            return nc1Var;
        }
        nc1 a = m70.a((m70) ((vii0) c()).c);
        this.c = a;
        return a;
    }

    public abstract bm3 c();

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        Object lastNonConfigurationInstance = getLastNonConfigurationInstance();
        mn mnVar = lastNonConfigurationInstance instanceof mn ? (mn) lastNonConfigurationInstance : null;
        if (mnVar != null) {
            nc1 nc1Var = mnVar.a;
            this.c = nc1Var != null ? nc1Var : null;
        }
        super.onCreate(bundle);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        nc1 nc1Var;
        super.onDestroy();
        zvj.c(this.a, null);
        if (isChangingConfigurations() || (nc1Var = this.c) == null) {
            return;
        }
        zvj.c(nc1Var.a, null);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        return new mn(b());
    }
}
