package defpackage;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes10.dex */
public final class a130 {
    public final xg a;
    public final ViewGroup b;
    public final Set c;
    public final WeakHashMap d = new WeakHashMap();
    public int e;

    public a130(xg xgVar, ViewGroup viewGroup, Set set) {
        this.a = xgVar;
        this.b = viewGroup;
        this.c = set;
    }

    public final void a(FrameLayout frameLayout) {
        int i = this.e;
        if (i > 0) {
            this.e = i - 1;
        }
        if (this.e == 0) {
            this.a.c(frameLayout);
        }
    }
}
