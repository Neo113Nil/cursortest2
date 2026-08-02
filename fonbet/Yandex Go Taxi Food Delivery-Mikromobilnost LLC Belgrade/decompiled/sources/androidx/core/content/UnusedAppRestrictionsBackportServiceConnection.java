package androidx.core.content;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback;
import androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService;
import defpackage.hsj0;
import defpackage.ny61;
import java.util.Iterator;

/* loaded from: classes10.dex */
class UnusedAppRestrictionsBackportServiceConnection implements ServiceConnection {
    private final Context mContext;
    hsj0 mResultFuture;
    IUnusedAppRestrictionsBackportService mUnusedAppRestrictionsService = null;
    private boolean mHasBoundService = false;

    public UnusedAppRestrictionsBackportServiceConnection(Context context) {
        this.mContext = context;
    }

    private IUnusedAppRestrictionsBackportCallback getBackportCallback() {
        return new IUnusedAppRestrictionsBackportCallback.Stub() { // from class: androidx.core.content.UnusedAppRestrictionsBackportServiceConnection.1
            @Override // androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback.Stub, androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback
            public void onIsPermissionRevocationEnabledForAppResult(boolean z, boolean z2) throws RemoteException {
                if (!z) {
                    UnusedAppRestrictionsBackportServiceConnection.this.mResultFuture.k(0);
                    Log.e("PackageManagerCompat", "Unable to retrieve the permission revocation setting from the backport");
                    return;
                }
                UnusedAppRestrictionsBackportServiceConnection unusedAppRestrictionsBackportServiceConnection = UnusedAppRestrictionsBackportServiceConnection.this;
                if (z2) {
                    unusedAppRestrictionsBackportServiceConnection.mResultFuture.k(3);
                } else {
                    unusedAppRestrictionsBackportServiceConnection.mResultFuture.k(2);
                }
            }
        };
    }

    public void connectAndFetchResult(hsj0 hsj0Var) {
        if (this.mHasBoundService) {
            ny61.r("Each UnusedAppRestrictionsBackportServiceConnection can only be bound once.");
            return;
        }
        this.mHasBoundService = true;
        this.mResultFuture = hsj0Var;
        Intent intent = new Intent(UnusedAppRestrictionsBackportService.ACTION_UNUSED_APP_RESTRICTIONS_BACKPORT_CONNECTION);
        PackageManager packageManager = this.mContext.getPackageManager();
        String str = null;
        Iterator<ResolveInfo> it = packageManager.queryIntentActivities(new Intent("android.intent.action.AUTO_REVOKE_PERMISSIONS").setData(Uri.fromParts("package", "com.example", null)), 0).iterator();
        while (it.hasNext()) {
            String str2 = it.next().activityInfo.packageName;
            if (packageManager.checkPermission("android.permission.PACKAGE_VERIFICATION_AGENT", str2) == 0) {
                if (str != null) {
                    break;
                } else {
                    str = str2;
                }
            }
        }
        this.mContext.bindService(intent.setPackage(str), this, 1);
    }

    public void disconnectFromService() {
        if (!this.mHasBoundService) {
            ny61.r("bindService must be called before unbind");
        } else {
            this.mHasBoundService = false;
            this.mContext.unbindService(this);
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        IUnusedAppRestrictionsBackportService asInterface = IUnusedAppRestrictionsBackportService.Stub.asInterface(iBinder);
        this.mUnusedAppRestrictionsService = asInterface;
        try {
            asInterface.isPermissionRevocationEnabledForApp(getBackportCallback());
        } catch (RemoteException unused) {
            this.mResultFuture.k(0);
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        this.mUnusedAppRestrictionsService = null;
    }
}
