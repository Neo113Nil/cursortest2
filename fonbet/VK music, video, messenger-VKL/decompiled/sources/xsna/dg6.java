package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.MimeTypeMap;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.facebook.soloader.MinElf;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.auth.modal.base.ModalAuthOpenerInterface$AuthParams;
import com.vk.auth.qr.OldQrAuthFragment;
import com.vk.auth.utils.VkPassportPage;
import com.vk.common.links.LaunchContext;
import com.vk.common.links.spans.api.di.LinksSpansComponent;
import com.vk.core.apps.BuildInfo;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.design.demo.di.DesignDemoComponent;
import com.vk.dto.common.actions.ActionOpenUrl;
import com.vk.dto.common.id.UserId;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.dto.stories.entities.StoryCameraMode;
import com.vk.home.HomeFragment2;
import com.vk.search.fragment.DiscoverSearchFragment;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;
import com.vk.stat.scheme.MobileOfficialAppsStoriesStat$TypeStoryPublishItem;
import com.vk.stat.scheme.SchemeStat$TypeNavgo;
import com.vk.superapp.api.dto.auth.AuthPayload;
import com.vk.superapp.api.dto.auth.ReloginParams;
import com.vk.webapp.fragments.AccountFragment;
import com.vk.webapp.fragments.PrivacyFragment;
import com.vk.webapp.fragments.RestoreFragment;
import com.vkontakte.android.data.b;
import com.vkontakte.android.fragments.SettingsAccountFragment;
import com.vkontakte.android.fragments.SettingsGeneralFragment;
import com.vkontakte.android.fragments.SettingsListFragment;
import com.vkontakte.android.fragments.WebViewFragment;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import java.util.Locale;
import kotlin.LazyThreadSafetyMode;
import kotlin.Result;
import kotlin.text.Regex;
import org.json.JSONObject;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.dg6;
import xsna.lm70;
import xsna.o0r0;

/* compiled from: BaseLinkProcessor.kt */
/* loaded from: classes.dex */
public abstract class dg6 implements maz, w8i {
    public final aik0 b = ((LinksSpansComponent) ((k7m) m7m.f(this)).a(fpf0.a(LinksSpansComponent.class))).z5();
    public final Object c;
    public final Object d;
    public final Object e;

    /* compiled from: BaseLinkProcessor.kt */
    /* loaded from: classes17.dex */
    public static final class a implements tv20 {
        public final /* synthetic */ yp80 a;

        public a(yp80 yp80Var) {
            this.a = yp80Var;
        }

        @Override // xsna.tv20
        public final void a(Throwable th) {
            this.a.onError(th);
        }

        @Override // xsna.tv20
        public final void b() {
            this.a.onSuccess();
        }
    }

    public dg6() {
        zf6 zf6Var = new zf6(this, 0);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.c = msy.a(lazyThreadSafetyMode, zf6Var);
        int i = 0;
        this.d = msy.a(lazyThreadSafetyMode, new ag6(this, i));
        this.e = msy.a(lazyThreadSafetyMode, new bg6(this, i));
    }

    @Override // xsna.maz
    public final void b(Activity activity, int i, String str) {
        if (str == null || !com.vk.common.links.b.l(activity, Uri.parse(str))) {
            com.vk.common.links.b.g(activity, str, hpt0.m(i));
        }
    }

    @Override // xsna.maz
    public final boolean d(Context context, Uri uri, LaunchContext launchContext, yp80 yp80Var) {
        return ((j63) this).f.j(context, uri, launchContext, yp80Var);
    }

    @Override // xsna.maz
    public final void e(Context context, ActionOpenUrl actionOpenUrl, String str, SearchStatsLoggingInfo searchStatsLoggingInfo, Bundle bundle) {
        com.vk.extensions.a.b(actionOpenUrl, context, null, str, bundle.getString("launch_origin", ""), null, null, null, searchStatsLoggingInfo, Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE);
    }

    @Override // xsna.maz
    public final void f(Context context, String str, q21 q21Var) {
        if (context == null || str == null) {
            return;
        }
        this.b.b(context, str, new bb(q21Var, 9));
    }

    @Override // xsna.maz
    public final void g(Context context, String str, eo2 eo2Var) {
        if (context == null || str == null) {
            return;
        }
        this.b.a(context, str, new q(eo2Var, 6));
    }

    @Override // xsna.maz
    public final String h(String str) {
        return jaz.a(str);
    }

    @Override // xsna.maz
    public final boolean i(Context context, Uri uri) {
        if (uri == null) {
            return false;
        }
        return ((j63) this).f.a(context, uri);
    }

    @Override // xsna.maz
    public final void k(Context context, String str) {
        com.vk.common.links.b.f(context, str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x050f, code lost:
    
        if (r2.s() != false) goto L248;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:224:0x07e2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0107  */
    /* JADX WARN: Type inference failed for: r0v112, types: [xsna.rk8] */
    /* JADX WARN: Type inference failed for: r0v127, types: [xsna.rk8] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.String, kotlin.text.Regex, xsna.jx2, xsna.qyn0] */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v5, types: [android.os.Bundle, kotlin.text.Regex] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.String, kotlin.text.Regex] */
    /* JADX WARN: Type inference failed for: r13v36 */
    /* JADX WARN: Type inference failed for: r13v40 */
    /* JADX WARN: Type inference failed for: r13v44 */
    /* JADX WARN: Type inference failed for: r13v45 */
    /* JADX WARN: Type inference failed for: r13v66 */
    /* JADX WARN: Type inference failed for: r13v73 */
    /* JADX WARN: Type inference failed for: r3v42, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.maz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean l(final Context context, String str, final LaunchContext launchContext, Bundle bundle, yp80 yp80Var) {
        Uri uri;
        yp80 yp80Var2;
        boolean z;
        boolean z2;
        Context context2;
        String str2;
        Object obj;
        LaunchContext launchContext2;
        boolean z3;
        Context context3;
        Context context4;
        Uri uri2;
        ?? r11;
        boolean z4;
        int i;
        boolean z5;
        dg6 dg6Var;
        LaunchContext launchContext3;
        yp80 yp80Var3;
        yp80 yp80Var4;
        Bundle bundle2;
        Context context5;
        LaunchContext launchContext4;
        boolean z6;
        Uri uri3;
        boolean z7;
        FragmentManager supportFragmentManager;
        boolean z8;
        boolean z9;
        boolean z10;
        Object obj2;
        Object failure;
        boolean z11;
        LaunchContext launchContext5;
        boolean z12;
        yp80 yp80Var5;
        Object obj3;
        Object obj4;
        Object obj5;
        String path;
        boolean z13;
        boolean z14;
        boolean z15;
        String path2;
        Object obj6;
        ?? r13;
        RestoreFragment.a a2;
        String str3;
        Long k;
        String str4;
        Long n;
        StoryCameraMode storyCameraMode;
        String n2;
        String k2;
        String queryParameter;
        Uri uri4;
        String a3 = jaz.a(str);
        Activity h = e3m.h(context);
        Context context6 = h != null ? h : context;
        Uri parse = Uri.parse(naz.a(a3));
        if (naz.o(parse) && (queryParameter = parse.getQueryParameter("target_url")) != null && naz.A(queryParameter)) {
            try {
                uri4 = Uri.parse(jaz.a(queryParameter));
            } catch (Throwable unused) {
                uri4 = null;
            }
            if (uri4 != null) {
                parse = uri4;
            }
        }
        Uri uri5 = parse;
        if (yp80Var == null) {
            uri = uri5;
            yp80Var2 = new i63(context6, uri5, (j63) this, launchContext, bundle);
        } else {
            uri = uri5;
            yp80Var2 = yp80Var;
        }
        haz.b(context, str);
        if (launchContext.u()) {
            bpn0 bpn0Var = pok.a;
            pok.b(context, jeq0.g(a3));
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            Uri parse2 = Uri.parse(a3);
            ipu0 ipu0Var = ((j63) this).g;
            ipu0Var.getClass();
            if (naz.u(parse2)) {
                if (epx.f(parse2.getHost(), SignalingProtocol.KEY_CAMERA)) {
                    String queryParameter2 = parse2.getQueryParameter("section");
                    if (queryParameter2 != null) {
                        switch (queryParameter2.hashCode()) {
                            case -427356054:
                                if (queryParameter2.equals("pingpong")) {
                                    storyCameraMode = StoryCameraMode.PING_PONG;
                                    break;
                                }
                                break;
                            case 3617:
                                if (queryParameter2.equals("qr")) {
                                    storyCameraMode = StoryCameraMode.QR_SCANNER;
                                    break;
                                }
                                break;
                            case 3322092:
                                if (queryParameter2.equals("live")) {
                                    storyCameraMode = StoryCameraMode.LIVE;
                                    break;
                                }
                                break;
                            case 94750499:
                                if (queryParameter2.equals("clips")) {
                                    storyCameraMode = StoryCameraMode.CLIPS;
                                    break;
                                }
                                break;
                            case 109770997:
                                if (queryParameter2.equals("story")) {
                                    storyCameraMode = StoryCameraMode.STORY;
                                    break;
                                }
                                break;
                        }
                        if (storyCameraMode == StoryCameraMode.CLIPS || g620.f().getExperiments().c()) {
                            n2 = launchContext.n();
                            if (n2 == null) {
                                n2 = "";
                            }
                            k2 = launchContext.k();
                            if (k2 == null) {
                                k2 = "";
                            }
                            com.vk.storycamera.builder.a aVar = new com.vk.storycamera.builder.a(n2, k2);
                            aVar.g(storyCameraMode);
                            aVar.C(context6);
                        } else {
                            yp80Var2.U();
                            z = true;
                        }
                    }
                    storyCameraMode = StoryCameraMode.STORY;
                    if (storyCameraMode == StoryCameraMode.CLIPS) {
                    }
                    n2 = launchContext.n();
                    if (n2 == null) {
                    }
                    k2 = launchContext.k();
                    if (k2 == null) {
                    }
                    com.vk.storycamera.builder.a aVar2 = new com.vk.storycamera.builder.a(n2, k2);
                    aVar2.g(storyCameraMode);
                    aVar2.C(context6);
                } else if (epx.f(parse2.getHost(), "camera_settings")) {
                    sxc0.a().a(context6, MobileOfficialAppsConStoriesStat$ViewEntryPoint.DISCOVER);
                } else if (epx.f(parse2.getHost(), "new_story_picker")) {
                    spl0 a4 = b6m.a();
                    UiTracker uiTracker = UiTracker.a;
                    a4.m(context6, UiTracker.c(), MobileOfficialAppsStoriesStat$TypeStoryPublishItem.CreationEntryPoint.LINK);
                } else if (epx.f(parse2.getHost(), CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE)) {
                    List<String> pathSegments = parse2.getPathSegments();
                    if (pathSegments != null && (str4 = (String) j5g.a0(pathSegments)) != null && (n = arm0.n(str4)) != null) {
                        xwk.e().m(context6, new UserId(n.longValue()), new o0r0.a(false, null, null, null, null, null, null, false, false, false, false, null, null, null, MinElf.PN_XNUM));
                    }
                } else if (epx.f(parse2.getHost(), "chat")) {
                    com.vk.common.links.c.t(context6, null, cqm0.l(parse2.getQueryParameter("peer")), 0, null, null, null, launchContext.e(), false, yp80Var2, null, null, null, 7546);
                } else if (epx.f(parse2.getHost(), "channel")) {
                    com.vk.common.links.c.s(context6, cqm0.l(parse2.getQueryParameter("peer")), 0, yp80Var2, null, 20);
                } else if (epx.f(parse2.getHost(), "new_story")) {
                    new com.vk.storycamera.builder.a(SchemeStat$TypeNavgo.Subtype.LINK.name().toLowerCase(Locale.ROOT), "link").C(context6);
                } else if (!com.vk.core.apps.a.b()) {
                    if (epx.f(parse2.getHost(), "design_demo")) {
                        if (BuildInfo.i() || BuildInfo.h()) {
                            o2l.a.getClass();
                            if (o2l.f()) {
                                ((DesignDemoComponent) ((k7m) m7m.f(ipu0Var)).mo408a(fpf0.a(DesignDemoComponent.class))).f().a(context6);
                            }
                        }
                    } else if (epx.f(parse2.getHost(), "search")) {
                        String str5 = (String) new Regex(DomExceptionUtils.SEPARATOR).j(4, parse2.toString()).get(3);
                        DiscoverSearchFragment.a aVar3 = new DiscoverSearchFragment.a();
                        aVar3.B(str5);
                        aVar3.E();
                        aVar3.k(context6);
                    } else if (epx.f(parse2.getHost(), "new_post")) {
                        q860 b = rfc0.b();
                        String queryParameter3 = parse2.getQueryParameter("text");
                        if (queryParameter3 == null) {
                            queryParameter3 = "";
                        }
                        boolean equals = SignalingProtocol.KEY_CAMERA.equals(parse2.getQueryParameter("attach"));
                        String queryParameter4 = parse2.getQueryParameter("postponed_time");
                        b.m((queryParameter4 == null || (k = cqm0.k(queryParameter4)) == null) ? 0L : k.longValue(), queryParameter3, equals);
                        b.l(context6);
                    } else if (epx.f(parse2.getHost(), "settings")) {
                        List<String> pathSegments2 = parse2.getPathSegments();
                        String str6 = pathSegments2 != null ? (String) j5g.a0(pathSegments2) : null;
                        if (epx.f(str6, "security")) {
                            int i2 = AccountFragment.a0;
                            AccountFragment.b.a(VkPassportPage.PAGE_SECURITY.i(), null, null, null, false, false, null, null, 254).k(context6);
                        } else if (epx.f(parse2.getQueryParameter("act"), "unread_counter")) {
                            SettingsAccountFragment.a aVar4 = new SettingsAccountFragment.a();
                            aVar4.y("unread_counter");
                            aVar4.k(context6);
                        } else if (epx.f(str6, "notify")) {
                            ipu0Var.b.c(context6);
                        } else if (epx.f(str6, "blacklist")) {
                            ipu0Var.c.a(context6);
                        } else {
                            Class cls = epx.f(str6, "account") ? SettingsAccountFragment.class : epx.f(str6, "privacy") ? PrivacyFragment.class : SettingsGeneralFragment.class;
                            List<String> pathSegments3 = parse2.getPathSegments();
                            new oz50(cls, null, (pathSegments3 == null || (str3 = (String) j5g.b0(1, pathSegments3)) == null) ? null : q9k.a("pref_to_highlight", str3)).k(context6);
                        }
                    } else if (epx.f(parse2.getHost(), "change_theme")) {
                        int i3 = SettingsListFragment.X0;
                        SettingsListFragment.a.a(context6, parse2.getQueryParameter("theme"));
                    } else if (epx.f(parse2.getPath(), "/menu")) {
                        new HomeFragment2.a().k(context6);
                    }
                }
                yp80Var2.onSuccess();
                z = true;
            }
            z = false;
        }
        if (z) {
            z2 = false;
        } else {
            z2 = false;
            z = (!brm0.B(a3, "tel:", false) || brm0.B(a3, "tel://", false)) ? (!brm0.B(a3, "mailto:", false) || brm0.B(a3, "mailto://", false)) ? false : com.vk.common.links.c.B(context6, a3) : gbz.a(context6, a3);
        }
        if (!z) {
            z = com.vk.common.links.b.l(context6, Uri.parse(a3));
        }
        if (z || !naz.x(uri) || naz.z(uri)) {
            context2 = context;
            str2 = "";
            obj = 0;
            launchContext2 = launchContext;
        } else {
            peq0 peq0Var = new peq0(uri);
            if (jh.h("/account", peq0Var, null, null, 14) || epx.f(uri.getPath(), DomExceptionUtils.SEPARATOR) || (path2 = uri.getPath()) == null || path2.length() == 0 || yav0.d(uri)) {
                str2 = "";
                z13 = false;
                context2 = context;
                launchContext2 = launchContext;
                VkPassportPage a5 = yav0.a(uri);
                String i4 = a5 != null ? a5.i() : null;
                String r = peq0Var.r(com.huawei.hms.support.feature.result.CommonConstant.KEY_ACCESS_TOKEN);
                int i5 = AccountFragment.a0;
                String uri6 = uri.toString();
                String r2 = peq0Var.r("returnUserId");
                Long n3 = r2 != null ? arm0.n(r2) : null;
                String r3 = peq0Var.r("returnUrl");
                AccountFragment.a a6 = AccountFragment.b.a(i4, uri6, r, null, false, false, (n3 == null || r3 == null) ? null : new ReloginParams(new UserId(n3.longValue()), new AuthPayload(r3)), null, 184);
                a6.s(uri.getQueryParameterNames().contains("noBottomNavigation"));
                a6.k(context2);
                yp80Var2.onSuccess();
            } else {
                if (jh.h("/disable_page/?(.*)", peq0Var, null, null, 14)) {
                    com.vk.common.links.c.y(context, peq0Var);
                    yp80Var2.onSuccess();
                    context2 = context;
                    str2 = "";
                    r13 = 0;
                } else if (jh.h("/restore/?(.+)?", peq0Var, null, null, 14)) {
                    Uri h2 = peq0Var.h();
                    Activity h3 = e3m.h(context);
                    if (h3 != null) {
                        int i6 = RestoreFragment.a0;
                        a2 = RestoreFragment.b.a(h2.toString(), null, null);
                        a2.s(true);
                        a2.t();
                        a2.o();
                        h3.startActivityForResult(a2.n(context), 421);
                        yp80Var2.onSuccess();
                    }
                    context2 = context;
                    str2 = "";
                    r13 = 0;
                } else {
                    if (jh.h("/code_auth", peq0Var, null, null, 14)) {
                        str2 = "";
                        obj6 = null;
                        m(context, peq0Var.h(), launchContext, "auth_code", yp80Var2);
                    } else {
                        str2 = "";
                        ?? r132 = 0;
                        if (jh.h("/ca", peq0Var, null, null, 14)) {
                            m(context, peq0Var.h(), launchContext, CampaignEx.JSON_KEY_AD_Q, yp80Var2);
                            obj6 = r132;
                        } else if (naz.m(uri) && jh.h("/rustore", peq0Var, null, null, 14)) {
                            m(context, uri, launchContext, CampaignEx.JSON_KEY_AD_Q, yp80Var2);
                            obj6 = r132;
                        } else {
                            final Uri uri7 = uri;
                            if (naz.B(uri7) && ((koe0) this.c.getValue()).e()) {
                                final yp80 yp80Var6 = yp80Var2;
                                uri = uri7;
                                n("qrWebToApp", new gzs() { // from class: xsna.yf6
                                    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
                                    @Override // xsna.gzs
                                    public final Object invoke() {
                                        ((koe0) dg6.this.c.getValue()).a(context, uri7, launchContext.p);
                                        yp80Var6.onSuccess();
                                        return s3q0.a;
                                    }
                                });
                                obj6 = r132;
                            } else {
                                uri = uri7;
                                if (naz.k(uri)) {
                                    m(context, peq0Var.h(), launchContext, CampaignEx.JSON_KEY_AD_Q, yp80Var2);
                                    context2 = context;
                                    launchContext2 = launchContext;
                                    z13 = r132;
                                } else {
                                    context2 = context;
                                    launchContext2 = launchContext;
                                    if (uri.getPathSegments().size() > 0) {
                                        com.vk.common.links.c.T(context2, uri, launchContext2, uri.getPathSegments().get(0), yp80Var2);
                                        z13 = r132;
                                    } else {
                                        z15 = false;
                                        z13 = r132;
                                        z14 = r132;
                                    }
                                }
                            }
                        }
                    }
                    context2 = context;
                    r13 = obj6;
                }
                launchContext2 = launchContext;
                z13 = r13;
            }
            z15 = true;
            z14 = z13;
            if (!z15) {
                return false;
            }
            z = z15;
            obj = z14;
        }
        if (z) {
            z3 = false;
        } else {
            if (naz.p(uri) && (path = uri.getPath()) != null && path.hashCode() == 46673157 && path.equals("/jobs")) {
                if (!launchContext2.s()) {
                    ((j63) this).h.d(context2, uri, true);
                    yp80Var2.onSuccess();
                }
                z = true;
            } else {
                z = false;
            }
            z3 = z;
        }
        if (!z) {
            if (Uri.parse(a3).getScheme() == null) {
                a3 = naz.a(a3);
            }
            Uri parse3 = Uri.parse(a3);
            if (!launchContext2.h() && (epx.f(parse3.getHost(), "clips.".concat(a0a.d)) || epx.f(parse3.getScheme(), "vkclips"))) {
                try {
                    Intent intent = new Intent();
                    intent.setData(parse3);
                    intent.setPackage("com.vk.clips");
                    if (intent.resolveActivity(context6.getPackageManager()) != null) {
                        context6.startActivity(intent);
                    } else {
                        s101.H(s101.c, context6, "com.vk.clips", obj, 12);
                    }
                    z = true;
                } catch (Throwable unused2) {
                }
            }
            z = false;
        }
        if (z) {
            Context context7 = context6;
            context3 = context2;
            context4 = context7;
            uri2 = uri;
            r11 = obj;
            z4 = false;
            i = 3;
            z5 = true;
            dg6Var = this;
            launchContext3 = launchContext2;
            yp80Var3 = yp80Var2;
        } else {
            if ("vk.me".equals(uri.getHost())) {
                peq0 peq0Var2 = new peq0(uri);
                String r4 = peq0Var2.r("ref");
                String r5 = peq0Var2.r("ref_source");
                try {
                    failure = new JSONObject(peq0Var2.v()).toString();
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                if (failure instanceof Result.Failure) {
                    failure = obj;
                }
                String str7 = (String) failure;
                new io.reactivex.rxjava3.disposables.b();
                if (peq0.p(peq0Var2, new Regex("^/id([-0-9]+)$"), obj, obj, 14)) {
                    obj5 = obj;
                    i = 3;
                    yp80Var5 = yp80Var2;
                    z11 = false;
                    com.vk.common.links.c.t(context6, null, peq0Var2.c(1), 0, null, r4, r5, launchContext2.e(), false, yp80Var5, null, null, null, 7450);
                } else {
                    ?? r112 = obj;
                    i = 3;
                    z11 = false;
                    if (jh.h("^/(?:club|public|event)([-0-9]+)$", peq0Var2, r112, r112, 14)) {
                        yp80Var5 = yp80Var2;
                        com.vk.common.links.c.t(context6, null, -peq0Var2.c(1), 0, null, r4, r5, launchContext2.e(), false, yp80Var5, null, null, null, 7450);
                        obj5 = r112;
                    } else {
                        if (!jh.h("^/join/([A-Za-z0-9._/=+]+)$", peq0Var2, r112, r112, 14)) {
                            context4 = context6;
                            launchContext5 = launchContext2;
                            Uri uri8 = uri;
                            dg6Var = this;
                            if (peq0.p(peq0Var2, laz.g(), r112, r112, 14)) {
                                ((j63) dg6Var).h.i(context4, peq0Var2.h(), launchContext5, r112);
                                yp80Var2.onSuccess();
                                uri2 = uri8;
                                yp80Var3 = yp80Var2;
                            } else if (jh.h("/([A-Za-z0-9._]+)", peq0Var2, r112, r112, 14)) {
                                String a7 = peq0Var2.a(1);
                                Long n4 = arm0.n(a7);
                                if (n4 != null) {
                                    yp80 yp80Var7 = yp80Var2;
                                    com.vk.common.links.c.t(context4, null, n4.longValue(), 0, null, r4, r5, launchContext5.e(), false, yp80Var7, str7, null, null, 6426);
                                    launchContext3 = launchContext5;
                                    uri2 = uri8;
                                    z12 = true;
                                    z5 = true;
                                    context4 = context4;
                                    yp80Var3 = yp80Var7;
                                } else if (o25.b(o25.a())) {
                                    z12 = ((j63) dg6Var).f.j(context4, uri8, launchContext5, yp80Var2);
                                    launchContext3 = launchContext5;
                                    uri2 = uri8;
                                    z5 = true;
                                    yp80Var3 = yp80Var2;
                                    context4 = context4;
                                } else {
                                    launchContext3 = launchContext5;
                                    uri2 = uri8;
                                    z5 = true;
                                    context4 = context4;
                                    context3 = context;
                                    com.vk.common.links.c.w(context4, a7, r4, r5, str7, yp80Var2);
                                    yp80Var3 = yp80Var2;
                                    z12 = true;
                                    z4 = false;
                                    obj2 = r112;
                                    if (z12) {
                                    }
                                }
                                context3 = context;
                                z4 = false;
                                obj2 = r112;
                                if (z12) {
                                }
                            } else {
                                uri2 = uri8;
                                yp80Var3 = yp80Var2;
                                launchContext3 = launchContext5;
                                z4 = false;
                                z5 = true;
                                context3 = context;
                                if (jh.h("/products/(.*)", peq0Var2, r112, r112, 14)) {
                                    WebViewFragment.c cVar = new WebViewFragment.c(uri2);
                                    cVar.D();
                                    cVar.H(str2);
                                    cVar.N(false);
                                    cVar.E();
                                    cVar.C();
                                    cVar.k(context4);
                                } else {
                                    ((j63) dg6Var).h.i(context4, peq0Var2.h(), launchContext3, r112);
                                    yp80Var3.onSuccess();
                                }
                                z11 = true;
                                obj3 = r112;
                                z12 = z11;
                                obj2 = obj3;
                                if (z12) {
                                }
                            }
                        } else if (o25.b(o25.a())) {
                            Context context8 = context6;
                            context3 = context2;
                            context4 = context8;
                            launchContext3 = launchContext2;
                            yp80Var3 = yp80Var2;
                            uri2 = uri;
                            z4 = false;
                            obj4 = r112;
                            z5 = true;
                            dg6Var = this;
                            obj3 = obj4;
                            z12 = z11;
                            obj2 = obj3;
                            if (z12) {
                                z = z5;
                                r11 = obj2;
                            }
                        } else {
                            yp80 yp80Var8 = yp80Var2;
                            context4 = context6;
                            launchContext5 = launchContext2;
                            Uri uri9 = uri;
                            dg6Var = this;
                            com.vk.common.links.c.v(context4, uri9, yp80Var8, r4, r5, 32);
                            uri2 = uri9;
                            yp80Var3 = yp80Var8;
                        }
                        launchContext3 = launchContext5;
                        z4 = false;
                        z11 = true;
                        z5 = true;
                        context3 = context;
                        obj3 = r112;
                        z12 = z11;
                        obj2 = obj3;
                        if (z12) {
                        }
                    }
                }
                Context context9 = context6;
                context3 = context2;
                context4 = context9;
                launchContext3 = launchContext2;
                uri2 = uri;
                yp80Var3 = yp80Var5;
                z4 = z11;
                z11 = true;
                obj4 = obj5;
                z5 = true;
                dg6Var = this;
                obj3 = obj4;
                z12 = z11;
                obj2 = obj3;
                if (z12) {
                }
            } else {
                Context context10 = context6;
                context3 = context2;
                context4 = context10;
                uri2 = uri;
                obj2 = obj;
                z4 = false;
                i = 3;
                z5 = true;
                dg6Var = this;
                launchContext3 = launchContext2;
                yp80Var3 = yp80Var2;
            }
            z = z4;
            r11 = obj2;
        }
        if (!z) {
            if (naz.n(uri2)) {
                if (!((j63) dg6Var).f.j(context4, uri2, launchContext3, yp80Var3)) {
                    try {
                        Intent intent2 = new Intent();
                        intent2.setData(uri2);
                        intent2.setPackage("com.vk.im");
                        context4.startActivity(intent2);
                    } catch (Throwable unused3) {
                        z10 = z4;
                    }
                }
                z10 = z5;
                if (z10) {
                    z = z5;
                }
            }
            z = z4;
        }
        if (z) {
            yp80Var4 = yp80Var3;
        } else if (naz.l(uri2)) {
            yp80Var4 = yp80Var3;
            Context context11 = context4;
            context4 = context11;
            hg1.m(rsg0.y0(new c4r0(uri2.toString()), r11, r11, i), context11, 0L, false, 62).subscribe(new fu0(new z14(uri2, context4, yp80Var4, i), i), new h60(new a8(yp80Var4, 9), i));
            z = z5;
        } else {
            yp80Var4 = yp80Var3;
            z = false;
        }
        if (z) {
            bundle2 = bundle;
            context5 = context4;
            launchContext4 = launchContext3;
        } else {
            if (naz.C(uri2.toString())) {
                peq0 peq0Var3 = new peq0(uri2);
                if (jh.h("/help/?", peq0Var3, r11, r11, 14)) {
                    z9 = dg6Var.d(context4, jeq0.g("https://" + a0a.d + "/write-22884714?ref_source=hd"), launchContext3, yp80Var4);
                    bundle2 = bundle;
                    context5 = context4;
                    launchContext4 = launchContext3;
                } else {
                    if (jh.h("/AskUs/?", peq0Var3, r11, r11, 14)) {
                        com.vk.common.links.c.b0(context4, uri2, r11, 8);
                        bundle2 = bundle;
                        context5 = context4;
                        launchContext4 = launchContext3;
                    } else if (jh.h("/future/?", peq0Var3, r11, r11, 14)) {
                        bundle2 = bundle;
                        Context context12 = context4;
                        launchContext4 = launchContext3;
                        dg6Var.l(context12, i5s.a(new StringBuilder("m."), a0a.d, "/up"), launchContext4, bundle2, yp80Var4);
                        context5 = context12;
                    } else {
                        bundle2 = bundle;
                        context5 = context4;
                        launchContext4 = launchContext3;
                        com.vk.common.links.c.V(context5, uri2, launchContext4, bundle2, yp80Var4);
                    }
                    z9 = z5;
                }
                if (z9) {
                    z8 = z5;
                    z = z8;
                }
            } else {
                bundle2 = bundle;
                context5 = context4;
                launchContext4 = launchContext3;
            }
            z8 = false;
            z = z8;
        }
        if (!z && (z = naz.h(uri2.toString()))) {
            com.vk.common.links.c.D(context5, uri2, launchContext4, bundle2, yp80Var4);
        }
        if (z) {
            z6 = z;
        } else {
            z6 = (naz.y(uri2) && ((j63) this).f.j(context5, uri2, launchContext4, yp80Var4)) ? z5 : false;
        }
        if (!z6 && naz.i(uri2)) {
            com.vk.common.links.c.N(context5, uri2, launchContext4, yp80Var);
            z6 = z5;
        }
        if (!z6) {
            z6 = (((!naz.s(uri2) || naz.r(uri2)) && !naz.u(uri2)) || naz.z(uri2) || !((j63) this).f.j(context5, uri2, launchContext4, yp80Var4)) ? false : z5;
        }
        if (!z6 && epx.f(MimeTypeMap.getFileExtensionFromUrl(str), "pdf")) {
            g2v.c().getClass();
            i35.f.i(context3, uri2);
            z6 = z5;
        }
        mbw.a.getClass();
        if (mbw.c().getBoolean("is_sbp_dialog_enabled", false) && um70.a(uri2)) {
            Context context13 = context3;
            while (true) {
                z7 = context13 instanceof FragmentActivity;
                if (!z7 && (context13 instanceof ContextWrapper)) {
                    context13 = ((ContextWrapper) context13).getBaseContext();
                }
            }
            FragmentActivity fragmentActivity = (FragmentActivity) (z7 ? (Activity) context13 : r11);
            if (fragmentActivity != null && (supportFragmentManager = fragmentActivity.getSupportFragmentManager()) != null) {
                int i7 = lm70.l1;
                lm70.a.a(uri2).Td(supportFragmentManager, uri2.toString());
                yp80Var4.onSuccess();
                z6 = z5;
            }
        }
        if (z6 || launchContext4.s()) {
            uri3 = uri2;
        } else {
            if (naz.p(uri2)) {
                uri3 = uri2;
                ((j63) this).h.i(context3, uri3, launchContext4, bundle2);
            } else {
                LaunchContext launchContext6 = launchContext4;
                uri3 = uri2;
                rk8.g(((j63) this).h, context3, uri3, launchContext6, bundle, 16);
                bundle2 = bundle;
                launchContext4 = launchContext6;
            }
            yp80Var4.onSuccess();
            z6 = z5;
        }
        if (!z6) {
            j63 j63Var = (j63) this;
            if (launchContext4.s()) {
                z6 = false;
            } else {
                if (naz.p(uri3)) {
                    j63Var.h.i(context5, uri3, launchContext4, bundle2);
                } else {
                    LaunchContext launchContext7 = launchContext4;
                    rk8.g(j63Var.h, context5, uri3, launchContext7, bundle, 16);
                    launchContext4 = launchContext7;
                }
                yp80Var4.onSuccess();
                z6 = z5;
            }
            if (z6 && uri3.getQueryParameter("utm_source") != null && naz.j(uri3)) {
                b.d dVar = new b.d("open_url_with_utm_codes");
                dVar.b(uri3.toString(), "url");
                dVar.h();
            }
        }
        if (z3 && launchContext4.s()) {
            return false;
        }
        return z6;
    }

    public final void m(final Context context, final Uri uri, final LaunchContext launchContext, final String str, final yp80 yp80Var) {
        String host = uri.getHost();
        if (host != null && drm0.D(host, "oauth", false)) {
            int i = OldQrAuthFragment.U;
            OldQrAuthFragment.a.a(context, uri.toString());
        } else {
            if ((host == null || !drm0.D(host, "id", false)) && (host == null || !drm0.D(host, "qr", false))) {
                return;
            }
            n("qr", new gzs() { // from class: xsna.cg6
                @Override // xsna.gzs
                public final Object invoke() {
                    Context context2 = context;
                    sv20 sv20Var = new sv20(context2);
                    Uri uri2 = uri;
                    String str2 = str;
                    sv20Var.a(context2, new ModalAuthOpenerInterface$AuthParams(uri2.getQueryParameter(str2), uri2.getQueryParameter(str2), launchContext.p, uri2.getQueryParameter("app_id")), new dg6.a(yp80Var));
                    return s3q0.a;
                }
            });
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void n(String str, gzs<s3q0> gzsVar) {
        io.reactivex.rxjava3.core.q<Boolean> e;
        ?? r0 = this.d;
        v57 v57Var = (v57) r0.getValue();
        if (!v57Var.a()) {
            v57Var = null;
        }
        if ((v57Var == null || (e = v57Var.e()) == null) ? false : e.a().booleanValue()) {
            ((v57) r0.getValue()).f(str, gzsVar);
        } else {
            gzsVar.invoke();
        }
    }
}
