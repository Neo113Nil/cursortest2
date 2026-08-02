package xsna;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.cast.framework.CastOptions;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public interface cu80 {
    @Nullable
    List<lui0> getAdditionalSessionProviders(@NonNull Context context);

    @NonNull
    CastOptions getCastOptions(@NonNull Context context);
}
