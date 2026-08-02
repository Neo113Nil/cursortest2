package com.yandex.passport.common.analytics;

import defpackage.jl40;
import defpackage.unr0;

/* loaded from: classes8.dex */
public final class b {
    public final String a;
    public final String b;

    public b(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        boolean l;
        boolean l2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        String str = bVar.a;
        String str2 = this.a;
        if (str2 == null) {
            if (str == null) {
                l = true;
            }
            l = false;
        } else {
            if (str != null) {
                l = jl40.l(str2, str);
            }
            l = false;
        }
        if (!l) {
            return false;
        }
        String str3 = bVar.b;
        String str4 = this.b;
        if (str4 == null) {
            if (str3 == null) {
                l2 = true;
            }
            l2 = false;
        } else {
            if (str3 != null) {
                l2 = jl40.l(str4, str3);
            }
            l2 = false;
        }
        return l2;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnalyticalIdentifiers(deviceId=");
        String str = this.a;
        sb.append((Object) (str == null ? "null" : unr0.l(')', "DeviceId(value=", str)));
        sb.append(", uuid=");
        String str2 = this.b;
        sb.append((Object) (str2 != null ? unr0.l(')', "Uuid(value=", str2) : "null"));
        sb.append(')');
        return sb.toString();
    }
}
