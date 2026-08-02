package xsna;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import xsna.smv;

/* compiled from: CustomTabsServiceConnection.java */
/* loaded from: classes11.dex */
public abstract class nok implements ServiceConnection {

    @Nullable
    private Context mApplicationContext;

    /* compiled from: CustomTabsServiceConnection.java */
    public class a extends lok {
    }

    @Nullable
    public Context getApplicationContext() {
        return this.mApplicationContext;
    }

    public abstract void onCustomTabsServiceConnected(@NonNull ComponentName componentName, @NonNull lok lokVar);

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(@NonNull ComponentName componentName, @NonNull IBinder iBinder) {
        smv smvVar;
        if (this.mApplicationContext == null) {
            throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
        }
        int i = smv.a.a;
        if (iBinder == null) {
            smvVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof smv)) {
                smv.a.C3681a c3681a = new smv.a.C3681a();
                c3681a.a = iBinder;
                smvVar = c3681a;
            } else {
                smvVar = (smv) queryLocalInterface;
            }
        }
        onCustomTabsServiceConnected(componentName, new a(smvVar, componentName));
    }

    public void setApplicationContext(@NonNull Context context) {
        this.mApplicationContext = context;
    }
}
