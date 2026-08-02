package com.yandex.go.address_confirmation.analytics;

import com.yandex.go.address.models.Address;
import com.yandex.go.address_confirmation.api.TargetScreenAfterConfirmation;
import defpackage.dat0;
import defpackage.jl40;
import defpackage.mo21;
import defpackage.ny61;
import defpackage.pj;
import defpackage.po21;
import defpackage.pv0;
import defpackage.qr0;
import defpackage.rr0;
import defpackage.tcc;
import defpackage.w511;
import defpackage.xv21;
import defpackage.yne;
import defpackage.zy11;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.taxi.preorder.source.userposition.e;
import ru.yandex.taxi.search.suggest.i;

/* loaded from: classes12.dex */
public final class a {
    public final i a;
    public final po21 b;
    public final ru.yandex.taxi.preorder.source.userposition.a c;
    public final pj d;

    public a(i iVar, po21 po21Var, ru.yandex.taxi.preorder.source.userposition.a aVar, pj pjVar) {
        this.a = iVar;
        this.b = po21Var;
        this.c = aVar;
        this.d = pjVar;
    }

    public static rr0 d(yne yneVar) {
        String lowerCase = yneVar.c.name().toLowerCase(Locale.ROOT);
        Integer valueOf = Integer.valueOf(yneVar.b);
        Integer valueOf2 = Integer.valueOf(yneVar.a);
        String a = xv21.a(yneVar.e);
        Double d = yneVar.f;
        Integer num = yneVar.h;
        zzs zzsVar = yneVar.d;
        return new rr0(lowerCase, valueOf, valueOf2, a, d, num, new qr0(zzsVar.b, zzsVar.a));
    }

    public final void a(AddressConfirmationAnalytics$DismissType addressConfirmationAnalytics$DismissType) {
        pj pjVar = this.d;
        pjVar.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("dismiss_type", addressConfirmationAnalytics$DismissType.getEventValue());
        pjVar.a.a("AddressConfirmation.WhereAreYouModalCard.Closed", hashMap, 1, new HashMap());
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x006c, code lost:
    
        if (r9 == r3) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d9 A[LOOP:0: B:16:0x00d3->B:18:0x00d9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(TargetScreenAfterConfirmation targetScreenAfterConfirmation, String str, ContinuationImpl continuationImpl) {
        SourceAddressConfirmationAnalytics$addressConfirmationModalViewShown$1 sourceAddressConfirmationAnalytics$addressConfirmationModalViewShown$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        TargetScreenAfterConfirmation targetScreenAfterConfirmation2;
        String str2;
        Object g;
        List list;
        pv0 pv0Var;
        Address address;
        zzs B;
        Object h;
        TargetScreenAfterConfirmation targetScreenAfterConfirmation3;
        String str3;
        List list2;
        zzs zzsVar;
        int i2;
        AddressConfirmationAnalytics$ScreenType addressConfirmationAnalytics$ScreenType;
        Iterator it;
        if (continuationImpl instanceof SourceAddressConfirmationAnalytics$addressConfirmationModalViewShown$1) {
            sourceAddressConfirmationAnalytics$addressConfirmationModalViewShown$1 = (SourceAddressConfirmationAnalytics$addressConfirmationModalViewShown$1) continuationImpl;
            int i3 = sourceAddressConfirmationAnalytics$addressConfirmationModalViewShown$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                sourceAddressConfirmationAnalytics$addressConfirmationModalViewShown$1.label = i3 - Integer.MIN_VALUE;
                Object obj = sourceAddressConfirmationAnalytics$addressConfirmationModalViewShown$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sourceAddressConfirmationAnalytics$addressConfirmationModalViewShown$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    b.b(obj);
                    targetScreenAfterConfirmation2 = targetScreenAfterConfirmation;
                    sourceAddressConfirmationAnalytics$addressConfirmationModalViewShown$1.L$0 = targetScreenAfterConfirmation2;
                    str2 = str;
                    sourceAddressConfirmationAnalytics$addressConfirmationModalViewShown$1.L$1 = str2;
                    sourceAddressConfirmationAnalytics$addressConfirmationModalViewShown$1.label = 1;
                    g = this.c.g(sourceAddressConfirmationAnalytics$addressConfirmationModalViewShown$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        zzsVar = (zzs) sourceAddressConfirmationAnalytics$addressConfirmationModalViewShown$1.L$3;
                        list2 = (List) sourceAddressConfirmationAnalytics$addressConfirmationModalViewShown$1.L$2;
                        str3 = (String) sourceAddressConfirmationAnalytics$addressConfirmationModalViewShown$1.L$1;
                        targetScreenAfterConfirmation3 = (TargetScreenAfterConfirmation) sourceAddressConfirmationAnalytics$addressConfirmationModalViewShown$1.L$0;
                        b.b(obj);
                        zzs a = ((mo21) obj).a();
                        i2 = dat0.a[targetScreenAfterConfirmation3.ordinal()];
                        if (i2 != 1) {
                            addressConfirmationAnalytics$ScreenType = AddressConfirmationAnalytics$ScreenType.TaxiMain;
                        } else {
                            if (i2 != 2) {
                                w511.b();
                                return null;
                            }
                            addressConfirmationAnalytics$ScreenType = AddressConfirmationAnalytics$ScreenType.Summary;
                        }
                        List list3 = list2;
                        ArrayList arrayList = new ArrayList(tcc.n(list3, 10));
                        it = list3.iterator();
                        while (it.hasNext()) {
                            arrayList.add(d((yne) it.next()));
                        }
                        double d = zzsVar.a;
                        double d2 = zzsVar.b;
                        double d3 = a.a;
                        double d4 = a.b;
                        AddressConfirmationAnalytics$Reason addressConfirmationAnalytics$Reason = !jl40.l(str3, "umlaas_certainty") ? AddressConfirmationAnalytics$Reason.BadGeo : jl40.l(str3, "precise_location_unavailable") ? AddressConfirmationAnalytics$Reason.GeoDisabled : AddressConfirmationAnalytics$Reason.Other;
                        Double d5 = new Double(d3);
                        Double d6 = new Double(d4);
                        pj pjVar = this.d;
                        pjVar.getClass();
                        HashMap hashMap = new HashMap();
                        hashMap.put(MetaDataField.SCREEN_FIELD, addressConfirmationAnalytics$ScreenType.getEventValue());
                        hashMap.put("coord_providers", arrayList);
                        hashMap.put("pin_lat", Double.valueOf(d));
                        hashMap.put("pin_lon", Double.valueOf(d2));
                        hashMap.put(CRLReasonCodeExtension.REASON, addressConfirmationAnalytics$Reason.getEventValue());
                        hashMap.put("geo_lat", d5);
                        hashMap.put("geo_lon", d6);
                        pjVar.a.a("AddressConfirmation.WhereAreYouModalCard.Shown", hashMap, 2, new HashMap());
                        return zy11Var;
                    }
                    str2 = (String) sourceAddressConfirmationAnalytics$addressConfirmationModalViewShown$1.L$1;
                    TargetScreenAfterConfirmation targetScreenAfterConfirmation4 = (TargetScreenAfterConfirmation) sourceAddressConfirmationAnalytics$addressConfirmationModalViewShown$1.L$0;
                    b.b(obj);
                    g = obj;
                    targetScreenAfterConfirmation2 = targetScreenAfterConfirmation4;
                }
                list = (List) g;
                pv0Var = (pv0) this.a.i().orElse(null);
                if (pv0Var != null && (address = pv0Var.a) != null && (B = address.B()) != null) {
                    sourceAddressConfirmationAnalytics$addressConfirmationModalViewShown$1.L$0 = targetScreenAfterConfirmation2;
                    sourceAddressConfirmationAnalytics$addressConfirmationModalViewShown$1.L$1 = str2;
                    sourceAddressConfirmationAnalytics$addressConfirmationModalViewShown$1.L$2 = list;
                    sourceAddressConfirmationAnalytics$addressConfirmationModalViewShown$1.L$3 = B;
                    sourceAddressConfirmationAnalytics$addressConfirmationModalViewShown$1.label = 2;
                    h = ((e) this.b).h(sourceAddressConfirmationAnalytics$addressConfirmationModalViewShown$1);
                    if (h != coroutineSingletons) {
                        targetScreenAfterConfirmation3 = targetScreenAfterConfirmation2;
                        obj = h;
                        str3 = str2;
                        list2 = list;
                        zzsVar = B;
                        zzs a2 = ((mo21) obj).a();
                        i2 = dat0.a[targetScreenAfterConfirmation3.ordinal()];
                        if (i2 != 1) {
                        }
                        List list32 = list2;
                        ArrayList arrayList2 = new ArrayList(tcc.n(list32, 10));
                        it = list32.iterator();
                        while (it.hasNext()) {
                        }
                        double d7 = zzsVar.a;
                        double d22 = zzsVar.b;
                        double d32 = a2.a;
                        double d42 = a2.b;
                        if (!jl40.l(str3, "umlaas_certainty")) {
                        }
                        Double d52 = new Double(d32);
                        Double d62 = new Double(d42);
                        pj pjVar2 = this.d;
                        pjVar2.getClass();
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put(MetaDataField.SCREEN_FIELD, addressConfirmationAnalytics$ScreenType.getEventValue());
                        hashMap2.put("coord_providers", arrayList2);
                        hashMap2.put("pin_lat", Double.valueOf(d7));
                        hashMap2.put("pin_lon", Double.valueOf(d22));
                        hashMap2.put(CRLReasonCodeExtension.REASON, addressConfirmationAnalytics$Reason.getEventValue());
                        hashMap2.put("geo_lat", d52);
                        hashMap2.put("geo_lon", d62);
                        pjVar2.a.a("AddressConfirmation.WhereAreYouModalCard.Shown", hashMap2, 2, new HashMap());
                    }
                    return coroutineSingletons;
                }
                return zy11Var;
            }
        }
        sourceAddressConfirmationAnalytics$addressConfirmationModalViewShown$1 = new SourceAddressConfirmationAnalytics$addressConfirmationModalViewShown$1(this, continuationImpl);
        Object obj2 = sourceAddressConfirmationAnalytics$addressConfirmationModalViewShown$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sourceAddressConfirmationAnalytics$addressConfirmationModalViewShown$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        list = (List) g;
        pv0Var = (pv0) this.a.i().orElse(null);
        if (pv0Var != null) {
            sourceAddressConfirmationAnalytics$addressConfirmationModalViewShown$1.L$0 = targetScreenAfterConfirmation2;
            sourceAddressConfirmationAnalytics$addressConfirmationModalViewShown$1.L$1 = str2;
            sourceAddressConfirmationAnalytics$addressConfirmationModalViewShown$1.L$2 = list;
            sourceAddressConfirmationAnalytics$addressConfirmationModalViewShown$1.L$3 = B;
            sourceAddressConfirmationAnalytics$addressConfirmationModalViewShown$1.label = 2;
            h = ((e) this.b).h(sourceAddressConfirmationAnalytics$addressConfirmationModalViewShown$1);
            if (h != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        return zy11Var2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x007d, code lost:
    
        if (r10 == r3) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ec A[LOOP:0: B:16:0x00e6->B:18:0x00ec, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(AddressConfirmationAnalytics$ButtonName addressConfirmationAnalytics$ButtonName, TargetScreenAfterConfirmation targetScreenAfterConfirmation, String str, ContinuationImpl continuationImpl) {
        SourceAddressConfirmationAnalytics$addressConfirmationModalViewTapped$1 sourceAddressConfirmationAnalytics$addressConfirmationModalViewTapped$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        AddressConfirmationAnalytics$ButtonName addressConfirmationAnalytics$ButtonName2;
        TargetScreenAfterConfirmation targetScreenAfterConfirmation2;
        String str2;
        Object g;
        List list;
        pv0 pv0Var;
        Address address;
        zzs B;
        Object h;
        AddressConfirmationAnalytics$ButtonName addressConfirmationAnalytics$ButtonName3;
        TargetScreenAfterConfirmation targetScreenAfterConfirmation3;
        List list2;
        zzs zzsVar;
        int i2;
        AddressConfirmationAnalytics$ScreenType addressConfirmationAnalytics$ScreenType;
        Iterator it;
        if (continuationImpl instanceof SourceAddressConfirmationAnalytics$addressConfirmationModalViewTapped$1) {
            sourceAddressConfirmationAnalytics$addressConfirmationModalViewTapped$1 = (SourceAddressConfirmationAnalytics$addressConfirmationModalViewTapped$1) continuationImpl;
            int i3 = sourceAddressConfirmationAnalytics$addressConfirmationModalViewTapped$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                sourceAddressConfirmationAnalytics$addressConfirmationModalViewTapped$1.label = i3 - Integer.MIN_VALUE;
                Object obj = sourceAddressConfirmationAnalytics$addressConfirmationModalViewTapped$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sourceAddressConfirmationAnalytics$addressConfirmationModalViewTapped$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    b.b(obj);
                    addressConfirmationAnalytics$ButtonName2 = addressConfirmationAnalytics$ButtonName;
                    sourceAddressConfirmationAnalytics$addressConfirmationModalViewTapped$1.L$0 = addressConfirmationAnalytics$ButtonName2;
                    targetScreenAfterConfirmation2 = targetScreenAfterConfirmation;
                    sourceAddressConfirmationAnalytics$addressConfirmationModalViewTapped$1.L$1 = targetScreenAfterConfirmation2;
                    str2 = str;
                    sourceAddressConfirmationAnalytics$addressConfirmationModalViewTapped$1.L$2 = str2;
                    sourceAddressConfirmationAnalytics$addressConfirmationModalViewTapped$1.label = 1;
                    g = this.c.g(sourceAddressConfirmationAnalytics$addressConfirmationModalViewTapped$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        zzsVar = (zzs) sourceAddressConfirmationAnalytics$addressConfirmationModalViewTapped$1.L$4;
                        list2 = (List) sourceAddressConfirmationAnalytics$addressConfirmationModalViewTapped$1.L$3;
                        str2 = (String) sourceAddressConfirmationAnalytics$addressConfirmationModalViewTapped$1.L$2;
                        targetScreenAfterConfirmation3 = (TargetScreenAfterConfirmation) sourceAddressConfirmationAnalytics$addressConfirmationModalViewTapped$1.L$1;
                        addressConfirmationAnalytics$ButtonName3 = (AddressConfirmationAnalytics$ButtonName) sourceAddressConfirmationAnalytics$addressConfirmationModalViewTapped$1.L$0;
                        b.b(obj);
                        zzs a = ((mo21) obj).a();
                        i2 = dat0.a[targetScreenAfterConfirmation3.ordinal()];
                        if (i2 != 1) {
                            addressConfirmationAnalytics$ScreenType = AddressConfirmationAnalytics$ScreenType.TaxiMain;
                        } else {
                            if (i2 != 2) {
                                w511.b();
                                return null;
                            }
                            addressConfirmationAnalytics$ScreenType = AddressConfirmationAnalytics$ScreenType.Summary;
                        }
                        List list3 = list2;
                        ArrayList arrayList = new ArrayList(tcc.n(list3, 10));
                        it = list3.iterator();
                        while (it.hasNext()) {
                            arrayList.add(d((yne) it.next()));
                        }
                        double d = zzsVar.a;
                        double d2 = zzsVar.b;
                        double d3 = a.a;
                        double d4 = a.b;
                        AddressConfirmationAnalytics$Reason addressConfirmationAnalytics$Reason = !jl40.l(str2, "umlaas_certainty") ? AddressConfirmationAnalytics$Reason.BadGeo : jl40.l(str2, "precise_location_unavailable") ? AddressConfirmationAnalytics$Reason.GeoDisabled : AddressConfirmationAnalytics$Reason.Other;
                        Double d5 = new Double(d3);
                        Double d6 = new Double(d4);
                        pj pjVar = this.d;
                        pjVar.getClass();
                        HashMap hashMap = new HashMap();
                        hashMap.put("button_name", addressConfirmationAnalytics$ButtonName3.getEventValue());
                        hashMap.put(MetaDataField.SCREEN_FIELD, addressConfirmationAnalytics$ScreenType.getEventValue());
                        hashMap.put("coord_providers", arrayList);
                        hashMap.put("pin_lat", Double.valueOf(d));
                        hashMap.put("pin_lon", Double.valueOf(d2));
                        hashMap.put(CRLReasonCodeExtension.REASON, addressConfirmationAnalytics$Reason.getEventValue());
                        hashMap.put("geo_lat", d5);
                        hashMap.put("geo_lon", d6);
                        pjVar.a.a("AddressConfirmation.WhereAreYouModalCard.Tapped", hashMap, 2, new HashMap());
                        return zy11Var;
                    }
                    String str3 = (String) sourceAddressConfirmationAnalytics$addressConfirmationModalViewTapped$1.L$2;
                    TargetScreenAfterConfirmation targetScreenAfterConfirmation4 = (TargetScreenAfterConfirmation) sourceAddressConfirmationAnalytics$addressConfirmationModalViewTapped$1.L$1;
                    AddressConfirmationAnalytics$ButtonName addressConfirmationAnalytics$ButtonName4 = (AddressConfirmationAnalytics$ButtonName) sourceAddressConfirmationAnalytics$addressConfirmationModalViewTapped$1.L$0;
                    b.b(obj);
                    g = obj;
                    addressConfirmationAnalytics$ButtonName2 = addressConfirmationAnalytics$ButtonName4;
                    str2 = str3;
                    targetScreenAfterConfirmation2 = targetScreenAfterConfirmation4;
                }
                list = (List) g;
                pv0Var = (pv0) this.a.i().orElse(null);
                if (pv0Var != null && (address = pv0Var.a) != null && (B = address.B()) != null) {
                    sourceAddressConfirmationAnalytics$addressConfirmationModalViewTapped$1.L$0 = addressConfirmationAnalytics$ButtonName2;
                    sourceAddressConfirmationAnalytics$addressConfirmationModalViewTapped$1.L$1 = targetScreenAfterConfirmation2;
                    sourceAddressConfirmationAnalytics$addressConfirmationModalViewTapped$1.L$2 = str2;
                    sourceAddressConfirmationAnalytics$addressConfirmationModalViewTapped$1.L$3 = list;
                    sourceAddressConfirmationAnalytics$addressConfirmationModalViewTapped$1.L$4 = B;
                    sourceAddressConfirmationAnalytics$addressConfirmationModalViewTapped$1.label = 2;
                    h = ((e) this.b).h(sourceAddressConfirmationAnalytics$addressConfirmationModalViewTapped$1);
                    if (h != coroutineSingletons) {
                        addressConfirmationAnalytics$ButtonName3 = addressConfirmationAnalytics$ButtonName2;
                        obj = h;
                        targetScreenAfterConfirmation3 = targetScreenAfterConfirmation2;
                        list2 = list;
                        zzsVar = B;
                        zzs a2 = ((mo21) obj).a();
                        i2 = dat0.a[targetScreenAfterConfirmation3.ordinal()];
                        if (i2 != 1) {
                        }
                        List list32 = list2;
                        ArrayList arrayList2 = new ArrayList(tcc.n(list32, 10));
                        it = list32.iterator();
                        while (it.hasNext()) {
                        }
                        double d7 = zzsVar.a;
                        double d22 = zzsVar.b;
                        double d32 = a2.a;
                        double d42 = a2.b;
                        if (!jl40.l(str2, "umlaas_certainty")) {
                        }
                        Double d52 = new Double(d32);
                        Double d62 = new Double(d42);
                        pj pjVar2 = this.d;
                        pjVar2.getClass();
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("button_name", addressConfirmationAnalytics$ButtonName3.getEventValue());
                        hashMap2.put(MetaDataField.SCREEN_FIELD, addressConfirmationAnalytics$ScreenType.getEventValue());
                        hashMap2.put("coord_providers", arrayList2);
                        hashMap2.put("pin_lat", Double.valueOf(d7));
                        hashMap2.put("pin_lon", Double.valueOf(d22));
                        hashMap2.put(CRLReasonCodeExtension.REASON, addressConfirmationAnalytics$Reason.getEventValue());
                        hashMap2.put("geo_lat", d52);
                        hashMap2.put("geo_lon", d62);
                        pjVar2.a.a("AddressConfirmation.WhereAreYouModalCard.Tapped", hashMap2, 2, new HashMap());
                    }
                    return coroutineSingletons;
                }
                return zy11Var;
            }
        }
        sourceAddressConfirmationAnalytics$addressConfirmationModalViewTapped$1 = new SourceAddressConfirmationAnalytics$addressConfirmationModalViewTapped$1(this, continuationImpl);
        Object obj2 = sourceAddressConfirmationAnalytics$addressConfirmationModalViewTapped$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sourceAddressConfirmationAnalytics$addressConfirmationModalViewTapped$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        list = (List) g;
        pv0Var = (pv0) this.a.i().orElse(null);
        if (pv0Var != null) {
            sourceAddressConfirmationAnalytics$addressConfirmationModalViewTapped$1.L$0 = addressConfirmationAnalytics$ButtonName2;
            sourceAddressConfirmationAnalytics$addressConfirmationModalViewTapped$1.L$1 = targetScreenAfterConfirmation2;
            sourceAddressConfirmationAnalytics$addressConfirmationModalViewTapped$1.L$2 = str2;
            sourceAddressConfirmationAnalytics$addressConfirmationModalViewTapped$1.L$3 = list;
            sourceAddressConfirmationAnalytics$addressConfirmationModalViewTapped$1.L$4 = B;
            sourceAddressConfirmationAnalytics$addressConfirmationModalViewTapped$1.label = 2;
            h = ((e) this.b).h(sourceAddressConfirmationAnalytics$addressConfirmationModalViewTapped$1);
            if (h != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        return zy11Var2;
    }
}
