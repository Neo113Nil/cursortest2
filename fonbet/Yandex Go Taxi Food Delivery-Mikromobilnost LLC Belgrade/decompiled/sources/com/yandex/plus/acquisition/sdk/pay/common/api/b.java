package com.yandex.plus.acquisition.sdk.pay.common.api;

import defpackage.b64;
import defpackage.unr0;

/* loaded from: classes2.dex */
public final class b {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public b(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a.equals(bVar.a) && this.b.equals(bVar.b) && this.c.equals(bVar.c) && this.d.equals(bVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CompositeProductTexts(name=");
        sb.append(this.a);
        sb.append(", introductoryText=");
        sb.append(this.b);
        sb.append(", priceText=");
        sb.append(this.c);
        sb.append(", iconLink=");
        return b64.p(sb, this.d, ')');
    }
}
