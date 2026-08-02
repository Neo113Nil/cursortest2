package defpackage;

import android.os.Build;
import android.os.Looper;
import androidx.fragment.app.FragmentActivity;
import com.yandex.passport.api.exception.PassportRuntimeUnknownException;
import com.yandex.passport.api.h;
import com.yandex.passport.api.k2;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.common.logger.c;
import com.yandex.passport.internal.account.PassportAccountImpl;
import com.yandex.passport.internal.entities.Filter;
import com.yandex.passport.internal.entities.TurboAuthParams;
import com.yandex.passport.internal.impl.p;
import com.yandex.passport.internal.methods.d1;
import com.yandex.passport.internal.methods.requester.CommonRequesterKt$requestMethodBlocking$1;
import com.yandex.passport.internal.methods.requester.f;
import com.yandex.passport.internal.properties.AuthorizationUrlProperties;
import com.yandex.passport.internal.properties.LoginProperties;
import com.yandex.payment.sdk.core.data.PersonalInfo;
import com.yandex.payment.sdk.transportcards.ui.TransportCardsActivity;
import java.net.URL;
import java.util.Arrays;
import kotlin.Result;
import kotlin.a;
import ru.CryptoPro.JCP.Util.ClearCryptoProPrefs;

/* loaded from: classes15.dex */
public abstract class np90 {
    public static final i3y a = a.a(new nk90(3));

    public static String a(String str, TransportCardsActivity transportCardsActivity) {
        k2 uid;
        if (b() == null) {
            return str;
        }
        String str2 = ClearCryptoProPrefs.COUNTRY;
        try {
            String host = new URL(str).getHost();
            String e0 = evu0.e0('.', host, "");
            if (e0.length() > 0) {
                if (!host.equalsIgnoreCase(e0)) {
                    str2 = e0;
                }
            }
        } catch (Exception unused) {
        }
        p a2 = h.a(transportCardsActivity);
        a2.x();
        try {
            f fVar = a2.d;
            d1 d1Var = d1.b;
            lfx[] lfxVarArr = new lfx[0];
            if (!"robolectric".equals(Build.FINGERPRINT)) {
                Looper.getMainLooper();
                Looper.myLooper();
            }
            Object h = com.yandex.passport.common.util.a.h(new CommonRequesterKt$requestMethodBlocking$1(fVar, d1Var, null));
            lfx[] lfxVarArr2 = (lfx[]) Arrays.copyOf(lfxVarArr, 0);
            Throwable a3 = Result.a(h);
            if (a3 == null) {
                PassportAccountImpl passportAccountImpl = (PassportAccountImpl) h;
                if (passportAccountImpl == null || (uid = passportAccountImpl.getUid()) == null) {
                    return str;
                }
                AuthorizationUrlProperties.a aVar = new AuthorizationUrlProperties.a();
                aVar.a = uid;
                aVar.c = str2;
                aVar.b = str;
                return a2.b(aVar.a());
            }
            for (lfx lfxVar : lfxVarArr2) {
                if (((g0c) lfxVar).e(a3)) {
                    throw a3;
                }
            }
            c cVar = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.b(LogLevel.ERROR, null, "catch non-PassportException from provider", a3);
            }
            throw new PassportRuntimeUnknownException(a3);
        } catch (RuntimeException e) {
            a2.k(e);
            throw e;
        }
    }

    public static cn90 b() {
        sls slsVar = (sls) a.getValue();
        if (slsVar != null) {
            return (cn90) slsVar.invoke();
        }
        return null;
    }

    public static void c(FragmentActivity fragmentActivity, cn90 cn90Var, PersonalInfo personalInfo, boolean z) {
        String phone = personalInfo.getPhone();
        String email = personalInfo.getEmail();
        String firstName = personalInfo.getFirstName();
        String lastName = personalInfo.getLastName();
        Filter.a aVar = new Filter.a();
        aVar.e(z ? h.c : h.a);
        Filter a2 = aVar.a();
        LoginProperties.a aVar2 = new LoginProperties.a();
        aVar2.j(new TurboAuthParams(com.yandex.passport.common.util.a.e(phone), com.yandex.passport.common.util.a.e(email), com.yandex.passport.common.util.a.e(firstName), com.yandex.passport.common.util.a.e(lastName)));
        aVar2.g(a2);
        fragmentActivity.startActivityForResult(h.a(fragmentActivity).e.a.i(fragmentActivity, aVar2.a()), 38215);
    }
}
