package defpackage;

import android.os.Looper;
import com.google.android.gms.internal.common.zzg;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes10.dex */
public final class iju implements Executor {
    public static volatile iju c;
    public final /* synthetic */ int a;
    public final Object b;

    public iju() {
        this.a = 0;
        this.b = Executors.newSingleThreadExecutor(new i30(2));
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                ((ExecutorService) this.b).execute(runnable);
                break;
            default:
                ((zzg) this.b).post(runnable);
                break;
        }
    }

    public iju(Looper looper) {
        this.a = 1;
        this.b = new zzg(looper);
    }
}
