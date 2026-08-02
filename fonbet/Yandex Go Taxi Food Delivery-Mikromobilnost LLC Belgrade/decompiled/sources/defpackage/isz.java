package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;

/* loaded from: classes6.dex */
public final class isz implements xtz {
    public final /* synthetic */ int a;
    public final /* synthetic */ AtomicBoolean b;
    public final /* synthetic */ j18 c;

    public /* synthetic */ isz(AtomicBoolean atomicBoolean, j18 j18Var, int i) {
        this.a = i;
        this.b = atomicBoolean;
        this.c = j18Var;
    }

    @Override // defpackage.xtz
    public final void onResult(Object obj) {
        int i = this.a;
        j18 j18Var = this.c;
        AtomicBoolean atomicBoolean = this.b;
        switch (i) {
            case 0:
                Throwable th = (Throwable) obj;
                if (atomicBoolean.compareAndSet(false, true)) {
                    j18Var.resumeWith(new Result.Failure(th));
                    break;
                }
                break;
            default:
                if (atomicBoolean.compareAndSet(false, true)) {
                    j18Var.resumeWith(obj);
                    break;
                }
                break;
        }
    }
}
