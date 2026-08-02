package xsna;

import android.os.Build;
import android.view.View;
import android.view.Window;
import xsna.oqx0;

/* compiled from: MusicPlayerEdgeToEdgeController.kt */
/* loaded from: classes3.dex */
public final class jw40 {
    public final s4b0 a;
    public Window b;
    public View c;
    public oqx0 d;
    public Integer e;
    public Integer f;
    public Boolean g;
    public Boolean h;

    public jw40(s4b0 s4b0Var) {
        this.a = s4b0Var;
    }

    public final void a() {
        Window window;
        View view;
        s4b0 s4b0Var = this.a;
        if (!s4b0Var.c() || (window = this.b) == null || (view = this.c) == null) {
            return;
        }
        s4b0Var.a();
        Integer num = this.e;
        Integer num2 = this.f;
        Boolean bool = this.g;
        Boolean bool2 = this.h;
        if (num != null && num2 != null && bool != null && bool2 != null) {
            boolean booleanValue = bool2.booleanValue();
            boolean booleanValue2 = bool.booleanValue();
            int intValue = num2.intValue();
            window.setStatusBarColor(num.intValue());
            window.setNavigationBarColor(intValue);
            oqx0 oqx0Var = this.d;
            if (oqx0Var != null) {
                oqx0Var.b(booleanValue2);
                oqx0Var.a(booleanValue);
            }
        }
        view.setBackgroundColor(0);
        view.setVisibility(8);
    }

    public final void b(boolean z) {
        if (this.a.c()) {
            return;
        }
        c(z);
        oqx0 oqx0Var = this.d;
        if (oqx0Var != null) {
            oqx0Var.b(false);
            oqx0Var.a(false);
        }
    }

    public final void c(boolean z) {
        View view = this.c;
        if (view == null) {
            return;
        }
        s4b0 s4b0Var = this.a;
        if (s4b0Var.c()) {
            return;
        }
        s4b0Var.b();
        Window window = this.b;
        if (window == null) {
            return;
        }
        oek0 oek0Var = new oek0(window.getDecorView());
        int i = Build.VERSION.SDK_INT;
        oqx0.g fVar = i >= 35 ? new oqx0.f(window, oek0Var) : i >= 30 ? new oqx0.d(window, oek0Var) : new oqx0.c(window, oek0Var);
        if (z) {
            this.e = Integer.valueOf(window.getStatusBarColor());
            this.f = Integer.valueOf(window.getNavigationBarColor());
            this.g = Boolean.valueOf(fVar.d());
            this.h = Boolean.valueOf(fVar.c());
        }
        view.setBackgroundColor(window.getStatusBarColor());
        view.setVisibility(0);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(-16777216);
    }
}
