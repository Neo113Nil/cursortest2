package defpackage;

import android.view.View;

/* loaded from: classes4.dex */
public final /* synthetic */ class cnf implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ tls b;

    public /* synthetic */ cnf(int i, tls tlsVar) {
        this.a = i;
        this.b = tlsVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        tls tlsVar = this.b;
        switch (i) {
            case 0:
                tlsVar.invoke(view);
                break;
            default:
                tlsVar.invoke(view);
                break;
        }
    }
}
