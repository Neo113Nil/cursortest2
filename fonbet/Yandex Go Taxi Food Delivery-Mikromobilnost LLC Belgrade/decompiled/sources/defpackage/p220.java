package defpackage;

import com.yandex.messaging.MessengerEnvironment;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.a;
import ru.CryptoPro.JCP.Util.ClearCryptoProPrefs;

/* loaded from: classes15.dex */
public final class p220 implements k120 {
    public static final List a = scc.g(ClearCryptoProPrefs.COUNTRY, "com", "by", "ua", "com.tr", "com.am", "com.ge", "co.il", "lv", "lt", "ee", "kz", "az", "md", "kg", "tj", "tm", "uz", "fr");
    public static final ArrayList b = elb1.b("yandex.");
    public static final ArrayList c = elb1.b("messenger.360.yandex.");
    public static final ArrayList w = elb1.b("telemost.yandex.");
    public static final ArrayList x = elb1.b("telemost.360.yandex.");

    public final String a(MessengerEnvironment messengerEnvironment) {
        String[] strArr = (String[]) messengerEnvironment.c(this);
        if (strArr != null) {
            if (strArr.length == 0) {
                strArr = null;
            }
            if (strArr != null) {
                return strArr[0];
            }
        }
        return null;
    }

    @Override // defpackage.k120
    public final Object j() {
        return (String[]) a.m0(x, a.m0(w, a.o0(a.m0(c, a.n0(b, new String[]{"q.yandex-team.ru"})), "ya.ru"))).toArray(new String[0]);
    }

    @Override // defpackage.k120
    public final Object k() {
        return new String[]{"q.yandex-team.ru"};
    }

    @Override // defpackage.k120
    public final /* bridge */ /* synthetic */ Object l() {
        return null;
    }

    @Override // defpackage.k120
    public final Object m() {
        return (String[]) a.o0(a.n0(b, new String[]{"q.yandex-team.ru"}), "messenger.alpha.yandex.ru").toArray(new String[0]);
    }

    @Override // defpackage.k120
    public final Object o() {
        return (String[]) a.o0(b, "messenger.testing.yandex.ru").toArray(new String[0]);
    }

    @Override // defpackage.k120
    public final /* bridge */ /* synthetic */ Object s() {
        return null;
    }
}
