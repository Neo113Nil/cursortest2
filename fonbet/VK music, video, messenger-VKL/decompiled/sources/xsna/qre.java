package xsna;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.clips.playlists.playlist_ui.model.OverlayViewState;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.yre;

/* compiled from: ClipsPlaylistUiOverlay.kt */
/* loaded from: classes16.dex */
public final class qre extends ame<yre, zqe> {
    public final xqi<yre.a<vre>> f;

    /* compiled from: ClipsPlaylistUiOverlay.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OverlayViewState.values().length];
            try {
                iArr[OverlayViewState.Gone.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OverlayViewState.DeletionDialog.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public qre(xqi xqiVar, bre breVar, Context context, boolean z) {
        super(context, breVar, z);
        this.f = xqiVar;
    }

    @Override // xsna.xpo0
    public final /* bridge */ /* synthetic */ void a(ao50 ao50Var, izs izsVar, androidx.compose.runtime.a aVar) {
        h((yre) ao50Var, izsVar, aVar, 512);
    }

    public final void g(gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-1185680513);
        int i2 = i | (M.y(gzsVar) ? 4 : 2) | (M.y(gzsVar2) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1185680513, i2, -1, "com.vk.clips.playlists.playlist_ui.ClipsPlaylistUiOverlay.DeletionDialog (ClipsPlaylistUiOverlay.kt:58)");
            }
            String N = d370.N(R.string.clips_playlist_delete_title, 0, M);
            String N2 = d370.N(R.string.clips_playlist_delete_subtitle, 0, M);
            String N3 = d370.N(R.string.clips_playlist_delete_accept_btn, 0, M);
            String N4 = d370.N(R.string.clips_playlist_delete_cancel_btn, 0, M);
            boolean z = (i2 & 112) == 32;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new pre(0, gzsVar2);
                M.R(x);
            }
            p7u0.e(N, N2, N3, (izs) x, gzsVar, null, N4, null, null, null, null, null, gzsVar2, M, (i2 << 12) & 57344, (i2 << 3) & 896, 4000);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new s0(i, 4, this, gzsVar, gzsVar2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(yre yreVar, izs<? super zqe, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1897748519);
        int i2 = (M.y(izsVar) ? 32 : 16) | i | (M.y(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 145) != 144)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1897748519, i2, -1, "com.vk.clips.playlists.playlist_ui.ClipsPlaylistUiOverlay.ThemedContent (ClipsPlaylistUiOverlay.kt:33)");
            }
            yre.a aVar2 = (yre.a) ((zak0) this.f.e).getValue();
            if ((aVar2 instanceof yre.a.c) || (aVar2 instanceof yre.a.b) || (aVar2 instanceof yre.a.d)) {
                M.K(1172004185);
                M.j();
            } else {
                if (!(aVar2 instanceof yre.a.C4132a)) {
                    throw alb0.c(-1624766863, M);
                }
                M.K(1172083390);
                wh50 d = jk50.d(((yre.a.C4132a) aVar2).i, OverlayViewState.Gone, M, 48);
                q630 d2 = txj0.d(q630.a.a, 1.0f);
                dt1.a.getClass();
                cp10 d3 = ja8.d(dt1.a.b, false);
                int hashCode = Long.hashCode(n34.n(M));
                sy90 D = M.D();
                q630 c = qri.c(M, d2);
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
                k9q0.w(M, d3, cri.a.f);
                k9q0.w(M, D, cri.a.e);
                k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
                k9q0.t(M, cri.a.h);
                k9q0.w(M, c, cri.a.d);
                int i3 = a.$EnumSwitchMapping$0[((OverlayViewState) d.getValue()).ordinal()];
                if (i3 == 1) {
                    M.K(316129856);
                    M.j();
                } else {
                    if (i3 != 2) {
                        throw alb0.c(841479849, M);
                    }
                    M.K(841483950);
                    int i4 = i2 & 112;
                    boolean z = i4 == 32;
                    Object x = M.x();
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (z || x == c0012a) {
                        x = new gr7(izsVar, 2);
                        M.R(x);
                    }
                    gzs<s3q0> gzsVar = (gzs) x;
                    boolean z2 = i4 == 32;
                    Object x2 = M.x();
                    if (z2 || x2 == c0012a) {
                        x2 = new zje(izsVar, 1);
                        M.R(x2);
                    }
                    g(gzsVar, (gzs) x2, M, (i2 & 896) | 512);
                    M.j();
                }
                M.G();
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ud0(i, 1, this, yreVar, izsVar);
        }
    }
}
