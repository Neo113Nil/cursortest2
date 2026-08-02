package xsna;

import android.view.View;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class qbd implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ gzs c;

    public /* synthetic */ qbd(int i, gzs gzsVar) {
        this.b = i;
        this.c = gzsVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.b) {
            case 0:
                this.c.invoke();
                break;
            default:
                gzs gzsVar = this.c;
                if (gzsVar != null) {
                    gzsVar.invoke();
                    break;
                }
                break;
        }
    }
}
