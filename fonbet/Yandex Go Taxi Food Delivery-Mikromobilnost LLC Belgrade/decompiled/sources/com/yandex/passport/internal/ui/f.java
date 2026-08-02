package com.yandex.passport.internal.ui;

import android.net.Uri;
import com.yandex.passport.common.core.Environment;
import defpackage.jl40;

/* loaded from: classes2.dex */
public final class f {
    public final String a;
    public final Uri b;
    public final Environment c;

    public f(String str, Uri uri, Environment environment) {
        this.a = str;
        this.b = uri;
        this.c = environment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return jl40.l(this.a, fVar.a) && this.b.equals(fVar.b) && this.c == fVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ChangePasswordData(url=" + this.a + ", returnUrl=" + this.b + ", environment=" + this.c + ')';
    }
}
