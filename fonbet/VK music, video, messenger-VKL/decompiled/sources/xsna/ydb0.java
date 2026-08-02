package xsna;

import android.view.View;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.video.playlist.playlistscreen.ui.entity.NotificationsState;
import java.util.WeakHashMap;
import xsna.cri;
import xsna.dt1;
import xsna.e3p0;
import xsna.q630;
import xsna.v6p0;
import xsna.yqx0;

/* compiled from: PlaylistScreenView.kt */
/* loaded from: classes6.dex */
public final class ydb0 {
    public static final void a(final bga bgaVar, final zdb0 zdb0Var, izs izsVar, final ksr ksrVar, q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        izs izsVar2;
        q630 q630Var2;
        boolean z = zdb0Var.g;
        androidx.compose.runtime.a M = aVar.M(-1713124612);
        int i2 = i | (M.J(bgaVar) ? 4 : 2) | (M.J(zdb0Var) ? 32 : 16) | (M.y(izsVar) ? 256 : 128) | 24576;
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1713124612, i2, -1, "com.vk.video.playlist.playlistscreen.ui.view.PlaylistScreenView (PlaylistScreenView.kt:40)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = yq.f(M);
            }
            dlv0 dlv0Var = (dlv0) x;
            x6p0 A = m200.A(M);
            final boolean z2 = z && (zdb0Var.b.a.e instanceof e3p0.a);
            boolean l = M.l(z2);
            Object x2 = M.x();
            if (l || x2 == c0012a) {
                x2 = new gzs() { // from class: xsna.tdb0
                    @Override // xsna.gzs
                    public final Object invoke() {
                        return Boolean.valueOf(!z2);
                    }
                };
                M.R(x2);
            }
            boolean z3 = z2;
            rmp a = v6p0.a.a(A, (gzs) x2, null, M, 196608, 28);
            Boolean valueOf = Boolean.valueOf(z);
            Boolean valueOf2 = Boolean.valueOf(z3);
            boolean l2 = M.l(z3) | M.J(A);
            int i3 = i2 & 112;
            boolean z4 = l2 | (i3 == 32);
            Object x3 = M.x();
            if (z4 || x3 == c0012a) {
                x3 = new wdb0(z3, A, zdb0Var, null);
                M.R(x3);
            }
            bap.f(valueOf, valueOf2, (wzs) x3, M, 0);
            NotificationsState notificationsState = zdb0Var.d;
            boolean z5 = i3 == 32;
            Object x4 = M.x();
            if (z5 || x4 == c0012a) {
                x4 = new xdb0(zdb0Var, dlv0Var, null);
                M.R(x4);
            }
            bap.g(notificationsState, (wzs) x4, M, 0);
            q630.a aVar2 = q630.a.a;
            q630 d = txj0.d(aVar2, 1.0f);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-282936756, 6, -1, "androidx.compose.foundation.layout.<get-systemBars> (WindowInsets.android.kt:184)");
            }
            WeakHashMap<View, yqx0> weakHashMap = yqx0.w;
            te2 te2Var = yqx0.a.c(M).g;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 y = tci.y(d, new h7z(te2Var, crx0.f | 32));
            dt1.a.getClass();
            cp10 d2 = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, y);
            cri.h7.getClass();
            LayoutNode.a aVar3 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar3);
            } else {
                M.f();
            }
            k9q0.w(M, d2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            q630 E = ahn.E(n34.t(txj0.d(aVar2, 1.0f), a.e, null), "video_playlist_root");
            long j = l5g.j;
            jai c2 = kai.c(-682564675, new kv7(zdb0Var, izsVar, a), M);
            jai c3 = kai.c(1659852667, new cqg(zdb0Var, dlv0Var, izsVar, 7), M);
            jai c4 = kai.c(-1547451502, new vk00(1, bgaVar, zdb0Var, ksrVar, izsVar), M);
            q630Var2 = aVar2;
            M = M;
            phv0.b(E, c2, null, c3, null, 0, j, 0L, c4, M, 817892400, 372);
            if (zdb0Var.e) {
                M.K(1178211300);
                int i4 = i2 & 896;
                boolean z6 = i4 == 256;
                Object x5 = M.x();
                if (z6 || x5 == c0012a) {
                    izsVar2 = izsVar;
                    x5 = new mv7(izsVar2, 7);
                    M.R(x5);
                } else {
                    izsVar2 = izsVar;
                }
                gzs gzsVar = (gzs) x5;
                boolean z7 = i4 == 256;
                Object x6 = M.x();
                if (z7 || x6 == c0012a) {
                    x6 = new uly(izsVar2, 1);
                    M.R(x6);
                }
                web0.a(gzsVar, (gzs) x6, M, 0);
            } else {
                izsVar2 = izsVar;
                M.K(1173793676);
            }
            M.j();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            izsVar2 = izsVar;
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            final izs izsVar3 = izsVar2;
            final q630 q630Var3 = q630Var2;
            s.d = new wzs(zdb0Var, izsVar3, ksrVar, q630Var3, i) { // from class: xsna.udb0
                public final /* synthetic */ zdb0 c;
                public final /* synthetic */ izs d;
                public final /* synthetic */ ksr e;
                public final /* synthetic */ q630 f;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(3073);
                    ydb0.a(bga.this, this.c, this.d, this.e, this.f, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }
}
