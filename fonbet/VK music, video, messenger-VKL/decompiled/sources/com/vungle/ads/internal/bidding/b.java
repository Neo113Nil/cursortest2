package com.vungle.ads.internal.bidding;

import com.iab.omid.library.vungle.internal.l;
import xsna.epx;
import xsna.ho8;

/* loaded from: classes7.dex */
public final class b {
    public final String a;
    public final String b;

    public b(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder a = l.a("BiddingTokenInfo(bidToken=");
        a.append(this.a);
        a.append(", errorMessage=");
        return ho8.a(a, this.b, ')');
    }
}
