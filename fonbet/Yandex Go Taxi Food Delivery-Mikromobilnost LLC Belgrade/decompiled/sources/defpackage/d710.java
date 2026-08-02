package defpackage;

import android.os.Build;
import android.view.View;
import com.google.android.material.motion.a;

/* loaded from: classes11.dex */
public final class d710 {
    public final c710 a;
    public final b710 b;
    public final View c;

    public d710(b710 b710Var, View view) {
        int i = Build.VERSION.SDK_INT;
        this.a = i >= 34 ? new a() : i >= 33 ? new c710() : null;
        this.b = b710Var;
        this.c = view;
    }

    public final void a(boolean z) {
        c710 c710Var = this.a;
        if (c710Var != null) {
            c710Var.b(this.b, this.c, z);
        }
    }

    public final void b() {
        c710 c710Var = this.a;
        if (c710Var != null) {
            c710Var.c(this.c);
        }
    }
}
