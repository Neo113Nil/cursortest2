package xsna;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.X2;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.defaults.SpinnerMode;
import com.vk.core.compose.component.defaults.SpinnerSize;
import com.vk.core.compose.component.defaults.SpinnerState;
import com.vk.core.compose.component.group.header.b;
import com.vk.core.compose.component.group.header.f;
import com.vk.ecomm.onlinebooking.impl.calendar.BookingCalendarScreenState;
import com.vk.ecomm.onlinebooking.impl.calendar.a;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.cri;
import xsna.dt1;
import xsna.efu;
import xsna.pn7.a;
import xsna.q630;

/* compiled from: BookingCalendarScreenMviView.kt */
/* loaded from: classes18.dex */
public final class pn7 extends i6v0<tn7, com.vk.ecomm.onlinebooking.impl.calendar.a> {
    public final mzp0 f;
    public final yw90 g;
    public final q630 h;
    public final q630 i;
    public final q630 j;

    /* compiled from: BookingCalendarScreenMviView.kt */
    @b6l(c = "com.vk.ecomm.onlinebooking.impl.calendar.ui.BookingCalendarScreenMviView$ThemedContent$2$1$1$1", f = "BookingCalendarScreenMviView.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        int label;

        public a(spj<? super a> spjVar) {
            super(2, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return pn7.this.new a(spjVar);
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
            pn7 pn7Var = pn7.this;
            mzp0 mzp0Var = pn7Var.f;
            if (mzp0Var != null) {
                mzp0Var.d(pn7Var.c());
            }
            yw90 yw90Var = pn7.this.g;
            if (yw90Var != null) {
                yw90Var.a();
            }
            return s3q0.a;
        }
    }

    /* compiled from: BookingCalendarScreenMviView.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BookingCalendarScreenState.TimeSlotSelector.Block.Kind.values().length];
            try {
                iArr[BookingCalendarScreenState.TimeSlotSelector.Block.Kind.Night.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BookingCalendarScreenState.TimeSlotSelector.Block.Kind.Morning.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BookingCalendarScreenState.TimeSlotSelector.Block.Kind.Day.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BookingCalendarScreenState.TimeSlotSelector.Block.Kind.Evening.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public pn7(f5z f5zVar, Context context, mzp0 mzp0Var, yw90 yw90Var) {
        super(context, f5zVar);
        this.f = mzp0Var;
        this.g = yw90Var;
        float f = 16;
        q630.a aVar = q630.a.a;
        this.h = txj0.f(s200.H(aVar, f, f, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8), 1.0f);
        this.i = txj0.f(aVar, 1.0f);
        this.j = s200.E(aVar, 32, 48);
    }

    public static final void i(jj jjVar, final boolean z, final String str, String str2, gzs<s3q0> gzsVar, androidx.compose.runtime.a aVar, int i) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1964143423, i, -1, "com.vk.ecomm.onlinebooking.impl.calendar.ui.BookingCalendarScreenMviView.BookingCalendarMasterFilter.Item (BookingCalendarScreenMviView.kt:211)");
        }
        q630 E = ahn.E(q630.a.a, str2);
        boolean z2 = ((((i & 112) ^ 48) > 32 && aVar.l(z)) || (i & 48) == 32) | ((((i & 57344) ^ 24576) > 16384 && aVar.J(gzsVar)) || (i & 24576) == 16384);
        Object x = aVar.x();
        if (z2 || x == a.C0011a.a) {
            x = new gn7(z, gzsVar);
            aVar.R(x);
        }
        jjVar.b(z, (gzs) x, kai.c(1414809229, new zzs() { // from class: xsna.in7
            @Override // xsna.zzs
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                ((Boolean) obj2).getClass();
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj3;
                int intValue = ((Integer) obj4).intValue();
                if (aVar2.t(intValue & 1, (intValue & 129) != 128)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1414809229, intValue, -1, "com.vk.ecomm.onlinebooking.impl.calendar.ui.BookingCalendarScreenMviView.BookingCalendarMasterFilter.Item.<anonymous> (BookingCalendarScreenMviView.kt:221)");
                    }
                    q630 F = s200.F(12, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, q630.a.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar2.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    lco0 text = ylu0Var.getText();
                    long j = z ? text.a : text.p;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                    }
                    wuv0 wuv0Var = (wuv0) aVar2.r(rrv0.c);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    yqv0.c(str, F, j, null, null, 0, 0, null, 2, false, 0, 1, null, wuv0Var.O, aVar2, 100663344, 48, 5880);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            }
        }, aVar), E, aVar, ((i >> 3) & 14) | 384 | ((i << 12) & 57344), 0);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
    }

    @Override // xsna.xpo0
    public final /* bridge */ /* synthetic */ void a(ao50 ao50Var, izs izsVar, androidx.compose.runtime.a aVar) {
        l((tn7) ao50Var, izsVar, aVar, 512);
    }

    public final void h(sn7 sn7Var, izs<? super a.h, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1828751607);
        int i2 = (M.J(sn7Var) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16) | (M.y(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1828751607, i2, -1, "com.vk.ecomm.onlinebooking.impl.calendar.ui.BookingCalendarScreenMviView.BookingCalendarMasterFilter (BookingCalendarScreenMviView.kt:209)");
            }
            u6u0.e(sn7Var.b ? 1 : 0, kai.c(440944128, new mn7(0, sn7Var, izsVar), M), ahn.E(this.i, "masters_tabs_row"), 0L, false, null, M, 48, 56);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new nn7(i, 0, this, sn7Var, izsVar);
        }
    }

    public final void j(String str, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(189170477);
        int i2 = (M.J(str) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(189170477, i2, -1, "com.vk.ecomm.onlinebooking.impl.calendar.ui.BookingCalendarScreenMviView.GroupLabel (BookingCalendarScreenMviView.kt:258)");
            }
            q630 m = kci.m(-12, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, q630.a.a);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, m);
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
            k9q0.w(M, c, cri.a.d);
            com.vk.core.compose.component.group.header.g.b(f.a.a(str, null, null, null, null, null, null, null, false, M, (i2 & 14) | 805306368, 510), null, b.d.a, null, null, null, false, M, 384, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new jn7(this, str, i, 0);
        }
    }

    public final void k(BookingCalendarScreenState.TimeSlotSelector.a aVar, izs<? super com.vk.ecomm.onlinebooking.impl.calendar.a, s3q0> izsVar, androidx.compose.runtime.a aVar2, int i) {
        androidx.compose.runtime.a aVar3;
        String N;
        String N2;
        String N3;
        String str;
        String str2;
        String str3;
        androidx.compose.runtime.a M = aVar2.M(1384916141);
        int i2 = i | (M.J(aVar) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.y(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1384916141, i2, -1, "com.vk.ecomm.onlinebooking.impl.calendar.ui.BookingCalendarScreenMviView.MasterBusy (BookingCalendarScreenMviView.kt:274)");
            }
            if (aVar.c) {
                M.K(581301974);
                N = d370.N(R.string.booking_master_busy_title, 0, M);
                N2 = d370.N(R.string.booking_master_busy_message, 0, M);
                N3 = d370.N(R.string.booking_master_busy_button, 0, M);
                M.j();
                str = "calendar_busy_title";
                str2 = "calendar_busy_description";
                str3 = "calendar_busy_cta";
            } else {
                M.K(581688885);
                N = d370.N(R.string.booking_master_unavailable_title, 0, M);
                N2 = d370.N(R.string.booking_master_unavailable_message, 0, M);
                N3 = d370.N(R.string.booking_master_unavailable_button, 0, M);
                M.j();
                str = "calendar_any_busy_title";
                str2 = "calendar_any_busy_description";
                str3 = "calendar_any_busy_cta";
            }
            String str4 = N2;
            String str5 = N3;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.o, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, this.j);
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
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-377844438, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-CalendarOutline56> (VkSdkIcons.kt:194)");
            }
            lg90 a3 = pg90.a(R.drawable.vk_icon_calendar_outline_56, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            String str6 = str3;
            pzu0.b(a3, null, null, wlb0.h(M).getIcon().l, M, 56, 4);
            q630.a aVar5 = q630.a.a;
            f9t.e(txj0.h(aVar5, 12), M, 6);
            yqv0.c(N, ahn.E(aVar5, str), wlb0.h(M).getText().m, null, null, 0, 3, null, 0, false, 0, 0, null, wlb0.l(M).C, M, 0, 0, 8120);
            f9t.e(txj0.h(aVar5, 8), M, 6);
            yqv0.c(str4, ahn.E(aVar5, str2), wlb0.h(M).getText().p, null, null, 0, 3, null, 0, false, 0, 0, null, wlb0.l(M).N, M, 0, 0, 8120);
            if (aVar.c || aVar.d) {
                M.K(-1933020208);
                f9t.e(txj0.h(aVar5, 16), M, 6);
                q630 E = ahn.E(aVar5, str6);
                ButtonSize buttonSize = ButtonSize.Medium;
                ButtonStyle buttonStyle = ButtonStyle.Secondary;
                ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
                boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
                Object x = M.x();
                if (z || x == a.C0011a.a) {
                    x = new qk(3, aVar, izsVar);
                    M.R(x);
                }
                bhu0.e((gzs) x, buttonSize, buttonStyle, buttonAppearance, E, null, false, false, null, null, null, str5, null, null, null, null, false, null, null, null, M, X2.b.f, 0, 0, 4190176);
                aVar3 = M;
                aVar3.j();
            } else {
                M.K(-1947754229);
                M.j();
                aVar3 = M;
            }
            aVar3.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar3 = M;
            aVar3.h();
        }
        androidx.compose.runtime.f s = aVar3.s();
        if (s != null) {
            s.d = new fn7(i, 0, this, aVar, izsVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l(tn7 tn7Var, final izs<? super com.vk.ecomm.onlinebooking.impl.calendar.a, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        boolean z;
        boolean booleanValue;
        androidx.compose.runtime.a M = aVar.M(-2008767275);
        int i3 = i | (M.J(tn7Var) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.y(this) ? 256 : 128);
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2008767275, i3, -1, "com.vk.ecomm.onlinebooking.impl.calendar.ui.BookingCalendarScreenMviView.ThemedContent (BookingCalendarScreenMviView.kt:99)");
            }
            T value = d(rn7.a, new n0u0[]{tn7Var.a}, M, (i3 & 896) | 518).getValue();
            final com.vk.ecomm.onlinebooking.impl.calendar.j jVar = value instanceof com.vk.ecomm.onlinebooking.impl.calendar.j ? (com.vk.ecomm.onlinebooking.impl.calendar.j) value : null;
            if (jVar != null) {
                M.K(-1406141776);
                final BookingCalendarScreenState.a aVar2 = (BookingCalendarScreenState.a) jk50.a(jVar.f, M, 0, 3).getValue();
                jai c = kai.c(-29943671, new hn7(jVar, aVar2, this, izsVar), M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                z = true;
                i2 = -1411784179;
                phv0.b(null, c, null, null, null, 0, ylu0Var.getBackground().g, 0L, kai.c(-1006659436, new yzs() { // from class: xsna.kn7
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // xsna.yzs
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                        int intValue = ((Integer) obj3).intValue();
                        int c2 = aVar3.c();
                        if (aVar3.t(intValue & 1, (intValue & 17) != 16)) {
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(-1006659436, intValue, -1, "com.vk.ecomm.onlinebooking.impl.calendar.ui.BookingCalendarScreenMviView.ThemedContent.<anonymous> (BookingCalendarScreenMviView.kt:147)");
                            }
                            com.vk.ecomm.onlinebooking.impl.calendar.j jVar2 = com.vk.ecomm.onlinebooking.impl.calendar.j.this;
                            boolean booleanValue2 = ((Boolean) jk50.c(jVar2.e, aVar3).getValue()).booleanValue();
                            q630 d = txj0.d(q630.a.a, 1.0f);
                            dt1.a.getClass();
                            cp10 d2 = ja8.d(booleanValue2 ? dt1.a.f : dt1.a.b, false);
                            int hashCode = Long.hashCode(n34.n(aVar3));
                            sy90 D = aVar3.D();
                            q630 c3 = qri.c(aVar3, d);
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
                            k9q0.w(aVar3, d2, cri.a.f);
                            k9q0.w(aVar3, D, cri.a.e);
                            k9q0.w(aVar3, Integer.valueOf(hashCode), cri.a.g);
                            k9q0.t(aVar3, cri.a.h);
                            k9q0.w(aVar3, c3, cri.a.d);
                            aVar3.K(636087529);
                            s3q0 s3q0Var = s3q0.a;
                            pn7 pn7Var = this;
                            boolean y = aVar3.y(pn7Var);
                            Object x = aVar3.x();
                            a.C0011a.C0012a c0012a = a.C0011a.a;
                            if (y || x == c0012a) {
                                x = pn7Var.new a(null);
                                aVar3.R(x);
                            }
                            bap.g(s3q0Var, (wzs) x, aVar3, 6);
                            BookingCalendarScreenState.a aVar5 = aVar2;
                            izs<? super com.vk.ecomm.onlinebooking.impl.calendar.a, s3q0> izsVar2 = izsVar;
                            if (aVar5 != null) {
                                aVar3.K(636280379);
                                com.vk.ecomm.onlinebooking.impl.common.a aVar6 = aVar5.a;
                                boolean J = aVar3.J(izsVar2) | aVar3.J(aVar5);
                                Object x2 = aVar3.x();
                                if (J || x2 == c0012a) {
                                    x2 = new yk(1, izsVar2, aVar5);
                                    aVar3.R(x2);
                                }
                                iq7.a(aVar6, (gzs) x2, aVar3, 0);
                                aVar3.C(c2);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                return s3q0Var;
                            }
                            aVar3.K(627825780);
                            aVar3.j();
                            if (booleanValue2) {
                                aVar3.K(636628850);
                                pn7Var.n(8, aVar3);
                                aVar3.j();
                            } else {
                                aVar3.K(636700646);
                                pn7Var.m(jVar2, izsVar2, aVar3, 512);
                                aVar3.j();
                            }
                            if (gp.d(aVar3)) {
                                androidx.compose.runtime.b.e();
                            }
                        } else {
                            aVar3.h();
                        }
                        return s3q0.a;
                    }
                }, M), M, 805306416, 381);
            } else {
                i2 = -1411784179;
                z = true;
                M.K(-1411784179);
            }
            M.j();
            if (jVar == null) {
                M.K(-1402777047);
                M.j();
                booleanValue = z;
            } else {
                M.K(-1984911718);
                booleanValue = ((Boolean) jk50.c(jVar.d, M).getValue()).booleanValue();
                M.j();
            }
            if (booleanValue) {
                M.K(-1402711347);
                zfr0.d(SpinnerState.Loading, null, null, null, null, 0L, 0L, SpinnerSize.Size56, null, M, 12582918, 382);
            } else {
                M.K(i2);
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
            s.d = new er3(this, tn7Var, izsVar, i, 1);
        }
    }

    public final void m(com.vk.ecomm.onlinebooking.impl.calendar.j jVar, izs<? super com.vk.ecomm.onlinebooking.impl.calendar.a, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(1259521886);
        int i2 = i | (M.J(jVar) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.y(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1259521886, i2, -1, "com.vk.ecomm.onlinebooking.impl.calendar.ui.BookingCalendarScreenMviView.TimeSlots (BookingCalendarScreenMviView.kt:184)");
            }
            BookingCalendarScreenState.TimeSlotSelector timeSlotSelector = (BookingCalendarScreenState.TimeSlotSelector) jk50.c(jVar.c.a, M).getValue();
            q630 E = ahn.E(this.i, "main_list");
            efu.b bVar = new efu.b(4);
            float f = 12;
            u890 u890Var = new u890(f, 16, f, 32);
            boolean J = M.J(timeSlotSelector) | ((i2 & 896) == 256 || M.y(this)) | ((i2 & 112) == 32);
            Object x = M.x();
            if (J || x == a.C0011a.a) {
                x = new on7(timeSlotSelector, this, izsVar, 0);
                M.R(x);
            }
            aVar2 = M;
            uqy.b(bVar, E, null, u890Var, null, null, null, false, null, (izs) x, aVar2, 0, 0, 1012);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new an7(i, 0, this, jVar, izsVar);
        }
    }

    public final void n(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-1646447555);
        int i2 = i & 1;
        if (M.t(i2, i2 != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1646447555, i, -1, "com.vk.ecomm.onlinebooking.impl.calendar.ui.BookingCalendarScreenMviView.TimeSlotsLoading (BookingCalendarScreenMviView.kt:341)");
            }
            SpinnerState spinnerState = SpinnerState.Loading;
            SpinnerSize spinnerSize = SpinnerSize.Size56;
            SpinnerMode spinnerMode = SpinnerMode.Overlay;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            iyk0 iyk0Var = rrv0.a;
            ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getBackground().g;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            zfr0.d(spinnerState, null, spinnerMode, null, null, j, ylu0Var2.getIcon().f, spinnerSize, null, M, 12583302, 282);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new bn7(this, i, 0);
        }
    }
}
