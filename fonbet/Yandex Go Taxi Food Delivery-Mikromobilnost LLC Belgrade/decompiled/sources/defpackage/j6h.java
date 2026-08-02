package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public final /* synthetic */ class j6h implements Executor {
    public final /* synthetic */ Handler a;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.post(runnable);
    }
}
