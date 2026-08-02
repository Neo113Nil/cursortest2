package com.yandex.go.dto.response;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.txw0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/dto/response/SwipeActionDto$Defer", "Ltxw0;", "Companion", "$serializer", "com/yandex/go/dto/response/v1", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class SwipeActionDto$Defer implements txw0 {
    public static final v1 Companion = new v1();
    public final String a;

    public /* synthetic */ SwipeActionDto$Defer(int i, String str) {
        if ((i & 1) == 0) {
            this.a = "wallet";
        } else {
            this.a = str;
        }
    }

    /* renamed from: a, reason: from getter */
    public final String getA() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SwipeActionDto$Defer) && jl40.l(this.a, ((SwipeActionDto$Defer) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("Defer(filter=", this.a, Extension.C_BRAKE);
    }

    public SwipeActionDto$Defer() {
        this.a = "wallet";
    }
}
