package com.google.protobuf;

import defpackage.gp50;
import defpackage.k77;
import defpackage.rqw;
import defpackage.wt10;
import defpackage.z321;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class l extends k77 {
    public static final Logger b = Logger.getLogger(l.class.getName());
    public static final boolean c = z321.e;
    public gp50 a;

    public static int b(int i, ByteString byteString) {
        int f = f(i);
        int size = byteString.size();
        return g(size) + size + f;
    }

    public static int c(int i) {
        return g((i >> 31) ^ (i << 1));
    }

    public static int d(long j) {
        return h((j >> 63) ^ (j << 1));
    }

    public static int e(String str) {
        int length;
        try {
            length = x.b(str);
        } catch (Utf8$UnpairedSurrogateException unused) {
            length = str.getBytes(rqw.a).length;
        }
        return g(length) + length;
    }

    public static int f(int i) {
        return g(i << 3);
    }

    public static int g(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int h(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public final void i(String str, Utf8$UnpairedSurrogateException utf8$UnpairedSurrogateException) {
        b.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) utf8$UnpairedSurrogateException);
        byte[] bytes = str.getBytes(rqw.a);
        try {
            x(bytes.length);
            a(0, bytes.length, bytes);
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream$OutOfSpaceException(e);
        }
    }

    public abstract void j(byte b2);

    public abstract void k(int i, boolean z);

    public abstract void l(int i, ByteString byteString);

    public abstract void m(int i, int i2);

    public abstract void n(int i);

    public abstract void o(int i, long j);

    public abstract void p(long j);

    public abstract void q(int i, int i2);

    public abstract void r(int i);

    public abstract void s(int i, wt10 wt10Var);

    public abstract void t(int i, ByteString byteString);

    public abstract void u(int i, String str);

    public abstract void v(int i, int i2);

    public abstract void w(int i, int i2);

    public abstract void x(int i);

    public abstract void y(int i, long j);

    public abstract void z(long j);
}
