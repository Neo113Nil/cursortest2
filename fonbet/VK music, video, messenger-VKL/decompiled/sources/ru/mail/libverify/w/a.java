package ru.mail.libverify.w;

import java.io.Serializable;
import java.util.Arrays;
import xsna.epx;

/* loaded from: classes9.dex */
public final class a implements Serializable {
    private final String a;
    private final byte[] b;

    public a(String str, byte[] bArr) {
        this.a = str;
        this.b = bArr;
    }

    public final byte[] a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!a.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        a aVar = (a) obj;
        return epx.f(this.a, aVar.a) && Arrays.equals(this.b, aVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
