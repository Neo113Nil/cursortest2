package defpackage;

import com.yandex.go.taxi.tariffs.internal.repository.k;

/* loaded from: classes5.dex */
public final class k3i {
    public final wiq0 a;
    public final o3i b;

    public k3i(wiq0 wiq0Var, o3i o3iVar) {
        this.a = wiq0Var;
        this.b = o3iVar;
    }

    public static boolean a(pex0 pex0Var) {
        ati atiVar = pex0Var.Z;
        return (atiVar != null ? atiVar.j : null) != null;
    }

    public final boolean b() {
        ati atiVar;
        e6i e6iVar;
        pex0 m = ((k) this.a).m();
        boolean z = (m == null || (atiVar = m.Z) == null || (e6iVar = atiVar.j) == null) ? false : e6iVar.a;
        Boolean bool = (Boolean) this.b.b.getValue();
        return bool != null ? bool.booleanValue() : z;
    }
}
