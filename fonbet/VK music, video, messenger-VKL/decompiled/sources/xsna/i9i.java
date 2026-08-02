package xsna;

import android.os.Trace;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ComponentMonitor.java */
/* loaded from: classes.dex */
public final class i9i implements m9i {
    @Override // xsna.m9i
    public final List<i8i<?>> a(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (final i8i<?> i8iVar : componentRegistrar.getComponents()) {
            final String str = i8iVar.a;
            if (str != null) {
                i8iVar = new i8i<>(str, i8iVar.b, i8iVar.c, i8iVar.d, i8iVar.e, new b9i() { // from class: xsna.h9i
                    @Override // xsna.b9i
                    public final Object c(lcg0 lcg0Var) {
                        String str2 = str;
                        i8i i8iVar2 = i8iVar;
                        try {
                            Trace.beginSection(str2);
                            return i8iVar2.f.c(lcg0Var);
                        } finally {
                            Trace.endSection();
                        }
                    }
                }, i8iVar.g);
            }
            arrayList.add(i8iVar);
        }
        return arrayList;
    }
}
