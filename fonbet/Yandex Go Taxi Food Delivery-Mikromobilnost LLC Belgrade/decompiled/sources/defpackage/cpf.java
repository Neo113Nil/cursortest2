package defpackage;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import java.util.ArrayList;
import java.util.Iterator;
import ru.yandex.taxi.delivery.interactors.p;
import ru.yandex.taxi.tariffs.model.b;

/* loaded from: classes5.dex */
public final class cpf {
    public final p a;
    public final txe b;
    public final k3i c;
    public final ysi d;

    public cpf(j3i j3iVar, p pVar, txe txeVar, k3i k3iVar) {
        this.a = pVar;
        this.b = txeVar;
        this.c = k3iVar;
        this.d = j3iVar.b;
    }

    public final boolean a() {
        pex0 pex0Var;
        ati atiVar;
        pex0 pex0Var2;
        ati atiVar2;
        nuq0 nuq0Var;
        txe txeVar = this.b;
        wiq0 wiq0Var = txeVar.a;
        wiq0 wiq0Var2 = txeVar.a;
        fnx0 n = ((k) wiq0Var).n();
        e6i e6iVar = null;
        Boolean valueOf = (n == null || (pex0Var2 = n.c) == null || (atiVar2 = pex0Var2.Z) == null || (nuq0Var = atiVar2.d) == null) ? null : Boolean.valueOf(nuq0Var.a);
        pex0 m = ((k) wiq0Var2).m();
        if (m != null && (atiVar = m.Z) != null) {
            e6iVar = atiVar.j;
        }
        if (e6iVar != null && this.c.b()) {
            return true;
        }
        fnx0 n2 = ((k) wiq0Var2).n();
        if ((n2 == null || (pex0Var = n2.c) == null) ? false : b.i(pex0Var)) {
            if (valueOf != null) {
                return valueOf.booleanValue();
            }
            return true;
        }
        if (valueOf != null) {
            return valueOf.booleanValue();
        }
        ysi ysiVar = this.d;
        if (ysiVar == null) {
            return true;
        }
        ArrayList a = this.a.a();
        if (!a.isEmpty()) {
            Iterator it = a.iterator();
            while (it.hasNext()) {
                if (jl40.l(((hgi) it.next()).a, ysiVar.a)) {
                    return true;
                }
            }
        }
        return false;
    }
}
