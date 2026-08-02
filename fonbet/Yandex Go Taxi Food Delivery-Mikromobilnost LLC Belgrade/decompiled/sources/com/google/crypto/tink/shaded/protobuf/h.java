package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import defpackage.qqw;
import defpackage.rom0;
import defpackage.vt10;

/* loaded from: classes.dex */
public final class h {
    public final g a;

    public h(g gVar) {
        qqw.a(gVar, "output");
        this.a = gVar;
        gVar.a = this;
    }

    public final void a(int i, boolean z) {
        g gVar = this.a;
        gVar.s(i, 0);
        gVar.l(z ? (byte) 1 : (byte) 0);
    }

    public final void b(int i, ByteString byteString) {
        g gVar = this.a;
        gVar.s(i, 2);
        gVar.t(byteString.size());
        ByteString.LiteralByteString literalByteString = (ByteString.LiteralByteString) byteString;
        gVar.m(literalByteString.bytes, literalByteString.k(), literalByteString.size());
    }

    public final void c(int i, double d) {
        g gVar = this.a;
        gVar.getClass();
        gVar.p(i, Double.doubleToRawLongBits(d));
    }

    public final void d(int i, int i2) {
        g gVar = this.a;
        gVar.s(i, 0);
        gVar.r(i2);
    }

    public final void e(int i, int i2) {
        this.a.n(i, i2);
    }

    public final void f(int i, long j) {
        this.a.p(i, j);
    }

    public final void g(int i, float f) {
        g gVar = this.a;
        gVar.getClass();
        gVar.n(i, Float.floatToRawIntBits(f));
    }

    public final void h(int i, Object obj, rom0 rom0Var) {
        g gVar = this.a;
        gVar.s(i, 3);
        rom0Var.i((vt10) obj, gVar.a);
        gVar.s(i, 4);
    }

    public final void i(int i, int i2) {
        g gVar = this.a;
        gVar.s(i, 0);
        gVar.r(i2);
    }

    public final void j(int i, long j) {
        this.a.u(i, j);
    }

    public final void k(int i, Object obj, rom0 rom0Var) {
        vt10 vt10Var = (vt10) obj;
        g gVar = this.a;
        gVar.s(i, 2);
        gVar.t(((a) vt10Var).b(rom0Var));
        rom0Var.i(vt10Var, gVar.a);
    }

    public final void l(int i, Object obj) {
        boolean z = obj instanceof ByteString;
        g gVar = this.a;
        if (!z) {
            vt10 vt10Var = (vt10) obj;
            gVar.s(1, 3);
            gVar.s(2, 0);
            gVar.t(i);
            gVar.s(3, 2);
            gVar.t(((GeneratedMessageLite) vt10Var).b(null));
            ((GeneratedMessageLite) vt10Var).v(gVar);
            gVar.s(1, 4);
            return;
        }
        ByteString byteString = (ByteString) obj;
        gVar.s(1, 3);
        gVar.s(2, 0);
        gVar.t(i);
        gVar.s(3, 2);
        gVar.t(byteString.size());
        ByteString.LiteralByteString literalByteString = (ByteString.LiteralByteString) byteString;
        gVar.m(literalByteString.bytes, literalByteString.k(), literalByteString.size());
        gVar.s(1, 4);
    }

    public final void m(int i, int i2) {
        this.a.n(i, i2);
    }

    public final void n(int i, long j) {
        this.a.p(i, j);
    }

    public final void o(int i, int i2) {
        g gVar = this.a;
        gVar.s(i, 0);
        gVar.t((i2 >> 31) ^ (i2 << 1));
    }

    public final void p(int i, long j) {
        g gVar = this.a;
        gVar.u(i, (j >> 63) ^ (j << 1));
    }

    public final void q(int i, int i2) {
        g gVar = this.a;
        gVar.s(i, 0);
        gVar.t(i2);
    }

    public final void r(int i, long j) {
        this.a.u(i, j);
    }
}
