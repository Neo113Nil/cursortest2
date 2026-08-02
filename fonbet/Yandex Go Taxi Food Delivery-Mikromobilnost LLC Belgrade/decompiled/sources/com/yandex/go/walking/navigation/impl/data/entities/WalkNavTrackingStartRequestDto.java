package com.yandex.go.walking.navigation.impl.data.entities;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.nzs;
import defpackage.oyr;
import defpackage.qje;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/walking/navigation/impl/data/entities/WalkNavTrackingStartRequestDto;", "", "Companion", "AddressV2", "PositionObject", "$serializer", "com/yandex/go/walking/navigation/impl/data/entities/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class WalkNavTrackingStartRequestDto {
    public static final b Companion = new b();
    public final String a;
    public final AddressV2 b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/walking/navigation/impl/data/entities/WalkNavTrackingStartRequestDto$AddressV2;", "", "Companion", "$serializer", "com/yandex/go/walking/navigation/impl/data/entities/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class AddressV2 {
        public static final a Companion = new a();
        public final PositionObject a;

        public /* synthetic */ AddressV2(int i, PositionObject positionObject) {
            if (1 == (i & 1)) {
                this.a = positionObject;
            } else {
                qje.Z(i, 1, WalkNavTrackingStartRequestDto$AddressV2$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AddressV2) && jl40.l(this.a, ((AddressV2) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "AddressV2(coordinate=" + this.a + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/walking/navigation/impl/data/entities/WalkNavTrackingStartRequestDto$PositionObject;", "", "Companion", "$serializer", "com/yandex/go/walking/navigation/impl/data/entities/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class PositionObject {
        public static final c Companion = new c();
        public final double a;
        public final double b;

        public /* synthetic */ PositionObject(double d, double d2, int i) {
            if (3 != (i & 3)) {
                qje.Z(i, 3, WalkNavTrackingStartRequestDto$PositionObject$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.a = d;
            this.b = d2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PositionObject)) {
                return false;
            }
            PositionObject positionObject = (PositionObject) obj;
            return Double.compare(this.a, positionObject.a) == 0 && Double.compare(this.b, positionObject.b) == 0;
        }

        public final int hashCode() {
            return Double.hashCode(this.b) + (Double.hashCode(this.a) * 31);
        }

        public final String toString() {
            return nzs.c(oyr.u(this.a, "PositionObject(lat=", ", lon="), this.b, Extension.C_BRAKE);
        }
    }

    public /* synthetic */ WalkNavTrackingStartRequestDto(int i, String str, AddressV2 addressV2) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, WalkNavTrackingStartRequestDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = addressV2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WalkNavTrackingStartRequestDto)) {
            return false;
        }
        WalkNavTrackingStartRequestDto walkNavTrackingStartRequestDto = (WalkNavTrackingStartRequestDto) obj;
        return jl40.l(this.a, walkNavTrackingStartRequestDto.a) && jl40.l(this.b, walkNavTrackingStartRequestDto.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WalkNavTrackingStartRequestDto(routeUri=" + this.a + ", destination=" + this.b + Extension.C_BRAKE;
    }
}
