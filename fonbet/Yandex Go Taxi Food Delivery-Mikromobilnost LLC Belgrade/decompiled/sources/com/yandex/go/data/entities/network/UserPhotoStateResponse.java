package com.yandex.go.data.entities.network;

import defpackage.gp21;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.jq21;
import defpackage.ly3;
import defpackage.n;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/data/entities/network/UserPhotoStateResponse;", "", "Companion", "$serializer", "com/yandex/go/data/entities/network/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class UserPhotoStateResponse {
    public static final b Companion = new b();
    public static final i3y[] f = {null, null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new gp21(8))};
    public final FormattedText a;
    public final FormattedText b;
    public final FormattedText c;
    public final jq21 d;
    public final List e;

    public /* synthetic */ UserPhotoStateResponse(int i, FormattedText formattedText, FormattedText formattedText2, FormattedText formattedText3, jq21 jq21Var, List list) {
        this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = formattedText2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = formattedText3;
        }
        if ((i & 8) == 0) {
            this.d = new jq21(0);
        } else {
            this.d = jq21Var;
        }
        if ((i & 16) == 0) {
            this.e = EmptyList.a;
        } else {
            this.e = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserPhotoStateResponse)) {
            return false;
        }
        UserPhotoStateResponse userPhotoStateResponse = (UserPhotoStateResponse) obj;
        return jl40.l(this.a, userPhotoStateResponse.a) && jl40.l(this.b, userPhotoStateResponse.b) && jl40.l(this.c, userPhotoStateResponse.c) && jl40.l(this.d, userPhotoStateResponse.d) && jl40.l(this.e, userPhotoStateResponse.e);
    }

    public final int hashCode() {
        int hashCode = this.a.a.hashCode() * 31;
        FormattedText formattedText = this.b;
        int hashCode2 = (hashCode + (formattedText == null ? 0 : formattedText.a.hashCode())) * 31;
        FormattedText formattedText2 = this.c;
        return this.e.hashCode() + ((this.d.hashCode() + ((hashCode2 + (formattedText2 != null ? formattedText2.a.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder r = n.r("UserPhotoStateResponse(title=", this.a, ", subtitle=", this.b, ", statusText=");
        r.append(this.c);
        r.append(", photo=");
        r.append(this.d);
        r.append(", buttons=");
        return ly3.s(r, this.e, Extension.C_BRAKE);
    }

    public UserPhotoStateResponse() {
        FormattedText formattedText = FormattedText.c;
        jq21 jq21Var = new jq21(0);
        this.a = formattedText;
        this.b = null;
        this.c = null;
        this.d = jq21Var;
        this.e = EmptyList.a;
    }
}
