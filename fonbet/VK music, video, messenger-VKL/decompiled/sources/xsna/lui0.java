package xsna;

import android.content.Context;
import android.os.IBinder;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public abstract class lui0 {
    private final Context zza;
    private final String zzb;
    private final p301 zzc = new p301(this);

    public lui0(@NonNull Context context, @NonNull String str) {
        exc0.i(context);
        this.zza = context.getApplicationContext();
        exc0.f(str);
        this.zzb = str;
    }

    @Nullable
    public abstract ssi0 createSession(@Nullable String str);

    @NonNull
    public final String getCategory() {
        return this.zzb;
    }

    @NonNull
    public final Context getContext() {
        return this.zza;
    }

    public abstract boolean isSessionRecoverable();

    @NonNull
    public final IBinder zza() {
        return this.zzc;
    }
}
