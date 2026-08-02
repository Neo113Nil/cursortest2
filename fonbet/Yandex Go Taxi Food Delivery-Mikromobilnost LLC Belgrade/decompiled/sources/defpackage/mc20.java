package defpackage;

/* loaded from: classes9.dex */
public final class mc20 implements Runnable {
    public static final mc20 b = new mc20(0);
    public static final mc20 c = new mc20(1);
    public static final mc20 w = new mc20(2);
    public static final /* synthetic */ mc20 x = new mc20(3);
    public final /* synthetic */ int a;

    public /* synthetic */ mc20(int i) {
        this.a = i;
    }

    private final void a() {
    }

    private final void b() {
    }

    private final void c() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
            case 1:
            case 2:
                break;
            default:
                cna1.i.incrementAndGet();
                break;
        }
    }
}
