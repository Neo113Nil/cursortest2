package com.yandex.passport.internal.core.announcing;

import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import com.yandex.auth.LegacyAccountType;
import com.yandex.passport.api.PassportAccountUpgradeStatus;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.data.network.core.m;
import com.yandex.passport.data.network.x0;
import com.yandex.passport.internal.network.response.ExternalApplicationPermissionsResult;
import com.yandex.passport.internal.ui.bouncer.roundabout.items.PlusDrawable;
import com.yandex.passport.internal.ui.webview.WebViewActivity;
import com.yandex.passport.sloth.a1;
import com.yandex.passport.sloth.command.data.SlothAccountType;
import defpackage.acx;
import defpackage.bvu0;
import defpackage.d6z;
import defpackage.evu0;
import defpackage.h0c;
import defpackage.h2f0;
import defpackage.tls;
import defpackage.tq90;
import defpackage.unr0;
import defpackage.w511;
import defpackage.zcx;
import defpackage.zy11;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import ru.CryptoPro.JCP.VMInspector.OpenList;
import ru.CryptoPro.JCP.tools.LicenseUtility;

/* loaded from: classes2.dex */
public final /* synthetic */ class f implements tls {
    public final /* synthetic */ int a;

    public /* synthetic */ f(int i) {
        this.a = i;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        List W;
        CharSequence title;
        zy11 logoDrawable$lambda$0;
        String str;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                return ((ResolveInfo) obj).activityInfo.packageName;
            case 1:
                return (String) obj;
            case 2:
                return unr0.l(OpenList.CHAR_QUOTE, "\"", (String) obj);
            case 3:
                Byte b = (Byte) obj;
                b.byteValue();
                return String.format("%02x", Arrays.copyOf(new Object[]{b}, 1));
            case 4:
                return String.valueOf(obj);
            case 5:
                Map.Entry entry = (Map.Entry) obj;
                return ((String) entry.getKey()) + LicenseUtility.SEPARATOR + ((String) entry.getValue());
            case 6:
                zcx zcxVar = m.a;
                zcxVar.getClass();
                return zcxVar.c((x0) obj, x0.Companion.serializer());
            case 7:
                int i2 = com.yandex.passport.internal.report.reporters.d.a[((PassportAccountUpgradeStatus) obj).ordinal()];
                if (i2 == 1) {
                    return "not_needed";
                }
                if (i2 == 2) {
                    return "needed";
                }
                if (i2 == 3) {
                    return "skipped";
                }
                if (i2 == 4) {
                    return "required";
                }
                w511.b();
                return null;
            case 8:
                h0c h0cVar = (h0c) obj;
                h0cVar.a(WebViewActivity.KEY_ENVIRONMENT, d6z.a("Environment", h2f0.o), (r3 & 8) == 0);
                h0cVar.a("value", d6z.a("Value", h2f0.m), (r3 & 8) == 0);
                return zy11Var;
            case 9:
                return zy11Var;
            case 10:
                return kotlin.collections.a.X((List) obj, ";", null, null, null, 62);
            case 11:
                W = evu0.W((String) obj, new String[]{";"}, (r2 & 4) != 0 ? 0 : 2);
                ArrayList arrayList = new ArrayList();
                Iterator it = W.iterator();
                while (it.hasNext()) {
                    Long m = bvu0.m(10, (String) it.next());
                    if (m != null) {
                        arrayList.add(m);
                    }
                }
                return arrayList;
            case 12:
                title = ((ExternalApplicationPermissionsResult.Permission) obj).getTitle();
                return title;
            case 13:
                ((com.lightside.animations.a) obj).a(0.0f, 1.0f);
                return zy11Var;
            case 14:
                return com.yandex.passport.internal.badges.a.b((com.yandex.passport.internal.badges.a) obj);
            case 15:
                return com.yandex.passport.internal.badges.a.b((com.yandex.passport.internal.badges.a) obj);
            case 16:
                return com.yandex.passport.internal.badges.a.b((com.yandex.passport.internal.badges.a) obj);
            case 17:
                logoDrawable$lambda$0 = PlusDrawable.logoDrawable$lambda$0((tq90) obj);
                return logoDrawable$lambda$0;
            case 18:
                return zy11Var;
            case 19:
                a1 a1Var = (a1) obj;
                com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "New SlothResult: " + a1Var, 8);
                }
                return zy11Var;
            case 20:
                return zy11Var;
            case 21:
                return Boolean.valueOf((((Resources) obj).getConfiguration().uiMode & 48) == 32);
            case 22:
                ((acx) obj).c = true;
                return zy11Var;
            case 23:
                ((acx) obj).c = true;
                return zy11Var;
            case 24:
                acx acxVar = (acx) obj;
                acxVar.c = true;
                acxVar.m = true;
                return zy11Var;
            case 25:
                Pair pair = (Pair) obj;
                Object c = pair.c();
                Object f = pair.f();
                if (f == null || (str = f.toString()) == null) {
                    str = "";
                }
                return new Pair(c, str);
            case 26:
                return Boolean.valueOf(evu0.J((CharSequence) ((Pair) obj).f()));
            case 27:
                Map.Entry entry2 = (Map.Entry) obj;
                return new Pair(entry2.getKey(), entry2.getValue());
            default:
                switch (com.yandex.passport.sloth.url.b.b[((SlothAccountType) obj).ordinal()]) {
                    case 1:
                        return "yandex";
                    case 2:
                        return "lite";
                    case 3:
                        return LegacyAccountType.STRING_SOCIAL;
                    case 4:
                        return "pdd";
                    case 5:
                        return "phone";
                    case 6:
                        return "mail";
                    case 7:
                        return "music_phonish";
                    case 8:
                        return "children";
                    case 9:
                        return StringUtils.UNDEFINED;
                    default:
                        w511.b();
                        return null;
                }
        }
    }
}
