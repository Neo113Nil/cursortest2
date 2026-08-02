package sg.bigo.ads.f;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.ad.interstitial.q;
import sg.bigo.ads.ai.o;

/* loaded from: classes9.dex */
public final class e {

    @NonNull
    public final a a;

    @Nullable
    private final o e;

    @Nullable
    private sg.bigo.ads.common.utils.o h;
    private long f = 0;
    private boolean g = false;
    public boolean c = false;
    public boolean d = false;
    public final int b = 16;

    public interface a {
        int a();

        void a(int i);

        int b();

        @Nullable
        c c();

        @Nullable
        q d();

        boolean e();
    }

    public e(@NonNull a aVar, @Nullable o oVar) {
        this.a = aVar;
        this.e = oVar;
    }

    private void e() {
        if (this.g) {
            return;
        }
        this.g = true;
        o oVar = this.e;
        int a2 = oVar != null ? oVar.a("playable_attr.playable_show_delay") : 0;
        this.f = a2 > 0 ? a2 * 1000 : 0L;
    }

    private boolean f() {
        c c;
        return (!a() || this.a.b() == -1 || (c = this.a.c()) == null || !c.a || c.b) ? false : true;
    }

    public final boolean a() {
        e();
        return this.f > 0;
    }

    public final void b() {
        if (this.c || this.d || !f() || this.a.a() != 0) {
            return;
        }
        sg.bigo.ads.common.utils.o oVar = this.h;
        if (oVar == null) {
            this.h = new sg.bigo.ads.common.utils.o(this.f) { // from class: sg.bigo.ads.f.e.1
                @Override // sg.bigo.ads.common.utils.o
                public final void a() {
                    c c;
                    e eVar = e.this;
                    if (eVar.c || eVar.d) {
                        return;
                    }
                    eVar.c = true;
                    if (eVar.a.a() == 0 && (c = eVar.a.c()) != null && c.b()) {
                        q d = eVar.a.d();
                        if (d != null) {
                            d.i = false;
                        }
                        eVar.a.a(eVar.b);
                    }
                }

                @Override // sg.bigo.ads.common.utils.o
                public final void a(long j) {
                }
            };
        } else if (oVar.j) {
            return;
        }
        this.h.c();
    }

    public final void c() {
        sg.bigo.ads.common.utils.o oVar = this.h;
        if (oVar == null || oVar.j || oVar.e()) {
            return;
        }
        this.h.d();
    }

    public final void d() {
        this.d = true;
        sg.bigo.ads.common.utils.o oVar = this.h;
        if (oVar != null) {
            oVar.b();
        }
    }
}
