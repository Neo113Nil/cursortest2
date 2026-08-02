package defpackage;

import android.view.View;
import io.flutter.plugin.editing.c;
import io.flutter.plugin.platform.d;

/* loaded from: classes4.dex */
public final /* synthetic */ class bxc0 implements View.OnFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ xwc0 c;

    public /* synthetic */ bxc0(xwc0 xwc0Var, int i, int i2) {
        this.a = i2;
        this.c = xwc0Var;
        this.b = i;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        int i = this.a;
        int i2 = this.b;
        xwc0 xwc0Var = this.c;
        switch (i) {
            case 0:
                d dVar = (d) xwc0Var;
                if (!z) {
                    c cVar = dVar.z;
                    if (cVar != null) {
                        cVar.b(i2);
                        break;
                    }
                } else {
                    ea20 ea20Var = (ea20) dVar.A.b;
                    if (ea20Var != null) {
                        ea20Var.a("viewFocused", Integer.valueOf(i2), null);
                        break;
                    }
                }
                break;
            default:
                dxc0 dxc0Var = (dxc0) xwc0Var;
                if (!z) {
                    c cVar2 = dxc0Var.y;
                    if (cVar2 != null) {
                        cVar2.b(i2);
                        break;
                    }
                } else {
                    ea20 ea20Var2 = (ea20) dxc0Var.z.b;
                    if (ea20Var2 != null) {
                        ea20Var2.a("viewFocused", Integer.valueOf(i2), null);
                        break;
                    }
                }
                break;
        }
    }
}
