package xsna;

import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.ave;
import xsna.cri;
import xsna.dt1;
import xsna.kve;
import xsna.mue;
import xsna.nue;
import xsna.q630;

/* compiled from: ClipsPlaylistsSmallFoldersList.kt */
/* loaded from: classes16.dex */
public final class ave {

    /* compiled from: ClipsPlaylistsSmallFoldersList.kt */
    @b6l(c = "com.vk.clips.playlists.folders.gridlist.ui.ClipsPlaylistsSmallFoldersListKt$PlaylistsRow$1$1", f = "ClipsPlaylistsSmallFoldersList.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ boolean $hasNext;
        final /* synthetic */ mtk0<Boolean> $isScrolledToEnd$delegate;
        final /* synthetic */ izs<nue, s3q0> $onAction;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(boolean z, izs<? super nue, s3q0> izsVar, mtk0<Boolean> mtk0Var, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$hasNext = z;
            this.$onAction = izsVar;
            this.$isScrolledToEnd$delegate = mtk0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$hasNext, this.$onAction, this.$isScrolledToEnd$delegate, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            if (this.$isScrolledToEnd$delegate.getValue().booleanValue() && this.$hasNext) {
                this.$onAction.invoke(nue.e.b);
            }
            return s3q0.a;
        }
    }

    /* compiled from: ClipsPlaylistsSmallFoldersList.kt */
    public static final class b implements gzs<s3q0> {
        public final /* synthetic */ izs<nue, s3q0> b;
        public final /* synthetic */ mue c;

        public b(izs izsVar, mue.a aVar) {
            this.b = izsVar;
            this.c = aVar;
        }

        @Override // xsna.gzs
        public final s3q0 invoke() {
            this.b.invoke(new nue.d(((mue.a) this.c).a));
            return s3q0.a;
        }
    }

    /* compiled from: LazyDsl.kt */
    public static final class c implements izs<Integer, Object> {
        public final /* synthetic */ ur0 b;
        public final /* synthetic */ wow c;

        public c(ur0 ur0Var, wow wowVar) {
            this.b = ur0Var;
            this.c = wowVar;
        }

        @Override // xsna.izs
        public final Object invoke(Integer num) {
            return this.b.invoke(this.c.b.get(num.intValue()));
        }
    }

    /* compiled from: LazyDsl.kt */
    public static final class d implements izs<Integer, Object> {
        public final /* synthetic */ wow b;

        public d(y8 y8Var, wow wowVar) {
            this.b = wowVar;
        }

        @Override // xsna.izs
        public final Object invoke(Integer num) {
            return qjg.a((mue) this.b.b.get(num.intValue()));
        }
    }

    /* compiled from: LazyDsl.kt */
    public static final class e implements zzs<ksy, Integer, androidx.compose.runtime.a, Integer, s3q0> {
        public final /* synthetic */ wow b;
        public final /* synthetic */ izs c;

        public e(wow wowVar, izs izsVar) {
            this.b = wowVar;
            this.c = izsVar;
        }

        @Override // xsna.zzs
        public final s3q0 invoke(ksy ksyVar, Integer num, androidx.compose.runtime.a aVar, Integer num2) {
            int i;
            ksy ksyVar2 = ksyVar;
            int intValue = num.intValue();
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue2 = num2.intValue();
            if ((intValue2 & 6) == 0) {
                i = (aVar2.J(ksyVar2) ? 4 : 2) | intValue2;
            } else {
                i = intValue2;
            }
            if ((intValue2 & 48) == 0) {
                i |= aVar2.o(intValue) ? 32 : 16;
            }
            if (aVar2.t(i & 1, (i & 147) != 146)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(802480018, i, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                }
                mue mueVar = (mue) this.b.b.get(intValue);
                aVar2.K(148517941);
                if (mueVar instanceof mue.a) {
                    aVar2.K(148565990);
                    String str = ((mue.a) mueVar).b;
                    izs izsVar = this.c;
                    boolean J = aVar2.J(izsVar) | aVar2.J(mueVar);
                    Object x = aVar2.x();
                    if (J || x == a.C0011a.a) {
                        x = new b(izsVar, (mue.a) mueVar);
                        aVar2.R(x);
                    }
                    yqe.b(384, aVar2, str, (gzs) x, m200.G(q630.a.a, IntrinsicSize.Max));
                } else {
                    aVar2.K(142576511);
                }
                aVar2.j();
                aVar2.j();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                aVar2.h();
            }
            return s3q0.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(kve.a.b bVar, izs<? super nue, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        izs<? super nue, s3q0> izsVar2;
        androidx.compose.runtime.a M = aVar.M(683135061);
        int i2 = (M.J(bVar) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(683135061, i2, -1, "com.vk.clips.playlists.folders.gridlist.ui.ClipsPlaylistsSmallFoldersList (ClipsPlaylistsSmallFoldersList.kt:36)");
            }
            List<T> list = ((wow) jk50.d(bVar.a, new wow(EmptyList.b), M, 0).getValue()).b;
            yzt0<Boolean> yzt0Var = bVar.c;
            Boolean bool = Boolean.FALSE;
            boolean booleanValue = ((Boolean) jk50.d(yzt0Var, bool, M, 48).getValue()).booleanValue();
            boolean booleanValue2 = ((Boolean) jk50.d(bVar.b, bool, M, 48).getValue()).booleanValue();
            boolean booleanValue3 = ((Boolean) jk50.d(bVar.e, bool, M, 48).getValue()).booleanValue();
            if (!booleanValue2 && list.size() == 1) {
                M.K(1722082603);
                c(i2 & 112, M, list, izsVar);
                M.j();
            } else if (booleanValue2 && list.size() == 1) {
                M.K(1722187135);
                d(izsVar, list, booleanValue3, M, (i2 >> 3) & 14);
                M.j();
            } else if (!list.isEmpty() || booleanValue2) {
                M.K(1722306423);
                izsVar2 = izsVar;
                b(booleanValue2, izsVar2, list, booleanValue3, booleanValue, M, i2 & 112);
                M.j();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                M.K(1722405995);
                M.j();
            }
            izsVar2 = izsVar;
            if (androidx.compose.runtime.b.d()) {
            }
        } else {
            izsVar2 = izsVar;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new vue(bVar, izsVar2, i, 0);
        }
    }

    public static final void b(final boolean z, final izs izsVar, final List list, final boolean z2, final boolean z3, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a M = aVar.M(-1331545);
        int i2 = i | (M.l(z) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.J(list) ? 256 : 128) | (M.l(z2) ? 2048 : 1024) | (M.l(z3) ? 16384 : 8192);
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1331545, i2, -1, "com.vk.clips.playlists.folders.gridlist.ui.PlaylistsRow (ClipsPlaylistsSmallFoldersList.kt:122)");
            }
            xvy a2 = zvy.a(0, 3, M);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = bbk0.b(new j70(a2, 25));
                M.R(x);
            }
            mtk0 mtk0Var = (mtk0) x;
            Boolean bool = (Boolean) mtk0Var.getValue();
            bool.getClass();
            int i3 = i2 & 57344;
            int i4 = i2 & 112;
            boolean z4 = (i3 == 16384) | (i4 == 32);
            Object x2 = M.x();
            if (z4 || x2 == c0012a) {
                x2 = new a(z3, izsVar, mtk0Var, null);
                M.R(x2);
            }
            bap.g(bool, (wzs) x2, M, 0);
            q630 t = n34.t(txj0.f(q630.a.a, 1.0f), dz5.I(0, 1, M, false), null);
            a.j g = androidx.compose.foundation.layout.a.g(10);
            float f = 16;
            u890 n = s200.n(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, f, 2);
            boolean z5 = ((i2 & 14) == 4) | ((i2 & 896) == 256) | (i4 == 32) | ((i2 & 7168) == 2048) | (i3 == 16384);
            Object x3 = M.x();
            if (z5 || x3 == c0012a) {
                izs izsVar2 = new izs() { // from class: xsna.wue
                    @Override // xsna.izs
                    public final Object invoke(Object obj) {
                        nvy nvyVar = (nvy) obj;
                        boolean z6 = z;
                        final List list2 = list;
                        final izs izsVar3 = izsVar;
                        if (z6) {
                            final boolean z7 = z2;
                            nvy.g(nvyVar, -1, null, new jai(-1528271831, new yzs() { // from class: xsna.zue
                                @Override // xsna.yzs
                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                    ksy ksyVar = (ksy) obj2;
                                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj3;
                                    int intValue = ((Integer) obj4).intValue();
                                    if ((intValue & 6) == 0) {
                                        intValue |= aVar2.J(ksyVar) ? 4 : 2;
                                    }
                                    if (aVar2.t(intValue & 1, (intValue & 19) != 18)) {
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.f(-1528271831, intValue, -1, "com.vk.clips.playlists.folders.gridlist.ui.PlaylistsRow.<anonymous>.<anonymous>.<anonymous> (ClipsPlaylistsSmallFoldersList.kt:142)");
                                        }
                                        List list3 = list2;
                                        boolean isEmpty = list3.isEmpty();
                                        boolean isEmpty2 = list3.isEmpty();
                                        boolean isEmpty3 = list3.isEmpty();
                                        q630 q630Var = q630.a.a;
                                        if (isEmpty3) {
                                            q630Var = ksyVar.a(q630Var);
                                        }
                                        q630 q630Var2 = q630Var;
                                        izs izsVar4 = izsVar3;
                                        boolean J = aVar2.J(izsVar4);
                                        Object x4 = aVar2.x();
                                        if (J || x4 == a.C0011a.a) {
                                            x4 = new zje(izsVar4, 2);
                                            aVar2.R(x4);
                                        }
                                        yqe.a((gzs) x4, isEmpty, z7, isEmpty2, q630Var2, aVar2, 0);
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.e();
                                        }
                                    } else {
                                        aVar2.h();
                                    }
                                    return s3q0.a;
                                }
                            }, true), 2);
                        }
                        wow wowVar = new wow(list2);
                        nvyVar.e(list2.size(), new ave.c(new ur0(11), wowVar), new ave.d(new y8(10), wowVar), new jai(802480018, new ave.e(wowVar, izsVar3), true));
                        if (z3) {
                            nvy.c(nvyVar, 2, null, zci.a, 6);
                        }
                        return s3q0.a;
                    }
                };
                M.R(izsVar2);
                x3 = izsVar2;
            }
            lqy.b(t, a2, n, g, null, null, false, null, (izs) x3, M, 24960, 488);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(z, izsVar, list, z2, z3, i) { // from class: xsna.xue
                public final /* synthetic */ boolean b;
                public final /* synthetic */ izs c;
                public final /* synthetic */ List d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ boolean f;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    ave.b(this.b, this.c, this.d, this.e, this.f, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void c(int i, androidx.compose.runtime.a aVar, List list, izs izsVar) {
        androidx.compose.runtime.a M = aVar.M(674263248);
        int i2 = (M.J(list) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(674263248, i2, -1, "com.vk.clips.playlists.folders.gridlist.ui.SmallNotOwnerPlaylistsRow (ClipsPlaylistsSmallFoldersList.kt:96)");
            }
            q630.a aVar2 = q630.a.a;
            float f = 16;
            q630 H = s200.H(txj0.f(aVar2, 1.0f), f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, f, 2);
            a.l lVar = androidx.compose.foundation.layout.a.a;
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(lVar, dt1.a.k, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, H);
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
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            Object Y = j5g.Y(new wow(list));
            mue.a aVar4 = Y instanceof mue.a ? (mue.a) Y : null;
            if (aVar4 == null) {
                M.K(-849520507);
            } else {
                M.K(-849520506);
                String str = aVar4.b;
                boolean J = ((i2 & 112) == 32) | M.J(aVar4);
                Object x = M.x();
                if (J || x == a.C0011a.a) {
                    x = new xq1(3, izsVar, aVar4);
                    M.R(x);
                }
                gzs gzsVar = (gzs) x;
                q630 G = m200.G(aVar2, IntrinsicSize.Max);
                if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                    szw.a("invalid weight; must be greater than zero");
                }
                yqe.b(0, M, str, gzsVar, defpackage.j0.d(1.0f, G, true));
            }
            M.j();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new fza(list, izsVar, i, 1);
        }
    }

    public static final void d(izs izsVar, List list, boolean z, androidx.compose.runtime.a aVar, int i) {
        int i2;
        boolean z2;
        androidx.compose.runtime.a M = aVar.M(-288467629);
        if ((i & 6) == 0) {
            i2 = (M.y(izsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            z2 = z;
            i2 |= M.l(z2) ? 256 : 128;
        } else {
            z2 = z;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-288467629, i2, -1, "com.vk.clips.playlists.folders.gridlist.ui.SmallOwnerPlaylistsRow (ClipsPlaylistsSmallFoldersList.kt:62)");
            }
            q630.a aVar2 = q630.a.a;
            float f = 16;
            q630 H = s200.H(txj0.f(aVar2, 1.0f), f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, f, 2);
            a.l lVar = androidx.compose.foundation.layout.a.a;
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(lVar, dt1.a.k, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, H);
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
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            int i3 = i2 & 14;
            boolean z3 = i3 == 4;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z3 || x == c0012a) {
                x = new yd1(izsVar, 2);
                M.R(x);
            }
            yqe.a((gzs) x, false, z2, false, aVar2, M, (i2 & 896) | 27696);
            f9t.e(txj0.v(aVar2, 10), M, 6);
            Object Y = j5g.Y(new wow(list));
            mue.a aVar4 = Y instanceof mue.a ? (mue.a) Y : null;
            if (aVar4 == null) {
                M.K(-2136199563);
            } else {
                M.K(-2136199562);
                String str = aVar4.b;
                boolean J = (i3 == 4) | M.J(aVar4);
                Object x2 = M.x();
                if (J || x2 == c0012a) {
                    x2 = new defpackage.u(6, izsVar, aVar4);
                    M.R(x2);
                }
                gzs gzsVar = (gzs) x2;
                q630 G = m200.G(aVar2, IntrinsicSize.Max);
                if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                    szw.a("invalid weight; must be greater than zero");
                }
                yqe.b(0, M, str, gzsVar, defpackage.j0.d(1.0f, G, true));
            }
            M.j();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new yue(i, 0, izsVar, list, z);
        }
    }
}
