package xsna;

import android.app.Application;
import android.os.Bundle;
import com.vk.metrics.eventtracking.Event;
import com.vkontakte.android.VKActivity;
import com.vkontakte.android.data.b;
import java.util.Iterator;
import java.util.Map;
import xsna.zk3;

/* compiled from: StatlogTracker.kt */
/* loaded from: classes.dex */
public final class uyk0 implements ohp0 {
    public static final uyk0 a = new uyk0();

    @Override // xsna.ohp0
    public final void c(Application application, Bundle bundle, gzs<s3q0> gzsVar) {
        gzsVar.invoke();
    }

    @Override // xsna.ohp0
    public final String getId() {
        return "StatlogTracker";
    }

    @Override // xsna.ohp0
    public final void k(Event event) {
        Event.a aVar = event.a;
        b.d dVar = new b.d(aVar.c);
        Iterator it = ((zk3.a) aVar.d.entrySet()).iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            dVar.b(entry.getValue(), (String) entry.getKey());
        }
        if (aVar.g) {
            dVar.h();
        } else {
            dVar.e();
        }
    }

    @Override // xsna.ohp0
    public final void g() {
    }

    @Override // xsna.ohp0
    public final void a(Throwable th) {
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
