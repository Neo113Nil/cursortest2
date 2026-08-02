package xsna;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Process;
import androidx.annotation.NonNull;

/* compiled from: com.google.android.gms:play-services-basement@@18.10.0 */
/* loaded from: classes.dex */
public final class a890 {

    @NonNull
    public final Context a;

    public a890(@NonNull Context context) {
        this.a = context;
    }

    @NonNull
    public final ApplicationInfo a(int i, @NonNull String str) throws PackageManager.NameNotFoundException {
        return this.a.getPackageManager().getApplicationInfo(str, i);
    }

    @NonNull
    public final PackageInfo b(@NonNull String str, int i) throws PackageManager.NameNotFoundException {
        return this.a.getPackageManager().getPackageInfo(str, i);
    }

    public final boolean c() {
        int callingUid = Binder.getCallingUid();
        int myUid = Process.myUid();
        Context context = this.a;
        if (callingUid == myUid) {
            return q6x.v(context);
        }
        String nameForUid = context.getPackageManager().getNameForUid(Binder.getCallingUid());
        if (nameForUid != null) {
            return context.getPackageManager().isInstantApp(nameForUid);
        }
        return false;
    }
}
