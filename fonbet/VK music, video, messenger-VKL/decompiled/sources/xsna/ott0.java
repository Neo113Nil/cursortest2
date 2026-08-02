package xsna;

import androidx.compose.runtime.a;
import com.vk.libvideo.design.compose.base.datacontent.presets.VideoMetaViewState;
import com.vk.libvideo.design.compose.base.placeholder.PlaceholderViewState;
import com.vk.libvideo.design.compose.base.preview.PreviewViewState;
import com.vk.libvideo.design.compose.video.videocard.VideoCardViewState;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.dai;

/* compiled from: VideosStackedListView.kt */
/* loaded from: classes.dex */
public final class ott0 extends m2a<rtt0, qtt0, vjs0> {
    public final xjs0 b;

    /* compiled from: VideosStackedListView.kt */
    /* loaded from: classes16.dex */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements gzs<Long> {
        public a(Object obj) {
            super(0, obj, qni0.class, "currentServerTimeMillis", "currentServerTimeMillis()J", 0);
        }

        @Override // xsna.gzs
        public final Long invoke() {
            return Long.valueOf(qni0.a());
        }
    }

    public ott0(hdt0 hdt0Var, x4o x4oVar) {
        super(fpf0.a(vjs0.class));
        this.b = new xjs0(hdt0Var, x4oVar);
    }

    @Override // xsna.m2a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void b(final a8a a8aVar, final rtt0 rtt0Var, final izs izsVar, final ksr ksrVar, q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        q630 q630Var2;
        q630 f;
        VideoMetaViewState c;
        VideoMetaViewState.a b;
        VideoMetaViewState.c a2;
        VideoCardViewState videoCardViewState = rtt0Var.c;
        androidx.compose.runtime.a M = aVar.M(-1580148423);
        if ((i & 48) == 0) {
            i2 = (M.J(rtt0Var) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(izsVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(ksrVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            q630Var2 = q630Var;
            i2 |= M.J(q630Var2) ? 16384 : 8192;
        } else {
            q630Var2 = q630Var;
        }
        if ((196608 & i) == 0) {
            i2 |= M.J(this) ? 131072 : 65536;
        }
        if (M.t(i2 & 1, (74897 & i2) != 74896)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1580148423, i2, -1, "com.vk.catalog.mvi.block.video.impl.video.stackedlist.VideosStackedListView.BlockView.ContentImpl (VideosStackedListView.kt:289)");
            }
            this.b.a(ksrVar, M, (i2 >> 9) & 14);
            boolean z = rtt0Var.d;
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z) {
                M.K(-1359728905);
                dai.c b2 = videoCardViewState.a().e().b();
                boolean z2 = ((i2 & 896) == 256) | ((i2 & 112) == 32);
                Object x = M.x();
                if (z2 || x == c0012a) {
                    x = new pk(22, izsVar, rtt0Var);
                    M.R(x);
                }
                b2.c((gzs) x, M, 0);
            } else {
                M.K(-1371878487);
            }
            M.j();
            VideoCardViewState.c c2 = videoCardViewState.c();
            dai.c b3 = c2 != null ? c2.b() : null;
            if (b3 == null) {
                M.K(-1359489555);
            } else {
                M.K(1895808148);
                boolean z3 = ((i2 & 112) == 32) | ((i2 & 896) == 256);
                Object x2 = M.x();
                if (z3 || x2 == c0012a) {
                    x2 = new qk(23, izsVar, rtt0Var);
                    M.R(x2);
                }
                b3.c((gzs) x2, M, 0);
            }
            M.j();
            PreviewViewState.l c3 = videoCardViewState.a().c();
            dai.c a3 = c3 != null ? c3.a() : null;
            if (a3 == null) {
                M.K(-1359323612);
            } else {
                M.K(1895813501);
                boolean z4 = ((i2 & 896) == 256) | ((i2 & 112) == 32);
                Object x3 = M.x();
                if (z4 || x3 == c0012a) {
                    x3 = new oe5(25, izsVar, rtt0Var);
                    M.R(x3);
                }
                a3.c((gzs) x3, M, 0);
            }
            M.j();
            VideoCardViewState.c c4 = videoCardViewState.c();
            dai.c a4 = (c4 == null || (c = c4.c()) == null || (b = c.b()) == null || (a2 = b.a()) == null) ? null : a2.a();
            if (a4 == null) {
                M.K(-1359126235);
            } else {
                M.K(1895819868);
                boolean z5 = ((i2 & 896) == 256) | ((i2 & 112) == 32);
                Object x4 = M.x();
                if (z5 || x4 == c0012a) {
                    x4 = new sk(28, izsVar, rtt0Var);
                    M.R(x4);
                }
                a4.c((gzs) x4, M, 0);
            }
            M.j();
            PlaceholderViewState a5 = videoCardViewState.a().a();
            zoi<PlaceholderViewState.Appearance> a6 = a5 != null ? a5.a() : null;
            if (a6 == null) {
                M.K(-1358948574);
            } else {
                M.K(1895825599);
                a6.c(videoCardViewState.a().e().d() ? PlaceholderViewState.Appearance.Overlay : PlaceholderViewState.Appearance.Neutral, M, 0);
            }
            M.j();
            f = txj0.f(q630Var2, 1.0f);
            q630 E = s200.E(f, 8, 15);
            qni0 qni0Var = qni0.a;
            boolean y = M.y(qni0Var);
            Object x5 = M.x();
            if (y || x5 == c0012a) {
                x5 = new a(qni0Var);
                M.R(x5);
            }
            gzs gzsVar = (gzs) ((fcy) x5);
            boolean z6 = ((i2 & 896) == 256) | ((i2 & 112) == 32);
            Object x6 = M.x();
            if (z6 || x6 == c0012a) {
                x6 = new uwi0(5, izsVar, rtt0Var);
                M.R(x6);
            }
            com.vk.libvideo.design.compose.video.videocard.a.d(videoCardViewState, v630.a(E, gzsVar, (izs) x6), M, 0, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            final q630 q630Var3 = q630Var2;
            s.l(new wzs() { // from class: xsna.ntt0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ott0.this.b(a8aVar, rtt0Var, izsVar, ksrVar, q630Var3, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            });
        }
    }
}
