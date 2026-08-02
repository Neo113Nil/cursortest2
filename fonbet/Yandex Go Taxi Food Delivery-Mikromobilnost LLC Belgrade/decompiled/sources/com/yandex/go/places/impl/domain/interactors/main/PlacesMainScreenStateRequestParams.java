package com.yandex.go.places.impl.domain.interactors.main;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.zzs;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/places/impl/domain/interactors/main/PlacesMainScreenStateRequestParams;", "", "Companion", "$serializer", "com/yandex/go/places/impl/domain/interactors/main/e", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PlacesMainScreenStateRequestParams {
    public static final e Companion = new e();
    public final zzs a;

    public /* synthetic */ PlacesMainScreenStateRequestParams(int i, zzs zzsVar) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = zzsVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PlacesMainScreenStateRequestParams) && jl40.l(this.a, ((PlacesMainScreenStateRequestParams) obj).a);
    }

    public final int hashCode() {
        zzs zzsVar = this.a;
        if (zzsVar == null) {
            return 0;
        }
        return zzsVar.hashCode();
    }

    public final String toString() {
        return "PlacesMainScreenStateRequestParams(geoPoint=" + this.a + Extension.C_BRAKE;
    }

    public PlacesMainScreenStateRequestParams(zzs zzsVar) {
        this.a = zzsVar;
    }

    public PlacesMainScreenStateRequestParams() {
        this(null);
    }
}
