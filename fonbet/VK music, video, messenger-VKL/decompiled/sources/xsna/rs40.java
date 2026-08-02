package xsna;

import com.vk.reefton.literx.schedulers.ExecutorScheduler;
import java.util.concurrent.Executor;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class rs40 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ gzs c;

    public /* synthetic */ rs40(int i, gzs gzsVar) {
        this.b = i;
        this.c = gzsVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                this.c.invoke();
                return s3q0.a;
            default:
                return new ExecutorScheduler((Executor) this.c.invoke());
        }
    }
}
