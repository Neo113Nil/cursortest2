package defpackage;

import java.util.List;

/* loaded from: classes7.dex */
public final class ex71 extends tt71 {
    public final List j;

    public ex71(of81 of81Var, long j, long j2, long j3, long j4, List list, long j5, List list2, long j6, long j7) {
        super(of81Var, j, j2, j3, j4, list, j5, j6, j7);
        this.j = list2;
    }

    @Override // defpackage.tt71
    public final long b(long j) {
        return this.j.size();
    }

    @Override // defpackage.tt71
    public final of81 d(jw71 jw71Var, long j) {
        return (of81) this.j.get((int) (j - this.d));
    }

    @Override // defpackage.tt71
    public final boolean e() {
        return true;
    }
}
