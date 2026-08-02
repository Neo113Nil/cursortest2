package defpackage;

@gsq0
/* loaded from: classes5.dex */
public final class kxu0 {
    public static final jxu0 Companion = new jxu0();
    public final int a;
    public final int b;

    public /* synthetic */ kxu0(int i, int i2, int i3) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, ixu0.a.getDescriptor());
            throw null;
        }
        this.a = i2;
        this.b = i3;
    }

    public final int a() {
        return this.b;
    }

    public final int b() {
        return this.a;
    }
}
