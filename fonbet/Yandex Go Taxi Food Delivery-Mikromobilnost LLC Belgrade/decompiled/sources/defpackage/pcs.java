package defpackage;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.q;
import java.util.Map;

/* loaded from: classes10.dex */
public final class pcs implements q {
    public final /* synthetic */ String a;
    public final /* synthetic */ kds b;
    public final /* synthetic */ Lifecycle c;
    public final /* synthetic */ FragmentManager w;

    public pcs(FragmentManager fragmentManager, String str, kds kdsVar, Lifecycle lifecycle) {
        this.w = fragmentManager;
        this.a = str;
        this.b = kdsVar;
        this.c = lifecycle;
    }

    @Override // androidx.lifecycle.q
    public final void M1(pey peyVar, Lifecycle.Event event) {
        Bundle bundle;
        FragmentManager fragmentManager = this.w;
        Map map = fragmentManager.m;
        Lifecycle.Event event2 = Lifecycle.Event.ON_START;
        String str = this.a;
        if (event == event2 && (bundle = (Bundle) map.get(str)) != null) {
            this.b.s(bundle, str);
            map.remove(str);
            FragmentManager.O(2);
        }
        if (event == Lifecycle.Event.ON_DESTROY) {
            this.c.d(this);
            fragmentManager.n.remove(str);
        }
    }
}
