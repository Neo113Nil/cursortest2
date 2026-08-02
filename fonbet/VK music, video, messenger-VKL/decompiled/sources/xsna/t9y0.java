package xsna;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.digitalturbine.ignite.cl.aidl.IIgniteServiceAPI;

/* loaded from: classes12.dex */
public interface t9y0 extends ServiceConnection, ray0 {
    void a(String str);

    boolean a();

    void b();

    void b(ComponentName componentName, IBinder iBinder);

    void b(String str);

    void c(String str);

    boolean c();

    String d();

    void d(bwy0 bwy0Var);

    void destroy();

    String e();

    void e(bwy0 bwy0Var);

    boolean f();

    Context g();

    boolean h();

    String i();

    boolean j();

    IIgniteServiceAPI k();
}
