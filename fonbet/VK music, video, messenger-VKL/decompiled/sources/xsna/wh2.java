package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.tool.onboarding.VkTooltip$BalloonPosition;
import com.vk.toggle.features.MusicFeatures;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.dz40;
import xsna.hn40;
import xsna.q630;
import xsna.sx40;

/* compiled from: AnimatedChips.kt */
/* loaded from: classes3.dex */
public final class wh2 {

    /* compiled from: AnimatedChips.kt */
    @b6l(c = "com.vk.music.stickyplayer.presentation.components.chips.AnimatedChipsKt$MusicChipsAnimation$1$1", f = "AnimatedChips.kt", l = {207, Sdk.SDKError.Reason.INVALID_JSON_BID_PAYLOAD_VALUE}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ dz40.e $chipsOnboardingData;
        final /* synthetic */ mtk0<Boolean> $isBottomSheetCollapsed$delegate;
        final /* synthetic */ mtk0<Boolean> $isParentBottomSheetExpanded$delegate;
        final /* synthetic */ izs<sx40, s3q0> $onAction;
        final /* synthetic */ Object $waveAnimationHelper;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(dz40.e eVar, Object obj, izs<? super sx40, s3q0> izsVar, mtk0<Boolean> mtk0Var, mtk0<Boolean> mtk0Var2, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$chipsOnboardingData = eVar;
            this.$waveAnimationHelper = obj;
            this.$onAction = izsVar;
            this.$isParentBottomSheetExpanded$delegate = mtk0Var;
            this.$isBottomSheetCollapsed$delegate = mtk0Var2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$chipsOnboardingData, this.$waveAnimationHelper, this.$onAction, this.$isParentBottomSheetExpanded$delegate, this.$isBottomSheetCollapsed$delegate, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0056, code lost:
        
            if (r6.a(r5) == r0) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0027, code lost:
        
            if (xsna.qsl.b(600, r5) == r0) goto L21;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                this.label = 1;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    this.$onAction.invoke(new sx40.p(false));
                    return s3q0.a;
                }
                kotlin.a.a(obj);
            }
            if (this.$isParentBottomSheetExpanded$delegate.getValue().booleanValue() && this.$chipsOnboardingData.c && this.$isBottomSheetCollapsed$delegate.getValue().booleanValue()) {
                jdx0 jdx0Var = (jdx0) this.$waveAnimationHelper;
                this.label = 2;
            }
            return s3q0.a;
        }
    }

    public static final void a(final int i, androidx.compose.runtime.a aVar, final Set set, final izs izsVar, q630 q630Var, final dz40.e eVar, final boolean z, final boolean z2) {
        int i2;
        dz40.e eVar2;
        boolean z3;
        boolean z4;
        final q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(6682810);
        if ((i & 6) == 0) {
            i2 = (M.J(set) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            eVar2 = eVar;
            i2 |= M.J(eVar2) ? 32 : 16;
        } else {
            eVar2 = eVar;
        }
        if ((i & 384) == 0) {
            z3 = z;
            i2 |= M.l(z3) ? 256 : 128;
        } else {
            z3 = z;
        }
        if ((i & 3072) == 0) {
            i2 |= M.y(izsVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            z4 = z2;
            i2 |= M.l(z4) ? 16384 : 8192;
        } else {
            z4 = z2;
        }
        int i3 = 196608 | i2;
        if (M.t(i3 & 1, (74899 & i3) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(6682810, i3, -1, "com.vk.music.stickyplayer.presentation.components.chips.AnimatedChips (AnimatedChips.kt:54)");
            }
            boolean h = MusicFeatures.AUDIO_MULTI_REACTIONS.h();
            q630.a aVar2 = q630.a.a;
            if (h) {
                M.K(1519506947);
                q630 H = s200.H(aVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11);
                a.l lVar = androidx.compose.foundation.layout.a.a;
                dt1.a.getClass();
                androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(lVar, dt1.a.k, M, 0);
                int hashCode = Long.hashCode(n34.n(M));
                sy90 D = M.D();
                q630 c = qri.c(M, H);
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
                k9q0.w(M, c, cri.a.d);
                if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                    szw.a("invalid weight; must be greater than zero");
                }
                q630 c2 = rdu.c(new xpy(1.0f, true), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 458751);
                Object x = M.x();
                if (x == a.C0011a.a) {
                    x = new am0(2);
                    M.R(x);
                }
                b((458752 & (i3 << 6)) | (i3 & IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW) | ((i3 >> 3) & 7168), M, set, izsVar, bu00.e(c2, (izs) x), eVar2, z3, z4);
                fbc.l((i3 >> 9) & 14, M, izsVar, null);
                M.G();
                M.j();
            } else {
                M.K(1520664518);
                int i4 = i3 >> 3;
                b((458752 & (i3 << 6)) | (i3 & IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW) | (i4 & 7168) | (i4 & 57344), M, set, izsVar, aVar2, eVar, z, z2);
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar2;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.oh2
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    wh2.a(ne7.I(i | 1), (androidx.compose.runtime.a) obj, set, izsVar, q630Var2, eVar, z, z2);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(final int i, androidx.compose.runtime.a aVar, Set set, final izs izsVar, final q630 q630Var, final dz40.e eVar, final boolean z, final boolean z2) {
        final Set set2;
        Object obj;
        a.C0011a.C0012a c0012a;
        int i2;
        int i3;
        int i4;
        a.C0011a.C0012a c0012a2;
        ArrayList arrayList;
        Float valueOf;
        androidx.compose.runtime.a M = aVar.M(1281150549);
        int i5 = (i & 6) == 0 ? (M.J(set) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i5 |= M.J(eVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i5 |= M.l(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i5 |= M.l(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i5 |= M.J(q630Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i5 |= M.y(izsVar) ? 131072 : 65536;
        }
        if (M.t(i5 & 1, (74899 & i5) != 74898)) {
            int i6 = -1;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1281150549, i5, -1, "com.vk.music.stickyplayer.presentation.components.chips.ChipsRow (AnimatedChips.kt:105)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a3 = a.C0011a.a;
            if (x == c0012a3) {
                int size = set.size();
                ArrayList arrayList2 = new ArrayList(size);
                for (int i7 = 0; i7 < size; i7++) {
                    arrayList2.add(androidx.compose.runtime.d.a(1.0f));
                }
                M.R(arrayList2);
                x = arrayList2;
            }
            List list = (List) x;
            xvy a2 = zvy.a(0, 3, M);
            M.K(-1469920036);
            int size2 = set.size();
            ArrayList arrayList3 = new ArrayList(size2);
            int i8 = 0;
            while (i8 < size2) {
                kg50 kg50Var = (kg50) j5g.b0(i8, list);
                if (kg50Var == null) {
                    M.K(-307013503);
                    M.j();
                    c0012a2 = c0012a3;
                    arrayList = arrayList3;
                    i3 = i8;
                    valueOf = null;
                } else {
                    M.K(-307013502);
                    float floatValue = kg50Var.getFloatValue();
                    if (androidx.compose.runtime.b.d()) {
                        i3 = i8;
                        i4 = 0;
                        androidx.compose.runtime.b.f(-2049247339, 0, i6, "com.vk.music.stickyplayer.presentation.components.chips.animateChipAsState (AnimatedChips.kt:184)");
                    } else {
                        i3 = i8;
                        i4 = 0;
                    }
                    c0012a2 = c0012a3;
                    arrayList = arrayList3;
                    mtk0 b = hg2.b(floatValue, jq2.d(200, i4, luo.d, 2), "chips_scale", null, M, 3072, 20);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    float floatValue2 = ((Number) b.getValue()).floatValue();
                    M.j();
                    valueOf = Float.valueOf(floatValue2);
                }
                arrayList.add(Float.valueOf(valueOf != null ? valueOf.floatValue() : 1.0f));
                i8 = i3 + 1;
                arrayList3 = arrayList;
                c0012a3 = c0012a2;
                i6 = -1;
            }
            a.C0011a.C0012a c0012a4 = c0012a3;
            final ArrayList arrayList4 = arrayList3;
            M.j();
            Object x2 = M.x();
            if (x2 == c0012a4) {
                qow qowVar = new qow(new jdx0(list));
                M.R(qowVar);
                x2 = qowVar;
            }
            T t = ((qow) x2).a;
            Object x3 = M.x();
            if (x3 == c0012a4) {
                hn40 o = com.vk.toggle.d.o();
                x3 = Boolean.valueOf((o instanceof hn40.b) && (((hn40.b) o).b || eVar.d) && !eVar.e);
                M.R(x3);
            }
            boolean booleanValue = ((Boolean) x3).booleanValue();
            Object x4 = M.x();
            if (x4 == c0012a4) {
                x4 = Integer.valueOf(booleanValue ? R.string.try_smooth_transition_between_tracks_and_normalization : R.string.try_smooth_transition_between_tracks);
                M.R(x4);
            }
            final int intValue = ((Number) x4).intValue();
            c(eVar, t, izsVar, M, ((i5 >> 3) & 14) | 48 | ((i5 >> 9) & 896));
            q630 E = ahn.E(q630Var, "chipsRow");
            a.j g = androidx.compose.foundation.layout.a.g(8);
            u890 m = s200.m(16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            int i9 = i5 & 14;
            boolean J = ((i5 & 896) == 256) | (i9 == 4) | ((458752 & i5) == 131072) | ((i5 & 7168) == 2048) | M.J(arrayList4);
            Object x5 = M.x();
            if (J || x5 == c0012a4) {
                c0012a = c0012a4;
                set2 = set;
                i2 = 4;
                obj = new izs() { // from class: xsna.ph2
                    @Override // xsna.izs
                    public final Object invoke(Object obj2) {
                        final Set set3 = set2;
                        int size3 = j5g.O0(new ipw(set3)).size();
                        final int i10 = intValue;
                        final ArrayList arrayList5 = arrayList4;
                        final izs izsVar2 = izsVar;
                        final boolean z3 = z;
                        final boolean z4 = z2;
                        nvy.c((nvy) obj2, size3, null, new jai(264391721, new zzs() { // from class: xsna.sh2
                            @Override // xsna.zzs
                            public final Object invoke(Object obj3, Object obj4, Object obj5, Object obj6) {
                                final int intValue2 = ((Integer) obj4).intValue();
                                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj5;
                                int intValue3 = ((Integer) obj6).intValue();
                                if ((intValue3 & 48) == 0) {
                                    intValue3 |= aVar2.o(intValue2) ? 32 : 16;
                                }
                                boolean z5 = false;
                                if (aVar2.t(intValue3 & 1, (intValue3 & 145) != 144)) {
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.f(264391721, intValue3, -1, "com.vk.music.stickyplayer.presentation.components.chips.ChipsRow.<anonymous>.<anonymous>.<anonymous> (AnimatedChips.kt:145)");
                                    }
                                    boolean z6 = z3;
                                    final Set set4 = set3;
                                    if (z6 && intValue2 == e43.g(new ipw(set4)).c) {
                                        z5 = true;
                                    }
                                    buv0 z7 = rdi.z(z5, null, null, aVar2, 0, 6);
                                    String N = d370.N(i10, 6, aVar2);
                                    VkTooltip$BalloonPosition vkTooltip$BalloonPosition = VkTooltip$BalloonPosition.BottomLeft;
                                    final izs izsVar3 = izsVar2;
                                    boolean J2 = aVar2.J(izsVar3) | aVar2.y(z7);
                                    Object x6 = aVar2.x();
                                    Object obj7 = a.C0011a.a;
                                    if (J2 || x6 == obj7) {
                                        x6 = new sk(2, izsVar3, z7);
                                        aVar2.R(x6);
                                    }
                                    gzs gzsVar = (gzs) x6;
                                    boolean J3 = aVar2.J(izsVar3);
                                    Object x7 = aVar2.x();
                                    if (J3 || x7 == obj7) {
                                        x7 = new th2(izsVar3, 0);
                                        aVar2.R(x7);
                                    }
                                    gzs gzsVar2 = (gzs) x7;
                                    final boolean z8 = z4;
                                    final ArrayList arrayList6 = arrayList5;
                                    o9v0.a(N, z7, q630.a.a, null, null, null, vkTooltip$BalloonPosition, null, gzsVar, null, null, null, gzsVar2, false, null, true, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, true, kai.c(1616845500, new wzs() { // from class: xsna.uh2
                                        @Override // xsna.wzs
                                        public final Object invoke(Object obj8, Object obj9) {
                                            androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj8;
                                            int intValue4 = ((Integer) obj9).intValue();
                                            if (aVar3.t(intValue4 & 1, (intValue4 & 3) != 2)) {
                                                if (androidx.compose.runtime.b.d()) {
                                                    androidx.compose.runtime.b.f(1616845500, intValue4, -1, "com.vk.music.stickyplayer.presentation.components.chips.ChipsRow.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AnimatedChips.kt:164)");
                                                }
                                                List O0 = j5g.O0(new ipw(set4));
                                                int i11 = intValue2;
                                                dz40.d dVar = (dz40.d) O0.get(i11);
                                                Float f = (Float) j5g.b0(i11, arrayList6);
                                                fbc.a(dVar, izsVar3, z8, rdu.a(q630.a.a, new nh2(f != null ? f.floatValue() : 1.0f, 0)), aVar3, 0);
                                                if (androidx.compose.runtime.b.d()) {
                                                    androidx.compose.runtime.b.e();
                                                }
                                            } else {
                                                aVar3.h();
                                            }
                                            return s3q0.a;
                                        }
                                    }, aVar2), aVar2, 1573248, 906166272, 224952);
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                } else {
                                    aVar2.h();
                                }
                                return s3q0.a;
                            }
                        }, true), 6);
                        return s3q0.a;
                    }
                };
                M.R(obj);
            } else {
                c0012a = c0012a4;
                obj = x5;
                i2 = 4;
                set2 = set;
            }
            int i10 = i2;
            lqy.b(E, a2, m, g, null, null, false, null, (izs) obj, M, 24960, 488);
            M = M;
            if (z) {
                M.K(1679537731);
                s3q0 s3q0Var = s3q0.a;
                boolean J2 = M.J(a2) | (i9 == i10);
                Object x6 = M.x();
                if (J2 || x6 == c0012a) {
                    x6 = new vh2(a2, set2, null);
                    M.R(x6);
                }
                bap.g(s3q0Var, (wzs) x6, M, 6);
            } else {
                M.K(1672533901);
            }
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            set2 = set;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            final Set set3 = set2;
            s.d = new wzs() { // from class: xsna.qh2
                @Override // xsna.wzs
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    wh2.b(ne7.I(i | 1), (androidx.compose.runtime.a) obj2, set3, izsVar, q630Var, eVar, z, z2);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void c(dz40.e eVar, Object obj, izs<? super sx40, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        Object obj2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(1173697887);
        if ((i & 6) == 0) {
            i2 = (M.J(eVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            obj2 = obj;
            i2 |= M.J(obj2) ? 32 : 16;
        } else {
            obj2 = obj;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(izsVar) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1173697887, i2, -1, "com.vk.music.stickyplayer.presentation.components.chips.MusicChipsAnimation (AnimatedChips.kt:197)");
            }
            boolean o = M.o(eVar.b.ordinal());
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (o || x == c0012a) {
                x = bbk0.b(new b3(eVar, 5));
                M.R(x);
            }
            mtk0 mtk0Var = (mtk0) x;
            boolean o2 = M.o(eVar.a.ordinal());
            Object x2 = M.x();
            if (o2 || x2 == c0012a) {
                x2 = bbk0.b(new na(eVar, 4));
                M.R(x2);
            }
            mtk0 mtk0Var2 = (mtk0) x2;
            Boolean bool = (Boolean) mtk0Var2.getValue();
            bool.booleanValue();
            Boolean valueOf = Boolean.valueOf(eVar.c);
            Boolean bool2 = (Boolean) mtk0Var.getValue();
            bool2.booleanValue();
            boolean J = M.J(mtk0Var2) | ((i2 & 14) == 4) | M.J(mtk0Var) | ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object x3 = M.x();
            if (J || x3 == c0012a) {
                a aVar3 = new a(eVar, obj2, izsVar, mtk0Var2, mtk0Var, null);
                M.R(aVar3);
                x3 = aVar3;
            }
            aVar2 = M;
            bap.e(bool, valueOf, bool2, (wzs) x3, aVar2, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new rh2(i, 0, eVar, obj, izsVar);
        }
    }
}
