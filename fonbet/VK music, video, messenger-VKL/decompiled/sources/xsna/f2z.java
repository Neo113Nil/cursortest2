package xsna;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: LensFacingCameraFilter.java */
/* loaded from: classes11.dex */
public final class f2z implements pi9 {
    public int a;

    @Override // xsna.pi9
    @NonNull
    public final ArrayList a(@NonNull List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ti9 ti9Var = (ti9) it.next();
            obr.a("The camera info doesn't contain internal implementation.", ti9Var instanceof ui9);
            Integer b = ((ui9) ti9Var).b();
            if (b != null && b.intValue() == this.a) {
                arrayList.add(ti9Var);
            }
        }
        return arrayList;
    }
}
