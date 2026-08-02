package defpackage;

import android.view.View;

/* loaded from: classes15.dex */
public final /* synthetic */ class b3b implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ sls b;
    public final /* synthetic */ c3b c;

    public /* synthetic */ b3b(sls slsVar, c3b c3bVar, int i) {
        this.a = i;
        this.b = slsVar;
        this.c = c3bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        c3b c3bVar = this.c;
        sls slsVar = this.b;
        switch (i) {
            case 0:
                slsVar.invoke();
                c3bVar.c.dismiss();
                break;
            default:
                slsVar.invoke();
                c3bVar.c.dismiss();
                break;
        }
    }
}
