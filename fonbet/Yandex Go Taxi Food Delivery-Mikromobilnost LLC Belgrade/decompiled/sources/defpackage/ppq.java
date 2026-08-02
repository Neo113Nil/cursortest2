package defpackage;

import android.app.Application;
import com.yandex.passport.internal.impl.f;
import com.yandex.passport.internal.m;
import com.yandex.passport.internal.provider.communication.p;
import com.yandex.passport.internal.report.kd;
import com.yandex.passport.internal.report.od;
import com.yandex.passport.internal.s;
import io.appmetrica.analytics.IReporterYandex;

/* loaded from: classes.dex */
public final /* synthetic */ class ppq implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Application b;

    public /* synthetic */ ppq(Application application, int i) {
        this.a = i;
        this.b = application;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        Application application = this.b;
        switch (i) {
            case 0:
                return new v13(application, 1);
            default:
                gtq0.V(application);
                IReporterYandex b = od.b(application);
                Thread.setDefaultUncaughtExceptionHandler(new m(new kd(application, b)));
                s.b(application, b);
                if (p.a == null) {
                    p.a = p.a();
                }
                return new f(application.getApplicationContext(), b);
        }
    }
}
