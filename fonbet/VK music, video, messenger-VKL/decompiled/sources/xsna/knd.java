package xsna;

import com.vk.metrics.eventtracking.Event;
import kotlin.Pair;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class knd implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;

    public /* synthetic */ knd() {
        this.b = 2;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        switch (this.b) {
            case 0:
                s3q0 s3q0Var = s3q0.a;
                break;
            case 1:
                s3q0 s3q0Var2 = s3q0.a;
                break;
            case 2:
                Pair pair = (Pair) obj;
                Throwable th = (Throwable) pair.d();
                Boolean bool = (Boolean) pair.g();
                bool.getClass();
                String message = th == null ? "" : th.getMessage();
                com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
                el3 el3Var = Event.b;
                Event.a b = h5s.b("error_creating_player_notification");
                if (message == null) {
                    message = "";
                }
                b.c("message", message);
                Object obj2 = th;
                if (th == null) {
                    obj2 = "";
                }
                b.a(obj2, "throwable");
                b.a(bool, "was_consumed");
                b.i("FirebaseTracker");
                bVar.k(b.e());
                break;
            default:
                s3q0 s3q0Var3 = s3q0.a;
                break;
        }
    }

    public /* synthetic */ knd(izs izsVar, int i) {
        this.b = i;
    }
}
