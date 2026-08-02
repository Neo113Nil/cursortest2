package com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import androidx.browser.customtabs.k;
import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;
import defpackage.ji11;
import defpackage.ki11;
import defpackage.li11;
import defpackage.ny61;
import defpackage.olf;
import defpackage.slf;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

/* loaded from: classes11.dex */
public class TrustedWebActivity extends ChromeCustomTabsActivity {
    protected static final String LOG_TAG = "TrustedWebActivity";
    public li11 builder;

    private void prepareCustomTabs() {
        olf olfVar = new olf();
        String str = this.customSettings.toolbarBackgroundColor;
        if (str != null && !str.isEmpty()) {
            olfVar.a = Integer.valueOf(Color.parseColor(this.customSettings.toolbarBackgroundColor) | ModalContentViewContainer.BASE_SHADOW_COLOR);
        }
        String str2 = this.customSettings.navigationBarColor;
        if (str2 != null && !str2.isEmpty()) {
            olfVar.c = Integer.valueOf(Color.parseColor(this.customSettings.navigationBarColor) | ModalContentViewContainer.BASE_SHADOW_COLOR);
        }
        String str3 = this.customSettings.navigationBarDividerColor;
        if (str3 != null && !str3.isEmpty()) {
            olfVar.d = Integer.valueOf(Color.parseColor(this.customSettings.navigationBarDividerColor));
        }
        String str4 = this.customSettings.secondaryToolbarColor;
        if (str4 != null && !str4.isEmpty()) {
            olfVar.b = Integer.valueOf(Color.parseColor(this.customSettings.secondaryToolbarColor));
        }
        li11 li11Var = this.builder;
        Integer num = olfVar.a;
        Integer num2 = olfVar.b;
        Integer num3 = olfVar.c;
        Integer num4 = olfVar.d;
        slf slfVar = li11Var.b;
        slfVar.getClass();
        Bundle bundle = new Bundle();
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        if (num2 != null) {
            bundle.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", num2.intValue());
        }
        if (num3 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num3.intValue());
        }
        if (num4 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", num4.intValue());
        }
        slfVar.e = bundle;
        List<String> list = this.customSettings.additionalTrustedOrigins;
        if (list != null && !list.isEmpty()) {
            this.builder.c = this.customSettings.additionalTrustedOrigins;
        }
        ChromeCustomTabsSettings chromeCustomTabsSettings = this.customSettings;
        ji11 ji11Var = chromeCustomTabsSettings.displayMode;
        if (ji11Var != null) {
            this.builder.d = ji11Var;
        }
        this.builder.e = chromeCustomTabsSettings.screenOrientation.intValue();
    }

    private void prepareCustomTabsIntent(ki11 ki11Var) {
        Intent intent = ki11Var.a;
        String str = this.customSettings.packageName;
        if (str != null) {
            intent.setPackage(str);
        } else {
            intent.setPackage(CustomTabsHelper.getPackageNameToUse(this));
        }
        if (this.customSettings.keepAliveEnabled.booleanValue()) {
            CustomTabsHelper.addKeepAliveExtra(this, intent);
        }
        if (this.customSettings.alwaysUseBrowserUI.booleanValue()) {
            if (intent == null) {
                intent = new Intent("android.intent.action.VIEW");
            }
            intent.addFlags(SelfTester_JCP.IMITA);
            intent.putExtra("android.support.customtabs.extra.user_opt_out", true);
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ChromeCustomTabsActivity
    public void launchUrl(String str, Map<String, String> map, String str2, List<String> list) {
        if (this.customTabsSession == null) {
            return;
        }
        Uri parse = Uri.parse(str);
        mayLaunchUrl(str, list);
        this.builder = new li11(parse);
        prepareCustomTabs();
        li11 li11Var = this.builder;
        k kVar = this.customTabsSession;
        slf slfVar = li11Var.b;
        if (kVar == null) {
            ny61.t("CustomTabsSession is required for launching a TWA");
            return;
        }
        Intent intent = slfVar.a;
        intent.setPackage(kVar.d.getPackageName());
        IBinder asBinder = kVar.c.asBinder();
        Bundle bundle = new Bundle();
        bundle.putBinder("android.support.customtabs.extra.SESSION", asBinder);
        intent.putExtras(bundle);
        Intent intent2 = slfVar.a().a;
        intent2.setData(li11Var.a);
        intent2.putExtra("android.support.customtabs.extra.LAUNCH_AS_TRUSTED_WEB_ACTIVITY", true);
        if (li11Var.c != null) {
            intent2.putExtra("android.support.customtabs.extra.ADDITIONAL_TRUSTED_ORIGINS", new ArrayList(li11Var.c));
        }
        List list2 = Collections.EMPTY_LIST;
        intent2.putExtra("androidx.browser.trusted.extra.DISPLAY_MODE", li11Var.d.toBundle());
        intent2.putExtra("androidx.browser.trusted.extra.SCREEN_ORIENTATION", li11Var.e);
        intent2.putExtra("androidx.browser.trusted.extra.LAUNCH_HANDLER_CLIENT_MODE", 0);
        ki11 ki11Var = new ki11(intent2);
        prepareCustomTabsIntent(ki11Var);
        CustomTabActivityHelper.openTrustedWebActivity(this, ki11Var, parse, map, str2 != null ? Uri.parse(str2) : null, 100);
    }
}
