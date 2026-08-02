package defpackage;

import java.util.Enumeration;

/* loaded from: classes4.dex */
public final class f3 implements Enumeration {
    public int a = 0;
    public final /* synthetic */ i3 b;

    public f3(i3 i3Var) {
        this.b = i3Var;
    }

    @Override // java.util.Enumeration
    public final boolean hasMoreElements() {
        return this.a < this.b.a.length;
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        int i = this.a;
        a2[] a2VarArr = this.b.a;
        if (i < a2VarArr.length) {
            this.a = i + 1;
            return a2VarArr[i];
        }
        ny61.p();
        return null;
    }
}
