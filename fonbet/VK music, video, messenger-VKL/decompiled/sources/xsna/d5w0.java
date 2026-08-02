package xsna;

/* compiled from: VkpnsPushMessagesReceiver.kt */
/* loaded from: classes5.dex */
public final class d5w0 implements zje0 {
    public final bz8 a;
    public volatile boolean b;

    public d5w0(bz8 bz8Var) {
        this.a = bz8Var;
    }

    @Override // xsna.zje0
    public final void a() {
        if (this.b) {
            this.b = false;
            this.a.a();
        }
    }

    @Override // xsna.zje0
    public final void b(sj80 sj80Var) {
        this.a.b(sj80Var);
    }

    @Override // xsna.zje0
    public final b9f0<wje0> d() {
        return this.a.a.d();
    }

    @Override // xsna.zje0
    public final void e() {
        if (this.b) {
            this.b = false;
            this.a.e();
        }
    }

    @Override // xsna.zje0
    public final void g() {
        if (this.b) {
            return;
        }
        this.b = true;
        this.a.g();
    }

    @Override // xsna.zje0
    public final void h(sj80 sj80Var) {
        this.a.h(sj80Var);
    }
}
