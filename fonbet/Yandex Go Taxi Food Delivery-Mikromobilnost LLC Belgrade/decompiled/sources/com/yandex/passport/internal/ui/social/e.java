package com.yandex.passport.internal.ui.social;

import defpackage.b64;
import defpackage.jl40;

/* loaded from: classes2.dex */
public final class e extends h {
    public final String b;

    public e(String str) {
        super("native_mail_password");
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && jl40.l(this.b, ((e) obj).b);
    }

    public final int hashCode() {
        String str = this.b;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return b64.p(new StringBuilder("NativeMailPassword(primaryDisplayName="), this.b, ')');
    }
}
