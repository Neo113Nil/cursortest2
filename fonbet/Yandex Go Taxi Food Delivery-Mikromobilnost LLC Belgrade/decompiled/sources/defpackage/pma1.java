package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.util.Log;
import com.google.common.base.Optional;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes.dex */
public abstract class pma1 {
    public static volatile Optional a = Optional.a();
    public static final Object b = new Object();

    public static boolean a(Context context, Uri uri) {
        ProviderInfo resolveContentProvider;
        String authority = uri.getAuthority();
        boolean z = false;
        if (!"com.google.android.gms.phenotype".equals(authority)) {
            Log.e("PhenotypeClientHelper", String.valueOf(authority).concat(" is an unsupported authority. Only com.google.android.gms.phenotype authority is supported."));
            return false;
        }
        if (a.c()) {
            return ((Boolean) a.b()).booleanValue();
        }
        synchronized (b) {
            try {
                if (a.c()) {
                    return ((Boolean) a.b()).booleanValue();
                }
                if ("com.google.android.gms".equals(context.getPackageName()) || ((resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.phenotype", SelfTester_JCP.IMITA)) != null && "com.google.android.gms".equals(resolveContentProvider.packageName))) {
                    try {
                        if ((context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & HProv.PP_SECURITY_LEVEL) != 0) {
                            z = true;
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                a = Optional.f(Boolean.valueOf(z));
                return ((Boolean) a.b()).booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
