package xsna;

import android.app.Activity;
import android.content.IntentSender;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes13.dex */
public interface ra3 {
    @NonNull
    Task<qa3> a();

    @Deprecated
    boolean b(@NonNull qa3 qa3Var, int i, @NonNull Activity activity) throws IntentSender.SendIntentException;

    void c(@NonNull a3u a3uVar);

    void d(@NonNull a3u a3uVar);

    @NonNull
    Task<Void> e();
}
