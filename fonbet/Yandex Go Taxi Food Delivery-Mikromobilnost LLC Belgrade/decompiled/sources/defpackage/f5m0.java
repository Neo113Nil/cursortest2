package defpackage;

import android.view.View;

/* loaded from: classes3.dex */
public final /* synthetic */ class f5m0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ n70 b;
    public final /* synthetic */ wls c;

    public /* synthetic */ f5m0(n70 n70Var, wls wlsVar, int i) {
        this.a = i;
        this.b = n70Var;
        this.c = wlsVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        wls wlsVar = this.c;
        n70 n70Var = this.b;
        switch (i) {
            case 0:
                String str = ((d9m0) n70Var.Z()).g;
                if (str != null) {
                    wlsVar.invoke(((d9m0) n70Var.Z()).c, str);
                    break;
                }
                break;
            default:
                if (((bj01) n70Var.Z()).g) {
                    wlsVar.invoke(n70Var.Z(), Integer.valueOf(n70Var.F()));
                    break;
                }
                break;
        }
    }
}
