package com.yandex.go.taxi.order.models.api.response;

import defpackage.gsq0;
import defpackage.qv10;
import defpackage.unr0;
import defpackage.x4e;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/AllowedDestinationPointChanges;", "", "Companion", "com/yandex/go/taxi/order/models/api/response/f", "$serializer", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class AllowedDestinationPointChanges {
    public static final f Companion = new f();
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public /* synthetic */ AllowedDestinationPointChanges(int i, boolean z, boolean z2, boolean z3) {
        if ((i & 1) == 0) {
            this.a = false;
        } else {
            this.a = z;
        }
        if ((i & 2) == 0) {
            this.b = false;
        } else {
            this.b = z2;
        }
        if ((i & 4) == 0) {
            this.c = false;
        } else {
            this.c = z3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AllowedDestinationPointChanges)) {
            return false;
        }
        AllowedDestinationPointChanges allowedDestinationPointChanges = (AllowedDestinationPointChanges) obj;
        return this.a == allowedDestinationPointChanges.a && this.b == allowedDestinationPointChanges.b && this.c == allowedDestinationPointChanges.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + unr0.e(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return x4e.i(qv10.u("AllowedDestinationPointChanges(edit=", ", remove=", ", insertBefore=", this.a, this.b), this.c, Extension.C_BRAKE);
    }

    public AllowedDestinationPointChanges(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public AllowedDestinationPointChanges() {
        this(false, false, false);
    }
}
