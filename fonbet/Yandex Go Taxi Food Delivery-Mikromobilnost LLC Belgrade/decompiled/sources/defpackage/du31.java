package defpackage;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.core.view.d;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes10.dex */
public class du31 {
    public Interpolator c;
    public eu31 d;
    public boolean e;
    public long b = -1;
    public final ytz0 f = new ytz0(this);
    public final ArrayList a = new ArrayList();

    public final void a() {
        if (this.e) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((d) it.next()).b();
            }
            this.e = false;
        }
    }

    public final void b() {
        View view;
        if (this.e) {
            return;
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            long j = this.b;
            if (j >= 0) {
                dVar.c(j);
            }
            Interpolator interpolator = this.c;
            if (interpolator != null && (view = (View) dVar.a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.d != null) {
                dVar.d(this.f);
            }
            View view2 = (View) dVar.a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.e = true;
    }
}
