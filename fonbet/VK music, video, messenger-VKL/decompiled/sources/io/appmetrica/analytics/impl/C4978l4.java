package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.l4, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4978l4 {
    public final String a;
    public final Integer b;
    public final String c;

    public C4978l4(String str, Integer num, String str2) {
        this.a = str;
        this.b = num;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4978l4.class == obj.getClass()) {
            C4978l4 c4978l4 = (C4978l4) obj;
            if (!this.a.equals(c4978l4.a)) {
                return false;
            }
            Integer num = this.b;
            if (num == null ? c4978l4.b != null : !num.equals(c4978l4.b)) {
                return false;
            }
            String str = this.c;
            String str2 = c4978l4.c;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        String str = this.c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }
}
