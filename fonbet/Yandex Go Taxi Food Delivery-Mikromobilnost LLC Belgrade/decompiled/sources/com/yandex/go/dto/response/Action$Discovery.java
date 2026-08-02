package com.yandex.go.dto.response;

import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/dto/response/Action$Discovery", "Lcom/yandex/go/dto/response/q1;", "Companion", "$serializer", "com/yandex/go/dto/response/t", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class Action$Discovery extends q1 {
    public static final t Companion = new t();
    public final String a;
    public final kotlinx.serialization.json.b b;

    public Action$Discovery(int i, String str, kotlinx.serialization.json.b bVar) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = bVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Action$Discovery)) {
            return false;
        }
        Action$Discovery action$Discovery = (Action$Discovery) obj;
        return jl40.l(this.a, action$Discovery.a) && jl40.l(this.b, action$Discovery.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        kotlinx.serialization.json.b bVar = this.b;
        return hashCode + (bVar == null ? 0 : bVar.hashCode());
    }

    public final String toString() {
        return "Discovery(mode=" + this.a + ", layersContext=" + this.b + Extension.C_BRAKE;
    }

    public Action$Discovery(String str, kotlinx.serialization.json.b bVar) {
        this.a = str;
        this.b = bVar;
    }

    public Action$Discovery() {
        this("", null);
    }
}
