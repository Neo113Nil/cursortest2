package com.yandex.go.payments.data;

import com.yandex.go.payments.data.model.CardDto;
import com.yandex.go.payments.data.model.CardFamilyDto;
import com.yandex.go.payments.data.model.CashDto;
import com.yandex.go.payments.data.model.CashLikeDto;
import com.yandex.go.payments.data.model.ClickWalletDto;
import com.yandex.go.payments.data.model.CorpAccountDto;
import com.yandex.go.payments.data.model.CostCenters;
import com.yandex.go.payments.data.model.EasypaisaWalletDto;
import com.yandex.go.payments.data.model.FastshiftAccountDto;
import com.yandex.go.payments.data.model.GooglePayDto;
import com.yandex.go.payments.data.model.JazzcashWalletDto;
import com.yandex.go.payments.data.model.KaspiDto;
import com.yandex.go.payments.data.model.ListPaymentMethodDto$Availability;
import com.yandex.go.payments.data.model.ListPaymentMethodsResponse;
import com.yandex.go.payments.data.model.LocationInfo;
import com.yandex.go.payments.data.model.MBankAccountDto;
import com.yandex.go.payments.data.model.NequiTokenDto;
import com.yandex.go.payments.data.model.PersonalWalletDto;
import com.yandex.go.payments.data.model.SbpBindTokenDto;
import com.yandex.go.payments.data.model.SbpTokenDto;
import com.yandex.go.payments.data.model.SharedAccountDto;
import com.yandex.go.payments.data.model.TransportCardDto;
import com.yandex.go.payments.data.model.TransportExternalDto;
import com.yandex.go.payments.data.model.UnknownDto;
import com.yandex.go.payments.data.model.UserCardProfileDto;
import com.yandex.go.payments.data.model.VerifyStrategy;
import com.yandex.go.payments.data.model.YapeTokenDto;
import com.yandex.go.payments.data.model.YbCardDto;
import com.yandex.go.payments.data.model.response.AddPaymentMethodButton;
import com.yandex.go.payments.data.model.response.CoopAccountUiDto;
import com.yandex.go.payments.data.model.response.ListPaymentMethodsUiDto;
import com.yandex.go.payments.data.model.response.PersonalAccount;
import com.yandex.go.payments.payment.AddPaymentModel$State;
import com.yandex.go.payments.payment.CardPayment$VerifyStrategy;
import com.yandex.go.payments.payment.TransportCardPayment$CardStatusDomain;
import defpackage.a000;
import defpackage.a111;
import defpackage.avj0;
import defpackage.b111;
import defpackage.bei;
import defpackage.bg0;
import defpackage.bjm0;
import defpackage.bk0;
import defpackage.bvf0;
import defpackage.c111;
import defpackage.cfm0;
import defpackage.ck0;
import defpackage.d111;
import defpackage.dc7;
import defpackage.df0;
import defpackage.dfa0;
import defpackage.dqh;
import defpackage.ec7;
import defpackage.efa0;
import defpackage.el8;
import defpackage.ep51;
import defpackage.evu0;
import defpackage.fef;
import defpackage.fl8;
import defpackage.fqh;
import defpackage.fty;
import defpackage.gwk0;
import defpackage.h0a0;
import defpackage.h211;
import defpackage.h8b0;
import defpackage.ief;
import defpackage.ivt;
import defpackage.jl40;
import defpackage.jve;
import defpackage.jyz;
import defpackage.kd0;
import defpackage.kna0;
import defpackage.ky90;
import defpackage.kyh0;
import defpackage.kyz;
import defpackage.l76;
import defpackage.lea0;
import defpackage.lfa0;
import defpackage.mcp;
import defpackage.mf0;
import defpackage.mj0;
import defpackage.mk0;
import defpackage.na0;
import defpackage.ny61;
import defpackage.oea0;
import defpackage.ogz0;
import defpackage.p1c;
import defpackage.pea0;
import defpackage.qgx;
import defpackage.rnr0;
import defpackage.scc;
import defpackage.snr0;
import defpackage.t19;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tq51;
import defpackage.tt2;
import defpackage.tx90;
import defpackage.u0k;
import defpackage.u19;
import defpackage.u80;
import defpackage.um50;
import defpackage.uyj;
import defpackage.v7x;
import defpackage.vbn;
import defpackage.vxc;
import defpackage.w511;
import defpackage.wnt;
import defpackage.xdf;
import defpackage.xnt;
import defpackage.yy51;
import defpackage.zuj0;
import defpackage.zut;
import defpackage.zy11;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.costcenters.api.CostCenterField;
import ru.yandex.taxi.gopayments.dto.SharedAccountType;
import ru.yandex.taxi.payments.ListPaymentMethodDtoType;
import ru.yandex.taxi.payments.model.pci_dss.UserCardProfileName;

/* loaded from: classes13.dex */
public final class g {
    public final h a;
    public final efa0 b;
    public final tt2 c;
    public final wnt d;
    public final String e;
    public volatile lfa0 h;
    public final ConcurrentHashMap f = new ConcurrentHashMap();
    public final r0 g = bvf0.c(oea0.e);
    public volatile ec7 i = bei.z;

    public g(String str, h hVar, efa0 efa0Var, tt2 tt2Var, wnt wntVar) {
        this.a = hVar;
        this.b = efa0Var;
        this.c = tt2Var;
        this.d = wntVar;
        this.e = str;
    }

    public final void a() {
        oea0 oea0Var = oea0.e;
        r0 r0Var = this.g;
        r0Var.getClass();
        r0Var.m(null, oea0Var);
        this.f.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        PaymentOptionsRepository$clearCacheAndRequestPaymentOptionsWithLastParam$1 paymentOptionsRepository$clearCacheAndRequestPaymentOptionsWithLastParam$1;
        int i;
        if (continuationImpl instanceof PaymentOptionsRepository$clearCacheAndRequestPaymentOptionsWithLastParam$1) {
            paymentOptionsRepository$clearCacheAndRequestPaymentOptionsWithLastParam$1 = (PaymentOptionsRepository$clearCacheAndRequestPaymentOptionsWithLastParam$1) continuationImpl;
            int i2 = paymentOptionsRepository$clearCacheAndRequestPaymentOptionsWithLastParam$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                paymentOptionsRepository$clearCacheAndRequestPaymentOptionsWithLastParam$1.label = i2 - Integer.MIN_VALUE;
                PaymentOptionsRepository$clearCacheAndRequestPaymentOptionsWithLastParam$1 paymentOptionsRepository$clearCacheAndRequestPaymentOptionsWithLastParam$12 = paymentOptionsRepository$clearCacheAndRequestPaymentOptionsWithLastParam$1;
                Object obj = paymentOptionsRepository$clearCacheAndRequestPaymentOptionsWithLastParam$12.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentOptionsRepository$clearCacheAndRequestPaymentOptionsWithLastParam$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a();
                    lfa0 lfa0Var = this.h;
                    if (lfa0Var != null) {
                        ky90 ky90Var = lfa0Var.a;
                        dqh dqhVar = lfa0Var.b;
                        h0a0 h0a0Var = lfa0Var.c;
                        paymentOptionsRepository$clearCacheAndRequestPaymentOptionsWithLastParam$12.L$0 = null;
                        paymentOptionsRepository$clearCacheAndRequestPaymentOptionsWithLastParam$12.label = 1;
                        obj = e(ky90Var, dqhVar, h0a0Var, true, paymentOptionsRepository$clearCacheAndRequestPaymentOptionsWithLastParam$12);
                        if (obj == obj2) {
                            return obj2;
                        }
                    }
                    return zy11.a;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11.a;
            }
        }
        paymentOptionsRepository$clearCacheAndRequestPaymentOptionsWithLastParam$1 = new PaymentOptionsRepository$clearCacheAndRequestPaymentOptionsWithLastParam$1(this, continuationImpl);
        PaymentOptionsRepository$clearCacheAndRequestPaymentOptionsWithLastParam$1 paymentOptionsRepository$clearCacheAndRequestPaymentOptionsWithLastParam$122 = paymentOptionsRepository$clearCacheAndRequestPaymentOptionsWithLastParam$1;
        Object obj3 = paymentOptionsRepository$clearCacheAndRequestPaymentOptionsWithLastParam$122.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentOptionsRepository$clearCacheAndRequestPaymentOptionsWithLastParam$122.label;
        if (i != 0) {
        }
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:674:0x09c8  */
    /* JADX WARN: Removed duplicated region for block: B:678:0x0a1f  */
    /* JADX WARN: Removed duplicated region for block: B:682:0x0a7b  */
    /* JADX WARN: Removed duplicated region for block: B:686:0x0ad7  */
    /* JADX WARN: Removed duplicated region for block: B:690:0x0b33  */
    /* JADX WARN: Removed duplicated region for block: B:694:0x0b8f  */
    /* JADX WARN: Removed duplicated region for block: B:698:0x0bd2  */
    /* JADX WARN: Removed duplicated region for block: B:700:0x0bd8  */
    /* JADX WARN: Removed duplicated region for block: B:719:0x0c27  */
    /* JADX WARN: Removed duplicated region for block: B:722:0x0c2e  */
    /* JADX WARN: Removed duplicated region for block: B:725:0x0c49  */
    /* JADX WARN: Removed duplicated region for block: B:729:0x0c56  */
    /* JADX WARN: Removed duplicated region for block: B:734:0x0c6b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:744:0x0c97  */
    /* JADX WARN: Removed duplicated region for block: B:748:0x0c9e  */
    /* JADX WARN: Removed duplicated region for block: B:749:0x0c30  */
    /* JADX WARN: Removed duplicated region for block: B:756:0x0b96  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:773:0x0b3a  */
    /* JADX WARN: Removed duplicated region for block: B:794:0x0ade  */
    /* JADX WARN: Removed duplicated region for block: B:815:0x0a82  */
    /* JADX WARN: Removed duplicated region for block: B:836:0x0a26  */
    /* JADX WARN: Removed duplicated region for block: B:857:0x09cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final oea0 c(ky90 ky90Var, dqh dqhVar, fty ftyVar) {
        int i;
        Object obj;
        mf0 mf0Var;
        Object obj2;
        mj0 mj0Var;
        Object obj3;
        mk0 mk0Var;
        Object obj4;
        bg0 bg0Var;
        Object obj5;
        kd0 kd0Var;
        Object obj6;
        df0 df0Var;
        Object obj7;
        ck0 ck0Var;
        bk0 bk0Var;
        List list;
        Iterator it;
        ogz0 g;
        Object obj8;
        String str;
        tx90 tx90Var;
        Iterator it2;
        ListPaymentMethodsResponse listPaymentMethodsResponse;
        kyz kyzVar;
        Integer num;
        String str2;
        u0k um50Var;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        u0k ivtVar;
        String str13;
        String str14;
        String str15;
        a111 a111Var;
        TransportCardPayment$CardStatusDomain transportCardPayment$CardStatusDomain;
        String str16;
        u0k d111Var;
        PersonalAccount.ComplementAttributes complementAttributes;
        u0k h8b0Var;
        String str17;
        String str18;
        SharedAccountType sharedAccountType;
        String str19;
        String str20;
        String str21;
        CostCenterField.InputFormat inputFormat;
        String str22;
        boolean z;
        UserCardProfileName userCardProfileName;
        UserCardProfileName userCardProfileName2;
        ListPaymentMethodsResponse listPaymentMethodsResponse2 = ftyVar.a;
        long j = ftyVar.b;
        efa0 efa0Var = this.b;
        kyz kyzVar2 = efa0Var.a;
        String str23 = listPaymentMethodsResponse2.f;
        ListPaymentMethodsUiDto listPaymentMethodsUiDto = listPaymentMethodsResponse2.d;
        ief iefVar = listPaymentMethodsResponse2.e;
        LocationInfo locationInfo = listPaymentMethodsResponse2.g;
        Integer num2 = locationInfo != null ? locationInfo.a : null;
        UserCardProfileDto userCardProfileDto = listPaymentMethodsResponse2.i;
        tx90 tx90Var2 = (userCardProfileDto == null || (userCardProfileName2 = userCardProfileDto.a) == null) ? null : new tx90(userCardProfileName2);
        ArrayList arrayList = new ArrayList();
        List list2 = listPaymentMethodsResponse2.a;
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = list2.iterator();
        while (true) {
            boolean hasNext = it3.hasNext();
            List list3 = EmptyList.a;
            if (!hasNext) {
                ListPaymentMethodsResponse listPaymentMethodsResponse3 = listPaymentMethodsResponse2;
                kyz kyzVar3 = kyzVar2;
                Integer num3 = num2;
                tx90 tx90Var3 = tx90Var2;
                ArrayList arrayList3 = new ArrayList();
                Iterator it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    Object next = it4.next();
                    if (next instanceof fl8) {
                        arrayList3.add(next);
                    }
                }
                Iterator it5 = kotlin.collections.a.x0(arrayList3, new dfa0()).iterator();
                ArrayList arrayList4 = new ArrayList(tcc.n(arrayList2, 10));
                Iterator it6 = arrayList2.iterator();
                while (it6.hasNext()) {
                    lea0 lea0Var = (lea0) it6.next();
                    if (lea0Var instanceof fl8) {
                        lea0Var = (lea0) it5.next();
                    }
                    arrayList4.add(lea0Var);
                }
                if (arrayList4.isEmpty()) {
                    i = 0;
                } else {
                    Iterator it7 = arrayList4.iterator();
                    i = 0;
                    while (it7.hasNext()) {
                        if ((((lea0) it7.next()) instanceof fl8) && (i = i + 1) < 0) {
                            scc.l();
                            throw null;
                        }
                    }
                }
                List list4 = listPaymentMethodsUiDto != null ? listPaymentMethodsUiDto.a : null;
                if (list4 != null) {
                    Iterator it8 = list4.iterator();
                    while (true) {
                        if (!it8.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it8.next();
                        AddPaymentMethodButton addPaymentMethodButton = (AddPaymentMethodButton) obj;
                        if (addPaymentMethodButton.c == AddPaymentMethodButton.AddButtonType.MBANK_ACCOUNT && !evu0.J(addPaymentMethodButton.a)) {
                            break;
                        }
                    }
                    AddPaymentMethodButton addPaymentMethodButton2 = (AddPaymentMethodButton) obj;
                    if (addPaymentMethodButton2 != null) {
                        AddPaymentModel$State a = efa0.a(addPaymentMethodButton2.f);
                        mf0Var = new mf0(a != AddPaymentModel$State.DISABLED ? null : "", addPaymentMethodButton2.a, addPaymentMethodButton2.b, addPaymentMethodButton2.d, u80.a(addPaymentMethodButton2.e), a);
                        if (mf0Var != null) {
                            arrayList.add(mf0Var);
                        }
                        if (list4 != null) {
                            Iterator it9 = list4.iterator();
                            while (true) {
                                if (!it9.hasNext()) {
                                    obj2 = null;
                                    break;
                                }
                                obj2 = it9.next();
                                AddPaymentMethodButton addPaymentMethodButton3 = (AddPaymentMethodButton) obj2;
                                if (addPaymentMethodButton3.c == AddPaymentMethodButton.AddButtonType.SBP_TOKEN && !evu0.J(addPaymentMethodButton3.a)) {
                                    break;
                                }
                            }
                            AddPaymentMethodButton addPaymentMethodButton4 = (AddPaymentMethodButton) obj2;
                            if (addPaymentMethodButton4 != null) {
                                String str24 = addPaymentMethodButton4.a;
                                String str25 = addPaymentMethodButton4.b;
                                String str26 = str25 == null ? "" : str25;
                                String str27 = addPaymentMethodButton4.d;
                                mj0Var = new mj0(null, str24, str26, str27 == null ? "" : str27, efa0.a(addPaymentMethodButton4.f));
                                if (mj0Var != null) {
                                    arrayList.add(mj0Var);
                                }
                                if (list4 != null) {
                                    Iterator it10 = list4.iterator();
                                    while (true) {
                                        if (!it10.hasNext()) {
                                            obj3 = null;
                                            break;
                                        }
                                        obj3 = it10.next();
                                        AddPaymentMethodButton addPaymentMethodButton5 = (AddPaymentMethodButton) obj3;
                                        if (addPaymentMethodButton5.c == AddPaymentMethodButton.AddButtonType.YAPE_TOKEN && !evu0.J(addPaymentMethodButton5.a)) {
                                            break;
                                        }
                                    }
                                    AddPaymentMethodButton addPaymentMethodButton6 = (AddPaymentMethodButton) obj3;
                                    if (addPaymentMethodButton6 != null) {
                                        AddPaymentModel$State a2 = efa0.a(addPaymentMethodButton6.f);
                                        mk0Var = new mk0(a2 != AddPaymentModel$State.DISABLED ? null : "", addPaymentMethodButton6.a, addPaymentMethodButton6.b, addPaymentMethodButton6.d, u80.a(addPaymentMethodButton6.e), a2);
                                        if (mk0Var != null) {
                                            arrayList.add(mk0Var);
                                        }
                                        if (list4 != null) {
                                            Iterator it11 = list4.iterator();
                                            while (true) {
                                                if (!it11.hasNext()) {
                                                    obj4 = null;
                                                    break;
                                                }
                                                obj4 = it11.next();
                                                AddPaymentMethodButton addPaymentMethodButton7 = (AddPaymentMethodButton) obj4;
                                                if (addPaymentMethodButton7.c == AddPaymentMethodButton.AddButtonType.NEQUI_TOKEN && !evu0.J(addPaymentMethodButton7.a)) {
                                                    break;
                                                }
                                            }
                                            AddPaymentMethodButton addPaymentMethodButton8 = (AddPaymentMethodButton) obj4;
                                            if (addPaymentMethodButton8 != null) {
                                                AddPaymentModel$State a3 = efa0.a(addPaymentMethodButton8.f);
                                                bg0Var = new bg0(a3 != AddPaymentModel$State.DISABLED ? null : "", addPaymentMethodButton8.a, addPaymentMethodButton8.b, addPaymentMethodButton8.d, u80.a(addPaymentMethodButton8.e), a3);
                                                if (bg0Var != null) {
                                                    arrayList.add(bg0Var);
                                                }
                                                if (list4 != null) {
                                                    Iterator it12 = list4.iterator();
                                                    while (true) {
                                                        if (!it12.hasNext()) {
                                                            obj5 = null;
                                                            break;
                                                        }
                                                        obj5 = it12.next();
                                                        AddPaymentMethodButton addPaymentMethodButton9 = (AddPaymentMethodButton) obj5;
                                                        if (addPaymentMethodButton9.c == AddPaymentMethodButton.AddButtonType.FASTSHIFT_ACCOUNT && !evu0.J(addPaymentMethodButton9.a)) {
                                                            break;
                                                        }
                                                    }
                                                    AddPaymentMethodButton addPaymentMethodButton10 = (AddPaymentMethodButton) obj5;
                                                    if (addPaymentMethodButton10 != null) {
                                                        AddPaymentModel$State a4 = efa0.a(addPaymentMethodButton10.f);
                                                        kd0Var = new kd0(a4 != AddPaymentModel$State.DISABLED ? null : "", addPaymentMethodButton10.a, addPaymentMethodButton10.b, addPaymentMethodButton10.d, u80.a(addPaymentMethodButton10.e), a4);
                                                        if (kd0Var != null) {
                                                            arrayList.add(kd0Var);
                                                        }
                                                        if (list4 != null) {
                                                            Iterator it13 = list4.iterator();
                                                            while (true) {
                                                                if (!it13.hasNext()) {
                                                                    obj6 = null;
                                                                    break;
                                                                }
                                                                obj6 = it13.next();
                                                                AddPaymentMethodButton addPaymentMethodButton11 = (AddPaymentMethodButton) obj6;
                                                                if (addPaymentMethodButton11.c == AddPaymentMethodButton.AddButtonType.JAZZCASH_WALLET && !evu0.J(addPaymentMethodButton11.a)) {
                                                                    break;
                                                                }
                                                            }
                                                            AddPaymentMethodButton addPaymentMethodButton12 = (AddPaymentMethodButton) obj6;
                                                            if (addPaymentMethodButton12 != null) {
                                                                AddPaymentModel$State a5 = efa0.a(addPaymentMethodButton12.f);
                                                                df0Var = new df0(a5 != AddPaymentModel$State.DISABLED ? null : "", addPaymentMethodButton12.a, addPaymentMethodButton12.b, addPaymentMethodButton12.d, u80.a(addPaymentMethodButton12.e), a5);
                                                                if (df0Var != null) {
                                                                    arrayList.add(df0Var);
                                                                }
                                                                if (list4 != null) {
                                                                    Iterator it14 = list4.iterator();
                                                                    while (true) {
                                                                        if (!it14.hasNext()) {
                                                                            obj7 = null;
                                                                            break;
                                                                        }
                                                                        obj7 = it14.next();
                                                                        AddPaymentMethodButton addPaymentMethodButton13 = (AddPaymentMethodButton) obj7;
                                                                        if (addPaymentMethodButton13.c == AddPaymentMethodButton.AddButtonType.TRANSPORT_EXTERNAL && !evu0.J(addPaymentMethodButton13.a)) {
                                                                            break;
                                                                        }
                                                                    }
                                                                    AddPaymentMethodButton addPaymentMethodButton14 = (AddPaymentMethodButton) obj7;
                                                                    if (addPaymentMethodButton14 != null) {
                                                                        ck0Var = new ck0(addPaymentMethodButton14.a, addPaymentMethodButton14.b, addPaymentMethodButton14.d, u80.a(addPaymentMethodButton14.e));
                                                                        if (ck0Var != null) {
                                                                            arrayList.add(ck0Var);
                                                                        }
                                                                        if (list4 != null) {
                                                                            Iterator it15 = list4.iterator();
                                                                            while (true) {
                                                                                if (!it15.hasNext()) {
                                                                                    obj8 = null;
                                                                                    break;
                                                                                }
                                                                                obj8 = it15.next();
                                                                                AddPaymentMethodButton addPaymentMethodButton15 = (AddPaymentMethodButton) obj8;
                                                                                if (addPaymentMethodButton15.c == AddPaymentMethodButton.AddButtonType.TRANSPORT_CARD && !evu0.J(addPaymentMethodButton15.a)) {
                                                                                    break;
                                                                                }
                                                                            }
                                                                            AddPaymentMethodButton addPaymentMethodButton16 = (AddPaymentMethodButton) obj8;
                                                                            if (addPaymentMethodButton16 != null) {
                                                                                AddPaymentMethodButton.AddButtonFlow addButtonFlow = addPaymentMethodButton16.e;
                                                                                if (addButtonFlow.a != AddPaymentMethodButton.AddButtonFlow.AddButtonFlowType.UNKNOWN && (str = addButtonFlow.b) != null && !evu0.J(str)) {
                                                                                    bk0Var = new bk0(addPaymentMethodButton16.a, addPaymentMethodButton16.b, addPaymentMethodButton16.d, u80.a(addButtonFlow));
                                                                                    if (bk0Var != null) {
                                                                                        arrayList.add(bk0Var);
                                                                                    }
                                                                                    arrayList.add(new na0(i < 20 ? null : ""));
                                                                                    ((fqh) dqhVar).getClass();
                                                                                    if (((kna0) ky90Var).b && (g = efa0Var.c.g(arrayList4)) != null) {
                                                                                        arrayList.add(g);
                                                                                    }
                                                                                    if (listPaymentMethodsUiDto != null && (list = listPaymentMethodsUiDto.b) != null) {
                                                                                        ArrayList arrayList5 = new ArrayList();
                                                                                        it = list.iterator();
                                                                                        while (it.hasNext()) {
                                                                                            kyz kyzVar4 = kyzVar3;
                                                                                            snr0 a6 = kyzVar4.a((CoopAccountUiDto) it.next());
                                                                                            if (a6 != null) {
                                                                                                arrayList5.add(a6);
                                                                                            }
                                                                                            kyzVar3 = kyzVar4;
                                                                                        }
                                                                                        list3 = arrayList5;
                                                                                    }
                                                                                    ArrayList m0 = kotlin.collections.a.m0(list3, arrayList4);
                                                                                    oea0 oea0Var = new oea0(m0, arrayList, efa0Var.b(m0, listPaymentMethodsResponse3.b), new pea0(str23, num3, tx90Var3, iefVar != null ? iefVar.b : null));
                                                                                    r0 r0Var = this.g;
                                                                                    r0Var.getClass();
                                                                                    r0Var.m(null, oea0Var);
                                                                                    return oea0Var;
                                                                                }
                                                                            }
                                                                        }
                                                                        bk0Var = null;
                                                                        if (bk0Var != null) {
                                                                        }
                                                                        arrayList.add(new na0(i < 20 ? null : ""));
                                                                        ((fqh) dqhVar).getClass();
                                                                        if (((kna0) ky90Var).b) {
                                                                            arrayList.add(g);
                                                                        }
                                                                        if (listPaymentMethodsUiDto != null) {
                                                                            ArrayList arrayList52 = new ArrayList();
                                                                            it = list.iterator();
                                                                            while (it.hasNext()) {
                                                                            }
                                                                            list3 = arrayList52;
                                                                        }
                                                                        ArrayList m02 = kotlin.collections.a.m0(list3, arrayList4);
                                                                        oea0 oea0Var2 = new oea0(m02, arrayList, efa0Var.b(m02, listPaymentMethodsResponse3.b), new pea0(str23, num3, tx90Var3, iefVar != null ? iefVar.b : null));
                                                                        r0 r0Var2 = this.g;
                                                                        r0Var2.getClass();
                                                                        r0Var2.m(null, oea0Var2);
                                                                        return oea0Var2;
                                                                    }
                                                                }
                                                                ck0Var = null;
                                                                if (ck0Var != null) {
                                                                }
                                                                if (list4 != null) {
                                                                }
                                                                bk0Var = null;
                                                                if (bk0Var != null) {
                                                                }
                                                                arrayList.add(new na0(i < 20 ? null : ""));
                                                                ((fqh) dqhVar).getClass();
                                                                if (((kna0) ky90Var).b) {
                                                                }
                                                                if (listPaymentMethodsUiDto != null) {
                                                                }
                                                                ArrayList m022 = kotlin.collections.a.m0(list3, arrayList4);
                                                                oea0 oea0Var22 = new oea0(m022, arrayList, efa0Var.b(m022, listPaymentMethodsResponse3.b), new pea0(str23, num3, tx90Var3, iefVar != null ? iefVar.b : null));
                                                                r0 r0Var22 = this.g;
                                                                r0Var22.getClass();
                                                                r0Var22.m(null, oea0Var22);
                                                                return oea0Var22;
                                                            }
                                                        }
                                                        df0Var = null;
                                                        if (df0Var != null) {
                                                        }
                                                        if (list4 != null) {
                                                        }
                                                        ck0Var = null;
                                                        if (ck0Var != null) {
                                                        }
                                                        if (list4 != null) {
                                                        }
                                                        bk0Var = null;
                                                        if (bk0Var != null) {
                                                        }
                                                        arrayList.add(new na0(i < 20 ? null : ""));
                                                        ((fqh) dqhVar).getClass();
                                                        if (((kna0) ky90Var).b) {
                                                        }
                                                        if (listPaymentMethodsUiDto != null) {
                                                        }
                                                        ArrayList m0222 = kotlin.collections.a.m0(list3, arrayList4);
                                                        oea0 oea0Var222 = new oea0(m0222, arrayList, efa0Var.b(m0222, listPaymentMethodsResponse3.b), new pea0(str23, num3, tx90Var3, iefVar != null ? iefVar.b : null));
                                                        r0 r0Var222 = this.g;
                                                        r0Var222.getClass();
                                                        r0Var222.m(null, oea0Var222);
                                                        return oea0Var222;
                                                    }
                                                }
                                                kd0Var = null;
                                                if (kd0Var != null) {
                                                }
                                                if (list4 != null) {
                                                }
                                                df0Var = null;
                                                if (df0Var != null) {
                                                }
                                                if (list4 != null) {
                                                }
                                                ck0Var = null;
                                                if (ck0Var != null) {
                                                }
                                                if (list4 != null) {
                                                }
                                                bk0Var = null;
                                                if (bk0Var != null) {
                                                }
                                                arrayList.add(new na0(i < 20 ? null : ""));
                                                ((fqh) dqhVar).getClass();
                                                if (((kna0) ky90Var).b) {
                                                }
                                                if (listPaymentMethodsUiDto != null) {
                                                }
                                                ArrayList m02222 = kotlin.collections.a.m0(list3, arrayList4);
                                                oea0 oea0Var2222 = new oea0(m02222, arrayList, efa0Var.b(m02222, listPaymentMethodsResponse3.b), new pea0(str23, num3, tx90Var3, iefVar != null ? iefVar.b : null));
                                                r0 r0Var2222 = this.g;
                                                r0Var2222.getClass();
                                                r0Var2222.m(null, oea0Var2222);
                                                return oea0Var2222;
                                            }
                                        }
                                        bg0Var = null;
                                        if (bg0Var != null) {
                                        }
                                        if (list4 != null) {
                                        }
                                        kd0Var = null;
                                        if (kd0Var != null) {
                                        }
                                        if (list4 != null) {
                                        }
                                        df0Var = null;
                                        if (df0Var != null) {
                                        }
                                        if (list4 != null) {
                                        }
                                        ck0Var = null;
                                        if (ck0Var != null) {
                                        }
                                        if (list4 != null) {
                                        }
                                        bk0Var = null;
                                        if (bk0Var != null) {
                                        }
                                        arrayList.add(new na0(i < 20 ? null : ""));
                                        ((fqh) dqhVar).getClass();
                                        if (((kna0) ky90Var).b) {
                                        }
                                        if (listPaymentMethodsUiDto != null) {
                                        }
                                        ArrayList m022222 = kotlin.collections.a.m0(list3, arrayList4);
                                        oea0 oea0Var22222 = new oea0(m022222, arrayList, efa0Var.b(m022222, listPaymentMethodsResponse3.b), new pea0(str23, num3, tx90Var3, iefVar != null ? iefVar.b : null));
                                        r0 r0Var22222 = this.g;
                                        r0Var22222.getClass();
                                        r0Var22222.m(null, oea0Var22222);
                                        return oea0Var22222;
                                    }
                                }
                                mk0Var = null;
                                if (mk0Var != null) {
                                }
                                if (list4 != null) {
                                }
                                bg0Var = null;
                                if (bg0Var != null) {
                                }
                                if (list4 != null) {
                                }
                                kd0Var = null;
                                if (kd0Var != null) {
                                }
                                if (list4 != null) {
                                }
                                df0Var = null;
                                if (df0Var != null) {
                                }
                                if (list4 != null) {
                                }
                                ck0Var = null;
                                if (ck0Var != null) {
                                }
                                if (list4 != null) {
                                }
                                bk0Var = null;
                                if (bk0Var != null) {
                                }
                                arrayList.add(new na0(i < 20 ? null : ""));
                                ((fqh) dqhVar).getClass();
                                if (((kna0) ky90Var).b) {
                                }
                                if (listPaymentMethodsUiDto != null) {
                                }
                                ArrayList m0222222 = kotlin.collections.a.m0(list3, arrayList4);
                                oea0 oea0Var222222 = new oea0(m0222222, arrayList, efa0Var.b(m0222222, listPaymentMethodsResponse3.b), new pea0(str23, num3, tx90Var3, iefVar != null ? iefVar.b : null));
                                r0 r0Var222222 = this.g;
                                r0Var222222.getClass();
                                r0Var222222.m(null, oea0Var222222);
                                return oea0Var222222;
                            }
                        }
                        mj0Var = null;
                        if (mj0Var != null) {
                        }
                        if (list4 != null) {
                        }
                        mk0Var = null;
                        if (mk0Var != null) {
                        }
                        if (list4 != null) {
                        }
                        bg0Var = null;
                        if (bg0Var != null) {
                        }
                        if (list4 != null) {
                        }
                        kd0Var = null;
                        if (kd0Var != null) {
                        }
                        if (list4 != null) {
                        }
                        df0Var = null;
                        if (df0Var != null) {
                        }
                        if (list4 != null) {
                        }
                        ck0Var = null;
                        if (ck0Var != null) {
                        }
                        if (list4 != null) {
                        }
                        bk0Var = null;
                        if (bk0Var != null) {
                        }
                        arrayList.add(new na0(i < 20 ? null : ""));
                        ((fqh) dqhVar).getClass();
                        if (((kna0) ky90Var).b) {
                        }
                        if (listPaymentMethodsUiDto != null) {
                        }
                        ArrayList m02222222 = kotlin.collections.a.m0(list3, arrayList4);
                        oea0 oea0Var2222222 = new oea0(m02222222, arrayList, efa0Var.b(m02222222, listPaymentMethodsResponse3.b), new pea0(str23, num3, tx90Var3, iefVar != null ? iefVar.b : null));
                        r0 r0Var2222222 = this.g;
                        r0Var2222222.getClass();
                        r0Var2222222.m(null, oea0Var2222222);
                        return oea0Var2222222;
                    }
                }
                mf0Var = null;
                if (mf0Var != null) {
                }
                if (list4 != null) {
                }
                mj0Var = null;
                if (mj0Var != null) {
                }
                if (list4 != null) {
                }
                mk0Var = null;
                if (mk0Var != null) {
                }
                if (list4 != null) {
                }
                bg0Var = null;
                if (bg0Var != null) {
                }
                if (list4 != null) {
                }
                kd0Var = null;
                if (kd0Var != null) {
                }
                if (list4 != null) {
                }
                df0Var = null;
                if (df0Var != null) {
                }
                if (list4 != null) {
                }
                ck0Var = null;
                if (ck0Var != null) {
                }
                if (list4 != null) {
                }
                bk0Var = null;
                if (bk0Var != null) {
                }
                arrayList.add(new na0(i < 20 ? null : ""));
                ((fqh) dqhVar).getClass();
                if (((kna0) ky90Var).b) {
                }
                if (listPaymentMethodsUiDto != null) {
                }
                ArrayList m022222222 = kotlin.collections.a.m0(list3, arrayList4);
                oea0 oea0Var22222222 = new oea0(m022222222, arrayList, efa0Var.b(m022222222, listPaymentMethodsResponse3.b), new pea0(str23, num3, tx90Var3, iefVar != null ? iefVar.b : null));
                r0 r0Var22222222 = this.g;
                r0Var22222222.getClass();
                r0Var22222222.m(null, oea0Var22222222);
                return oea0Var22222222;
            }
            com.yandex.go.payments.data.model.u uVar = (com.yandex.go.payments.data.model.u) it3.next();
            long j2 = j;
            boolean z2 = ((kna0) ky90Var).a;
            zuj0 zuj0Var = kyzVar2.b;
            if (uVar instanceof CardDto) {
                CardDto cardDto = (CardDto) uVar;
                String str28 = cardDto.a;
                int i2 = cardDto.j;
                int i3 = cardDto.i;
                VerifyStrategy verifyStrategy = cardDto.l;
                if (str28 == null || evu0.J(str28)) {
                    tx90Var = tx90Var2;
                    it2 = it3;
                    ivtVar = null;
                    listPaymentMethodsResponse = listPaymentMethodsResponse2;
                    kyzVar = kyzVar2;
                    num = num2;
                } else {
                    boolean z3 = verifyStrategy == null;
                    ListPaymentMethodDto$Availability listPaymentMethodDto$Availability = cardDto.b;
                    if ((listPaymentMethodDto$Availability != null ? listPaymentMethodDto$Availability.a : true) || !z3) {
                        str22 = null;
                    } else {
                        String str29 = listPaymentMethodDto$Availability != null ? listPaymentMethodDto$Availability.b : null;
                        if (str29 == null) {
                            str29 = "";
                        }
                        str22 = str29;
                    }
                    String str30 = cardDto.g;
                    String str31 = str30 == null ? "" : str30;
                    String str32 = cardDto.h;
                    String str33 = str32 == null ? "" : str32;
                    String valueOf = String.valueOf(i3);
                    if (i3 <= 0) {
                        valueOf = null;
                    }
                    String str34 = valueOf == null ? "" : valueOf;
                    String valueOf2 = String.valueOf(i2);
                    if (i2 <= 0) {
                        valueOf2 = null;
                    }
                    String str35 = valueOf2 == null ? "" : valueOf2;
                    Calendar b = kyzVar2.a.b(cardDto.k);
                    if (b != null) {
                        Calendar calendar = Calendar.getInstance();
                        tx90Var = tx90Var2;
                        it2 = it3;
                        calendar.setTimeInMillis(calendar.getTimeInMillis() + j2);
                        if (b.before(calendar)) {
                            z = true;
                            String str36 = cardDto.d;
                            CardPayment$VerifyStrategy cardPayment$VerifyStrategy = (verifyStrategy != null ? jyz.a[verifyStrategy.ordinal()] : -1) != 1 ? CardPayment$VerifyStrategy.ANTIFRAUD : CardPayment$VerifyStrategy.UNKNOWN;
                            UserCardProfileDto userCardProfileDto2 = cardDto.m;
                            tx90 tx90Var4 = (userCardProfileDto2 != null || (userCardProfileName = userCardProfileDto2.a) == null) ? null : new tx90(userCardProfileName);
                            CardFamilyDto cardFamilyDto = cardDto.o;
                            um50Var = new fl8(str28, str22, z3, str31, str33, str34, str35, z, str36, cardPayment$VerifyStrategy, cardFamilyDto == null ? new el8(cardFamilyDto.a, cardFamilyDto.b) : null, cardDto.p, cardDto.q, tx90Var4);
                            listPaymentMethodsResponse = listPaymentMethodsResponse2;
                            kyzVar = kyzVar2;
                            num = num2;
                            ivtVar = um50Var;
                        }
                    } else {
                        tx90Var = tx90Var2;
                        it2 = it3;
                    }
                    z = false;
                    String str362 = cardDto.d;
                    CardPayment$VerifyStrategy cardPayment$VerifyStrategy2 = (verifyStrategy != null ? jyz.a[verifyStrategy.ordinal()] : -1) != 1 ? CardPayment$VerifyStrategy.ANTIFRAUD : CardPayment$VerifyStrategy.UNKNOWN;
                    UserCardProfileDto userCardProfileDto22 = cardDto.m;
                    if (userCardProfileDto22 != null) {
                    }
                    CardFamilyDto cardFamilyDto2 = cardDto.o;
                    um50Var = new fl8(str28, str22, z3, str31, str33, str34, str35, z, str362, cardPayment$VerifyStrategy2, cardFamilyDto2 == null ? new el8(cardFamilyDto2.a, cardFamilyDto2.b) : null, cardDto.p, cardDto.q, tx90Var4);
                    listPaymentMethodsResponse = listPaymentMethodsResponse2;
                    kyzVar = kyzVar2;
                    num = num2;
                    ivtVar = um50Var;
                }
            } else {
                tx90Var = tx90Var2;
                it2 = it3;
                if (uVar instanceof CorpAccountDto) {
                    CorpAccountDto corpAccountDto = (CorpAccountDto) uVar;
                    String str37 = corpAccountDto.a;
                    if (str37 != null && !evu0.J(str37)) {
                        ListPaymentMethodDto$Availability listPaymentMethodDto$Availability2 = corpAccountDto.b;
                        if (listPaymentMethodDto$Availability2 != null ? listPaymentMethodDto$Availability2.a : true) {
                            str20 = null;
                        } else {
                            String str38 = listPaymentMethodDto$Availability2 != null ? listPaymentMethodDto$Availability2.b : null;
                            if (str38 == null) {
                                str38 = "";
                            }
                            str20 = str38;
                        }
                        String str39 = corpAccountDto.c;
                        String str40 = str39 == null ? "" : str39;
                        String str41 = corpAccountDto.h;
                        String str42 = str41 == null ? "" : str41;
                        CostCenters costCenters = corpAccountDto.j;
                        if (costCenters != null) {
                            boolean z4 = costCenters.a;
                            int i4 = jyz.b[costCenters.b.ordinal()];
                            str21 = str37;
                            if (i4 == 1) {
                                inputFormat = CostCenterField.InputFormat.TEXT;
                            } else if (i4 == 2) {
                                inputFormat = CostCenterField.InputFormat.MIXED;
                            } else {
                                if (i4 != 3) {
                                    w511.b();
                                    return null;
                                }
                                inputFormat = CostCenterField.InputFormat.SELECT;
                            }
                            List list5 = costCenters.c;
                            ArrayList arrayList6 = new ArrayList(tcc.n(list5, 10));
                            Iterator it16 = list5.iterator();
                            while (it16.hasNext()) {
                                Iterator it17 = it16;
                                String str43 = ((CostCenters.CostCenterInfo) it16.next()).a;
                                if (str43 == null) {
                                    str43 = "";
                                }
                                arrayList6.add(new CostCenterField.a(str43));
                                it16 = it17;
                            }
                            list3 = Collections.singletonList(new CostCenterField(z4, inputFormat, arrayList6, 7));
                        } else {
                            str21 = str37;
                        }
                        h8b0Var = new jve(str21, str20, str40, str42, list3, corpAccountDto.d, corpAccountDto.e, corpAccountDto.f, corpAccountDto.g, corpAccountDto.i);
                    }
                    ivtVar = null;
                    listPaymentMethodsResponse = listPaymentMethodsResponse2;
                    kyzVar = kyzVar2;
                    num = num2;
                } else if (uVar instanceof SharedAccountDto) {
                    SharedAccountDto sharedAccountDto = (SharedAccountDto) uVar;
                    String str44 = sharedAccountDto.a;
                    String str45 = sharedAccountDto.f;
                    ListPaymentMethodDto$Availability listPaymentMethodDto$Availability3 = sharedAccountDto.b;
                    if (str44 != null && !evu0.J(str44)) {
                        ListPaymentMethodDtoType listPaymentMethodDtoType = sharedAccountDto.c;
                        int i5 = listPaymentMethodDtoType != null ? jyz.c[listPaymentMethodDtoType.ordinal()] : -1;
                        if (i5 == 1) {
                            sharedAccountType = SharedAccountType.FAMILY;
                        } else if (i5 == 2) {
                            sharedAccountType = SharedAccountType.BUSINESS;
                        }
                        SharedAccountType sharedAccountType2 = sharedAccountType;
                        boolean z5 = listPaymentMethodDto$Availability3 != null ? listPaymentMethodDto$Availability3.a : true;
                        boolean z6 = sharedAccountDto.g;
                        if (z6) {
                            str45 = sharedAccountDto.e;
                        } else if (str45 == null || evu0.J(str45)) {
                            str45 = ((avj0) zuj0Var).h(kyh0.shared_payment_inactive_default_error);
                        }
                        if (z5) {
                            str19 = null;
                        } else {
                            String str46 = listPaymentMethodDto$Availability3 != null ? listPaymentMethodDto$Availability3.b : null;
                            if (str46 == null) {
                                str46 = "";
                            }
                            str19 = str46;
                        }
                        String str47 = str45 == null ? "" : str45;
                        boolean z7 = sharedAccountDto.h == SharedAccountDto.MemberRole.OWNER;
                        boolean z8 = sharedAccountDto.i;
                        SharedAccountDto.Details details = sharedAccountDto.d;
                        String str48 = details != null ? details.a : null;
                        if (str48 == null) {
                            str48 = "";
                        }
                        String str49 = details != null ? details.b : null;
                        if (str49 == null) {
                            str49 = "";
                        }
                        d111Var = new snr0(str44, str19, sharedAccountType2, str47, z6, z7, z8, new rnr0(str48, str49, null));
                        listPaymentMethodsResponse = listPaymentMethodsResponse2;
                        kyzVar = kyzVar2;
                        num = num2;
                        ivtVar = d111Var;
                    }
                    listPaymentMethodsResponse = listPaymentMethodsResponse2;
                    kyzVar = kyzVar2;
                    num = num2;
                    ivtVar = null;
                } else if (uVar instanceof SbpTokenDto) {
                    SbpTokenDto sbpTokenDto = (SbpTokenDto) uVar;
                    String str50 = sbpTokenDto.a;
                    if (str50 != null && !evu0.J(str50)) {
                        ListPaymentMethodDto$Availability listPaymentMethodDto$Availability4 = sbpTokenDto.b;
                        if (listPaymentMethodDto$Availability4 != null ? listPaymentMethodDto$Availability4.a : true) {
                            str18 = null;
                        } else {
                            String str51 = listPaymentMethodDto$Availability4 != null ? listPaymentMethodDto$Availability4.b : null;
                            if (str51 == null) {
                                str51 = "";
                            }
                            str18 = str51;
                        }
                        boolean z9 = sbpTokenDto.g == null;
                        String str52 = sbpTokenDto.c;
                        String str53 = sbpTokenDto.f;
                        String str54 = sbpTokenDto.d;
                        String str55 = sbpTokenDto.e;
                        h8b0Var = new bjm0(str50, z9, str18, str52, str53, str54, str55 == null ? "" : str55);
                    }
                    listPaymentMethodsResponse = listPaymentMethodsResponse2;
                    kyzVar = kyzVar2;
                    num = num2;
                    ivtVar = null;
                } else {
                    boolean z10 = uVar instanceof PersonalWalletDto;
                    fef fefVar = fef.e;
                    if (z10) {
                        PersonalWalletDto personalWalletDto = (PersonalWalletDto) uVar;
                        String str56 = personalWalletDto.a;
                        ListPaymentMethodDto$Availability listPaymentMethodDto$Availability5 = personalWalletDto.b;
                        if (str56 != null && !evu0.J(str56) && personalWalletDto.m && (complementAttributes = personalWalletDto.n) != null) {
                            boolean z11 = listPaymentMethodDto$Availability5 != null ? listPaymentMethodDto$Availability5.a : true;
                            ief iefVar2 = personalWalletDto.f;
                            if (iefVar2 != null) {
                                fefVar = gwk0.h(iefVar2);
                            }
                            fef fefVar2 = fefVar;
                            if (z11) {
                                str17 = null;
                            } else {
                                String str57 = listPaymentMethodDto$Availability5 != null ? listPaymentMethodDto$Availability5.b : null;
                                if (str57 == null) {
                                    str57 = "";
                                }
                                str17 = str57;
                            }
                            String str58 = personalWalletDto.c;
                            String str59 = str58 == null ? "" : str58;
                            String str60 = personalWalletDto.o;
                            String str61 = str60 == null ? "" : str60;
                            String str62 = personalWalletDto.d;
                            String str63 = str62 == null ? "" : str62;
                            String str64 = personalWalletDto.e;
                            String str65 = complementAttributes.a;
                            if (str65 == null) {
                                str65 = "";
                            }
                            h8b0Var = new h8b0(str56, str17, str59, str61, str63, str64, fefVar2, new vxc(str65, complementAttributes.b, (List) complementAttributes.d.getValue()), null, null);
                        }
                    } else if (uVar instanceof TransportCardDto) {
                        TransportCardDto transportCardDto = (TransportCardDto) uVar;
                        xdf xdfVar = kyzVar2.c;
                        String str66 = transportCardDto.a;
                        if (str66 != null && !evu0.J(str66)) {
                            ief iefVar3 = transportCardDto.m;
                            if (iefVar3 == null) {
                                iefVar3 = iefVar;
                            }
                            if (iefVar3 != null) {
                                fefVar = gwk0.h(iefVar3);
                            }
                            TransportCardDto.CardBalance cardBalance = transportCardDto.i;
                            if (cardBalance != null) {
                                str15 = str66;
                                listPaymentMethodsResponse = listPaymentMethodsResponse2;
                                num = num2;
                                a111Var = new a111(cardBalance.b, xdfVar.a(fefVar, cardBalance.a, false, true), cardBalance.c, cardBalance.d);
                            } else {
                                listPaymentMethodsResponse = listPaymentMethodsResponse2;
                                str15 = str66;
                                num = num2;
                                a111Var = null;
                            }
                            List list6 = transportCardDto.k;
                            ArrayList arrayList7 = new ArrayList(tcc.n(list6, 10));
                            Iterator it18 = list6.iterator();
                            while (it18.hasNext()) {
                                TransportCardDto.TransportCardPaymentAction transportCardPaymentAction = (TransportCardDto.TransportCardPaymentAction) it18.next();
                                arrayList7.add(new c111(transportCardPaymentAction.a, transportCardPaymentAction.b, transportCardPaymentAction.c, transportCardPaymentAction.d));
                                it18 = it18;
                                kyzVar2 = kyzVar2;
                            }
                            kyzVar = kyzVar2;
                            int i6 = jyz.d[transportCardDto.h.ordinal()];
                            if (i6 == 1) {
                                transportCardPayment$CardStatusDomain = TransportCardPayment$CardStatusDomain.ACTIVE;
                            } else {
                                if (i6 != 2) {
                                    w511.b();
                                    return null;
                                }
                                transportCardPayment$CardStatusDomain = TransportCardPayment$CardStatusDomain.BLOCKED;
                            }
                            TransportCardPayment$CardStatusDomain transportCardPayment$CardStatusDomain2 = transportCardPayment$CardStatusDomain;
                            TransportCardDto.StatusDescription statusDescription = transportCardDto.j;
                            b111 b111Var = statusDescription != null ? new b111(statusDescription.a, statusDescription.b) : null;
                            ListPaymentMethodDto$Availability listPaymentMethodDto$Availability6 = transportCardDto.b;
                            if (listPaymentMethodDto$Availability6 != null ? listPaymentMethodDto$Availability6.a : true) {
                                str16 = null;
                            } else {
                                String str67 = listPaymentMethodDto$Availability6 != null ? listPaymentMethodDto$Availability6.b : null;
                                if (str67 == null) {
                                    str67 = "";
                                }
                                str16 = str67;
                            }
                            d111Var = new d111(str15, str16, transportCardDto.c, transportCardDto.d, transportCardDto.e, xdfVar.a(fefVar, transportCardDto.f, false, true), a111Var, arrayList7, fefVar, transportCardDto.l.a, transportCardDto.g, transportCardPayment$CardStatusDomain2, b111Var);
                            ivtVar = d111Var;
                        }
                    } else {
                        listPaymentMethodsResponse = listPaymentMethodsResponse2;
                        kyzVar = kyzVar2;
                        num = num2;
                        if (uVar instanceof YbCardDto) {
                            YbCardDto ybCardDto = (YbCardDto) uVar;
                            String str68 = ybCardDto.a;
                            if (str68 != null && !evu0.J(str68)) {
                                ListPaymentMethodDto$Availability listPaymentMethodDto$Availability7 = ybCardDto.b;
                                if (listPaymentMethodDto$Availability7 != null ? listPaymentMethodDto$Availability7.a : true) {
                                    str14 = null;
                                } else {
                                    String str69 = listPaymentMethodDto$Availability7 != null ? listPaymentMethodDto$Availability7.b : null;
                                    if (str69 == null) {
                                        str69 = "";
                                    }
                                    str14 = str69;
                                }
                                um50Var = new yy51(str68, str14, ybCardDto.c, ybCardDto.e, tq51.a(ybCardDto.f));
                                ivtVar = um50Var;
                            }
                            ivtVar = null;
                        } else if (uVar instanceof MBankAccountDto) {
                            MBankAccountDto mBankAccountDto = (MBankAccountDto) uVar;
                            String str70 = mBankAccountDto.a;
                            if (str70 != null && !evu0.J(str70)) {
                                ListPaymentMethodDto$Availability listPaymentMethodDto$Availability8 = mBankAccountDto.b;
                                if (listPaymentMethodDto$Availability8 != null ? listPaymentMethodDto$Availability8.a : true) {
                                    str13 = null;
                                } else {
                                    String str71 = listPaymentMethodDto$Availability8 != null ? listPaymentMethodDto$Availability8.b : null;
                                    if (str71 == null) {
                                        str71 = "";
                                    }
                                    str13 = str71;
                                }
                                String str72 = mBankAccountDto.c;
                                str10 = str72 != null ? str72 : "";
                                if (str10.length() == 0) {
                                    str10 = ((avj0) zuj0Var).h(kyh0.mbank_account_payment_method_name);
                                }
                                um50Var = new a000(str70, str13, str10, mBankAccountDto.e, mBankAccountDto.d, mBankAccountDto.f == null);
                                ivtVar = um50Var;
                            }
                            ivtVar = null;
                        } else if (uVar instanceof CashDto) {
                            ivtVar = new u19(iefVar != null ? iefVar.b : null);
                        } else {
                            if (uVar instanceof GooglePayDto) {
                                if (z2) {
                                    Integer num4 = locationInfo != null ? locationInfo.a : null;
                                    ivtVar = new ivt(num4 == null ? null : new zut(num4.intValue(), str23, 4));
                                }
                            } else if (uVar instanceof TransportExternalDto) {
                                TransportExternalDto transportExternalDto = (TransportExternalDto) uVar;
                                String str73 = transportExternalDto.a;
                                if (str73 != null && !evu0.J(str73)) {
                                    ListPaymentMethodDto$Availability listPaymentMethodDto$Availability9 = transportExternalDto.b;
                                    if (listPaymentMethodDto$Availability9 != null ? listPaymentMethodDto$Availability9.a : true) {
                                        str12 = null;
                                    } else {
                                        String str74 = listPaymentMethodDto$Availability9 != null ? listPaymentMethodDto$Availability9.b : null;
                                        if (str74 == null) {
                                            str74 = "";
                                        }
                                        str12 = str74;
                                    }
                                    um50Var = new h211(str73, str12, transportExternalDto.e, transportExternalDto.c, transportExternalDto.d, transportExternalDto.f);
                                    ivtVar = um50Var;
                                }
                            } else if (uVar instanceof SbpBindTokenDto) {
                                SbpBindTokenDto sbpBindTokenDto = (SbpBindTokenDto) uVar;
                                String str75 = sbpBindTokenDto.a;
                                ListPaymentMethodDto$Availability listPaymentMethodDto$Availability10 = sbpBindTokenDto.b;
                                if (str75 != null && !evu0.J(str75)) {
                                    boolean z12 = listPaymentMethodDto$Availability10 != null ? listPaymentMethodDto$Availability10.a : true;
                                    String str76 = sbpBindTokenDto.c;
                                    if (str76.length() == 0) {
                                        str76 = ((avj0) zuj0Var).h(kyh0.sbp_bind_token_payment_method_name);
                                    }
                                    String str77 = str76;
                                    if (z12) {
                                        str11 = null;
                                    } else {
                                        String str78 = listPaymentMethodDto$Availability10 != null ? listPaymentMethodDto$Availability10.b : null;
                                        if (str78 == null) {
                                            str78 = "";
                                        }
                                        str11 = str78;
                                    }
                                    um50Var = new cfm0(str75, str11, str77, sbpBindTokenDto.d, sbpBindTokenDto.e);
                                    ivtVar = um50Var;
                                }
                            } else if (uVar instanceof KaspiDto) {
                                KaspiDto kaspiDto = (KaspiDto) uVar;
                                String str79 = kaspiDto.a;
                                if (str79 != null && !evu0.J(str79)) {
                                    ListPaymentMethodDto$Availability listPaymentMethodDto$Availability11 = kaspiDto.b;
                                    if (listPaymentMethodDto$Availability11 != null ? listPaymentMethodDto$Availability11.a : true) {
                                        str9 = null;
                                    } else {
                                        String str80 = listPaymentMethodDto$Availability11 != null ? listPaymentMethodDto$Availability11.b : null;
                                        if (str80 == null) {
                                            str80 = "";
                                        }
                                        str9 = str80;
                                    }
                                    String str81 = kaspiDto.c;
                                    str10 = str81 != null ? str81 : "";
                                    if (str10.length() == 0) {
                                        str10 = ((avj0) zuj0Var).h(kyh0.kaspi_payment_method_name);
                                    }
                                    um50Var = new qgx(str79, str9, str10, kaspiDto.d, kaspiDto.e);
                                    ivtVar = um50Var;
                                }
                            } else if (uVar instanceof ClickWalletDto) {
                                ClickWalletDto clickWalletDto = (ClickWalletDto) uVar;
                                String str82 = clickWalletDto.a;
                                if (str82 != null && !evu0.J(str82)) {
                                    ListPaymentMethodDto$Availability listPaymentMethodDto$Availability12 = clickWalletDto.b;
                                    if (listPaymentMethodDto$Availability12 != null ? listPaymentMethodDto$Availability12.a : true) {
                                        str8 = null;
                                    } else {
                                        String str83 = listPaymentMethodDto$Availability12 != null ? listPaymentMethodDto$Availability12.b : null;
                                        if (str83 == null) {
                                            str83 = "";
                                        }
                                        str8 = str83;
                                    }
                                    String str84 = clickWalletDto.c;
                                    if (str84.length() == 0) {
                                        str84 = ((avj0) zuj0Var).h(kyh0.click_wallet_payment_method_name);
                                    }
                                    um50Var = new p1c(str82, str8, str84, clickWalletDto.d, clickWalletDto.e);
                                    ivtVar = um50Var;
                                }
                            } else if (uVar instanceof EasypaisaWalletDto) {
                                EasypaisaWalletDto easypaisaWalletDto = (EasypaisaWalletDto) uVar;
                                String str85 = easypaisaWalletDto.a;
                                if (str85 != null && !evu0.J(str85)) {
                                    ListPaymentMethodDto$Availability listPaymentMethodDto$Availability13 = easypaisaWalletDto.b;
                                    if (listPaymentMethodDto$Availability13 != null ? listPaymentMethodDto$Availability13.a : true) {
                                        str7 = null;
                                    } else {
                                        String str86 = listPaymentMethodDto$Availability13 != null ? listPaymentMethodDto$Availability13.b : null;
                                        str7 = str86 != null ? str86 : "";
                                    }
                                    boolean z13 = easypaisaWalletDto.f == null;
                                    String str87 = easypaisaWalletDto.c;
                                    if (str87.length() == 0) {
                                        str87 = ((avj0) zuj0Var).h(kyh0.easypaisa_wallet_payment_method_name);
                                    }
                                    um50Var = new vbn(str85, str7, str87, easypaisaWalletDto.d, easypaisaWalletDto.e, z13);
                                    ivtVar = um50Var;
                                }
                            } else if (uVar instanceof JazzcashWalletDto) {
                                JazzcashWalletDto jazzcashWalletDto = (JazzcashWalletDto) uVar;
                                String str88 = jazzcashWalletDto.a;
                                if (str88 != null && !evu0.J(str88)) {
                                    ListPaymentMethodDto$Availability listPaymentMethodDto$Availability14 = jazzcashWalletDto.b;
                                    if (listPaymentMethodDto$Availability14 != null ? listPaymentMethodDto$Availability14.a : true) {
                                        str6 = null;
                                    } else {
                                        String str89 = listPaymentMethodDto$Availability14 != null ? listPaymentMethodDto$Availability14.b : null;
                                        str6 = str89 != null ? str89 : "";
                                    }
                                    boolean z14 = jazzcashWalletDto.f == null;
                                    String str90 = jazzcashWalletDto.c;
                                    if (str90.length() == 0) {
                                        str90 = ((avj0) zuj0Var).h(kyh0.jazzcash_wallet_payment_method_name);
                                    }
                                    um50Var = new v7x(str88, str6, str90, jazzcashWalletDto.d, jazzcashWalletDto.e, z14);
                                    ivtVar = um50Var;
                                }
                            } else if (uVar instanceof FastshiftAccountDto) {
                                FastshiftAccountDto fastshiftAccountDto = (FastshiftAccountDto) uVar;
                                String str91 = fastshiftAccountDto.a;
                                if (str91 != null && !evu0.J(str91)) {
                                    ListPaymentMethodDto$Availability listPaymentMethodDto$Availability15 = fastshiftAccountDto.b;
                                    if (listPaymentMethodDto$Availability15 != null ? listPaymentMethodDto$Availability15.a : true) {
                                        str5 = null;
                                    } else {
                                        String str92 = listPaymentMethodDto$Availability15 != null ? listPaymentMethodDto$Availability15.b : null;
                                        str5 = str92 != null ? str92 : "";
                                    }
                                    boolean z15 = fastshiftAccountDto.f == null;
                                    String str93 = fastshiftAccountDto.c;
                                    if (str93.length() == 0) {
                                        str93 = ((avj0) zuj0Var).h(kyh0.fastshift_account_payment_method_name);
                                    }
                                    um50Var = new mcp(str91, str5, str93, fastshiftAccountDto.d, fastshiftAccountDto.e, z15);
                                    ivtVar = um50Var;
                                }
                            } else if (uVar instanceof CashLikeDto) {
                                CashLikeDto cashLikeDto = (CashLikeDto) uVar;
                                String str94 = cashLikeDto.a;
                                if (str94 != null && !evu0.J(str94)) {
                                    ListPaymentMethodDto$Availability listPaymentMethodDto$Availability16 = cashLikeDto.b;
                                    if (listPaymentMethodDto$Availability16 != null ? listPaymentMethodDto$Availability16.a : true) {
                                        str4 = null;
                                    } else {
                                        String str95 = listPaymentMethodDto$Availability16 != null ? listPaymentMethodDto$Availability16.b : null;
                                        if (str95 == null) {
                                            str95 = "";
                                        }
                                        str4 = str95;
                                    }
                                    String str96 = cashLikeDto.c;
                                    String str97 = str96 == null ? "" : str96;
                                    String str98 = cashLikeDto.e;
                                    String str99 = str98 == null ? "" : str98;
                                    String str100 = cashLikeDto.d;
                                    um50Var = new t19(str94, str4, str97, str99, str100 == null ? "" : str100);
                                    ivtVar = um50Var;
                                }
                            } else if (uVar instanceof YapeTokenDto) {
                                YapeTokenDto yapeTokenDto = (YapeTokenDto) uVar;
                                String str101 = yapeTokenDto.a;
                                if (str101 != null && !evu0.J(str101)) {
                                    ListPaymentMethodDto$Availability listPaymentMethodDto$Availability17 = yapeTokenDto.b;
                                    if (listPaymentMethodDto$Availability17 != null ? listPaymentMethodDto$Availability17.a : true) {
                                        str3 = null;
                                    } else {
                                        String str102 = listPaymentMethodDto$Availability17 != null ? listPaymentMethodDto$Availability17.b : null;
                                        str3 = str102 != null ? str102 : "";
                                    }
                                    boolean z16 = yapeTokenDto.f == null;
                                    String str103 = yapeTokenDto.c;
                                    if (str103.length() == 0) {
                                        str103 = ((avj0) zuj0Var).h(kyh0.yape_token_payment_method_name);
                                    }
                                    um50Var = new ep51(str101, str3, str103, yapeTokenDto.d, yapeTokenDto.e, z16);
                                    ivtVar = um50Var;
                                }
                            } else if (uVar instanceof NequiTokenDto) {
                                NequiTokenDto nequiTokenDto = (NequiTokenDto) uVar;
                                String str104 = nequiTokenDto.a;
                                if (str104 != null && !evu0.J(str104)) {
                                    ListPaymentMethodDto$Availability listPaymentMethodDto$Availability18 = nequiTokenDto.b;
                                    if (listPaymentMethodDto$Availability18 != null ? listPaymentMethodDto$Availability18.a : true) {
                                        str2 = null;
                                    } else {
                                        String str105 = listPaymentMethodDto$Availability18 != null ? listPaymentMethodDto$Availability18.b : null;
                                        str2 = str105 != null ? str105 : "";
                                    }
                                    boolean z17 = nequiTokenDto.f == null;
                                    String str106 = nequiTokenDto.c;
                                    if (str106.length() == 0) {
                                        str106 = ((avj0) zuj0Var).h(kyh0.nequi_token_payment_method_name);
                                    }
                                    um50Var = new um50(str104, str2, str106, nequiTokenDto.d, nequiTokenDto.e, z17);
                                    ivtVar = um50Var;
                                }
                            } else if (!(uVar instanceof UnknownDto)) {
                                w511.b();
                                return null;
                            }
                            ivtVar = null;
                        }
                    }
                    listPaymentMethodsResponse = listPaymentMethodsResponse2;
                    kyzVar = kyzVar2;
                    num = num2;
                    ivtVar = null;
                }
                listPaymentMethodsResponse = listPaymentMethodsResponse2;
                kyzVar = kyzVar2;
                ivtVar = h8b0Var;
                num = num2;
            }
            if (ivtVar != null) {
                arrayList2.add(ivtVar);
            }
            j = j2;
            num2 = num;
            tx90Var2 = tx90Var;
            it3 = it2;
            listPaymentMethodsResponse2 = listPaymentMethodsResponse;
            kyzVar2 = kyzVar;
        }
    }

    public final r0 d() {
        return this.g;
    }

    public final Object e(ky90 ky90Var, dqh dqhVar, h0a0 h0a0Var, boolean z, ContinuationImpl continuationImpl) {
        this.c.getClass();
        return tje.k0(uyj.a, new PaymentOptionsRepository$requestPaymentOptions$2(this, ky90Var, dqhVar, h0a0Var, z, null), continuationImpl);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(h0a0 h0a0Var, ky90 ky90Var, dqh dqhVar, ContinuationImpl continuationImpl) {
        PaymentOptionsRepository$requestPaymentOptions$3 paymentOptionsRepository$requestPaymentOptions$3;
        int i;
        String str;
        ec7 ec7Var;
        if (continuationImpl instanceof PaymentOptionsRepository$requestPaymentOptions$3) {
            paymentOptionsRepository$requestPaymentOptions$3 = (PaymentOptionsRepository$requestPaymentOptions$3) continuationImpl;
            int i2 = paymentOptionsRepository$requestPaymentOptions$3.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                paymentOptionsRepository$requestPaymentOptions$3.label = i2 - Integer.MIN_VALUE;
                Object obj = paymentOptionsRepository$requestPaymentOptions$3.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentOptionsRepository$requestPaymentOptions$3.label;
                str = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    h hVar = this.a;
                    zzs zzsVar = h0a0Var.a;
                    String str2 = this.e;
                    paymentOptionsRepository$requestPaymentOptions$3.L$0 = h0a0Var;
                    paymentOptionsRepository$requestPaymentOptions$3.L$1 = ky90Var;
                    paymentOptionsRepository$requestPaymentOptions$3.L$2 = dqhVar;
                    paymentOptionsRepository$requestPaymentOptions$3.label = 1;
                    obj = hVar.a(zzsVar, str2, paymentOptionsRepository$requestPaymentOptions$3);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    dqhVar = (dqh) paymentOptionsRepository$requestPaymentOptions$3.L$2;
                    ky90Var = (ky90) paymentOptionsRepository$requestPaymentOptions$3.L$1;
                    h0a0Var = (h0a0) paymentOptionsRepository$requestPaymentOptions$3.L$0;
                    kotlin.b.b(obj);
                }
                fty ftyVar = (fty) obj;
                this.i = ftyVar.c;
                ec7Var = this.i;
                if (!(ec7Var instanceof dc7)) {
                    str = ((xnt) this.d).e(h0a0Var.a, zzs.Companion.serializer());
                } else if (jl40.l(ec7Var, l76.y)) {
                    str = h0a0Var.b;
                } else if (!jl40.l(ec7Var, bei.z)) {
                    w511.b();
                    return null;
                }
                if (str != null) {
                    this.f.put(str, ftyVar);
                }
                return c(ky90Var, dqhVar, ftyVar);
            }
        }
        paymentOptionsRepository$requestPaymentOptions$3 = new PaymentOptionsRepository$requestPaymentOptions$3(this, continuationImpl);
        Object obj2 = paymentOptionsRepository$requestPaymentOptions$3.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentOptionsRepository$requestPaymentOptions$3.label;
        str = null;
        if (i != 0) {
        }
        fty ftyVar2 = (fty) obj2;
        this.i = ftyVar2.c;
        ec7Var = this.i;
        if (!(ec7Var instanceof dc7)) {
        }
        if (str != null) {
        }
        return c(ky90Var, dqhVar, ftyVar2);
    }
}
