package xsna;

import com.vk.core.concurrent.ThreadExecutorStuckException;
import java.util.Collection;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class xru0 implements izs {
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        com.vk.metrics.eventtracking.b.a.a(new ThreadExecutorStuckException((Collection) obj));
        return s3q0.a;
    }
}
