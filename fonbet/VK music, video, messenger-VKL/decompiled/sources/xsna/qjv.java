package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import androidx.fragment.app.FragmentActivity;
import com.ironsource.B5;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.auth.DefaultAuthActivity;
import com.vk.auth.main.AuthActivity;
import com.vk.browserlogin.api.di.BrowserLoginComponent;
import com.vk.common.links.LaunchContext;
import com.vk.core.apps.BuildInfo;
import com.vk.dto.articles.Article;
import com.vk.dto.common.id.UserId;
import com.vk.fave.entities.FaveCategory;
import com.vk.fave.entities.FaveSource;
import com.vk.fave.fragments.FavesFragment;
import com.vk.feature.uxpolls.modalpoll.UxPollsModalFragment;
import com.vk.home.HomeFragment2;
import com.vk.im.ui.fragments.chat.ChatAnalyticsParams;
import com.vk.money.MoneyTransferPagerFragment;
import com.vk.money.MoneyTransfersFragment;
import com.vk.newsfeed.api.NewsfeedRouter;
import com.vk.newsfeed.api.di.NewsfeedRouterComponent;
import com.vk.newsfeed.impl.feedlikes.FeedLikesPhotoFragment;
import com.vk.poll.fragments.PollViewerFragment;
import com.vk.settings.GetAccountSettingsRequest;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.story.api.LoadContext;
import com.vk.story.viewer.api.StoryViewerRouter;
import com.vk.superapp.browser.internal.utils.InternalMiniApps;
import com.vk.superapp.miniapps.api.utils.InternalVkMiniApps;
import com.vk.superapp.miniapps.impl.AppsCatalogFragment;
import com.vk.superapp.miniapps.impl.AppsCatalogSectionDetailsFragment;
import com.vk.superapp.ui.SuperAppFragment;
import com.vk.toggle.anonymous.SakFeatures;
import com.vk.webapp.fragments.ProfileEditFragment;
import com.vk.webapp.fragments.VkPayFragment;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.WebViewFragment;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Result;
import kotlin.text.Regex;
import org.json.JSONObject;
import ru.ok.android.utils.Logger;
import xsna.c9x0;
import xsna.dw20;

/* compiled from: HttpLinkProcessor.kt */
/* loaded from: classes.dex */
public abstract class qjv implements w8i {
    public final bpn0 b = new bpn0(new yg9(this, 3));

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0040, code lost:
    
        if (xsna.drm0.D(r0, xsna.f870.w(com.vk.superapp.miniapps.api.utils.InternalVkMiniApps.VKPAY_INSTALLMENT.h()), false) == false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static peq0 d(Context context, Uri uri) {
        String path = uri.getPath();
        if (path != null) {
            if (!drm0.D(path, "/vkpay", false)) {
                InternalMiniApps.Companion.getClass();
                if (!drm0.D(path, f870.w(InternalMiniApps.a.a().h()), false)) {
                    if (!drm0.D(path, "/vkpay_installment", false)) {
                    }
                }
            }
            String encodedFragment = uri.getEncodedFragment();
            Activity h = e3m.h(context);
            Uri referrer = h != null ? h.getReferrer() : null;
            if (referrer != null && naz.f(referrer.toString())) {
                encodedFragment = (encodedFragment == null ? "" : encodedFragment.concat("&")) + "http_referrer=" + referrer;
            }
            String queryParameter = uri.getQueryParameter("utm_source");
            if (queryParameter != null) {
                encodedFragment = pzl.b(encodedFragment == null ? "" : encodedFragment.concat("&"), "utm_source=", queryParameter);
            }
            if (encodedFragment != null) {
                uri = uri.buildUpon().encodedFragment(encodedFragment).build();
            }
        }
        peq0 peq0Var = new peq0(uri);
        String r = peq0Var.r("z");
        if (r == null || r.length() == 0) {
            r = peq0Var.r(Logger.METHOD_W);
        }
        if (r == null || r.length() <= 0) {
            String r2 = peq0Var.r("u");
            if (r2 != null) {
                String[] f = peq0Var.f();
                String path2 = jeq0.g(r2).getPath();
                peq0Var.w((String[]) jw5.z(f, new String[]{path2 != null ? path2 : ""}));
                peq0Var.x();
            }
            return peq0Var;
        }
        List a = n6j.a(0, DomExceptionUtils.SEPARATOR, r);
        ArrayList arrayList = new ArrayList(c5g.u(a, 10));
        Iterator it = a.iterator();
        while (it.hasNext()) {
            arrayList.add(DomExceptionUtils.SEPARATOR + ((String) it.next()));
        }
        peq0Var.w((String[]) arrayList.toArray(new String[0]));
        peq0Var.x();
        return peq0Var;
    }

    public static void f(Context context, Uri uri) {
        io.reactivex.rxjava3.core.q a = GetAccountSettingsRequest.a();
        asu0 asu0Var = asu0.a;
        a.r0(asu0Var.c()).a0(asu0Var.d()).subscribe(new k41(new bv1(16, context, uri), 23), new b00(new wr0(23), 27));
    }

    public static void g(Context context, String str) {
        if (!q6r0.f().e(m6r0.t0)) {
            new oz50(ProfileEditFragment.class, null, null).k(context);
        } else {
            int i = ProfileEditFragment.a0;
            ProfileEditFragment.b.a(str, null, 2).k(context);
        }
    }

    public static void i(Context context, String str) {
        new AppsCatalogSectionDetailsFragment.a(str, null).k(context);
    }

    public static void l(Context context, peq0 peq0Var) {
        boolean f = epx.f(peq0Var.r("act"), "money_request");
        boolean f2 = epx.f(peq0Var.r("act"), "user_link");
        boolean z = !epx.f(peq0Var.r("act"), "request_history");
        String r = peq0Var.r("amount");
        UserId userId = new UserId(peq0Var.u("to_id"));
        if (fkq0.c(userId)) {
            MoneyTransferPagerFragment.a aVar = new MoneyTransferPagerFragment.a();
            aVar.B(userId);
            if (r == null) {
                r = "";
            }
            aVar.y(r);
            aVar.A(f);
            aVar.k(context);
            return;
        }
        MoneyTransfersFragment.d dVar = new MoneyTransfersFragment.d();
        dVar.C();
        dVar.z(z);
        if (r == null) {
            r = "";
        }
        dVar.y(r);
        dVar.B(f);
        dVar.A(f2);
        dVar.k(context);
    }

    public boolean a(Context context, Uri uri) {
        return jh.h("/restore/?(.+)?", d(context, uri), null, null, 14);
    }

    public abstract rk8 b();

    public abstract StoryViewerRouter c();

    public abstract Boolean e(Context context, Uri uri, LaunchContext launchContext, yp80 yp80Var, peq0 peq0Var);

    public final void h(Context context, String str, boolean z) {
        if (!z) {
            if (str != null) {
                int hashCode = str.hashCode();
                if (hashCode != -907730174) {
                    if (hashCode != 3599307) {
                        if (hashCode == 98629247 && str.equals("group")) {
                            FavesFragment.a aVar = new FavesFragment.a();
                            aVar.y(FaveCategory.COMMUNITY, FaveSource.LINK_PROCESSOR);
                            aVar.k(context);
                            return;
                        }
                    } else if (str.equals("user")) {
                        FavesFragment.a aVar2 = new FavesFragment.a();
                        aVar2.y(FaveCategory.PEOPLE, FaveSource.LINK_PROCESSOR);
                        aVar2.k(context);
                        return;
                    }
                } else if (str.equals("bookmarks_pages")) {
                    FavesFragment.a aVar3 = new FavesFragment.a();
                    aVar3.y(FaveCategory.PEOPLE, FaveSource.LINK_PROCESSOR);
                    aVar3.k(context);
                    return;
                }
            }
            FavesFragment.a aVar4 = new FavesFragment.a();
            FaveCategory.Companion.getClass();
            aVar4.y(FaveCategory.a.b(str), FaveSource.LINK_PROCESSOR);
            aVar4.k(context);
            return;
        }
        boolean f = epx.f(str, "likes_photo");
        boolean z2 = true;
        if (!epx.f(str, "likes_posts") && !epx.f(str, "likes_video")) {
            z2 = false;
        }
        if (f) {
            new FeedLikesPhotoFragment.a().k(context);
            return;
        }
        if (z2) {
            ((NewsfeedRouterComponent) ((k7m) m7m.f(this)).a(fpf0.a(NewsfeedRouterComponent.class))).l0().d0(context, str);
        } else if (epx.f(str, "links")) {
            FavesFragment.a aVar5 = new FavesFragment.a();
            aVar5.y(FaveCategory.LINK, FaveSource.LINK_PROCESSOR);
            aVar5.k(context);
        } else if (epx.f(str, "articles")) {
            FavesFragment.a aVar6 = new FavesFragment.a();
            aVar6.y(FaveCategory.ARTICLE, FaveSource.LINK_PROCESSOR);
            aVar6.k(context);
        } else {
            FavesFragment.a aVar7 = new FavesFragment.a();
            FaveCategory.Companion.getClass();
            aVar7.y(FaveCategory.a.b(str), FaveSource.LINK_PROCESSOR);
            aVar7.k(context);
        }
    }

    public final boolean j(Context context, Uri uri, LaunchContext launchContext, yp80 yp80Var) {
        Context context2;
        Uri uri2;
        LaunchContext launchContext2;
        yp80 pjvVar;
        qjv qjvVar;
        peq0 d = d(context, uri);
        if (yp80Var != null && SakFeatures.Type.NEW_GEOBLOCK_ERROR.h()) {
            context2 = context;
            uri2 = uri;
            launchContext2 = launchContext;
            pjvVar = new pjv(yp80Var, this, context);
            qjvVar = this;
        } else {
            qjvVar = this;
            context2 = context;
            uri2 = uri;
            launchContext2 = launchContext;
            pjvVar = yp80Var;
        }
        return qjvVar.k(context2, uri2, launchContext2, pjvVar, d);
    }

    /* JADX WARN: Removed duplicated region for block: B:228:0x056e  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0575  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x057c  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0583  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0aab  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean k(Context context, Uri uri, LaunchContext launchContext, yp80 yp80Var, peq0 peq0Var) {
        boolean m;
        boolean z;
        boolean m2;
        boolean m3;
        boolean m4;
        boolean m5;
        boolean m6;
        boolean m7;
        boolean m8;
        boolean m9;
        boolean m10;
        boolean m11;
        boolean m12;
        boolean m13;
        boolean m14;
        boolean m15;
        boolean m16;
        boolean m17;
        boolean m18;
        boolean m19;
        boolean m20;
        boolean m21;
        int i;
        Object failure;
        boolean z2;
        int t;
        String r;
        String r2;
        String r3;
        String e;
        String k;
        boolean m22;
        Uri h = peq0Var.h();
        if (naz.w(h)) {
            ver0.a(((BrowserLoginComponent) ((k7m) m7m.f(this)).a(fpf0.a(BrowserLoginComponent.class))).of().a(context));
            if (yp80Var != null) {
                yp80Var.onSuccess();
                s3q0 s3q0Var = s3q0.a;
                return true;
            }
        } else if (naz.D(h)) {
            agx0.a(context, b(), h);
            if (yp80Var != null) {
                yp80Var.onSuccess();
                s3q0 s3q0Var2 = s3q0.a;
                return true;
            }
        } else {
            if (!launchContext.s()) {
                m22 = peq0Var.m(0, "/share.php");
                if (m22 && peq0Var.j("url")) {
                    b().h(context, peq0Var.r("url"));
                    if (yp80Var != null) {
                        yp80Var.onSuccess();
                        s3q0 s3q0Var3 = s3q0.a;
                        return true;
                    }
                }
            }
            m = peq0Var.m(0, "/app/away.php");
            r5 = null;
            Integer num = null;
            MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint = null;
            if (!m) {
                m2 = peq0Var.m(0, "/away.php");
                if (!m2) {
                    m3 = peq0Var.m(0, "/away");
                    if (!m3) {
                        m4 = peq0Var.m(0, "/email_direct.php");
                        if (m4) {
                            b().i(context, peq0Var.h(), new LaunchContext(false, false, false, null, null, null, null, null, null, null, null, true, false, false, null, null, null, null, null, false, false, null, null, null, 67098623), null);
                            s3q0 s3q0Var4 = s3q0.a;
                        } else if (peq0Var.j("_fm")) {
                            b().i(context, peq0Var.h(), launchContext, null);
                            s3q0 s3q0Var5 = s3q0.a;
                        } else {
                            int i2 = 0;
                            boolean z3 = false;
                            if (jh.h("/poll([-0-9]+)_([0-9]+)", peq0Var, null, null, 14)) {
                                new PollViewerFragment.a(peq0Var.b(2), new UserId(peq0Var.b(1)), "poll", z3 ? 1 : 0).k(context);
                                s3q0 s3q0Var6 = s3q0.a;
                            } else {
                                m5 = peq0Var.m(0, "/stickers");
                                if (m5) {
                                    com.vk.common.links.c.a0(context, peq0Var.h(), peq0Var.r("ref"), yp80Var);
                                    return true;
                                }
                                m6 = peq0Var.m(0, "/stickers/catalog");
                                if (m6) {
                                    com.vk.common.links.c.a0(context, peq0Var.h(), peq0Var.r("ref"), yp80Var);
                                    return true;
                                }
                                if (jh.h("/stickers/([0-_9]+)", peq0Var, null, null, 14)) {
                                    return com.vk.common.links.c.Y(context, peq0Var.a(1), peq0Var.r("ref"), yp80Var);
                                }
                                if (jh.h("/stickers/([a-zA-Z0-_9]+)", peq0Var, null, null, 14)) {
                                    return com.vk.common.links.c.Z(context, peq0Var.a(1), peq0Var.r("ref"), peq0Var.r("page"), yp80Var);
                                }
                                if (jh.h("/stickers/packs/([0-_9]+)", peq0Var, null, null, 14)) {
                                    return com.vk.common.links.c.Y(context, peq0Var.a(1), peq0Var.r("ref"), yp80Var);
                                }
                                if (jh.h("/stickers/packs/([a-zA-Z0-_9]+)", peq0Var, null, null, 14)) {
                                    return com.vk.common.links.c.Z(context, peq0Var.a(1), peq0Var.r("ref"), null, yp80Var);
                                }
                                if (jh.h("/stickers/catalog/energy/rules", peq0Var, null, null, 14)) {
                                    if (launchContext.s()) {
                                        return false;
                                    }
                                    WebViewFragment.c cVar = new WebViewFragment.c(h);
                                    cVar.z();
                                    cVar.D();
                                    cVar.E();
                                    cVar.C();
                                    cVar.A();
                                    cVar.k(context);
                                    return true;
                                }
                                if (jh.h("/stickers/catalog/energy", peq0Var, null, null, 14)) {
                                    com.vk.common.links.c.X(context, yp80Var);
                                    return true;
                                }
                                if (jh.h("/stickers/catalog/([a-zA-Z0-_9/]+)", peq0Var, null, null, 14)) {
                                    com.vk.common.links.c.a0(context, peq0Var.h(), peq0Var.r("ref"), yp80Var);
                                    return true;
                                }
                                if (jh.h("/vmoji([0-9]+)_([A-Za-z0-9_-]+?)(_[0-9]+)?$", peq0Var, null, null, 14)) {
                                    long c = peq0Var.c(1);
                                    String a = peq0Var.a(2);
                                    String d = peq0Var.d(3);
                                    if (d != null) {
                                        try {
                                            i2 = Integer.parseInt(erm0.v0(1, d));
                                        } catch (Throwable unused) {
                                        }
                                        num = Integer.valueOf(i2);
                                    }
                                    com.vk.common.links.c.c0(context, c, a, num, yp80Var);
                                    return true;
                                }
                                if (jh.h("/gifts/(-?[0-_9]+)", peq0Var, null, null, 14)) {
                                    return com.vk.common.links.c.U(context, peq0Var.a(1), peq0Var.r("to_id"), peq0Var.r("text"), peq0Var.r("ref"), yp80Var);
                                }
                                if (jh.h("/gifts([0-9]+)/catalog", peq0Var, null, null, 14)) {
                                    peq0Var.c(1);
                                    com.vk.common.links.c.F(context, yp80Var, peq0Var.r("to_id"), peq0Var.r("ref"), false, false, null, 224);
                                    return true;
                                }
                                if (jh.h("/gifts([0-9]+)", peq0Var, null, null, 14)) {
                                    if (!epx.f(peq0Var.r("act"), "send")) {
                                        com.vk.common.links.c.E(context, peq0Var.a(1), yp80Var);
                                        return true;
                                    }
                                    boolean f = epx.f(h.getQueryParameter("close_on_finish"), "1");
                                    peq0Var.c(1);
                                    com.vk.common.links.c.F(context, yp80Var, null, peq0Var.r("ref"), false, f, null, 168);
                                    return true;
                                }
                                m7 = peq0Var.m(0, "/gifts");
                                if (m7) {
                                    if (!epx.f(peq0Var.r("act"), "send")) {
                                        com.vk.common.links.c.E(context, String.valueOf(o25.a().c().b), yp80Var);
                                        return true;
                                    }
                                    boolean f2 = epx.f(h.getQueryParameter("close_on_finish"), "1");
                                    long j = o25.a().c().b;
                                    com.vk.common.links.c.F(context, yp80Var, null, h.getQueryParameter("ref"), launchContext.i(), f2, null, Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE);
                                    return true;
                                }
                                m8 = peq0Var.m(0, "/gifts/catalog");
                                if (m8) {
                                    if (peq0Var.r("to_id") == null && peq0Var.r("close_on_finish") == null) {
                                        com.vk.common.links.c.G(context, yp80Var, null, peq0Var.v(), launchContext.i());
                                        return true;
                                    }
                                    com.vk.common.links.c.F(context, yp80Var, peq0Var.r("to_id"), h.getQueryParameter("ref"), launchContext.i(), epx.f(h.getQueryParameter("close_on_finish"), "1"), peq0Var.r("text"), 2);
                                    return true;
                                }
                                if (jh.h("/gifts/catalog/([a-zA-Z0-9/]+).*", peq0Var, null, null, 14)) {
                                    com.vk.common.links.c.G(context, yp80Var, peq0Var.d(1), peq0Var.v(), launchContext.i());
                                    return true;
                                }
                                if (jh.h("/support/?", peq0Var, null, null, 14)) {
                                    if (h.getQueryParameterNames().size() == 1 && h.getQueryParameter("act") != null && brm0.w(h.getQueryParameter("act"), "faqs", false)) {
                                        h = h.buildUpon().clearQuery().build();
                                    }
                                    com.vk.common.links.c.b0(context, h, null, 12);
                                } else if (jh.h("/help/?", peq0Var, null, null, 14) && !epx.f(peq0Var.r("act"), "cc_terms")) {
                                    com.vk.common.links.c.b0(context, jeq0.g(a0a.d.concat("/support?act=new&from=h")), null, 12);
                                } else if (peq0.p(peq0Var, new Regex("/ru/(.+)"), new Regex("^/ru/.+$"), new Regex("^/ru/route.+"), 8)) {
                                    com.vkontakte.android.fragments.h hVar = new com.vkontakte.android.fragments.h();
                                    hVar.h(peq0Var.a(1));
                                    hVar.a(context);
                                } else {
                                    if (!jh.h("/(?:blog|press)/(.+)", peq0Var, null, null, 14)) {
                                        if (jh.h("/bug(tracker|s|\\d+)/?", peq0Var, null, null, 14)) {
                                            return com.vk.common.links.c.j0(context, h, yp80Var);
                                        }
                                        String str = "";
                                        if (jh.h("/write([-0-9]+)", peq0Var, null, null, 14)) {
                                            long c2 = peq0Var.c(1);
                                            String r4 = peq0Var.r("ref");
                                            String str2 = r4 == null ? "" : r4;
                                            String r5 = peq0Var.r("ref_source");
                                            String str3 = r5 == null ? "" : r5;
                                            String e2 = launchContext.e();
                                            if (e2 == null) {
                                                e2 = peq0Var.r("entry_point");
                                            }
                                            com.vk.common.links.c.t(context, null, c2, 0, null, str2, str3, e2, false, yp80Var, null, null, null, 7450);
                                            return true;
                                        }
                                        if (jh.h("/mr([-0-9]+)", peq0Var, null, null, 14)) {
                                            long c3 = peq0Var.c(1);
                                            String r6 = peq0Var.r("ref");
                                            String str4 = r6 == null ? "" : r6;
                                            String r7 = peq0Var.r("ref_source");
                                            com.vk.common.links.c.t(context, null, c3, 0, null, str4, r7 == null ? "" : r7, launchContext.e(), true, yp80Var, null, null, null, 7194);
                                            return true;
                                        }
                                        m9 = peq0Var.m(0, "/im");
                                        if (m9) {
                                            String r8 = peq0Var.r("to_id");
                                            Long k2 = r8 != null ? cqm0.k(r8) : null;
                                            boolean f3 = epx.f(peq0Var.r("show_requests"), "1");
                                            String r9 = peq0Var.r("sel");
                                            long n = r9 != null ? atv0.n(r9) : 0L;
                                            try {
                                                failure = new JSONObject(peq0Var.v()).toString();
                                            } catch (Throwable th) {
                                                failure = new Result.Failure(th);
                                            }
                                            String str5 = (String) (failure instanceof Result.Failure ? null : failure);
                                            if (f3) {
                                                g2v.c().b().l(context);
                                                if (yp80Var != null) {
                                                    yp80Var.onSuccess();
                                                    s3q0 s3q0Var7 = s3q0.a;
                                                }
                                                return true;
                                            }
                                            if (n == 0) {
                                                g2v.c().b().i(context);
                                                if (yp80Var == null) {
                                                    return true;
                                                }
                                                yp80Var.onSuccess();
                                                s3q0 s3q0Var8 = s3q0.a;
                                                return true;
                                            }
                                            if (epx.f(launchContext.e(), "miniapps") && (k = launchContext.k()) != null) {
                                                Long n2 = arm0.n(k);
                                                long j2 = InternalVkMiniApps.MARKET_ABANDONED_CARTS.h().a;
                                                if (n2 != null && n2.longValue() == j2) {
                                                    z2 = true;
                                                    ChatAnalyticsParams chatAnalyticsParams = new ChatAnalyticsParams(null, new UserId(n), CommonMarketStat$TypeRefSource.CART, MobileOfficialAppsCoreNavStat$EventScreen.MARKET_CART, z2, null, null, null, null, 481, null);
                                                    t = peq0Var.t("msgid");
                                                    int t2 = peq0Var.t("cmid");
                                                    if (t != 0 && t2 == 0) {
                                                        com.vk.metrics.eventtracking.b.a.q(new IllegalArgumentException("Missing cmid param for url: " + peq0Var.h()));
                                                    }
                                                    int t3 = peq0Var.t("cmid");
                                                    r = peq0Var.r("message");
                                                    if (r == null) {
                                                        r = "";
                                                    }
                                                    r2 = peq0Var.r("ref");
                                                    if (r2 == null) {
                                                        r2 = "";
                                                    }
                                                    r3 = peq0Var.r("ref_source");
                                                    if (r3 == null) {
                                                        r3 = "";
                                                    }
                                                    e = launchContext.e();
                                                    if (e == null) {
                                                        e = peq0Var.r("entry_point");
                                                    }
                                                    com.vk.common.links.c.t(context, k2, n, t3, r, r2, r3, e, false, yp80Var, str5, peq0Var.h().toString(), chatAnalyticsParams, 256);
                                                    return true;
                                                }
                                            }
                                            z2 = false;
                                            ChatAnalyticsParams chatAnalyticsParams2 = new ChatAnalyticsParams(null, new UserId(n), CommonMarketStat$TypeRefSource.CART, MobileOfficialAppsCoreNavStat$EventScreen.MARKET_CART, z2, null, null, null, null, 481, null);
                                            t = peq0Var.t("msgid");
                                            int t22 = peq0Var.t("cmid");
                                            if (t != 0) {
                                                com.vk.metrics.eventtracking.b.a.q(new IllegalArgumentException("Missing cmid param for url: " + peq0Var.h()));
                                            }
                                            int t32 = peq0Var.t("cmid");
                                            r = peq0Var.r("message");
                                            if (r == null) {
                                            }
                                            r2 = peq0Var.r("ref");
                                            if (r2 == null) {
                                            }
                                            r3 = peq0Var.r("ref_source");
                                            if (r3 == null) {
                                            }
                                            e = launchContext.e();
                                            if (e == null) {
                                            }
                                            com.vk.common.links.c.t(context, k2, n, t32, r, r2, r3, e, false, yp80Var, str5, peq0Var.h().toString(), chatAnalyticsParams2, 256);
                                            return true;
                                        }
                                        z = true;
                                        m10 = peq0Var.m(0, "/grouptest");
                                        if (m10) {
                                            rk8.g(xwk.d().getBrowser(), context, h, launchContext, null, 8);
                                            s3q0 s3q0Var9 = s3q0.a;
                                        } else if (jh.h("/vkpay_installment/?.*", peq0Var, null, null, 14)) {
                                            UserId.b bVar = UserId.c;
                                            com.vk.common.links.c.S(context, h, launchContext, "vkpay_installment", yp80Var);
                                        } else if (jh.h("/vkpay/?.*", peq0Var, null, null, 14)) {
                                            if (epx.f(launchContext.n(), "eco_menu")) {
                                                Boolean e3 = e(context, h, launchContext, yp80Var, peq0Var);
                                                if (e3 != null) {
                                                    return e3.booleanValue();
                                                }
                                            } else if (launchContext.f() != null) {
                                                Activity h2 = e3m.h(context);
                                                Integer f4 = launchContext.f();
                                                int intValue = f4 != null ? f4.intValue() : 0;
                                                int i3 = VkPayFragment.g0;
                                                VkPayFragment.b.b(h.toString()).h(h2, intValue);
                                            } else {
                                                int i4 = VkPayFragment.g0;
                                                VkPayFragment.b.b(h.toString()).k(context);
                                            }
                                            s3q0 s3q0Var10 = s3q0.a;
                                        } else {
                                            m11 = peq0Var.m(0, "/apps");
                                            if (m11) {
                                                com.vk.common.links.c.h(context, peq0Var.r("act"), launchContext, new p5h(this, 23));
                                                s3q0 s3q0Var11 = s3q0.a;
                                            } else {
                                                m12 = peq0Var.m(0, "/pages");
                                                if (m12 && peq0Var.j("oid", TtmlNode.TAG_P)) {
                                                    com.vkontakte.android.fragments.h hVar2 = new com.vkontakte.android.fragments.h();
                                                    hVar2.h(peq0Var.r(TtmlNode.TAG_P).replace('_', ' '));
                                                    hVar2.c(peq0Var.u("oid"));
                                                    hVar2.a(context);
                                                } else if (jh.h("/page([-0-9]+)_([0-9]+)", peq0Var, null, null, 14)) {
                                                    com.vkontakte.android.fragments.h hVar3 = new com.vkontakte.android.fragments.h();
                                                    hVar3.c(peq0Var.c(1));
                                                    hVar3.d(peq0Var.b(2));
                                                    hVar3.a(context);
                                                } else if (jh.h("/story([-0-9]+_[0-9]+)", peq0Var, null, null, 14)) {
                                                    String r10 = peq0Var.r("access_key");
                                                    String a2 = peq0Var.a(1);
                                                    if (r10 != null && r10.length() != 0) {
                                                        a2 = v1v.a('_', a2, r10);
                                                    }
                                                    StoryViewerRouter c4 = c();
                                                    LoadContext a3 = LoadContext.a.a(peq0Var.r("context"));
                                                    String a4 = com.vk.story.api.a.a(peq0Var.r("action"));
                                                    String n3 = launchContext.n();
                                                    if (n3 == null) {
                                                        n3 = launchContext.k();
                                                    }
                                                    String e4 = launchContext.e();
                                                    if (e4 != null) {
                                                        try {
                                                            mobileOfficialAppsConStoriesStat$ViewEntryPoint = MobileOfficialAppsConStoriesStat$ViewEntryPoint.valueOf(e4.toUpperCase(Locale.ROOT));
                                                        } catch (Throwable unused2) {
                                                        }
                                                    }
                                                    StoryViewerRouter.d(c4, context, null, a2, mobileOfficialAppsConStoriesStat$ViewEntryPoint, a3, n3, null, a4, null, 3394);
                                                    s3q0 s3q0Var12 = s3q0.a;
                                                } else if (jh.h("/narrative([-0-9]+)_([0-9]+)(_[0-9]+)?", peq0Var, null, null, 14)) {
                                                    StoryViewerRouter c5 = c();
                                                    UserId userId = new UserId(peq0Var.c(1));
                                                    int b = peq0Var.b(2);
                                                    String d2 = peq0Var.d(3);
                                                    c5.b(context, userId, b, d2 != null ? erm0.v0(1, d2) : null, MobileOfficialAppsConStoriesStat$ViewEntryPoint.NARRATIVE_LINK);
                                                    s3q0 s3q0Var13 = s3q0.a;
                                                } else if (jh.h("/question/ask([0-9]+)", peq0Var, null, null, 14)) {
                                                    com.vk.common.links.c.k(new UserId(peq0Var.c(1)), context, yp80Var, peq0Var.r("ref"));
                                                } else {
                                                    m13 = peq0Var.m(0, "/question");
                                                    if (m13) {
                                                        com.vk.common.links.c.k(null, context, yp80Var, null);
                                                    } else {
                                                        m14 = peq0Var.m(0, "/call");
                                                        if (m14) {
                                                            long l = cqm0.l(peq0Var.r("id"));
                                                            gzs<s3q0> gzsVar = fkq0.a;
                                                            UserId userId2 = new UserId(l);
                                                            String r11 = peq0Var.r("from");
                                                            UserId userId3 = r11 != null ? new UserId(cqm0.l(r11)) : null;
                                                            String r12 = peq0Var.r("mask_id");
                                                            new dw20.b(context).M(R.drawable.vk_icon_phone_outline_56, Integer.valueOf(R.attr.vk_ui_icon_accent)).v0(R.string.voip_begin_audiocall_question).h0(R.string.voip_call_user, new nrd(context, userId2, userId3, r12 == null ? "" : r12, yp80Var, 1)).T(R.string.cancel, new re0(17)).I0(null);
                                                            return true;
                                                        }
                                                        if (jh.h("/business_notify/?", peq0Var, null, null, 14)) {
                                                            g2v.c().b().p(context, h.toString());
                                                            if (yp80Var != null) {
                                                                yp80Var.onSuccess();
                                                                s3q0 s3q0Var14 = s3q0.a;
                                                            }
                                                        } else {
                                                            m15 = peq0Var.m(0, "/transfers");
                                                            if (m15) {
                                                                String r13 = peq0Var.r("act");
                                                                if (r13 != null) {
                                                                    int hashCode = r13.hashCode();
                                                                    if (hashCode != 339289070) {
                                                                        if (hashCode != 558234128) {
                                                                            if (hashCode != 1799528586 || !r13.equals("money_transfer")) {
                                                                                return false;
                                                                            }
                                                                        } else if (!r13.equals("money_request")) {
                                                                            return false;
                                                                        }
                                                                    } else if (!r13.equals("user_link")) {
                                                                        return false;
                                                                    }
                                                                    l(context, peq0Var);
                                                                    s3q0 s3q0Var15 = s3q0.a;
                                                                } else {
                                                                    MoneyTransfersFragment.d dVar = new MoneyTransfersFragment.d();
                                                                    dVar.C();
                                                                    dVar.k(context);
                                                                    s3q0 s3q0Var16 = s3q0.a;
                                                                }
                                                            } else {
                                                                if (jh.h("/ads/.*", peq0Var, null, null, 14)) {
                                                                    if (pok.b(context, h)) {
                                                                        return true;
                                                                    }
                                                                    WebViewFragment.c cVar2 = new WebViewFragment.c(h);
                                                                    cVar2.E();
                                                                    cVar2.H("");
                                                                    cVar2.k(context);
                                                                    return true;
                                                                }
                                                                if (jh.h("/wall([-0-9]+_[0-9]+)_r([0-9]+)", peq0Var, null, null, 14)) {
                                                                    return NewsfeedRouter.w(((NewsfeedRouterComponent) ((k7m) m7m.f(this)).a(fpf0.a(NewsfeedRouterComponent.class))).l0(), context, peq0Var.a(1), peq0Var.a(2), c9x0.a.a(peq0Var.r("act")), yp80Var, 32);
                                                                }
                                                                Regex regex = Article.v;
                                                                if (Article.a.a(peq0Var.h().toString())) {
                                                                    if (!peq0Var.h().getQueryParameterNames().isEmpty()) {
                                                                        StringBuilder sb = new StringBuilder("?");
                                                                        for (String str6 : peq0Var.h().getQueryParameterNames()) {
                                                                            sb.append(str6);
                                                                            sb.append(B5.U);
                                                                            sb.append(peq0Var.h().getQueryParameter(str6));
                                                                            sb.append("&");
                                                                        }
                                                                        sb.deleteCharAt(sb.length() - 1);
                                                                        str = sb.toString();
                                                                    }
                                                                    com.vk.common.links.c.i(context, peq0Var.h().getScheme() + "://" + peq0Var.h().getAuthority() + peq0Var.h().getPath() + str, yp80Var);
                                                                    return true;
                                                                }
                                                                m16 = peq0Var.m(0, "/validate_phone");
                                                                if (m16) {
                                                                    Activity h3 = e3m.h(context);
                                                                    FragmentActivity fragmentActivity = h3 instanceof FragmentActivity ? (FragmentActivity) h3 : null;
                                                                    if (fragmentActivity == null) {
                                                                        return false;
                                                                    }
                                                                    r55 r55Var = r55.a;
                                                                    ver0.b(fragmentActivity, com.vk.auth.validation.b.b(r55.d, fragmentActivity, null, 120));
                                                                    return true;
                                                                }
                                                                m17 = peq0Var.m(0, "/miniapps");
                                                                if (m17) {
                                                                    oz50 oz50Var = new oz50(AppsCatalogFragment.class, null, null);
                                                                    oz50Var.v(SuperAppFragment.class);
                                                                    oz50Var.k(context);
                                                                    s3q0 s3q0Var17 = s3q0.a;
                                                                } else {
                                                                    m18 = peq0Var.m(0, "/confirmation_restore");
                                                                    if (m18) {
                                                                        String r14 = peq0Var.r("code");
                                                                        if (r14 != null) {
                                                                            bpn0 bpn0Var = cqm0.a;
                                                                            try {
                                                                                i = Integer.parseInt(r14);
                                                                            } catch (Throwable unused3) {
                                                                            }
                                                                            r55.b();
                                                                            Intent intent = new Intent(context, (Class<?>) AuthActivity.class);
                                                                            DefaultAuthActivity defaultAuthActivity = DefaultAuthActivity.U;
                                                                            intent.putExtra("loginConfirmationData", i);
                                                                            context.startActivity(intent);
                                                                            s3q0 s3q0Var18 = s3q0.a;
                                                                        }
                                                                        i = 0;
                                                                        r55.b();
                                                                        Intent intent2 = new Intent(context, (Class<?>) AuthActivity.class);
                                                                        DefaultAuthActivity defaultAuthActivity2 = DefaultAuthActivity.U;
                                                                        intent2.putExtra("loginConfirmationData", i);
                                                                        context.startActivity(intent2);
                                                                        s3q0 s3q0Var182 = s3q0.a;
                                                                    } else {
                                                                        if (jh.h("/uxpolls(\\d+)", peq0Var, null, null, 14) && (BuildInfo.s() || BuildInfo.t())) {
                                                                            long c6 = peq0Var.c(1);
                                                                            Activity h4 = e3m.h(context);
                                                                            FragmentActivity fragmentActivity2 = h4 instanceof FragmentActivity ? (FragmentActivity) h4 : null;
                                                                            if (fragmentActivity2 == null) {
                                                                                return false;
                                                                            }
                                                                            new h5r0(c6).j().Ab().Td(fragmentActivity2.getSupportFragmentManager(), UxPollsModalFragment.class.getName());
                                                                            return true;
                                                                        }
                                                                        if (jh.h("/article_edit([-0-9]+)_([0-9]+)", peq0Var, null, null, 14)) {
                                                                            wn3.a(context, peq0Var.b(2), peq0Var.c(1));
                                                                            return true;
                                                                        }
                                                                        m19 = peq0Var.m(0, "/safety");
                                                                        if (m19 || jh.h("/safety/.*", peq0Var, null, null, 14)) {
                                                                            WebViewFragment.c cVar3 = new WebViewFragment.c(peq0Var.h());
                                                                            cVar3.F(true, false);
                                                                            cVar3.A();
                                                                            cVar3.s(true);
                                                                            cVar3.t();
                                                                            cVar3.k(context);
                                                                            return true;
                                                                        }
                                                                        m20 = peq0Var.m(0, "/join");
                                                                        if (m20 && SakFeatures.Type.INVITE_LINKS.h()) {
                                                                            new HomeFragment2.a().k(context);
                                                                            s3q0 s3q0Var19 = s3q0.a;
                                                                        } else {
                                                                            m21 = peq0Var.m(0, "/story_editor");
                                                                            if (m21) {
                                                                                String r15 = peq0Var.r("repost");
                                                                                if (r15 == null) {
                                                                                    return false;
                                                                                }
                                                                                ntl0.a(context, drm0.U(r15, "story"), launchContext, yp80Var, peq0Var.r("from"));
                                                                                return true;
                                                                            }
                                                                            Boolean e5 = e(context, h, launchContext, yp80Var, peq0Var);
                                                                            if (e5 != null) {
                                                                                return e5.booleanValue();
                                                                            }
                                                                            s3q0 s3q0Var20 = s3q0.a;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        if (yp80Var == null) {
                                            return z;
                                        }
                                        yp80Var.onSuccess();
                                        s3q0 s3q0Var21 = s3q0.a;
                                        return z;
                                    }
                                    if (launchContext.s()) {
                                        return false;
                                    }
                                    com.vk.common.links.b.j(context, h.toString());
                                    s3q0 s3q0Var22 = s3q0.a;
                                }
                            }
                        }
                        z = true;
                        if (yp80Var == null) {
                        }
                    }
                }
            }
            z = true;
            b().i(context, peq0Var.h(), launchContext, null);
            s3q0 s3q0Var23 = s3q0.a;
            if (yp80Var == null) {
            }
        }
        return true;
    }
}
