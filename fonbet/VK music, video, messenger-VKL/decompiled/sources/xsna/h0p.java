package xsna;

import android.text.Editable;
import xsna.f0p;

/* compiled from: EditPlaylistContainer.java */
/* loaded from: classes3.dex */
public final class h0p extends rno0 {
    public final /* synthetic */ f0p.d b;

    public h0p(f0p.d dVar) {
        this.b = dVar;
    }

    @Override // xsna.rno0, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String obj = editable.toString();
        f0p.d dVar = this.b;
        dVar.n = obj;
        nwk nwkVar = dVar.o;
        if (nwkVar != null) {
            nwkVar.invoke();
        }
    }
}
