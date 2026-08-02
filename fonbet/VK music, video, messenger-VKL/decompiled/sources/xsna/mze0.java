package xsna;

import android.content.Context;
import android.graphics.ColorMatrixColorFilter;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.im.Image;
import com.vk.im.reactions.impl.assets.ReactionAssetDrawable;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.cri;
import xsna.dt1;
import xsna.phw;
import xsna.q630;
import xsna.uze0;
import xsna.v5g;

/* compiled from: ReactedPeersModal.kt */
/* loaded from: classes2.dex */
public final class mze0 extends vpi {
    public static final /* synthetic */ int k1 = 0;
    public final zaw g1;
    public final tze0 h1;
    public final com.vk.im.reactions.impl.assets.a i1;
    public final float[] j1 = {0.33f, 0.33f, 0.33f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.33f, 0.33f, 0.33f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.33f, 0.33f, 0.33f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT};

    /* compiled from: Effects.kt */
    public static final class a implements kgn {
        public final /* synthetic */ io.reactivex.rxjava3.disposables.c a;

        public a(io.reactivex.rxjava3.disposables.c cVar) {
            this.a = cVar;
        }

        @Override // xsna.kgn
        public final void dispose() {
            this.a.dispose();
        }
    }

    /* compiled from: ReactedPeersModal.kt */
    @b6l(c = "com.vk.im.reactions.impl.reacted_peers.ReactedPeersModal$ReactedPeersContent$2$1", f = "ReactedPeersModal.kt", l = {172}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ List<dze0> $counters;
        final /* synthetic */ xvy $listState;
        final /* synthetic */ wh50<Integer> $selectedReactionId$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(xvy xvyVar, List<dze0> list, wh50<Integer> wh50Var, spj<? super b> spjVar) {
            super(2, spjVar);
            this.$listState = xvyVar;
            this.$counters = list;
            this.$selectedReactionId$delegate = wh50Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new b(this.$listState, this.$counters, this.$selectedReactionId$delegate, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((b) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                xvy xvyVar = this.$listState;
                List<dze0> list = this.$counters;
                wh50<Integer> wh50Var = this.$selectedReactionId$delegate;
                Iterator<T> it = list.iterator();
                int i2 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i2 = -1;
                        break;
                    }
                    Object next = it.next();
                    if (i2 < 0) {
                        e43.t();
                        throw null;
                    }
                    int i3 = ((dze0) next).b;
                    int i4 = mze0.k1;
                    if (i3 == wh50Var.getValue().intValue()) {
                        break;
                    }
                    i2++;
                }
                Integer valueOf = i2 != -1 ? Integer.valueOf(i2) : null;
                if (valueOf == null) {
                    return s3q0.a;
                }
                int intValue = valueOf.intValue();
                this.label = 1;
                fh9 fh9Var = xvy.y;
                if (xvyVar.k(intValue, 0, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            return s3q0.a;
        }
    }

    /* compiled from: Comparisons.kt */
    public static final class c<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return jw5.b(Integer.valueOf(((dze0) t2).a), Integer.valueOf(((dze0) t).a));
        }
    }

    public mze0(zaw zawVar, tze0 tze0Var) {
        this.g1 = zawVar;
        this.h1 = tze0Var;
        this.i1 = new com.vk.im.reactions.impl.assets.a(zawVar);
    }

    @Override // xsna.vpi
    public final void Zn(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(695559949);
        int i2 = (M.y(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(695559949, i2, -1, "com.vk.im.reactions.impl.reacted_peers.ReactedPeersModal.Content (ReactedPeersModal.kt:81)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = androidx.compose.runtime.k.b(uze0.b.a);
                M.R(x);
            }
            wh50 wh50Var = (wh50) x;
            boolean y = M.y(this);
            Object x2 = M.x();
            if (y || x2 == c0012a) {
                x2 = new nm1(23, this, wh50Var);
                M.R(x2);
            }
            bap.c(this.h1, (izs) x2, M, 0);
            rrv0.d(null, null, null, null, kai.c(1808050440, new q3h(2, this, wh50Var), M), M, 24576, 15);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new bh5(this, i, 10);
        }
    }

    public final void co(qtd0 qtd0Var, androidx.compose.runtime.a aVar, int i) {
        lg90 lg90Var;
        androidx.compose.runtime.a M = aVar.M(-1329369542);
        int i2 = (M.y(qtd0Var) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1329369542, i2, -1, "com.vk.im.reactions.impl.reacted_peers.ReactedPeersModal.PeerAvatar (ReactedPeersModal.kt:247)");
            }
            Image Bb = qtd0Var.C8().Bb(100, 100);
            efj efjVar = null;
            String str = Bb != null ? Bb.d : null;
            if (str == null) {
                M.K(645593161);
                M.j();
                lg90Var = null;
            } else {
                M.K(645593162);
                lg90 s = xus.s(str, 0L, M, 0, 2);
                M.j();
                lg90Var = s;
            }
            if (lg90Var == null) {
                M.K(645655471);
            } else {
                M.K(645655472);
                efjVar = phw.a.a(lg90Var, null, null, null, null, M, 196616, 30);
            }
            M.j();
            if (efjVar == null) {
                M.K(-1918834131);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                efjVar = v5g.a.a(ylu0Var.getImage().b, M);
            } else {
                M.K(-1918835278);
            }
            M.j();
            ldu0.b(efjVar, 28, null, null, null, false, null, null, null, M, 48, IronSourceError.ERROR_CODE_INIT_FAILED);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s2 = M.s();
        if (s2 != null) {
            s2.d = new q85(this, qtd0Var, i, 9);
        }
    }

    public final void eo(ArrayList arrayList, q630 q630Var, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(441339197);
        if ((i & 6) == 0) {
            i2 = (M.y(arrayList) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(izsVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.y(this) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(441339197, i2, -1, "com.vk.im.reactions.impl.reacted_peers.ReactedPeersModal.Peers (ReactedPeersModal.kt:191)");
            }
            q630 t = n34.t(q630Var, dz5.I(0, 1, M, false), null);
            boolean y = M.y(arrayList) | M.y(this) | ((i2 & 896) == 256);
            Object x = M.x();
            if (y || x == a.C0011a.a) {
                x = new sc5(arrayList, this, izsVar, 5);
                M.R(x);
            }
            lqy.a(t, null, null, null, null, null, false, null, (izs) x, M, 0, 510);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new iww(this, arrayList, q630Var, izsVar, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void fo(eze0 eze0Var, izs<? super Long, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-558441856);
        int i2 = i | (M.y(eze0Var) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.y(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-558441856, i2, -1, "com.vk.im.reactions.impl.reacted_peers.ReactedPeersModal.ReactedPeersContent (ReactedPeersModal.kt:159)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = qq.h(this.h1.a, M);
            }
            wh50 wh50Var = (wh50) x;
            xvy a2 = zvy.a(0, 3, M);
            boolean J = M.J(eze0Var);
            Object x2 = M.x();
            if (J || x2 == c0012a) {
                ArrayList arrayList = eze0Var.b;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (this.g1.d(((dze0) obj).b)) {
                        arrayList2.add(obj);
                    }
                }
                x2 = j5g.D0(new c(), arrayList2);
                M.R(x2);
            }
            List<dze0> list = (List) x2;
            if (list.size() > 1) {
                M.K(-2132437864);
                int intValue = ((Number) wh50Var.getValue()).intValue();
                Object x3 = M.x();
                if (x3 == c0012a) {
                    x3 = new bed0(1, wh50Var);
                    M.R(x3);
                }
                go(list, intValue, a2, (izs) x3, M, ((i2 << 6) & 57344) | 3072);
                M = M;
                s3q0 s3q0Var = s3q0.a;
                boolean J2 = M.J(a2) | M.y(list);
                Object x4 = M.x();
                if (J2 || x4 == c0012a) {
                    x4 = new b(a2, list, wh50Var, null);
                    M.R(x4);
                }
                bap.g(s3q0Var, (wzs) x4, M, 6);
            } else {
                M.K(-2140046814);
            }
            M.j();
            q630 f = txj0.f(txj0.c(q630.a.a, 1.0f), 1.0f);
            ArrayList arrayList3 = eze0Var.a;
            ArrayList arrayList4 = new ArrayList();
            for (Object obj2 : arrayList3) {
                hv30 hv30Var = (hv30) obj2;
                if (((Number) wh50Var.getValue()).intValue() == 0 || ((Number) wh50Var.getValue()).intValue() == hv30Var.a) {
                    arrayList4.add(obj2);
                }
            }
            int i3 = i2 << 3;
            eo(arrayList4, f, izsVar, M, (i3 & 896) | 48 | (i3 & 7168));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ss0(this, eze0Var, izsVar, i, 4);
        }
    }

    public final void go(final List<dze0> list, final int i, final xvy xvyVar, final izs<? super Integer, s3q0> izsVar, androidx.compose.runtime.a aVar, final int i2) {
        int i3;
        int i4;
        izs<? super Integer, s3q0> izsVar2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(1808983563);
        if ((i2 & 6) == 0) {
            i3 = (M.y(list) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 = i;
            i3 |= M.o(i4) ? 32 : 16;
        } else {
            i4 = i;
        }
        if ((i2 & 384) == 0) {
            i3 |= M.J(xvyVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            izsVar2 = izsVar;
            i3 |= M.y(izsVar2) ? 2048 : 1024;
        } else {
            izsVar2 = izsVar;
        }
        if ((i2 & 24576) == 0) {
            i3 |= M.y(this) ? 16384 : 8192;
        }
        int i5 = i3;
        if (M.t(i5 & 1, (i5 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1808983563, i5, -1, "com.vk.im.reactions.impl.reacted_peers.ReactedPeersModal.ReactedTabBar (ReactedPeersModal.kt:274)");
            }
            Iterator<T> it = list.iterator();
            int i6 = 0;
            while (it.hasNext()) {
                i6 += ((dze0) it.next()).a;
            }
            q630 E = s200.E(txj0.f(q630.a.a, 1.0f), 16, 8);
            boolean y = ((i5 & 7168) == 2048) | ((i5 & 112) == 32) | M.y(this) | M.o(i6) | M.y(list);
            Object x = M.x();
            if (y || x == a.C0011a.a) {
                final int i7 = i6;
                final int i8 = i4;
                final izs<? super Integer, s3q0> izsVar3 = izsVar2;
                izs izsVar4 = new izs() { // from class: xsna.fze0
                    @Override // xsna.izs
                    public final Object invoke(Object obj) {
                        nvy nvyVar = (nvy) obj;
                        final izs izsVar5 = izsVar3;
                        final int i9 = i8;
                        final mze0 mze0Var = this;
                        final int i10 = i7;
                        nvy.g(nvyVar, null, null, new jai(830663150, new yzs() { // from class: xsna.hze0
                            @Override // xsna.yzs
                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                long j;
                                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj3;
                                int intValue = ((Integer) obj4).intValue();
                                if (aVar3.t(intValue & 1, (intValue & 17) != 16)) {
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.f(830663150, intValue, -1, "com.vk.im.reactions.impl.reacted_peers.ReactedPeersModal.ReactedTabBar.<anonymous>.<anonymous>.<anonymous> (ReactedPeersModal.kt:283)");
                                    }
                                    aVar3.K(-596618336);
                                    float f = 8;
                                    uog0 b2 = vog0.b(f);
                                    q630.a aVar4 = q630.a.a;
                                    q630 d = rte0.d(aVar4, b2);
                                    String N = d370.N(R.string.im_msg_all_reactions_tab_name, 0, aVar3);
                                    izs izsVar6 = izs.this;
                                    boolean J = aVar3.J(izsVar6);
                                    Object x2 = aVar3.x();
                                    if (J || x2 == a.C0011a.a) {
                                        x2 = new ee1(izsVar6, 5);
                                        aVar3.R(x2);
                                    }
                                    q630 c2 = ojc.c(d, false, N, null, (gzs) x2, 13);
                                    int i11 = i9;
                                    if (i11 == 0) {
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                        }
                                        ylu0 ylu0Var = (ylu0) aVar3.r(rrv0.a);
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.e();
                                        }
                                        c2 = hr80.m(c2, ylu0Var.getBackground().z, androidx.compose.ui.graphics.e.a);
                                    }
                                    aVar3.j();
                                    q630 D = s200.D(c2, f);
                                    dt1.a.getClass();
                                    androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, aVar3, 48);
                                    int hashCode = Long.hashCode(n34.n(aVar3));
                                    sy90 D2 = aVar3.D();
                                    q630 c3 = qri.c(aVar3, D);
                                    cri.h7.getClass();
                                    LayoutNode.a aVar5 = cri.a.b;
                                    if (aVar3.N() == null) {
                                        n34.r();
                                        throw null;
                                    }
                                    aVar3.H();
                                    if (aVar3.L()) {
                                        aVar3.I(aVar5);
                                    } else {
                                        aVar3.f();
                                    }
                                    k9q0.w(aVar3, a2, cri.a.f);
                                    k9q0.w(aVar3, D2, cri.a.e);
                                    k9q0.w(aVar3, Integer.valueOf(hashCode), cri.a.g);
                                    k9q0.t(aVar3, cri.a.h);
                                    k9q0.w(aVar3, c3, cri.a.d);
                                    if (i11 == 0) {
                                        aVar3.K(1594411805);
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                        }
                                        ylu0 ylu0Var2 = (ylu0) aVar3.r(rrv0.a);
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.e();
                                        }
                                        j = ylu0Var2.getText().m;
                                    } else {
                                        aVar3.K(1594412988);
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                        }
                                        ylu0 ylu0Var3 = (ylu0) aVar3.r(rrv0.a);
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.e();
                                        }
                                        j = ylu0Var3.getIcon().f;
                                    }
                                    aVar3.j();
                                    yqv0.c(mze0Var.getString(R.string.im_reacted_peers_all), s200.H(aVar4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11), j, null, null, 0, 0, null, 0, false, 0, 0, null, wlb0.l(aVar3).M, aVar3, 48, 0, 8184);
                                    yqv0.c(String.valueOf(i10), null, wlb0.h(aVar3).getIcon().f, null, null, 0, 0, null, 0, false, 0, 0, null, wlb0.l(aVar3).h0, aVar3, 0, 0, 8186);
                                    aVar3.G();
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                } else {
                                    aVar3.h();
                                }
                                return s3q0.a;
                            }
                        }, true), 3);
                        for (final dze0 dze0Var : list) {
                            nvy.g(nvyVar, null, null, new jai(1733757511, new yzs() { // from class: xsna.ize0
                                @Override // xsna.yzs
                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                    androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj3;
                                    int intValue = ((Integer) obj4).intValue();
                                    if (aVar3.t(intValue & 1, (intValue & 17) != 16)) {
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.f(1733757511, intValue, -1, "com.vk.im.reactions.impl.reacted_peers.ReactedPeersModal.ReactedTabBar.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ReactedPeersModal.kt:312)");
                                        }
                                        aVar3.K(-306319417);
                                        float f = 8;
                                        q630 d = rte0.d(s200.H(q630.a.a, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), vog0.b(f));
                                        final mze0 mze0Var2 = mze0.this;
                                        zaw zawVar = mze0Var2.g1;
                                        Context requireContext = mze0Var2.requireContext();
                                        final dze0 dze0Var2 = dze0Var;
                                        String O = d370.O(R.string.im_msg_reaction_tab_name, new Object[]{zawVar.c(dze0Var2.b, requireContext)}, aVar3);
                                        Object obj5 = izsVar5;
                                        boolean J = aVar3.J(obj5) | aVar3.y(dze0Var2);
                                        Object x2 = aVar3.x();
                                        if (J || x2 == a.C0011a.a) {
                                            x2 = new com.vk.newsfeed.common.recycler.holders.attachments.a(28, obj5, dze0Var2);
                                            aVar3.R(x2);
                                        }
                                        q630 c2 = ojc.c(d, false, O, null, (gzs) x2, 13);
                                        int i11 = dze0Var2.b;
                                        final int i12 = i9;
                                        if (i12 == i11) {
                                            if (androidx.compose.runtime.b.d()) {
                                                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                            }
                                            ylu0 ylu0Var = (ylu0) aVar3.r(rrv0.a);
                                            if (androidx.compose.runtime.b.d()) {
                                                androidx.compose.runtime.b.e();
                                            }
                                            c2 = hr80.m(c2, ylu0Var.getBackground().z, androidx.compose.ui.graphics.e.a);
                                        }
                                        aVar3.j();
                                        q630 D = s200.D(c2, f);
                                        dt1.a.getClass();
                                        androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, aVar3, 48);
                                        int hashCode = Long.hashCode(n34.n(aVar3));
                                        sy90 D2 = aVar3.D();
                                        q630 c3 = qri.c(aVar3, D);
                                        cri.h7.getClass();
                                        LayoutNode.a aVar4 = cri.a.b;
                                        if (aVar3.N() == null) {
                                            n34.r();
                                            throw null;
                                        }
                                        aVar3.H();
                                        if (aVar3.L()) {
                                            aVar3.I(aVar4);
                                        } else {
                                            aVar3.f();
                                        }
                                        k9q0.w(aVar3, a2, cri.a.f);
                                        k9q0.w(aVar3, D2, cri.a.e);
                                        k9q0.w(aVar3, Integer.valueOf(hashCode), cri.a.g);
                                        k9q0.t(aVar3, cri.a.h);
                                        k9q0.w(aVar3, c3, cri.a.d);
                                        mze0Var2.ho(dze0Var2.b, iah0.a(20), kai.c(802441556, new yzs() { // from class: xsna.jze0
                                            @Override // xsna.yzs
                                            public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                                w6g w6gVar;
                                                lg90 lg90Var = (lg90) obj6;
                                                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj7;
                                                int intValue2 = ((Integer) obj8).intValue();
                                                if ((intValue2 & 6) == 0) {
                                                    intValue2 |= (intValue2 & 8) == 0 ? aVar5.J(lg90Var) : aVar5.y(lg90Var) ? 4 : 2;
                                                }
                                                if (aVar5.t(intValue2 & 1, (intValue2 & 19) != 18)) {
                                                    if (androidx.compose.runtime.b.d()) {
                                                        androidx.compose.runtime.b.f(802441556, intValue2, -1, "com.vk.im.reactions.impl.reacted_peers.ReactedPeersModal.ReactedTabBar.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ReactedPeersModal.kt:334)");
                                                    }
                                                    q630 q = txj0.q(s200.H(q630.a.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11), 20);
                                                    if (i12 != dze0Var2.b) {
                                                        float[] fArr = mze0Var2.j1;
                                                        w6gVar = new w6g(fArr, new ColorMatrixColorFilter(fArr));
                                                    } else {
                                                        w6gVar = null;
                                                    }
                                                    vjw.a(lg90Var, null, q, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, w6gVar, aVar5, 440 | (intValue2 & 14), 56);
                                                    if (androidx.compose.runtime.b.d()) {
                                                        androidx.compose.runtime.b.e();
                                                    }
                                                } else {
                                                    aVar5.h();
                                                }
                                                return s3q0.a;
                                            }
                                        }, aVar3), aVar3, 384);
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                        }
                                        ylu0 ylu0Var2 = (ylu0) aVar3.r(rrv0.a);
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.e();
                                        }
                                        long j = ylu0Var2.getIcon().f;
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                                        }
                                        wuv0 wuv0Var = (wuv0) aVar3.r(rrv0.c);
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.e();
                                        }
                                        yqv0.c(String.valueOf(dze0Var2.a), null, j, null, null, 0, 0, null, 0, false, 0, 0, null, wuv0Var.h0, aVar3, 0, 0, 8186);
                                        aVar3.G();
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.e();
                                        }
                                    } else {
                                        aVar3.h();
                                    }
                                    return s3q0.a;
                                }
                            }, true), 3);
                        }
                        return s3q0.a;
                    }
                };
                M.R(izsVar4);
                x = izsVar4;
            }
            aVar2 = M;
            lqy.b(E, xvyVar, null, null, null, null, false, null, (izs) x, aVar2, ((i5 >> 3) & 112) | 6, IronSourceError.ERROR_CODE_INIT_FAILED);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.gze0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    mze0.this.go(list, i, xvyVar, izsVar, (androidx.compose.runtime.a) obj, ne7.I(i2 | 1));
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [androidx.compose.runtime.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [xsna.jai] */
    public final void ho(int i, int i2, jai jaiVar, androidx.compose.runtime.a aVar, int i3) {
        jai jaiVar2;
        ?? M = aVar.M(860825651);
        int i4 = i3 | (M.o(i) ? 4 : 2) | (M.o(i2) ? 32 : 16) | (M.y(this) ? 2048 : 1024);
        if (M.t(i4 & 1, (i4 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(860825651, i4, -1, "com.vk.im.reactions.impl.reacted_peers.ReactedPeersModal.ReactionAsset (ReactedPeersModal.kt:360)");
            }
            Object x = M.x();
            Object obj = a.C0011a.a;
            if (x == obj) {
                x = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x);
            }
            wh50 wh50Var = (wh50) x;
            int i5 = ((i4 >> 6) & 112) | (i4 & 14);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2042801763, i5, -1, "com.vk.im.reactions.impl.reacted_peers.ReactedPeersModal.rememberDisposable (ReactedPeersModal.kt:379)");
            }
            int i6 = i5 & 14;
            boolean z = ((i6 ^ 6) > 4 && M.o(i)) || (i5 & 6) == 4;
            Object x2 = M.x();
            if (z || x2 == obj) {
                x2 = new io.reactivex.rxjava3.disposables.b();
                M.R(x2);
            }
            io.reactivex.rxjava3.disposables.b bVar = (io.reactivex.rxjava3.disposables.b) x2;
            Integer valueOf = Integer.valueOf(i);
            boolean y = M.y(bVar);
            Object x3 = M.x();
            if (y || x3 == obj) {
                x3 = new b8e0(bVar, 1);
                M.R(x3);
            }
            bap.c(valueOf, (izs) x3, M, i6);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            Object x4 = M.x();
            if (x4 == obj) {
                x4 = com.vk.im.reactions.impl.assets.a.b(this.i1, requireContext(), i, i2, new s26(2, wh50Var), bVar, false, 32);
                M.R(x4);
            }
            ReactionAssetDrawable reactionAssetDrawable = (ReactionAssetDrawable) x4;
            M.W(-1675217165, wh50Var.getValue());
            Object x5 = M.x();
            if (x5 == obj) {
                x5 = new zjo(reactionAssetDrawable);
                M.R(x5);
            }
            ?? r4 = jaiVar;
            r4.invoke((zjo) x5, M, 54);
            M.a0();
            jaiVar2 = r4;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
                jaiVar2 = r4;
            }
        } else {
            jaiVar2 = jaiVar;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new kze0(this, i, i2, jaiVar2, i3);
        }
    }
}
