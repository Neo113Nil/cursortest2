package xsna;

import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: FragmentTransitionImpl.java */
/* loaded from: classes12.dex */
public final class fds implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ ArrayList e;
    public final /* synthetic */ ArrayList f;

    public fds(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.b = i;
        this.c = arrayList;
        this.d = arrayList2;
        this.e = arrayList3;
        this.f = arrayList4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (int i = 0; i < this.b; i++) {
            View view = (View) this.c.get(i);
            String str = (String) this.d.get(i);
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            view.setTransitionName(str);
            ((View) this.e.get(i)).setTransitionName((String) this.f.get(i));
        }
    }
}
