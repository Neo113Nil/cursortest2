package com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.widget.RemoteViews;
import androidx.browser.customtabs.CustomTabsService;
import androidx.browser.customtabs.k;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.CustomTabActivityHelper;
import com.pichillilorenzo.flutter_inappwebview_android.types.AndroidResource;
import com.pichillilorenzo.flutter_inappwebview_android.types.CustomTabsActionButton;
import com.pichillilorenzo.flutter_inappwebview_android.types.CustomTabsMenuItem;
import com.pichillilorenzo.flutter_inappwebview_android.types.CustomTabsSecondaryToolbar;
import com.pichillilorenzo.flutter_inappwebview_android.types.Disposable;
import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;
import defpackage.dph0;
import defpackage.e1o;
import defpackage.ea20;
import defpackage.olf;
import defpackage.qlf;
import defpackage.slf;
import defpackage.tlf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

/* loaded from: classes11.dex */
public class ChromeCustomTabsActivity extends Activity implements Disposable {
    public static final int CHROME_CUSTOM_TAB_REQUEST_CODE = 100;
    protected static final String LOG_TAG = "CustomTabsActivity";
    public static final String METHOD_CHANNEL_NAME_PREFIX = "com.pichillilorenzo/flutter_chromesafaribrowser_";
    public static final int NO_HISTORY_CHROME_CUSTOM_TAB_REQUEST_CODE = 101;
    public CustomTabsActionButton actionButton;
    public slf builder;
    public ChromeCustomTabsChannelDelegate channelDelegate;
    public k customTabsSession;
    public String id;
    public Map<String, String> initialHeaders;
    public List<String> initialOtherLikelyURLs;
    public String initialReferrer;
    public String initialUrl;
    public ChromeSafariBrowserManager manager;
    public CustomTabsSecondaryToolbar secondaryToolbar;
    public ChromeCustomTabsSettings customSettings = new ChromeCustomTabsSettings();
    public CustomTabActivityHelper customTabActivityHelper = new CustomTabActivityHelper();
    protected boolean onOpened = false;
    protected boolean onCompletedInitialLoad = false;
    protected boolean isBindSuccess = false;
    public List<CustomTabsMenuItem> menuItems = new ArrayList();

    private PendingIntent createPendingIntent(int i) {
        Intent intent = new Intent(this, (Class<?>) ActionBroadcastReceiver.class);
        Bundle bundle = new Bundle();
        bundle.putInt(ActionBroadcastReceiver.KEY_ACTION_ID, i);
        bundle.putString(ActionBroadcastReceiver.KEY_ACTION_VIEW_ID, this.id);
        ChromeSafariBrowserManager chromeSafariBrowserManager = this.manager;
        bundle.putString(ActionBroadcastReceiver.KEY_ACTION_MANAGER_ID, chromeSafariBrowserManager != null ? chromeSafariBrowserManager.id : null);
        intent.putExtras(bundle);
        return Build.VERSION.SDK_INT >= 31 ? PendingIntent.getBroadcast(this, i, intent, 167772160) : PendingIntent.getBroadcast(this, i, intent, SelfTester_JCP.DECRYPT_CNT);
    }

    private void prepareCustomTabs() {
        slf slfVar = this.builder;
        if (slfVar == null) {
            return;
        }
        ChromeCustomTabsSettings chromeCustomTabsSettings = this.customSettings;
        Boolean bool = chromeCustomTabsSettings.addDefaultShareMenuItem;
        if (bool != null) {
            slfVar.b(bool.booleanValue() ? 1 : 2);
        } else {
            slfVar.b(chromeCustomTabsSettings.shareState.intValue());
        }
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
        slf slfVar2 = this.builder;
        Integer num = olfVar.a;
        Integer num2 = olfVar.b;
        Integer num3 = olfVar.c;
        Integer num4 = olfVar.d;
        slfVar2.getClass();
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
        slfVar2.e = bundle;
        this.builder.a.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", this.customSettings.showTitle.booleanValue() ? 1 : 0);
        this.builder.a.putExtra("android.support.customtabs.extra.ENABLE_URLBAR_HIDING", this.customSettings.enableUrlBarHiding.booleanValue());
        this.builder.g = this.customSettings.instantAppsEnabled.booleanValue();
        if (this.customSettings.startAnimations.size() == 2) {
            slf slfVar3 = this.builder;
            int identifier = this.customSettings.startAnimations.get(0).getIdentifier(this);
            int identifier2 = this.customSettings.startAnimations.get(1).getIdentifier(this);
            slfVar3.getClass();
            slfVar3.d = ActivityOptions.makeCustomAnimation(this, identifier, identifier2);
        }
        if (this.customSettings.exitAnimations.size() == 2) {
            slf slfVar4 = this.builder;
            int identifier3 = this.customSettings.exitAnimations.get(0).getIdentifier(this);
            int identifier4 = this.customSettings.exitAnimations.get(1).getIdentifier(this);
            slfVar4.getClass();
            slfVar4.a.putExtra("android.support.customtabs.extra.EXIT_ANIMATION_BUNDLE", ActivityOptions.makeCustomAnimation(this, identifier3, identifier4).toBundle());
        }
        for (CustomTabsMenuItem customTabsMenuItem : this.menuItems) {
            slf slfVar5 = this.builder;
            String label = customTabsMenuItem.getLabel();
            PendingIntent createPendingIntent = createPendingIntent(customTabsMenuItem.getId());
            if (slfVar5.c == null) {
                slfVar5.c = new ArrayList();
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("android.support.customtabs.customaction.MENU_ITEM_TITLE", label);
            bundle2.putParcelable("android.support.customtabs.customaction.PENDING_INTENT", createPendingIntent);
            slfVar5.c.add(bundle2);
        }
        CustomTabsActionButton customTabsActionButton = this.actionButton;
        if (customTabsActionButton != null) {
            byte[] icon = customTabsActionButton.getIcon();
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inMutable = true;
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(icon, 0, icon.length, options);
            slf slfVar6 = this.builder;
            String description = this.actionButton.getDescription();
            PendingIntent createPendingIntent2 = createPendingIntent(this.actionButton.getId());
            boolean isShouldTint = this.actionButton.isShouldTint();
            slfVar6.getClass();
            Bundle bundle3 = new Bundle();
            bundle3.putInt("android.support.customtabs.customaction.ID", 0);
            bundle3.putParcelable("android.support.customtabs.customaction.ICON", decodeByteArray);
            bundle3.putString("android.support.customtabs.customaction.DESCRIPTION", description);
            bundle3.putParcelable("android.support.customtabs.customaction.PENDING_INTENT", createPendingIntent2);
            Intent intent = slfVar6.a;
            intent.putExtra("android.support.customtabs.extra.ACTION_BUTTON_BUNDLE", bundle3);
            intent.putExtra("android.support.customtabs.extra.TINT_ACTION_BUTTON", isShouldTint);
        }
        CustomTabsSecondaryToolbar customTabsSecondaryToolbar = this.secondaryToolbar;
        if (customTabsSecondaryToolbar != null) {
            AndroidResource layout = customTabsSecondaryToolbar.getLayout();
            RemoteViews remoteViews = new RemoteViews(layout.getDefPackage(), layout.getIdentifier(this));
            int[] iArr = new int[this.secondaryToolbar.getClickableIDs().size()];
            int size = this.secondaryToolbar.getClickableIDs().size();
            for (int i = 0; i < size; i++) {
                iArr[i] = this.secondaryToolbar.getClickableIDs().get(i).getIdentifier(this);
            }
            slf slfVar7 = this.builder;
            PendingIntent secondaryToolbarOnClickPendingIntent = getSecondaryToolbarOnClickPendingIntent();
            Intent intent2 = slfVar7.a;
            intent2.putExtra("android.support.customtabs.extra.EXTRA_REMOTEVIEWS", remoteViews);
            intent2.putExtra("android.support.customtabs.extra.EXTRA_REMOTEVIEWS_VIEW_IDS", iArr);
            intent2.putExtra("android.support.customtabs.extra.EXTRA_REMOTEVIEWS_PENDINGINTENT", secondaryToolbarOnClickPendingIntent);
        }
    }

    private void prepareCustomTabsIntent(tlf tlfVar) {
        String str = this.customSettings.packageName;
        if (str != null) {
            tlfVar.a.setPackage(str);
        } else {
            tlfVar.a.setPackage(CustomTabsHelper.getPackageNameToUse(this));
        }
        if (this.customSettings.keepAliveEnabled.booleanValue()) {
            CustomTabsHelper.addKeepAliveExtra(this, tlfVar.a);
        }
        if (this.customSettings.alwaysUseBrowserUI.booleanValue()) {
            Intent intent = tlfVar.a;
            if (intent == null) {
                intent = new Intent("android.intent.action.VIEW");
            }
            intent.addFlags(SelfTester_JCP.IMITA);
            intent.putExtra("android.support.customtabs.extra.user_opt_out", true);
        }
    }

    public void close() {
        onStop();
        onDestroy();
        this.customTabsSession = null;
        finish();
        ChromeCustomTabsChannelDelegate chromeCustomTabsChannelDelegate = this.channelDelegate;
        if (chromeCustomTabsChannelDelegate != null) {
            chromeCustomTabsChannelDelegate.onClosed();
        }
    }

    public void customTabsConnected() {
        String str;
        k session = this.customTabActivityHelper.getSession();
        this.customTabsSession = session;
        if (session != null) {
            try {
                Bundle bundle = new Bundle();
                k kVar = this.customTabsSession;
                try {
                    if (kVar.b.isEngagementSignalsApiAvailable(kVar.c, kVar.a(bundle))) {
                        this.customTabsSession.b(new e1o() { // from class: com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ChromeCustomTabsActivity.3
                            @Override // defpackage.e1o
                            public void onGreatestScrollPercentageIncreased(int i, Bundle bundle2) {
                                ChromeCustomTabsChannelDelegate chromeCustomTabsChannelDelegate = ChromeCustomTabsActivity.this.channelDelegate;
                                if (chromeCustomTabsChannelDelegate != null) {
                                    chromeCustomTabsChannelDelegate.onGreatestScrollPercentageIncreased(i);
                                }
                            }

                            @Override // defpackage.e1o
                            public void onSessionEnded(boolean z, Bundle bundle2) {
                                ChromeCustomTabsChannelDelegate chromeCustomTabsChannelDelegate = ChromeCustomTabsActivity.this.channelDelegate;
                                if (chromeCustomTabsChannelDelegate != null) {
                                    chromeCustomTabsChannelDelegate.onSessionEnded(z);
                                }
                            }

                            @Override // defpackage.e1o
                            public void onVerticalScrollEvent(boolean z, Bundle bundle2) {
                                ChromeCustomTabsChannelDelegate chromeCustomTabsChannelDelegate = ChromeCustomTabsActivity.this.channelDelegate;
                                if (chromeCustomTabsChannelDelegate != null) {
                                    chromeCustomTabsChannelDelegate.onVerticalScrollEvent(z);
                                }
                            }
                        }, bundle);
                    }
                } catch (SecurityException e) {
                    throw new UnsupportedOperationException("This method isn't supported by the Custom Tabs implementation.", e);
                }
            } catch (Throwable unused) {
            }
        }
        if (!this.isBindSuccess || (str = this.initialUrl) == null) {
            return;
        }
        launchUrl(str, this.initialHeaders, this.initialReferrer, this.initialOtherLikelyURLs);
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        onStop();
        onDestroy();
        ChromeCustomTabsChannelDelegate chromeCustomTabsChannelDelegate = this.channelDelegate;
        if (chromeCustomTabsChannelDelegate != null) {
            chromeCustomTabsChannelDelegate.dispose();
            this.channelDelegate = null;
        }
        ChromeSafariBrowserManager chromeSafariBrowserManager = this.manager;
        if (chromeSafariBrowserManager != null && chromeSafariBrowserManager.browsers.containsKey(this.id)) {
            this.manager.browsers.put(this.id, null);
        }
        this.manager = null;
    }

    public PendingIntent getSecondaryToolbarOnClickPendingIntent() {
        Intent intent = new Intent(this, (Class<?>) ActionBroadcastReceiver.class);
        Bundle bundle = new Bundle();
        bundle.putString(ActionBroadcastReceiver.KEY_ACTION_VIEW_ID, this.id);
        ChromeSafariBrowserManager chromeSafariBrowserManager = this.manager;
        bundle.putString(ActionBroadcastReceiver.KEY_ACTION_MANAGER_ID, chromeSafariBrowserManager != null ? chromeSafariBrowserManager.id : null);
        intent.putExtras(bundle);
        return Build.VERSION.SDK_INT >= 31 ? PendingIntent.getBroadcast(this, 0, intent, 167772160) : PendingIntent.getBroadcast(this, 0, intent, SelfTester_JCP.DECRYPT_CNT);
    }

    public void launchUrl(String str, Map<String, String> map, String str2, List<String> list) {
        launchUrlWithSession(this.customTabsSession, str, map, str2, list);
    }

    public void launchUrlWithSession(k kVar, String str, Map<String, String> map, String str2, List<String> list) {
        mayLaunchUrl(str, list);
        this.builder = new slf(kVar);
        prepareCustomTabs();
        tlf a = this.builder.a();
        prepareCustomTabsIntent(a);
        CustomTabActivityHelper.openCustomTab(this, a, Uri.parse(str), map, str2 != null ? Uri.parse(str2) : null, 100);
    }

    public boolean mayLaunchUrl(String str, List<String> list) {
        Uri parse = str != null ? Uri.parse(str) : null;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Bundle bundle = new Bundle();
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                bundle.putString(CustomTabsService.KEY_URL, it.next());
            }
        }
        return this.customTabActivityHelper.mayLaunchUrl(parse, null, arrayList);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 100) {
            close();
            dispose();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin;
        NoHistoryCustomTabsActivityCallbacks noHistoryCustomTabsActivityCallbacks;
        super.onCreate(bundle);
        setContentView(dph0.chrome_custom_tabs_layout);
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            return;
        }
        this.id = extras.getString("id");
        ChromeSafariBrowserManager chromeSafariBrowserManager = ChromeSafariBrowserManager.shared.get(extras.getString("managerId"));
        this.manager = chromeSafariBrowserManager;
        if (chromeSafariBrowserManager == null || (inAppWebViewFlutterPlugin = chromeSafariBrowserManager.plugin) == null || inAppWebViewFlutterPlugin.messenger == null) {
            return;
        }
        chromeSafariBrowserManager.browsers.put(this.id, this);
        this.channelDelegate = new ChromeCustomTabsChannelDelegate(this, new ea20(this.manager.plugin.messenger, METHOD_CHANNEL_NAME_PREFIX + this.id));
        this.initialUrl = extras.getString("url");
        this.initialHeaders = (Map) extras.getSerializable("headers");
        this.initialReferrer = extras.getString("referrer");
        this.initialOtherLikelyURLs = extras.getStringArrayList("otherLikelyURLs");
        ChromeCustomTabsSettings chromeCustomTabsSettings = new ChromeCustomTabsSettings();
        this.customSettings = chromeCustomTabsSettings;
        chromeCustomTabsSettings.parse2((Map<String, Object>) extras.getSerializable("settings"));
        this.actionButton = CustomTabsActionButton.fromMap((Map) extras.getSerializable("actionButton"));
        this.secondaryToolbar = CustomTabsSecondaryToolbar.fromMap((Map) extras.getSerializable("secondaryToolbar"));
        Iterator it = ((List) extras.getSerializable("menuItemList")).iterator();
        while (it.hasNext()) {
            this.menuItems.add(CustomTabsMenuItem.fromMap((Map) it.next()));
        }
        if (this.customSettings.noHistory.booleanValue() && (noHistoryCustomTabsActivityCallbacks = this.manager.plugin.noHistoryCustomTabsActivityCallbacks) != null) {
            Map<String, String> map = noHistoryCustomTabsActivityCallbacks.noHistoryBrowserIDs;
            String str = this.id;
            map.put(str, str);
        }
        this.customTabActivityHelper.setConnectionCallback(new CustomTabActivityHelper.ConnectionCallback() { // from class: com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ChromeCustomTabsActivity.1
            @Override // com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.CustomTabActivityHelper.ConnectionCallback
            public void onCustomTabsConnected() {
                ChromeCustomTabsActivity.this.customTabsConnected();
                ChromeCustomTabsChannelDelegate chromeCustomTabsChannelDelegate = ChromeCustomTabsActivity.this.channelDelegate;
                if (chromeCustomTabsChannelDelegate != null) {
                    chromeCustomTabsChannelDelegate.onServiceConnected();
                }
            }

            @Override // com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.CustomTabActivityHelper.ConnectionCallback
            public void onCustomTabsDisconnected() {
                this.close();
                ChromeCustomTabsActivity.this.dispose();
            }
        });
        this.customTabActivityHelper.setCustomTabsCallback(new qlf() { // from class: com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ChromeCustomTabsActivity.2
            @Override // defpackage.qlf
            public void extraCallback(String str2, Bundle bundle2) {
            }

            @Override // defpackage.qlf
            public void onMessageChannelReady(Bundle bundle2) {
                ChromeCustomTabsChannelDelegate chromeCustomTabsChannelDelegate = ChromeCustomTabsActivity.this.channelDelegate;
                if (chromeCustomTabsChannelDelegate != null) {
                    chromeCustomTabsChannelDelegate.onMessageChannelReady();
                }
            }

            @Override // defpackage.qlf
            public void onNavigationEvent(int i, Bundle bundle2) {
                if (i == 5) {
                    ChromeCustomTabsActivity chromeCustomTabsActivity = ChromeCustomTabsActivity.this;
                    if (!chromeCustomTabsActivity.onOpened) {
                        chromeCustomTabsActivity.onOpened = true;
                        ChromeCustomTabsChannelDelegate chromeCustomTabsChannelDelegate = chromeCustomTabsActivity.channelDelegate;
                        if (chromeCustomTabsChannelDelegate != null) {
                            chromeCustomTabsChannelDelegate.onOpened();
                        }
                    }
                }
                if (i == 2) {
                    ChromeCustomTabsActivity chromeCustomTabsActivity2 = ChromeCustomTabsActivity.this;
                    if (!chromeCustomTabsActivity2.onCompletedInitialLoad) {
                        chromeCustomTabsActivity2.onCompletedInitialLoad = true;
                        ChromeCustomTabsChannelDelegate chromeCustomTabsChannelDelegate2 = chromeCustomTabsActivity2.channelDelegate;
                        if (chromeCustomTabsChannelDelegate2 != null) {
                            chromeCustomTabsChannelDelegate2.onCompletedInitialLoad();
                        }
                    }
                }
                ChromeCustomTabsChannelDelegate chromeCustomTabsChannelDelegate3 = ChromeCustomTabsActivity.this.channelDelegate;
                if (chromeCustomTabsChannelDelegate3 != null) {
                    chromeCustomTabsChannelDelegate3.onNavigationEvent(i);
                }
            }

            @Override // defpackage.qlf
            public void onPostMessage(String str2, Bundle bundle2) {
                ChromeCustomTabsChannelDelegate chromeCustomTabsChannelDelegate = ChromeCustomTabsActivity.this.channelDelegate;
                if (chromeCustomTabsChannelDelegate != null) {
                    chromeCustomTabsChannelDelegate.onPostMessage(str2);
                }
            }

            @Override // defpackage.qlf
            public void onRelationshipValidationResult(int i, Uri uri, boolean z, Bundle bundle2) {
                ChromeCustomTabsChannelDelegate chromeCustomTabsChannelDelegate = ChromeCustomTabsActivity.this.channelDelegate;
                if (chromeCustomTabsChannelDelegate != null) {
                    chromeCustomTabsChannelDelegate.onRelationshipValidationResult(i, uri, z);
                }
            }
        });
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void onStart() {
        String str;
        super.onStart();
        boolean bindCustomTabsService = this.customTabActivityHelper.bindCustomTabsService(this);
        this.isBindSuccess = bindCustomTabsService;
        if (bindCustomTabsService || (str = this.initialUrl) == null) {
            return;
        }
        launchUrlWithSession(null, str, this.initialHeaders, this.initialReferrer, this.initialOtherLikelyURLs);
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.customTabActivityHelper.unbindCustomTabsService(this);
        this.isBindSuccess = false;
    }

    public void updateActionButton(byte[] bArr, String str) {
        if (this.customTabsSession == null || this.actionButton == null) {
            return;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inMutable = true;
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        k kVar = this.customTabsSession;
        kVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putParcelable("android.support.customtabs.customaction.ICON", decodeByteArray);
        bundle.putString("android.support.customtabs.customaction.DESCRIPTION", str);
        Bundle bundle2 = new Bundle();
        bundle2.putBundle("android.support.customtabs.extra.ACTION_BUTTON_BUNDLE", bundle);
        try {
            kVar.b.updateVisuals(kVar.c, bundle2);
        } catch (RemoteException unused) {
        }
        this.actionButton.setIcon(bArr);
        this.actionButton.setDescription(str);
    }

    public void updateSecondaryToolbar(CustomTabsSecondaryToolbar customTabsSecondaryToolbar) {
        if (this.customTabsSession == null) {
            return;
        }
        AndroidResource layout = customTabsSecondaryToolbar.getLayout();
        RemoteViews remoteViews = new RemoteViews(layout.getDefPackage(), layout.getIdentifier(this));
        int[] iArr = new int[customTabsSecondaryToolbar.getClickableIDs().size()];
        int size = customTabsSecondaryToolbar.getClickableIDs().size();
        for (int i = 0; i < size; i++) {
            iArr[i] = customTabsSecondaryToolbar.getClickableIDs().get(i).getIdentifier(this);
        }
        k kVar = this.customTabsSession;
        PendingIntent secondaryToolbarOnClickPendingIntent = getSecondaryToolbarOnClickPendingIntent();
        kVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putParcelable("android.support.customtabs.extra.EXTRA_REMOTEVIEWS", remoteViews);
        bundle.putIntArray("android.support.customtabs.extra.EXTRA_REMOTEVIEWS_VIEW_IDS", iArr);
        bundle.putParcelable("android.support.customtabs.extra.EXTRA_REMOTEVIEWS_PENDINGINTENT", secondaryToolbarOnClickPendingIntent);
        try {
            kVar.b.updateVisuals(kVar.c, bundle);
        } catch (RemoteException unused) {
        }
        this.secondaryToolbar = customTabsSecondaryToolbar;
    }
}
