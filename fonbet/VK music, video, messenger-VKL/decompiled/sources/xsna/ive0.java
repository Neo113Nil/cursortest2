package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.music.stickyplayer.presentation.components.radio.RadioPlayerSheetTab;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.cri;
import xsna.dt1;
import xsna.dz40;
import xsna.ive0;
import xsna.q630;

/* compiled from: RadioTabsSheet.kt */
/* loaded from: classes3.dex */
public final class ive0 {

    /* compiled from: RadioTabsSheet.kt */
    @b6l(c = "com.vk.music.stickyplayer.presentation.components.radio.RadioTabsSheetKt$RadioTabContent$1$1$1", f = "RadioTabsSheet.kt", l = {103}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ h17 $scaffoldState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h17 h17Var, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$scaffoldState = h17Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$scaffoldState, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                g07 g07Var = this.$scaffoldState.a;
                this.label = 1;
                if (g07Var.a(this) == coroutineSingletons) {
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

    /* compiled from: RadioTabsSheet.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RadioPlayerSheetTab.values().length];
            try {
                iArr[RadioPlayerSheetTab.QUEUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final col colVar, final h17 h17Var, final List list, final rg50 rg50Var, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1723350617);
        if ((i & 6) == 0) {
            i2 = (M.J(colVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(h17Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(list) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(rg50Var) ? 2048 : 1024;
        }
        int i3 = 0;
        int i4 = 1;
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            int i5 = -1;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1723350617, i2, -1, "com.vk.music.stickyplayer.presentation.components.radio.RadioTabContent (RadioTabsSheet.kt:91)");
            }
            Object x = M.x();
            Object obj = a.C0011a.a;
            if (x == obj) {
                x = bap.j(EmptyCoroutineContext.b, M);
                M.R(x);
            }
            final yvj yvjVar = (yvj) x;
            Iterator it = j5g.W0(new wow(list)).iterator();
            while (true) {
                ztw ztwVar = (ztw) it;
                if (ztwVar.b.hasNext()) {
                    final xtw xtwVar = (xtw) ztwVar.next();
                    if (b.$EnumSwitchMapping$0[((RadioPlayerSheetTab) xtwVar.b).ordinal()] != i4) {
                        throw alb0.c(-1717423626, M);
                    }
                    M.K(-1700452126);
                    q630 E = ahn.E(q630.a.a, "radiostationListTitle");
                    int i6 = rg50Var.getIntValue() == xtwVar.a ? 1 : i3;
                    String N = d370.N(R.string.radio_player_tab_queue, i3, M);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1951347017, 48, i5, "com.vk.music.stickyplayer.presentation.components.TabTitle.Companion.invoke (TabsSheet.kt:269)");
                    }
                    Object x2 = M.x();
                    if (x2 == obj) {
                        x2 = new otn0(N);
                        M.R(x2);
                    }
                    otn0 otn0Var = (otn0) x2;
                    ((zak0) otn0Var.b).setValue(N);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    boolean y = ((i2 & 7168) == 2048) | M.y(xtwVar) | M.y(yvjVar) | ((i2 & 112) == 32);
                    Object x3 = M.x();
                    if (y || x3 == obj) {
                        x3 = new gzs() { // from class: xsna.fve0
                            @Override // xsna.gzs
                            public final Object invoke() {
                                rg50.this.C(xtwVar.a);
                                myc0.h(yvjVar, null, null, new ive0.a(h17Var, null), 3);
                                return s3q0.a;
                            }
                        };
                        M.R(x3);
                    }
                    colVar.c(i6, (gzs) x3, E, otn0Var, null, null, null, M, ((i2 << 21) & 29360128) | 384, 112);
                    M.j();
                    i2 = i2;
                    i5 = -1;
                    obj = obj;
                    i3 = 0;
                    i4 = 1;
                } else if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.gve0
                @Override // xsna.wzs
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    ive0.a(col.this, h17Var, list, rg50Var, (androidx.compose.runtime.a) obj2, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(final h17 h17Var, final rg50 rg50Var, dz40.s sVar, q630 q630Var, jai jaiVar, androidx.compose.runtime.a aVar, int i) {
        jai jaiVar2;
        androidx.compose.runtime.f s;
        wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> w1kVar;
        androidx.compose.runtime.a M = aVar.M(-837368512);
        int c = M.c();
        int i2 = i | (M.J(h17Var) ? 4 : 2) | (M.J(q630Var) ? 2048 : 1024);
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-837368512, i2, -1, "com.vk.music.stickyplayer.presentation.components.radio.RadioTabsSheet (RadioTabsSheet.kt:37)");
            }
            final List list = sVar.a;
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, q630Var);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, a2, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c2, dVar);
            M.K(-1144676682);
            q630.a aVar3 = q630.a.a;
            qzn0.a(h17Var, ahn.E(s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4, 1, aVar3).g(new gcv(dt1.a.o)), "collapseTrackListButton"), M, i2 & 14);
            if (list.isEmpty()) {
                M.C(c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                s = M.s();
                if (s != null) {
                    w1kVar = new v4n(h17Var, rg50Var, sVar, q630Var, jaiVar, i);
                    s.d = w1kVar;
                }
                return;
            }
            vpu0.c(rg50Var.getIntValue(), kai.c(1451831383, new yzs() { // from class: xsna.hve0
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    col colVar = (col) obj;
                    androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if ((intValue & 6) == 0) {
                        intValue |= aVar4.J(colVar) ? 4 : 2;
                    }
                    if (aVar4.t(intValue & 1, (intValue & 19) != 18)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1451831383, intValue, -1, "com.vk.music.stickyplayer.presentation.components.radio.RadioTabsSheet.<anonymous>.<anonymous> (RadioTabsSheet.kt:70)");
                        }
                        ive0.a(colVar, h17.this, list, rg50Var, aVar4, intValue & 14);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar4.h();
                    }
                    return s3q0.a;
                }
            }, M), txj0.f(aVar3, 1.0f), l5g.j, false, kai.c(-2009750567, new jve0(rg50Var, h17Var), M), M, 1576368, 48);
            q630 d = txj0.d(aVar3, 1.0f);
            cp10 d2 = ja8.d(dt1.a.b, false);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c3 = qri.c(M, d);
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            k9q0.w(M, d2, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c3, dVar);
            jaiVar2 = jaiVar;
            jaiVar2.invoke(list.get(rg50Var.getIntValue()), M, 48);
            M.G();
            M.j();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            jaiVar2 = jaiVar;
            M.h();
        }
        s = M.s();
        if (s != null) {
            w1kVar = new w1k(h17Var, rg50Var, sVar, q630Var, jaiVar2, i);
            s.d = w1kVar;
        }
    }
}
