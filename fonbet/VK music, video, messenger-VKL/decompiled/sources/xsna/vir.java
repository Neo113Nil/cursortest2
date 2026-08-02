package xsna;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.Task;
import java.io.IOException;

/* compiled from: com.google.firebase:firebase-iid-interop@@17.1.0 */
/* loaded from: classes.dex */
public interface vir {
    void a() throws IOException;

    void b();

    @NonNull
    Task<String> c();

    @Nullable
    String getToken();
}
