package xsna;

import android.os.Looper;
import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-basement@@18.10.0 */
/* loaded from: classes12.dex */
public final class ltu implements Executor {
    public final com.google.android.gms.internal.common.zzg b;

    public ltu(@NonNull Looper looper) {
        this.b = new com.google.android.gms.internal.common.zzg(looper);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(@NonNull Runnable runnable) {
        this.b.post(runnable);
    }
}
