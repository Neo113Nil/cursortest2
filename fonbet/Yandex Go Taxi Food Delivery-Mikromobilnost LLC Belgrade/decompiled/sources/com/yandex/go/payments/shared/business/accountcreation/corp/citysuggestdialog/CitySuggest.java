package com.yandex.go.payments.shared.business.accountcreation.corp.citysuggestdialog;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.qje;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/shared/business/accountcreation/corp/citysuggestdialog/CitySuggest;", "", "Companion", "$serializer", "com/yandex/go/payments/shared/business/accountcreation/corp/citysuggestdialog/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class CitySuggest {
    public static final a Companion = new a();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ CitySuggest(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, CitySuggest$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CitySuggest)) {
            return false;
        }
        CitySuggest citySuggest = (CitySuggest) obj;
        return jl40.l(this.a, citySuggest.a) && jl40.l(this.b, citySuggest.b) && jl40.l(this.c, citySuggest.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return oyr.t(b64.v("CitySuggest(text=", this.a, ", description=", this.b, ", city="), this.c, Extension.C_BRAKE);
    }

    public CitySuggest() {
        this.a = "";
        this.b = "";
        this.c = "";
    }
}
