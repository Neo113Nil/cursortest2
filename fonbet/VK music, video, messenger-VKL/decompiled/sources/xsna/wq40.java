package xsna;

import android.content.Context;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class wq40 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wq40(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                yq40 yq40Var = (yq40) this.c;
                yq40Var.b(false);
                if (yq40Var.a().e()) {
                    yq40Var.c(false);
                    break;
                }
                break;
            case 1:
                ((o260) this.c).d(true);
                break;
            default:
                com.my.tracker.obfuscated.b1.d((Context) this.c);
                break;
        }
    }
}
