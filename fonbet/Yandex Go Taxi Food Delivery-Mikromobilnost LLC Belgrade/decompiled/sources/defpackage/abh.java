package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class abh extends mao {
    public final txl a;
    public zah b;

    public abh(txl txlVar) {
        this.a = txlVar;
    }

    @Override // defpackage.ws11
    public final View onCreateView(ViewGroup viewGroup) {
        zah p = zah.p(LayoutInflater.from(viewGroup.getContext()), viewGroup);
        p.c.setOnClickListener(new k5(28, p, this));
        this.b = p;
        return p.o();
    }

    @Override // defpackage.ws11
    public final void onDestroyView(View view) {
        this.b = null;
    }

    @Override // defpackage.mao
    public final void onDocumentError(azl azlVar) {
    }

    @Override // defpackage.ws11
    public final void onUpdateState(Object obj) {
        zah zahVar = this.b;
        if (zahVar != null) {
            zahVar.c.setEnabled(true);
        }
    }
}
