package defpackage;

import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes2.dex */
public final class knz0 {
    public final sls a;
    public final nhj b;
    public final rwo c;

    public knz0(sls slsVar, nhj nhjVar, rwo rwoVar) {
        this.a = slsVar;
        this.b = nhjVar;
        this.c = rwoVar;
    }

    public final md51 a(String str, wj00 wj00Var) {
        snz0 snz0Var = new snz0((String) this.a.invoke(), new mnz0(null, null, null, null, str), wj00Var);
        iho f = vfc.f(qv90.a, 0, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Получение токенизированного CVN", "tokenize");
        nhj nhjVar = this.b;
        md51 a = hg91.a("tokenize", nhjVar.b, new bmh(21, nhjVar, snz0Var));
        ((y22) this.c).b(f, a);
        return a;
    }

    public final md51 b(mnz0 mnz0Var, wj00 wj00Var) {
        snz0 snz0Var = new snz0((String) this.a.invoke(), new mnz0(mnz0Var.a, mnz0Var.c, mnz0Var.b, mnz0Var.d, mnz0Var.e), wj00Var);
        String d = sfb1.d(mnz0Var.a);
        qv90.a.getClass();
        iho c = y891.c("tokenize", vfc.i(0, "value", d, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Получение токенизированных карточных данных для карты ".concat(d)));
        nhj nhjVar = this.b;
        md51 a = hg91.a("tokenize", nhjVar.b, new bmh(21, nhjVar, snz0Var));
        ((y22) this.c).b(c, a);
        return a;
    }
}
