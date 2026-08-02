package com.yandex.passport.sloth.ui;

import defpackage.b64;
import defpackage.jl40;

/* loaded from: classes2.dex */
public final class s1 implements y1 {
    public final String a;

    public s1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s1) && jl40.l(this.a, ((s1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.p(new StringBuilder("OnJsCommand(payload="), this.a, ')');
    }
}
