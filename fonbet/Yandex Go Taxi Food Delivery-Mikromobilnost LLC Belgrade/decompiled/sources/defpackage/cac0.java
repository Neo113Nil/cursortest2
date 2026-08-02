package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class cac0 implements o631 {
    public final o631 a;
    public final String b;

    public cac0(o631 o631Var, String str) {
        this.a = o631Var;
        this.b = str;
    }

    @Override // defpackage.o631
    public final void a(long j, String str) {
        this.a.a(j, str);
    }

    @Override // defpackage.o631
    public final void b(long j, String str) {
        this.a.b(j, str);
    }

    @Override // defpackage.o631
    public final void c(long j, String str) {
        this.a.c(j, str);
    }

    @Override // defpackage.o631
    public final void d(long j, String str) {
        this.a.d(j, str);
    }

    @Override // defpackage.o631
    public final void e(long j, String str) {
        this.a.e(j, str);
    }

    @Override // defpackage.o631
    public final void f(int i, String str) {
        this.a.f(i, l(str));
    }

    @Override // defpackage.o631
    public final void g(long j, String str) {
        this.a.g(j, l(str));
    }

    @Override // defpackage.o631
    public final void h(long j, String str) {
        this.a.h(j, str);
    }

    @Override // defpackage.o631
    public final void i(long j, String str) {
        this.a.i(j, str);
    }

    @Override // defpackage.o631
    public final void j(long j, String str) {
        this.a.j(j, str);
    }

    @Override // defpackage.o631
    public final void k(long j, String str) {
        this.a.k(j, l(str));
    }

    public final String l(String str) {
        return g8e.p(str, Extension.DOT_CHAR, jl40.l(this.b, "superapp_discovery_map") ? "supermap" : "other");
    }
}
