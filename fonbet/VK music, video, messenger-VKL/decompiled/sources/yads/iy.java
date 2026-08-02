package yads;

import android.view.View;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public final class iy implements gf {
    public final List a;

    public iy(List list) {
        this.a = list;
    }

    @Override // yads.gf
    public final void a(View view) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((gf) it.next()).a(view);
        }
    }

    @Override // yads.gf
    public final void cancel() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((gf) it.next()).cancel();
        }
    }
}
