package xsna;

import androidx.compose.runtime.a;
import com.vk.libvideo.design.compose.base.datacontent.presets.VideoMetaViewState;
import com.vk.libvideo.design.compose.video.videocard.VideoCardViewState;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.dai;

/* compiled from: AlbumsSliderView.kt */
/* loaded from: classes.dex */
public final class ar1 extends m2a<wq1, yc1, ei1> {

    /* compiled from: AlbumsSliderView.kt */
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

    public ar1() {
        super(fpf0.a(ei1.class));
    }

    @Override // xsna.m2a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void b(a8a a8aVar, wq1 wq1Var, izs izsVar, ksr ksrVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        q630 f;
        q630 b;
        VideoMetaViewState c;
        VideoMetaViewState.a a2;
        VideoMetaViewState c2;
        VideoMetaViewState.a b2;
        VideoCardViewState videoCardViewState = wq1Var.d;
        androidx.compose.runtime.a M = aVar.M(-1562231586);
        if ((i & 48) == 0) {
            i2 = (M.J(wq1Var) ? 32 : 16) | i;
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
            i2 |= M.J(q630Var) ? 16384 : 8192;
        }
        if (M.t(i2 & 1, (i2 & 9361) != 9360)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1562231586, i2, -1, "com.vk.catalog.mvi.block.video.impl.albums.AlbumsSliderView.BlockView.ContentImpl (AlbumsSliderView.kt:227)");
            }
            gi1.a(ksrVar, M, (i2 >> 9) & 14);
            videoCardViewState.d().c(wq1Var.f, M, 0);
            dai.c b3 = videoCardViewState.a().e().b();
            int i3 = i2 & 896;
            int i4 = i2 & 112;
            boolean z = (i3 == 256) | (i4 == 32);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new xq1(0, izsVar, wq1Var);
                M.R(x);
            }
            b3.c((gzs) x, M, 0);
            VideoCardViewState.c c3 = videoCardViewState.c();
            dai.c b4 = (c3 == null || (c2 = c3.c()) == null || (b2 = c2.b()) == null) ? null : b2.b();
            if (b4 == null) {
                M.K(-174967899);
            } else {
                M.K(1934018524);
                boolean z2 = (i3 == 256) | (i4 == 32);
                Object x2 = M.x();
                if (z2 || x2 == c0012a) {
                    x2 = new n0(4, izsVar, wq1Var);
                    M.R(x2);
                }
                b4.c((gzs) x2, M, 0);
            }
            M.j();
            VideoCardViewState.c c4 = videoCardViewState.c();
            dai.c b5 = (c4 == null || (c = c4.c()) == null || (a2 = c.a()) == null) ? null : a2.b();
            if (b5 == null) {
                M.K(-174782395);
            } else {
                M.K(1934024508);
                boolean z3 = (i3 == 256) | (i4 == 32);
                Object x3 = M.x();
                if (z3 || x3 == c0012a) {
                    x3 = new yq1(0, izsVar, wq1Var);
                    M.R(x3);
                }
                b5.c((gzs) x3, M, 0);
            }
            M.j();
            f = txj0.f(txj0.v(q630Var, wq1Var.g), 1.0f);
            qni0 qni0Var = qni0.a;
            boolean y = M.y(qni0Var);
            Object x4 = M.x();
            if (y || x4 == c0012a) {
                x4 = new a(qni0Var);
                M.R(x4);
            }
            gzs gzsVar = (gzs) ((fcy) x4);
            boolean z4 = (i3 == 256) | (i4 == 32);
            Object x5 = M.x();
            if (z4 || x5 == c0012a) {
                x5 = new defpackage.o(2, izsVar, wq1Var);
                M.R(x5);
            }
            q630 a3 = v630.a(f, gzsVar, (izs) x5);
            boolean z5 = i4 == 32;
            Object x6 = M.x();
            if (z5 || x6 == c0012a) {
                x6 = new h5(wq1Var, 5);
                M.R(x6);
            }
            b = egi0.b(a3, false, (izs) x6);
            com.vk.libvideo.design.compose.video.videocard.a.d(videoCardViewState, b, M, 0, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.l(new zq1(this, a8aVar, wq1Var, izsVar, ksrVar, q630Var, i, 0));
        }
    }
}
