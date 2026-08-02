package com.yandex.passport.internal.properties;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.SigningInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.lightside.animations.DslAnimatorBuilder;
import com.yandex.passport.api.PassportAccountType;
import com.yandex.passport.api.PassportLoginAction;
import com.yandex.passport.api.PassportTheme;
import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.api.d2;
import com.yandex.passport.api.e2;
import com.yandex.passport.api.e3;
import com.yandex.passport.api.f2;
import com.yandex.passport.api.i2;
import com.yandex.passport.api.impl.PassportEnvironmentImpl;
import com.yandex.passport.api.k2;
import com.yandex.passport.api.k3;
import com.yandex.passport.api.l2;
import com.yandex.passport.api.m3;
import com.yandex.passport.api.u1;
import com.yandex.passport.api.z0;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.common.properties.CommonWebProperties;
import com.yandex.passport.common.ui.AppTheme;
import com.yandex.passport.internal.AccountRow;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.account.PassportAccountImpl;
import com.yandex.passport.internal.entities.Filter;
import com.yandex.passport.internal.properties.SocialApplicationBindProperties;
import com.yandex.passport.internal.properties.u;
import com.yandex.passport.internal.push.PicturePayload;
import com.yandex.passport.internal.push.PushPayload;
import com.yandex.passport.internal.push.PushPayloadHolder;
import com.yandex.passport.internal.report.jd;
import com.yandex.passport.internal.report.md;
import com.yandex.passport.internal.report.reporters.w0;
import com.yandex.passport.internal.report.yd;
import com.yandex.passport.internal.sso.AccountAction$LastAction;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import com.yandex.passport.internal.ui.bouncer.model.BouncerUiState$SocialAction;
import com.yandex.passport.internal.ui.bouncer.model.a2;
import com.yandex.passport.internal.ui.bouncer.model.b2;
import com.yandex.passport.internal.ui.bouncer.model.c2;
import com.yandex.passport.internal.ui.bouncer.model.g1;
import com.yandex.passport.internal.ui.bouncer.model.s1;
import com.yandex.passport.internal.ui.bouncer.model.t1;
import com.yandex.passport.internal.ui.bouncer.model.v1;
import com.yandex.passport.internal.ui.bouncer.model.w1;
import com.yandex.passport.internal.ui.bouncer.model.x1;
import com.yandex.passport.internal.ui.bouncer.model.y1;
import com.yandex.passport.internal.ui.bouncer.model.z1;
import com.yandex.passport.internal.ui.challenge.logout.bottomsheet.b1;
import com.yandex.passport.internal.ui.challenge.logout.bottomsheet.r1;
import com.yandex.passport.internal.ui.domik.DomikActivity;
import com.yandex.passport.sloth.command.data.SlothAccountType;
import com.yandex.passport.sloth.data.SlothLoginAction;
import com.yandex.passport.sloth.data.SlothParams;
import com.yandex.passport.sloth.data.SlothTheme;
import com.yandex.passport.sloth.dependencies.SlothLoginProperties;
import com.yandex.passport.sloth.m0;
import defpackage.a7u0;
import defpackage.agc;
import defpackage.aii0;
import defpackage.an91;
import defpackage.awk0;
import defpackage.b64;
import defpackage.bp1;
import defpackage.bq11;
import defpackage.bts;
import defpackage.c530;
import defpackage.cma1;
import defpackage.cvu0;
import defpackage.dgc;
import defpackage.did;
import defpackage.dmw0;
import defpackage.eq11;
import defpackage.ety0;
import defpackage.evu0;
import defpackage.f530;
import defpackage.f5z;
import defpackage.fid;
import defpackage.g8e;
import defpackage.gw00;
import defpackage.hc0;
import defpackage.hz6;
import defpackage.jl40;
import defpackage.kbs;
import defpackage.khl0;
import defpackage.kx91;
import defpackage.l690;
import defpackage.ldc;
import defpackage.lhl0;
import defpackage.ljs0;
import defpackage.lr20;
import defpackage.ly3;
import defpackage.ny61;
import defpackage.o430;
import defpackage.ohd;
import defpackage.ooc;
import defpackage.oz40;
import defpackage.q7u;
import defpackage.qic;
import defpackage.qje;
import defpackage.qoi0;
import defpackage.r1b0;
import defpackage.rs31;
import defpackage.rz6;
import defpackage.scc;
import defpackage.sej;
import defpackage.sic;
import defpackage.sls;
import defpackage.spb1;
import defpackage.t7a;
import defpackage.tcc;
import defpackage.tls;
import defpackage.vg10;
import defpackage.vng;
import defpackage.vqy0;
import defpackage.w511;
import defpackage.w8f;
import defpackage.wir0;
import defpackage.wls;
import defpackage.wwg;
import defpackage.x4c;
import defpackage.xvq;
import defpackage.ym1;
import defpackage.yxs0;
import defpackage.zir0;
import defpackage.zx40;
import defpackage.zy11;
import io.appmetrica.analytics.IReporterYandex;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.io.ByteArrayInputStream;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.tools.LicenseUtility;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes15.dex */
public abstract class u {
    public static final boolean A(PushPayload pushPayload) {
        Long expireAt = pushPayload.getExpireAt();
        return System.currentTimeMillis() < (expireAt != null ? expireAt.longValue() : ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED);
    }

    public static boolean B(Bundle bundle, String str) {
        return cvu0.x(str, "1087931301371", false) || cvu0.x(str, "410800666107", false) || bundle.containsKey("passp_am_proto");
    }

    public static String C(int i, String str) {
        return str + LicenseUtility.SEPARATOR + i;
    }

    public static ArrayList D(Bundle bundle) {
        AccountRow accountRow;
        ArrayList arrayList = new ArrayList();
        int i = bundle.getInt("size");
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = com.yandex.passport.internal.sso.a.e;
            com.yandex.passport.internal.sso.a p = p(bundle.getString(C(i2, "uid")), bundle.getString(C(i2, "last-action")), bundle.getInt(C(i2, "last-action-timestamp")), bundle.getLong(C(i2, "last-action-local-timestamp")));
            Iterator it = com.yandex.passport.internal.sso.b.c.iterator();
            while (true) {
                if (it.hasNext()) {
                    String str = (String) it.next();
                    Set set = com.yandex.passport.internal.sso.b.c;
                    if (!bundle.containsKey(C(i2, str))) {
                        accountRow = null;
                        break;
                    }
                } else {
                    String string = bundle.getString(C(i2, "name"));
                    if (string == null) {
                        vg10.d("no account name for ".concat(C(i2, "name")));
                        return null;
                    }
                    accountRow = new AccountRow(string, bundle.getString(C(i2, AuthSdkActivity.RESPONSE_TYPE_TOKEN)), bundle.getString(C(i2, "uid")), bundle.getString(C(i2, "user-info-body")), bundle.getString(C(i2, "user-info-meta")), bundle.getString(C(i2, "stash-body")), null, null, null);
                }
            }
            com.yandex.passport.internal.sso.b bVar = p == null ? null : new com.yandex.passport.internal.sso.b(p, accountRow);
            if (bVar == null) {
                com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "Error while unpacking bundle, continue: " + bundle, 8);
                }
            } else {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    public static Bundle E(ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putInt("size", arrayList.size());
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = i + 1;
            com.yandex.passport.internal.sso.b bVar = (com.yandex.passport.internal.sso.b) it.next();
            bVar.getClass();
            Bundle bundle2 = new Bundle();
            Set set = com.yandex.passport.internal.sso.b.c;
            String C = C(i, "uid");
            com.yandex.passport.internal.sso.a aVar = bVar.a;
            Uid uid = aVar.a;
            StringBuilder sb = new StringBuilder();
            sb.append(uid.getEnvironment().getInteger());
            sb.append(':');
            sb.append(uid.getValue());
            bundle2.putString(C, sb.toString());
            bundle2.putInt(C(i, "last-action-timestamp"), aVar.b);
            bundle2.putString(C(i, "last-action"), aVar.c.name());
            bundle2.putLong(C(i, "last-action-local-timestamp"), aVar.d);
            AccountRow accountRow = bVar.b;
            if (accountRow != null) {
                bundle2.putString(C(i, "name"), accountRow.name);
                bundle2.putString(C(i, AuthSdkActivity.RESPONSE_TYPE_TOKEN), accountRow.masterTokenValue);
                bundle2.putString(C(i, "user-info-body"), accountRow.userInfoBody);
                bundle2.putString(C(i, "user-info-meta"), accountRow.userInfoMeta);
                bundle2.putString(C(i, "stash-body"), accountRow.stashBody);
            }
            bundle.putAll(bundle2);
            i = i2;
        }
        return bundle;
    }

    public static void F(IReporterYandex iReporterYandex, Bundle bundle, long j, PushPayloadHolder pushPayloadHolder) {
        String str;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            str = bundle.getString("push_id");
        } catch (Exception unused) {
            str = null;
        }
        if (str == null) {
            str = "unknown";
        }
        iReporterYandex.reportEvent("push_loading_time", kotlin.collections.b.i(new Pair("push_id", str), new Pair("host_process_started", Long.valueOf(j)), new Pair("passport_process_started", Long.valueOf(pushPayloadHolder.getPassportProcessStarted())), new Pair("passport_process_finished", Long.valueOf(pushPayloadHolder.getPassportProcessFinished())), new Pair("host_process_finished", Long.valueOf(elapsedRealtimeNanos))));
    }

    public static void G(Bundle bundle) {
        if (bundle.containsKey("error-message")) {
            kbs.g(bundle.getString("error-message"));
        }
    }

    public static final com.yandex.passport.api.u H(m0 m0Var) {
        PassportUidImpl A = com.yandex.passport.internal.util.p.A(m0Var.b);
        PassportAccountImpl g0 = com.yandex.passport.internal.a0.g0((ModernAccount) m0Var.a);
        PassportLoginAction U = U(m0Var.c);
        String str = m0Var.d;
        if (str == null) {
            str = null;
        }
        return new com.yandex.passport.api.u(A, g0, U, str, null);
    }

    public static Bundle I(Map map) {
        Bundle bundle = new Bundle(map.size());
        for (Map.Entry entry : map.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        return bundle;
    }

    public static final CommonWebProperties J(WebAmProperties webAmProperties, boolean z) {
        com.yandex.passport.common.properties.a aVar = CommonWebProperties.Companion;
        Boolean valueOf = webAmProperties != null ? Boolean.valueOf(webAmProperties.getIgnoreBackToNativeFallback()) : null;
        String testId = webAmProperties != null ? webAmProperties.getTestId() : null;
        Boolean valueOf2 = webAmProperties != null ? Boolean.valueOf(webAmProperties.isClearCookiesBeforeAuthorization()) : null;
        aVar.getClass();
        return new CommonWebProperties(valueOf != null ? valueOf.booleanValue() : false, testId, valueOf2 != null ? valueOf2.booleanValue() : false, z);
    }

    public static final SocialApplicationBindProperties K(d2 d2Var) {
        PassportUidImpl passportUidImpl;
        SocialApplicationBindProperties.Companion.getClass();
        SocialApplicationBindProperties.a aVar = new SocialApplicationBindProperties.a();
        aVar.a = d2Var.getFilter();
        aVar.b = d2Var.getTheme();
        aVar.c = d2Var.getUid();
        aVar.w = d2Var.getApplicationName();
        aVar.x = d2Var.getClientId();
        z0 z0Var = aVar.a;
        if (z0Var == null) {
            ny61.r("You must set filter");
            return null;
        }
        if (aVar.w == null) {
            ny61.r("You must set applicationName");
            return null;
        }
        Filter.Companion.getClass();
        Filter a = com.yandex.passport.internal.entities.f.a(z0Var);
        PassportTheme passportTheme = aVar.b;
        k2 k2Var = aVar.c;
        if (k2Var != null) {
            PassportUidImpl.Companion.getClass();
            passportUidImpl = l2.a(k2Var);
        } else {
            passportUidImpl = null;
        }
        String str = aVar.w;
        return new SocialApplicationBindProperties(a, passportTheme, passportUidImpl, str != null ? str : null, aVar.x);
    }

    public static final SocialBindProperties L(e2 e2Var) {
        SocialBindProperties.Companion.getClass();
        com.yandex.passport.internal.entities.f fVar = Filter.Companion;
        z0 filter = e2Var.getFilter();
        fVar.getClass();
        Filter a = com.yandex.passport.internal.entities.f.a(filter);
        PassportTheme theme = e2Var.getTheme();
        k2 uid = e2Var.getUid();
        PassportUidImpl.Companion.getClass();
        return new SocialBindProperties(a, theme, l2.a(uid), e2Var.getSocialBindingConfiguration());
    }

    public static final SocialRegistrationProperties M(f2 f2Var) {
        SocialRegistrationProperties.Companion.getClass();
        return w.b(f2Var);
    }

    public static final TurboAppAuthProperties N(i2 i2Var) {
        TurboAppAuthProperties.Companion.getClass();
        PassportTheme theme = i2Var.getTheme();
        PassportEnvironmentImpl from = PassportEnvironmentImpl.from(i2Var.getEnvironment());
        k2 uid = i2Var.getUid();
        PassportUidImpl.Companion.getClass();
        return new TurboAppAuthProperties(theme, from, l2.a(uid), i2Var.getClientId(), i2Var.getTurboAppIdentifier(), i2Var.getScopes());
    }

    public static final UserMenuProperties O(e3 e3Var) {
        UserMenuProperties.Companion.getClass();
        PassportTheme theme = e3Var.getTheme();
        PassportEnvironmentImpl from = PassportEnvironmentImpl.from(e3Var.getEnvironment());
        u1 progressProperties = e3Var.getProgressProperties();
        ProgressPropertiesImpl.Companion.getClass();
        return new UserMenuProperties(theme, from, m.b(progressProperties), e3Var.getCustomWebParams());
    }

    public static final VisualProperties P(k3 k3Var) {
        VisualProperties.Companion.getClass();
        return b0.a(k3Var);
    }

    public static final WebAmProperties Q(m3 m3Var) {
        WebAmProperties.Companion.getClass();
        return d0.a(m3Var);
    }

    public static final List R(PicturePayload picturePayload) {
        return scc.g(new md(picturePayload.getPlatform(), 9), new com.yandex.passport.internal.report.f("pushService", picturePayload.getPushService()), new com.yandex.passport.internal.report.f("eventName", String.valueOf(picturePayload.getEventName())), new com.yandex.passport.internal.report.f(ClidProvider.TIMESTAMP, String.valueOf(picturePayload.getTimestamp())), new jd(Long.valueOf(picturePayload.getUid())), new md(picturePayload.getPushId(), 7), new com.yandex.passport.internal.report.f("isSilent", String.valueOf(picturePayload.isSilent())), new yd(picturePayload.getTrackId(), 12), new com.yandex.passport.internal.report.f("expireAt", String.valueOf(picturePayload.getExpireAt())));
    }

    public static final List S(PushPayload pushPayload) {
        return scc.g(new md(pushPayload.getPlatform(), 9), new com.yandex.passport.internal.report.f("passpAmProto", String.valueOf(pushPayload.getPasspAmProto())), new com.yandex.passport.internal.report.f("pushService", String.valueOf(pushPayload.getPushService())), new com.yandex.passport.internal.report.f("eventName", String.valueOf(pushPayload.getEventName())), new com.yandex.passport.internal.report.f(ClidProvider.TIMESTAMP, String.valueOf(pushPayload.getTimestamp())), new jd(Long.valueOf(pushPayload.getUid())), new md(pushPayload.getPushId(), 7), new com.yandex.passport.internal.report.f("minAmVersion", String.valueOf(pushPayload.getMinAmVersion())), new com.yandex.passport.internal.report.f("isSilent", String.valueOf(pushPayload.isSilent())), new com.yandex.passport.internal.report.f("requireWebAuth", String.valueOf(pushPayload.getRequireWebAuth())), new yd(pushPayload.getTrackId(), 12), new com.yandex.passport.internal.report.f("showCodeInNotification", String.valueOf(pushPayload.getShowCodeInNotification())), new com.yandex.passport.internal.report.f("expireAt", String.valueOf(pushPayload.getExpireAt())));
    }

    public static final String T(AccountAction$LastAction accountAction$LastAction) {
        int i = com.yandex.passport.internal.sso.announcing.d.a[accountAction$LastAction.ordinal()];
        if (i == 1) {
            return "add";
        }
        if (i == 2) {
            return "delete";
        }
        w511.b();
        return null;
    }

    public static final PassportLoginAction U(SlothLoginAction slothLoginAction) {
        switch (com.yandex.passport.internal.sloth.g.a[slothLoginAction.ordinal()]) {
            case 1:
                return PassportLoginAction.EMPTY;
            case 2:
                return PassportLoginAction.PASSWORD;
            case 3:
                return PassportLoginAction.REGISTRATION;
            case 4:
                return PassportLoginAction.MAGIC_LINK;
            case 5:
                return PassportLoginAction.SMS;
            case 6:
                return PassportLoginAction.LOGIN_RESTORE;
            case 7:
                return PassportLoginAction.REG_NEO_PHONISH;
            default:
                w511.b();
                return null;
        }
    }

    public static final SlothAccountType V(PassportAccountType passportAccountType) {
        switch (com.yandex.passport.internal.sloth.g.e[passportAccountType.ordinal()]) {
            case 1:
                return SlothAccountType.PORTAL;
            case 2:
                return SlothAccountType.LITE;
            case 3:
                return SlothAccountType.SOCIAL;
            case 4:
                return SlothAccountType.PDD;
            case 5:
                return SlothAccountType.PHONISH;
            case 6:
                return SlothAccountType.MAILISH;
            case 7:
                return SlothAccountType.MUSIC_PHONISH;
            case 8:
                return SlothAccountType.CHILDISH;
            case 9:
                return SlothAccountType.UNDEFINED;
            default:
                w511.b();
                return null;
        }
    }

    public static final SlothTheme W(PassportTheme passportTheme) {
        int i = com.yandex.passport.internal.sloth.g.d[passportTheme.ordinal()];
        if (i == 1 || i == 2) {
            return SlothTheme.LIGHT;
        }
        if (i == 3) {
            return SlothTheme.DARK;
        }
        if (i == 4) {
            return SlothTheme.FOLLOW_SYSTEM;
        }
        w511.b();
        return null;
    }

    public static final SlothTheme X(AppTheme appTheme) {
        int i = com.yandex.passport.internal.sloth.g.c[appTheme.ordinal()];
        if (i == 1) {
            return SlothTheme.LIGHT;
        }
        if (i == 2) {
            return SlothTheme.DARK;
        }
        if (i == 3) {
            return SlothTheme.FOLLOW_SYSTEM;
        }
        w511.b();
        return null;
    }

    public static void Y(String str, Parcel parcel) {
        if (str == null) {
            str = null;
        }
        parcel.writeString(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x018f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final com.yandex.passport.internal.ui.challenge.v vVar, final com.yandex.passport.common.ui.progress.g gVar, String str, final tls tlsVar, fid fidVar, final int i, final int i2) {
        String str2;
        rs31 a;
        final String str3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-885151811);
        int i3 = (btsVar.k(vVar) ? 4 : 2) | i | (btsVar.k(gVar) ? 32 : 16) | (((i2 & 4) == 0 && btsVar.k(str)) ? 256 : 128);
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i3 |= btsVar.e(tlsVar) ? 2048 : 1024;
        }
        if ((i3 & 1171) == 1170 && btsVar.E()) {
            btsVar.Y();
            str3 = str;
        } else {
            btsVar.a0();
            if ((i & 1) != 0 && !btsVar.C()) {
                btsVar.Y();
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
            } else if ((i2 & 4) != 0) {
                String c = qoi0.a(com.yandex.passport.internal.ui.bouncer.challenge.s.class).c();
                if (c == null) {
                    c = "BouncerChallengeScreen";
                }
                i3 &= -897;
                str2 = c;
                btsVar.u();
                com.yandex.passport.internal.ui.bouncer.challenge.b build = com.yandex.passport.internal.di.a.a().createBouncerChallengeComponentBuilder().setWebCase(vVar).build();
                com.yandex.passport.internal.ui.bouncer.challenge.p viewModelFactory = build.getViewModelFactory();
                a = f5z.a(btsVar);
                if (a != null) {
                    ny61.r("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                final String str4 = str2;
                com.yandex.passport.internal.ui.bouncer.challenge.s sVar = (com.yandex.passport.internal.ui.bouncer.challenge.s) ooc.G(qoi0.a(com.yandex.passport.internal.ui.bouncer.challenge.s.class), a, str2, viewModelFactory, a instanceof q7u ? ((q7u) a).getDefaultViewModelCreationExtras() : w8f.b, btsVar);
                oz40 b = androidx.compose.runtime.f.b(sVar.c, btsVar);
                com.yandex.passport.internal.ui.bouncer.challenge.o oVar = ((com.yandex.passport.internal.ui.bouncer.challenge.q) b.getValue()).a;
                if (oVar != null) {
                    tlsVar.invoke(Boolean.valueOf(oVar.a));
                    aii0 v = btsVar.v();
                    if (v != null) {
                        final int i4 = 0;
                        v.d = new wls() { // from class: com.yandex.passport.internal.ui.bouncer.challenge.c
                            @Override // defpackage.wls
                            public final Object invoke(Object obj, Object obj2) {
                                int i5 = i4;
                                zy11 zy11Var = zy11.a;
                                int i6 = i;
                                switch (i5) {
                                    case 0:
                                        ((Integer) obj2).getClass();
                                        int O = vng.O(i6 | 1);
                                        u.a(vVar, gVar, str4, tlsVar, (fid) obj, O, i2);
                                        break;
                                    default:
                                        ((Integer) obj2).getClass();
                                        int O2 = vng.O(i6 | 1);
                                        u.a(vVar, gVar, str4, tlsVar, (fid) obj, O2, i2);
                                        break;
                                }
                                return zy11Var;
                            }
                        };
                        return;
                    }
                    return;
                }
                Context context = (Context) btsVar.m(AndroidCompositionLocals_androidKt.b);
                com.yandex.passport.internal.ui.challenge.webview.k kVar = ((com.yandex.passport.internal.ui.bouncer.challenge.q) b.getValue()).b;
                com.yandex.passport.internal.analytics.c0 eventReporter = build.getEventReporter();
                com.yandex.passport.internal.ui.common.web.d urlChecker = build.getUrlChecker();
                btsVar.e0(-2062247381);
                Object Q = btsVar.Q();
                o430 o430Var = did.a;
                if (Q == o430Var) {
                    Q = new xvq(29);
                    btsVar.o0(Q);
                }
                tls tlsVar2 = (tls) Q;
                int i5 = 0;
                btsVar.t(false);
                btsVar.e0(-2062242708);
                boolean e = btsVar.e(sVar);
                Object Q2 = btsVar.Q();
                if (e || Q2 == o430Var) {
                    Q2 = new com.yandex.passport.internal.ui.bouncer.challenge.e(i5, sVar);
                    btsVar.o0(Q2);
                }
                tls tlsVar3 = (tls) Q2;
                btsVar.t(false);
                btsVar.e0(-2062246457);
                boolean e2 = btsVar.e(context);
                Object Q3 = btsVar.Q();
                if (e2 || Q3 == o430Var) {
                    Q3 = new com.yandex.passport.internal.ui.bouncer.challenge.d(context, 0);
                    btsVar.o0(Q3);
                }
                btsVar.t(false);
                com.yandex.passport.common.ui.progress.g gVar2 = com.yandex.passport.common.ui.progress.g.e;
                com.yandex.passport.internal.util.p.a(kVar, eventReporter, urlChecker, gVar, tlsVar2, tlsVar3, (tls) Q3, false, btsVar, ((i3 << 6) & 7168) | HProv.ALG_CLASS_DATA_ENCRYPT, 128);
                str3 = str4;
            }
            str2 = str;
            btsVar.u();
            com.yandex.passport.internal.ui.bouncer.challenge.b build2 = com.yandex.passport.internal.di.a.a().createBouncerChallengeComponentBuilder().setWebCase(vVar).build();
            com.yandex.passport.internal.ui.bouncer.challenge.p viewModelFactory2 = build2.getViewModelFactory();
            a = f5z.a(btsVar);
            if (a != null) {
            }
        }
        aii0 v2 = btsVar.v();
        if (v2 != null) {
            final int i6 = 1;
            v2.d = new wls() { // from class: com.yandex.passport.internal.ui.bouncer.challenge.c
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    int i52 = i6;
                    zy11 zy11Var = zy11.a;
                    int i62 = i;
                    switch (i52) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int O = vng.O(i62 | 1);
                            u.a(vVar, gVar, str3, tlsVar, (fid) obj, O, i2);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int O2 = vng.O(i62 | 1);
                            u.a(vVar, gVar, str3, tlsVar, (fid) obj, O2, i2);
                            break;
                    }
                    return zy11Var;
                }
            };
        }
    }

    public static final void b(String str, String str2, String str3, boolean z, boolean z2, sls slsVar, sls slsVar2, sls slsVar3, fid fidVar, int i) {
        boolean z3;
        boolean z4;
        bts btsVar = (bts) fidVar;
        btsVar.g0(2010632557);
        int i2 = i | (btsVar.k(str) ? 4 : 2) | 48 | (btsVar.k(str2) ? 256 : 128) | (btsVar.k(str3) ? 2048 : 1024) | 221184 | (btsVar.e(slsVar) ? 1048576 : 524288) | (btsVar.e(slsVar2) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC) | (btsVar.e(slsVar3) ? 67108864 : SelfTester_JCP.DECRYPT_CFB);
        if ((38347923 & i2) == 38347922 && btsVar.E()) {
            btsVar.Y();
            z3 = z;
            z4 = z2;
        } else {
            btsVar.e0(-267276703);
            boolean z5 = (i2 & 234881024) == 67108864;
            Object Q = btsVar.Q();
            if (z5 || Q == did.a) {
                Q = new com.yandex.passport.internal.flags.presentation.k(7, slsVar3);
                btsVar.o0(Q);
            }
            btsVar.t(false);
            androidx.compose.ui.window.c.a((sls) Q, new sej(4), wwg.S(-1682660746, true, new t7a(str, str2, slsVar, str3, slsVar2, 2), btsVar), btsVar, 384, 0);
            z3 = true;
            z4 = true;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new yxs0(str, str2, str3, z3, z4, slsVar, slsVar2, slsVar3, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(com.yandex.passport.common.ui.progress.g gVar, final boolean z, fid fidVar, final int i) {
        final com.yandex.passport.common.ui.progress.g gVar2;
        aii0 v;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1618350512);
        int i2 = (btsVar.k(gVar) ? 4 : 2) | i | (btsVar.a(z) ? 32 : 16);
        if ((i2 & 19) == 18 && btsVar.E()) {
            btsVar.Y();
        } else if (z) {
            com.yandex.passport.common.ui.progress.g gVar3 = com.yandex.passport.common.ui.progress.g.e;
            gVar2 = gVar;
            com.yandex.passport.common.ui.progress.p.d(null, gVar2, false, btsVar, 384 | ((i2 << 3) & 112), 1);
            v = btsVar.v();
            if (v == null) {
                v.d = new wls(z, i) { // from class: com.yandex.passport.internal.ui.router.q
                    public final /* synthetic */ boolean b;

                    @Override // defpackage.wls
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int O = vng.O(1);
                        com.yandex.passport.internal.properties.u.c(com.yandex.passport.common.ui.progress.g.this, this.b, (fid) obj, O);
                        return zy11.a;
                    }
                };
                return;
            }
            return;
        }
        gVar2 = gVar;
        v = btsVar.v();
        if (v == null) {
        }
    }

    public static final void d(boolean z, String str, String str2, sls slsVar, f530 f530Var, fid fidVar, int i) {
        bts btsVar;
        f530 f530Var2;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-1146253831);
        dmw0 dmw0Var = btsVar2.a;
        int i2 = i | (btsVar2.a(z) ? 4 : 2) | (btsVar2.k(str) ? 32 : 16) | (btsVar2.k(str2) ? 256 : 128) | (btsVar2.e(slsVar) ? 2048 : 1024) | HProv.ALG_CLASS_DATA_ENCRYPT;
        if ((i2 & 9363) == 9362 && btsVar2.E()) {
            btsVar2.Y();
            f530Var2 = f530Var;
            btsVar = btsVar2;
        } else {
            btsVar2.e0(-119442034);
            Object Q = btsVar2.Q();
            if (Q == did.a) {
                Q = ly3.i(btsVar2);
            }
            btsVar2.t(false);
            awk0 awk0Var = new awk0(3);
            c530 c530Var = c530.a;
            f530 c = ljs0.c(kx91.i(c530Var, z, (zx40) Q, null, true, awk0Var, slsVar), 1.0f);
            lhl0 a = khl0.a(lr20.a, x4c.D, btsVar2, 0);
            int S = cma1.S(btsVar2);
            r1b0 o = btsVar2.o();
            f530 d = androidx.compose.ui.b.d(btsVar2, c);
            ohd.G1.getClass();
            sls slsVar2 = androidx.compose.ui.node.d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar2.i0();
            if (btsVar2.S) {
                btsVar2.n(slsVar2);
            } else {
                btsVar2.r0();
            }
            wls wlsVar = androidx.compose.ui.node.d.f;
            qje.W(btsVar2, wlsVar, a);
            wls wlsVar2 = androidx.compose.ui.node.d.e;
            qje.W(btsVar2, wlsVar2, o);
            wls wlsVar3 = androidx.compose.ui.node.d.g;
            if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(S))) {
                b64.z(S, btsVar2, S, wlsVar3);
            }
            wls wlsVar4 = androidx.compose.ui.node.d.d;
            qje.W(btsVar2, wlsVar4, d);
            com.yandex.passport.internal.ui.common.component.b.a(z, ljs0.m(c530Var, 48.0f), btsVar2, (i2 & 14) | 432, 0);
            f530 o2 = an91.o(c530Var, 0.0f, 10.0f, 0.0f, 10.0f, 5);
            sic a2 = qic.a(lr20.c, x4c.G, btsVar2, 0);
            int S2 = cma1.S(btsVar2);
            r1b0 o3 = btsVar2.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar2, o2);
            btsVar2.i0();
            if (btsVar2.S) {
                btsVar2.n(slsVar2);
            } else {
                btsVar2.r0();
            }
            qje.W(btsVar2, wlsVar, a2);
            qje.W(btsVar2, wlsVar2, o3);
            if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(S2))) {
                b64.z(S2, btsVar2, S2, wlsVar3);
            }
            qje.W(btsVar2, wlsVar4, d2);
            a7u0 a7u0Var = eq11.a;
            ety0 ety0Var = ((bq11) btsVar2.m(a7u0Var)).k;
            a7u0 a7u0Var2 = dgc.a;
            vqy0.c(str, an91.o(c530Var, 0.0f, 0.0f, 0.0f, 2.0f, 7), ((agc) btsVar2.m(a7u0Var2)).a, 0L, null, 0L, null, 0L, 0, false, 0, 0, ety0Var, btsVar2, ((i2 >> 3) & 14) | 48, 0, 131064);
            vqy0.c(str2, null, ((agc) btsVar2.m(a7u0Var2)).f, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((bq11) btsVar2.m(a7u0Var)).l, btsVar2, (i2 >> 6) & 14, 0, 131066);
            btsVar = btsVar2;
            btsVar.t(true);
            btsVar.t(true);
            f530Var2 = c530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new hc0(z, str, str2, slsVar, f530Var2, i);
        }
    }

    public static final void e(sls slsVar, f530 f530Var, androidx.compose.material3.w wVar, androidx.compose.runtime.internal.a aVar, fid fidVar, int i) {
        f530 f530Var2;
        bts btsVar;
        f530 f530Var3;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-1237746168);
        int i2 = i | (btsVar2.e(slsVar) ? 4 : 2) | 48 | (btsVar2.k(wVar) ? 256 : 128);
        if ((i2 & 1171) == 1170 && btsVar2.E()) {
            btsVar2.Y();
            f530Var3 = f530Var;
            btsVar = btsVar2;
        } else {
            btsVar2.a0();
            if ((i & 1) == 0 || btsVar2.C()) {
                f530Var2 = c530.a;
            } else {
                btsVar2.Y();
                f530Var2 = f530Var;
            }
            btsVar2.u();
            long j = ldc.l;
            com.yandex.passport.internal.ui.challenge.logout.bottomsheet.e.a.getClass();
            int i3 = (i2 & 14) | 1572912 | (i2 & 896);
            f530 f530Var4 = f530Var2;
            btsVar = btsVar2;
            androidx.compose.material3.p.a(slsVar, f530Var4, wVar, 0.0f, false, null, j, 0L, 0L, com.yandex.passport.internal.ui.challenge.logout.bottomsheet.e.b, r1.a, null, wwg.S(-571994906, true, new com.yandex.passport.internal.flags.presentation.y(1, aVar), btsVar2), btsVar, i3, 5048);
            f530Var3 = f530Var4;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new b1(slsVar, f530Var3, wVar, aVar, i);
        }
    }

    public static final void f(sls slsVar, f530 f530Var, boolean z, hz6 hz6Var, androidx.compose.runtime.internal.a aVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(835216206);
        if ((i & 6) == 0) {
            i2 = (btsVar.e(slsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(f530Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.a(z) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.k(hz6Var) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= btsVar.e(aVar) ? 16384 : 8192;
        }
        if ((i2 & 9363) == 9362 && btsVar.E()) {
            btsVar.Y();
        } else {
            btsVar.a0();
            if ((i & 1) != 0 && !btsVar.C()) {
                btsVar.Y();
            }
            btsVar.u();
            androidx.compose.material3.a.c(slsVar, ljs0.e(f530Var, 56.0f), z, ((wir0) btsVar.m(zir0.a)).c, hz6Var, null, null, aVar, btsVar, (i2 & 910) | ((i2 << 3) & HProv.ALG_CLASS_ALL) | ((i2 << 15) & 1879048192));
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ym1(slsVar, f530Var, z, hz6Var, aVar, i);
        }
    }

    public static final void g(int i, int i2, fid fidVar, sls slsVar, f530 f530Var, String str, boolean z) {
        boolean z2;
        int i3;
        boolean z3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1123616879);
        int i4 = (btsVar.k(str) ? 4 : 2) | i | (btsVar.e(slsVar) ? 32 : 16);
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 = i4 | HProv.ALG_TYPE_SECURECHANNEL;
            z2 = z;
        } else {
            z2 = z;
            i3 = i4 | (btsVar.a(z2) ? 2048 : 1024);
        }
        if ((i3 & 1171) == 1170 && btsVar.E()) {
            btsVar.Y();
            z3 = z2;
        } else {
            z3 = i5 != 0 ? true : z2;
            l690 l690Var = rz6.a;
            a7u0 a7u0Var = dgc.a;
            int i6 = i3 >> 3;
            f(slsVar, f530Var, z3, rz6.a(((agc) btsVar.m(a7u0Var)).c, ((agc) btsVar.m(a7u0Var)).d, btsVar), wwg.S(1925681300, true, new com.yandex.passport.internal.ui.common.component.a(str, 0), btsVar), btsVar, (i6 & 14) | 24624 | (i6 & 896));
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new bp1(str, slsVar, f530Var, z3, i, i2, 2);
        }
    }

    public static final void h(int i, fid fidVar, sls slsVar, f530 f530Var, String str, boolean z) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1259411551);
        int i2 = (btsVar.k(str) ? 4 : 2) | i | (btsVar.e(slsVar) ? 32 : 16) | HProv.ALG_TYPE_SECURECHANNEL;
        if ((i2 & 1171) == 1170 && btsVar.E()) {
            btsVar.Y();
        } else {
            l690 l690Var = rz6.a;
            a7u0 a7u0Var = dgc.a;
            f(slsVar, f530Var, true, rz6.a(((agc) btsVar.m(a7u0Var)).h, ((agc) btsVar.m(a7u0Var)).i, btsVar), wwg.S(-1827701598, true, new com.yandex.passport.internal.ui.common.component.a(str, 1), btsVar), btsVar, ((i2 >> 3) & 14) | 25008);
            z = true;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new com.yandex.passport.internal.flags.presentation.z0(str, slsVar, f530Var, z, i);
        }
    }

    public static final SlothLoginProperties i(LoginProperties loginProperties) {
        String source = loginProperties.getSource();
        if (source == null) {
            source = "null";
        }
        String str = source;
        boolean isSocialAuthorizationEnabled = loginProperties.getVisualProperties().isSocialAuthorizationEnabled();
        boolean isNoReturnToHost = loginProperties.getVisualProperties().isNoReturnToHost();
        String mo243getAdditionalActionRequestJWfNWPw = loginProperties.mo243getAdditionalActionRequestJWfNWPw();
        if (mo243getAdditionalActionRequestJWfNWPw == null) {
            mo243getAdditionalActionRequestJWfNWPw = null;
        }
        String str2 = mo243getAdditionalActionRequestJWfNWPw;
        SlothTheme W = W(loginProperties.getTheme());
        EnumSet<PassportAccountType> supportedAccountTypes = loginProperties.getFilter().getSupportedAccountTypes();
        ArrayList arrayList = new ArrayList(tcc.n(supportedAccountTypes, 10));
        Iterator<T> it = supportedAccountTypes.iterator();
        while (it.hasNext()) {
            arrayList.add(V((PassportAccountType) it.next()));
        }
        EnumSet noneOf = EnumSet.noneOf(SlothAccountType.class);
        noneOf.addAll(arrayList);
        return new SlothLoginProperties(str, isSocialAuthorizationEnabled, isNoReturnToHost, false, str2, W, noneOf, loginProperties.isLoginFlow(), loginProperties.getOrigin(), loginProperties.getCusLocation());
    }

    public static final void j(View view) {
        long g;
        DslAnimatorBuilder dslAnimatorBuilder = new DslAnimatorBuilder();
        dslAnimatorBuilder.targets(new com.yandex.passport.internal.analytics.a0(10, view));
        g = spb1.g((r2 & 8) != 0 ? 0 : 1, (r2 & 16) == 0 ? 200 : 0);
        dslAnimatorBuilder.m128setDurationTimebAIjdkI(g);
        dslAnimatorBuilder.start();
    }

    public static final String k(String str, String str2) {
        if (str != null && str2 != null) {
            return g8e.p(str, " • ", str2);
        }
        if (str != null && str2 == null) {
            return str;
        }
        if (str != null || str2 == null) {
            return null;
        }
        return str2;
    }

    public static Bundle l(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("error-message", str);
        return bundle;
    }

    public static String m(Parcel parcel) {
        String readString = parcel.readString();
        if (readString != null) {
            return readString;
        }
        return null;
    }

    public static Intent n(int i, List list) {
        Bundle bundle = new Bundle();
        bundle.putString("version", "5.21");
        bundle.putInt("client_id", i);
        bundle.putBoolean("revoke", true);
        bundle.putString("scope", TextUtils.join(",", list));
        Intent intent = new Intent("com.vkontakte.android.action.SDK_AUTH", (Uri) null);
        intent.setPackage("com.vkontakte.android");
        intent.putExtras(bundle);
        return intent;
    }

    public static com.yandex.passport.internal.sloth.credentialmanager.c o(Intent intent) {
        Bundle extras;
        if (intent == null || (extras = intent.getExtras()) == null) {
            return null;
        }
        String string = extras.getString("username_key");
        String string2 = extras.getString("password_key");
        String string3 = extras.getString("response_key");
        boolean z = extras.getBoolean("is_from_dialog_key");
        if (string3 != null) {
            return new com.yandex.passport.internal.sloth.credentialmanager.b(string3, z);
        }
        if (string == null || string2 == null) {
            return null;
        }
        return new com.yandex.passport.internal.sloth.credentialmanager.a(string, string2, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0048 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static com.yandex.passport.internal.sso.a p(String str, String str2, int i, long j) {
        Uid uid;
        long parseLong;
        Environment environment;
        if (str != null && str2 != null && i >= 0) {
            int D = evu0.D(str, ':', 0, false);
            if (D >= 1 && D != str.length() - 1) {
                String substring = str.substring(0, D);
                try {
                    parseLong = Long.parseLong(str.substring(D + 1));
                } catch (NumberFormatException unused) {
                }
                if (parseLong > 0) {
                    try {
                        com.yandex.passport.common.core.a aVar = Environment.Companion;
                        int parseInt = Integer.parseInt(substring);
                        aVar.getClass();
                        environment = com.yandex.passport.common.core.a.a(parseInt);
                    } catch (Exception unused2) {
                        environment = Environment.PRODUCTION;
                    }
                    uid = new Uid(environment, parseLong);
                    if (uid != null) {
                        try {
                            return new com.yandex.passport.internal.sso.a(uid, i, AccountAction$LastAction.valueOf(str2), j);
                        } catch (IllegalArgumentException unused3) {
                        }
                    }
                }
            }
            uid = null;
            if (uid != null) {
            }
        }
        return null;
    }

    public static com.yandex.passport.internal.sso.c q(Context context, String str, Map map, tls tlsVar) {
        Bundle bundle;
        Bundle bundle2;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 134217856);
            if (packageInfo != null) {
                SigningInfo signingInfo = packageInfo.signingInfo;
                if ((signingInfo != null ? signingInfo.getApkContentsSigners() : null) != null) {
                    byte[] bArr = com.yandex.passport.internal.entities.o.c;
                    com.yandex.passport.internal.entities.o e = com.yandex.passport.internal.util.p.e(packageInfo);
                    ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                    int i = -1;
                    if (applicationInfo != null && (bundle2 = applicationInfo.metaData) != null) {
                        i = bundle2.getInt("com.yandex.auth.INTERNAL_VERSION", -1);
                    }
                    int i2 = i;
                    ApplicationInfo applicationInfo2 = packageInfo.applicationInfo;
                    String e2 = com.yandex.passport.common.util.a.e((applicationInfo2 == null || (bundle = applicationInfo2.metaData) == null) ? null : bundle.getString("com.yandex.passport.SSO.CERT", null));
                    return new com.yandex.passport.internal.sso.c(str, com.yandex.passport.internal.util.p.f(context.getPackageManager(), context.getPackageName()), e, map, i2, e2 != null ? (X509Certificate) CertificateFactory.getInstance(JCP.CERTIFICATE_FACTORY_NAME).generateCertificate(new ByteArrayInputStream(Base64.decode(e2, 0))) : null);
                }
            }
            return null;
        } catch (PackageManager.NameNotFoundException e3) {
            tlsVar.invoke(e3);
            return null;
        } catch (NoSuchAlgorithmException e4) {
            tlsVar.invoke(e4);
            return null;
        }
    }

    public static Bundle r(Exception exc) {
        Bundle bundle = new Bundle();
        bundle.putSerializable(Constants.KEY_EXCEPTION, exc);
        return bundle;
    }

    public static final String s(g1 g1Var) {
        return kotlin.collections.b.i(new Pair("account_size", Integer.valueOf(g1Var.b.size())), new Pair("child_info_account_size", Integer.valueOf(g1Var.c.size())), new Pair(DomikActivity.EXTRA_IS_RELOGIN, Boolean.valueOf(g1Var.f))).toString();
    }

    public static final String t(s1 s1Var) {
        StringBuilder sb = new StringBuilder();
        sb.append(u(s1Var.a));
        g1 g1Var = s1Var.d;
        sb.append(kotlin.collections.b.i(new Pair("bouncer_parameters", g1Var != null ? s(g1Var) : null), new Pair("challenge_state", s1Var.e)));
        return sb.toString();
    }

    public static final String u(c2 c2Var) {
        String str;
        if (c2Var instanceof v1) {
            str = "Error";
        } else if (c2Var instanceof w1) {
            w1 w1Var = (w1) c2Var;
            str = kotlin.collections.b.i(new Pair("ui_state_name", "Fallback"), new Pair("can_go_back", Boolean.valueOf(w1Var.b)), new Pair(DomikActivity.EXTRA_IS_RELOGIN, Boolean.valueOf(w1Var.x))).toString();
        } else if (c2Var instanceof y1) {
            str = "Roundabout";
        } else if (c2Var instanceof z1) {
            Pair pair = new Pair("ui_state_name", "Sloth");
            SlothParams slothParams = ((z1) c2Var).a;
            str = kotlin.collections.b.i(pair, new Pair("params", kotlin.collections.b.i(new Pair("sloth_variant", slothParams.getVariant().getMode().name()), new Pair("sloth_env", slothParams.getEnvironment())).toString())).toString();
        } else if (c2Var instanceof t1) {
            str = "Challenge";
        } else if (c2Var instanceof x1) {
            str = "Loading";
        } else if (c2Var instanceof a2) {
            str = "WaitConnection";
        } else if (c2Var.equals(b2.a)) {
            str = "WrongAccount";
        } else if (c2Var instanceof com.yandex.passport.internal.ui.bouncer.model.u1) {
            str = "ChooseMaster";
        } else {
            if (!(c2Var instanceof BouncerUiState$SocialAction)) {
                w511.b();
                return null;
            }
            str = "SocialAction";
        }
        return gw00.e(new Pair("ui_state", str)).toString();
    }

    public static Map v() {
        return w0.x;
    }

    public static Map w() {
        return w0.w;
    }

    public static final String x(com.yandex.passport.api.w wVar) {
        if (wVar instanceof com.yandex.passport.api.u) {
            return "LoggedIn";
        }
        if (wVar.equals(com.yandex.passport.api.q.a)) {
            return "Cancelled";
        }
        if (wVar instanceof com.yandex.passport.api.s) {
            return "FailedWithException";
        }
        if (wVar.equals(com.yandex.passport.api.t.a)) {
            return "Forbidden";
        }
        if (wVar instanceof com.yandex.passport.api.v) {
            return "OpenUrl";
        }
        w511.b();
        return null;
    }

    public static final String y(c2 c2Var) {
        if (c2Var instanceof v1) {
            return "Error";
        }
        if (c2Var instanceof w1) {
            return "Fallback";
        }
        if (c2Var instanceof y1) {
            return "Roundabout";
        }
        if (c2Var instanceof z1) {
            return "Sloth";
        }
        if (c2Var instanceof t1) {
            return "Challenge";
        }
        if (c2Var instanceof x1) {
            return "Loading";
        }
        if (c2Var instanceof a2) {
            return "WaitConnection";
        }
        if (c2Var instanceof b2) {
            return "WrongAccount";
        }
        if (c2Var instanceof com.yandex.passport.internal.ui.bouncer.model.u1) {
            return "ChooseMaster";
        }
        if (c2Var instanceof BouncerUiState$SocialAction) {
            return "SocialAction";
        }
        w511.b();
        return null;
    }

    public static final int z(Context context) {
        return context.getResources().getConfiguration().uiMode & 48;
    }
}
