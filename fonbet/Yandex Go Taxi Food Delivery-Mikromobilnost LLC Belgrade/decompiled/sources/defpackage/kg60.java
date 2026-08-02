package defpackage;

import android.os.Bundle;

/* loaded from: classes15.dex */
public final /* synthetic */ class kg60 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lg60 b;
    public final /* synthetic */ Bundle c;

    public /* synthetic */ kg60(lg60 lg60Var, Bundle bundle, int i) {
        this.a = i;
        this.b = lg60Var;
        this.c = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Bundle bundle = this.c;
        lg60 lg60Var = this.b;
        lg60Var.getClass();
        switch (i) {
            case 0:
                ((i00) lg60Var.b.get()).a(new u070(bundle));
                break;
            default:
                ((i00) lg60Var.b.get()).a(new v070(bundle));
                break;
        }
    }
}
