package defpackage;

/* loaded from: classes4.dex */
public final class flp0 extends jlp0 {
    public static final flp0 b = new flp0(0);
    public static final flp0 c = new flp0(1);
    public final /* synthetic */ int a;

    public /* synthetic */ flp0(int i) {
        this.a = i;
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "SCT signature failed verification";
            default:
                return "No trusted log server found for SCT";
        }
    }
}
