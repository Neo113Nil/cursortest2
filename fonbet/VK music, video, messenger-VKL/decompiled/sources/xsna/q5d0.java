package xsna;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PreviewStreamStateObserver.java */
/* loaded from: classes11.dex */
public final class q5d0 implements o0t<Void> {
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ ti9 c;
    public final /* synthetic */ androidx.camera.view.b d;

    public q5d0(androidx.camera.view.b bVar, ArrayList arrayList, ui9 ui9Var) {
        this.d = bVar;
        this.b = arrayList;
        this.c = ui9Var;
    }

    @Override // xsna.o0t
    public final void onFailure(Throwable th) {
        this.d.e = null;
        ArrayList arrayList = this.b;
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((ui9) this.c).f((gg9) it.next());
        }
        arrayList.clear();
    }

    @Override // xsna.o0t
    public final void onSuccess(@Nullable Void r2) {
        this.d.e = null;
    }
}
