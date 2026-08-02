package xsna;

import android.view.View;

/* compiled from: EndViewStory.java */
/* loaded from: classes3.dex */
public final class clp implements View.OnClickListener {
    public final /* synthetic */ glp b;

    public clp(glp glpVar) {
        this.b = glpVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        glp glpVar = this.b;
        if (glpVar.j) {
            return;
        }
        glpVar.k.x0();
        glpVar.h.d.pause();
        d3m.e(glpVar.g, 300L, 0L, null, null, true);
        glpVar.j = true;
    }
}
