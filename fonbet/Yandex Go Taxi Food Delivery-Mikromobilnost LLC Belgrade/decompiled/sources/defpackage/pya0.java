package defpackage;

import com.yandex.alicekit.core.permissions.Permission;
import com.yandex.alicekit.core.permissions.b;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.EmptySet;

/* loaded from: classes11.dex */
public final class pya0 implements nza0 {
    public final hza0 a;

    public pya0(b bVar, hza0 hza0Var) {
        this.a = hza0Var;
    }

    @Override // defpackage.nza0
    public final boolean a() {
        return true;
    }

    @Override // defpackage.nza0
    public final boolean b(Permission permission) {
        return false;
    }

    @Override // defpackage.nza0
    public final Set c() {
        return EmptySet.a;
    }

    @Override // defpackage.nza0
    public final boolean d(Permission permission) {
        Iterator it = b.a(this.a).iterator();
        int i = 0;
        while (true) {
            s5r s5rVar = (s5r) it;
            if (!s5rVar.hasNext()) {
                i = -1;
                break;
            }
            Object next = s5rVar.next();
            if (i < 0) {
                scc.m();
                throw null;
            }
            if (jl40.l(permission, next)) {
                break;
            }
            i++;
        }
        return i >= 0;
    }
}
