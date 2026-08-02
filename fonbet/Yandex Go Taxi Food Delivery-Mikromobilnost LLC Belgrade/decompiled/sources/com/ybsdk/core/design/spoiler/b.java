package com.ybsdk.core.design.spoiler;

import com.ybsdk.core.design.spoiler.Spoiler;
import defpackage.ovt0;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class b implements ovt0 {
    public final int a;
    public final Spoiler.Gravity b;

    public b(int i, Spoiler.Gravity gravity) {
        this.a = i;
        this.b = gravity;
    }

    public static b a(b bVar, int i) {
        Spoiler.Gravity gravity = bVar.b;
        bVar.getClass();
        return new b(i, gravity);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a == bVar.a && this.b == bVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Fixed(valuePx=" + this.a + ", gravity=" + this.b + Extension.C_BRAKE;
    }
}
