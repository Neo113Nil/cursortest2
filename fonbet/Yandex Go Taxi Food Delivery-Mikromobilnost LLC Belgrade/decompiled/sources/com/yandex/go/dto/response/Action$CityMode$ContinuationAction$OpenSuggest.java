package com.yandex.go.dto.response;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/dto/response/Action$CityMode$ContinuationAction$OpenSuggest", "Lcom/yandex/go/dto/response/p;", "Companion", "$serializer", "com/yandex/go/dto/response/o", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class Action$CityMode$ContinuationAction$OpenSuggest extends p {
    public static final o Companion = new o();
    public final String a;
    public final String b;

    public Action$CityMode$ContinuationAction$OpenSuggest(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Action$CityMode$ContinuationAction$OpenSuggest)) {
            return false;
        }
        Action$CityMode$ContinuationAction$OpenSuggest action$CityMode$ContinuationAction$OpenSuggest = (Action$CityMode$ContinuationAction$OpenSuggest) obj;
        return jl40.l(this.a, action$CityMode$ContinuationAction$OpenSuggest.a) && jl40.l(this.b, action$CityMode$ContinuationAction$OpenSuggest.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("OpenSuggest(suggestMode=", this.a, ", tariffClass=", this.b, Extension.C_BRAKE);
    }

    public Action$CityMode$ContinuationAction$OpenSuggest() {
        this.a = "";
        this.b = "";
    }
}
