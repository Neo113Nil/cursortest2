package com.yandex.go.morphlex.action.route_address;

import com.yandex.go.address.dto.AddressDTO;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.iwq0;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.kr;
import defpackage.oyr;
import defpackage.qje;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/morphlex/action/route_address/SetRouteAddressAction;", "Lkr;", "Companion", "PointType", "$serializer", "com/yandex/go/morphlex/action/route_address/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class SetRouteAddressAction extends kr {
    public static final a Companion = new a();
    public static final i3y[] d = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new iwq0(12)), null, null};
    public final PointType a;
    public final AddressDTO b;
    public final String c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/morphlex/action/route_address/SetRouteAddressAction$PointType;", "", "Companion", "com/yandex/go/morphlex/action/route_address/b", "SOURCE", "DESTINATION", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class PointType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ PointType[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final b Companion;
        public static final PointType DESTINATION;
        public static final PointType SOURCE;

        static {
            PointType pointType = new PointType("SOURCE", 0);
            SOURCE = pointType;
            PointType pointType2 = new PointType("DESTINATION", 1);
            DESTINATION = pointType2;
            PointType[] pointTypeArr = {pointType, pointType2};
            $VALUES = pointTypeArr;
            $ENTRIES = kotlin.enums.a.a(pointTypeArr);
            Companion = new b();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new iwq0(13));
        }

        public static PointType valueOf(String str) {
            return (PointType) Enum.valueOf(PointType.class, str);
        }

        public static PointType[] values() {
            return (PointType[]) $VALUES.clone();
        }
    }

    public /* synthetic */ SetRouteAddressAction(int i, PointType pointType, AddressDTO addressDTO, String str) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, SetRouteAddressAction$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = pointType;
        this.b = addressDTO;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SetRouteAddressAction)) {
            return false;
        }
        SetRouteAddressAction setRouteAddressAction = (SetRouteAddressAction) obj;
        return this.a == setRouteAddressAction.a && jl40.l(this.b, setRouteAddressAction.b) && jl40.l(this.c, setRouteAddressAction.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetRouteAddressAction(pointType=");
        sb.append(this.a);
        sb.append(", address=");
        sb.append(this.b);
        sb.append(", zoneName=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
