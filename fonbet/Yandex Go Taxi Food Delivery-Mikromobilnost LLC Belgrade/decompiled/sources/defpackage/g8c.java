package defpackage;

import kotlin.collections.a;

/* loaded from: classes7.dex */
public final class g8c extends mwb0 {
    public final s7c b;
    public final Object c;
    public final double d;
    public final double e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g8c(s7c s7cVar, Object obj, double d, double d2) {
        super(r0);
        Object P;
        if (s7cVar instanceof r7c) {
            P = a.P(((r7c) s7cVar).c);
        } else {
            if (!(s7cVar instanceof q7c)) {
                w511.b();
                throw null;
            }
            P = a.P(((r7c) a.P(((q7c) s7cVar).b)).c);
        }
        this.b = s7cVar;
        this.c = obj;
        this.d = d;
        this.e = d2;
    }

    @Override // defpackage.mwb0
    public final Object a() {
        return new u7c(this.c);
    }

    public final Object b() {
        return this.c;
    }
}
