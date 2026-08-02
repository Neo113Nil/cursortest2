package com.yandex.go.taxi.order.search.polling.model;

import defpackage.gsq0;
import defpackage.m810;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/search/polling/model/ETA;", "", "Companion", "com/yandex/go/taxi/order/search/polling/model/c", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class ETA implements Comparable<ETA> {
    public static final c Companion = new c();
    public final int a;
    public final boolean b;

    public /* synthetic */ ETA(int i, int i2, boolean z) {
        this.a = (i & 1) == 0 ? 60 : i2;
        if ((i & 2) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
    }

    public final int a() {
        boolean z = this.b;
        int i = this.a;
        int a = m810.a(z ? Math.floor(i / 60.0d) : i / 60.0d);
        if (a < 1) {
            return 1;
        }
        return a;
    }

    @Override // java.lang.Comparable
    public final int compareTo(ETA eta) {
        ETA eta2 = eta;
        if (eta2 == null) {
            return 1;
        }
        int i = eta2.a;
        int i2 = this.a;
        if (i2 < i) {
            return -1;
        }
        return i2 > i ? 1 : 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ETA)) {
            return false;
        }
        ETA eta = (ETA) obj;
        return this.a == eta.a && this.b == eta.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "ETA(seconds=" + this.a + ", shouldUseFloor=" + this.b + Extension.C_BRAKE;
    }

    public ETA(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public ETA() {
        this((3 & 1) != 0 ? 60 : 0, false);
    }
}
