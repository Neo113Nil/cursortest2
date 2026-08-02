package sg.bigo.ads.ag;

import android.app.Activity;
import androidx.annotation.NonNull;
import sg.bigo.ads.aa.d;
import sg.bigo.ads.ae.h;

/* loaded from: classes9.dex */
public class c extends sg.bigo.ads.t.c {
    private boolean K;

    public c(@NonNull Activity activity) {
        super(activity);
        this.K = false;
    }

    @Override // sg.bigo.ads.t.c
    public final void a(sg.bigo.ads.y.b bVar) {
        if (bVar instanceof sg.bigo.ads.aa.c) {
            ((sg.bigo.ads.aa.c) bVar).I = true;
            a aVar = new a(this.N, as(), this.K);
            ((sg.bigo.ads.t.c) this).I.I = bVar;
            aVar.E = bVar;
            aVar.X();
            return;
        }
        if (bVar instanceof d) {
            ((d) bVar).O = true;
            b bVar2 = new b(this.N, as(), this.K);
            ((sg.bigo.ads.t.c) this).I.I = bVar;
            bVar2.E = bVar;
            bVar2.X();
        }
    }

    @Override // sg.bigo.ads.t.c
    public final void au() {
        if (this.K) {
            return;
        }
        T t = this.A;
        if (t instanceof h) {
            this.K = true;
            ((h) t).P();
        }
    }
}
