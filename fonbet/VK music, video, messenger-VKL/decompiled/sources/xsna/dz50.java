package xsna;

import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.material.navigationrail.NavigationRailView;
import java.util.WeakHashMap;
import xsna.t1u0;

/* compiled from: NavigationRailView.java */
/* loaded from: classes13.dex */
public final class dz50 implements t1u0.b {
    public final /* synthetic */ NavigationRailView a;

    public dz50(NavigationRailView navigationRailView) {
        this.a = navigationRailView;
    }

    @Override // xsna.t1u0.b
    @NonNull
    public final bqx0 a(View view, @NonNull bqx0 bqx0Var, @NonNull t1u0.c cVar) {
        boolean fitsSystemWindows;
        boolean fitsSystemWindows2;
        boolean fitsSystemWindows3;
        h4x i = bqx0Var.a.i(519);
        NavigationRailView navigationRailView = this.a;
        Boolean bool = navigationRailView.i;
        if (bool != null) {
            fitsSystemWindows = bool.booleanValue();
        } else {
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            fitsSystemWindows = navigationRailView.getFitsSystemWindows();
        }
        if (fitsSystemWindows) {
            cVar.b += i.b;
        }
        Boolean bool2 = navigationRailView.j;
        if (bool2 != null) {
            fitsSystemWindows2 = bool2.booleanValue();
        } else {
            WeakHashMap<View, b0u0> weakHashMap2 = iut0.a;
            fitsSystemWindows2 = navigationRailView.getFitsSystemWindows();
        }
        if (fitsSystemWindows2) {
            cVar.d += i.d;
        }
        Boolean bool3 = navigationRailView.k;
        if (bool3 != null) {
            fitsSystemWindows3 = bool3.booleanValue();
        } else {
            WeakHashMap<View, b0u0> weakHashMap3 = iut0.a;
            fitsSystemWindows3 = navigationRailView.getFitsSystemWindows();
        }
        if (fitsSystemWindows3) {
            cVar.a += t1u0.d(view) ? i.c : i.a;
        }
        int i2 = cVar.a;
        int i3 = cVar.b;
        int i4 = cVar.c;
        int i5 = cVar.d;
        WeakHashMap<View, b0u0> weakHashMap4 = iut0.a;
        view.setPaddingRelative(i2, i3, i4, i5);
        return bqx0Var;
    }
}
