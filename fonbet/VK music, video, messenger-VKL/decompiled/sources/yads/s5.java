package yads;

import android.os.Bundle;
import java.lang.ref.WeakReference;

/* loaded from: classes10.dex */
public final class s5 implements f4 {
    public final z9 a;
    public final WeakReference b;

    public s5(z9 z9Var, WeakReference weakReference) {
        this.a = z9Var;
        this.b = weakReference;
        z9Var.a(this);
    }

    @Override // yads.f4
    public final void a(int i, Bundle bundle) {
        v02 v02Var = (v02) this.b.get();
        if (v02Var != null) {
            if (i == 19) {
                v02Var.a.b();
                v02Var.b.f.b.b(h1.e);
                return;
            }
            if (i == 20) {
                v02Var.b.f.b.a(h1.e);
                return;
            }
            switch (i) {
                case 6:
                    v02Var.a.b();
                    v02Var.b.f.b.b(h1.d);
                    break;
                case 7:
                    v02Var.a.b();
                    v02Var.b.f.c();
                    break;
                case 8:
                    v02Var.b.f.b.a(h1.d);
                    break;
                case 9:
                    v02Var.b.f.a();
                    break;
            }
        }
    }

    public /* synthetic */ s5(v02 v02Var) {
        this(new z9(), new WeakReference(v02Var));
    }
}
