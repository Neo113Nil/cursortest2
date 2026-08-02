package xsna;

import java.util.Map;

/* compiled from: OrderListItem.kt */
/* loaded from: classes18.dex */
public final class gww extends jv80 {
    public final y8l b;
    public final String c;
    public final tlo0 d;
    public final Map<String, com.vk.ecomm.orders.impl.common.ui.model.a> e;

    public gww(y8l y8lVar, String str, tlo0 tlo0Var, Map<String, com.vk.ecomm.orders.impl.common.ui.model.a> map) {
        super(str);
        this.b = y8lVar;
        this.c = str;
        this.d = tlo0Var;
        this.e = map;
    }

    @Override // xsna.jv80
    public final String a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gww)) {
            return false;
        }
        gww gwwVar = (gww) obj;
        return epx.f(this.b, gwwVar.b) && epx.f(this.c, gwwVar.c) && epx.f(this.d, gwwVar.d) && epx.f(this.e, gwwVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + com.vk.movika.sdk.base.model.history.b.a(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InfoRowItem(decorationType=");
        sb.append(this.b);
        sb.append(", key=");
        sb.append(this.c);
        sb.append(", label=");
        sb.append(this.d);
        sb.append(", values=");
        return cjl0.a(sb, this.e, ')');
    }
}
