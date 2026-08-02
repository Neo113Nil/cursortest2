package xsna;

import android.app.Application;
import android.view.View;
import androidx.activity.ComponentActivity;
import com.vk.dto.specials.SpecialEvent;
import com.vkontakte.android.data.b;
import java.lang.ref.WeakReference;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class o8i implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o8i(Application application, y56 y56Var) {
        this.b = 1;
        this.c = y56Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                ((ComponentActivity) this.c).invalidateMenu();
                break;
            case 1:
                y56 y56Var = (y56) this.c;
                o5m a = q5m.a();
                y56Var.invoke();
                a.getClass();
                break;
            case 2:
                ((com.google.firebase.installations.a) this.c).a();
                break;
            default:
                pjk0 pjk0Var = (pjk0) this.c;
                pjk0Var.f = true;
                a2e0 a2e0Var = pjk0Var.d;
                if (a2e0Var != null) {
                    a2e0Var.a();
                }
                pjk0Var.d = null;
                SpecialEvent specialEvent = pjk0Var.h;
                if (specialEvent != null) {
                    b.d dVar = new b.d("media_event_run");
                    dVar.b(specialEvent.getId(), "event_id");
                    dVar.e();
                    mjk0 mjk0Var = pjk0Var.j;
                    WeakReference<View> weakReference = pjk0Var.k;
                    View view = weakReference != null ? weakReference.get() : null;
                    if (mjk0Var != null && view != null) {
                        mjk0Var.e(view);
                    }
                    pjk0Var.n.run();
                    SpecialEvent.Animation d = specialEvent.d();
                    if (d != null) {
                        u1u0.f(d.e(), pjk0Var.o);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ o8i(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }
}
