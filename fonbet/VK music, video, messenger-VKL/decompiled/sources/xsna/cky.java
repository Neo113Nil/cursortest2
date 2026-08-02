package xsna;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import com.vk.init.network.exceptions.UploadLogException;
import com.vk.permission.PermissionHelper;
import com.vk.utils.log.LogUploader;
import java.io.File;
import xsna.b660;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class cky implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ cky(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                File file = (File) this.c;
                dky dkyVar = (dky) this.d;
                LogUploader logUploader = LogUploader.a;
                LogUploader.b bVar = LogUploader.b;
                LogUploader.a a = bVar.a();
                if ((a != null && (!bVar.a.getBoolean("log_collector_is_net_sent_key", false) || a.d())) ? a.b() : false) {
                    logUploader.e(o25.a().c().b, l370.L(file), LogUploader.LogArtifact.NETLOG);
                }
                s73 s73Var = dkyVar.e;
                if (s73Var.b()) {
                    PermissionHelper permissionHelper = PermissionHelper.a;
                    Context context = dkyVar.b;
                    permissionHelper.getClass();
                    s73Var.d(PermissionHelper.q(context));
                    if (s73Var.b()) {
                        try {
                            wjy.a.getClass();
                            wjy.b().b();
                            break;
                        } catch (Throwable th) {
                            com.vk.metrics.eventtracking.b.a.a(new UploadLogException(th));
                            s73Var.d(false);
                            return;
                        }
                    }
                }
                break;
            default:
                b660.d dVar = (b660.d) this.c;
                Context context2 = (Context) this.d;
                b660 b660Var = dVar.a;
                ConnectivityManager connectivityManager = (ConnectivityManager) context2.getSystemService("connectivity");
                int i = 0;
                if (connectivityManager != null) {
                    try {
                        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                            int type = activeNetworkInfo.getType();
                            if (type != 0) {
                                if (type != 1) {
                                    if (type != 4 && type != 5) {
                                        if (type != 6) {
                                            i = type != 9 ? 8 : 7;
                                        }
                                        i = 5;
                                    }
                                }
                                i = 2;
                            }
                            switch (activeNetworkInfo.getSubtype()) {
                                case 1:
                                case 2:
                                    i = 3;
                                    break;
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 14:
                                case 15:
                                case 17:
                                    i = 4;
                                    break;
                                case 13:
                                    i = 5;
                                    break;
                                case 16:
                                case 19:
                                default:
                                    i = 6;
                                    break;
                                case 18:
                                    i = 2;
                                    break;
                                case 20:
                                    if (Build.VERSION.SDK_INT >= 29) {
                                        i = 9;
                                        break;
                                    }
                                    break;
                            }
                        } else {
                            i = 1;
                        }
                    } catch (SecurityException unused) {
                    }
                }
                if (Build.VERSION.SDK_INT >= 31 && i == 5) {
                    b660.a.a(context2, b660Var);
                    break;
                } else {
                    b660Var.d(i);
                    break;
                }
                break;
        }
    }
}
