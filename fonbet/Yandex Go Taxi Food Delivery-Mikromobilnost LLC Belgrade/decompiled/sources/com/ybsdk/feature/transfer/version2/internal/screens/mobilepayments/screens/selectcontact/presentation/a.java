package com.ybsdk.feature.transfer.version2.internal.screens.mobilepayments.screens.selectcontact.presentation;

import com.ybsdk.core.navigation.cicerone.OpenScreenRequirement;
import com.ybsdk.core.navigation.cicerone.androidx.FragmentScreen;
import com.ybsdk.core.navigation.cicerone.androidx.TransitionPolicyType;
import com.ybsdk.core.transfer.utils.TransferScenario;
import com.ybsdk.core.utils.dto.common.FailDataException;
import com.ybsdk.di.modules.features.v;
import com.ybsdk.feature.deeplink.api.DeeplinkNavigation;
import com.ybsdk.feature.transfer.version2.api.TransferDirection;
import com.ybsdk.feature.transfer.version2.api.TransferMainScreenArguments;
import com.ybsdk.feature.transfer.version2.api.TransferPrerequisites;
import com.ybsdk.feature.transfer.version2.api.entities.paymentmethodssheet.PaymentProviderEntity;
import com.ybsdk.feature.transfer.version2.internal.screens.mobilepayments.screens.providers.presentation.MobileProvidersListFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.mobilepayments.screens.providers.presentation.MobileProvidersListParams;
import com.ybsdk.screens.initial.deeplink.DeeplinkAction;
import defpackage.bj01;
import defpackage.bqg;
import defpackage.cqg;
import defpackage.ct11;
import defpackage.cu20;
import defpackage.dqg;
import defpackage.ds31;
import defpackage.du20;
import defpackage.eu20;
import defpackage.fu20;
import defpackage.g8e;
import defpackage.it20;
import defpackage.j3h;
import defpackage.jfb0;
import defpackage.jt20;
import defpackage.k5c;
import defpackage.kfb0;
import defpackage.l3h;
import defpackage.lrp0;
import defpackage.lt20;
import defpackage.m04;
import defpackage.me1;
import defpackage.mox;
import defpackage.ny61;
import defpackage.ou01;
import defpackage.pz40;
import defpackage.pzt0;
import defpackage.qoi0;
import defpackage.qq7;
import defpackage.r8j0;
import defpackage.rm01;
import defpackage.s8j0;
import defpackage.sq20;
import defpackage.st20;
import defpackage.tfl0;
import defpackage.tje;
import defpackage.u8j0;
import defpackage.uc5;
import defpackage.ug01;
import defpackage.ury;
import defpackage.w511;
import defpackage.wi91;
import defpackage.x4c;
import defpackage.zmg;
import defpackage.zy11;
import java.util.Collections;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.Regex;
import kotlinx.coroutines.flow.r0;
import org.json.JSONArray;

/* loaded from: classes3.dex */
public final class a extends uc5 {
    public final MobilePaymentSelectContactInputScreenParams B;
    public final com.ybsdk.core.transfer.utils.domain.a C;
    public final ug01 D;
    public final v E;
    public final com.ybsdk.feature.transfer.version2.internal.screens.mobilepayments.screens.selectcontact.data.a F;
    public final tfl0 G;
    public final com.ybsdk.feature.transfer.version2.internal.screens.a H;
    public final rm01 I;
    public final m04 J;
    public final j3h K;
    public boolean L;
    public final mox M;
    public boolean N;
    public pzt0 O;

    public a(st20 st20Var, MobilePaymentSelectContactInputScreenParams mobilePaymentSelectContactInputScreenParams, com.ybsdk.core.transfer.utils.domain.a aVar, ug01 ug01Var, v vVar, com.ybsdk.feature.transfer.version2.internal.screens.mobilepayments.screens.selectcontact.data.a aVar2, tfl0 tfl0Var, com.ybsdk.feature.transfer.version2.internal.screens.a aVar3, rm01 rm01Var, m04 m04Var, j3h j3hVar) {
        super(new sq20(5), st20Var);
        this.B = mobilePaymentSelectContactInputScreenParams;
        this.C = aVar;
        this.D = ug01Var;
        this.E = vVar;
        this.F = aVar2;
        this.G = tfl0Var;
        this.H = aVar3;
        this.I = rm01Var;
        this.J = m04Var;
        this.K = j3hVar;
        this.M = new mox(2, this);
        k5c a = ds31.a(this);
        tje.N(a, null, null, new MobilePaymentSelectContactViewModel$2$1(this, null), 3);
        tje.N(a, null, null, new MobilePaymentSelectContactViewModel$2$2(this, null), 3);
        m04Var.a.L.a.a("payment.mobile_services.initiated", null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b0(a aVar, ContinuationImpl continuationImpl) {
        MobilePaymentSelectContactViewModel$checkMyselfPhoneNumber$1 mobilePaymentSelectContactViewModel$checkMyselfPhoneNumber$1;
        int i;
        String str;
        r0 r0Var;
        Object value;
        r0 r0Var2;
        Object value2;
        aVar.getClass();
        if (continuationImpl instanceof MobilePaymentSelectContactViewModel$checkMyselfPhoneNumber$1) {
            mobilePaymentSelectContactViewModel$checkMyselfPhoneNumber$1 = (MobilePaymentSelectContactViewModel$checkMyselfPhoneNumber$1) continuationImpl;
            int i2 = mobilePaymentSelectContactViewModel$checkMyselfPhoneNumber$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mobilePaymentSelectContactViewModel$checkMyselfPhoneNumber$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mobilePaymentSelectContactViewModel$checkMyselfPhoneNumber$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mobilePaymentSelectContactViewModel$checkMyselfPhoneNumber$1.label;
                if (i != 0) {
                    b.b(obj);
                    v vVar = aVar.E;
                    mobilePaymentSelectContactViewModel$checkMyselfPhoneNumber$1.label = 1;
                    obj = vVar.a(mobilePaymentSelectContactViewModel$checkMyselfPhoneNumber$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                str = (String) obj;
                if (str == null) {
                    pz40 Y = aVar.Y();
                    do {
                        r0Var2 = (r0) Y;
                        value2 = r0Var2.getValue();
                        com.google.i18n.phonenumbers.a aVar2 = jfb0.h;
                    } while (!r0Var2.k(value2, jt20.a((jt20) value2, null, null, null, null, null, new r8j0(wi91.c(str), null, 14), 31)));
                } else {
                    pz40 Y2 = aVar.Y();
                    do {
                        r0Var = (r0) Y2;
                        value = r0Var.getValue();
                    } while (!r0Var.k(value, jt20.a((jt20) value, null, null, null, null, null, new s8j0(new Exception("Myself phone null")), 31)));
                }
                return zy11.a;
            }
        }
        mobilePaymentSelectContactViewModel$checkMyselfPhoneNumber$1 = new MobilePaymentSelectContactViewModel$checkMyselfPhoneNumber$1(aVar, continuationImpl);
        Object obj2 = mobilePaymentSelectContactViewModel$checkMyselfPhoneNumber$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mobilePaymentSelectContactViewModel$checkMyselfPhoneNumber$1.label;
        if (i != 0) {
        }
        str = (String) obj2;
        if (str == null) {
        }
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c0(a aVar, ContinuationImpl continuationImpl) {
        MobilePaymentSelectContactViewModel$getLastMobilePayments$1 mobilePaymentSelectContactViewModel$getLastMobilePayments$1;
        int i;
        Object a;
        Throwable a2;
        u8j0 s8j0Var;
        pz40 Y;
        r0 r0Var;
        Object value;
        u8j0 r8j0Var;
        aVar.getClass();
        if (continuationImpl instanceof MobilePaymentSelectContactViewModel$getLastMobilePayments$1) {
            mobilePaymentSelectContactViewModel$getLastMobilePayments$1 = (MobilePaymentSelectContactViewModel$getLastMobilePayments$1) continuationImpl;
            int i2 = mobilePaymentSelectContactViewModel$getLastMobilePayments$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mobilePaymentSelectContactViewModel$getLastMobilePayments$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mobilePaymentSelectContactViewModel$getLastMobilePayments$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mobilePaymentSelectContactViewModel$getLastMobilePayments$1.label;
                if (i != 0) {
                    b.b(obj);
                    com.ybsdk.feature.transfer.version2.internal.screens.mobilepayments.screens.selectcontact.data.a aVar2 = aVar.F;
                    mobilePaymentSelectContactViewModel$getLastMobilePayments$1.label = 1;
                    a = aVar2.a(mobilePaymentSelectContactViewModel$getLastMobilePayments$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    a = ((Result) obj).getValue();
                }
                a2 = Result.a(a);
                if (a2 != null) {
                    Object obj2 = (dqg) a;
                    if (obj2 instanceof bqg) {
                        r8j0Var = new s8j0(new FailDataException((ct11) obj2));
                    } else {
                        if (!(obj2 instanceof cqg)) {
                            w511.b();
                            return null;
                        }
                        r8j0Var = new r8j0(((cqg) obj2).a, null, 14);
                    }
                    s8j0Var = r8j0Var;
                } else {
                    x4c.g("Can't load last mobile payments", a2, null, Collections.singletonList(lrp0.r), 4);
                    s8j0Var = new s8j0(a2);
                }
                Y = aVar.Y();
                do {
                    r0Var = (r0) Y;
                    value = r0Var.getValue();
                } while (!r0Var.k(value, jt20.a((jt20) value, null, s8j0Var, null, null, null, null, 61)));
                aVar.Z(zmg.k);
                return zy11.a;
            }
        }
        mobilePaymentSelectContactViewModel$getLastMobilePayments$1 = new MobilePaymentSelectContactViewModel$getLastMobilePayments$1(aVar, continuationImpl);
        Object obj3 = mobilePaymentSelectContactViewModel$getLastMobilePayments$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mobilePaymentSelectContactViewModel$getLastMobilePayments$1.label;
        if (i != 0) {
        }
        a2 = Result.a(a);
        if (a2 != null) {
        }
        Y = aVar.Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, jt20.a((jt20) value, null, s8j0Var, null, null, null, null, 61)));
        aVar.Z(zmg.k);
        return zy11.a;
    }

    public static final void d0(a aVar) {
        jfb0 jfb0Var;
        tfl0 tfl0Var = aVar.G;
        com.ybsdk.feature.transfer.version2.internal.screens.a aVar2 = aVar.H;
        it20 it20Var = ((jt20) aVar.X()).c;
        MobileProvidersListParams mobileProvidersListParams = new MobileProvidersListParams((it20Var == null || (jfb0Var = it20Var.a) == null) ? null : jfb0Var.b, true, MobilePaymentSelectContactFragment.RESULT_KEY);
        aVar2.getClass();
        tfl0Var.h(new FragmentScreen("MobileProvidersListFragment", false, mobileProvidersListParams, TransitionPolicyType.POPUP, qoi0.a(MobileProvidersListFragment.class), OpenScreenRequirement.WithBuid.INSTANCE, 2, null));
    }

    public final void e0() {
        r0 r0Var;
        Object value;
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, jt20.a((jt20) value, new s8j0(new Exception("Haven't contacts permission")), null, null, null, null, null, 62)));
        if (this.L) {
            return;
        }
        Z(zmg.k);
    }

    public final mox f0() {
        return this.M;
    }

    public final void g0() {
        jt20 jt20Var = (jt20) X();
        JSONArray jSONArray = new JSONArray();
        u8j0 u8j0Var = jt20Var.a;
        if (u8j0Var instanceof s8j0) {
            jSONArray.put("allow_contacts");
        }
        if (jt20Var.e.a() != null) {
            jSONArray.put("clipboard");
        }
        if (jt20Var.f.a() != null) {
            jSONArray.put("myself");
        }
        if (u8j0Var instanceof r8j0) {
            jSONArray.put("contacts_list");
        }
        int length = jSONArray.length();
        Object obj = jSONArray;
        if (length == 0) {
            obj = null;
        }
        if (obj == null) {
            obj = "";
        }
        String obj2 = obj.toString();
        qq7 qq7Var = this.J.a.L;
        qq7Var.a.a("payment.mobile_services.receivers_shown", g8e.w(1, "suggested_receivers", obj2));
    }

    public final void h0(String str) {
        r0 r0Var;
        Object value;
        r0 r0Var2;
        Object value2;
        if (str != null) {
            com.google.i18n.phonenumbers.a aVar = jfb0.h;
            jfb0 c = wi91.c(str);
            if (c != null) {
                if (!((Boolean) c.f.getValue()).booleanValue()) {
                    c = null;
                }
                if (c != null) {
                    pz40 Y = Y();
                    do {
                        r0Var2 = (r0) Y;
                        value2 = r0Var2.getValue();
                    } while (!r0Var2.k(value2, jt20.a((jt20) value2, null, null, null, null, new r8j0(c, null, 14), null, 47)));
                    return;
                }
            }
        }
        pz40 Y2 = Y();
        do {
            r0Var = (r0) Y2;
            value = r0Var.getValue();
        } while (!r0Var.k(value, jt20.a((jt20) value, null, null, null, null, new s8j0(new Exception("Clipboard empty")), null, 47)));
    }

    public final void i0() {
        this.L = true;
        this.G.e();
    }

    public final void j0() {
        this.L = false;
    }

    public final void k0(String str) {
        r0 r0Var;
        Object value;
        pzt0 pzt0Var = this.O;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.O = null;
        com.google.i18n.phonenumbers.a aVar = jfb0.h;
        jfb0 c = wi91.c(str);
        if (c != null && c.c()) {
            if (c.c()) {
                pz40 Y = Y();
                do {
                    r0Var = (r0) Y;
                    value = r0Var.getValue();
                    Regex regex = kfb0.a;
                } while (!r0Var.k(value, jt20.a((jt20) value, null, null, new it20(c, MobilePaymentSelectContactState$SelectedContact$Status.DEFAULT), kfb0.b(kfb0.e(c.a())), null, null, 51)));
                return;
            }
            return;
        }
        pz40 Y2 = Y();
        while (true) {
            r0 r0Var2 = (r0) Y2;
            Object value2 = r0Var2.getValue();
            String str2 = str;
            if (r0Var2.k(value2, jt20.a((jt20) value2, null, null, null, str2, null, null, 51))) {
                return;
            } else {
                str = str2;
            }
        }
    }

    public final void l0() {
        Z((((jt20) X()).g || this.L) ? zmg.j : zmg.k);
    }

    public final void m0(bj01 bj01Var) {
        r0 r0Var;
        Object value;
        jfb0 jfb0Var;
        ury uryVar = bj01Var.a;
        fu20 fu20Var = uryVar instanceof fu20 ? (fu20) uryVar : null;
        if (fu20Var == null) {
            return;
        }
        this.J.w(fu20Var);
        if (!(fu20Var instanceof cu20)) {
            if (fu20Var.equals(eu20.a)) {
                Z(new lt20(true));
                return;
            } else {
                if (fu20Var instanceof du20) {
                    return;
                }
                w511.b();
                return;
            }
        }
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
            jfb0Var = ((cu20) fu20Var).a;
        } while (!r0Var.k(value, jt20.a((jt20) value, null, null, new it20(jfb0Var, MobilePaymentSelectContactState$SelectedContact$Status.CHECKING), null, null, null, 59)));
        pzt0 pzt0Var = this.O;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.O = tje.N(ds31.a(this), null, null, new MobilePaymentSelectContactViewModel$getProviderByPhone$1(this, jfb0Var, null), 3);
    }

    public final void n0(PaymentProviderEntity paymentProviderEntity, String str) {
        String str2;
        jfb0 jfb0Var;
        this.L = true;
        Z(zmg.j);
        String id = paymentProviderEntity.getId();
        String agreementId = this.B.getAgreementId();
        if (str == null) {
            it20 it20Var = ((jt20) X()).c;
            str2 = (it20Var == null || (jfb0Var = it20Var.a) == null) ? null : jfb0Var.b();
            if (str2 == null) {
                u8j0 u8j0Var = ((jt20) X()).a;
                if (u8j0Var instanceof r8j0) {
                    u8j0Var = null;
                }
                x4c.g("Phone number is not selected", null, String.valueOf(u8j0Var), Collections.singletonList(lrp0.r), 2);
                return;
            }
        } else {
            str2 = str;
        }
        ((l3h) ((ou01) this.I).a).d(com.ybsdk.feature.deeplink.api.a.a(new DeeplinkAction.Transfer(new TransferMainScreenArguments(TransferDirection.TRANSFER, agreementId, new TransferPrerequisites.MobilePayment(str2, id), TransferScenario.MOBILE_PAYMENT, false, false, null, null, null, null, null, 1984, null)), DeeplinkNavigation.Add.INSTANCE));
    }

    public final void o0(boolean z, boolean z2) {
        if (z2 || z) {
            p0();
        } else {
            if (this.N) {
                return;
            }
            if (((me1) this.D).b.getBoolean("phone_permission_was_disallowed", false)) {
                e0();
            } else {
                Z(new lt20(false));
            }
        }
    }

    public final void p0() {
        if (((jt20) X()).a instanceof r8j0) {
            return;
        }
        tje.N(ds31.a(this), null, null, new MobilePaymentSelectContactViewModel$loadContacts$1(this, null), 3);
    }
}
