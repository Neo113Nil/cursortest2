package defpackage;

/* loaded from: classes8.dex */
public final class lmf0 {
    public final cne0 a;

    public lmf0(dne0 dne0Var) {
        this.a = dne0Var.a("ru.yandex.taxi.promocodes.PromocodeHelper");
    }

    public final synchronized oud a() {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return new oud(this.a.l("promocode", null), this.a.g("valid", false), this.a.c("canUseAnyway") ? Boolean.valueOf(this.a.g("canUseAnyway", false)) : null);
    }
}
