package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CopyOnWriteArraySet;
import ru.yandex.taxi.map_common.map.TaxiMapView;
import ru.yandex.taxi.viewholder.b;

/* loaded from: classes5.dex */
public final class otg {
    public final xi00 a;
    public final ah00 b;
    public final sit c;
    public boolean f;
    public qt00 h;
    public final Handler d = new Handler(Looper.getMainLooper());
    public final oxe e = new oxe(12, this);
    public boolean g = true;
    public final mtg i = new mtg(this);
    public final ntg j = new ntg(0, this);

    public otg(xi00 xi00Var, ah00 ah00Var, sit sitVar) {
        this.a = xi00Var;
        this.b = ah00Var;
        this.c = sitVar;
    }

    public final void a(qt00 qt00Var) {
        this.h = qt00Var;
        this.d.removeCallbacksAndMessages(null);
        b bVar = (b) this.a;
        CopyOnWriteArraySet copyOnWriteArraySet = bVar.p;
        if (copyOnWriteArraySet.isEmpty()) {
            ((gh00) bVar.c).e(bVar.u);
        }
        copyOnWriteArraySet.add(this.j);
        ((gh00) this.b).e(this.i);
        ybf ybfVar = new ybf(14, this);
        sit sitVar = this.c;
        sitVar.a = ybfVar;
        sitVar.a(this.f);
    }

    public final void b() {
        Handler handler = this.d;
        oxe oxeVar = this.e;
        handler.removeCallbacks(oxeVar);
        handler.postDelayed(oxeVar, 300L);
        TaxiMapView h = ((gh00) this.b).h();
        if (h == null || !this.g) {
            return;
        }
        h.scaleIn();
    }

    public final void c() {
        this.h = null;
        this.f = false;
        this.c.a(false);
        b bVar = (b) this.a;
        CopyOnWriteArraySet copyOnWriteArraySet = bVar.p;
        copyOnWriteArraySet.remove(this.j);
        if (copyOnWriteArraySet.isEmpty()) {
            ((gh00) bVar.c).u(bVar.u);
        }
        gh00 gh00Var = (gh00) this.b;
        gh00Var.u(this.i);
        this.d.removeCallbacks(this.e);
        TaxiMapView h = gh00Var.h();
        if (h == null || !this.g) {
            return;
        }
        h.scaleIn();
    }
}
