package defpackage;

/* loaded from: classes10.dex */
public final class anm extends puz {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ anm(int i, Object obj) {
        this.c = i;
        this.d = obj;
    }

    @Override // defpackage.puz
    public final Object a(vtz vtzVar) {
        int i = this.c;
        Object obj = this.d;
        switch (i) {
            case 0:
                Float f = (Float) ((puz) obj).a(vtzVar);
                if (f == null) {
                    return null;
                }
                return Float.valueOf(f.floatValue() * 2.55f);
            default:
                return ((hes0) obj).a(vtzVar);
        }
    }
}
