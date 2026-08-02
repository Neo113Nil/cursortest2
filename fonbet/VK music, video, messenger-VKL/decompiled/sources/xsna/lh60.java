package xsna;

import androidx.recyclerview.widget.m;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: NewsfeedDiffUtilCallback.kt */
/* loaded from: classes4.dex */
public final class lh60 extends m.b {
    public final ArrayList b;
    public final List<ol60> c;
    public final og50 d;
    public final c9x e;
    public final b1y f = new b1y((byte) 0, 7);

    public lh60(ArrayList arrayList, List list, og50 og50Var, c9x c9xVar) {
        this.b = arrayList;
        this.c = list;
        this.d = og50Var;
        this.e = c9xVar;
    }

    @Override // androidx.recyclerview.widget.m.b
    public final boolean areContentsTheSame(int i, int i2) {
        ol60 ol60Var = (ol60) this.b.get(i);
        ol60 ol60Var2 = this.c.get(i2);
        og50 og50Var = this.d;
        int a = og50Var.a(i);
        long j = a >= 0 ? og50Var.c[a] : 0L;
        c9x c9xVar = this.e;
        int a2 = c9xVar.a(i2);
        return j == (a2 >= 0 ? c9xVar.c[a2] : 0L) && Objects.equals(ol60Var, ol60Var2);
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.recyclerview.widget.m.b
    public final boolean areItemsTheSame(int i, int i2) {
        return ((Number) ((ol60) this.b.get(i)).g.getValue()).longValue() == ((Number) this.c.get(i2).g.getValue()).longValue();
    }

    @Override // androidx.recyclerview.widget.m.b
    public final Object getChangePayload(int i, int i2) {
        ol60 ol60Var = this.c.get(i2);
        b1y b1yVar = this.f;
        b1yVar.getClass();
        Object obj = ol60Var instanceof z1c0 ? ((z1c0) ol60Var).j : null;
        return obj == null ? b1yVar.c : obj;
    }

    @Override // androidx.recyclerview.widget.m.b
    public final int getNewListSize() {
        return this.c.size();
    }

    @Override // androidx.recyclerview.widget.m.b
    public final int getOldListSize() {
        return this.b.size();
    }
}
