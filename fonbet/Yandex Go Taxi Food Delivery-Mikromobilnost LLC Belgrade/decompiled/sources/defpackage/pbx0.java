package defpackage;

import com.yandex.go.zone.dto.objects.BrandingCashbackStyle;
import ru.yandex.taxi.plus.badge.CashbackBadgeStyle;

/* loaded from: classes14.dex */
public final class pbx0 extends n15 {
    public final jgv A;
    public final k7x0 B;
    public final unx0 C;
    public final lgx0 D;
    public final i47 E;
    public final pdc F;
    public final ppw0 G;
    public final rqo H;
    public final kip I;
    public final mqv0 J;
    public final kgu K;
    public final niv0 L;
    public final bgx0 M;
    public final lze0 N;
    public final mj6 O;
    public final gdc P;
    public final gu11 x;
    public final qbx0 y;
    public final wk21 z;

    public pbx0(zuj0 zuj0Var, gu11 gu11Var, qbx0 qbx0Var, wk21 wk21Var, jgv jgvVar, k7x0 k7x0Var, unx0 unx0Var, lgx0 lgx0Var, i47 i47Var, pdc pdcVar, ppw0 ppw0Var, rqo rqoVar, kip kipVar, mqv0 mqv0Var, bg4 bg4Var, kgu kguVar, niv0 niv0Var, bgx0 bgx0Var, lze0 lze0Var, mj6 mj6Var) {
        super(zuj0Var);
        this.x = gu11Var;
        this.y = qbx0Var;
        this.z = wk21Var;
        this.A = jgvVar;
        this.B = k7x0Var;
        this.C = unx0Var;
        this.D = lgx0Var;
        this.E = i47Var;
        this.F = pdcVar;
        this.G = ppw0Var;
        this.H = rqoVar;
        this.I = kipVar;
        this.J = mqv0Var;
        this.K = kguVar;
        this.L = niv0Var;
        this.M = bgx0Var;
        this.N = lze0Var;
        this.O = mj6Var;
        this.P = new gdc(mqg0.component_gray_450_cold);
    }

    public static CashbackBadgeStyle n(BrandingCashbackStyle brandingCashbackStyle) {
        BrandingCashbackStyle.Style style = brandingCashbackStyle.a;
        int i = style == null ? -1 : obx0.c[style.ordinal()];
        if (i == 1) {
            return CashbackBadgeStyle.DARK_GRAY;
        }
        if (i == 2) {
            return CashbackBadgeStyle.LIGHT_GRAY;
        }
        if (i == 3) {
            return CashbackBadgeStyle.LIGHT_GRADIENT;
        }
        if (i == 4) {
            return CashbackBadgeStyle.DARK_GRADIENT;
        }
        if (i != 5) {
            return null;
        }
        return CashbackBadgeStyle.DISABLED;
    }

    public final q0f0 o(kdc kdcVar, boolean z) {
        return new q0f0(null, null, ((avj0) ((zuj0) this.b)).h(f0i0.address_tariff_unavailable), z ? 3 : 0, kdcVar, null, null, 227);
    }
}
