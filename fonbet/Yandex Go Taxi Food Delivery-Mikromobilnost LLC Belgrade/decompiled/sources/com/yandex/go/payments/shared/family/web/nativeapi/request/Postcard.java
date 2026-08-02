package com.yandex.go.payments.shared.family.web.nativeapi.request;

import defpackage.g8e;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jee0;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/shared/family/web/nativeapi/request/Postcard;", "", "Companion", "$serializer", "com/yandex/go/payments/shared/family/web/nativeapi/request/d", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class Postcard {
    public static final d Companion = new d();
    public static final i3y[] f = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new jee0(2)), null, null, null, null};
    public final List a;
    public final Integer b;
    public final String c;
    public final String d;
    public final String e;

    public /* synthetic */ Postcard(int i, List list, Integer num, String str, String str2, String str3) {
        this.a = (i & 1) == 0 ? EmptyList.a : list;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str;
        }
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str2;
        }
        if ((i & 16) == 0) {
            this.e = "";
        } else {
            this.e = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Postcard)) {
            return false;
        }
        Postcard postcard = (Postcard) obj;
        return jl40.l(this.a, postcard.a) && jl40.l(this.b, postcard.b) && jl40.l(this.c, postcard.c) && jl40.l(this.d, postcard.d) && jl40.l(this.e, postcard.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return this.e.hashCode() + unr0.b(unr0.b((hashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Postcard(backgrounds=");
        sb.append(this.a);
        sb.append(", textLimit=");
        sb.append(this.b);
        sb.append(", textPlaceholder=");
        g8e.D(sb, this.c, ", chooseContactButtonTitle=", this.d, ", emptyTextButtonTitle=");
        return oyr.t(sb, this.e, Extension.C_BRAKE);
    }

    public Postcard(int i) {
        this.a = EmptyList.a;
        this.b = null;
        this.c = "";
        this.d = "";
        this.e = "";
    }

    public Postcard() {
        this(0);
    }
}
