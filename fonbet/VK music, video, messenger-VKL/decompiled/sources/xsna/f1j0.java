package xsna;

import androidx.annotation.NonNull;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes12.dex */
public interface f1j0 {
    @NonNull
    Task<xyz> checkLocationSettings(@NonNull LocationSettingsRequest locationSettingsRequest);
}
