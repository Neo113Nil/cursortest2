package defpackage;

/* loaded from: classes9.dex */
public final class ggo extends igo {
    public final j18 c;
    public final /* synthetic */ kgo w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ggo(kgo kgoVar, long j, j18 j18Var) {
        super(j);
        this.w = kgoVar;
        this.c = j18Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.G(this.w, zy11.a);
    }

    @Override // defpackage.igo
    public final String toString() {
        return super.toString() + this.c;
    }
}
