package com.yandex.passport.internal.links;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import com.yandex.passport.R;
import com.yandex.passport.api.PassportAccountType;
import com.yandex.passport.api.PassportLoginAction;
import com.yandex.passport.api.impl.PassportEnvironmentImpl;
import com.yandex.passport.api.s;
import com.yandex.passport.api.t0;
import com.yandex.passport.api.u;
import com.yandex.passport.api.w;
import com.yandex.passport.common.browser.BrowserUtil$SupportedBrowser;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.common.properties.CommonWebProperties;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.entities.Filter;
import com.yandex.passport.internal.flags.q;
import com.yandex.passport.internal.properties.LoginProperties;
import com.yandex.passport.internal.properties.WebAmProperties;
import com.yandex.passport.internal.report.a6;
import com.yandex.passport.internal.report.a9;
import com.yandex.passport.internal.report.b6;
import com.yandex.passport.internal.report.b9;
import com.yandex.passport.internal.report.c6;
import com.yandex.passport.internal.report.d6;
import com.yandex.passport.internal.report.f6;
import com.yandex.passport.internal.report.jd;
import com.yandex.passport.internal.report.pd;
import com.yandex.passport.internal.report.reporters.LinkHandlingReporter$UidFrom;
import com.yandex.passport.internal.report.reporters.e0;
import com.yandex.passport.internal.report.w5;
import com.yandex.passport.internal.report.x5;
import com.yandex.passport.internal.report.y5;
import com.yandex.passport.internal.report.y8;
import com.yandex.passport.internal.report.yd;
import com.yandex.passport.internal.report.z5;
import com.yandex.passport.internal.report.z8;
import com.yandex.passport.internal.ui.BaseActivity;
import com.yandex.passport.internal.ui.bouncer.BouncerActivity;
import com.yandex.passport.internal.ui.sloth.webcard.WebCardComposeActivity;
import com.yandex.passport.internal.ui.sloth.webcard.WebCardSlothActivity;
import com.yandex.passport.internal.ui.sloth.webcard.l0;
import com.yandex.passport.internal.ui.sloth.webcard.m0;
import com.yandex.passport.internal.ui.sloth.webcard.p0;
import com.yandex.passport.internal.ui.sloth.webcard.q0;
import com.yandex.passport.internal.util.m;
import com.yandex.passport.internal.util.p;
import com.yandex.passport.sloth.data.SlothParams;
import com.yandex.passport.sloth.data.c0;
import com.yandex.passport.sloth.data.r;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import defpackage.ds31;
import defpackage.i3y;
import defpackage.j73;
import defpackage.jl40;
import defpackage.m50;
import defpackage.scc;
import defpackage.tje;
import defpackage.w511;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0003J\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0016\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0013\u0010#\u001a\u00020\"*\u00020!H\u0002¢\u0006\u0004\b#\u0010$J\u0019\u0010'\u001a\u00020\u00062\b\u0010&\u001a\u0004\u0018\u00010%H\u0014¢\u0006\u0004\b'\u0010(R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020*0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020*0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010,R!\u00102\u001a\b\u0012\u0004\u0012\u00020*0)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\u001e0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010,R\u0016\u00105\u001a\u0002048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00108\u001a\u0002078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010;\u001a\u00020:8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010=\u001a\u00020\u001c8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010?\u001a\u00020\u001e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010AR\u0018\u0010C\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010E\u001a\u00020B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010DR\u0018\u0010F\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010H\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010I¨\u0006J"}, d2 = {"Lcom/yandex/passport/internal/links/LinksHandlingActivity;", "Lcom/yandex/passport/internal/ui/BaseActivity;", "<init>", "()V", "", "throwable", "Lzy11;", "onAccountSelectionFailed", "(Ljava/lang/Throwable;)V", "onAccountSelectionCancelled", "Lcom/yandex/passport/api/u;", "loggedIn", "onAccountSelected", "(Lcom/yandex/passport/api/u;)V", "Lcom/yandex/passport/internal/ui/sloth/webcard/q0;", TarifficatorScenarioActivity.RESULT_KEY, "processWebCardResult", "(Lcom/yandex/passport/internal/ui/sloth/webcard/q0;)V", "Lcom/yandex/passport/common/core/Uid;", "uid", "webCardLaunch", "(Lcom/yandex/passport/common/core/Uid;)V", "webCardSliderLaunch", "Lcom/yandex/passport/internal/links/LinkMode;", "mode", "Lcom/yandex/passport/sloth/data/c0;", "getSlothVariant", "(Lcom/yandex/passport/internal/links/LinkMode;Lcom/yandex/passport/common/core/Uid;)Lcom/yandex/passport/sloth/data/c0;", "Landroid/net/Uri;", LaunchBrowserActivity.KEY_URI, "Lcom/yandex/passport/internal/properties/LoginProperties;", "getDefaultProperties", "(Landroid/net/Uri;)Lcom/yandex/passport/internal/properties/LoginProperties;", "Lcom/yandex/passport/api/PassportLoginAction;", "", "isCarousel", "(Lcom/yandex/passport/api/PassportLoginAction;)Z", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Lm50;", "Lcom/yandex/passport/sloth/data/SlothParams;", "webCardLauncher", "Lm50;", "webCardComposeLauncher", "webCardResultLauncher$delegate", "Li3y;", "getWebCardResultLauncher", "()Lm50;", "webCardResultLauncher", "bouncerResultLauncher", "Lcom/yandex/passport/internal/links/g;", "viewModel", "Lcom/yandex/passport/internal/links/g;", "Lcom/yandex/passport/internal/report/reporters/e0;", "reporter", "Lcom/yandex/passport/internal/report/reporters/e0;", "Lcom/yandex/passport/internal/flags/j;", "flagsRepository", "Lcom/yandex/passport/internal/flags/j;", "cardUri", "Landroid/net/Uri;", "loginProperties", "Lcom/yandex/passport/internal/properties/LoginProperties;", "Lcom/yandex/passport/internal/links/LinkMode;", "", "browserName", "Ljava/lang/String;", "paySessionId", "currentUid", "Lcom/yandex/passport/common/core/Uid;", "isQrWithoutQrSlider", "Z", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class LinksHandlingActivity extends BaseActivity {
    public static final int $stable = 8;
    private final m50 bouncerResultLauncher;
    private String browserName;
    private Uri cardUri;
    private Uid currentUid;
    private com.yandex.passport.internal.flags.j flagsRepository;
    private boolean isQrWithoutQrSlider;
    private LoginProperties loginProperties;
    private LinkMode mode;
    private String paySessionId = "";
    private e0 reporter;
    private g viewModel;
    private final m50 webCardComposeLauncher;
    private final m50 webCardLauncher;

    /* renamed from: webCardResultLauncher$delegate, reason: from kotlin metadata */
    private final i3y webCardResultLauncher;

    public LinksHandlingActivity() {
        int i = 1;
        this.webCardLauncher = registerForActivityResult(new WebCardSlothActivity.a(), new l(this, i));
        int i2 = 0;
        this.webCardComposeLauncher = registerForActivityResult(new WebCardComposeActivity.a(), new l(this, i2));
        this.webCardResultLauncher = kotlin.a.a(new com.yandex.passport.internal.flags.experiments.h(i, this));
        this.bouncerResultLauncher = registerForActivityResult(new BouncerActivity.a(), new h(this, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bouncerResultLauncher$lambda$1(LinksHandlingActivity linksHandlingActivity, w wVar) {
        if (wVar instanceof u) {
            linksHandlingActivity.onAccountSelected((u) wVar);
        } else if (wVar instanceof s) {
            linksHandlingActivity.onAccountSelectionFailed(((s) wVar).a);
        } else {
            linksHandlingActivity.onAccountSelectionCancelled();
        }
    }

    private final LoginProperties getDefaultProperties(Uri uri) {
        t0 t0Var;
        LoginProperties.a aVar = new LoginProperties.a();
        Filter.a aVar2 = new Filter.a();
        Map map = m.a;
        String queryParameter = uri.getQueryParameter("pay_url");
        String host = queryParameter != null ? Uri.parse(queryParameter).getHost() : uri.getHost();
        if (host != null) {
            com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "host ".concat(host), 8);
            }
            for (Pattern pattern : ((Map) m.b.getValue()).keySet()) {
                if (pattern.matcher(host).matches()) {
                    t0Var = (t0) ((Map) m.b.getValue()).get(pattern);
                    break;
                }
            }
        }
        t0Var = null;
        com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "determineEnvironment: " + uri + " result: " + t0Var, 8);
        }
        if (t0Var == null) {
            t0Var = PassportEnvironmentImpl.PRODUCTION;
        }
        aVar2.e(t0Var);
        aVar2.c(PassportAccountType.CHILDISH);
        aVar.g(aVar2.a());
        return aVar.a();
    }

    private final c0 getSlothVariant(LinkMode mode, Uid uid) {
        com.yandex.passport.common.url.a aVar = com.yandex.passport.common.url.b.Companion;
        Uri uri = this.cardUri;
        if (uri == null) {
            uri = null;
        }
        aVar.getClass();
        String uri2 = uri.toString();
        int i = k.a[mode.ordinal()];
        if (i == 1) {
            LoginProperties loginProperties = this.loginProperties;
            return new com.yandex.passport.sloth.data.k(uri2, uid, com.yandex.passport.internal.properties.u.W((loginProperties != null ? loginProperties : null).getTheme()));
        }
        if (i == 2) {
            return new com.yandex.passport.sloth.data.l(uid, uri2);
        }
        if (i == 3) {
            return new r(uri2, uid, this.paySessionId);
        }
        w511.b();
        return null;
    }

    private final m50 getWebCardResultLauncher() {
        return (m50) this.webCardResultLauncher.getValue();
    }

    private final boolean isCarousel(PassportLoginAction passportLoginAction) {
        return passportLoginAction == PassportLoginAction.CAROUSEL;
    }

    private final void onAccountSelected(u loggedIn) {
        Uid B = p.B(loggedIn.a);
        LinkMode linkMode = this.mode;
        if (linkMode == null) {
            linkMode = null;
        }
        if (linkMode == LinkMode.PAY_URL) {
            e0 e0Var = this.reporter;
            if (e0Var == null) {
                e0Var = null;
            }
            e0Var.getClass();
            e0Var.f(a9.w, new yd(B));
        }
        if (this.isQrWithoutQrSlider && this.currentUid != null && isCarousel(loggedIn.c)) {
            this.currentUid = B;
            webCardSliderLaunch(B);
            return;
        }
        webCardLaunch(B);
        boolean z = this.isQrWithoutQrSlider;
        e0 e0Var2 = this.reporter;
        if (z) {
            e0 e0Var3 = e0Var2 != null ? e0Var2 : null;
            long value = B.getValue();
            e0Var3.getClass();
            e0Var3.f(c6.w, new jd(String.valueOf(value), 3));
            return;
        }
        if (e0Var2 == null) {
            e0Var2 = null;
        }
        Uri uri = this.cardUri;
        if (uri == null) {
            uri = null;
        }
        LinkMode linkMode2 = this.mode;
        LinkMode linkMode3 = linkMode2 != null ? linkMode2 : null;
        e0Var2.getClass();
        e0Var2.f(f6.w, new yd(B), new jd(uri), new com.yandex.passport.internal.report.i(linkMode3));
    }

    private final void onAccountSelectionCancelled() {
        finish();
        e0 e0Var = this.reporter;
        if (e0Var == null) {
            e0Var = null;
        }
        LinkMode linkMode = this.mode;
        LinkMode linkMode2 = linkMode != null ? linkMode : null;
        e0Var.getClass();
        e0Var.f(w5.w, new com.yandex.passport.internal.report.i(linkMode2));
    }

    private final void onAccountSelectionFailed(Throwable throwable) {
        LinkMode linkMode = this.mode;
        if (linkMode == null) {
            linkMode = null;
        }
        if (linkMode == LinkMode.PAY_URL) {
            e0 e0Var = this.reporter;
            e0 e0Var2 = e0Var != null ? e0Var : null;
            e0Var2.getClass();
            e0Var2.f(z8.w, new yd(throwable));
        }
        onAccountSelectionCancelled();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g onCreate$lambda$2(PassportProcessGlobalComponent passportProcessGlobalComponent, LinksHandlingActivity linksHandlingActivity, Uri uri) {
        com.yandex.passport.internal.account.a currentAccountManager = passportProcessGlobalComponent.getCurrentAccountManager();
        com.yandex.passport.internal.core.accounts.d accountsRetriever = passportProcessGlobalComponent.getAccountsRetriever();
        e0 e0Var = linksHandlingActivity.reporter;
        if (e0Var == null) {
            e0Var = null;
        }
        return new g(currentAccountManager, accountsRetriever, e0Var, uri, passportProcessGlobalComponent.getAutoLoginUseCase(), passportProcessGlobalComponent.getPreferenceStorage(), passportProcessGlobalComponent.getFlagRepository(), passportProcessGlobalComponent.getCommonParamsProvider(), passportProcessGlobalComponent.getAccountFilterRepository());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$5(LinksHandlingActivity linksHandlingActivity, e eVar) {
        Uid uid;
        linksHandlingActivity.cardUri = eVar.a;
        linksHandlingActivity.mode = eVar.c;
        linksHandlingActivity.browserName = eVar.d;
        ModernAccount modernAccount = eVar.b;
        r1 = null;
        Long l = null;
        linksHandlingActivity.currentUid = modernAccount != null ? modernAccount.getUid() : null;
        boolean z = false;
        if (eVar instanceof a) {
            if (modernAccount == null) {
                m50 m50Var = linksHandlingActivity.bouncerResultLauncher;
                LoginProperties loginProperties = linksHandlingActivity.loginProperties;
                m50Var.a(loginProperties != null ? loginProperties : null);
                return;
            }
            linksHandlingActivity.webCardLaunch(modernAccount.getUid());
            e0 e0Var = linksHandlingActivity.reporter;
            if (e0Var == null) {
                e0Var = null;
            }
            Uid uid2 = modernAccount.getUid();
            Uri uri = linksHandlingActivity.cardUri;
            if (uri == null) {
                uri = null;
            }
            LinkMode linkMode = linksHandlingActivity.mode;
            LinkMode linkMode2 = linkMode != null ? linkMode : null;
            e0Var.getClass();
            e0Var.f(f6.w, new yd(uid2), new jd(uri), new com.yandex.passport.internal.report.i(linkMode2));
            return;
        }
        if (eVar instanceof c) {
            m50 m50Var2 = linksHandlingActivity.bouncerResultLauncher;
            LoginProperties loginProperties2 = linksHandlingActivity.loginProperties;
            if (loginProperties2 == null) {
                loginProperties2 = null;
            }
            m50Var2.a(loginProperties2);
            e0 e0Var2 = linksHandlingActivity.reporter;
            e0 e0Var3 = e0Var2 != null ? e0Var2 : null;
            e0Var3.getClass();
            e0Var3.h(x5.w);
            return;
        }
        if (eVar instanceof d) {
            linksHandlingActivity.isQrWithoutQrSlider = true;
            d dVar = (d) eVar;
            ModernAccount modernAccount2 = dVar.f;
            linksHandlingActivity.webCardSliderLaunch(modernAccount2 != null ? modernAccount2.getUid() : null);
            e0 e0Var4 = linksHandlingActivity.reporter;
            if (e0Var4 == null) {
                e0Var4 = null;
            }
            if (modernAccount2 != null && (uid = modernAccount2.getUid()) != null) {
                l = Long.valueOf(uid.getValue());
            }
            LinkHandlingReporter$UidFrom linkHandlingReporter$UidFrom = dVar.h;
            e0Var4.getClass();
            e0Var4.f(d6.w, new jd(String.valueOf(l), 3), new com.yandex.passport.internal.report.i(linkHandlingReporter$UidFrom.getFrom(), 6, z));
            return;
        }
        if (!(eVar instanceof b)) {
            w511.b();
            return;
        }
        b bVar = (b) eVar;
        linksHandlingActivity.paySessionId = bVar.g;
        if (modernAccount == null) {
            m50 m50Var3 = linksHandlingActivity.bouncerResultLauncher;
            LoginProperties loginProperties3 = linksHandlingActivity.loginProperties;
            m50Var3.a(loginProperties3 != null ? loginProperties3 : null);
            return;
        }
        e0 e0Var5 = linksHandlingActivity.reporter;
        e0 e0Var6 = e0Var5 != null ? e0Var5 : null;
        Uid uid3 = modernAccount.getUid();
        Uri uri2 = bVar.e;
        e0Var6.getClass();
        e0Var6.f(b9.w, new yd(uid3), new jd(uri2));
        linksHandlingActivity.webCardLaunch(modernAccount.getUid());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0156 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void processWebCardResult(q0 result) {
        BrowserUtil$SupportedBrowser browserUtil$SupportedBrowser;
        e eVar;
        boolean z;
        Uri uri;
        if (jl40.l(result, l0.a)) {
            m50 m50Var = this.bouncerResultLauncher;
            LoginProperties loginProperties = this.loginProperties;
            if (loginProperties == null) {
                loginProperties = null;
            }
            m50Var.a(loginProperties);
        } else if (result instanceof p0) {
            m50 m50Var2 = this.bouncerResultLauncher;
            LoginProperties loginProperties2 = this.loginProperties;
            m50Var2.a(LoginProperties.m307copyLjS6rdk$default(loginProperties2 == null ? null : loginProperties2, null, false, null, null, null, null, p.A(((p0) result).a), false, false, null, null, false, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, false, null, false, null, 2147483583, null));
        } else if (result instanceof m0) {
            LinkMode linkMode = this.mode;
            if (linkMode == null) {
                linkMode = null;
            }
            if (linkMode == LinkMode.PAY_URL) {
                e0 e0Var = this.reporter;
                if (e0Var == null) {
                    e0Var = null;
                }
                String str = ((m0) result).a;
                e0Var.getClass();
                e0Var.f(y8.w, new jd(Uri.parse(str)));
            }
            finishAndRemoveTask();
            g gVar = this.viewModel;
            if (gVar == null) {
                gVar = null;
            }
            String str2 = ((m0) result).a;
            com.yandex.passport.internal.ui.util.l lVar = gVar.J;
            e eVar2 = (e) lVar.d();
            String str3 = eVar2 != null ? eVar2.d : null;
            if (str3 != null) {
                switch (str3.hashCode()) {
                    case -644447785:
                        if (str3.equals("YandexBrowser")) {
                            browserUtil$SupportedBrowser = BrowserUtil$SupportedBrowser.YA_BRO;
                            break;
                        }
                        break;
                    case -182261529:
                        if (str3.equals("Samsung Internet")) {
                            browserUtil$SupportedBrowser = BrowserUtil$SupportedBrowser.SAMSUNG;
                            break;
                        }
                        break;
                    case -26738761:
                        if (str3.equals("MobileFirefox")) {
                            browserUtil$SupportedBrowser = BrowserUtil$SupportedBrowser.FIREFOX;
                            break;
                        }
                        break;
                    case 69017:
                        if (str3.equals("EUI")) {
                            browserUtil$SupportedBrowser = BrowserUtil$SupportedBrowser.HUAWEI;
                            break;
                        }
                        break;
                    case 2366768:
                        if (str3.equals("MIUI")) {
                            browserUtil$SupportedBrowser = BrowserUtil$SupportedBrowser.XIAOMI;
                            break;
                        }
                        break;
                    case 686186037:
                        if (str3.equals("OperaMobile")) {
                            browserUtil$SupportedBrowser = BrowserUtil$SupportedBrowser.OPERA;
                            break;
                        }
                        break;
                    case 908877788:
                        if (str3.equals("ChromeMobile")) {
                            browserUtil$SupportedBrowser = BrowserUtil$SupportedBrowser.CHROME;
                            break;
                        }
                        break;
                    case 1423310105:
                        if (str3.equals("YandexSearch")) {
                            browserUtil$SupportedBrowser = BrowserUtil$SupportedBrowser.YA_SEARCHAPP;
                            break;
                        }
                        break;
                }
                eVar = (e) lVar.d();
                if (eVar != null || (uri = eVar.a) == null || (r8 = uri.toString()) == null) {
                    String str4 = "";
                }
                Uri uri2 = com.yandex.passport.common.browser.c.a;
                if (browserUtil$SupportedBrowser != null) {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str2));
                    intent.addFlags(SelfTester_JCP.IMITA);
                    startActivity(intent);
                } else {
                    try {
                        Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str2));
                        intent2.setPackage(browserUtil$SupportedBrowser.getPackageName());
                        intent2.addFlags(SelfTester_JCP.IMITA);
                        startActivity(intent2);
                    } catch (ActivityNotFoundException unused) {
                        Intent intent3 = new Intent("android.intent.action.VIEW", Uri.parse(str2));
                        intent3.addFlags(SelfTester_JCP.IMITA);
                        startActivity(intent3);
                        z = false;
                    }
                }
                z = true;
                e0 e0Var2 = gVar.C;
                if (!z) {
                    browserUtil$SupportedBrowser = null;
                }
                p.q(e0Var2.b, z5.w, j73.A(new pd[]{new jd(Uri.parse(str4)), browserUtil$SupportedBrowser == null ? new com.yandex.passport.internal.report.a(browserUtil$SupportedBrowser) : null}));
            }
            browserUtil$SupportedBrowser = null;
            eVar = (e) lVar.d();
            if (eVar != null) {
            }
            String str42 = "";
            Uri uri22 = com.yandex.passport.common.browser.c.a;
            if (browserUtil$SupportedBrowser != null) {
            }
            z = true;
            e0 e0Var22 = gVar.C;
            if (!z) {
            }
            p.q(e0Var22.b, z5.w, j73.A(new pd[]{new jd(Uri.parse(str42)), browserUtil$SupportedBrowser == null ? new com.yandex.passport.internal.report.a(browserUtil$SupportedBrowser) : null}));
        } else if (jl40.l(result, l0.c)) {
            Uid uid = this.currentUid;
            if (uid != null) {
                e0 e0Var3 = this.reporter;
                if (e0Var3 == null) {
                    e0Var3 = null;
                }
                long value = uid.getValue();
                e0Var3.getClass();
                e0Var3.f(c6.w, new jd(String.valueOf(value), 3));
                webCardLaunch(uid);
            } else {
                m50 m50Var3 = this.bouncerResultLauncher;
                LoginProperties loginProperties3 = this.loginProperties;
                if (loginProperties3 == null) {
                    loginProperties3 = null;
                }
                m50Var3.a(loginProperties3);
            }
        } else {
            e0 e0Var4 = this.reporter;
            if (e0Var4 == null) {
                e0Var4 = null;
            }
            e0Var4.getClass();
            e0Var4.h(y5.w);
            ActivityResult p = com.yandex.passport.internal.ui.sloth.e.p(result);
            setResult(p.getResultCode(), p.getData());
            finish();
        }
        e0 e0Var5 = this.reporter;
        e0 e0Var6 = e0Var5 != null ? e0Var5 : null;
        boolean isFinishing = isFinishing();
        e0Var6.getClass();
        e0Var6.f(b6.w, new yd(result), new com.yandex.passport.internal.report.i(isFinishing, 12));
    }

    private final void webCardLaunch(Uid uid) {
        m50 webCardResultLauncher = getWebCardResultLauncher();
        LinkMode linkMode = this.mode;
        if (linkMode == null) {
            linkMode = null;
        }
        c0 slothVariant = getSlothVariant(linkMode, uid);
        LoginProperties loginProperties = this.loginProperties;
        if (loginProperties == null) {
            loginProperties = null;
        }
        Environment u = p.u(loginProperties.getFilter().getPrimaryEnvironment());
        LoginProperties loginProperties2 = this.loginProperties;
        if (loginProperties2 == null) {
            loginProperties2 = null;
        }
        WebAmProperties webAmProperties = loginProperties2.getWebAmProperties();
        com.yandex.passport.internal.flags.j jVar = this.flagsRepository;
        webCardResultLauncher.a(new SlothParams(slothVariant, u, null, com.yandex.passport.internal.properties.u.J(webAmProperties, ((Boolean) (jVar != null ? jVar : null).b(q.z)).booleanValue()), 4, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m50 webCardResultLauncher_delegate$lambda$0(LinksHandlingActivity linksHandlingActivity) {
        com.yandex.passport.internal.flags.j jVar = linksHandlingActivity.flagsRepository;
        if (jVar != null) {
            if (jVar == null) {
                jVar = null;
            }
            com.yandex.passport.internal.flags.a aVar = q.a;
            if (((Boolean) jVar.b(q.c0)).booleanValue()) {
                return linksHandlingActivity.webCardComposeLauncher;
            }
        }
        return linksHandlingActivity.webCardLauncher;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void webCardSliderLaunch(Uid uid) {
        boolean z;
        CommonWebProperties commonWebProperties;
        boolean z2 = uid == null;
        String str = this.browserName;
        if (str == null) {
            str = "null";
        }
        LoginProperties loginProperties = this.loginProperties;
        if (loginProperties == null) {
            loginProperties = null;
        }
        WebAmProperties webAmProperties = loginProperties.getWebAmProperties();
        if (webAmProperties != null) {
            z = z2;
            WebAmProperties copy$default = WebAmProperties.copy$default(webAmProperties, false, false, false, false, null, z, 31, null);
            if (copy$default != null) {
                com.yandex.passport.internal.flags.j jVar = this.flagsRepository;
                if (jVar == null) {
                    jVar = null;
                }
                commonWebProperties = com.yandex.passport.internal.properties.u.J(copy$default, ((Boolean) jVar.b(q.z)).booleanValue());
                CommonWebProperties commonWebProperties2 = commonWebProperties;
                m50 webCardResultLauncher = getWebCardResultLauncher();
                com.yandex.passport.sloth.data.m mVar = new com.yandex.passport.sloth.data.m(uid, str);
                LoginProperties loginProperties2 = this.loginProperties;
                webCardResultLauncher.a(new SlothParams(mVar, p.u((loginProperties2 != null ? loginProperties2 : null).getFilter().getPrimaryEnvironment()), null, commonWebProperties2, 4, null));
            }
        } else {
            z = z2;
        }
        com.yandex.passport.internal.flags.j jVar2 = this.flagsRepository;
        if (jVar2 == null) {
            jVar2 = null;
        }
        commonWebProperties = new CommonWebProperties(false, null, z, ((Boolean) jVar2.b(q.z)).booleanValue(), 3, null);
        CommonWebProperties commonWebProperties22 = commonWebProperties;
        m50 webCardResultLauncher2 = getWebCardResultLauncher();
        com.yandex.passport.sloth.data.m mVar2 = new com.yandex.passport.sloth.data.m(uid, str);
        LoginProperties loginProperties22 = this.loginProperties;
        webCardResultLauncher2.a(new SlothParams(mVar2, p.u((loginProperties22 != null ? loginProperties22 : null).getFilter().getPrimaryEnvironment()), null, commonWebProperties22, 4, null));
    }

    @Override // com.yandex.passport.internal.ui.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (jl40.l(getIntent().getAction(), "com.yandex.passport.action.YA_PAY")) {
            finish();
            return;
        }
        PassportProcessGlobalComponent a = com.yandex.passport.internal.di.a.a();
        this.reporter = a.getLinkHandlingReporter();
        this.flagsRepository = a.getFlagRepository();
        Uri data = getIntent().getData();
        e0 e0Var = this.reporter;
        if (e0Var == null) {
            e0Var = null;
        }
        p.q(e0Var.b, a6.w, scc.h(data != null ? new jd(data) : null));
        if (data == null) {
            finish();
            return;
        }
        getIntent().setData(null);
        this.loginProperties = getDefaultProperties(data);
        setContentView(R.layout.passport_activity_link_handling);
        g gVar = (g) com.yandex.passport.internal.u.a(this, g.class, new i(a, this, data));
        this.viewModel = gVar;
        gVar.J.n(this, new j(0, this));
        g gVar2 = this.viewModel;
        if (gVar2 == null) {
            gVar2 = null;
        }
        LoginProperties loginProperties = this.loginProperties;
        if (loginProperties == null) {
            loginProperties = null;
        }
        gVar2.getClass();
        tje.N(ds31.a(gVar2), null, null, new LinkHandlingViewModel$onFirstStart$1(gVar2, loginProperties, null), 3);
    }
}
