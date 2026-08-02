package defpackage;

/* loaded from: classes9.dex */
public class pdh {
    /* JADX WARN: Multi-variable type inference failed */
    public boolean a(u0x u0xVar, u0x u0xVar2) {
        if (u0xVar2 == u0xVar) {
            return true;
        }
        if ((u0xVar2 instanceof u7u) && (u0xVar instanceof u7u)) {
            return jl40.l(((u7u) u0xVar2).getModel(), ((u7u) u0xVar).getModel());
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean b(u0x u0xVar, u0x u0xVar2) {
        if (u0xVar2 == u0xVar) {
            return true;
        }
        if (u0xVar2.getClass() != u0xVar.getClass()) {
            return false;
        }
        if ((u0xVar2 instanceof s7u) && (u0xVar instanceof s7u)) {
            return jl40.l(((s7u) u0xVar2).getItemId(), ((s7u) u0xVar).getItemId());
        }
        if ((u0xVar2 instanceof u7u) && (u0xVar instanceof u7u)) {
            return jl40.l(((u7u) u0xVar2).getModel(), ((u7u) u0xVar).getModel());
        }
        return true;
    }

    public Object c(u0x u0xVar, u0x u0xVar2) {
        return null;
    }
}
