package androidx.core.app;

import android.os.Bundle;
import android.os.Handler;
import android.webkit.CookieManager;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.push.NotificationsBuilderActivity;
import com.yandex.passport.internal.ui.account_upgrade.AccountUpgraderActivity;
import com.yandex.passport.internal.ui.sloth.plusdevices.ManagingPlusDevicesHelperActivity;
import defpackage.bvf0;
import defpackage.cvu0;
import defpackage.hs31;
import defpackage.qoi0;
import defpackage.sls;
import defpackage.zy11;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Pattern;
import kotlin.Pair;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.LicenseUtility;

/* loaded from: classes10.dex */
public final /* synthetic */ class a1 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ a1(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        String dequeueWork$lambda$0;
        hs31 hs31Var;
        hs31 notificationsBuilderViewModel_delegate$lambda$0;
        CookieManager cookieManager;
        hs31 viewModel_delegate$lambda$0;
        PassportProcessGlobalComponent a;
        Handler handler_delegate$lambda$2;
        zy11 zy11Var;
        switch (this.a) {
            case 0:
                dequeueWork$lambda$0 = SafeJobIntentService.dequeueWork$lambda$0();
                return dequeueWork$lambda$0;
            case 1:
                return "TaxiGenericWorkItem complete error";
            case 2:
                hs31Var = com.yandex.passport.internal.flags.presentation.o0.B;
                return hs31Var;
            case 3:
                return ConstantDeviceInfo.APP_PLATFORM;
            case 4:
                return Locale.getDefault().getLanguage();
            case 5:
                return "7.55.1";
            case 6:
                return "light";
            case 7:
                return Locale.getDefault().getLanguage();
            case 8:
                notificationsBuilderViewModel_delegate$lambda$0 = NotificationsBuilderActivity.notificationsBuilderViewModel_delegate$lambda$0();
                return notificationsBuilderViewModel_delegate$lambda$0;
            case 9:
                return bvf0.c(null);
            case 10:
                cookieManager = CookieManager.getInstance();
                return cookieManager;
            case 11:
                viewModel_delegate$lambda$0 = AccountUpgraderActivity.viewModel_delegate$lambda$0();
                return viewModel_delegate$lambda$0;
            case 12:
                a = com.yandex.passport.internal.di.a.a();
                return a;
            case 13:
                return "BouncerMasterChooser_" + UUID.randomUUID();
            case 14:
                return "BouncerChallenge_" + UUID.randomUUID();
            case 15:
                return androidx.compose.runtime.f.g(-1);
            case 16:
                return androidx.compose.runtime.f.j(Boolean.FALSE);
            case 17:
                return androidx.compose.runtime.f.j(qoi0.a(com.yandex.passport.internal.ui.bouncer.sloth.f.class).c() + LicenseUtility.SEPARATOR + UUID.randomUUID());
            case 18:
                return androidx.compose.runtime.f.j(Boolean.FALSE);
            case 19:
                return new Bundle(0);
            case 20:
                return androidx.compose.runtime.f.j("");
            case 21:
                handler_delegate$lambda$2 = ManagingPlusDevicesHelperActivity.handler_delegate$lambda$2();
                return handler_delegate$lambda$2;
            case 22:
                return androidx.compose.runtime.f.j(Boolean.FALSE);
            case 23:
                Map map = com.yandex.passport.internal.util.m.a;
                ArrayList arrayList = new ArrayList(map.size());
                for (Map.Entry entry : map.entrySet()) {
                    arrayList.add(new Pair(Pattern.compile("(.*\\.)?".concat(String.format(cvu0.v((String) entry.getKey(), Extension.DOT_CHAR, "\\.", false), Arrays.copyOf(new Object[]{".*"}, 1)))), entry.getValue()));
                }
                return kotlin.collections.b.s(arrayList);
            case 24:
                zy11Var = zy11.a;
                return zy11Var;
            case 25:
                return CookieManager.getInstance();
            default:
                return new Bundle();
        }
    }
}
