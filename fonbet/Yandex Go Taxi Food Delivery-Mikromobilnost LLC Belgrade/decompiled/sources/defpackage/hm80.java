package defpackage;

/* loaded from: classes13.dex */
public final class hm80 extends bys {
    @Override // defpackage.bys
    public final boolean j(Object obj, Object obj2) {
        fi80 fi80Var = (fi80) obj;
        fi80 fi80Var2 = (fi80) obj2;
        return ((fi80Var instanceof di80) && (fi80Var2 instanceof di80)) ? fi80Var.equals(fi80Var2) : ((fi80Var instanceof ei80) && (fi80Var2 instanceof ei80)) ? fi80Var.equals(fi80Var2) : ((fi80Var instanceof ci80) && (fi80Var2 instanceof ci80)) ? ((ci80) fi80Var).a == ((ci80) fi80Var2).a : jl40.l(fi80Var, fi80Var2);
    }

    @Override // defpackage.bys
    public final boolean k(Object obj, Object obj2) {
        fi80 fi80Var = (fi80) obj;
        fi80 fi80Var2 = (fi80) obj2;
        if ((fi80Var instanceof di80) && (fi80Var2 instanceof di80) && jl40.l(((di80) fi80Var).a, ((di80) fi80Var2).a)) {
            return true;
        }
        if ((fi80Var instanceof ei80) && (fi80Var2 instanceof ei80) && jl40.l(((ei80) fi80Var).a, ((ei80) fi80Var2).a)) {
            return true;
        }
        return (fi80Var instanceof ci80) && (fi80Var2 instanceof ci80);
    }
}
