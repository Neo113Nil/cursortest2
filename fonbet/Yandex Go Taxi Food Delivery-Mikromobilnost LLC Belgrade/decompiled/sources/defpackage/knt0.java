package defpackage;

import java.util.Comparator;

/* loaded from: classes.dex */
public final class knt0 implements Comparator {
    public final /* synthetic */ ply0 a;
    public final /* synthetic */ rvo b;

    public knt0(lnt0 lnt0Var, ply0 ply0Var, rvo rvoVar) {
        this.a = ply0Var;
        this.b = rvoVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.a.j;
        rvo rvoVar = this.b;
        return Integer.valueOf(lnt0.c(i, (cfl) obj, rvoVar)).compareTo(Integer.valueOf(lnt0.c(i, (cfl) obj2, rvoVar)));
    }
}
