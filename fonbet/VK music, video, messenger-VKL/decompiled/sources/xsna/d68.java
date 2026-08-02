package xsna;

import android.view.View;
import androidx.annotation.NonNull;
import java.util.WeakHashMap;
import xsna.t1u0;

/* compiled from: BottomNavigationView.java */
/* loaded from: classes13.dex */
public final class d68 implements t1u0.b {
    @Override // xsna.t1u0.b
    @NonNull
    public final bqx0 a(View view, @NonNull bqx0 bqx0Var, @NonNull t1u0.c cVar) {
        cVar.d = bqx0Var.a() + cVar.d;
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        boolean z = view.getLayoutDirection() == 1;
        int b = bqx0Var.b();
        int c = bqx0Var.c();
        int i = cVar.a + (z ? c : b);
        cVar.a = i;
        int i2 = cVar.c;
        if (!z) {
            b = c;
        }
        int i3 = i2 + b;
        cVar.c = i3;
        view.setPaddingRelative(i, cVar.b, i3, cVar.d);
        return bqx0Var;
    }
}
