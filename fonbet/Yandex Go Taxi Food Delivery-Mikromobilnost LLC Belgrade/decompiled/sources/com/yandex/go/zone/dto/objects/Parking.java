package com.yandex.go.zone.dto.objects;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.zzs;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/objects/Parking;", "", "Companion", "$serializer", "com/yandex/go/zone/dto/objects/z2", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class Parking {
    public static final z2 Companion = new z2();
    public final String a;
    public final zzs b;

    public /* synthetic */ Parking(int i, zzs zzsVar, String str) {
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
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Parking)) {
            return false;
        }
        Parking parking = (Parking) obj;
        return jl40.l(this.a, parking.a) && jl40.l(this.b, parking.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        zzs zzsVar = this.b;
        return hashCode + (zzsVar != null ? zzsVar.hashCode() : 0);
    }

    public final String toString() {
        return "Parking(id=" + this.a + ", position=" + this.b + Extension.C_BRAKE;
    }

    public Parking() {
        this.a = null;
        this.b = null;
    }
}
