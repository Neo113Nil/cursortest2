package androidx.view;

import android.view.View;
import defpackage.vg10;
import kotlin.sequences.a;
import kotlin.sequences.b;

/* loaded from: classes10.dex */
public abstract class i {
    public static final d a(View view) {
        d dVar = (d) b.j(b.o(a.d(Navigation$findViewNavController$1.w, view), View.w));
        if (dVar != null) {
            return dVar;
        }
        vg10.p("View ", view, " does not have a NavController set");
        return null;
    }
}
