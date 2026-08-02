package defpackage;

import java.util.AbstractList;

/* loaded from: classes2.dex */
public final class lqw extends AbstractList {
    public final jqw a;
    public final kqw b;

    public lqw(jqw jqwVar, kqw kqwVar) {
        this.a = jqwVar;
        this.b = kqwVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.b.a(((o5w) this.a).e(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }
}
