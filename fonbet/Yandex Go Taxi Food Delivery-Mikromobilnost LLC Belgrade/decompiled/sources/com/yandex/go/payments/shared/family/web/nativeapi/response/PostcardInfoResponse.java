package com.yandex.go.payments.shared.family.web.nativeapi.response;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jee0;
import defpackage.jl40;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/shared/family/web/nativeapi/response/PostcardInfoResponse;", "", "Companion", "$serializer", "com/yandex/go/payments/shared/family/web/nativeapi/response/d", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PostcardInfoResponse {
    public static final d Companion = new d();
    public static final i3y[] c = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new jee0(3)), null};
    public final List a;
    public final Postcard b;

    public /* synthetic */ PostcardInfoResponse(int i, List list, Postcard postcard) {
        this.a = (i & 1) == 0 ? EmptyList.a : list;
        if ((i & 2) == 0) {
            this.b = new Postcard(0);
        } else {
            this.b = postcard;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostcardInfoResponse)) {
            return false;
        }
        PostcardInfoResponse postcardInfoResponse = (PostcardInfoResponse) obj;
        return jl40.l(this.a, postcardInfoResponse.a) && jl40.l(this.b, postcardInfoResponse.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Postcard postcard = this.b;
        return hashCode + (postcard == null ? 0 : postcard.hashCode());
    }

    public final String toString() {
        return "PostcardInfoResponse(contacts=" + this.a + ", postcard=" + this.b + Extension.C_BRAKE;
    }

    public PostcardInfoResponse(List list, Postcard postcard) {
        this.a = list;
        this.b = postcard;
    }

    public PostcardInfoResponse() {
        this(EmptyList.a, new Postcard(0));
    }
}
