package defpackage;

/* loaded from: classes6.dex */
public final class e3g implements xvf0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ i3g b;

    public /* synthetic */ e3g(i3g i3gVar, int i) {
        this.a = i;
        this.b = i3gVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        i3g i3gVar = this.b;
        switch (i) {
            case 0:
                return new gyc(i3gVar.d);
            default:
                return new zgf(7, i3gVar.d);
        }
    }
}
