package com.yandex.go.zone.dto.objects;

import defpackage.auu0;
import defpackage.b0t;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.yjd;
import defpackage.zzs;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/objects/ScootersExtra;", "", "Companion", "$serializer", "com/yandex/go/zone/dto/objects/r3", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ScootersExtra {
    public static final r3 Companion = new r3();
    public final String a;
    public final zzs b;
    public final Parking c;
    public final String d;

    public /* synthetic */ ScootersExtra(int i, String str, zzs zzsVar, Parking parking, String str2) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = zzsVar;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = parking;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
    }

    public static final /* synthetic */ void d(ScootersExtra scootersExtra, yjd yjdVar, SerialDescriptor serialDescriptor) {
        if (yjdVar.F() || scootersExtra.a != null) {
            yjdVar.g(serialDescriptor, 0, auu0.a, scootersExtra.a);
        }
        if (yjdVar.F() || scootersExtra.b != null) {
            yjdVar.g(serialDescriptor, 1, b0t.a, scootersExtra.b);
        }
        if (yjdVar.F() || scootersExtra.c != null) {
            yjdVar.g(serialDescriptor, 2, Parking$$serializer.INSTANCE, scootersExtra.c);
        }
        if (!yjdVar.F() && scootersExtra.d == null) {
            return;
        }
        yjdVar.g(serialDescriptor, 3, auu0.a, scootersExtra.d);
    }

    /* renamed from: a, reason: from getter */
    public final String getD() {
        return this.d;
    }

    /* renamed from: b, reason: from getter */
    public final String getA() {
        return this.a;
    }

    /* renamed from: c, reason: from getter */
    public final zzs getB() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScootersExtra)) {
            return false;
        }
        ScootersExtra scootersExtra = (ScootersExtra) obj;
        return jl40.l(this.a, scootersExtra.a) && jl40.l(this.b, scootersExtra.b) && jl40.l(this.c, scootersExtra.c) && jl40.l(this.d, scootersExtra.d);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        zzs zzsVar = this.b;
        int hashCode2 = (hashCode + (zzsVar == null ? 0 : zzsVar.hashCode())) * 31;
        Parking parking = this.c;
        int hashCode3 = (hashCode2 + (parking == null ? 0 : parking.hashCode())) * 31;
        String str2 = this.d;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "ScootersExtra(scooterNumber=" + this.a + ", scooterPosition=" + this.b + ", parking=" + this.c + ", routeTime=" + this.d + Extension.C_BRAKE;
    }

    public ScootersExtra() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
    }
}
