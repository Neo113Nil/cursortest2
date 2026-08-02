package xsna;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import okio.ByteString;

/* compiled from: Header.kt */
/* loaded from: classes8.dex */
public final class wvu {
    public static final ByteString d = ByteString.a.b(StringUtils.PROCESS_POSTFIX_DELIMITER);
    public static final ByteString e = ByteString.a.b(":status");
    public static final ByteString f = ByteString.a.b(":method");
    public static final ByteString g = ByteString.a.b(":path");
    public static final ByteString h = ByteString.a.b(":scheme");
    public static final ByteString i = ByteString.a.b(":authority");
    public final ByteString a;
    public final ByteString b;
    public final int c;

    public wvu(ByteString byteString, ByteString byteString2) {
        this.a = byteString;
        this.b = byteString2;
        this.c = byteString2.n() + byteString.n() + 32;
    }

    public final ByteString a() {
        return this.a;
    }

    public final ByteString b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wvu)) {
            return false;
        }
        wvu wvuVar = (wvu) obj;
        return epx.f(this.a, wvuVar.a) && epx.f(this.b, wvuVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return this.a.A() + ": " + this.b.A();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public wvu(String str, String str2) {
        this(r0, r3);
        ByteString byteString = new ByteString(str.getBytes(emb.b));
        byteString.c = str;
        ByteString byteString2 = new ByteString(str2.getBytes(emb.b));
        byteString2.c = str2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public wvu(String str, ByteString byteString) {
        this(byteString, r0);
        ByteString byteString2 = new ByteString(str.getBytes(emb.b));
        byteString2.c = str;
    }
}
