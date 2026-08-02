package defpackage;

/* loaded from: classes10.dex */
public final class j9h extends a45 {
    public final /* synthetic */ int w;
    public final Object x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j9h(oxt0 oxt0Var, int i) {
        super(i, oxt0Var.k - 1);
        this.w = 1;
        this.x = oxt0Var;
    }

    @Override // defpackage.jb10
    public final long a() {
        int i = this.w;
        Object obj = this.x;
        switch (i) {
            case 0:
                b();
                return ((i9h) obj).f(this.c);
            case 1:
                return ((oxt0) obj).c((int) this.c) + c();
            default:
                b();
                return ((i9h) obj).f(this.c);
        }
    }

    @Override // defpackage.jb10
    public final long c() {
        int i = this.w;
        Object obj = this.x;
        switch (i) {
            case 0:
                b();
                return ((i9h) obj).g(this.c);
            case 1:
                b();
                return ((oxt0) obj).o[(int) this.c];
            default:
                b();
                return ((i9h) obj).g(this.c);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j9h(long j, long j2, int i, Object obj) {
        super(j, j2);
        this.w = i;
        this.x = obj;
    }
}
