package xsna;

import android.text.format.DateUtils;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.alert.Alert$Button;
import com.vk.core.compose.component.defaults.CellButton$Appearance;
import com.vk.core.compose.component.defaults.ContentBadgeAppearance;
import com.vk.core.compose.component.defaults.ContentBadgeMode;
import com.vk.core.compose.component.defaults.ContentBadgeSize;
import com.vk.core.compose.component.defaults.PictureRadius;
import com.vk.core.compose.component.defaults.SeparatorAppearance;
import com.vk.core.compose.component.defaults.SeparatorDpi;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.afo;
import xsna.cri;
import xsna.dt1;
import xsna.phw;
import xsna.q630;
import xsna.sdo;
import xsna.us2;
import xsna.weo;
import xsna.wkj;

/* compiled from: DraftsListViewContent.kt */
/* loaded from: classes18.dex */
public final class weo {
    public static final /* synthetic */ qcy<Object>[] a;
    public static final sgi0<Integer> b;

    /* compiled from: DraftsListViewContent.kt */
    @b6l(c = "com.vk.draftslist.impl.ui.view.DraftsListViewContentKt$DraftsListViewContent$1$1", f = "DraftsListViewContent.kt", l = {MBSupportMuteAdType.REWARD_VIDEO}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ izs<sdo, s3q0> $onAction;
        final /* synthetic */ dlv0 $snackbarHostState;
        final /* synthetic */ afo.a $state;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(afo.a aVar, dlv0 dlv0Var, izs<? super sdo, s3q0> izsVar, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$state = aVar;
            this.$snackbarHostState = dlv0Var;
            this.$onAction = izsVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$state, this.$snackbarHostState, this.$onAction, spjVar);
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
                if (this.$state.f) {
                    dlv0 dlv0Var = this.$snackbarHostState;
                    this.label = 1;
                    if (dlv0.d(dlv0Var, "", null, this, 30) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return s3q0.a;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            this.$onAction.invoke(sdo.o.b);
            return s3q0.a;
        }
    }

    /* compiled from: DraftsListViewContent.kt */
    @b6l(c = "com.vk.draftslist.impl.ui.view.DraftsListViewContentKt$DraftsListViewContent$3$1$1", f = "DraftsListViewContent.kt", l = {111}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ xvy $listState;
        final /* synthetic */ izs<sdo, s3q0> $onAction;
        int label;

        /* compiled from: DraftsListViewContent.kt */
        public static final class a<T> implements lsr {
            public final /* synthetic */ izs<sdo, s3q0> b;

            /* JADX WARN: Multi-variable type inference failed */
            public a(izs<? super sdo, s3q0> izsVar) {
                this.b = izsVar;
            }

            @Override // xsna.lsr
            public final Object emit(Object obj, spj spjVar) {
                fvy fvyVar = (fvy) obj;
                int d = fvyVar.d();
                xuy xuyVar = (xuy) j5g.k0(fvyVar.f());
                if ((xuyVar != null ? xuyVar.getIndex() : 0) >= d - 8) {
                    this.b.invoke(sdo.h.b);
                }
                return s3q0.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(xvy xvyVar, izs<? super sdo, s3q0> izsVar, spj<? super b> spjVar) {
            super(2, spjVar);
            this.$listState = xvyVar;
            this.$onAction = izsVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new b(this.$listState, this.$onAction, spjVar);
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
                izg0 M = nr2.M(new c5f(this.$listState, 15));
                a aVar = new a(this.$onAction);
                this.label = 1;
                if (M.collect(aVar, this) == coroutineSingletons) {
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

    /* compiled from: DraftsListViewContent.kt */
    @b6l(c = "com.vk.draftslist.impl.ui.view.DraftsListViewContentKt$DraftsListViewContent$3$2$1", f = "DraftsListViewContent.kt", l = {Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ xvy $listState;
        final /* synthetic */ izs<sdo, s3q0> $onAction;
        final /* synthetic */ afo.a $state;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(afo.a aVar, xvy xvyVar, izs<? super sdo, s3q0> izsVar, spj<? super c> spjVar) {
            super(2, spjVar);
            this.$state = aVar;
            this.$listState = xvyVar;
            this.$onAction = izsVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new c(this.$state, this.$listState, this.$onAction, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((c) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                if (this.$state.g) {
                    xvy xvyVar = this.$listState;
                    this.label = 1;
                    fh9 fh9Var = xvy.y;
                    if (xvyVar.k(0, 0, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return s3q0.a;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            this.$onAction.invoke(sdo.i.b);
            return s3q0.a;
        }
    }

    /* compiled from: LazyDsl.kt */
    public static final class d implements izs<Integer, Object> {
        public final /* synthetic */ hkb b;
        public final /* synthetic */ ArrayList c;

        public d(hkb hkbVar, ArrayList arrayList) {
            this.b = hkbVar;
            this.c = arrayList;
        }

        @Override // xsna.izs
        public final Object invoke(Integer num) {
            int intValue = num.intValue();
            return this.b.invoke(Integer.valueOf(intValue), this.c.get(intValue));
        }
    }

    /* compiled from: LazyDsl.kt */
    public static final class e implements izs<Integer, Object> {
        public final /* synthetic */ ArrayList b;

        public e(ArrayList arrayList) {
            this.b = arrayList;
        }

        @Override // xsna.izs
        public final Object invoke(Integer num) {
            this.b.get(num.intValue());
            return null;
        }
    }

    /* compiled from: LazyDsl.kt */
    public static final class f implements zzs<ksy, Integer, androidx.compose.runtime.a, Integer, s3q0> {
        public final /* synthetic */ ArrayList b;
        public final /* synthetic */ izs c;

        public f(ArrayList arrayList, izs izsVar) {
            this.b = arrayList;
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
                    androidx.compose.runtime.b.f(2039820996, i, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                }
                qdo qdoVar = (qdo) this.b.get(intValue);
                aVar2.K(2021186536);
                weo.f(qdoVar, intValue, this.c, aVar2, i & 112);
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

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(weo.class, "listItemPosition", "getListItemPosition(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1);
        fpf0.a.getClass();
        a = new qcy[]{mutablePropertyReference1Impl};
        b = new sgi0<>("ListItemPosition");
    }

    public static final void a(gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-1252625445);
        int i2 = (M.y(gzsVar) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1252625445, i2, -1, "com.vk.draftslist.impl.ui.view.DeletionDialog (DraftsListViewContent.kt:421)");
            }
            q630 E = ahn.E(q630.a.a, "drafts_list_delete_dialog");
            String N = d370.N(R.string.draft_delete_confirm, 0, M);
            String N2 = d370.N(R.string.draft_delete_confirm_desc, 0, M);
            String N3 = d370.N(R.string.delete, 0, M);
            Alert$Button.Style style = Alert$Button.Style.Neutral;
            SemanticsConfiguration.Mode mode = SemanticsConfiguration.Mode.Merge;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new com.vk.movika.sdk.base.observable.i(27);
                M.R(x);
            }
            Alert$Button alert$Button = new Alert$Button(N3, gzsVar, style, com.vk.core.compose.component.semantics.b.a(mode, (izs) x, 2));
            String N4 = d370.N(R.string.cancel, 0, M);
            Alert$Button.Style style2 = Alert$Button.Style.Negative;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new j60(21);
                M.R(x2);
            }
            Alert$Button alert$Button2 = new Alert$Button(N4, gzsVar2, style2, com.vk.core.compose.component.semantics.b.a(mode, (izs) x2, 2));
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = new k60(27);
                M.R(x3);
            }
            com.vk.core.compose.component.semantics.a a2 = com.vk.core.compose.component.semantics.b.a(mode, (izs) x3, 2);
            Object x4 = M.x();
            if (x4 == c0012a) {
                x4 = new reo(0, gzsVar2);
                M.R(x4);
            }
            p7u0.c(24576, 320, M, alert$Button, alert$Button2, a2, null, N, N2, null, (izs) x4, E);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new x4a(gzsVar, gzsVar2, i, 4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(final qdo qdoVar, final int i, final izs<? super sdo, s3q0> izsVar, androidx.compose.runtime.a aVar, final int i2) {
        int i3;
        androidx.compose.runtime.a M = aVar.M(1566249214);
        if ((i2 & 6) == 0) {
            i3 = (M.J(qdoVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= M.o(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= M.y(izsVar) ? 256 : 128;
        }
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1566249214, i3, -1, "com.vk.draftslist.impl.ui.view.DotsMenuIconButton (DraftsListViewContent.kt:314)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x);
            }
            final wh50 wh50Var = (wh50) x;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x2);
            }
            final wh50 wh50Var2 = (wh50) x2;
            float f2 = 24;
            float f3 = 8;
            q630.a aVar2 = q630.a.a;
            q630 E = ahn.E(s200.D(aVar2, f3), "drafts_list_item_menu_icon");
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = new meo(0, wh50Var);
                M.R(x3);
            }
            nzu0.e((gzs) x3, E, f2, null, false, null, null, hfi.b, M, 100663734, 248);
            q630 E2 = ahn.E(s200.H(txj0.B(aVar2, null, 3), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, 5), "drafts_list_item_dropdown_menu");
            dt1.a.getClass();
            ty6 ty6Var = dt1.a.d;
            long floatToRawIntBits = (Float.floatToRawIntBits(-36) << 32) | (Float.floatToRawIntBits(16) & 4294967295L);
            boolean booleanValue = ((Boolean) wh50Var.getValue()).booleanValue();
            Object x4 = M.x();
            if (x4 == c0012a) {
                x4 = new neo(0, wh50Var);
                M.R(x4);
            }
            gzs gzsVar = (gzs) x4;
            int i4 = i3;
            oqu0.b(booleanValue, gzsVar, E2, ty6Var, floatToRawIntBits, null, null, false, null, kai.c(1860707076, new yzs() { // from class: xsna.oeo
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if (aVar3.t(intValue & 1, (intValue & 17) != 16)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1860707076, intValue, -1, "com.vk.draftslist.impl.ui.view.DotsMenuIconButton.<anonymous> (DraftsListViewContent.kt:343)");
                        }
                        qzu0.a.getClass();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-699612846, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-ArrowUp24> (VkIcons.kt:364)");
                        }
                        lg90 a2 = pg90.a(R.drawable.vk_icon_arrow_up_24, 0, aVar3);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        long j = wlb0.h(aVar3).getIcon().a;
                        final izs izsVar2 = izs.this;
                        boolean J = aVar3.J(izsVar2);
                        final qdo qdoVar2 = qdoVar;
                        boolean J2 = J | aVar3.J(qdoVar2);
                        Object x5 = aVar3.x();
                        final wh50 wh50Var3 = wh50Var;
                        Object obj4 = a.C0011a.a;
                        if (J2 || x5 == obj4) {
                            x5 = new b5(izsVar2, qdoVar2, wh50Var3, 1);
                            aVar3.R(x5);
                        }
                        weo.h(R.string.publish_now, a2, j, "drafts_list_menu_item_publish", (gzs) x5, aVar3, 3136);
                        lg90 X0 = qzu0.X0(aVar3);
                        long j2 = wlb0.h(aVar3).getIcon().a;
                        boolean J3 = aVar3.J(izsVar2) | aVar3.J(qdoVar2);
                        Object x6 = aVar3.x();
                        if (J3 || x6 == obj4) {
                            x6 = new xt9(izsVar2, qdoVar2, wh50Var3, 3);
                            aVar3.R(x6);
                        }
                        weo.h(R.string.newsfeed_drafts_list_menu_item_edit, X0, j2, "drafts_list_menu_item_edit", (gzs) x6, aVar3, 3136);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(823152996, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-CopyOutline24> (VkIcons.kt:1774)");
                        }
                        lg90 b2 = or.b(aVar3, -1712184830, R.drawable.vk_icon_copy_outline_24, aVar3, 0);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        long j3 = wlb0.h(aVar3).getIcon().a;
                        boolean J4 = aVar3.J(izsVar2) | aVar3.J(qdoVar2);
                        final int i5 = i;
                        boolean o = J4 | aVar3.o(i5);
                        Object x7 = aVar3.x();
                        if (o || x7 == obj4) {
                            x7 = new gzs() { // from class: xsna.seo
                                @Override // xsna.gzs
                                public final Object invoke() {
                                    wh50Var3.setValue(Boolean.FALSE);
                                    izs.this.invoke(new sdo.b(qdoVar2.a, i5));
                                    return s3q0.a;
                                }
                            };
                            aVar3.R(x7);
                        }
                        weo.h(R.string.copy_link, b2, j3, "drafts_list_menu_item_copy", (gzs) x7, aVar3, 3136);
                        ijv0.c(SeparatorDpi.At2x, SeparatorAppearance.Primary, s200.E(q630.a.a, 16, (float) 7.5d), aVar3, 438, 0);
                        lg90 B = qzu0.B(aVar3);
                        long j4 = wlb0.h(aVar3).getIcon().h;
                        Object x8 = aVar3.x();
                        if (x8 == obj4) {
                            x8 = new nh3(12, wh50Var3, wh50Var2);
                            aVar3.R(x8);
                        }
                        weo.h(R.string.delete, B, j4, "drafts_list_menu_item_delete", (gzs) x8, aVar3, 27712);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar3.h();
                    }
                    return s3q0.a;
                }
            }, M), M, 28080, 6, 992);
            M = M;
            if (((Boolean) wh50Var2.getValue()).booleanValue()) {
                M.K(-391591992);
                boolean z = ((i4 & 896) == 256) | ((i4 & 14) == 4);
                Object x5 = M.x();
                if (z || x5 == c0012a) {
                    x5 = new p78(izsVar, qdoVar, wh50Var2, 1);
                    M.R(x5);
                }
                gzs gzsVar2 = (gzs) x5;
                Object x6 = M.x();
                if (x6 == c0012a) {
                    x6 = new jni(1, wh50Var2);
                    M.R(x6);
                }
                a(gzsVar2, (gzs) x6, M, 48);
            } else {
                M.K(-406549244);
            }
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.peo
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int I = ne7.I(i2 | 1);
                    weo.b(qdo.this, i, izsVar, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void c(wh50<Boolean> wh50Var, boolean z) {
        wh50Var.setValue(Boolean.valueOf(z));
    }

    public static final void d(String str, Integer num, androidx.compose.runtime.a aVar, int i) {
        int i2;
        int i3;
        int i4;
        q630.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-1256438545);
        int i5 = (M.J(str) ? 4 : 2) | i | (M.J(num) ? 32 : 16);
        if (M.t(i5 & 1, (i5 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1256438545, i5, -1, "com.vk.draftslist.impl.ui.view.DraftImage (DraftsListViewContent.kt:206)");
            }
            float f2 = 64;
            q630.a aVar3 = q630.a.a;
            float f3 = 14;
            q630 m = hr80.m(txj0.q(aVar3, f2), wlb0.h(M).getBackground().x, vog0.b(f3));
            y18 a2 = aqw.a(0.5f, wlb0.h(M).getImage().a);
            q630 b2 = r18.b(a2.a, a2.b, m, vog0.b(f3));
            dt1.a.getClass();
            cp10 d2 = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, b2);
            cri.h7.getClass();
            LayoutNode.a aVar4 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar4);
            } else {
                M.f();
            }
            k9q0.w(M, d2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            ra8 ra8Var = ra8.a;
            if (str != null) {
                M.K(-1844360604);
                q630 E = ahn.E(ra8Var.b(aVar3, dt1.a.f), "drafts_list_item_image");
                i3 = i5;
                aVar2 = aVar3;
                i2 = 4;
                ra8Var = ra8Var;
                i4 = 0;
                gdv0.c(phw.a.a(xus.s(str, 0L, M, i5 & 14, 2), null, wkj.a.a, null, null, M, 197000, 26), f2, E, PictureRadius.Large, null, null, null, M, 3120, 112);
                M = M;
                M.j();
            } else {
                i2 = 4;
                i3 = i5;
                i4 = 0;
                aVar2 = aVar3;
                M.K(-1843903137);
                pzu0.b(pg90.a(R.drawable.vk_icon_articles_outline_28, 0, M), null, ahn.E(ra8Var.b(aVar2, dt1.a.f), "drafts_list_item_placeholder_icon"), wlb0.h(M).getIcon().n, M, 56, 0);
                M.j();
            }
            if (num != null) {
                M.K(-1843461015);
                q630 b3 = ra8Var.b(aVar2, dt1.a.j);
                float f4 = i2;
                q630 H = s200.H(b3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f4, f4, 3);
                String formatElapsedTime = DateUtils.formatElapsedTime(num.intValue());
                int intValue = num.intValue();
                int i6 = (i3 >> 3) & 14;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-752266892, i6, -1, "com.vk.draftslist.impl.ui.view.getDurationContentDescription (DraftsListViewContent.kt:265)");
                }
                int i7 = intValue / 3600;
                int i8 = (intValue / 60) % 60;
                int i9 = intValue % 60;
                M.K(-1373970976);
                StringBuilder sb = new StringBuilder();
                if (i7 > 0) {
                    M.K(-1914375712);
                    sb.append(d370.F(R.plurals.hours, i7, new Object[]{Integer.valueOf(i7)}, M, i4));
                    sb.append(" ");
                } else {
                    M.K(773077686);
                }
                M.j();
                if (i8 > 0) {
                    M.K(-1914371162);
                    sb.append(d370.F(R.plurals.minutes, i8, new Object[]{Integer.valueOf(i8)}, M, i4));
                    sb.append(" ");
                } else {
                    M.K(773077686);
                }
                M.j();
                sb.append(d370.F(R.plurals.seconds, i9, new Object[]{Integer.valueOf(i9)}, M, i4));
                String sb2 = sb.toString();
                M.j();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                androidx.compose.runtime.a aVar5 = M;
                rnu0.c(ContentBadgeSize.Medium, ContentBadgeMode.Primary, ContentBadgeAppearance.Design.Overlay, H, null, null, formatElapsedTime, sb2, null, null, true, null, false, null, aVar5, 438, 6, 15152);
                M = aVar5;
            } else {
                M.K(-1853396019);
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
            s.d = new au7(str, num, i, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x019b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void e(final qdo qdoVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        int i3;
        int i4;
        androidx.compose.runtime.a M = aVar.M(397466849);
        int i5 = i & 6;
        tpg0 tpg0Var = tpg0.a;
        if (i5 == 0) {
            i2 = (M.J(tpg0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(qdoVar) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(397466849, i2, -1, "com.vk.draftslist.impl.ui.view.DraftTitleSubtitle (DraftsListViewContent.kt:284)");
            }
            q630.a aVar2 = q630.a.a;
            q630 b2 = tpg0Var.b(1.0f, aVar2, true);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, b2);
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
            M.K(-1938388554);
            CharSequence charSequence = qdoVar.b;
            if (drm0.N(charSequence)) {
                int i6 = qdoVar.e;
                int i7 = qdoVar.f;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1898956319, 0, -1, "com.vk.draftslist.impl.ui.view.getConstructTitle (DraftsListViewContent.kt:450)");
                }
                if (i6 == 1 && i7 == 0) {
                    i3 = 464083100;
                    i4 = R.string.newsfeed_newpost_photo;
                } else if (i6 == 0 && i7 == 1) {
                    i3 = 464086492;
                    i4 = R.string.newsfeed_newpost_video;
                } else {
                    if (i6 > 1 && i7 == 0) {
                        M.K(1501884797);
                        charSequence = d370.O(R.string.newsfeed_draft_title_photos, new Object[]{Integer.valueOf(i6)}, M);
                        M.j();
                    } else if (i6 == 0 && i7 > 1) {
                        M.K(1502029629);
                        charSequence = d370.O(R.string.newsfeed_draft_title_videos, new Object[]{Integer.valueOf(i7)}, M);
                        M.j();
                    } else if (i6 == 1 && i7 == 1) {
                        i3 = 1502175236;
                        i4 = R.string.newsfeed_draft_title_photo_video;
                    } else if (i6 > 1 && i7 > 1) {
                        M.K(1502312938);
                        charSequence = d370.O(R.string.newsfeed_draft_title_photos_videos, new Object[]{Integer.valueOf(i6), Integer.valueOf(i7)}, M);
                        M.j();
                    } else if (i6 == 1 && i7 > 1) {
                        M.K(1502476215);
                        charSequence = d370.O(R.string.newsfeed_draft_title_photo_videos, new Object[]{Integer.valueOf(i7)}, M);
                        M.j();
                    } else if (i6 <= 1 || i7 != 1) {
                        M.K(1502745789);
                        M.j();
                        charSequence = "";
                    } else {
                        M.K(1502626999);
                        charSequence = d370.O(R.string.newsfeed_draft_title_photos_video, new Object[]{Integer.valueOf(i6)}, M);
                        M.j();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                }
                charSequence = zq.a(M, i3, i4, M, 0);
                if (androidx.compose.runtime.b.d()) {
                }
            }
            M.j();
            us2.b bVar = new us2.b();
            bVar.f(charSequence);
            float f2 = 1;
            yqv0.d(bVar.n(), ahn.E(s200.H(aVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, 7), "drafts_list_item_title"), wlb0.h(M).getText().m, 0, null, 2, false, 1, null, null, wlb0.l(M).T, M, 100663344, 6, 6904);
            yqv0.c(qdoVar.c, ahn.E(s200.H(aVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), "drafts_list_item_subtitle"), wlb0.h(M).getText().p, null, null, 0, 0, null, 2, false, 0, 1, null, wlb0.l(M).i0, M, 100663344, 48, 5880);
            M = M;
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.leo
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(i | 1);
                    weo.e(qdo.this, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void f(final qdo qdoVar, final int i, final izs<? super sdo, s3q0> izsVar, androidx.compose.runtime.a aVar, final int i2) {
        int i3;
        androidx.compose.runtime.a M = aVar.M(-1932856684);
        if ((i2 & 6) == 0) {
            i3 = (M.J(qdoVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= M.o(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= M.y(izsVar) ? 256 : 128;
        }
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1932856684, i3, -1, "com.vk.draftslist.impl.ui.view.DraftView (DraftsListViewContent.kt:186)");
            }
            q630.a aVar2 = q630.a.a;
            q630 f2 = txj0.f(aVar2, 1.0f);
            boolean z = ((i3 & 896) == 256) | ((i3 & 14) == 4);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new yq1(8, izsVar, qdoVar);
                M.R(x);
            }
            float f3 = 4;
            q630 H = s200.H(ojc.c(f2, false, null, null, (gzs) x, 15), 16, f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, 4);
            boolean z2 = (i3 & 112) == 32;
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new ueo(i, 0);
                M.R(x2);
            }
            q630 b2 = egi0.b(H, false, (izs) x2);
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, b2);
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
            d(qdoVar.d, qdoVar.g, M, 0);
            f9t.e(txj0.q(aVar2, 12), M, 6);
            e(qdoVar, M, ((i3 << 3) & 112) | 6);
            b(qdoVar, i, izsVar, M, i3 & IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.veo
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int I = ne7.I(i2 | 1);
                    weo.f(qdo.this, i, izsVar, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void g(final afo.a aVar, dlv0 dlv0Var, final izs<? super sdo, s3q0> izsVar, androidx.compose.runtime.a aVar2, int i) {
        androidx.compose.runtime.a M = aVar2.M(-808921998);
        int i2 = (M.J(aVar) ? 4 : 2) | i | (M.y(izsVar) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-808921998, i2, -1, "com.vk.draftslist.impl.ui.view.DraftsListViewContent (DraftsListViewContent.kt:90)");
            }
            Boolean valueOf = Boolean.valueOf(aVar.f);
            boolean z = (i2 & 14) == 4;
            int i3 = i2 & 896;
            boolean z2 = z | (i3 == 256);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z2 || x == c0012a) {
                x = new a(aVar, dlv0Var, izsVar, null);
                M.R(x);
            }
            bap.g(valueOf, (wzs) x, M, 0);
            boolean z3 = aVar.c;
            boolean z4 = i3 == 256;
            Object x2 = M.x();
            if (z4 || x2 == c0012a) {
                x2 = new z87(izsVar, 4);
                M.R(x2);
            }
            dge0.a(z3, (gzs) x2, txj0.d(q630.a.a, 1.0f), null, null, kai.c(-1328184992, new yzs() { // from class: xsna.qeo
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if (aVar3.t(intValue & 1, (intValue & 17) != 16)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1328184992, intValue, -1, "com.vk.draftslist.impl.ui.view.DraftsListViewContent.<anonymous> (DraftsListViewContent.kt:106)");
                        }
                        xvy a2 = zvy.a(0, 3, aVar3);
                        boolean J = aVar3.J(a2);
                        izs izsVar2 = izs.this;
                        boolean J2 = J | aVar3.J(izsVar2);
                        Object x3 = aVar3.x();
                        Object obj4 = a.C0011a.a;
                        if (J2 || x3 == obj4) {
                            x3 = new weo.b(a2, izsVar2, null);
                            aVar3.R(x3);
                        }
                        bap.g(a2, (wzs) x3, aVar3, 0);
                        afo.a aVar4 = aVar;
                        Boolean valueOf2 = Boolean.valueOf(aVar4.g);
                        boolean J3 = aVar3.J(aVar4) | aVar3.J(a2) | aVar3.J(izsVar2);
                        Object x4 = aVar3.x();
                        if (J3 || x4 == obj4) {
                            x4 = new weo.c(aVar4, a2, izsVar2, null);
                            aVar3.R(x4);
                        }
                        bap.g(valueOf2, (wzs) x4, aVar3, 0);
                        q630 E = ahn.E(txj0.d(q630.a.a, 1.0f), "drafts_list");
                        boolean J4 = aVar3.J(aVar4) | aVar3.J(izsVar2);
                        Object x5 = aVar3.x();
                        if (J4 || x5 == obj4) {
                            x5 = new qd1(13, aVar4, izsVar2);
                            aVar3.R(x5);
                        }
                        x1v0.a(E, a2, null, null, null, null, false, null, (izs) x5, aVar3, 6, IronSourceError.ERROR_CODE_INIT_FAILED);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar3.h();
                    }
                    return s3q0.a;
                }
            }, M), M, 196992, 24);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wuh(i, 1, aVar, dlv0Var, izsVar);
        }
    }

    public static final void h(final int i, final lg90 lg90Var, final long j, String str, final gzs<s3q0> gzsVar, androidx.compose.runtime.a aVar, final int i2) {
        String str2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(1085984806);
        int i3 = (M.o(i) ? 4 : 2) | i2 | (M.y(lg90Var) ? 32 : 16) | (M.p(j) ? 256 : 128);
        if ((i2 & 24576) == 0) {
            i3 |= M.y(gzsVar) ? 16384 : 8192;
        }
        if (M.t(i3 & 1, (i3 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1085984806, i3, -1, "com.vk.draftslist.impl.ui.view.MenuCellButton (DraftsListViewContent.kt:404)");
            }
            str2 = str;
            int i4 = ((i3 >> 9) & 112) | 12587008;
            int i5 = i3 << 6;
            aVar2 = M;
            qiu0.a(d370.N(i, i3 & 14, M), gzsVar, ahn.E(s200.H(q630.a.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11), str2), lg90Var, new l5g(j), null, 0, CellButton$Appearance.Neutral, null, null, null, false, aVar2, i4 | (i5 & 7168) | (i5 & 57344), 8032);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            str2 = str;
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            final String str3 = str2;
            s.d = new wzs() { // from class: xsna.teo
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    weo.h(i, lg90Var, j, str3, gzsVar, (androidx.compose.runtime.a) obj, ne7.I(i2 | 1));
                    return s3q0.a;
                }
            };
        }
    }
}
