package xsna;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamite.DynamiteModule;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* compiled from: com.google.android.gms:play-services-basement@@18.10.0 */
/* loaded from: classes.dex */
public final class sm01 {
    public static final ee01 a;
    public static final wf01 b;
    public static volatile evz0 c;
    public static final Object d;

    @Nullable
    public static Context e;

    static {
        Charset charset = StandardCharsets.ISO_8859_1;
        new j701("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u007f¢fú§p\u0085xb±".getBytes(charset));
        new y701("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014QÕÛ\u0004÷XçB\u0086<".getBytes(charset));
        new va01("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí".getBytes(charset));
        new pc01("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì".getBytes(charset));
        a = new ee01("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0".getBytes(charset));
        b = new wf01("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0".getBytes(charset));
        d = new Object();
    }

    public static void a() throws DynamiteModule.LoadingException {
        if (c != null) {
            return;
        }
        exc0.i(e);
        synchronized (d) {
            try {
                if (c == null) {
                    c = vuz0.f(DynamiteModule.c(e, DynamiteModule.e, "com.google.android.gms.googlecertificates").b("com.google.android.gms.common.GoogleCertificatesImpl"));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Deprecated
    public static os01 b(String str, yi01 yi01Var, boolean z, boolean z2) {
        try {
            a();
            exc0.i(e);
            try {
                return c.t1(new com.google.android.gms.common.zzt(str, yi01Var, z, z2), new bq70(e.getPackageManager())) ? os01.c : new es01(new mk01(z, str, yi01Var));
            } catch (RemoteException e2) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
                return os01.c(e2, "module call");
            }
        } catch (DynamiteModule.LoadingException e3) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e3);
            return os01.c(e3, "module init: ".concat(String.valueOf(e3.getMessage())));
        }
    }
}
