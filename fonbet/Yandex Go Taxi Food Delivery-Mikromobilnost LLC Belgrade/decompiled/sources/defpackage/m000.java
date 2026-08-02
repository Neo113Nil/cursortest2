package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.maas.api.analytics.MultiTransportChooseStationCardAnalytics$OpenReasonV2;
import ru.yandex.taxi.maas.api.deeplink.MaasMode;

/* loaded from: classes5.dex */
public final class m000 {
    public final MaasMode a;
    public final String b;
    public final String c;
    public final MultiTransportChooseStationCardAnalytics$OpenReasonV2 d;
    public final c0l0 e;

    static {
        v100 v100Var = MaasMode.Companion;
        MultiTransportChooseStationCardAnalytics$OpenReasonV2 multiTransportChooseStationCardAnalytics$OpenReasonV2 = MultiTransportChooseStationCardAnalytics$OpenReasonV2.ShortcutsMain;
    }

    public m000(MaasMode maasMode, String str, String str2, MultiTransportChooseStationCardAnalytics$OpenReasonV2 multiTransportChooseStationCardAnalytics$OpenReasonV2, c0l0 c0l0Var) {
        this.a = maasMode;
        this.b = str;
        this.c = str2;
        this.d = multiTransportChooseStationCardAnalytics$OpenReasonV2;
        this.e = c0l0Var;
    }

    public static m000 a(m000 m000Var, c0l0 c0l0Var) {
        MaasMode maasMode = m000Var.a;
        String str = m000Var.b;
        String str2 = m000Var.c;
        MultiTransportChooseStationCardAnalytics$OpenReasonV2 multiTransportChooseStationCardAnalytics$OpenReasonV2 = m000Var.d;
        m000Var.getClass();
        return new m000(maasMode, str, str2, multiTransportChooseStationCardAnalytics$OpenReasonV2, c0l0Var);
    }

    public final MaasMode b() {
        return this.a;
    }

    public final MultiTransportChooseStationCardAnalytics$OpenReasonV2 c() {
        return this.d;
    }

    public final c0l0 d() {
        return this.e;
    }

    public final String e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m000)) {
            return false;
        }
        m000 m000Var = (m000) obj;
        return this.a == m000Var.a && this.b.equals(m000Var.b) && this.c.equals(m000Var.c) && this.d == m000Var.d && jl40.l(this.e, m000Var.e);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31;
        c0l0 c0l0Var = this.e;
        return hashCode + (c0l0Var == null ? 0 : c0l0Var.hashCode());
    }

    public final String toString() {
        return "MaasDeeplinkData(maasMode=" + this.a + ", verticalId=" + this.b + ", coupon=" + this.c + ", openReason=" + this.d + ", route=" + this.e + Extension.C_BRAKE;
    }
}
