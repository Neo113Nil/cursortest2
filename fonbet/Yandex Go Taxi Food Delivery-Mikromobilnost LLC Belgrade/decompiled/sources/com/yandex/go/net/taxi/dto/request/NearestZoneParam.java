package com.yandex.go.net.taxi.dto.request;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.qje;
import defpackage.zzs;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/net/taxi/dto/request/NearestZoneParam;", "", "Companion", "$serializer", "com/yandex/go/net/taxi/dto/request/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class NearestZoneParam {
    public static final b Companion = new b();
    public final String a;
    public final zzs b;

    public /* synthetic */ NearestZoneParam(int i, zzs zzsVar, String str) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, NearestZoneParam$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = zzsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NearestZoneParam)) {
            return false;
        }
        NearestZoneParam nearestZoneParam = (NearestZoneParam) obj;
        return jl40.l(this.a, nearestZoneParam.a) && jl40.l(this.b, nearestZoneParam.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "NearestZoneParam(id=" + this.a + ", point=" + this.b + Extension.C_BRAKE;
    }

    public NearestZoneParam(zzs zzsVar, String str) {
        this.a = str;
        this.b = zzsVar;
    }
}
