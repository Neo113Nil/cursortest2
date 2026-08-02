package xsna;

import androidx.annotation.Nullable;
import java.util.Objects;

/* compiled from: TrackSelectorResult.java */
/* loaded from: classes12.dex */
public final class ehp0 {
    public final int a;
    public final wyf0[] b;
    public final d7q[] c;
    public final dip0 d;

    @Nullable
    public final Object e;

    public ehp0(wyf0[] wyf0VarArr, d7q[] d7qVarArr, dip0 dip0Var, @Nullable Object obj) {
        fxc0.p(wyf0VarArr.length == d7qVarArr.length);
        this.b = wyf0VarArr;
        this.c = (d7q[]) d7qVarArr.clone();
        this.d = dip0Var;
        this.e = obj;
        this.a = wyf0VarArr.length;
    }

    public final boolean a(@Nullable ehp0 ehp0Var, int i) {
        return ehp0Var != null && Objects.equals(this.b[i], ehp0Var.b[i]) && Objects.equals(this.c[i], ehp0Var.c[i]);
    }

    public final boolean b(int i) {
        return this.b[i] != null;
    }
}
