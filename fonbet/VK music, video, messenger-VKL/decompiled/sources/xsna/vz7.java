package xsna;

import android.content.Context;
import android.view.View;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.defaults.SpinnerSize;
import com.vk.core.compose.component.defaults.SpinnerState;
import com.vk.core.compose.component.group.header.GroupHeader$Right;
import com.vk.core.compose.component.group.header.b;
import com.vk.core.compose.component.group.header.f;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.d;
import com.vk.ecomm.design.compose.booking.BookingCard$BookingCardType;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingActionResult;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingServiceType;
import com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2.k;
import com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2.o;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.ok.gl.tf.Tensorflow;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: BookingStartScreen.kt */
/* loaded from: classes18.dex */
public final class vz7 {

    /* compiled from: BookingStartScreen.kt */
    @b6l(c = "com.vk.ecomm.onlinebooking.impl.main.presentation.BookingStartScreenKt$HandleErrorState$1$1", f = "BookingStartScreen.kt", l = {228}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ dlv0 $snackbarHostState;
        final /* synthetic */ o.a $viewState;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(o.a aVar, Context context, dlv0 dlv0Var, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$viewState = aVar;
            this.$context = context;
            this.$snackbarHostState = dlv0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$viewState, this.$context, this.$snackbarHostState, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                kotlin.a.a(obj);
                BookingActionResult bookingActionResult = this.$viewState.l;
                if (bookingActionResult != null) {
                    Context context = this.$context;
                    int i3 = BookingActionResult.b.$EnumSwitchMapping$0[bookingActionResult.ordinal()];
                    if (i3 == 1) {
                        i = R.string.booking_service_cancellation_success;
                    } else {
                        if (i3 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i = R.string.booking_service_cancellation_failure;
                    }
                    String string = context.getString(i);
                    dlv0 dlv0Var = this.$snackbarHostState;
                    this.L$0 = null;
                    this.label = 1;
                    if (dlv0.d(dlv0Var, string, null, this, 30) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            return s3q0.a;
        }
    }

    /* compiled from: BookingStartScreen.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BookingServiceType.values().length];
            try {
                iArr[BookingServiceType.INDIVIDUAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BookingServiceType.GROUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void a(int i, androidx.compose.runtime.a aVar, List list, izs izsVar) {
        androidx.compose.runtime.f s;
        wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> hz7Var;
        BookingCard$BookingCardType bookingCard$BookingCardType;
        q630 q630Var;
        com.vk.core.compose.component.semantics.a b2;
        com.vk.core.compose.component.semantics.a b3;
        androidx.compose.runtime.a M = aVar.M(-2139821428);
        int i2 = 2;
        int i3 = 32;
        int i4 = (M.J(list) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16);
        if (M.t(i4 & 1, (i4 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2139821428, i4, -1, "com.vk.ecomm.onlinebooking.impl.main.presentation.BookingMainMenuItem (BookingStartScreen.kt:303)");
            }
            if (list.isEmpty()) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                s = M.s();
                if (s != null) {
                    hz7Var = new f6(list, izsVar, i, 2);
                    s.d = hz7Var;
                }
                return;
            }
            float f = 16;
            float f2 = 12;
            q630 E = ahn.E(s200.H(txj0.f(q630.a.a, 1.0f), f, f2, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8), "select_services_menu_option");
            a.j g = androidx.compose.foundation.layout.a.g(f2);
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(g, dt1.a.n, M, 6);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, E);
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
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            int size = list.size();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (size == 1) {
                M.K(-1893365941);
                BookingCard$BookingCardType bookingCard$BookingCardType2 = BookingCard$BookingCardType.COMMON;
                boolean z = ((i4 & 14) == 4) | ((i4 & 112) == 32);
                Object x = M.x();
                if (z || x == c0012a) {
                    x = new com.vk.movika.sdk.base.ui.k(2, izsVar, list);
                    M.R(x);
                }
                gzs gzsVar = (gzs) x;
                int i5 = b.$EnumSwitchMapping$0[((BookingServiceType) j5g.Y(new wow(list))).ordinal()];
                if (i5 == 1) {
                    b3 = cq.b("individual_service_card", null, 3);
                } else {
                    if (i5 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    b3 = cq.b("group_service_card", null, 3);
                }
                eo7.a(blk.Q(bookingCard$BookingCardType2, gzsVar, b3, M, 3078), null, M, 0);
                M.j();
            } else {
                M.K(-1892655607);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    BookingServiceType bookingServiceType = (BookingServiceType) it.next();
                    bookingServiceType.getClass();
                    int i6 = BookingServiceType.b.$EnumSwitchMapping$0[bookingServiceType.ordinal()];
                    if (i6 == 1) {
                        bookingCard$BookingCardType = BookingCard$BookingCardType.INDIVIDUAL;
                    } else {
                        if (i6 != i2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        bookingCard$BookingCardType = BookingCard$BookingCardType.GROUP;
                    }
                    boolean o = M.o(bookingServiceType.ordinal()) | ((i4 & 112) == i3);
                    Object x2 = M.x();
                    if (o || x2 == c0012a) {
                        x2 = new com.vk.movika.sdk.base.ui.l(3, izsVar, bookingServiceType);
                        M.R(x2);
                    }
                    gzs gzsVar2 = (gzs) x2;
                    int i7 = b.$EnumSwitchMapping$0[bookingServiceType.ordinal()];
                    if (i7 == 1) {
                        q630Var = null;
                        b2 = cq.b("individual_service_card", null, 3);
                    } else {
                        if (i7 != i2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        q630Var = null;
                        b2 = cq.b("group_service_card", null, 3);
                    }
                    eo7.a(blk.Q(bookingCard$BookingCardType, gzsVar2, b2, M, 3072), q630Var, M, 0);
                    i2 = 2;
                    i3 = 32;
                }
                M.j();
            }
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        s = M.s();
        if (s != null) {
            hz7Var = new hz7(list, izsVar, i, 0);
            s.d = hz7Var;
        }
    }

    public static final void b(o.a aVar, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar2, int i) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar2.M(1494779076);
        int i2 = i | (M.J(aVar) ? 4 : 2) | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1494779076, i2, -1, "com.vk.ecomm.onlinebooking.impl.main.presentation.BookingMenuContent (BookingStartScreen.kt:237)");
            }
            q630Var2 = q630Var;
            q630 E = ahn.E(q630Var2, "main_list");
            a.j g = androidx.compose.foundation.layout.a.g(12);
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new defpackage.h0(3, aVar, izsVar);
                M.R(x);
            }
            lqy.a(E, null, null, g, null, null, false, null, (izs) x, M, 24576, 494);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            q630Var2 = q630Var;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ez7(aVar, izsVar, q630Var2, i, 0);
        }
    }

    public static final void c(final o.a aVar, final Object obj, final yw90 yw90Var, final View view, final izs izsVar, androidx.compose.runtime.a aVar2, int i) {
        androidx.compose.runtime.a M = aVar2.M(-639448248);
        int i2 = i | (M.J(aVar) ? 4 : 2) | (M.J(obj) ? 32 : 16) | (M.J(yw90Var) ? 256 : 128) | (M.y(view) ? 2048 : 1024) | (M.y(izsVar) ? 16384 : 8192);
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-639448248, i2, -1, "com.vk.ecomm.onlinebooking.impl.main.presentation.BookingMenuView (BookingStartScreen.kt:146)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = yq.f(M);
            }
            dlv0 dlv0Var = (dlv0) x;
            g(dlv0Var, aVar, M, ((i2 << 3) & 112) | 6);
            if (aVar.j) {
                M.K(-1622287774);
                int i3 = i2 & 57344;
                boolean z = i3 == 16384;
                Object x2 = M.x();
                if (z || x2 == c0012a) {
                    x2 = new m77(izsVar, 2);
                    M.R(x2);
                }
                gzs gzsVar = (gzs) x2;
                boolean z2 = i3 == 16384;
                Object x3 = M.x();
                if (z2 || x3 == c0012a) {
                    x3 = new se1(izsVar, 1);
                    M.R(x3);
                }
                gzs gzsVar2 = (gzs) x3;
                boolean z3 = i3 == 16384;
                Object x4 = M.x();
                if (z3 || x4 == c0012a) {
                    x4 = new oz7(izsVar, 0);
                    M.R(x4);
                }
                izs izsVar2 = (izs) x4;
                av7 av7Var = aVar.g;
                alk.a(gzsVar, gzsVar2, izsVar2, sni.s(av7Var != null ? av7Var.e : null), cq.b("cancel_record_confirmation_dialog", null, 3), M, 0);
            } else {
                M.K(-1628732550);
            }
            M.j();
            q630 d = txj0.d(q630.a.a, 1.0f);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            phv0.b(d, kai.c(-1333052959, new gx(2, aVar, izsVar), M), null, kai.c(-1313511837, new y61(1, dlv0Var, aVar), M), null, 0, ylu0Var.getBackground().g, 0L, kai.c(433349484, new yzs() { // from class: xsna.qz7
                @Override // xsna.yzs
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj3;
                    int intValue = ((Integer) obj4).intValue();
                    if (aVar3.t(intValue & 1, (intValue & 17) != 16)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(433349484, intValue, -1, "com.vk.ecomm.onlinebooking.impl.main.presentation.BookingMenuView.<anonymous> (BookingStartScreen.kt:184)");
                        }
                        o.a aVar4 = o.a.this;
                        boolean z4 = aVar4.c;
                        k.a aVar5 = aVar4.b;
                        q630.a aVar6 = q630.a.a;
                        if (z4) {
                            aVar3.K(-757155774);
                            zfr0.f(SpinnerState.Loading, txj0.d(aVar6, 1.0f), null, 0L, SpinnerSize.Size56, null, aVar3, 24630, 44);
                            aVar3.j();
                        } else {
                            izs izsVar3 = izsVar;
                            a.C0011a.C0012a c0012a2 = a.C0011a.a;
                            if (aVar5 != null) {
                                aVar3.K(-756903837);
                                com.vk.ecomm.onlinebooking.impl.common.a aVar7 = aVar5.a;
                                boolean J = aVar3.J(izsVar3) | aVar3.J(aVar4);
                                Object x5 = aVar3.x();
                                if (J || x5 == c0012a2) {
                                    x5 = new com.vk.movika.sdk.base.ui.r0(5, izsVar3, aVar4);
                                    aVar3.R(x5);
                                }
                                iq7.a(aVar7, (gzs) x5, aVar3, 0);
                                aVar3.j();
                            } else {
                                aVar3.K(-756636741);
                                vz7.b(aVar4, izsVar3, txj0.d(aVar6, 1.0f), aVar3, 384);
                                s3q0 s3q0Var = s3q0.a;
                                Object obj5 = obj;
                                boolean J2 = aVar3.J(obj5);
                                View view2 = view;
                                boolean y = J2 | aVar3.y(view2);
                                yw90 yw90Var2 = yw90Var;
                                boolean J3 = y | aVar3.J(yw90Var2);
                                Object x6 = aVar3.x();
                                if (J3 || x6 == c0012a2) {
                                    x6 = new tz7(obj5, view2, yw90Var2, null);
                                    aVar3.R(x6);
                                }
                                bap.g(s3q0Var, (wzs) x6, aVar3, 6);
                                aVar3.j();
                            }
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar3.h();
                    }
                    return s3q0.a;
                }
            }, M), M, 805309494, 372);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new rz7(aVar, obj, yw90Var, view, izsVar, i, 0);
        }
    }

    public static final void d(final av7 av7Var, final boolean z, final String str, final izs<? super com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2.a, s3q0> izsVar, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a aVar2;
        int i2;
        a.C0011a.C0012a c0012a;
        androidx.compose.runtime.a M = aVar.M(-1879872997);
        int i3 = i | (M.J(av7Var) ? 4 : 2) | (M.l(z) ? 32 : 16) | (M.J(str) ? 256 : 128) | (M.y(izsVar) ? 2048 : 1024);
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1879872997, i3, -1, "com.vk.ecomm.onlinebooking.impl.main.presentation.BookingRecordItem (BookingStartScreen.kt:350)");
            }
            q630.a aVar3 = q630.a.a;
            q630 f = txj0.f(aVar3, 1.0f);
            a.j g = androidx.compose.foundation.layout.a.g(6);
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(g, dt1.a.n, M, 6);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, f);
            cri.h7.getClass();
            LayoutNode.a aVar4 = cri.a.b;
            ikg0 ikg0Var = null;
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
            q630 E = ahn.E(aVar3, "records_subtitle");
            com.vk.core.compose.component.group.header.f a3 = f.a.a(d370.N(R.string.bookings_menu_records, 0, M), null, null, null, null, null, null, null, false, M, 805306368, 510);
            androidx.compose.runtime.a aVar5 = M;
            b.d dVar = b.d.a;
            a.C0011a.C0012a c0012a2 = a.C0011a.a;
            if (z) {
                aVar5.K(1674826171);
                String N = d370.N(R.string.bookings_menu_show_all, 0, aVar5);
                ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
                ButtonStyle buttonStyle = ButtonStyle.Link;
                boolean z2 = (i3 & 7168) == 2048;
                Object x = aVar5.x();
                if (z2 || x == c0012a2) {
                    x = new iz7(izsVar, 0);
                    aVar5.R(x);
                }
                gzs gzsVar = (gzs) x;
                c0012a = c0012a2;
                i2 = 3;
                aVar5 = aVar5;
                ikg0Var = GroupHeader$Right.c.a(GroupHeader$Right.a.C0743a.C0744a.a(N, gzsVar, null, buttonStyle, buttonAppearance, null, null, aVar5, 27648, 32740), null, null, cq.b("show_all_subtitle", null, 3), aVar5, 6);
                aVar5.j();
            } else {
                i2 = 3;
                c0012a = c0012a2;
                aVar5.K(1675388697);
                aVar5.j();
            }
            androidx.compose.runtime.a aVar6 = aVar5;
            com.vk.core.compose.component.group.header.g.b(a3, E, dVar, null, null, ikg0Var, false, aVar6, Tensorflow.FRAME_WIDTH, 88);
            q630 E2 = ahn.E(s200.F(16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar3), "record_cell");
            int i4 = i3 & 14;
            boolean z3 = ((i3 & 7168) == 2048) | (i4 == 4);
            Object x2 = aVar6.x();
            if (z3 || x2 == c0012a) {
                x2 = new he3(1, izsVar, av7Var);
                aVar6.R(x2);
            }
            mt7.b(av7Var, str, E2, (izs) x2, aVar6, ((i3 >> i2) & 112) | i4 | 384, 0);
            aVar2 = aVar6;
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs(z, str, izsVar, i) { // from class: xsna.jz7
                public final /* synthetic */ boolean c;
                public final /* synthetic */ String d;
                public final /* synthetic */ izs e;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    vz7.d(av7.this, this.c, this.d, this.e, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void e(com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2.o oVar, Object obj, yw90 yw90Var, View view, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        izs izsVar2;
        View view2;
        yw90 yw90Var2;
        Object obj2;
        androidx.compose.runtime.a M = aVar.M(-504102279);
        int i2 = (M.J(oVar) ? 4 : 2) | i | (M.J(obj) ? 32 : 16) | (M.J(yw90Var) ? 256 : 128) | (M.y(view) ? 2048 : 1024) | (M.y(izsVar) ? 16384 : 8192);
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-504102279, i2, -1, "com.vk.ecomm.onlinebooking.impl.main.presentation.BookingStartScreen (BookingStartScreen.kt:121)");
            }
            if (oVar instanceof o.a) {
                M.K(1789984618);
                c((o.a) oVar, obj, yw90Var, view, izsVar, M, i2 & 65520);
                obj2 = obj;
                yw90Var2 = yw90Var;
                view2 = view;
                izsVar2 = izsVar;
                M.j();
            } else {
                izsVar2 = izsVar;
                view2 = view;
                yw90Var2 = yw90Var;
                obj2 = obj;
                M.K(889033917);
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            izsVar2 = izsVar;
            view2 = view;
            yw90Var2 = yw90Var;
            obj2 = obj;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new pz7(oVar, obj2, yw90Var2, view2, izsVar2, i);
        }
    }

    public static final void f(yz7 yz7Var, final Object obj, final yw90 yw90Var, final View view, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-497090396);
        int i2 = (M.J(yz7Var) ? 4 : 2) | i | (M.J(obj) ? 32 : 16) | (M.J(yw90Var) ? 256 : 128) | (M.y(view) ? 2048 : 1024) | (M.y(izsVar) ? 16384 : 8192);
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-497090396, i2, -1, "com.vk.ecomm.onlinebooking.impl.main.presentation.BookingStartScreen (BookingStartScreen.kt:88)");
            }
            boolean z = (i2 & 14) == 4;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new com.vk.movika.sdk.base.hooks.p(yz7Var, 14);
                M.R(x);
            }
            izs izsVar2 = (izs) x;
            boolean z2 = (i2 & 57344) == 16384;
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new uz7(izsVar, null);
                M.R(x2);
            }
            r37.a(izsVar2, (yzs) x2, kai.c(-1506955104, new zzs() { // from class: xsna.kz7
                @Override // xsna.zzs
                public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                    int i3;
                    z37 z37Var = (z37) obj2;
                    com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2.o oVar = (com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2.o) obj3;
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj4;
                    int intValue = ((Integer) obj5).intValue();
                    if ((intValue & 6) == 0) {
                        i3 = (aVar2.J(z37Var) ? 4 : 2) | intValue;
                    } else {
                        i3 = intValue;
                    }
                    if ((intValue & 48) == 0) {
                        i3 |= aVar2.J(oVar) ? 32 : 16;
                    }
                    if (aVar2.t(i3 & 1, (i3 & 147) != 146)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1506955104, i3, -1, "com.vk.ecomm.onlinebooking.impl.main.presentation.BookingStartScreen.<anonymous> (BookingStartScreen.kt:99)");
                        }
                        emi.e.g(6, aVar2, kai.c(-1034409918, new nz7(oVar, obj, yw90Var, view, z37Var, 0), aVar2));
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar2.h();
                    }
                    return s3q0.a;
                }
            }, M), M, 384, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new lz7(yz7Var, obj, yw90Var, view, izsVar, i);
        }
    }

    public static final void g(dlv0 dlv0Var, o.a aVar, androidx.compose.runtime.a aVar2, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar2.M(-1997406495);
        if ((i & 6) == 0) {
            i2 = (M.J(dlv0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(aVar) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1997406495, i2, -1, "com.vk.ecomm.onlinebooking.impl.main.presentation.HandleErrorState (BookingStartScreen.kt:221)");
            }
            Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
            BookingActionResult bookingActionResult = aVar.l;
            boolean y = ((i2 & 112) == 32) | M.y(context) | ((i2 & 14) == 4);
            Object x = M.x();
            if (y || x == a.C0011a.a) {
                x = new a(aVar, context, dlv0Var, null);
                M.R(x);
            }
            bap.g(bookingActionResult, (wzs) x, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ra5(dlv0Var, aVar, i, 1);
        }
    }

    public static final void h(String str, String str2, izs<? super com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2.a, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        TopBar$Middle.Text.d dVar;
        androidx.compose.runtime.a M = aVar.M(-1003506481);
        int i2 = i | (M.J(str) ? 4 : 2) | (M.J(str2) ? 32 : 16) | (M.y(izsVar) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1003506481, i2, -1, "com.vk.ecomm.onlinebooking.impl.main.presentation.Toolbar (BookingStartScreen.kt:425)");
            }
            if (str2 == null || str2.length() == 0) {
                M.K(1806235374);
                M.j();
                dVar = null;
            } else {
                M.K(1805954453);
                TopBar$Middle.Text.d a2 = TopBar$Middle.Text.d.a.a(str2, 1, 2, null, com.vk.core.compose.component.semantics.b.a(null, new t62("screen_address", 1), 3), M, ((i2 >> 3) & 14) | 197040, 8);
                M.j();
                dVar = a2;
            }
            TopBar$Middle.Text a3 = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a(str, null, null, null, null, M, (i2 & 14) | 196608, 30), dVar, null, cq.b("screen_title", null, 3), M, 4);
            qzu0.a.getClass();
            lg90 A = qzu0.A(M);
            String string = ((Context) M.r(AndroidCompositionLocals_androidKt.b)).getString(R.string.booking_accessability_close);
            com.vk.core.compose.component.semantics.a b2 = cq.b("close_button", null, 3);
            boolean z = (i2 & 896) == 256;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new dz7(izsVar, 0);
                M.R(x);
            }
            muv0.h(a3, null, null, null, null, null, d.a.a(d.c.C0760d.a.a(A, string, (gzs) x, null, null, b2, M, 1572872, 24), null, null, null, M, 24576, 14), null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 0, 0, 8126);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new yi1(str, str2, izsVar, i, 2);
        }
    }
}
