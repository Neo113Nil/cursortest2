package xsna;

import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import xsna.h8z0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class oaz0 {
    public final e5z0 a;

    public oaz0(e5z0 e5z0Var) {
        this.a = e5z0Var;
    }

    public static boolean b(View view) {
        return view != null && view.getVisibility() == 0;
    }

    public final void a(ubz0 ubz0Var) {
        ViewGroup g = ubz0Var.g();
        if ((g != null ? g.getContext() : null) == null) {
            gu8.c(null, "NativeViewElementsTracker: can't tracking show elements, context is null ");
            return;
        }
        WeakReference weakReference = ubz0Var.n;
        boolean b = b(weakReference != null ? (View) weakReference.get() : null);
        WeakReference weakReference2 = ubz0Var.k;
        int i = (b ? 1 : 0) + (b(weakReference2 != null ? (View) weakReference2.get() : null) ? 2 : 0);
        WeakReference weakReference3 = ubz0Var.j;
        int i2 = i + (b(weakReference3 != null ? (View) weakReference3.get() : null) ? 4 : 0);
        WeakReference weakReference4 = ubz0Var.p;
        int i3 = i2 + (b(weakReference4 != null ? (View) weakReference4.get() : null) ? 8 : 0);
        WeakReference weakReference5 = ubz0Var.o;
        int i4 = i3 + (b(weakReference5 != null ? (View) weakReference5.get() : null) ? 16 : 0);
        WeakReference weakReference6 = ubz0Var.m;
        int i5 = i4 + (b(weakReference6 != null ? (View) weakReference6.get() : null) ? 32 : 0) + (b(ubz0Var.d()) ? 64 : 0) + (b(ubz0Var.e()) ? 128 : 0) + (b(ubz0Var.c()) ? 256 : 0);
        WeakReference weakReference7 = ubz0Var.i;
        int i6 = i5 + (b(weakReference7 != null ? (View) weakReference7.get() : null) ? 512 : 0);
        WeakReference weakReference8 = ubz0Var.l;
        int i7 = i6 + (b(weakReference8 != null ? (View) weakReference8.get() : null) ? 1024 : 0);
        WeakReference weakReference9 = ubz0Var.f;
        int i8 = i7 + (b(weakReference9 != null ? (View) weakReference9.get() : null) ? 2048 : 0);
        gu8.c(null, "NativeViewElementsTracker: visibleElementsBite is " + i8);
        HashMap hashMap = new HashMap();
        hashMap.put("args", Integer.toString(i8));
        b6z0 j = this.a.j("showElement");
        h8z0.a aVar = h8z0.a;
        if (aVar != null) {
            aVar.a(j, hashMap, 1, null);
        }
    }
}
