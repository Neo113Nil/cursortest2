package xsna;

import androidx.annotation.NonNull;
import com.google.android.gms.fitness.data.Bucket;
import com.google.android.gms.fitness.result.DataReadResult;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
/* loaded from: classes12.dex */
public final class ruk extends kbg0<DataReadResult> {
    @NonNull
    public final List<Bucket> a() {
        return getResult().d;
    }
}
