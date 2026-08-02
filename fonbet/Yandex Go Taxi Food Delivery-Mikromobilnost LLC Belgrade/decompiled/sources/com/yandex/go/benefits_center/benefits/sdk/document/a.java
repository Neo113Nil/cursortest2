package com.yandex.go.benefits_center.benefits.sdk.document;

import com.yandex.go.benefits_center.benefits.data.experiment.BenefitsCenterTitleExperiment;
import com.yandex.go.benefits_center.benefits.data.model.BenefitCenterRequestBody;
import com.yandex.go.benefits_center.benefits.data.model.BenefitsCenterBduiPayload;
import com.yandex.go.benefits_center.benefits.data.model.BenefitsCenterBduiPayload$NavigationAction$OpenActivation;
import com.yandex.go.benefits_center.benefits.data.model.BenefitsCenterBduiPayload$NavigationAction$OpenPromoCode;
import com.yandex.go.promocodes.base.impl.promo_codes.data.repositories.c;
import com.yandex.go.zone.repository.r;
import defpackage.aks0;
import defpackage.cda0;
import defpackage.cnr0;
import defpackage.co5;
import defpackage.mn5;
import defpackage.mo21;
import defpackage.nn5;
import defpackage.ny61;
import defpackage.on5;
import defpackage.oyr;
import defpackage.pn5;
import defpackage.po21;
import defpackage.pwy;
import defpackage.rfa0;
import defpackage.rz0;
import defpackage.scc;
import defpackage.u1m;
import defpackage.un5;
import defpackage.uwl;
import defpackage.w511;
import defpackage.wnt;
import defpackage.xm5;
import defpackage.xnt;
import defpackage.ywl;
import defpackage.zn5;
import java.io.Serializable;
import java.util.Map;
import kotlin.b;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.preorder.source.userposition.e;

/* loaded from: classes12.dex */
public final class a {
    public final wnt a;
    public final r b;
    public final po21 c;
    public final cda0 d;
    public final co5 e;
    public final c f;
    public final rz0 g;

    public a(wnt wntVar, r rVar, po21 po21Var, cda0 cda0Var, co5 co5Var, c cVar, rz0 rz0Var) {
        this.a = wntVar;
        this.b = rVar;
        this.c = po21Var;
        this.d = cda0Var;
        this.e = co5Var;
        this.f = cVar;
        this.g = rz0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(zn5 zn5Var, boolean z, boolean z2, ContinuationImpl continuationImpl) {
        BenefitsCenterLoadActionFactory$create$1 benefitsCenterLoadActionFactory$create$1;
        int i;
        String str;
        boolean z3;
        if (continuationImpl instanceof BenefitsCenterLoadActionFactory$create$1) {
            benefitsCenterLoadActionFactory$create$1 = (BenefitsCenterLoadActionFactory$create$1) continuationImpl;
            int i2 = benefitsCenterLoadActionFactory$create$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                benefitsCenterLoadActionFactory$create$1.label = i2 - Integer.MIN_VALUE;
                Object obj = benefitsCenterLoadActionFactory$create$1.result;
                Serializable serializable = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = benefitsCenterLoadActionFactory$create$1.label;
                ywl ywlVar = null;
                if (i != 0) {
                    b.b(obj);
                    benefitsCenterLoadActionFactory$create$1.L$0 = null;
                    benefitsCenterLoadActionFactory$create$1.L$1 = "bdui/v1/benefits-center/view";
                    benefitsCenterLoadActionFactory$create$1.Z$0 = z;
                    benefitsCenterLoadActionFactory$create$1.Z$1 = z2;
                    benefitsCenterLoadActionFactory$create$1.label = 1;
                    Serializable b = b(zn5Var, z, benefitsCenterLoadActionFactory$create$1);
                    if (b == serializable) {
                        return serializable;
                    }
                    str = "bdui/v1/benefits-center/view";
                    obj = b;
                    z3 = z2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z3 = benefitsCenterLoadActionFactory$create$1.Z$1;
                    str = (String) benefitsCenterLoadActionFactory$create$1.L$1;
                    b.b(obj);
                }
                u1m u1mVar = new u1m(2, str, (Map) obj);
                if (z3) {
                    ywlVar = new ywl(new aks0(oyr.p("(theme bgMinor 0p (col ", this.g.b.isEnabled() ? "(padded 32p 16p 24p 16p (col 100% (row 100% sb (space 0p) (bone 111p 72p 35p) (space 0p)) (space 16p) (row 100% sb (space 0p) (bone 224p 23p 11p) (space 0p)))) (padded 0p 0p 28p 0p (row 100% sb (space 0p) (bone 139p 32p 16p) (space 0p))) (padded 12p 12p 20p 12p (row 100% (row 50% (padded 0p 4p 0p 0p (bone 100% 64p 20p))) (row 50% (padded 0p 0p 0p 4p (bone 100% 64p 20p))))) " : "", "(padded 0p 12p 0p 12p (bone 100% 48p 16p)) (space 12p) (padded 12p 12p 8p 12p (col (repeat 7 (col (bone 100% 64p 20p) (space 6p)))))))"), null), un5.INSTANCE, cnr0.b, new uwl(null, null, null, null, null, null), null, null);
                }
                return new pwy(u1mVar, ywlVar, false, 4);
            }
        }
        benefitsCenterLoadActionFactory$create$1 = new BenefitsCenterLoadActionFactory$create$1(this, continuationImpl);
        Object obj2 = benefitsCenterLoadActionFactory$create$1.result;
        Serializable serializable2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = benefitsCenterLoadActionFactory$create$1.label;
        ywl ywlVar2 = null;
        if (i != 0) {
        }
        u1m u1mVar2 = new u1m(2, str, (Map) obj2);
        if (z3) {
        }
        return new pwy(u1mVar2, ywlVar2, false, 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable b(zn5 zn5Var, boolean z, ContinuationImpl continuationImpl) {
        BenefitsCenterLoadActionFactory$createBody$1 benefitsCenterLoadActionFactory$createBody$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        String str;
        Object b;
        mo21 mo21Var;
        zn5 zn5Var2;
        boolean z2;
        rfa0 rfa0Var;
        String str2;
        if (continuationImpl instanceof BenefitsCenterLoadActionFactory$createBody$1) {
            benefitsCenterLoadActionFactory$createBody$1 = (BenefitsCenterLoadActionFactory$createBody$1) continuationImpl;
            int i2 = benefitsCenterLoadActionFactory$createBody$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                benefitsCenterLoadActionFactory$createBody$1.label = i2 - Integer.MIN_VALUE;
                Object obj = benefitsCenterLoadActionFactory$createBody$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = benefitsCenterLoadActionFactory$createBody$1.label;
                xm5 xm5Var = null;
                if (i != 0) {
                    b.b(obj);
                    String a = this.b.a();
                    benefitsCenterLoadActionFactory$createBody$1.L$0 = zn5Var;
                    benefitsCenterLoadActionFactory$createBody$1.L$1 = a;
                    benefitsCenterLoadActionFactory$createBody$1.Z$0 = z;
                    benefitsCenterLoadActionFactory$createBody$1.label = 1;
                    Object h = ((e) this.c).h(benefitsCenterLoadActionFactory$createBody$1);
                    if (h != coroutineSingletons) {
                        str = a;
                        obj = h;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z2 = benefitsCenterLoadActionFactory$createBody$1.Z$0;
                    rfa0Var = (rfa0) benefitsCenterLoadActionFactory$createBody$1.L$3;
                    mo21Var = (mo21) benefitsCenterLoadActionFactory$createBody$1.L$2;
                    str = (String) benefitsCenterLoadActionFactory$createBody$1.L$1;
                    zn5Var2 = (zn5) benefitsCenterLoadActionFactory$createBody$1.L$0;
                    b.b(obj);
                    BenefitsCenterTitleExperiment benefitsCenterTitleExperiment = (BenefitsCenterTitleExperiment) obj;
                    str2 = benefitsCenterTitleExperiment.d;
                    if (str2 == null) {
                        String str3 = (String) benefitsCenterTitleExperiment.b.get(str2);
                        if (str3 != null) {
                            str2 = str3;
                        }
                    } else {
                        str2 = null;
                    }
                    String str4 = zn5Var2.a;
                    if (!z2) {
                        pn5 pn5Var = zn5Var2.b;
                        if (!(pn5Var instanceof nn5)) {
                            if (pn5Var instanceof on5) {
                                xm5Var = new BenefitsCenterBduiPayload$NavigationAction$OpenPromoCode(((on5) pn5Var).a);
                            } else {
                                if (!(pn5Var instanceof mn5)) {
                                    w511.b();
                                    return null;
                                }
                                xm5Var = new BenefitsCenterBduiPayload$NavigationAction$OpenActivation(((mn5) pn5Var).a);
                            }
                        }
                    }
                    BenefitsCenterBduiPayload benefitsCenterBduiPayload = new BenefitsCenterBduiPayload(str4, str2, xm5Var);
                    BenefitCenterRequestBody benefitCenterRequestBody = new BenefitCenterRequestBody(new BenefitCenterRequestBody.PaymentInfo(rfa0Var.b, rfa0Var.a.getCode()), new BenefitCenterRequestBody.GeoState(mo21Var.c, str, scc.g(new Double(mo21Var.b), new Double(mo21Var.a))), this.f.g());
                    MapBuilder mapBuilder = new MapBuilder();
                    KSerializer serializer = BenefitsCenterBduiPayload.Companion.serializer();
                    xnt xntVar = (xnt) this.a;
                    mapBuilder.put("bdui", xntVar.f(benefitsCenterBduiPayload, serializer));
                    mapBuilder.put("benefits_center_view", xntVar.f(benefitCenterRequestBody, BenefitCenterRequestBody.Companion.serializer()));
                    return mapBuilder.j();
                }
                z = benefitsCenterLoadActionFactory$createBody$1.Z$0;
                String str5 = (String) benefitsCenterLoadActionFactory$createBody$1.L$1;
                zn5 zn5Var3 = (zn5) benefitsCenterLoadActionFactory$createBody$1.L$0;
                b.b(obj);
                str = str5;
                zn5Var = zn5Var3;
                mo21 mo21Var2 = (mo21) obj;
                rfa0 f = ((com.yandex.go.payments.paymentlist.data.c) this.d).f(null);
                benefitsCenterLoadActionFactory$createBody$1.L$0 = zn5Var;
                benefitsCenterLoadActionFactory$createBody$1.L$1 = str;
                benefitsCenterLoadActionFactory$createBody$1.L$2 = mo21Var2;
                benefitsCenterLoadActionFactory$createBody$1.L$3 = f;
                benefitsCenterLoadActionFactory$createBody$1.Z$0 = z;
                benefitsCenterLoadActionFactory$createBody$1.label = 2;
                b = this.e.a.b(benefitsCenterLoadActionFactory$createBody$1);
                if (b != coroutineSingletons) {
                    mo21Var = mo21Var2;
                    obj = b;
                    zn5Var2 = zn5Var;
                    z2 = z;
                    rfa0Var = f;
                    BenefitsCenterTitleExperiment benefitsCenterTitleExperiment2 = (BenefitsCenterTitleExperiment) obj;
                    str2 = benefitsCenterTitleExperiment2.d;
                    if (str2 == null) {
                    }
                    String str42 = zn5Var2.a;
                    if (!z2) {
                    }
                    BenefitsCenterBduiPayload benefitsCenterBduiPayload2 = new BenefitsCenterBduiPayload(str42, str2, xm5Var);
                    BenefitCenterRequestBody benefitCenterRequestBody2 = new BenefitCenterRequestBody(new BenefitCenterRequestBody.PaymentInfo(rfa0Var.b, rfa0Var.a.getCode()), new BenefitCenterRequestBody.GeoState(mo21Var.c, str, scc.g(new Double(mo21Var.b), new Double(mo21Var.a))), this.f.g());
                    MapBuilder mapBuilder2 = new MapBuilder();
                    KSerializer serializer2 = BenefitsCenterBduiPayload.Companion.serializer();
                    xnt xntVar2 = (xnt) this.a;
                    mapBuilder2.put("bdui", xntVar2.f(benefitsCenterBduiPayload2, serializer2));
                    mapBuilder2.put("benefits_center_view", xntVar2.f(benefitCenterRequestBody2, BenefitCenterRequestBody.Companion.serializer()));
                    return mapBuilder2.j();
                }
                return coroutineSingletons;
            }
        }
        benefitsCenterLoadActionFactory$createBody$1 = new BenefitsCenterLoadActionFactory$createBody$1(this, continuationImpl);
        Object obj2 = benefitsCenterLoadActionFactory$createBody$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = benefitsCenterLoadActionFactory$createBody$1.label;
        xm5 xm5Var2 = null;
        if (i != 0) {
        }
        mo21 mo21Var22 = (mo21) obj2;
        rfa0 f2 = ((com.yandex.go.payments.paymentlist.data.c) this.d).f(null);
        benefitsCenterLoadActionFactory$createBody$1.L$0 = zn5Var;
        benefitsCenterLoadActionFactory$createBody$1.L$1 = str;
        benefitsCenterLoadActionFactory$createBody$1.L$2 = mo21Var22;
        benefitsCenterLoadActionFactory$createBody$1.L$3 = f2;
        benefitsCenterLoadActionFactory$createBody$1.Z$0 = z;
        benefitsCenterLoadActionFactory$createBody$1.label = 2;
        b = this.e.a.b(benefitsCenterLoadActionFactory$createBody$1);
        if (b != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
