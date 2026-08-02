package xsna;

import android.view.View;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class ijc implements View.OnClickListener {
    public final /* synthetic */ long b;
    public final /* synthetic */ izs c;

    public /* synthetic */ ijc(long j, izs izsVar) {
        this.b = j;
        this.c = izsVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (jjc.d().b(this.b)) {
            return;
        }
        this.c.invoke(view);
    }
}
