package xsna;

import android.os.Handler;
import android.os.Looper;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;

/* compiled from: NavigationTabsPreloaderImpl.kt */
/* loaded from: classes3.dex */
public final class mz50 {
    public static final long d = TimeUnit.SECONDS.toMillis(10);
    public final LinkedHashSet a;
    public final Handler b = new Handler(Looper.getMainLooper());
    public wc2 c;

    public mz50(LinkedHashSet linkedHashSet) {
        this.a = linkedHashSet;
    }

    public final void a() {
        wc2 wc2Var = this.c;
        if (wc2Var != null) {
            this.b.removeCallbacks(wc2Var);
        }
        this.c = null;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((lz50) it.next()).dispose();
        }
    }

    public final void b() {
        wc2 wc2Var = new wc2(this, 8);
        this.c = wc2Var;
        this.b.postDelayed(wc2Var, d);
    }
}
