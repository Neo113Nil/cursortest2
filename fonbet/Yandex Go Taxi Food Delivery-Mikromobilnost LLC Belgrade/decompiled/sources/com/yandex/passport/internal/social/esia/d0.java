package com.yandex.passport.internal.social.esia;

import android.net.Uri;
import defpackage.jl40;

/* loaded from: classes15.dex */
public final class d0 implements f0 {
    public final Uri a;

    public d0(Uri uri) {
        this.a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d0) && jl40.l(this.a, ((d0) obj).a);
    }

    public final int hashCode() {
        Uri uri = this.a;
        if (uri == null) {
            return 0;
        }
        return uri.hashCode();
    }

    public final String toString() {
        return "OnResultCallback(uri=" + this.a + ')';
    }
}
