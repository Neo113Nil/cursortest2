package yads;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.huawei.hms.hihealth.data.DeviceInfo;
import io.appmetrica.analytics.AppMetrica;
import java.util.concurrent.TimeUnit;
import xsna.gzs;
import xsna.s3q0;

/* loaded from: classes10.dex */
public final class wg implements dh {
    public static final long g = TimeUnit.SECONDS.toMillis(30);
    public final ug a;
    public final fh b;
    public boolean e;
    public final Handler c = new Handler(Looper.getMainLooper());
    public final rg d = new rg();
    public final Object f = new Object();

    public wg(ug ugVar, fh fhVar) {
        this.a = ugVar;
        this.b = fhVar;
    }

    public final void a() {
        ug ugVar = this.a;
        synchronized (ugVar.a) {
            ugVar.b.clear();
            s3q0 s3q0Var = s3q0.a;
        }
    }

    public final void b() {
        this.c.postDelayed(new xsna.o1(new vg(this), 19), g);
    }

    public final void c() {
        synchronized (this.f) {
            this.c.removeCallbacksAndMessages(null);
            this.e = false;
            s3q0 s3q0Var = s3q0.a;
        }
    }

    public static final void a(gzs gzsVar) {
        gzsVar.invoke();
    }

    public final void a(Context context) {
        boolean z;
        synchronized (this.f) {
            try {
                if (this.e) {
                    z = false;
                } else {
                    z = true;
                    this.e = true;
                }
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            b();
            this.b.getClass();
            try {
                AppMetrica.requestStartupParams(context, new hh(this), ih.a);
            } catch (Throwable unused) {
                ch chVar = ch.b;
                c();
                this.d.a.getClass();
                String str = (String) sg.a.get(chVar);
                if (str == null) {
                    str = DeviceInfo.STR_TYPE_UNKNOWN;
                }
                rg.a(str);
                a();
            }
        }
    }
}
