package defpackage;

/* loaded from: classes15.dex */
public final class kbz0 extends mbz0 {
    public final long a;
    public final long b;

    public kbz0(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    @Override // defpackage.mbz0
    public final boolean a(kbz0 kbz0Var) {
        long j = kbz0Var.a;
        long j2 = this.a;
        if (j != j2) {
            if (j < j2) {
                ny61.g("earlier should be earlier than this.");
                return false;
            }
            long j3 = kbz0Var.b;
            if (j3 == 0) {
                ny61.g("attempt to compare oldest item with something older.");
                return false;
            }
            if (j3 != j2) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.mbz0
    public final boolean b(mbz0 mbz0Var) {
        return mbz0Var.a(this);
    }
}
