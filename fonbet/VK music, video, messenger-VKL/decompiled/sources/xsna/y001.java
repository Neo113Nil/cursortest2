package xsna;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-basement@@18.10.0 */
/* loaded from: classes12.dex */
public final class y001 implements Runnable {
    public final /* synthetic */ c4z b;
    public final /* synthetic */ String c;
    public final /* synthetic */ x401 d;

    public y001(x401 x401Var, c4z c4zVar, String str) {
        this.b = c4zVar;
        this.c = str;
        this.d = x401Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x401 x401Var = this.d;
        int i = x401Var.b;
        c4z c4zVar = this.b;
        if (i > 0) {
            Bundle bundle = x401Var.c;
            c4zVar.onCreate(bundle != null ? bundle.getBundle(this.c) : null);
        }
        if (x401Var.b >= 2) {
            c4zVar.onStart();
        }
        if (x401Var.b >= 3) {
            c4zVar.onResume();
        }
        if (x401Var.b >= 4) {
            c4zVar.onStop();
        }
        if (x401Var.b >= 5) {
            c4zVar.onDestroy();
        }
    }
}
