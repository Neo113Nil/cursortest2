package com.yandex.go.masstransit.sdk.trains.impl.schedule.network.dto;

import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/masstransit/sdk/trains/impl/schedule/network/dto/MtTrainStations;", "", "Companion", "com/yandex/go/masstransit/sdk/trains/impl/schedule/network/dto/w", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class MtTrainStations {
    public static final w Companion = new w();
    public static final MtTrainStations c = new MtTrainStations(0);
    public final MtTrainStation a;
    public final MtTrainStation b;

    public MtTrainStations(int i, MtTrainStation mtTrainStation, MtTrainStation mtTrainStation2) {
        int i2 = i & 1;
        MtTrainStation mtTrainStation3 = MtTrainStation.d;
        if (i2 == 0) {
            MtTrainStation.Companion.getClass();
            this.a = mtTrainStation3;
        } else {
            this.a = mtTrainStation;
        }
        if ((i & 2) != 0) {
            this.b = mtTrainStation2;
        } else {
            MtTrainStation.Companion.getClass();
            this.b = mtTrainStation3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MtTrainStations)) {
            return false;
        }
        MtTrainStations mtTrainStations = (MtTrainStations) obj;
        return jl40.l(this.a, mtTrainStations.a) && jl40.l(this.b, mtTrainStations.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MtTrainStations(startingStation=" + this.a + ", destinationStation=" + this.b + Extension.C_BRAKE;
    }

    public MtTrainStations() {
        this(0);
    }

    public MtTrainStations(int i) {
        v vVar = MtTrainStation.Companion;
        vVar.getClass();
        vVar.getClass();
        MtTrainStation mtTrainStation = MtTrainStation.d;
        this.a = mtTrainStation;
        this.b = mtTrainStation;
    }
}
