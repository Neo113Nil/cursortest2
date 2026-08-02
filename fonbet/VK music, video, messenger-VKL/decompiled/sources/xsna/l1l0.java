package xsna;

import com.ironsource.C4339gg;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class l1l0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ gzs c;

    public /* synthetic */ l1l0(int i, gzs gzsVar) {
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
                C4339gg.b(this.c);
                break;
        }
    }
}
