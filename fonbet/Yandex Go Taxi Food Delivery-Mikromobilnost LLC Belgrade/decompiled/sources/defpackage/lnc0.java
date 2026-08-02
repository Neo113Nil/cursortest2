package defpackage;

import com.yandex.plus.core.graphql.type.ELEMENT_LEVEL_TYPE;

/* loaded from: classes8.dex */
public final class lnc0 {
    public final String a;
    public final String b;
    public final ELEMENT_LEVEL_TYPE c;

    public lnc0(String str, String str2, ELEMENT_LEVEL_TYPE element_level_type) {
        this.a = str;
        this.b = str2;
        this.c = element_level_type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lnc0)) {
            return false;
        }
        lnc0 lnc0Var = (lnc0) obj;
        return jl40.l(this.a, lnc0Var.a) && jl40.l(this.b, lnc0Var.b) && this.c == lnc0Var.c;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return this.c.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "PlaqueLevelElement(widgetId=" + this.a + ", widgetGroupId=" + this.b + ", type=" + this.c + ')';
    }
}
