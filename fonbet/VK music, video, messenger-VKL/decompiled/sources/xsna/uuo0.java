package xsna;

/* compiled from: TimePicker.kt */
/* loaded from: classes11.dex */
public final class uuo0 implements tuo0 {
    public final boolean a;
    public final wh50 b;
    public final rg50 c;
    public final rg50 d;

    public uuo0(int i, int i2, boolean z) {
        if (i < 0 || i >= 24) {
            throw new IllegalArgumentException("initialHour should in [0..23] range");
        }
        if (i2 < 0 || i2 >= 60) {
            throw new IllegalArgumentException("initialMinute should be in [0..59] range");
        }
        this.a = z;
        this.b = androidx.compose.runtime.k.b(new suo0(0));
        this.c = androidx.compose.runtime.i.a(i);
        this.d = androidx.compose.runtime.i.a(i2);
    }

    @Override // xsna.tuo0
    public final int a() {
        return ((suo0) ((zak0) this.b).getValue()).a;
    }

    @Override // xsna.tuo0
    public final int b() {
        return ((wak0) this.d).getIntValue();
    }

    @Override // xsna.tuo0
    public final int c() {
        return ((wak0) this.c).getIntValue();
    }

    @Override // xsna.tuo0
    public final void d(int i) {
        ((zak0) this.b).setValue(new suo0(i));
    }

    @Override // xsna.tuo0
    public final void e(int i) {
        ((wak0) this.c).C(i);
    }

    @Override // xsna.tuo0
    public final void f(int i) {
        ((wak0) this.d).C(i);
    }

    @Override // xsna.tuo0
    public final boolean g() {
        return this.a;
    }
}
