package defpackage;

/* loaded from: classes10.dex */
public final class kun implements jun {
    public final int a;
    public int b = -1;
    public int c = -1;

    public kun(int i) {
        this.a = i;
    }

    @Override // defpackage.jun
    public final boolean c(CharSequence charSequence, int i, int i2, jp11 jp11Var) {
        int i3 = this.a;
        if (i > i3 || i3 >= i2) {
            return i2 <= i3;
        }
        this.b = i;
        this.c = i2;
        return false;
    }

    @Override // defpackage.jun
    public final Object getResult() {
        return this;
    }
}
