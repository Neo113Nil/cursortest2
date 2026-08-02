package com.yandex.passport.internal.network;

import android.content.SharedPreferences;
import android.net.Uri;
import com.yandex.passport.api.PassportUrlType;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.data.network.k3;
import com.yandex.passport.internal.report.reporters.PassportInitReporter$Companion$UrlSource;
import com.yandex.payment.sdk.transportcards.nfc.model.WriteBlocks;
import defpackage.cvu0;
import defpackage.tje;
import defpackage.w511;
import defpackage.yhl;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.coroutines.EmptyCoroutineContext;
import ru.CryptoPro.JCP.Util.ClearCryptoProPrefs;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

/* loaded from: classes8.dex */
public final class l implements e {
    public static final com.yandex.passport.common.permission.b f = new com.yandex.passport.common.permission.b();
    public final com.yandex.passport.internal.properties.q a;
    public final com.yandex.passport.internal.config.h b;
    public final com.yandex.passport.internal.flags.j c;
    public final com.yandex.passport.common.resources.a d;
    public final com.yandex.passport.internal.config.template.g e;

    public l(com.yandex.passport.internal.properties.q qVar, com.yandex.passport.internal.config.h hVar, com.yandex.passport.internal.flags.j jVar, com.yandex.passport.common.resources.a aVar, com.yandex.passport.internal.config.template.g gVar) {
        this.a = qVar;
        this.b = hVar;
        this.c = jVar;
        this.d = aVar;
        this.e = gVar;
    }

    public static void b(Uri.Builder builder, com.yandex.passport.data.models.q qVar) {
        Iterator it = qVar.a().iterator();
        while (it.hasNext()) {
            builder.appendPath((String) it.next());
        }
        for (Pair pair : qVar.b()) {
            builder.appendQueryParameter((String) pair.c(), (String) pair.f());
        }
    }

    public static String d(String str) {
        if (!cvu0.x(str, "http", false)) {
            str = "https://".concat(str);
        }
        com.yandex.passport.common.url.b bVar = new com.yandex.passport.common.url.b(str);
        if (!com.yandex.passport.common.url.b.m(str)) {
            bVar = null;
        }
        if (bVar != null) {
            return bVar.a;
        }
        return null;
    }

    public static String e(Environment environment, Long l) {
        int i = h.a[environment.ordinal()];
        if (i != 1 && i != 2 && i != 3) {
            return ClearCryptoProPrefs.COUNTRY;
        }
        int i2 = h.d[com.yandex.passport.internal.ui.c.F(l).ordinal()];
        if (i2 == 1) {
            return ClearCryptoProPrefs.COUNTRY;
        }
        if (i2 == 2) {
            return "fi";
        }
        if (i2 == 3) {
            return "kz";
        }
        w511.b();
        return null;
    }

    public static String g(Environment environment) {
        int i = h.a[environment.ordinal()];
        if (i == 1) {
            return "https://passport-rc.yandex.%s";
        }
        if (i == 2) {
            return "https://passport-test.yandex.%s";
        }
        if (i == 3) {
            return "https://passport.yandex.%s";
        }
        if (i == 4) {
            return "https://passport.yandex-team.ru";
        }
        if (i == 5) {
            return "https://passport-test.yandex-team.ru";
        }
        yhl.d(environment, "Unknown environment ");
        return null;
    }

    public static String n(Environment environment, Long l, String str) {
        String str2;
        String e = e(environment, l);
        int i = g.a[environment.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    str2 = "https://passport-rc.yandex.%s";
                    return String.format(str2, Arrays.copyOf(new Object[]{e}, 1)).concat(str);
                }
                if (i != 4) {
                    if (i != 5) {
                        yhl.d(f, "Unknown environment ");
                        return null;
                    }
                }
            }
            str2 = "https://passport-test.yandex.%s";
            return String.format(str2, Arrays.copyOf(new Object[]{e}, 1)).concat(str);
        }
        str2 = "https://passport.yandex.%s";
        return String.format(str2, Arrays.copyOf(new Object[]{e}, 1)).concat(str);
    }

    public final String a(String str, Environment environment) {
        String str2;
        String h = h(environment, PassportUrlType.APP_LINK, com.yandex.passport.internal.flags.p.e);
        if (h != null) {
            return h;
        }
        int i = h.a[environment.ordinal()];
        if (i == 1) {
            str2 = "https://yx%s.oauth-rc.yandex.ru";
        } else if (i == 2) {
            str2 = "https://yx%s.oauth-test.yandex.ru";
        } else if (i != 3) {
            str2 = "";
            if (i != 4 && i != 5) {
                yhl.d(environment, "Unknown environment ");
                return null;
            }
        } else {
            str2 = "https://yx%s.oauth.yandex.ru";
        }
        return String.format(str2, Arrays.copyOf(new Object[]{str}, 1));
    }

    public final String c(Environment environment, Long l) {
        return j(environment, PassportUrlType.BACKEND, l, com.yandex.passport.internal.flags.p.a, new i(this, environment, l)).a;
    }

    public final String f(Environment environment, Long l, String str) {
        return j(environment, PassportUrlType.FRONTEND, l, com.yandex.passport.internal.flags.p.c, new k(this, environment, str, l)).a;
    }

    public final String h(Environment environment, PassportUrlType passportUrlType, com.yandex.passport.internal.flags.m mVar) {
        String m306getPHNIuII = ((UrlOverride) this.a.b.a.getValue()).m306getPHNIuII(new Pair<>(passportUrlType, com.yandex.passport.internal.util.p.y(environment)));
        if (m306getPHNIuII == null) {
            Iterator it = ((Iterable) this.c.b(mVar)).iterator();
            while (it.hasNext()) {
                String d = d((String) it.next());
                if (d != null) {
                    return d;
                }
            }
            return null;
        }
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "urlOverride " + ((Object) com.yandex.passport.common.url.b.l(m306getPHNIuII)), 8);
        }
        return m306getPHNIuII;
    }

    public final String i(Environment environment, long j, boolean z) {
        String f2;
        f2 = f(environment, Long.valueOf(j), null);
        return Uri.parse(f2).buildUpon().appendPath("profile").appendQueryParameter(ACSPConstants.STATUS, z ? WriteBlocks.OK : "cancel").build().toString();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:51:0x0095
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.yandex.passport.internal.network.f j(com.yandex.passport.common.core.Environment r9, com.yandex.passport.api.PassportUrlType r10, java.lang.Long r11, com.yandex.passport.internal.flags.m r12, defpackage.sls r13) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.passport.internal.network.l.j(com.yandex.passport.common.core.Environment, com.yandex.passport.api.PassportUrlType, java.lang.Long, com.yandex.passport.internal.flags.m, sls):com.yandex.passport.internal.network.f");
    }

    public final com.yandex.passport.data.models.r k() {
        return (com.yandex.passport.data.models.r) tje.Y(EmptyCoroutineContext.a, new BaseUrlDispatcherImpl$getUrlTemplateConfig$1(this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final f l(Environment environment, long j) {
        String str;
        String format;
        int i;
        SharedPreferences b;
        String str2 = "location_webam_yandex_host_" + j;
        com.yandex.passport.internal.config.h hVar = this.b;
        hVar.getClass();
        com.yandex.passport.internal.config.e eVar = hVar.a;
        String str3 = null;
        try {
            b = eVar.b(environment);
        } catch (Exception unused) {
        }
        if (b != null) {
            str = b.getString(str2, null);
            if (str != null) {
                String d = d(str.concat("/user-id"));
                com.yandex.passport.common.url.b bVar = d != null ? new com.yandex.passport.common.url.b(d) : null;
                if (bVar != null) {
                    str3 = bVar.a;
                }
            }
            format = String.format("https://yandex.%s/user-id", Arrays.copyOf(new Object[]{e(environment, Long.valueOf(j))}, 1));
            if (str3 != null) {
                format = str3;
            }
            i = h.a[environment.ordinal()];
            if (i != 1 || i == 2) {
                format = com.yandex.passport.common.url.b.b(format, new Pair("env", "test"));
            }
            if (str3 != null) {
                return new f(format, PassportInitReporter$Companion$UrlSource.DEFAULT_URL);
            }
            SharedPreferences b2 = eVar.b(environment);
            return new f(format, b2 != null ? b2.getBoolean("is_default_config_used", false) : false ? PassportInitReporter$Companion$UrlSource.DEFAULT_CONFIG : PassportInitReporter$Companion$UrlSource.CONFIG);
        }
        str = null;
        if (str != null) {
        }
        format = String.format("https://yandex.%s/user-id", Arrays.copyOf(new Object[]{e(environment, Long.valueOf(j))}, 1));
        if (str3 != null) {
        }
        i = h.a[environment.ordinal()];
        if (i != 1) {
        }
        format = com.yandex.passport.common.url.b.b(format, new Pair("env", "test"));
        if (str3 != null) {
        }
    }

    public final String m(Environment environment, Long l) {
        return j(environment, PassportUrlType.WEBAM, l, com.yandex.passport.internal.flags.p.b, new k3(this, environment, l)).a;
    }
}
