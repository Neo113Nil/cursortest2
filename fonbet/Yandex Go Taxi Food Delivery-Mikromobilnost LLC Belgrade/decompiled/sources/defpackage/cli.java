package defpackage;

import ru.yandex.taxi.delivery.router.primary.a;

/* loaded from: classes5.dex */
public final class cli implements q8i {
    public final /* synthetic */ a a;
    public final /* synthetic */ hyf b;

    public cli(a aVar, hyf hyfVar) {
        this.a = aVar;
        this.b = hyfVar;
    }

    @Override // defpackage.sy60
    public final void a() {
        this.a.U(this.b);
    }

    @Override // defpackage.q8i
    public final void f() {
        this.a.S(this.b);
    }

    @Override // defpackage.q8i
    public final void onCancel() {
        this.a.U(this.b);
    }
}
