package xsna;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public abstract class twp0 {

    @Nullable
    private lvf0 zza;

    @Nullable
    public lvf0 getRemoteMediaClient() {
        return this.zza;
    }

    public void onSessionConnected(@NonNull g0a g0aVar) {
        this.zza = g0aVar != null ? g0aVar.k() : null;
    }

    public void onSessionEnded() {
        this.zza = null;
    }

    public void onMediaStatusUpdated() {
    }

    public void onSendingRemoteMediaRequest() {
    }
}
