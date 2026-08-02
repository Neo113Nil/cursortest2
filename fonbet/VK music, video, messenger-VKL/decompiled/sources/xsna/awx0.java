package xsna;

import android.annotation.SuppressLint;
import androidx.work.ExistingPeriodicWorkPolicy;
import androidx.work.ExistingWorkPolicy;
import java.util.List;
import java.util.UUID;

/* compiled from: WorkManager.kt */
@SuppressLint({"AddedAbstractMethod"})
/* loaded from: classes.dex */
public abstract class awx0 {
    public abstract xux0 a(String str, ExistingWorkPolicy existingWorkPolicy, List list);

    public abstract ws80 b();

    public abstract ws80 c(String str);

    public abstract ts80 d(List<? extends androidx.work.e> list);

    public abstract ts80 e(String str, ExistingPeriodicWorkPolicy existingPeriodicWorkPolicy, androidx.work.d dVar);

    public abstract ts80 f(String str, ExistingWorkPolicy existingWorkPolicy, List<androidx.work.c> list);

    public abstract s120 g(UUID uuid);
}
