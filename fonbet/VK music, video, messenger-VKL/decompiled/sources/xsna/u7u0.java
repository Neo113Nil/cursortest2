package xsna;

/* compiled from: VkAlertOldDefaults.kt */
/* loaded from: classes17.dex */
public final class u7u0 implements mr1 {
    public static final u7u0 a = new u7u0();
    public static final uog0 b;
    public static final u890 c;
    public static final u890 d;

    static {
        float f = 16;
        b = vog0.b(f);
        float f2 = 0;
        new u890(f2, f2, f2, f2);
        float f3 = 24;
        c = new u890(f3, f3, f3, f2);
        d = new u890(f2, 20, f2, f);
    }

    @Override // xsna.mr1
    public final u890 a() {
        return c;
    }

    @Override // xsna.mr1
    public final u890 b() {
        return d;
    }

    @Override // xsna.mr1
    public final uog0 c() {
        return b;
    }
}
