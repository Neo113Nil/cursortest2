package com.yandex.go.zone.dto.objects;

import defpackage.auu0;
import defpackage.b64;
import defpackage.b9h;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.n5h;
import defpackage.nzs;
import defpackage.oyr;
import defpackage.q7i;
import defpackage.unr0;
import defpackage.yjd;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\t\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/yandex/go/zone/dto/objects/DeliveryExtra;", "", "Companion", "OrderSelectSettings", "OrderHeader", "OrderSelectorOverrides", "OrderSelectorOverridesTooltip", "Service", "DeliveryInformationForm", "DeliveryFlowType", "$serializer", "com/yandex/go/zone/dto/objects/t0", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class DeliveryExtra {
    public static final t0 Companion = new t0();
    public static final i3y[] n;
    public final String a;
    public final OrderSelectSettings b;
    public final List c;
    public final Service d;
    public final DeliveryInformationForm e;
    public final DeliveryFlowType f;
    public final DeliveryCostDetails g;
    public final DeliveryPaidInsuranceInfo h;
    public final DeliveryRentalDetails i;
    public final DeliveryDoorToDoorDetails j;
    public final DeliveryOrderingProcess k;
    public final DeliveryTimeIntervals l;
    public final s0 m;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/zone/dto/objects/DeliveryExtra$DeliveryFlowType;", "", "Companion", "com/yandex/go/zone/dto/objects/u0", "DEFAULT", "NDD_FORM", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes14.dex */
    public static final class DeliveryFlowType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ DeliveryFlowType[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final u0 Companion;
        public static final DeliveryFlowType DEFAULT;
        public static final DeliveryFlowType NDD_FORM;

        static {
            DeliveryFlowType deliveryFlowType = new DeliveryFlowType("DEFAULT", 0);
            DEFAULT = deliveryFlowType;
            DeliveryFlowType deliveryFlowType2 = new DeliveryFlowType("NDD_FORM", 1);
            NDD_FORM = deliveryFlowType2;
            DeliveryFlowType[] deliveryFlowTypeArr = {deliveryFlowType, deliveryFlowType2};
            $VALUES = deliveryFlowTypeArr;
            $ENTRIES = kotlin.enums.a.a(deliveryFlowTypeArr);
            Companion = new u0();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new b9h(19));
        }

        public static DeliveryFlowType valueOf(String str) {
            return (DeliveryFlowType) Enum.valueOf(DeliveryFlowType.class, str);
        }

        public static DeliveryFlowType[] values() {
            return (DeliveryFlowType[]) $VALUES.clone();
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        n = new i3y[]{null, null, kotlin.a.b(lazyThreadSafetyMode, new b9h(17)), null, null, kotlin.a.b(lazyThreadSafetyMode, new b9h(18)), null, null, null, null, null, null, null};
    }

    public /* synthetic */ DeliveryExtra(int i, String str, OrderSelectSettings orderSelectSettings, List list, Service service, DeliveryInformationForm deliveryInformationForm, DeliveryFlowType deliveryFlowType, DeliveryCostDetails deliveryCostDetails, DeliveryPaidInsuranceInfo deliveryPaidInsuranceInfo, DeliveryRentalDetails deliveryRentalDetails, DeliveryDoorToDoorDetails deliveryDoorToDoorDetails, DeliveryOrderingProcess deliveryOrderingProcess, DeliveryTimeIntervals deliveryTimeIntervals, s0 s0Var) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = orderSelectSettings;
        }
        if ((i & 4) == 0) {
            this.c = EmptyList.a;
        } else {
            this.c = list;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = service;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = deliveryInformationForm;
        }
        if ((i & 32) == 0) {
            this.f = DeliveryFlowType.DEFAULT;
        } else {
            this.f = deliveryFlowType;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = deliveryCostDetails;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = deliveryPaidInsuranceInfo;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = deliveryRentalDetails;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = deliveryDoorToDoorDetails;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = deliveryOrderingProcess;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = deliveryTimeIntervals;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = s0Var;
        }
    }

    public static final /* synthetic */ void n(DeliveryExtra deliveryExtra, yjd yjdVar, SerialDescriptor serialDescriptor) {
        if (yjdVar.F() || deliveryExtra.a != null) {
            yjdVar.g(serialDescriptor, 0, auu0.a, deliveryExtra.a);
        }
        if (yjdVar.F() || deliveryExtra.b != null) {
            yjdVar.g(serialDescriptor, 1, DeliveryExtra$OrderSelectSettings$$serializer.INSTANCE, deliveryExtra.b);
        }
        boolean F = yjdVar.F();
        i3y[] i3yVarArr = n;
        if (F || !jl40.l(deliveryExtra.c, EmptyList.a)) {
            yjdVar.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), deliveryExtra.c);
        }
        if (yjdVar.F() || deliveryExtra.d != null) {
            yjdVar.g(serialDescriptor, 3, DeliveryExtra$Service$$serializer.INSTANCE, deliveryExtra.d);
        }
        if (yjdVar.F() || deliveryExtra.e != null) {
            yjdVar.g(serialDescriptor, 4, DeliveryExtra$DeliveryInformationForm$$serializer.INSTANCE, deliveryExtra.e);
        }
        if (yjdVar.F() || deliveryExtra.f != DeliveryFlowType.DEFAULT) {
            yjdVar.e(serialDescriptor, 5, (KSerializer) i3yVarArr[5].getValue(), deliveryExtra.f);
        }
        if (yjdVar.F() || deliveryExtra.g != null) {
            yjdVar.g(serialDescriptor, 6, DeliveryCostDetails$$serializer.INSTANCE, deliveryExtra.g);
        }
        if (yjdVar.F() || deliveryExtra.h != null) {
            yjdVar.g(serialDescriptor, 7, DeliveryPaidInsuranceInfo$$serializer.INSTANCE, deliveryExtra.h);
        }
        if (yjdVar.F() || deliveryExtra.i != null) {
            yjdVar.g(serialDescriptor, 8, DeliveryRentalDetails$$serializer.INSTANCE, deliveryExtra.i);
        }
        if (yjdVar.F() || deliveryExtra.j != null) {
            yjdVar.g(serialDescriptor, 9, DeliveryDoorToDoorDetails$$serializer.INSTANCE, deliveryExtra.j);
        }
        if (yjdVar.F() || deliveryExtra.k != null) {
            yjdVar.g(serialDescriptor, 10, DeliveryOrderingProcess$$serializer.INSTANCE, deliveryExtra.k);
        }
        if (yjdVar.F() || deliveryExtra.l != null) {
            yjdVar.g(serialDescriptor, 11, DeliveryTimeIntervals$$serializer.INSTANCE, deliveryExtra.l);
        }
        if (!yjdVar.F() && deliveryExtra.m == null) {
            return;
        }
        yjdVar.g(serialDescriptor, 12, q7i.e, deliveryExtra.m);
    }

    /* renamed from: b, reason: from getter */
    public final DeliveryCostDetails getG() {
        return this.g;
    }

    /* renamed from: c, reason: from getter */
    public final DeliveryTimeIntervals getL() {
        return this.l;
    }

    /* renamed from: d, reason: from getter */
    public final DeliveryDoorToDoorDetails getJ() {
        return this.j;
    }

    /* renamed from: e, reason: from getter */
    public final s0 getM() {
        return this.m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeliveryExtra)) {
            return false;
        }
        DeliveryExtra deliveryExtra = (DeliveryExtra) obj;
        return jl40.l(this.a, deliveryExtra.a) && jl40.l(this.b, deliveryExtra.b) && jl40.l(this.c, deliveryExtra.c) && jl40.l(this.d, deliveryExtra.d) && jl40.l(this.e, deliveryExtra.e) && this.f == deliveryExtra.f && jl40.l(this.g, deliveryExtra.g) && jl40.l(this.h, deliveryExtra.h) && jl40.l(this.i, deliveryExtra.i) && jl40.l(this.j, deliveryExtra.j) && jl40.l(this.k, deliveryExtra.k) && jl40.l(this.l, deliveryExtra.l) && jl40.l(this.m, deliveryExtra.m);
    }

    /* renamed from: f, reason: from getter */
    public final DeliveryInformationForm getE() {
        return this.e;
    }

    /* renamed from: g, reason: from getter */
    public final String getA() {
        return this.a;
    }

    /* renamed from: h, reason: from getter */
    public final OrderSelectSettings getB() {
        return this.b;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        OrderSelectSettings orderSelectSettings = this.b;
        int c = unr0.c((hashCode + (orderSelectSettings == null ? 0 : orderSelectSettings.hashCode())) * 31, 31, this.c);
        Service service = this.d;
        int hashCode2 = (c + (service == null ? 0 : Boolean.hashCode(service.a))) * 31;
        DeliveryInformationForm deliveryInformationForm = this.e;
        int hashCode3 = (this.f.hashCode() + ((hashCode2 + (deliveryInformationForm == null ? 0 : deliveryInformationForm.a.hashCode())) * 31)) * 31;
        DeliveryCostDetails deliveryCostDetails = this.g;
        int hashCode4 = (hashCode3 + (deliveryCostDetails == null ? 0 : deliveryCostDetails.hashCode())) * 31;
        DeliveryPaidInsuranceInfo deliveryPaidInsuranceInfo = this.h;
        int hashCode5 = (hashCode4 + (deliveryPaidInsuranceInfo == null ? 0 : deliveryPaidInsuranceInfo.hashCode())) * 31;
        DeliveryRentalDetails deliveryRentalDetails = this.i;
        int hashCode6 = (hashCode5 + (deliveryRentalDetails == null ? 0 : deliveryRentalDetails.hashCode())) * 31;
        DeliveryDoorToDoorDetails deliveryDoorToDoorDetails = this.j;
        int hashCode7 = (hashCode6 + (deliveryDoorToDoorDetails == null ? 0 : deliveryDoorToDoorDetails.hashCode())) * 31;
        DeliveryOrderingProcess deliveryOrderingProcess = this.k;
        int hashCode8 = (hashCode7 + (deliveryOrderingProcess == null ? 0 : deliveryOrderingProcess.hashCode())) * 31;
        DeliveryTimeIntervals deliveryTimeIntervals = this.l;
        int hashCode9 = (hashCode8 + (deliveryTimeIntervals == null ? 0 : deliveryTimeIntervals.hashCode())) * 31;
        s0 s0Var = this.m;
        return hashCode9 + (s0Var != null ? s0Var.hashCode() : 0);
    }

    /* renamed from: i, reason: from getter */
    public final DeliveryOrderingProcess getK() {
        return this.k;
    }

    /* renamed from: j, reason: from getter */
    public final DeliveryPaidInsuranceInfo getH() {
        return this.h;
    }

    /* renamed from: k, reason: from getter */
    public final List getC() {
        return this.c;
    }

    /* renamed from: l, reason: from getter */
    public final DeliveryRentalDetails getI() {
        return this.i;
    }

    /* renamed from: m, reason: from getter */
    public final Service getD() {
        return this.d;
    }

    public final String toString() {
        return "DeliveryExtra(offerId=" + this.a + ", orderSelectSettings=" + this.b + ", pins=" + this.c + ", service=" + this.d + ", formInformation=" + this.e + ", flowType=" + this.f + ", costDetails=" + this.g + ", paidInsuranceInfo=" + this.h + ", rental=" + this.i + ", doorToDoor=" + this.j + ", orderingProcess=" + this.k + ", deliveryIntervals=" + this.l + ", estimatedWaiting=" + this.m + Extension.C_BRAKE;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/objects/DeliveryExtra$Service;", "", "Companion", "$serializer", "com/yandex/go/zone/dto/objects/b1", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class Service {
        public static final b1 Companion = new b1();
        public final boolean a;

        public /* synthetic */ Service(int i, boolean z) {
            if ((i & 1) == 0) {
                this.a = false;
            } else {
                this.a = z;
            }
        }

        /* renamed from: a, reason: from getter */
        public final boolean getA() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Service) && this.a == ((Service) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return nzs.b("Service(isDoorToDoor=", Extension.C_BRAKE, this.a);
        }

        public Service() {
            this.a = false;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/zone/dto/objects/DeliveryExtra$DeliveryInformationForm;", "", "Companion", "FormType", "$serializer", "com/yandex/go/zone/dto/objects/v0", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class DeliveryInformationForm {
        public static final v0 Companion = new v0();
        public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new b9h(20))};
        public final FormType a;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/yandex/go/zone/dto/objects/DeliveryExtra$DeliveryInformationForm$FormType;", "", "Companion", "com/yandex/go/zone/dto/objects/w0", "SHORT", "MINIMAL", "REDUCED", "FULL", "UNKNOWN", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        /* loaded from: classes8.dex */
        public static final class FormType {
            private static final /* synthetic */ k4o $ENTRIES;
            private static final /* synthetic */ FormType[] $VALUES;
            private static final i3y $cachedSerializer$delegate;
            public static final w0 Companion;
            public static final FormType FULL;
            public static final FormType MINIMAL;
            public static final FormType REDUCED;
            public static final FormType SHORT;
            public static final FormType UNKNOWN;

            static {
                FormType formType = new FormType("SHORT", 0);
                SHORT = formType;
                FormType formType2 = new FormType("MINIMAL", 1);
                MINIMAL = formType2;
                FormType formType3 = new FormType("REDUCED", 2);
                REDUCED = formType3;
                FormType formType4 = new FormType("FULL", 3);
                FULL = formType4;
                FormType formType5 = new FormType("UNKNOWN", 4);
                UNKNOWN = formType5;
                FormType[] formTypeArr = {formType, formType2, formType3, formType4, formType5};
                $VALUES = formTypeArr;
                $ENTRIES = kotlin.enums.a.a(formTypeArr);
                Companion = new w0();
                $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new n5h(17));
            }

            public static FormType valueOf(String str) {
                return (FormType) Enum.valueOf(FormType.class, str);
            }

            public static FormType[] values() {
                return (FormType[]) $VALUES.clone();
            }
        }

        public /* synthetic */ DeliveryInformationForm(int i, FormType formType) {
            if ((i & 1) == 0) {
                this.a = FormType.UNKNOWN;
            } else {
                this.a = formType;
            }
        }

        /* renamed from: a, reason: from getter */
        public final FormType getA() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DeliveryInformationForm) && this.a == ((DeliveryInformationForm) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "DeliveryInformationForm(formType=" + this.a + Extension.C_BRAKE;
        }

        public DeliveryInformationForm() {
            this.a = FormType.UNKNOWN;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/objects/DeliveryExtra$OrderSelectorOverridesTooltip;", "", "Companion", "$serializer", "com/yandex/go/zone/dto/objects/a1", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class OrderSelectorOverridesTooltip {
        public static final a1 Companion = new a1();
        public final String a;

        public /* synthetic */ OrderSelectorOverridesTooltip(int i, String str) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
        }

        /* renamed from: a, reason: from getter */
        public final String getA() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OrderSelectorOverridesTooltip) && jl40.l(this.a, ((OrderSelectorOverridesTooltip) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return oyr.p("OrderSelectorOverridesTooltip(text=", this.a, Extension.C_BRAKE);
        }

        public OrderSelectorOverridesTooltip() {
            this.a = "";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/objects/DeliveryExtra$OrderSelectSettings;", "", "Companion", "$serializer", "com/yandex/go/zone/dto/objects/y0", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class OrderSelectSettings {
        public static final y0 Companion = new y0();
        public final OrderHeader a;
        public final OrderSelectorOverrides b;

        public /* synthetic */ OrderSelectSettings(int i, OrderHeader orderHeader, OrderSelectorOverrides orderSelectorOverrides) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = orderHeader;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = orderSelectorOverrides;
            }
        }

        /* renamed from: a, reason: from getter */
        public final OrderHeader getA() {
            return this.a;
        }

        /* renamed from: b, reason: from getter */
        public final OrderSelectorOverrides getB() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OrderSelectSettings)) {
                return false;
            }
            OrderSelectSettings orderSelectSettings = (OrderSelectSettings) obj;
            return jl40.l(this.a, orderSelectSettings.a) && jl40.l(this.b, orderSelectSettings.b);
        }

        public final int hashCode() {
            OrderHeader orderHeader = this.a;
            int hashCode = (orderHeader == null ? 0 : orderHeader.hashCode()) * 31;
            OrderSelectorOverrides orderSelectorOverrides = this.b;
            return hashCode + (orderSelectorOverrides != null ? orderSelectorOverrides.hashCode() : 0);
        }

        public final String toString() {
            return "OrderSelectSettings(header=" + this.a + ", selectorOverrides=" + this.b + Extension.C_BRAKE;
        }

        public OrderSelectSettings() {
            this.a = null;
            this.b = null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/objects/DeliveryExtra$OrderHeader;", "", "Companion", "$serializer", "com/yandex/go/zone/dto/objects/x0", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class OrderHeader {
        public static final x0 Companion = new x0();
        public final String a;
        public final String b;
        public final String c;

        public /* synthetic */ OrderHeader(int i, String str, String str2, String str3) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str2;
            }
            if ((i & 4) == 0) {
                this.c = "";
            } else {
                this.c = str3;
            }
        }

        /* renamed from: a, reason: from getter */
        public final String getB() {
            return this.b;
        }

        /* renamed from: b, reason: from getter */
        public final String getC() {
            return this.c;
        }

        /* renamed from: c, reason: from getter */
        public final String getA() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OrderHeader)) {
                return false;
            }
            OrderHeader orderHeader = (OrderHeader) obj;
            return jl40.l(this.a, orderHeader.a) && jl40.l(this.b, orderHeader.b) && jl40.l(this.c, orderHeader.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return oyr.t(b64.v("OrderHeader(text=", this.a, ", imageTag=", this.b, ", imageTagDark="), this.c, Extension.C_BRAKE);
        }

        public OrderHeader() {
            this.a = "";
            this.b = "";
            this.c = "";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/objects/DeliveryExtra$OrderSelectorOverrides;", "", "Companion", "$serializer", "com/yandex/go/zone/dto/objects/z0", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class OrderSelectorOverrides {
        public static final z0 Companion = new z0();
        public final String a;
        public final String b;
        public final OrderSelectorOverridesTooltip c;

        public /* synthetic */ OrderSelectorOverrides(int i, String str, String str2, OrderSelectorOverridesTooltip orderSelectorOverridesTooltip) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str2;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = orderSelectorOverridesTooltip;
            }
        }

        /* renamed from: a, reason: from getter */
        public final String getA() {
            return this.a;
        }

        /* renamed from: b, reason: from getter */
        public final String getB() {
            return this.b;
        }

        /* renamed from: c, reason: from getter */
        public final OrderSelectorOverridesTooltip getC() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OrderSelectorOverrides)) {
                return false;
            }
            OrderSelectorOverrides orderSelectorOverrides = (OrderSelectorOverrides) obj;
            return jl40.l(this.a, orderSelectorOverrides.a) && jl40.l(this.b, orderSelectorOverrides.b) && jl40.l(this.c, orderSelectorOverrides.c);
        }

        public final int hashCode() {
            int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
            OrderSelectorOverridesTooltip orderSelectorOverridesTooltip = this.c;
            return b + (orderSelectorOverridesTooltip == null ? 0 : orderSelectorOverridesTooltip.a.hashCode());
        }

        public final String toString() {
            StringBuilder v = b64.v("OrderSelectorOverrides(orderEtaSubtitle=", this.a, ", orderPickupEtaSubtitle=", this.b, ", tooltip=");
            v.append(this.c);
            v.append(Extension.C_BRAKE);
            return v.toString();
        }

        public OrderSelectorOverrides() {
            this.a = "";
            this.b = "";
            this.c = null;
        }
    }

    public DeliveryExtra() {
        DeliveryFlowType deliveryFlowType = DeliveryFlowType.DEFAULT;
        this.a = null;
        this.b = null;
        this.c = EmptyList.a;
        this.d = null;
        this.e = null;
        this.f = deliveryFlowType;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = null;
    }
}
