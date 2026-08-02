package xsna;

import android.app.Application;
import android.os.Bundle;
import com.vk.metrics.eventtracking.Event;
import com.vkontakte.android.VKActivity;

/* compiled from: Tracker.kt */
/* loaded from: classes.dex */
public interface ohp0 {
    void a(Throwable th);

    void c(Application application, Bundle bundle, gzs<s3q0> gzsVar);

    String getId();

    void k(Event event);

    default void g() {
    }

    default void b(ohp0 ohp0Var) {
    }

    default void d(long j) {
    }

    default void e(long j) {
    }

    default void f(Bundle bundle) {
    }

    default void h(izs<? super Event, s3q0> izsVar) {
    }

    default void i(VKActivity vKActivity) {
    }

    default void j(VKActivity vKActivity) {
    }

    default void l(String str) {
    }
}
