package xsna;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.a;
import com.google.android.gms.fitness.request.DataReadRequest;
import com.google.android.gms.internal.fitness.zzdz;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
@Deprecated
/* loaded from: classes12.dex */
public final class i8v extends com.google.android.gms.common.api.b<a.d.b> {
    public static final zzdz a = new zzdz();

    @NonNull
    public final Task<ruk> a(@NonNull DataReadRequest dataReadRequest) {
        return dv90.a(a.readData(asGoogleApiClient(), dataReadRequest), new aqz0(new ruk()));
    }
}
