package xsna;

import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.concurrent.UiExecutor;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class ydj implements io.reactivex.rxjava3.functions.l, b9i {
    public final /* synthetic */ int b;

    public /* synthetic */ ydj(int i) {
        this.b = i;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        return ((jon0) obj).a();
    }

    @Override // xsna.b9i
    public Object c(lcg0 lcg0Var) {
        kkr components$lambda$1;
        switch (this.b) {
            case 1:
                cqy<ScheduledExecutorService> cqyVar = ExecutorsRegistrar.a;
                return UiExecutor.INSTANCE;
            default:
                components$lambda$1 = FirebaseSessionsRegistrar.getComponents$lambda$1(lcg0Var);
                return components$lambda$1;
        }
    }
}
