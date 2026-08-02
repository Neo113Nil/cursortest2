package com.yandex.passport.internal.social.esia;

import android.net.Uri;
import com.yandex.passport.internal.report.reporters.EsiaBindingReporter$EsiaWay;
import defpackage.jl40;

/* loaded from: classes15.dex */
public final class c0 implements f0 {
    public final Uri a;
    public final EsiaBindingReporter$EsiaWay b;

    public c0(Uri uri, EsiaBindingReporter$EsiaWay esiaBindingReporter$EsiaWay) {
        this.a = uri;
        this.b = esiaBindingReporter$EsiaWay;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return jl40.l(this.a, c0Var.a) && this.b == c0Var.b;
    }

    public final int hashCode() {
        Uri uri = this.a;
        int hashCode = (uri == null ? 0 : uri.hashCode()) * 31;
        EsiaBindingReporter$EsiaWay esiaBindingReporter$EsiaWay = this.b;
        return hashCode + (esiaBindingReporter$EsiaWay != null ? esiaBindingReporter$EsiaWay.hashCode() : 0);
    }

    public final String toString() {
        return "OnEsiaCallback(uri=" + this.a + ", way=" + this.b + ')';
    }
}
