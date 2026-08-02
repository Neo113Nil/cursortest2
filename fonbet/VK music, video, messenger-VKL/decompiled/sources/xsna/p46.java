package xsna;

import com.ironsource.C4584ub;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class p46 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ gzs c;

    public /* synthetic */ p46(int i, gzs gzsVar) {
        this.b = i;
        this.c = gzsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                this.c.invoke();
                break;
            case 1:
                this.c.invoke();
                break;
            default:
                C4584ub.a(this.c);
                break;
        }
    }
}
