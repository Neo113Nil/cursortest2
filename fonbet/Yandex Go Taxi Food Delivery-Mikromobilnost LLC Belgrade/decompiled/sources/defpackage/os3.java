package defpackage;

import android.view.View;

/* loaded from: classes3.dex */
public final /* synthetic */ class os3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ tls b;
    public final /* synthetic */ n70 c;

    public /* synthetic */ os3(n70 n70Var, tls tlsVar) {
        this.a = 2;
        this.c = n70Var;
        this.b = tlsVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        n70 n70Var = this.c;
        tls tlsVar = this.b;
        switch (i) {
            case 0:
                tlsVar.invoke(n70Var.Z());
                break;
            case 1:
                tlsVar.invoke(n70Var.Z());
                break;
            case 2:
                if (((jsg) n70Var.Z()).c) {
                    tlsVar.invoke(Integer.valueOf(n70Var.E()));
                    break;
                }
                break;
            case 3:
                if (tlsVar != null) {
                    tlsVar.invoke(n70Var.Z());
                    break;
                }
                break;
            case 4:
                tlsVar.invoke(((q8m0) n70Var.Z()).e);
                break;
            case 5:
                tlsVar.invoke(((s8m0) n70Var.Z()).e);
                break;
            case 6:
                tlsVar.invoke(n70Var.Z());
                break;
            case 7:
                tlsVar.invoke(((r9u0) n70Var.Z()).a.j);
                break;
            case 8:
                tlsVar.invoke(n70Var.Z());
                break;
            case 9:
                tlsVar.invoke(((la21) n70Var.Z()).a.a);
                break;
            case 10:
                tlsVar.invoke(((tb21) n70Var.Z()).a);
                break;
            case 11:
                tlsVar.invoke(Integer.valueOf(n70Var.E()));
                break;
            default:
                tlsVar.invoke(Integer.valueOf(n70Var.E()));
                break;
        }
    }

    public /* synthetic */ os3(int i, n70 n70Var, tls tlsVar) {
        this.a = i;
        this.b = tlsVar;
        this.c = n70Var;
    }
}
