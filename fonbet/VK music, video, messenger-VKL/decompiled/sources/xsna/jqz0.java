package xsna;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes.dex */
public final class jqz0 implements OnCompleteListener {
    public final /* synthetic */ TaskCompletionSource b;
    public final /* synthetic */ qkz0 c;

    public jqz0(qkz0 qkz0Var, TaskCompletionSource taskCompletionSource) {
        this.b = taskCompletionSource;
        Objects.requireNonNull(qkz0Var);
        this.c = qkz0Var;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(@NonNull Task task) {
        this.c.b.remove(this.b);
    }
}
