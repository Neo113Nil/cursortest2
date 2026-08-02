package org.msgpack.core;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.charset.Charset;
import java.nio.charset.CodingErrorAction;

/* compiled from: MessagePack.java */
/* loaded from: classes8.dex */
public final class b {
    public static final Charset a = Charset.forName(C.UTF8_NAME);
    public static final C2186b b = new C2186b();
    public static final c c = new c();

    /* compiled from: MessagePack.java */
    public static final class a {
        public static final boolean a(byte b) {
            int i = b & 255;
            return i <= 127 || i >= 224;
        }
    }

    /* compiled from: MessagePack.java */
    /* renamed from: org.msgpack.core.b$b, reason: collision with other inner class name */
    public static class C2186b implements Cloneable {
        public int b = 512;
        public int c = 8192;
        public int d = 8192;
        public boolean e = true;

        public final Object clone() throws CloneNotSupportedException {
            C2186b c2186b = new C2186b();
            c2186b.b = 512;
            c2186b.c = 8192;
            c2186b.d = 8192;
            c2186b.e = true;
            c2186b.b = this.b;
            c2186b.c = this.c;
            c2186b.d = this.d;
            c2186b.e = this.e;
            return c2186b;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C2186b)) {
                return false;
            }
            C2186b c2186b = (C2186b) obj;
            return this.b == c2186b.b && this.c == c2186b.c && this.d == c2186b.d && this.e == c2186b.e;
        }

        public final int hashCode() {
            return (((((this.b * 31) + this.c) * 31) + this.d) * 31) + (this.e ? 1 : 0);
        }
    }

    /* compiled from: MessagePack.java */
    public static class c implements Cloneable {
        public boolean b = true;
        public boolean c = true;
        public CodingErrorAction d;
        public CodingErrorAction e;
        public int f;
        public int g;
        public int h;

        public c() {
            CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
            this.d = codingErrorAction;
            this.e = codingErrorAction;
            this.f = Integer.MAX_VALUE;
            this.g = 8192;
            this.h = 8192;
        }

        public final Object clone() throws CloneNotSupportedException {
            c cVar = new c();
            cVar.b = true;
            cVar.c = true;
            CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
            cVar.d = codingErrorAction;
            cVar.e = codingErrorAction;
            cVar.f = Integer.MAX_VALUE;
            cVar.g = 8192;
            cVar.h = 8192;
            cVar.b = this.b;
            cVar.c = this.c;
            cVar.d = this.d;
            cVar.e = this.e;
            cVar.f = this.f;
            cVar.g = this.g;
            return cVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.b == cVar.b && this.c == cVar.c && this.d == cVar.d && this.e == cVar.e && this.f == cVar.f && this.h == cVar.h && this.g == cVar.g;
        }

        public final int hashCode() {
            int i = (((this.b ? 1 : 0) * 31) + (this.c ? 1 : 0)) * 31;
            CodingErrorAction codingErrorAction = this.d;
            int hashCode = (i + (codingErrorAction != null ? codingErrorAction.hashCode() : 0)) * 31;
            CodingErrorAction codingErrorAction2 = this.e;
            return ((((((hashCode + (codingErrorAction2 != null ? codingErrorAction2.hashCode() : 0)) * 31) + this.f) * 31) + this.g) * 31) + this.h;
        }
    }
}
