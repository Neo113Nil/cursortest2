package xsna;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.annotation.NonNull;

/* compiled from: com.google.mlkit:common@@18.7.0 */
/* loaded from: classes13.dex */
public final class gng {
    public static final f3u a = new f3u("CommonUtils", "");

    @NonNull
    public static String a(@NonNull Context context) {
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException e) {
            String concat = "Exception thrown when trying to get app version ".concat(e.toString());
            f3u f3uVar = a;
            if (!Log.isLoggable(f3uVar.a, 6)) {
                return "";
            }
            String str = f3uVar.b;
            if (str != null) {
                concat = str.concat(concat);
            }
            Log.e("CommonUtils", concat);
            return "";
        }
    }
}
