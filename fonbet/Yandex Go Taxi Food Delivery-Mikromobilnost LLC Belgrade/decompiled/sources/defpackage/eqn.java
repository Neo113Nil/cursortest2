package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import com.airbnb.lottie.LottieAnimationView;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.concurrent.Callable;
import java.util.zip.ZipInputStream;
import org.webrtc.EglBase;
import org.webrtc.EglThread;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final /* synthetic */ class eqn implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ eqn(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        EglBase.EglConnection lambda$create$0;
        ServiceInfo serviceInfo;
        String str;
        int i;
        euz lambda$fromAssets$2;
        String str2 = null;
        switch (this.a) {
            case 0:
                lambda$create$0 = EglThread.lambda$create$0((EglBase.Context) this.b, (int[]) this.c);
                return lambda$create$0;
            case 1:
                Context context = (Context) this.b;
                Intent intent = (Intent) this.c;
                cxq0 v = cxq0.v();
                v.getClass();
                Log.isLoggable("FirebaseMessaging", 3);
                ((ArrayDeque) v.x).offer(intent);
                Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent2.setPackage(context.getPackageName());
                synchronized (v) {
                    try {
                        String str3 = (String) v.b;
                        if (str3 != null) {
                            str2 = str3;
                        } else {
                            ResolveInfo resolveService = context.getPackageManager().resolveService(intent2, 0);
                            if (resolveService != null && (serviceInfo = resolveService.serviceInfo) != null) {
                                if (context.getPackageName().equals(serviceInfo.packageName) && (str = serviceInfo.name) != null) {
                                    if (str.startsWith(Extension.DOT_CHAR)) {
                                        v.b = context.getPackageName() + serviceInfo.name;
                                    } else {
                                        v.b = serviceInfo.name;
                                    }
                                    str2 = (String) v.b;
                                }
                                Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + "/" + serviceInfo.name);
                            }
                            Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
                        }
                    } finally {
                    }
                }
                if (str2 != null) {
                    Log.isLoggable("FirebaseMessaging", 3);
                    intent2.setClassName(context.getPackageName(), str2);
                }
                try {
                    if ((v.y(context) ? l8a1.f(context, intent2) : context.startService(intent2)) == null) {
                        Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                        i = 404;
                    } else {
                        i = -1;
                    }
                } catch (IllegalStateException e) {
                    Log.e("FirebaseMessaging", "Failed to start service while in background: " + e);
                    i = 402;
                } catch (SecurityException e2) {
                    Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e2);
                    i = 401;
                }
                return Integer.valueOf(i);
            case 2:
                lambda$fromAssets$2 = ((LottieAnimationView) this.b).lambda$fromAssets$2((String) this.c);
                return lambda$fromAssets$2;
            case 3:
                return ssz.d((InputStream) this.b, (String) this.c);
            default:
                return ssz.j(null, (ZipInputStream) this.b, (String) this.c);
        }
    }
}
