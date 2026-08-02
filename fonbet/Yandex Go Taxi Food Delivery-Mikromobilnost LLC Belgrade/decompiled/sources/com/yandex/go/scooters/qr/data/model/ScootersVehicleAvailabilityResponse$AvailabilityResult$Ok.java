package com.yandex.go.scooters.qr.data.model;

import defpackage.gsq0;
import defpackage.z531;
import defpackage.zzs;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/scooters/qr/data/model/ScootersVehicleAvailabilityResponse$AvailabilityResult$Ok", "Lcom/yandex/go/scooters/qr/data/model/g;", "Companion", "Scooter", "$serializer", "com/yandex/go/scooters/qr/data/model/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersVehicleAvailabilityResponse$AvailabilityResult$Ok extends g {
    public static final a Companion = new a();
    public final Scooter a;

    public ScootersVehicleAvailabilityResponse$AvailabilityResult$Ok(int i, Scooter scooter) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = scooter;
        }
    }

    public ScootersVehicleAvailabilityResponse$AvailabilityResult$Ok() {
        this.a = null;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/scooters/qr/data/model/ScootersVehicleAvailabilityResponse$AvailabilityResult$Ok$Scooter;", "", "Companion", "$serializer", "com/yandex/go/scooters/qr/data/model/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Scooter {
        public static final b Companion = new b();
        public final zzs a;
        public final z531 b;

        public /* synthetic */ Scooter(int i, zzs zzsVar, z531 z531Var) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = zzsVar;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = z531Var;
            }
        }

        public Scooter() {
            this.a = null;
            this.b = null;
        }
    }
}
