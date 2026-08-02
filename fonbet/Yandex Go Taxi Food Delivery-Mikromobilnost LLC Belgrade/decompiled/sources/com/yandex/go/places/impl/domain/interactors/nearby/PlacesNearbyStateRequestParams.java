package com.yandex.go.places.impl.domain.interactors.nearby;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.uc4;
import defpackage.zzs;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/places/impl/domain/interactors/nearby/PlacesNearbyStateRequestParams;", "", "Companion", "$serializer", "com/yandex/go/places/impl/domain/interactors/nearby/d", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PlacesNearbyStateRequestParams {
    public static final d Companion = new d();
    public final Integer a;
    public final uc4 b;
    public final String c;
    public final zzs d;
    public final String e;

    public /* synthetic */ PlacesNearbyStateRequestParams(int i, Integer num, uc4 uc4Var, String str, zzs zzsVar, String str2) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = uc4Var;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = zzsVar;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlacesNearbyStateRequestParams)) {
            return false;
        }
        PlacesNearbyStateRequestParams placesNearbyStateRequestParams = (PlacesNearbyStateRequestParams) obj;
        return jl40.l(this.a, placesNearbyStateRequestParams.a) && jl40.l(this.b, placesNearbyStateRequestParams.b) && jl40.l(this.c, placesNearbyStateRequestParams.c) && jl40.l(this.d, placesNearbyStateRequestParams.d) && jl40.l(this.e, placesNearbyStateRequestParams.e);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        uc4 uc4Var = this.b;
        int hashCode2 = (hashCode + (uc4Var == null ? 0 : uc4Var.hashCode())) * 31;
        String str = this.c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        zzs zzsVar = this.d;
        int hashCode4 = (hashCode3 + (zzsVar == null ? 0 : zzsVar.hashCode())) * 31;
        String str2 = this.e;
        return hashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlacesNearbyStateRequestParams(zoom=");
        sb.append(this.a);
        sb.append(", bbox=");
        sb.append(this.b);
        sb.append(", placeType=");
        sb.append(this.c);
        sb.append(", placeLocation=");
        sb.append(this.d);
        sb.append(", mode=");
        return oyr.t(sb, this.e, Extension.C_BRAKE);
    }

    public PlacesNearbyStateRequestParams(Integer num, uc4 uc4Var, String str, zzs zzsVar, String str2) {
        this.a = num;
        this.b = uc4Var;
        this.c = str;
        this.d = zzsVar;
        this.e = str2;
    }

    public PlacesNearbyStateRequestParams() {
        this(null, null, null, null, null);
    }
}
