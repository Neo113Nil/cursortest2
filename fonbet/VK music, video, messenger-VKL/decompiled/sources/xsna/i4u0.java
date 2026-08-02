package xsna;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: ViewsToHideOnSeek.kt */
/* loaded from: classes3.dex */
public final class i4u0 {
    public final ArrayList a = new ArrayList();
    public boolean b;

    public final void a(boolean z) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (this.b ? ((View) next).isEnabled() : true) {
                arrayList.add(next);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            bwt0.p0((View) it2.next(), z);
        }
    }
}
