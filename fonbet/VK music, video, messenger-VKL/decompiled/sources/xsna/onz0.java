package xsna;

import android.os.DeadObjectException;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes12.dex */
public abstract class onz0 extends tmz0 {
    public final TaskCompletionSource b;

    public onz0(int i, TaskCompletionSource taskCompletionSource) {
        super(i);
        this.b = taskCompletionSource;
    }

    @Override // xsna.qoz0
    public final void a(@NonNull Status status) {
        this.b.trySetException(new ApiException(status));
    }

    @Override // xsna.qoz0
    public final void b(@NonNull Exception exc) {
        this.b.trySetException(exc);
    }

    @Override // xsna.qoz0
    public final void d(hmz0 hmz0Var) throws DeadObjectException {
        try {
            i(hmz0Var);
        } catch (DeadObjectException e) {
            a(qoz0.e(e));
            throw e;
        } catch (RemoteException e2) {
            a(qoz0.e(e2));
        } catch (RuntimeException e3) {
            this.b.trySetException(e3);
        }
    }

    public abstract void i(hmz0 hmz0Var) throws RemoteException;
}
