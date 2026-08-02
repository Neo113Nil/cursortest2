package xsna;

import com.vk.music.player.playback.PlayableType;
import com.vk.music.snippet.player.analytics.model.MusicLongtapOpenType;
import xsna.k840;
import xsna.ry40;

/* compiled from: LongtapSnippetAnalyticsManager.kt */
/* loaded from: classes3.dex */
public final class h600 extends tn6 {
    public final ex40 b;
    public final ca50 c;
    public final kq01 d = new kq01();

    public h600(dx40 dx40Var, ca50 ca50Var) {
        this.b = dx40Var;
        this.c = ca50Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.tn6
    public final void a(v0q<? extends kw40> v0qVar) {
        i600 i600Var;
        boolean z = v0qVar instanceof ry40.e.b;
        kq01 kq01Var = this.d;
        ex40 ex40Var = this.b;
        ca50 ca50Var = this.c;
        if (z) {
            ry40.e.b bVar = (ry40.e.b) v0qVar;
            p4b0 p4b0Var = bVar.c;
            ca50Var.a(p4b0Var.b.a, PlayableType.SNIPPET);
            s750 s750Var = k840.a.e;
            if (s750Var == null) {
                s750Var = null;
            }
            en40 n = kq01.n(kq01Var, p4b0Var.b.a, an10.b(ex40Var.C()));
            long j = bVar.e.a.a;
            jx4 jx4Var = this.a;
            i600 i600Var2 = jx4Var instanceof i600 ? (i600) jx4Var : null;
            if (i600Var2 == null || !i600Var2.e) {
                j += jx4Var.b();
            }
            int b = an10.b(j / 1000.0f);
            long j2 = ((ry40.e.b) v0qVar).e.a.a;
            jx4 jx4Var2 = this.a;
            i600Var = jx4Var2 instanceof i600 ? (i600) jx4Var2 : null;
            if (i600Var != null && i600Var.e) {
                j2 -= jx4Var2.b();
            }
            s750Var.S0(n, b, (an10.b(((float) j2) / 1000.0f) > 0 ? MusicLongtapOpenType.REOPEN_LONGTAP : MusicLongtapOpenType.OPEN_LONGTAP).name());
            return;
        }
        if ((v0qVar instanceof ry40.d) || (v0qVar instanceof ry40.f)) {
            ca50Var.d();
            s750 s750Var2 = k840.a.e;
            if (s750Var2 == null) {
                s750Var2 = null;
            }
            en40 n2 = kq01.n(kq01Var, ((ry40) v0qVar).c.b.a, an10.b(ex40Var.C()));
            long j3 = v0qVar.a().a.a;
            jx4 jx4Var3 = this.a;
            i600 i600Var3 = jx4Var3 instanceof i600 ? (i600) jx4Var3 : null;
            if (i600Var3 == null || !i600Var3.e) {
                j3 += jx4Var3.b();
            }
            int b2 = an10.b(j3 / 1000.0f);
            long j4 = v0qVar.a().a.a;
            jx4 jx4Var4 = this.a;
            i600Var = jx4Var4 instanceof i600 ? (i600) jx4Var4 : null;
            if (i600Var != null && i600Var.e) {
                j4 -= jx4Var4.b();
            }
            s750Var2.P0(n2, b2, an10.b(j4 / 1000.0f), "CLOSE_APP");
        }
    }

    @Override // xsna.tn6
    public final void b(ry40 ry40Var) {
        if (ry40Var instanceof ry40.e.a) {
            this.c.b();
        }
    }
}
