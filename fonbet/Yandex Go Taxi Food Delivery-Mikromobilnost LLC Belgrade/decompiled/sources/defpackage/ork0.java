package defpackage;

/* loaded from: classes4.dex */
public final class ork0 extends a8 {
    public int c;
    public int w;
    public final /* synthetic */ prk0 x;

    public ork0(prk0 prk0Var) {
        this.x = prk0Var;
        this.c = prk0Var.size();
        this.w = prk0Var.c;
    }

    @Override // defpackage.a8
    public final void a() {
        int i = this.c;
        if (i == 0) {
            this.a = 2;
            return;
        }
        prk0 prk0Var = this.x;
        Object[] objArr = prk0Var.a;
        int i2 = this.w;
        this.b = objArr[i2];
        this.a = 1;
        this.w = (i2 + 1) % prk0Var.b;
        this.c = i - 1;
    }
}
