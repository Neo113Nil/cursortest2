package com.pichillilorenzo.flutter_inappwebview_android.credential_database;

import android.content.Context;
import android.webkit.WebViewDatabase;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLCredentialContract;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.URLCredential;
import com.pichillilorenzo.flutter_inappwebview_android.types.URLProtectionSpace;
import com.yandex.passport.internal.ui.autologin.AutoLoginRetryActivity;
import defpackage.da20;
import defpackage.ea20;
import defpackage.x920;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes11.dex */
public class CredentialDatabaseHandler extends ChannelDelegateImpl {
    protected static final String LOG_TAG = "CredentialDatabaseHandler";
    public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_inappwebview_credential_database";
    public static CredentialDatabase credentialDatabase;
    public InAppWebViewFlutterPlugin plugin;

    public CredentialDatabaseHandler(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        super(new ea20(inAppWebViewFlutterPlugin.messenger, METHOD_CHANNEL_NAME));
        this.plugin = inAppWebViewFlutterPlugin;
    }

    public static void init(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        if (credentialDatabase == null) {
            credentialDatabase = CredentialDatabase.getInstance(inAppWebViewFlutterPlugin.applicationContext);
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        super.dispose();
        this.plugin = null;
        credentialDatabase = null;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.IChannelDelegate, defpackage.ca20
    public void onMethodCall(x920 x920Var, da20 da20Var) {
        Context context;
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
        if (inAppWebViewFlutterPlugin != null) {
            init(inAppWebViewFlutterPlugin);
        }
        String str = x920Var.a;
        str.getClass();
        switch (str) {
            case "clearAllAuthCredentials":
                CredentialDatabase credentialDatabase2 = credentialDatabase;
                if (credentialDatabase2 != null) {
                    credentialDatabase2.clearAllAuthCredentials();
                    InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin2 = this.plugin;
                    if (inAppWebViewFlutterPlugin2 != null && (context = inAppWebViewFlutterPlugin2.applicationContext) != null) {
                        WebViewDatabase.getInstance(context).clearHttpAuthUsernamePassword();
                    }
                    da20Var.success(Boolean.TRUE);
                    break;
                } else {
                    da20Var.success(Boolean.FALSE);
                    break;
                }
                break;
            case "getHttpAuthCredentials":
                ArrayList arrayList = new ArrayList();
                if (credentialDatabase != null) {
                    Iterator<URLCredential> it = credentialDatabase.getHttpAuthCredentials((String) x920Var.a(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST), (String) x920Var.a(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PROTOCOL), (String) x920Var.a(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_REALM), (Integer) x920Var.a(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PORT)).iterator();
                    while (it.hasNext()) {
                        arrayList.add(it.next().toMap());
                    }
                }
                da20Var.success(arrayList);
                break;
            case "removeHttpAuthCredential":
                if (credentialDatabase != null) {
                    credentialDatabase.removeHttpAuthCredential((String) x920Var.a(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST), (String) x920Var.a(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PROTOCOL), (String) x920Var.a(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_REALM), (Integer) x920Var.a(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PORT), (String) x920Var.a(URLCredentialContract.FeedEntry.COLUMN_NAME_USERNAME), (String) x920Var.a(URLCredentialContract.FeedEntry.COLUMN_NAME_PASSWORD));
                    da20Var.success(Boolean.TRUE);
                    break;
                } else {
                    da20Var.success(Boolean.FALSE);
                    break;
                }
            case "setHttpAuthCredential":
                if (credentialDatabase != null) {
                    credentialDatabase.setHttpAuthCredential((String) x920Var.a(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST), (String) x920Var.a(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PROTOCOL), (String) x920Var.a(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_REALM), (Integer) x920Var.a(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PORT), (String) x920Var.a(URLCredentialContract.FeedEntry.COLUMN_NAME_USERNAME), (String) x920Var.a(URLCredentialContract.FeedEntry.COLUMN_NAME_PASSWORD));
                    da20Var.success(Boolean.TRUE);
                    break;
                } else {
                    da20Var.success(Boolean.FALSE);
                    break;
                }
            case "removeHttpAuthCredentials":
                if (credentialDatabase != null) {
                    credentialDatabase.removeHttpAuthCredentials((String) x920Var.a(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST), (String) x920Var.a(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PROTOCOL), (String) x920Var.a(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_REALM), (Integer) x920Var.a(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PORT));
                    da20Var.success(Boolean.TRUE);
                    break;
                } else {
                    da20Var.success(Boolean.FALSE);
                    break;
                }
            case "getAllAuthCredentials":
                ArrayList arrayList2 = new ArrayList();
                CredentialDatabase credentialDatabase3 = credentialDatabase;
                if (credentialDatabase3 != null) {
                    for (URLProtectionSpace uRLProtectionSpace : credentialDatabase3.protectionSpaceDao.getAll()) {
                        ArrayList arrayList3 = new ArrayList();
                        Iterator<URLCredential> it2 = credentialDatabase.credentialDao.getAllByProtectionSpaceId(uRLProtectionSpace.getId()).iterator();
                        while (it2.hasNext()) {
                            arrayList3.add(it2.next().toMap());
                        }
                        HashMap hashMap = new HashMap();
                        hashMap.put("protectionSpace", uRLProtectionSpace.toMap());
                        hashMap.put(AutoLoginRetryActivity.KEY_USER_CREDENTIALS, arrayList3);
                        arrayList2.add(hashMap);
                    }
                }
                da20Var.success(arrayList2);
                break;
            default:
                da20Var.notImplemented();
                break;
        }
    }
}
