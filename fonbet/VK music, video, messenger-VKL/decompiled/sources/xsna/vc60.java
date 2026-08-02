package xsna;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.Iterator;
import xsna.wc60;

/* compiled from: NewsfeedBackstageFreshPostsPlugin.kt */
/* loaded from: classes4.dex */
public final class vc60 implements obs {
    public final /* synthetic */ wc60 b;

    public vc60(wc60 wc60Var) {
        this.b = wc60Var;
    }

    @Override // xsna.obs
    public final void b() {
        wc60 wc60Var = this.b;
        Iterator<vs60> it = wc60Var.p.iterator();
        while (it.hasNext()) {
            wc60Var.d.a(it.next());
        }
        wc60Var.p.clear();
    }

    @Override // xsna.obs
    public final void onDestroy() {
        this.b.a.d(this);
    }

    @Override // xsna.obs
    public final void onDestroyView() {
        wc60 wc60Var = this.b;
        wc60Var.i = null;
        wc60.a aVar = wc60Var.j;
        if (aVar != null) {
            wc60Var.c.m(aVar);
        }
        wc60Var.j = null;
    }

    @Override // xsna.obs
    public final void c() {
    }

    @Override // xsna.obs
    public final void onPause() {
    }

    @Override // xsna.obs
    public final void onResume() {
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
