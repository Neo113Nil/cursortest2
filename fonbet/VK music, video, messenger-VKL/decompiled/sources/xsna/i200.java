package xsna;

import android.app.Application;
import android.os.Bundle;
import com.vk.log.L;
import com.vk.metrics.eventtracking.Event;
import com.vkontakte.android.VKActivity;

/* compiled from: LoggingTracker.kt */
/* loaded from: classes.dex */
public final class i200 implements ohp0 {
    public static final i200 a = new i200();

    @Override // xsna.ohp0
    public final void a(Throwable th) {
        L.LogType logType = L.LogType.e;
        L.a.getClass();
        L.x(logType, "LoggingTracker", null, th);
    }

    @Override // xsna.ohp0
    public final void c(Application application, Bundle bundle, gzs<s3q0> gzsVar) {
        gzsVar.invoke();
    }

    @Override // xsna.ohp0
    public final String getId() {
        return "LoggingTracker";
    }

    @Override // xsna.ohp0
    public final void k(Event event) {
        event.toString();
    }

    @Override // xsna.ohp0
    public final void g() {
    }

    @Override // xsna.ohp0
    public final void b(ohp0 ohp0Var) {
    }

    @Override // xsna.ohp0
    public final void d(long j) {
    }

    @Override // xsna.ohp0
    public final void e(long j) {
    }

    @Override // xsna.ohp0
    public final void f(Bundle bundle) {
    }

    @Override // xsna.ohp0
    public final void h(izs<? super Event, s3q0> izsVar) {
    }

    @Override // xsna.ohp0
    public final void i(VKActivity vKActivity) {
    }

    @Override // xsna.ohp0
    public final void j(VKActivity vKActivity) {
    }

    @Override // xsna.ohp0
    public final void l(String str) {
    }
}
