package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.libvideo.design.compose.video.videocell.VideoCellViewState;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.dai;

/* compiled from: AlbumsListView.kt */
/* loaded from: classes.dex */
public final class yo1 extends m2a<vo1, yc1, ei1> {

    /* compiled from: AlbumsListView.kt */
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

    public yo1() {
        super(fpf0.a(ei1.class));
    }

    @Override // xsna.m2a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void b(a8a a8aVar, vo1 vo1Var, izs izsVar, ksr ksrVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        q630 f;
        q630 b;
        boolean z = vo1Var.f;
        VideoCellViewState videoCellViewState = vo1Var.d;
        androidx.compose.runtime.a M = aVar.M(-698209072);
        if ((i & 48) == 0) {
            i2 = (M.J(vo1Var) ? 32 : 16) | i;
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
                androidx.compose.runtime.b.f(-698209072, i2, -1, "com.vk.catalog.mvi.block.video.impl.albums.AlbumsListView.BlockView.ContentImpl (AlbumsListView.kt:244)");
            }
            gi1.a(ksrVar, M, (i2 >> 9) & 14);
            VideoCellViewState.c a2 = videoCellViewState.a();
            dai.c a3 = a2 != null ? a2.a() : null;
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (a3 == null) {
                M.K(180495979);
            } else {
                M.K(-964008874);
                boolean z2 = ((i2 & 112) == 32) | ((i2 & 896) == 256);
                Object x = M.x();
                if (z2 || x == c0012a) {
                    x = new ge0(1, izsVar, vo1Var);
                    M.R(x);
                }
                a3.c((gzs) x, M, 0);
            }
            M.j();
            dai.c d = videoCellViewState.d();
            int i3 = i2 & 896;
            int i4 = i2 & 112;
            boolean z3 = (i3 == 256) | (i4 == 32);
            Object x2 = M.x();
            if (z3 || x2 == c0012a) {
                x2 = new wo1(0, izsVar, vo1Var);
                M.R(x2);
            }
            d.c((gzs) x2, M, 0);
            videoCellViewState.f().c(z ? VideoCellViewState.Size.Medium : VideoCellViewState.Size.Small, M, 0);
            VideoCellViewState.e e = videoCellViewState.e();
            zoi<q630> a4 = e != null ? e.a() : null;
            if (a4 == null) {
                M.K(180913084);
            } else {
                M.K(-963995419);
                a4.c(z ? s200.H(sfo.c(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11) : s200.H(sfo.c(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11), M, 0);
            }
            M.j();
            f = txj0.f(s200.E(videoCellViewState.e() != null ? q630Var.g(sfo.d(q630Var)) : q630Var, 12, 8), 1.0f);
            qni0 qni0Var = qni0.a;
            boolean y = M.y(qni0Var);
            Object x3 = M.x();
            if (y || x3 == c0012a) {
                x3 = new a(qni0Var);
                M.R(x3);
            }
            gzs gzsVar = (gzs) ((fcy) x3);
            boolean z4 = (i3 == 256) | (i4 == 32);
            Object x4 = M.x();
            if (z4 || x4 == c0012a) {
                x4 = new defpackage.b0(3, izsVar, vo1Var);
                M.R(x4);
            }
            q630 a5 = v630.a(f, gzsVar, (izs) x4);
            boolean z5 = i4 == 32;
            Object x5 = M.x();
            if (z5 || x5 == c0012a) {
                x5 = new v5(vo1Var, 5);
                M.R(x5);
            }
            b = egi0.b(a5, false, (izs) x5);
            com.vk.libvideo.design.compose.video.videocell.a.g(videoCellViewState, b, M, 0, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.l(new xo1(this, a8aVar, vo1Var, izsVar, ksrVar, q630Var, i, 0));
        }
    }
}
