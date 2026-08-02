package sg.bigo.ads.d;

import android.content.Context;
import sg.bigo.ads.api.AdBid;
import sg.bigo.ads.api.core.g;

/* loaded from: classes9.dex */
public final class a {

    /* renamed from: sg.bigo.ads.d.a$a, reason: collision with other inner class name */
    public static class C2474a implements AdBid {
        private final g a;
        private final sg.bigo.ads.api.core.b b;
        private final sg.bigo.ads.df.b c;
        private boolean d = false;
        private boolean e = false;

        public C2474a(g gVar, sg.bigo.ads.api.core.b bVar, sg.bigo.ads.df.b bVar2) {
            this.a = gVar;
            this.b = bVar;
            this.c = bVar2;
        }

        @Override // sg.bigo.ads.api.AdBid
        public final double getPrice() {
            return this.b.aj();
        }

        @Override // sg.bigo.ads.api.AdBid
        public final void notifyLoss(Double d, String str, int i) {
            if (this.e) {
                return;
            }
            this.e = true;
            if (d != null) {
                this.c.b("first_price", String.valueOf(d));
            }
            if (str != null) {
                this.c.b("first_bidder", str);
            }
            this.c.b("loss_reason", String.valueOf(i));
            sg.bigo.ads.bh.d.a(1, new Runnable() { // from class: sg.bigo.ads.df.b.4
                final /* synthetic */ Context a;
                final /* synthetic */ boolean b = false;

                public AnonymousClass4(Context context) {
                    r2 = context;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    b.this.b(r2, this.b);
                }
            });
            sg.bigo.ads.api.core.b bVar = this.b;
            sg.bigo.ads.da.b.a(bVar, bVar.ak(), d, str, i);
        }

        @Override // sg.bigo.ads.api.AdBid
        public final void notifyWin(Double d, String str) {
            if (this.d) {
                return;
            }
            this.d = true;
            if (d != null) {
                this.c.b("sec_price", String.valueOf(d));
            }
            if (str != null) {
                this.c.b("sec_bidder", str);
            }
            sg.bigo.ads.bh.d.a(1, new Runnable() { // from class: sg.bigo.ads.df.b.3
                final /* synthetic */ Context a;
                final /* synthetic */ boolean b = false;

                public AnonymousClass3(Context context) {
                    r2 = context;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    b.this.a(r2, this.b);
                }
            });
            sg.bigo.ads.api.core.b bVar = this.b;
            sg.bigo.ads.da.b.a(bVar, bVar.ak(), d, str);
            g gVar = this.a;
            sg.bigo.ads.cq.b.a().a("win", sg.bigo.ads.cq.a.a("win", gVar.b, gVar.c, gVar.a, Integer.valueOf(this.b.ak()), d == null ? null : String.valueOf(d), str, null));
        }
    }
}
