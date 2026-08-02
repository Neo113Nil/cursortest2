package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.customtabs.IAuthTabCallback;
import android.support.customtabs.ICustomTabsCallback;
import android.support.customtabs.ICustomTabsService;
import android.support.customtabs.IEngagementSignalsCallback;
import defpackage.e1o;
import defpackage.f1o;
import defpackage.nl3;
import defpackage.rh;
import defpackage.wlf;
import defpackage.xne0;
import defpackage.ycs0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;

/* loaded from: classes10.dex */
public abstract class CustomTabsService extends Service {
    public static final String ACTION_CUSTOM_TABS_CONNECTION = "android.support.customtabs.action.CustomTabsService";
    public static final String CATEGORY_AUTH_TAB = "androidx.browser.auth.category.AuthTab";
    public static final String CATEGORY_COLOR_SCHEME_CUSTOMIZATION = "androidx.browser.customtabs.category.ColorSchemeCustomization";
    public static final String CATEGORY_EPHEMERAL_BROWSING = "androidx.browser.customtabs.category.EphemeralBrowsing";
    public static final String CATEGORY_NAVBAR_COLOR_CUSTOMIZATION = "androidx.browser.customtabs.category.NavBarColorCustomization";
    public static final String CATEGORY_SET_NETWORK = "androidx.browser.customtabs.category.SetNetwork";
    public static final String CATEGORY_TRUSTED_WEB_ACTIVITY_IMMERSIVE_MODE = "androidx.browser.trusted.category.ImmersiveMode";
    public static final String CATEGORY_WEB_SHARE_TARGET_V2 = "androidx.browser.trusted.category.WebShareTargetV2";
    public static final int FILE_PURPOSE_TRUSTED_WEB_ACTIVITY_SPLASH_IMAGE = 1;
    public static final String KEY_SUCCESS = "androidx.browser.customtabs.SUCCESS";
    public static final String KEY_URL = "android.support.customtabs.otherurls.URL";
    public static final int RELATION_HANDLE_ALL_URLS = 2;
    public static final int RELATION_USE_AS_ORIGIN = 1;
    public static final int RESULT_FAILURE_DISALLOWED = -1;
    public static final int RESULT_FAILURE_MESSAGING_ERROR = -3;
    public static final int RESULT_FAILURE_REMOTE_ERROR = -2;
    public static final int RESULT_SUCCESS = 0;
    private static final String TAG = "CustomTabsService";
    public static final String TRUSTED_WEB_ACTIVITY_CATEGORY = "androidx.browser.trusted.category.TrustedWebActivities";
    final ycs0 mDeathRecipientMap = new ycs0();
    private ICustomTabsService.Stub mBinder = new AnonymousClass1();

    /* renamed from: androidx.browser.customtabs.CustomTabsService$1, reason: invalid class name */
    public class AnonymousClass1 extends ICustomTabsService.Stub {
        public AnonymousClass1() {
        }

        private PendingIntent getSessionIdFromBundle(Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("android.support.customtabs.extra.SESSION_ID");
            bundle.remove("android.support.customtabs.extra.SESSION_ID");
            return pendingIntent;
        }

        private Uri getTargetOriginFromBundle(Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            return Build.VERSION.SDK_INT >= 33 ? (Uri) rh.e(bundle, "target_origin") : (Uri) bundle.getParcelable("target_origin");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$newAuthTabSession$1(nl3 nl3Var) {
            CustomTabsService.this.cleanUpSession(nl3Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$newSessionInternal$0(wlf wlfVar) {
            CustomTabsService.this.cleanUpSession(wlfVar);
        }

        private boolean newSessionInternal(ICustomTabsCallback iCustomTabsCallback, PendingIntent pendingIntent) {
            wlf wlfVar = new wlf(iCustomTabsCallback, pendingIntent);
            try {
                h hVar = new h(this, wlfVar, 0);
                synchronized (CustomTabsService.this.mDeathRecipientMap) {
                    iCustomTabsCallback.asBinder().linkToDeath(hVar, 0);
                    CustomTabsService.this.mDeathRecipientMap.put(iCustomTabsCallback.asBinder(), hVar);
                }
                return CustomTabsService.this.newSession(wlfVar);
            } catch (RemoteException unused) {
                return false;
            }
        }

        @Override // android.support.customtabs.ICustomTabsService.Stub, android.support.customtabs.ICustomTabsService
        public Bundle extraCommand(String str, Bundle bundle) {
            return CustomTabsService.this.extraCommand(str, bundle);
        }

        @Override // android.support.customtabs.ICustomTabsService.Stub, android.support.customtabs.ICustomTabsService
        public boolean isEngagementSignalsApiAvailable(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) {
            return CustomTabsService.this.isEngagementSignalsApiAvailable(new wlf(iCustomTabsCallback, getSessionIdFromBundle(bundle)), bundle);
        }

        @Override // android.support.customtabs.ICustomTabsService.Stub, android.support.customtabs.ICustomTabsService
        public boolean mayLaunchUrl(ICustomTabsCallback iCustomTabsCallback, Uri uri, Bundle bundle, List<Bundle> list) {
            return CustomTabsService.this.mayLaunchUrl(new wlf(iCustomTabsCallback, getSessionIdFromBundle(bundle)), uri, bundle, list);
        }

        @Override // android.support.customtabs.ICustomTabsService.Stub, android.support.customtabs.ICustomTabsService
        public boolean newAuthTabSession(IAuthTabCallback iAuthTabCallback, Bundle bundle) {
            nl3 nl3Var = new nl3(iAuthTabCallback, getSessionIdFromBundle(bundle));
            try {
                h hVar = new h(this, nl3Var, 1);
                synchronized (CustomTabsService.this.mDeathRecipientMap) {
                    iAuthTabCallback.asBinder().linkToDeath(hVar, 0);
                    CustomTabsService.this.mDeathRecipientMap.put(iAuthTabCallback.asBinder(), hVar);
                }
                return CustomTabsService.this.registerAuthTabSession(nl3Var);
            } catch (RemoteException unused) {
                return false;
            }
        }

        @Override // android.support.customtabs.ICustomTabsService.Stub, android.support.customtabs.ICustomTabsService
        public boolean newSession(ICustomTabsCallback iCustomTabsCallback) {
            return newSessionInternal(iCustomTabsCallback, null);
        }

        @Override // android.support.customtabs.ICustomTabsService.Stub, android.support.customtabs.ICustomTabsService
        public boolean newSessionWithExtras(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) {
            return newSessionInternal(iCustomTabsCallback, getSessionIdFromBundle(bundle));
        }

        @Override // android.support.customtabs.ICustomTabsService.Stub, android.support.customtabs.ICustomTabsService
        public int postMessage(ICustomTabsCallback iCustomTabsCallback, String str, Bundle bundle) {
            return CustomTabsService.this.postMessage(new wlf(iCustomTabsCallback, getSessionIdFromBundle(bundle)), str, bundle);
        }

        @Override // android.support.customtabs.ICustomTabsService.Stub, android.support.customtabs.ICustomTabsService
        public void prefetch(ICustomTabsCallback iCustomTabsCallback, Uri uri, Bundle bundle) {
            CustomTabsService customTabsService = CustomTabsService.this;
            wlf wlfVar = new wlf(iCustomTabsCallback, getSessionIdFromBundle(bundle));
            ArrayList arrayList = new ArrayList(1);
            Object obj = new Object[]{uri}[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            customTabsService.prefetch(wlfVar, Collections.unmodifiableList(arrayList), xne0.a(bundle));
        }

        @Override // android.support.customtabs.ICustomTabsService.Stub, android.support.customtabs.ICustomTabsService
        public void prefetchWithMultipleUrls(ICustomTabsCallback iCustomTabsCallback, List<Uri> list, Bundle bundle) {
            CustomTabsService.this.prefetch(new wlf(iCustomTabsCallback, getSessionIdFromBundle(bundle)), list, xne0.a(bundle));
        }

        @Override // android.support.customtabs.ICustomTabsService.Stub, android.support.customtabs.ICustomTabsService
        public boolean receiveFile(ICustomTabsCallback iCustomTabsCallback, Uri uri, int i, Bundle bundle) {
            return CustomTabsService.this.receiveFile(new wlf(iCustomTabsCallback, getSessionIdFromBundle(bundle)), uri, i, bundle);
        }

        @Override // android.support.customtabs.ICustomTabsService.Stub, android.support.customtabs.ICustomTabsService
        public boolean requestPostMessageChannel(ICustomTabsCallback iCustomTabsCallback, Uri uri) {
            return CustomTabsService.this.requestPostMessageChannel(new wlf(iCustomTabsCallback, null), uri, null, new Bundle());
        }

        @Override // android.support.customtabs.ICustomTabsService.Stub, android.support.customtabs.ICustomTabsService
        public boolean requestPostMessageChannelWithExtras(ICustomTabsCallback iCustomTabsCallback, Uri uri, Bundle bundle) {
            return CustomTabsService.this.requestPostMessageChannel(new wlf(iCustomTabsCallback, getSessionIdFromBundle(bundle)), uri, getTargetOriginFromBundle(bundle), bundle);
        }

        @Override // android.support.customtabs.ICustomTabsService.Stub, android.support.customtabs.ICustomTabsService
        public boolean setEngagementSignalsCallback(ICustomTabsCallback iCustomTabsCallback, IBinder iBinder, Bundle bundle) {
            return CustomTabsService.this.setEngagementSignalsCallback(new wlf(iCustomTabsCallback, getSessionIdFromBundle(bundle)), new f1o(IEngagementSignalsCallback.Stub.asInterface(iBinder)), bundle);
        }

        @Override // android.support.customtabs.ICustomTabsService.Stub, android.support.customtabs.ICustomTabsService
        public boolean updateVisuals(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) {
            return CustomTabsService.this.updateVisuals(new wlf(iCustomTabsCallback, getSessionIdFromBundle(bundle)), bundle);
        }

        @Override // android.support.customtabs.ICustomTabsService.Stub, android.support.customtabs.ICustomTabsService
        public boolean validateRelationship(ICustomTabsCallback iCustomTabsCallback, int i, Uri uri, Bundle bundle) {
            return CustomTabsService.this.validateRelationship(new wlf(iCustomTabsCallback, getSessionIdFromBundle(bundle)), i, uri, bundle);
        }

        @Override // android.support.customtabs.ICustomTabsService.Stub, android.support.customtabs.ICustomTabsService
        public boolean warmup(long j) {
            return CustomTabsService.this.warmup(j);
        }
    }

    public boolean cleanUpSession(wlf wlfVar) {
        try {
            synchronized (this.mDeathRecipientMap) {
                try {
                    ICustomTabsCallback iCustomTabsCallback = wlfVar.a;
                    IBinder asBinder = iCustomTabsCallback == null ? null : iCustomTabsCallback.asBinder();
                    if (asBinder == null) {
                        return false;
                    }
                    asBinder.unlinkToDeath((IBinder.DeathRecipient) this.mDeathRecipientMap.get(asBinder), 0);
                    this.mDeathRecipientMap.remove(asBinder);
                    return true;
                } finally {
                }
            }
        } catch (NoSuchElementException unused) {
            return false;
        }
    }

    public abstract Bundle extraCommand(String str, Bundle bundle);

    public boolean isEngagementSignalsApiAvailable(wlf wlfVar, Bundle bundle) {
        return false;
    }

    public abstract boolean mayLaunchUrl(wlf wlfVar, Uri uri, Bundle bundle, List<Bundle> list);

    public abstract boolean newSession(wlf wlfVar);

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.mBinder;
    }

    public abstract int postMessage(wlf wlfVar, String str, Bundle bundle);

    public void prefetch(wlf wlfVar, Uri uri, xne0 xne0Var) {
    }

    public void prefetch(wlf wlfVar, List<Uri> list, xne0 xne0Var) {
    }

    public abstract boolean receiveFile(wlf wlfVar, Uri uri, int i, Bundle bundle);

    public boolean registerAuthTabSession(nl3 nl3Var) {
        return false;
    }

    public abstract boolean requestPostMessageChannel(wlf wlfVar, Uri uri);

    public boolean requestPostMessageChannel(wlf wlfVar, Uri uri, Uri uri2, Bundle bundle) {
        return requestPostMessageChannel(wlfVar, uri);
    }

    public boolean setEngagementSignalsCallback(wlf wlfVar, e1o e1oVar, Bundle bundle) {
        return false;
    }

    public abstract boolean updateVisuals(wlf wlfVar, Bundle bundle);

    public abstract boolean validateRelationship(wlf wlfVar, int i, Uri uri, Bundle bundle);

    public abstract boolean warmup(long j);

    public boolean cleanUpSession(nl3 nl3Var) {
        try {
            synchronized (this.mDeathRecipientMap) {
                try {
                    IAuthTabCallback iAuthTabCallback = nl3Var.a;
                    IBinder asBinder = iAuthTabCallback == null ? null : iAuthTabCallback.asBinder();
                    if (asBinder == null) {
                        return false;
                    }
                    asBinder.unlinkToDeath((IBinder.DeathRecipient) this.mDeathRecipientMap.get(asBinder), 0);
                    this.mDeathRecipientMap.remove(asBinder);
                    return true;
                } finally {
                }
            }
        } catch (NoSuchElementException unused) {
            return false;
        }
    }
}
