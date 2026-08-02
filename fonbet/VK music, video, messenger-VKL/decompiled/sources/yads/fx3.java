package yads;

import android.view.View;
import android.webkit.WebView;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes10.dex */
public final class fx3 extends vx3 {
    public static final fx3 d = new fx3();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yads.vx3
    public final void a(boolean z) {
        Iterator it = Collections.unmodifiableCollection(rx3.c.a).iterator();
        while (it.hasNext()) {
            ka kaVar = ((ax3) it.next()).e;
            if (kaVar.b.get() != 0) {
                my3.a.a((WebView) kaVar.b.get(), "setState", z ? "foregrounded" : "backgrounded", kaVar.a);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yads.vx3
    public final boolean a() {
        Iterator it = Collections.unmodifiableCollection(rx3.c.b).iterator();
        while (it.hasNext()) {
            View view = (View) ((ax3) it.next()).d.get();
            if (view != null && view.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
