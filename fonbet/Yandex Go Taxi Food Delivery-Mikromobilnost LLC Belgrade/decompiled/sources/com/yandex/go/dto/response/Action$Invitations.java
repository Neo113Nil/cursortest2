package com.yandex.go.dto.response;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/dto/response/Action$Invitations", "Lcom/yandex/go/dto/response/q1;", "Companion", "$serializer", "com/yandex/go/dto/response/w", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class Action$Invitations extends q1 {
    public static final w Companion = new w();
    public final String a;
    public final String b;

    public Action$Invitations(int i, String str, String str2) {
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
        if (!(obj instanceof Action$Invitations)) {
            return false;
        }
        Action$Invitations action$Invitations = (Action$Invitations) obj;
        return jl40.l(this.a, action$Invitations.a) && jl40.l(this.b, action$Invitations.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("Invitations(titleText=", this.a, ", bodyText=", this.b, Extension.C_BRAKE);
    }

    public Action$Invitations() {
        this.a = "";
        this.b = "";
    }
}
