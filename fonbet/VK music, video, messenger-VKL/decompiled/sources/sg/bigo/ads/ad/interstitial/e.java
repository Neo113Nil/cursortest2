package sg.bigo.ads.ad.interstitial;

/* loaded from: classes9.dex */
public class e {
    boolean a = false;
    a b;
    private sg.bigo.ads.common.utils.o c;

    public interface a {
        boolean a(Runnable runnable);
    }

    public final void a() {
        this.a = true;
        sg.bigo.ads.common.utils.o oVar = this.c;
        if (oVar != null) {
            oVar.b();
        }
    }

    public void b() {
        sg.bigo.ads.common.utils.o oVar;
        if (this.a || (oVar = this.c) == null || oVar.j) {
            return;
        }
        oVar.c();
    }

    public void c() {
        sg.bigo.ads.common.utils.o oVar;
        if (this.a || (oVar = this.c) == null || oVar.j) {
            return;
        }
        oVar.d();
    }

    public final void a(int i, final Runnable runnable) {
        sg.bigo.ads.common.utils.o oVar = this.c;
        if (oVar != null) {
            oVar.b();
        }
        this.a = false;
        sg.bigo.ads.common.utils.o oVar2 = new sg.bigo.ads.common.utils.o(i * 1000) { // from class: sg.bigo.ads.ad.interstitial.e.1
            @Override // sg.bigo.ads.common.utils.o
            public final void a() {
                Runnable runnable2;
                e eVar = e.this;
                if (eVar.a || (runnable2 = runnable) == null) {
                    return;
                }
                a aVar = eVar.b;
                if (aVar != null) {
                    aVar.a(runnable2);
                } else {
                    runnable2.run();
                }
            }

            @Override // sg.bigo.ads.common.utils.o
            public final void a(long j) {
            }
        };
        this.c = oVar2;
        oVar2.c();
    }
}
