package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final /* synthetic */ class nus implements vl6, jms {
    public final /* synthetic */ rus a;

    public nus(rus rusVar) {
        this.a = rusVar;
    }

    @Override // defpackage.vl6
    public final void c(String str, boolean z) {
        ListBuilder j;
        rus rusVar = this.a;
        r0 r0Var = rusVar.H;
        if (jl40.l(str, "show_all")) {
            rus.Ng(rusVar, "show_all", null, null, null, 14);
            r0 r0Var2 = rusVar.F;
            Boolean bool = Boolean.TRUE;
            r0Var2.getClass();
            r0Var2.m(null, bool);
            return;
        }
        if (z) {
            ListBuilder a = rcc.a();
            a.addAll((Collection) r0Var.getValue());
            a.add(str);
            j = a.j();
        } else {
            ListBuilder a2 = rcc.a();
            Iterable iterable = (Iterable) r0Var.getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj : iterable) {
                if (!jl40.l((String) obj, str)) {
                    arrayList.add(obj);
                }
            }
            a2.addAll(arrayList);
            j = a2.j();
        }
        r0Var.l(j);
        rusVar.x.l = (List) r0Var.getValue();
        rus.Ng(rusVar, "filter", null, z ? str : null, null, 8);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof vl6) && (obj instanceof jms)) {
            return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        return new FunctionReferenceImpl(2, this.a, rus.class, "setSelectedService", "setSelectedService(Ljava/lang/String;Z)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
