package xsna;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;

/* compiled from: NewsfeedWatcherScrollController.kt */
/* loaded from: classes4.dex */
public final class n170 implements obs {
    public final /* synthetic */ o170 b;
    public final /* synthetic */ mbs c;

    public n170(o170 o170Var, mbs mbsVar) {
        this.b = o170Var;
        this.c = mbsVar;
    }

    @Override // xsna.obs
    public final void onDestroy() {
        this.c.d(this);
    }

    @Override // xsna.obs
    public final void onDestroyView() {
        o170 o170Var = this.b;
        o170Var.c.m(o170Var.b);
        o170Var.a.e();
        pv60 pv60Var = o170Var.h;
        if (pv60Var != null) {
            pv60Var.a.clear();
        }
        o170Var.h = null;
    }

    @Override // xsna.obs
    public final void onPause() {
        this.b.a.h();
    }

    @Override // xsna.obs
    public final void onResume() {
        this.b.a.f();
    }

    @Override // xsna.obs
    public final void b() {
    }

    @Override // xsna.obs
    public final void c() {
    }

    @Override // xsna.obs
    public final void onStop() {
    }

    @Override // xsna.obs
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // xsna.obs
    public final void onCreate(Bundle bundle) {
    }

    @Override // xsna.obs
    public final void onActivityResult(int i, int i2, Intent intent) {
    }
}
