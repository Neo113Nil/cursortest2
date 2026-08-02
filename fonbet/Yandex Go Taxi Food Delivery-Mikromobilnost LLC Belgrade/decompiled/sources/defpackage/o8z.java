package defpackage;

/* loaded from: classes13.dex */
public final class o8z implements n8z {
    public final qqo a;
    public final cne0 b;

    public o8z(rqo rqoVar, dne0 dne0Var) {
        this.a = ((jbh) rqoVar).c(y7z.d);
        this.b = dne0Var.b();
    }

    public final boolean a() {
        qqo qqoVar = this.a;
        if (((y7z) qqoVar.b()).b) {
            return this.b.g("ru.yandex.taxi.map.overlay.diagnostic.IS_ENABLED", ((y7z) qqoVar.b()).c);
        }
        return false;
    }
}
