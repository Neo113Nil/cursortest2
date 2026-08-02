package xsna;

import com.vk.core.concurrent.ThreadExecutorStuckException;
import com.vk.log.L;
import java.util.Collection;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class xdj implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ xdj(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                break;
            case 1:
                com.vk.metrics.eventtracking.b.a.a(new ThreadExecutorStuckException((Collection) obj));
                break;
            default:
                L.i((Throwable) obj);
                break;
        }
        return s3q0.a;
    }
}
