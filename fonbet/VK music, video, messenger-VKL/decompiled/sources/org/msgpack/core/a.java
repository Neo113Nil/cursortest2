package org.msgpack.core;

/* compiled from: ExtensionTypeHeader.java */
/* loaded from: classes8.dex */
public final class a {
    public final byte a;
    public final int b;

    public a(byte b, int i) {
        if (!(i >= 0)) {
            throw new IllegalArgumentException("length must be >= 0");
        }
        this.a = b;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.a == aVar.a && this.b == aVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a + 31) * 31) + this.b;
    }

    public final String toString() {
        return String.format("ExtensionTypeHeader(type:%d, length:%,d)", Byte.valueOf(this.a), Integer.valueOf(this.b));
    }
}
