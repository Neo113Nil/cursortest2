package com.yandex.go.places.impl.domain.interactors.main;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/places/impl/domain/interactors/main/PlacesMainScreenDataRequestParams;", "", "Companion", "$serializer", "com/yandex/go/places/impl/domain/interactors/main/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PlacesMainScreenDataRequestParams {
    public static final b Companion = new b();
    public final String a;

    public /* synthetic */ PlacesMainScreenDataRequestParams(int i, String str) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PlacesMainScreenDataRequestParams) && jl40.l(this.a, ((PlacesMainScreenDataRequestParams) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return oyr.p("PlacesMainScreenDataRequestParams(address=", this.a, Extension.C_BRAKE);
    }

    public PlacesMainScreenDataRequestParams(String str) {
        this.a = str;
    }

    public PlacesMainScreenDataRequestParams() {
        this(null);
    }
}
