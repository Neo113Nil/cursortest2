package defpackage;

import android.net.Uri;

/* loaded from: classes7.dex */
public final /* synthetic */ class mrs implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ba20 b;

    public /* synthetic */ mrs(ba20 ba20Var, int i) {
        this.a = i;
        this.b = ba20Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        ba20 ba20Var = this.b;
        switch (i) {
            case 0:
                Uri uri = nrs.x;
                ba20Var.success(null);
                break;
            case 1:
                Uri uri2 = nrs.x;
                ba20Var.success(null);
                break;
            case 2:
                Uri uri3 = nrs.x;
                ba20Var.success(null);
                break;
            default:
                ba20Var.notImplemented();
                break;
        }
    }
}
