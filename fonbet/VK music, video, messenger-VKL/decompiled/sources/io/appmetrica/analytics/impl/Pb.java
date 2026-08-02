package io.appmetrica.analytics.impl;

/* loaded from: classes8.dex */
public final class Pb implements InterfaceC4741c {
    public final InterfaceC4845g0 a;
    public final Nn b = new Nn();

    public Pb(InterfaceC4845g0 interfaceC4845g0) {
        this.a = interfaceC4845g0;
    }

    public static final void a(Pb pb, V v) {
        pb.a.a(v);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4741c
    public final void onAppNotResponding() {
        StackTraceElement[] stackTraceElementArr;
        Nn nn = this.b;
        Thread a = nn.a.a();
        try {
            stackTraceElementArr = nn.a.b();
            if (stackTraceElementArr == null) {
                try {
                    stackTraceElementArr = a.getStackTrace();
                } catch (SecurityException unused) {
                }
            }
        } catch (SecurityException unused2) {
            stackTraceElementArr = null;
        }
        V v = new V((Gn) nn.b.apply(a, stackTraceElementArr), nn.a(a, null), nn.c.a());
        ((L9) C5030n4.l().c.a()).b.post(new xsna.c0(4, this, v));
    }
}
