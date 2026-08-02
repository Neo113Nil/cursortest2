package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.music.stickyplayer.presentation.components.BigPlayerBottomSheetValue;
import com.vk.music.stickyplayer.presentation.components.ParentBottomSheetState;
import com.vk.music.stickyplayer.presentation.components.PlayerSheetTab;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.cri;
import xsna.dt1;
import xsna.dz40;
import xsna.q630;
import xsna.sx40;

/* compiled from: TabsSheet.kt */
/* loaded from: classes3.dex */
public final class qzn0 {

    /* compiled from: TabsSheet.kt */
    @b6l(c = "com.vk.music.stickyplayer.presentation.components.TabsSheetKt$TabContent$1$1$1", f = "TabsSheet.kt", l = {191}, m = "invokeSuspend")
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

    /* compiled from: TabsSheet.kt */
    @b6l(c = "com.vk.music.stickyplayer.presentation.components.TabsSheetKt$TabContent$2$1$1", f = "TabsSheet.kt", l = {Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ h17 $scaffoldState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(h17 h17Var, spj<? super b> spjVar) {
            super(2, spjVar);
            this.$scaffoldState = h17Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new b(this.$scaffoldState, spjVar);
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

    /* compiled from: TabsSheet.kt */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PlayerSheetTab.values().length];
            try {
                iArr[PlayerSheetTab.QUEUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PlayerSheetTab.LYRICS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void a(h17 h17Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1374973093);
        if ((i & 6) == 0) {
            i2 = (M.J(h17Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (M.J(q630Var) ? 32 : 16);
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1374973093, i3, -1, "com.vk.music.stickyplayer.presentation.components.BottomSheetTongue (TabsSheet.kt:323)");
            }
            String N = d370.N(R.string.music_talkback_player_open_play_queue, 0, M);
            q630 a2 = o19.a(txj0.h(txj0.v(q630Var, 36), 5), f17.e(h17Var));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 m = hr80.m(a2, ylu0Var.getIcon().o, vog0.b(7));
            boolean J = M.J(N);
            Object x = M.x();
            if (J || x == a.C0011a.a) {
                x = new hkv(N, 1);
                M.R(x);
            }
            f9t.e(egi0.b(m, false, (izs) x), M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new b220(h17Var, q630Var, i, 3);
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public static final void b(xsna.col r30, xsna.h17 r31, java.util.List r32, xsna.rg50 r33, xsna.dz40.w r34, xsna.izs r35, androidx.compose.runtime.a r36, int r37) {
        /*
            Method dump skipped, instructions count: 799
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xsna.qzn0.b(xsna.col, xsna.h17, java.util.List, xsna.rg50, xsna.dz40$w, xsna.izs, androidx.compose.runtime.a, int):void");
    }

    public static final void c(final float f, final float f2, final q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a M = aVar.M(-401146823);
        int i2 = (M.n(f) ? 4 : 2) | i | (M.n(f2) ? 32 : 16) | (M.J(q630Var) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-401146823, i2, -1, "com.vk.music.stickyplayer.presentation.components.TabIndicator (TabsSheet.kt:345)");
            }
            q630 s = txj0.s(kci.m(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, q630Var), f2, 48);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.i, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, s);
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
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            float f3 = 2;
            q630 h = txj0.h(s200.F(16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(q630.a.a, 1.0f)), f3);
            long j = l5g.d;
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = vog0.b(f3);
                M.R(x);
            }
            f9t.e(hr80.m(h, j, (uog0) x), M, 6);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s2 = M.s();
        if (s2 != null) {
            s2.d = new wzs(f, f2, i, q630Var) { // from class: xsna.mzn0
                public final /* synthetic */ float b;
                public final /* synthetic */ float c;
                public final /* synthetic */ q630 d;

                {
                    this.d = q630Var;
                }

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    qzn0.c(this.b, this.c, this.d, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void d(final h17 h17Var, final rg50 rg50Var, final dz40.u uVar, final izs izsVar, final q630 q630Var, jai jaiVar, androidx.compose.runtime.a aVar, final int i) {
        jai jaiVar2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.f s;
        wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> wzsVar;
        Object rzn0Var;
        float f;
        ParentBottomSheetState parentBottomSheetState;
        int i2;
        List list;
        mtk0 mtk0Var;
        androidx.compose.runtime.a aVar3;
        int i3;
        mtk0 mtk0Var2;
        boolean z;
        Object tzn0Var;
        ParentBottomSheetState parentBottomSheetState2;
        h17 h17Var2;
        androidx.compose.runtime.a M = aVar.M(-184312145);
        int c2 = M.c();
        int i4 = i | (M.J(h17Var) ? 4 : 2) | (M.J(rg50Var) ? 32 : 16) | (M.J(uVar) ? 256 : 128) | (M.y(izsVar) ? 2048 : 1024) | (M.J(q630Var) ? 16384 : 8192);
        if (M.t(i4 & 1, (74899 & i4) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-184312145, i4, -1, "com.vk.music.stickyplayer.presentation.components.TabsSheet (TabsSheet.kt:73)");
            }
            dz40.v vVar = uVar.b;
            ParentBottomSheetState parentBottomSheetState3 = vVar.a;
            float f2 = vVar.b;
            boolean z2 = vVar.c;
            List list2 = uVar.a;
            Object x = M.x();
            Object obj = a.C0011a.a;
            if (x == obj) {
                x = bbk0.b(new dac0(h17Var, 17));
                M.R(x);
            }
            mtk0 mtk0Var3 = (mtk0) x;
            boolean o = M.o(parentBottomSheetState3.ordinal());
            Object x2 = M.x();
            if (o || x2 == obj) {
                x2 = bbk0.b(new hri0(parentBottomSheetState3, 6));
                M.R(x2);
            }
            mtk0 mtk0Var4 = (mtk0) x2;
            Boolean bool = (Boolean) mtk0Var3.getValue();
            bool.getClass();
            int i5 = i4 & 7168;
            boolean J = ((i4 & 112) == 32) | M.J(list2) | (i5 == 2048);
            Object x3 = M.x();
            if (J || x3 == obj) {
                f = f2;
                parentBottomSheetState = parentBottomSheetState3;
                i2 = i5;
                rzn0Var = new rzn0(rg50Var, list2, izsVar, mtk0Var3, null);
                list = list2;
                mtk0Var = mtk0Var3;
                M.R(rzn0Var);
            } else {
                rzn0Var = x3;
                parentBottomSheetState = parentBottomSheetState3;
                list = list2;
                i2 = i5;
                f = f2;
                mtk0Var = mtk0Var3;
            }
            bap.g(bool, (wzs) rzn0Var, M, 0);
            boolean n = M.n(f);
            Object x4 = M.x();
            if (n || x4 == obj) {
                x4 = androidx.compose.runtime.d.a(f);
                M.R(x4);
            }
            kg50 kg50Var = (kg50) x4;
            mtk0 b2 = hg2.b(kg50Var.getFloatValue(), jq2.c(0.5f, 200.0f, null, 4), "sheet_onboarding", null, M, 3120, 20);
            Boolean bool2 = (Boolean) mtk0Var4.getValue();
            bool2.getClass();
            Boolean valueOf = Boolean.valueOf(z2);
            Boolean bool3 = (Boolean) mtk0Var.getValue();
            bool3.getClass();
            int i6 = i4 & 14;
            boolean J2 = M.J(mtk0Var4) | M.l(z2) | M.J(kg50Var) | M.n(f) | (i6 == 4) | (i2 == 2048);
            Object x5 = M.x();
            if (J2 || x5 == obj) {
                aVar3 = M;
                i3 = 1;
                mtk0Var2 = b2;
                Object szn0Var = new szn0(z2, kg50Var, f, h17Var, izsVar, mtk0Var4, mtk0Var, null);
                z = z2;
                aVar3.R(szn0Var);
                x5 = szn0Var;
            } else {
                z = z2;
                aVar3 = M;
                mtk0Var2 = b2;
                i3 = 1;
            }
            wzs wzsVar2 = (wzs) x5;
            androidx.compose.runtime.a aVar4 = aVar3;
            bap.e(bool2, valueOf, bool3, wzsVar2, aVar4, 0);
            Float valueOf2 = Float.valueOf(((Number) mtk0Var2.getValue()).floatValue());
            Boolean valueOf3 = Boolean.valueOf(z);
            int i7 = (aVar4.o(parentBottomSheetState.ordinal()) ? 1 : 0) | (aVar4.l(z) ? 1 : 0) | (aVar4.J(mtk0Var2) ? 1 : 0) | (i6 == 4 ? i3 : 0);
            Object x6 = aVar4.x();
            if (i7 != 0 || x6 == obj) {
                parentBottomSheetState2 = parentBottomSheetState;
                tzn0Var = new tzn0(parentBottomSheetState2, z, h17Var, mtk0Var2, null);
                h17Var2 = h17Var;
                aVar4.R(tzn0Var);
            } else {
                h17Var2 = h17Var;
                tzn0Var = x6;
                parentBottomSheetState2 = parentBottomSheetState;
            }
            bap.e(valueOf2, parentBottomSheetState2, valueOf3, (wzs) tzn0Var, aVar4, 0);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, aVar4, 0);
            int hashCode = Long.hashCode(n34.n(aVar4));
            sy90 D = aVar4.D();
            q630 c3 = qri.c(aVar4, q630Var);
            cri.h7.getClass();
            LayoutNode.a aVar5 = cri.a.b;
            if (aVar4.N() == null) {
                n34.r();
                throw null;
            }
            aVar4.H();
            if (aVar4.L()) {
                aVar4.I(aVar5);
            } else {
                aVar4.f();
            }
            cri.a.c cVar = cri.a.f;
            k9q0.w(aVar4, a2, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(aVar4, D, eVar);
            Integer valueOf4 = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(aVar4, valueOf4, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(aVar4, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(aVar4, c3, dVar);
            aVar4.K(-2089060137);
            q630.a aVar6 = q630.a.a;
            a(h17Var2, ahn.E(s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4, i3, aVar6).g(new gcv(dt1.a.o)), "collapseTrackListButton"), aVar4, i6);
            if (list.isEmpty()) {
                aVar4.C(c2);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                s = aVar4.s();
                if (s != null) {
                    wzsVar = new iat(h17Var2, rg50Var, uVar, izsVar, q630Var, jaiVar, i);
                    s.d = wzsVar;
                }
                return;
            }
            final List list3 = list;
            vpu0.c(rg50Var.getIntValue(), kai.c(-1778041864, new yzs() { // from class: xsna.pzn0
                @Override // xsna.yzs
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    col colVar = (col) obj2;
                    androidx.compose.runtime.a aVar7 = (androidx.compose.runtime.a) obj3;
                    int intValue = ((Integer) obj4).intValue();
                    if ((intValue & 6) == 0) {
                        intValue |= aVar7.J(colVar) ? 4 : 2;
                    }
                    if (aVar7.t(intValue & 1, (intValue & 19) != 18)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1778041864, intValue, -1, "com.vk.music.stickyplayer.presentation.components.TabsSheet.<anonymous>.<anonymous> (TabsSheet.kt:152)");
                        }
                        qzn0.b(colVar, h17.this, list3, rg50Var, uVar.c, izsVar, aVar7, intValue & 14);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar7.h();
                    }
                    return s3q0.a;
                }
            }, aVar4), txj0.f(aVar6, 1.0f), l5g.j, false, kai.c(1499325878, new uzn0(rg50Var, h17Var), aVar4), aVar4, 1576368, 48);
            aVar2 = aVar4;
            q630 d = txj0.d(aVar6, 1.0f);
            cp10 d2 = ja8.d(dt1.a.b, false);
            int hashCode2 = Long.hashCode(n34.n(aVar2));
            sy90 D2 = aVar2.D();
            q630 c4 = qri.c(aVar2, d);
            if (aVar2.N() == null) {
                n34.r();
                throw null;
            }
            aVar2.H();
            if (aVar2.L()) {
                aVar2.I(aVar5);
            } else {
                aVar2.f();
            }
            k9q0.w(aVar2, d2, cVar);
            k9q0.w(aVar2, D2, eVar);
            ur.d(hashCode2, aVar2, bVar, aVar2, c2678a);
            k9q0.w(aVar2, c4, dVar);
            Object obj2 = list3.get(rg50Var.getIntValue());
            jaiVar2 = jaiVar;
            jaiVar2.invoke(obj2, aVar2, 48);
            aVar2.G();
            aVar2.j();
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            jaiVar2 = jaiVar;
            aVar2 = M;
            aVar2.h();
        }
        s = aVar2.s();
        if (s != null) {
            final jai jaiVar3 = jaiVar2;
            wzsVar = new wzs(rg50Var, uVar, izsVar, q630Var, jaiVar3, i) { // from class: xsna.lzn0
                public final /* synthetic */ rg50 c;
                public final /* synthetic */ dz40.u d;
                public final /* synthetic */ izs e;
                public final /* synthetic */ q630 f;
                public final /* synthetic */ jai g;

                @Override // xsna.wzs
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int I = ne7.I(196609);
                    qzn0.d(h17.this, this.c, this.d, this.e, this.f, this.g, (androidx.compose.runtime.a) obj3, I);
                    return s3q0.a;
                }
            };
            s.d = wzsVar;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00e1, code lost:
    
        if (xsna.qsl.b(1000, r0) != r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a8, code lost:
    
        if (xsna.qsl.b(30, r0) == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(kg50 kg50Var, float f, g07 g07Var, izs izsVar, ContinuationImpl continuationImpl) {
        wzn0 wzn0Var;
        CoroutineSingletons coroutineSingletons;
        int i;
        float c2;
        float f2;
        float f3;
        float f4;
        kg50 kg50Var2;
        izs izsVar2;
        if (continuationImpl instanceof wzn0) {
            wzn0Var = (wzn0) continuationImpl;
            int i2 = wzn0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wzn0Var.label = i2 - Integer.MIN_VALUE;
                Object obj = wzn0Var.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = wzn0Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    c2 = g07Var.c.c().c(BigPlayerBottomSheetValue.Expanded);
                    f2 = ((c2 - f) / 6) + f;
                    izsVar.invoke(new sx40.p(true));
                    wzn0Var.L$0 = kg50Var;
                    wzn0Var.L$1 = null;
                    wzn0Var.L$2 = izsVar;
                    wzn0Var.F$0 = f;
                    wzn0Var.F$1 = c2;
                    wzn0Var.F$2 = f2;
                    wzn0Var.label = 1;
                } else if (i == 1) {
                    float f5 = wzn0Var.F$2;
                    float f6 = wzn0Var.F$1;
                    float f7 = wzn0Var.F$0;
                    izsVar = (izs) wzn0Var.L$2;
                    kg50 kg50Var3 = (kg50) wzn0Var.L$0;
                    kotlin.a.a(obj);
                    c2 = f6;
                    f = f7;
                    f2 = f5;
                    kg50Var = kg50Var3;
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        izsVar2 = (izs) wzn0Var.L$2;
                        kotlin.a.a(obj);
                        izsVar2.invoke(new sx40.p(false));
                        return s3q0.a;
                    }
                    float f8 = wzn0Var.F$2;
                    f4 = wzn0Var.F$1;
                    f3 = wzn0Var.F$0;
                    izsVar = (izs) wzn0Var.L$2;
                    kg50Var2 = (kg50) wzn0Var.L$0;
                    kotlin.a.a(obj);
                    f2 = f8;
                    izsVar2 = izsVar;
                    kg50Var2.g(f3);
                    wzn0Var.L$0 = null;
                    wzn0Var.L$1 = null;
                    wzn0Var.L$2 = izsVar2;
                    wzn0Var.F$0 = f3;
                    wzn0Var.F$1 = f4;
                    wzn0Var.F$2 = f2;
                    wzn0Var.label = 3;
                }
                kg50Var.g(f2);
                wzn0Var.L$0 = kg50Var;
                wzn0Var.L$1 = null;
                wzn0Var.L$2 = izsVar;
                wzn0Var.F$0 = f;
                wzn0Var.F$1 = c2;
                wzn0Var.F$2 = f2;
                wzn0Var.label = 2;
                if (qsl.b(1500L, wzn0Var) != coroutineSingletons) {
                    float f9 = c2;
                    f3 = f;
                    f4 = f9;
                    kg50Var2 = kg50Var;
                    izsVar2 = izsVar;
                    kg50Var2.g(f3);
                    wzn0Var.L$0 = null;
                    wzn0Var.L$1 = null;
                    wzn0Var.L$2 = izsVar2;
                    wzn0Var.F$0 = f3;
                    wzn0Var.F$1 = f4;
                    wzn0Var.F$2 = f2;
                    wzn0Var.label = 3;
                }
                return coroutineSingletons;
            }
        }
        wzn0Var = new wzn0(continuationImpl);
        Object obj2 = wzn0Var.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = wzn0Var.label;
        if (i != 0) {
        }
        kg50Var.g(f2);
        wzn0Var.L$0 = kg50Var;
        wzn0Var.L$1 = null;
        wzn0Var.L$2 = izsVar;
        wzn0Var.F$0 = f;
        wzn0Var.F$1 = c2;
        wzn0Var.F$2 = f2;
        wzn0Var.label = 2;
        if (qsl.b(1500L, wzn0Var) != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
