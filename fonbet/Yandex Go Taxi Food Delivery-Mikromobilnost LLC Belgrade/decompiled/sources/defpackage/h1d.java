package defpackage;

import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class h1d implements i1d {
    @Override // defpackage.i1d
    public final List c(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (j0d j0dVar : componentRegistrar.getComponents()) {
            String str = j0dVar.a;
            if (str != null) {
                j0dVar = new j0d(str, j0dVar.b, j0dVar.c, j0dVar.d, j0dVar.e, new e89(1, str, j0dVar), j0dVar.g);
            }
            arrayList.add(j0dVar);
        }
        return arrayList;
    }
}
