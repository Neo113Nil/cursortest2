package xsna;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.TimeUnit;
import xsna.qdg0;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes.dex */
public abstract class cv90<R extends qdg0> {

    /* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
    /* loaded from: classes12.dex */
    public interface a {
        void a(@NonNull Status status);
    }

    public void addStatusListener(@NonNull a aVar) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    public abstract R await();

    @NonNull
    public abstract R await(long j, @NonNull TimeUnit timeUnit);

    public abstract void cancel();

    public abstract boolean isCanceled();

    public abstract void setResultCallback(@NonNull tdg0<? super R> tdg0Var);

    public abstract void setResultCallback(@NonNull tdg0<? super R> tdg0Var, long j, @NonNull TimeUnit timeUnit);

    @NonNull
    public <S extends qdg0> jlp0<S> then(@NonNull wdg0<? super R, ? extends S> wdg0Var) {
        throw new UnsupportedOperationException();
    }
}
