package defpackage;

/* loaded from: classes15.dex */
public final class jz implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b00 b;
    public final /* synthetic */ String c;

    public /* synthetic */ jz(b00 b00Var, String str, int i) {
        this.a = i;
        this.b = b00Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                b00.a(this.b).a(new oj0(this.c));
                break;
            default:
                b00.a(this.b).a(new ash(this.c));
                break;
        }
    }
}
