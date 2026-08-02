package com.yandex.go.scooters.api.data.model;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.qje;
import defpackage.zzs;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/scooters/api/data/model/SelectedParking;", "", "Companion", "$serializer", "com/yandex/go/scooters/api/data/model/a", "go-client-android.features.scooters:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SelectedParking {
    public static final a Companion = new a();
    public final String a;
    public final zzs b;

    public /* synthetic */ SelectedParking(int i, zzs zzsVar, String str) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, SelectedParking$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = zzsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectedParking)) {
            return false;
        }
        SelectedParking selectedParking = (SelectedParking) obj;
        return jl40.l(this.a, selectedParking.a) && jl40.l(this.b, selectedParking.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SelectedParking(id=" + this.a + ", position=" + this.b + Extension.C_BRAKE;
    }
}
