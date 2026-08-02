package com.yandex.go.payments.shared.family.web.nativeapi.request;

import defpackage.b64;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/shared/family/web/nativeapi/request/PostcardParams;", "", "Companion", "$serializer", "com/yandex/go/payments/shared/family/web/nativeapi/request/e", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PostcardParams {
    public static final e Companion = new e();
    public static final i3y[] g = {null, null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new jee0(4)), null};
    public final ButtonTemplate a;
    public final String b;
    public final String c;
    public final int d;
    public final List e;
    public final Postcard f;

    public /* synthetic */ PostcardParams(int i, ButtonTemplate buttonTemplate, String str, String str2, int i2, List list, Postcard postcard) {
        this.a = (i & 1) == 0 ? new ButtonTemplate(0) : buttonTemplate;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = 0;
        } else {
            this.d = i2;
        }
        if ((i & 16) == 0) {
            this.e = EmptyList.a;
        } else {
            this.e = list;
        }
        if ((i & 32) == 0) {
            this.f = new Postcard(0);
        } else {
            this.f = postcard;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostcardParams)) {
            return false;
        }
        PostcardParams postcardParams = (PostcardParams) obj;
        return jl40.l(this.a, postcardParams.a) && jl40.l(this.b, postcardParams.b) && jl40.l(this.c, postcardParams.c) && this.d == postcardParams.d && jl40.l(this.e, postcardParams.e) && jl40.l(this.f, postcardParams.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return this.f.hashCode() + unr0.c(oyr.b(this.d, (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PostcardParams(buttonTemplate=");
        sb.append(this.a);
        sb.append(", disabledButton=");
        sb.append(this.b);
        sb.append(", title=");
        b64.A(this.d, this.c, ", maxCountContacts=", ", preselectedContactPhones=", sb);
        sb.append(this.e);
        sb.append(", postcard=");
        sb.append(this.f);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }

    public PostcardParams() {
        ButtonTemplate buttonTemplate = new ButtonTemplate(0);
        Postcard postcard = new Postcard(0);
        this.a = buttonTemplate;
        this.b = null;
        this.c = null;
        this.d = 0;
        this.e = EmptyList.a;
        this.f = postcard;
    }
}
