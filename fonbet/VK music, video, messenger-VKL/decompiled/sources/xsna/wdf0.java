package xsna;

import androidx.compose.runtime.a;
import xsna.aef0;
import xsna.dai;
import xsna.kef0;

/* compiled from: RecommendedPlaylist.kt */
/* loaded from: classes.dex */
public final class wdf0 extends m2a<kef0, aef0, eef0> {
    public final fef0 b;

    /* compiled from: RecommendedPlaylist.kt */
    /* loaded from: classes16.dex */
    public static final class a implements izs<kef0.a, s3q0> {
        public final /* synthetic */ izs<aef0, s3q0> b;
        public final /* synthetic */ kef0 c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(izs<? super aef0, s3q0> izsVar, kef0 kef0Var) {
            this.b = izsVar;
            this.c = kef0Var;
        }

        @Override // xsna.izs
        public final s3q0 invoke(kef0.a aVar) {
            this.b.invoke(new aef0.d(this.c.b, aVar.a));
            return s3q0.a;
        }
    }

    /* compiled from: RecommendedPlaylist.kt */
    /* loaded from: classes16.dex */
    public static final class b implements izs<kef0.a, s3q0> {
        public final /* synthetic */ izs<aef0, s3q0> b;
        public final /* synthetic */ kef0 c;

        /* JADX WARN: Multi-variable type inference failed */
        public b(izs<? super aef0, s3q0> izsVar, kef0 kef0Var) {
            this.b = izsVar;
            this.c = kef0Var;
        }

        @Override // xsna.izs
        public final s3q0 invoke(kef0.a aVar) {
            this.b.invoke(new aef0.c(this.c.b, aVar.a));
            return s3q0.a;
        }
    }

    public wdf0(fef0 fef0Var) {
        super(fpf0.a(eef0.class));
        this.b = fef0Var;
    }

    /* JADX WARN: Type inference failed for: r9v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v19, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.m2a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void b(final a8a a8aVar, final kef0 kef0Var, final izs izsVar, final ksr ksrVar, final q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1160205937);
        if ((i & 48) == 0) {
            i2 = (M.J(kef0Var) ? 32 : 16) | i;
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
        if ((196608 & i) == 0) {
            i2 |= M.J(this) ? 131072 : 65536;
        }
        if (M.t(i2 & 1, (74897 & i2) != 74896)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1160205937, i2, -1, "com.vk.catalog.mvi.block.music.impl.recommended.RecommendedPlaylist.BlockView.ContentImpl (RecommendedPlaylist.kt:78)");
            }
            int i3 = i2 >> 9;
            this.b.a(ksrVar, M, i3 & 14);
            M.K(1733603197);
            dai.d dVar = (dai.d) kef0Var.l.getValue();
            int i4 = i2 & 896;
            boolean J = (i4 == 256) | M.J(kef0Var);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (J || x == c0012a) {
                x = new a(izsVar, kef0Var);
                M.R(x);
            }
            dVar.c((izs) x, M, 0);
            dai.c cVar = (dai.c) kef0Var.k.getValue();
            boolean J2 = (i4 == 256) | M.J(kef0Var);
            Object x2 = M.x();
            if (J2 || x2 == c0012a) {
                x2 = new com.vk.movika.tools.controls.seekbar.f(19, izsVar, kef0Var);
                M.R(x2);
            }
            cVar.c((gzs) x2, M, 0);
            dai.d dVar2 = (dai.d) kef0Var.m.getValue();
            boolean J3 = (i4 == 256) | M.J(kef0Var);
            Object x3 = M.x();
            if (J3 || x3 == c0012a) {
                x3 = new b(izsVar, kef0Var);
                M.R(x3);
            }
            dVar2.c((izs) x3, M, 0);
            dai.c a2 = kef0Var.f.a();
            boolean J4 = (i4 == 256) | M.J(kef0Var);
            Object x4 = M.x();
            if (J4 || x4 == c0012a) {
                x4 = new com.vk.movika.tools.controls.seekbar.g(17, izsVar, kef0Var);
                M.R(x4);
            }
            a2.c((gzs) x4, M, 0);
            M.j();
            cef0.e(kef0Var, q630Var, M, (i3 & 112) | ((i2 >> 3) & 14));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.l(new wzs() { // from class: xsna.vdf0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    wdf0.this.b(a8aVar, kef0Var, izsVar, ksrVar, q630Var, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            });
        }
    }
}
