package com.yandex.go.zone.dto.objects;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jgi;
import defpackage.k4o;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/zone/dto/objects/DeliveryZoneTariffExtra;", "", "Companion", "DeliveryFlowType", "$serializer", "com/yandex/go/zone/dto/objects/y1", "go-client-android.features.zone:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class DeliveryZoneTariffExtra {
    public static final y1 Companion = new y1();
    public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new jgi(27))};
    public final DeliveryFlowType a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/zone/dto/objects/DeliveryZoneTariffExtra$DeliveryFlowType;", "", "Companion", "com/yandex/go/zone/dto/objects/z1", "DEFAULT", "NDD_FORM_V1", "NDD_FORM_V2", "ROVER", "go-client-android.features.zone:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class DeliveryFlowType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ DeliveryFlowType[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final z1 Companion;
        public static final DeliveryFlowType DEFAULT;
        public static final DeliveryFlowType NDD_FORM_V1;
        public static final DeliveryFlowType NDD_FORM_V2;
        public static final DeliveryFlowType ROVER;

        static {
            DeliveryFlowType deliveryFlowType = new DeliveryFlowType("DEFAULT", 0);
            DEFAULT = deliveryFlowType;
            DeliveryFlowType deliveryFlowType2 = new DeliveryFlowType("NDD_FORM_V1", 1);
            NDD_FORM_V1 = deliveryFlowType2;
            DeliveryFlowType deliveryFlowType3 = new DeliveryFlowType("NDD_FORM_V2", 2);
            NDD_FORM_V2 = deliveryFlowType3;
            DeliveryFlowType deliveryFlowType4 = new DeliveryFlowType("ROVER", 3);
            ROVER = deliveryFlowType4;
            DeliveryFlowType[] deliveryFlowTypeArr = {deliveryFlowType, deliveryFlowType2, deliveryFlowType3, deliveryFlowType4};
            $VALUES = deliveryFlowTypeArr;
            $ENTRIES = kotlin.enums.a.a(deliveryFlowTypeArr);
            Companion = new z1();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new jgi(28));
        }

        public static DeliveryFlowType valueOf(String str) {
            return (DeliveryFlowType) Enum.valueOf(DeliveryFlowType.class, str);
        }

        public static DeliveryFlowType[] values() {
            return (DeliveryFlowType[]) $VALUES.clone();
        }
    }

    public /* synthetic */ DeliveryZoneTariffExtra(int i, DeliveryFlowType deliveryFlowType) {
        if ((i & 1) == 0) {
            this.a = DeliveryFlowType.DEFAULT;
        } else {
            this.a = deliveryFlowType;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DeliveryZoneTariffExtra) && this.a == ((DeliveryZoneTariffExtra) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DeliveryZoneTariffExtra(flowType=" + this.a + Extension.C_BRAKE;
    }

    public DeliveryZoneTariffExtra(DeliveryFlowType deliveryFlowType) {
        this.a = deliveryFlowType;
    }

    public DeliveryZoneTariffExtra() {
        this(DeliveryFlowType.DEFAULT);
    }
}
