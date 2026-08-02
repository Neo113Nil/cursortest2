package xsna;

import android.location.Location;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes.dex */
public interface l0t {
    @NonNull
    Task<Location> getLastLocation();

    @NonNull
    Task<Void> removeLocationUpdates(@NonNull kxz kxzVar);

    @NonNull
    Task<Void> requestLocationUpdates(@NonNull LocationRequest locationRequest, @NonNull kxz kxzVar, @Nullable Looper looper);
}
