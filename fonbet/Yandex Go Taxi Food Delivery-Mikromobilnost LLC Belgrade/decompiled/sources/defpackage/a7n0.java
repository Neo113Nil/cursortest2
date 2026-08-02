package defpackage;

/* loaded from: classes13.dex */
public final class a7n0 implements kzn0 {
    public final /* synthetic */ uem a;
    public final /* synthetic */ uem b;

    public a7n0(uem uemVar, uem uemVar2) {
        this.a = uemVar;
        this.b = uemVar2;
    }

    @Override // defpackage.sy60
    public final void a() {
        this.b.invoke();
    }

    @Override // defpackage.kzn0
    public final void onCancel() {
        this.b.invoke();
    }

    @Override // defpackage.kzn0
    public final void v0() {
        this.a.invoke();
    }
}
