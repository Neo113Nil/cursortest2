package defpackage;

import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes2.dex */
public final class aia0 {
    public final bt5 a;
    public final kvt b;
    public final rwo c;
    public final y9a0 d;
    public final rg7 e;
    public final boolean f;
    public md51 g;

    public aia0(bt5 bt5Var, xvt xvtVar, rwo rwoVar, y9a0 y9a0Var, rg7 rg7Var, boolean z) {
        this.a = bt5Var;
        this.b = xvtVar;
        this.c = rwoVar;
        this.d = y9a0Var;
        this.e = rg7Var;
        this.f = z;
        this.g = ymx.j(bt5Var.c, new l15(bt5Var, z, rg7Var, false, 1), null, 5);
    }

    public final void a() {
        bt5 bt5Var = this.a;
        if (bt5Var.n != null) {
            rwo rwoVar = bt5Var.g;
            qv90.a.getClass();
            wj00 wj00Var = new wj00(0);
            wj00Var.i("in_progress", true);
            wj00Var.k(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Пользователь / сервис закрыл форму до начала оплаты");
            ((y22) rwoVar).a(y891.c("cancelled_payment", wj00Var));
            bt5Var.n.a = true;
            bt5Var.n = null;
        }
    }
}
