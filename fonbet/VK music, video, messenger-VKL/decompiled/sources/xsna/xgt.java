package xsna;

import java.util.ArrayList;

/* compiled from: GapComposer.kt */
/* loaded from: classes11.dex */
public final class xgt implements gzs<s640<Object, ldy>> {
    public final /* synthetic */ ygt b;

    public xgt(ygt ygtVar) {
        this.b = ygtVar;
    }

    @Override // xsna.gzs
    public final s640<Object, ldy> invoke() {
        ArrayList arrayList = this.b.a;
        ph50 ph50Var = new ph50(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ldy ldyVar = (ldy) arrayList.get(i);
            Object obj = ldyVar.b;
            int i2 = ldyVar.a;
            s640.a(ph50Var, obj != null ? new u0y(Integer.valueOf(i2), ldyVar.b) : Integer.valueOf(i2), ldyVar);
        }
        return new s640<>(ph50Var);
    }
}
