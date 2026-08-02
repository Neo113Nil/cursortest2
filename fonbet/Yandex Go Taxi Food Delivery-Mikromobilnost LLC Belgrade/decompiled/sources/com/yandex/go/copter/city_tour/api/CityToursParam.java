package com.yandex.go.copter.city_tour.api;

import defpackage.g8e;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.qlb;
import defpackage.unr0;
import defpackage.xvz;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/copter/city_tour/api/CityToursParam;", "", "Companion", "$serializer", "com/yandex/go/copter/city_tour/api/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CityToursParam {
    public static final a Companion = new a();
    public static final i3y[] e = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new qlb(24)), null, null};
    public final String a;
    public final List b;
    public final String c;
    public final String d;

    public /* synthetic */ CityToursParam(String str, int i, String str2, String str3, List list) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = EmptyList.a;
        } else {
            this.b = list;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CityToursParam)) {
            return false;
        }
        CityToursParam cityToursParam = (CityToursParam) obj;
        return jl40.l(this.a, cityToursParam.a) && jl40.l(this.b, cityToursParam.b) && jl40.l(this.c, cityToursParam.c) && jl40.l(this.d, cityToursParam.d);
    }

    public final int hashCode() {
        String str = this.a;
        int c = unr0.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        String str2 = this.c;
        int hashCode = (c + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return hashCode + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return g8e.r(xvz.r("CityToursParam(requirementName=", this.a, ", supportedOptions=", this.b, ", category="), this.c, ", zone=", this.d, Extension.C_BRAKE);
    }

    public CityToursParam(String str, String str2, String str3, List list) {
        this.a = str;
        this.b = list;
        this.c = str2;
        this.d = str3;
    }

    public CityToursParam() {
        this(null, null, null, EmptyList.a);
    }
}
