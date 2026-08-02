package com.yandex.plus.home.feature.webviews.internal.network;

import defpackage.jl40;
import defpackage.unr0;
import defpackage.wls;

/* loaded from: classes2.dex */
public final class a {
    public final String a;
    public final String b;
    public final wls c;

    public a(String str) {
        WebViewHeader$1 webViewHeader$1 = WebViewHeader$1.b;
        this.a = "Authorization";
        this.b = str;
        this.c = webViewHeader$1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return jl40.l(this.a, aVar.a) && jl40.l(this.b, aVar.b) && jl40.l(this.c, aVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        String str = this.b;
        wls wlsVar = this.c;
        String str2 = this.a;
        return "WebViewHeader(key=" + str2 + ", value=" + ((String) wlsVar.invoke(str2, str)) + ')';
    }
}
