package com.yandex.go.taxi.order.models.api.response;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oo31;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/CompanionHeaderTitle;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/d0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class CompanionHeaderTitle {
    public static final d0 Companion = new d0();
    public final String a;
    public final boolean b;
    public final Long c;

    public /* synthetic */ CompanionHeaderTitle(int i, String str, boolean z, Long l) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = l;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompanionHeaderTitle)) {
            return false;
        }
        CompanionHeaderTitle companionHeaderTitle = (CompanionHeaderTitle) obj;
        return jl40.l(this.a, companionHeaderTitle.a) && this.b == companionHeaderTitle.b && jl40.l(this.c, companionHeaderTitle.c);
    }

    public final int hashCode() {
        int e = unr0.e(this.a.hashCode() * 31, 31, this.b);
        Long l = this.c;
        return e + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        StringBuilder l = oo31.l("CompanionHeaderTitle(text=", this.a, ", shimmering=", ", timerDiff=", this.b);
        l.append(this.c);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }

    public CompanionHeaderTitle(int i) {
        this.a = "";
        this.b = false;
        this.c = null;
    }

    public CompanionHeaderTitle() {
        this(0);
    }
}
