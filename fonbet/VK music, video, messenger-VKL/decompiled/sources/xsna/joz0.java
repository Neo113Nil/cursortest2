package xsna;

import android.os.DeadObjectException;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes.dex */
public final class joz0 extends tmz0 {
    public final f5o0 b;
    public final TaskCompletionSource c;
    public final jzk0 d;

    public joz0(int i, f5o0 f5o0Var, TaskCompletionSource taskCompletionSource, jzk0 jzk0Var) {
        super(i);
        this.c = taskCompletionSource;
        this.b = f5o0Var;
        this.d = jzk0Var;
        if (i == 2 && f5o0Var.b) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // xsna.qoz0
    public final void a(@NonNull Status status) {
        ((dy2) this.d).getClass();
        this.c.trySetException(ey2.g(status));
    }

    @Override // xsna.qoz0
    public final void b(@NonNull Exception exc) {
        this.c.trySetException(exc);
    }

    @Override // xsna.qoz0
    public final void c(@NonNull qkz0 qkz0Var, boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        Map map = qkz0Var.b;
        TaskCompletionSource taskCompletionSource = this.c;
        map.put(taskCompletionSource, valueOf);
        taskCompletionSource.getTask().addOnCompleteListener(new jqz0(qkz0Var, taskCompletionSource));
    }

    @Override // xsna.qoz0
    public final void d(hmz0 hmz0Var) throws DeadObjectException {
        TaskCompletionSource taskCompletionSource = this.c;
        try {
            this.b.b(hmz0Var.b, taskCompletionSource);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            a(qoz0.e(e2));
        } catch (RuntimeException e3) {
            taskCompletionSource.trySetException(e3);
        }
    }

    @Override // xsna.tmz0
    @Nullable
    public final Feature[] f(hmz0 hmz0Var) {
        return this.b.a;
    }

    @Override // xsna.tmz0
    public final boolean g(hmz0 hmz0Var) {
        return this.b.b;
    }

    @Override // xsna.tmz0
    public final int h(hmz0 hmz0Var) {
        return this.b.c;
    }
}
