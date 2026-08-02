package xsna;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.vk.libvideo.design.compose.base.datacontent.presets.VideoMetaViewState;
import com.vk.libvideo.design.compose.base.preview.PreviewViewState;
import com.vk.libvideo.design.compose.video.videocard.VideoCardViewState;
import java.util.HashSet;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.dai;
import xsna.q630;

/* compiled from: VideoView.kt */
/* loaded from: classes.dex */
public final class cqt0 extends m2a<dqt0, awr0, vjs0> {
    public final xjs0 b;
    public final Object c;

    /* compiled from: VideoView.kt */
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

    public cqt0(hdt0 hdt0Var, x4o x4oVar) {
        super(fpf0.a(vjs0.class));
        this.b = new xjs0(hdt0Var, x4oVar);
        this.c = msy.a(LazyThreadSafetyMode.NONE, new lu2(14));
    }

    /* JADX WARN: Type inference failed for: r13v55, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.m2a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void b(a8a a8aVar, dqt0 dqt0Var, izs izsVar, ksr ksrVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        VideoMetaViewState c;
        VideoMetaViewState.a a2;
        VideoMetaViewState.c a3;
        VideoMetaViewState c2;
        VideoMetaViewState.a b;
        VideoMetaViewState.c a4;
        VideoMetaViewState c3;
        VideoMetaViewState.a a5;
        VideoMetaViewState c4;
        VideoMetaViewState.a b2;
        PreviewViewState.l c5;
        q020 e;
        l8s0 l8s0Var = dqt0Var.d;
        VideoCardViewState videoCardViewState = dqt0Var.c;
        androidx.compose.runtime.a M = aVar.M(1613411823);
        if ((i & 48) == 0) {
            i2 = (M.J(dqt0Var) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(izsVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(ksrVar) ? 2048 : 1024;
        }
        if ((196608 & i) == 0) {
            i2 |= M.J(this) ? 131072 : 65536;
        }
        if (M.t(i2 & 1, (66705 & i2) != 66704)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1613411823, i2, -1, "com.vk.catalog.mvi.block.video.impl.video.video.VideoView.BlockView.ContentImpl (VideoView.kt:219)");
            }
            this.b.a(ksrVar, M, (i2 >> 9) & 14);
            zoi<VideoCardViewState.Size> d = videoCardViewState.d();
            if (d == null) {
                M.K(172944103);
                M.j();
            } else {
                M.K(5578842);
                Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b());
                HashSet hashSet = iah0.a;
                d.c(fnj.d(context) ? VideoCardViewState.Size.Medium : l8s0Var.e, M, 0);
                M.j();
                s3q0 s3q0Var = s3q0.a;
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new bpf0();
                M.R(x);
            }
            bpf0 bpf0Var = (bpf0) x;
            PreviewViewState a6 = videoCardViewState.a();
            dai.c b3 = (a6 == null || (e = a6.e()) == null) ? null : e.b();
            if (b3 == null) {
                M.K(173323915);
                M.j();
            } else {
                M.K(5591094);
                boolean y = ((i2 & 112) == 32) | ((i2 & 896) == 256) | M.y(bpf0Var);
                Object x2 = M.x();
                if (y || x2 == c0012a) {
                    x2 = new x0o(izsVar, dqt0Var, bpf0Var, 5);
                    M.R(x2);
                }
                b3.c((gzs) x2, M, 0);
                M.j();
                s3q0 s3q0Var2 = s3q0.a;
            }
            PreviewViewState a7 = videoCardViewState.a();
            dai.c a8 = (a7 == null || (c5 = a7.c()) == null) ? null : c5.a();
            int i3 = 7;
            if (a8 == null) {
                M.K(173689560);
                M.j();
            } else {
                M.K(5602889);
                boolean y2 = ((i2 & 896) == 256) | ((i2 & 112) == 32) | M.y(bpf0Var);
                Object x3 = M.x();
                if (y2 || x3 == c0012a) {
                    x3 = new kk(izsVar, dqt0Var, bpf0Var, i3);
                    M.R(x3);
                }
                a8.c((gzs) x3, M, 0);
                M.j();
                s3q0 s3q0Var3 = s3q0.a;
            }
            VideoCardViewState.c c6 = videoCardViewState.c();
            dai.c b4 = (c6 == null || (c4 = c6.c()) == null || (b2 = c4.b()) == null) ? null : b2.b();
            int i4 = 6;
            if (b4 == null) {
                M.K(173930585);
                M.j();
            } else {
                M.K(5610664);
                boolean y3 = ((i2 & 896) == 256) | ((i2 & 112) == 32) | M.y(bpf0Var);
                Object x4 = M.x();
                if (y3 || x4 == c0012a) {
                    x4 = new j5q(izsVar, dqt0Var, bpf0Var, i4);
                    M.R(x4);
                }
                b4.c((gzs) x4, M, 0);
                M.j();
                s3q0 s3q0Var4 = s3q0.a;
            }
            VideoCardViewState.c c7 = videoCardViewState.c();
            dai.c b5 = (c7 == null || (c3 = c7.c()) == null || (a5 = c3.a()) == null) ? null : a5.b();
            if (b5 == null) {
                M.K(174175609);
                M.j();
            } else {
                M.K(5618568);
                boolean y4 = ((i2 & 896) == 256) | ((i2 & 112) == 32) | M.y(bpf0Var);
                Object x5 = M.x();
                if (y4 || x5 == c0012a) {
                    x5 = new bv3(izsVar, dqt0Var, bpf0Var, 7);
                    M.R(x5);
                }
                b5.c((gzs) x5, M, 0);
                M.j();
                s3q0 s3q0Var5 = s3q0.a;
            }
            VideoCardViewState.c c8 = videoCardViewState.c();
            dai.c a9 = (c8 == null || (c2 = c8.c()) == null || (b = c2.b()) == null || (a4 = b.a()) == null) ? null : a4.a();
            if (a9 == null) {
                M.K(174426585);
                M.j();
            } else {
                M.K(5626664);
                boolean y5 = ((i2 & 896) == 256) | ((i2 & 112) == 32) | M.y(bpf0Var);
                Object x6 = M.x();
                if (y5 || x6 == c0012a) {
                    x6 = new cv3(izsVar, dqt0Var, bpf0Var, 6);
                    M.R(x6);
                }
                a9.c((gzs) x6, M, 0);
                M.j();
                s3q0 s3q0Var6 = s3q0.a;
            }
            VideoCardViewState.c c9 = videoCardViewState.c();
            dai.c a10 = (c9 == null || (c = c9.c()) == null || (a2 = c.a()) == null || (a3 = a2.a()) == null) ? null : a3.a();
            if (a10 == null) {
                M.K(174682521);
                M.j();
            } else {
                M.K(5634920);
                boolean y6 = ((i2 & 896) == 256) | ((i2 & 112) == 32) | M.y(bpf0Var);
                Object x7 = M.x();
                if (y6 || x7 == c0012a) {
                    x7 = new com.vk.movika.sdk.base.logic.interactor.n(izsVar, dqt0Var, bpf0Var, 6);
                    M.R(x7);
                }
                a10.c((gzs) x7, M, 0);
                M.j();
                s3q0 s3q0Var7 = s3q0.a;
            }
            VideoCardViewState.c c10 = videoCardViewState.c();
            dai.c b6 = c10 != null ? c10.b() : null;
            if (b6 == null) {
                M.K(174898839);
                M.j();
            } else {
                M.K(5641898);
                boolean z = ((i2 & 896) == 256) | ((i2 & 112) == 32);
                Object x8 = M.x();
                if (z || x8 == c0012a) {
                    x8 = new t9b(22, izsVar, dqt0Var);
                    M.R(x8);
                }
                b6.c((gzs) x8, M, 0);
                M.j();
                s3q0 s3q0Var8 = s3q0.a;
            }
            VideoCardViewState.c c11 = videoCardViewState.c();
            dai.c a11 = c11 != null ? c11.a() : null;
            if (a11 == null) {
                M.K(175055668);
                M.j();
            } else {
                M.K(5646957);
                boolean z2 = ((i2 & 896) == 256) | ((i2 & 112) == 32);
                Object x9 = M.x();
                if (z2 || x9 == c0012a) {
                    x9 = new pk(21, izsVar, dqt0Var);
                    M.R(x9);
                }
                a11.c((gzs) x9, M, 0);
                M.j();
                s3q0 s3q0Var9 = s3q0.a;
            }
            M.K(175224123);
            float f = l8s0Var.a;
            q630 q630Var2 = q630.a.a;
            q630 v = txj0.v(q630Var2, f);
            if (((Boolean) this.c.getValue()).booleanValue()) {
                M.K(-48945635);
                boolean y7 = M.y(bpf0Var);
                Object x10 = M.x();
                if (y7 || x10 == c0012a) {
                    x10 = new ptl0(bpf0Var, 15);
                    M.R(x10);
                }
                q630Var2 = egi.o(q630Var2, (izs) x10);
                M.j();
            } else {
                M.K(-48748134);
                M.j();
            }
            q630 g = v.g(q630Var2);
            qni0 qni0Var = qni0.a;
            boolean y8 = M.y(qni0Var);
            Object x11 = M.x();
            if (y8 || x11 == c0012a) {
                x11 = new a(qni0Var);
                M.R(x11);
            }
            gzs gzsVar = (gzs) ((fcy) x11);
            boolean z3 = ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object x12 = M.x();
            if (z3 || x12 == c0012a) {
                x12 = new k22(28, izsVar, dqt0Var);
                M.R(x12);
            }
            com.vk.libvideo.design.compose.video.videocard.a.d(videoCardViewState, v630.a(g, gzsVar, (izs) x12), M, 0, 0);
            s3q0 s3q0Var10 = s3q0.a;
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.l(new kbo(this, a8aVar, dqt0Var, izsVar, ksrVar, q630Var, i, 1));
        }
    }
}
