package defpackage;

/* loaded from: classes.dex */
public final class hw91 implements d0b1 {
    public static final hw91 b = new hw91(0);
    public static final hw91 c = new hw91(1);
    public static final hw91 d = new hw91(2);
    public static final hw91 e = new hw91(3);
    public static final hw91 f = new hw91(4);
    public final /* synthetic */ int a;

    public /* synthetic */ hw91(int i) {
        this.a = i;
    }

    @Override // defpackage.d0b1
    public final boolean zza(int i) {
        switch (this.a) {
            case 0:
                if (i == 0 || i == 1 || i == 2) {
                }
                break;
            case 1:
                if (jl40.S(i) != 0) {
                }
                break;
            case 2:
                if (wva1.g(i) != 0) {
                }
                break;
            case 3:
                if (i == 0 || i == 1 || i == 2 || i == 3 || i == 4 || i == 5) {
                }
                break;
            default:
                if (i == 0 || i == 1) {
                }
                break;
        }
        return true;
    }
}
