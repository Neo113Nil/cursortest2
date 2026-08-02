package xsna;

import java.util.List;

/* compiled from: LazyGrid.kt */
/* loaded from: classes11.dex */
public final class hry extends pry {
    public final /* synthetic */ boolean g;
    public final /* synthetic */ ury h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hry(boolean z, ury uryVar, int i, int i2, gry gryVar, xry xryVar) {
        super(z, uryVar, i, i2, gryVar, xryVar);
        this.g = z;
        this.h = uryVar;
    }

    @Override // xsna.pry
    public final ory b(int i, nry[] nryVarArr, List<tfu> list, int i2) {
        return new ory(i, nryVarArr, this.h, list, this.g, i2);
    }
}
