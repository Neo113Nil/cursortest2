package sg.bigo.ads.af;

import android.app.Activity;
import android.util.Pair;
import androidx.annotation.NonNull;
import sg.bigo.ads.ad.interstitial.AdCountDownButton;
import sg.bigo.ads.ae.c;
import sg.bigo.ads.ae.h;
import sg.bigo.ads.s.d;
import sg.bigo.ads.z.e;

/* loaded from: classes9.dex */
public class a extends d {
    private boolean R;
    private boolean S;

    public a(@NonNull Activity activity) {
        super(activity);
        this.R = false;
        this.S = false;
    }

    public static /* synthetic */ boolean a(a aVar) {
        aVar.S = true;
        return true;
    }

    private void av() {
        if (this.R) {
            return;
        }
        T t = this.A;
        if (t instanceof h) {
            this.R = true;
            ((h) t).P();
        }
    }

    @Override // sg.bigo.ads.s.d
    public final Pair<sg.bigo.ads.y.b, sg.bigo.ads.ad.interstitial.a> as() {
        sg.bigo.ads.y.b G = ((d) this).J.G();
        if (G == null) {
            return null;
        }
        Object bVar = G instanceof sg.bigo.ads.z.d ? new b(this.N, this) : G instanceof e ? new c(this.N, this) : null;
        if (bVar == null) {
            return null;
        }
        return new Pair<>(G, bVar);
    }

    @Override // sg.bigo.ads.s.d
    public final void at() {
        av();
    }

    @Override // sg.bigo.ads.s.d
    public final void au() {
        av();
    }

    @Override // sg.bigo.ads.s.d, sg.bigo.ads.ad.interstitial.a, sg.bigo.ads.ad.interstitial.r, sg.bigo.ads.ad.interstitial.i
    public final void h() {
        if (this.S) {
            return;
        }
        AdCountDownButton adCountDownButton = this.C;
        if (adCountDownButton != null && !adCountDownButton.c) {
            adCountDownButton.c();
        }
        sg.bigo.ads.ad.interstitial.a aVar = ((d) this).I;
        if (aVar instanceof c) {
            ((c) aVar).h();
        } else if (aVar instanceof b) {
            ((b) aVar).h();
        } else {
            super.h();
        }
    }

    @Override // sg.bigo.ads.s.d, sg.bigo.ads.ad.interstitial.a, sg.bigo.ads.ad.interstitial.r, sg.bigo.ads.ad.interstitial.i
    public final void j() {
        if (this.S) {
            return;
        }
        AdCountDownButton adCountDownButton = this.C;
        if (adCountDownButton != null && !adCountDownButton.c) {
            adCountDownButton.b();
        }
        sg.bigo.ads.ad.interstitial.a aVar = ((d) this).I;
        if (aVar instanceof c) {
            ((c) aVar).j();
        } else if (aVar instanceof b) {
            ((b) aVar).j();
        } else {
            super.j();
        }
    }

    @Override // sg.bigo.ads.s.d
    public final boolean a(boolean z, boolean z2) {
        boolean a = super.a(z, z2);
        if (!a || ((d) this).M) {
            return a;
        }
        if (!z2) {
            new sg.bigo.ads.ae.c(this.N).a(new c.a() { // from class: sg.bigo.ads.af.a.1
                @Override // sg.bigo.ads.ae.c.a
                public final void a() {
                    a.this.j();
                }

                @Override // sg.bigo.ads.ae.c.a
                public final void c() {
                    a.a(a.this);
                    a.this.af();
                }

                @Override // sg.bigo.ads.ae.c.a
                public final void d() {
                    a.this.h();
                }

                @Override // sg.bigo.ads.ae.c.a
                public final void b() {
                }
            });
        }
        return false;
    }
}
