package com.yandex.go.taxi.order.models.api.response;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.jsq0;
import defpackage.ly3;
import defpackage.ro1;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/AllowedChange;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/e", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class AllowedChange {
    public static final e Companion = new e();
    public static final i3y[] g;
    public final String a;
    public final jsq0 b;
    public List c;
    public final String d;
    public final String e;
    public final Integer f;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        g = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new ro1(9)), kotlin.a.b(lazyThreadSafetyMode, new ro1(10)), null, null, null};
    }

    public /* synthetic */ AllowedChange(int i, String str, jsq0 jsq0Var, List list, String str2, String str3, Integer num) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = jsq0Var;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str3;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = num;
        }
    }

    /* renamed from: a, reason: from getter */
    public final jsq0 getB() {
        return this.b;
    }

    /* renamed from: b, reason: from getter */
    public final String getA() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AllowedChange.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        AllowedChange allowedChange = (AllowedChange) obj;
        return jl40.l(this.a, allowedChange.a) && jl40.l(this.b, allowedChange.b) && jl40.l(this.c, allowedChange.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        jsq0 jsq0Var = this.b;
        int hashCode2 = (hashCode + (jsq0Var != null ? jsq0Var.a.hashCode() : 0)) * 31;
        List list = this.c;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        List list = this.c;
        StringBuilder sb = new StringBuilder("AllowedChange(name=");
        sb.append(this.a);
        sb.append(", availableMethods=");
        sb.append(this.b);
        sb.append(", allowedDestinationChanges=");
        return ly3.s(sb, list, Extension.C_BRAKE);
    }

    public AllowedChange() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
    }
}
