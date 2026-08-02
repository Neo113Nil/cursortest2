package defpackage;

import android.view.View;
import androidx.compose.foundation.layout.a;
import androidx.core.view.ViewCompat$Api21Impl;
import androidx.core.view.b;
import java.util.WeakHashMap;

/* loaded from: classes10.dex */
public final class f3x0 extends i2w {
    public tls w;
    public a x;

    @Override // defpackage.d2w, defpackage.e530
    public final void onAttach() {
        View V = tje.V(this);
        WeakHashMap weakHashMap = a.w;
        a p = vuz.p(V);
        p.a(V);
        p651 p651Var = (p651) this.w.invoke(p);
        if (!jl40.l(p651Var, this.c)) {
            this.c = p651Var;
            F0();
        }
        this.x = p;
        super.onAttach();
    }

    @Override // defpackage.d2w, defpackage.e530
    public final void onDetach() {
        View V = tje.V(this);
        a aVar = this.x;
        if (aVar != null) {
            int i = aVar.u - 1;
            aVar.u = i;
            if (i == 0) {
                WeakHashMap weakHashMap = b.a;
                ViewCompat$Api21Impl.o(V, null);
                b.u(V, null);
                V.removeOnAttachStateChangeListener(aVar.v);
            }
        }
        super.onDetach();
    }
}
