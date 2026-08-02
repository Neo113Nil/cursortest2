package com.ybsdk.feature.partnerpayments.internal.screens.save.presentation;

import com.ybsdk.core.utils.dto.common.FailDataException;
import com.ybsdk.di.modules.features.j;
import com.ybsdk.di.modules.features.k;
import com.ybsdk.feature.partnerpayments.api.PartnerPaymentsFeature$BindingStatus;
import com.ybsdk.feature.partnerpayments.api.PartnerSaveScreenParams;
import defpackage.ai90;
import defpackage.ak80;
import defpackage.b64;
import defpackage.bqg;
import defpackage.cqg;
import defpackage.ct11;
import defpackage.dqg;
import defpackage.ds31;
import defpackage.f42;
import defpackage.g8e;
import defpackage.h791;
import defpackage.j3h;
import defpackage.jl40;
import defpackage.l0p;
import defpackage.lrp0;
import defpackage.ny61;
import defpackage.ph90;
import defpackage.pz40;
import defpackage.pzt0;
import defpackage.qh90;
import defpackage.s9u0;
import defpackage.tfl0;
import defpackage.tje;
import defpackage.uc5;
import defpackage.w511;
import defpackage.x4c;
import defpackage.zy11;
import java.util.Collections;
import java.util.Locale;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

/* loaded from: classes3.dex */
public final class a extends uc5 {
    public final com.ybsdk.feature.partnerpayments.internal.domain.a B;
    public final j C;
    public final PartnerSaveScreenParams D;
    public final j3h E;
    public final ai90 F;
    public final k G;
    public final tfl0 H;
    public final f42 I;
    public pzt0 J;
    public pzt0 K;

    public a(com.ybsdk.feature.partnerpayments.internal.domain.a aVar, j jVar, qh90 qh90Var, PartnerSaveScreenParams partnerSaveScreenParams, j3h j3hVar, ai90 ai90Var, k kVar, tfl0 tfl0Var, f42 f42Var) {
        super(new ak80(9, partnerSaveScreenParams), qh90Var);
        this.B = aVar;
        this.C = jVar;
        this.D = partnerSaveScreenParams;
        this.E = j3hVar;
        this.F = ai90Var;
        this.G = kVar;
        this.H = tfl0Var;
        this.I = f42Var;
        f0();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b0(a aVar, String str, ContinuationImpl continuationImpl) {
        PartnerSaveViewModel$awaitSaveStatus$1 partnerSaveViewModel$awaitSaveStatus$1;
        int i;
        PartnerPaymentsFeature$BindingStatus partnerPaymentsFeature$BindingStatus;
        PartnerPaymentsFeature$BindingStatus partnerPaymentsFeature$BindingStatus2;
        Object obj;
        Throwable a;
        String str2;
        pz40 Y;
        r0 r0Var;
        Object value;
        ph90 ph90Var;
        r0 r0Var2;
        Object value2;
        r0 r0Var3;
        Object value3;
        r0 r0Var4;
        Object value4;
        lrp0 lrp0Var = lrp0.s;
        f42 f42Var = aVar.I;
        if (continuationImpl instanceof PartnerSaveViewModel$awaitSaveStatus$1) {
            partnerSaveViewModel$awaitSaveStatus$1 = (PartnerSaveViewModel$awaitSaveStatus$1) continuationImpl;
            int i2 = partnerSaveViewModel$awaitSaveStatus$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                partnerSaveViewModel$awaitSaveStatus$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = partnerSaveViewModel$awaitSaveStatus$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = partnerSaveViewModel$awaitSaveStatus$1.label;
                if (i != 0) {
                    b.b(obj2);
                    PartnerSaveScreenParams partnerSaveScreenParams = aVar.D;
                    if (partnerSaveScreenParams instanceof PartnerSaveScreenParams.BindingParner) {
                        partnerPaymentsFeature$BindingStatus = ((PartnerSaveScreenParams.BindingParner) partnerSaveScreenParams).getBindingStatus();
                    } else {
                        if (!jl40.l(partnerSaveScreenParams, PartnerSaveScreenParams.SelectPartner.INSTANCE)) {
                            w511.b();
                            return null;
                        }
                        partnerPaymentsFeature$BindingStatus = PartnerPaymentsFeature$BindingStatus.ENABLED;
                    }
                    com.ybsdk.feature.partnerpayments.internal.domain.a aVar2 = aVar.B;
                    partnerSaveViewModel$awaitSaveStatus$1.L$0 = partnerPaymentsFeature$BindingStatus;
                    partnerSaveViewModel$awaitSaveStatus$1.label = 1;
                    Object a2 = aVar2.a(str, partnerSaveViewModel$awaitSaveStatus$1);
                    if (a2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    partnerPaymentsFeature$BindingStatus2 = partnerPaymentsFeature$BindingStatus;
                    obj = a2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    partnerPaymentsFeature$BindingStatus2 = (PartnerPaymentsFeature$BindingStatus) partnerSaveViewModel$awaitSaveStatus$1.L$0;
                    b.b(obj2);
                    obj = ((Result) obj2).getValue();
                }
                if (!(obj instanceof Result.Failure)) {
                    Object obj3 = (dqg) obj;
                    if (obj3 instanceof bqg) {
                        bqg bqgVar = (bqg) obj3;
                        String str3 = bqgVar.a;
                        f42Var.O(str3, partnerPaymentsFeature$BindingStatus2);
                        pz40 Y2 = aVar.Y();
                        do {
                            r0Var4 = (r0) Y2;
                            value4 = r0Var4.getValue();
                        } while (!r0Var4.k(value4, ph90.a((ph90) value4, null, null, new Result(new Result.Failure(new FailDataException((ct11) obj3))), 3)));
                        x4c.g("Failed to get status for partner saving", null, b64.l("error=", str3, ", description=", bqgVar.b), Collections.singletonList(lrp0Var), 2);
                    } else {
                        if (!(obj3 instanceof cqg)) {
                            w511.b();
                            return null;
                        }
                        s9u0 s9u0Var = (s9u0) ((cqg) obj3).a;
                        String str4 = s9u0Var.a;
                        String str5 = s9u0Var.a;
                        if (jl40.l(str4, "SUCCESS")) {
                            l0p l0pVar = f42Var.b.y;
                            l0pVar.a.a("external_member.update_autopayment_settings.loaded", g8e.w(1, ACSPConstants.STATUS, partnerPaymentsFeature$BindingStatus2.name().toLowerCase(Locale.ROOT)));
                            String str6 = s9u0Var.b;
                            if (str6 == null || h791.e(aVar.E, str6, false, null, 14) == null) {
                                aVar.H.e();
                            }
                        } else {
                            f42Var.O(str5, partnerPaymentsFeature$BindingStatus2);
                            pz40 Y3 = aVar.Y();
                            do {
                                r0Var3 = (r0) Y3;
                                value3 = r0Var3.getValue();
                            } while (!r0Var3.k(value3, ph90.a((ph90) value3, null, null, new Result(new Result.Failure(new Exception("Unsuccessful status on partner save"))), 3)));
                            x4c.g("Unsuccessful status on partner save", null, str5, Collections.singletonList(lrp0Var), 2);
                        }
                    }
                }
                a = Result.a(obj);
                if (a == null) {
                    String message = a.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    f42Var.O(message, partnerPaymentsFeature$BindingStatus2);
                    pz40 Y4 = aVar.Y();
                    do {
                        r0Var2 = (r0) Y4;
                        value2 = r0Var2.getValue();
                        str2 = null;
                    } while (!r0Var2.k(value2, ph90.a((ph90) value2, null, null, new Result(new Result.Failure(a)), 3)));
                    x4c.g("Failed to get status for partner saving", null, a.getMessage(), Collections.singletonList(lrp0Var), 2);
                } else {
                    str2 = null;
                }
                Y = aVar.Y();
                do {
                    r0Var = (r0) Y;
                    value = r0Var.getValue();
                    ph90Var = (ph90) value;
                } while (!r0Var.k(value, ph90.a(ph90Var, str2, str2, ph90Var.c, 3)));
                return zy11.a;
            }
        }
        partnerSaveViewModel$awaitSaveStatus$1 = new PartnerSaveViewModel$awaitSaveStatus$1(aVar, continuationImpl);
        Object obj22 = partnerSaveViewModel$awaitSaveStatus$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = partnerSaveViewModel$awaitSaveStatus$1.label;
        if (i != 0) {
        }
        if (!(obj instanceof Result.Failure)) {
        }
        a = Result.a(obj);
        if (a == null) {
        }
        Y = aVar.Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
            ph90Var = (ph90) value;
        } while (!r0Var.k(value, ph90.a(ph90Var, str2, str2, ph90Var.c, 3)));
        return zy11.a;
    }

    @Override // defpackage.yr31
    public final void V() {
        pzt0 pzt0Var = this.J;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.J = null;
        pzt0 pzt0Var2 = this.K;
        if (pzt0Var2 != null) {
            pzt0Var2.a(null);
        }
        this.K = null;
    }

    public final void c0() {
        this.H.e();
    }

    public final void d0(String str) {
        r0 r0Var;
        Object value;
        PartnerPaymentsFeature$BindingStatus partnerPaymentsFeature$BindingStatus;
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, ph90.a((ph90) value, str, null, null, 6)));
        pzt0 pzt0Var = this.J;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        PartnerSaveScreenParams partnerSaveScreenParams = this.D;
        if (partnerSaveScreenParams instanceof PartnerSaveScreenParams.BindingParner) {
            partnerPaymentsFeature$BindingStatus = ((PartnerSaveScreenParams.BindingParner) partnerSaveScreenParams).getBindingStatus();
        } else {
            if (!jl40.l(partnerSaveScreenParams, PartnerSaveScreenParams.SelectPartner.INSTANCE)) {
                w511.b();
                return;
            }
            partnerPaymentsFeature$BindingStatus = PartnerPaymentsFeature$BindingStatus.ENABLED;
        }
        l0p l0pVar = this.I.b.y;
        l0pVar.a.a("external_member.update_autopayment_settings.initiated", g8e.w(1, ACSPConstants.STATUS, partnerPaymentsFeature$BindingStatus.name().toLowerCase(Locale.ROOT)));
        this.J = tje.N(ds31.a(this), null, null, new PartnerSaveViewModel$onPartnerSelected$2(this, str, partnerPaymentsFeature$BindingStatus, null), 3);
    }

    public final void e0() {
        r0 r0Var;
        Object value;
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, ph90.a((ph90) value, null, null, null, 1)));
        f0();
    }

    public final void f0() {
        String str = ((ph90) X()).a;
        if (str != null) {
            d0(str);
            return;
        }
        pzt0 pzt0Var = this.K;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.K = tje.N(ds31.a(this), null, null, new PartnerSaveViewModel$startPartnerSelection$1(this, null), 3);
    }
}
