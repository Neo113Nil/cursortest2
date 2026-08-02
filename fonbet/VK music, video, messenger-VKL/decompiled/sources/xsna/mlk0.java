package xsna;

import android.app.Activity;
import android.content.IntentSender;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import java.util.Set;

/* compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* loaded from: classes13.dex */
public interface mlk0 {
    Task<Integer> a(@NonNull nlk0 nlk0Var);

    @NonNull
    Task<Void> b(int i);

    boolean c(@NonNull olk0 olk0Var, @NonNull Activity activity, int i) throws IntentSender.SendIntentException;

    void d(@NonNull plk0 plk0Var);

    @NonNull
    Set<String> e();
}
