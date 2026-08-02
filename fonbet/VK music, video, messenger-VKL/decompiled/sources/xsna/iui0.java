package xsna;

import androidx.annotation.NonNull;
import xsna.ssi0;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public interface iui0<T extends ssi0> {
    void onSessionEnded(@NonNull T t, int i);

    void onSessionEnding(@NonNull T t);

    void onSessionResumeFailed(@NonNull T t, int i);

    void onSessionResumed(@NonNull T t, boolean z);

    void onSessionResuming(@NonNull T t, @NonNull String str);

    void onSessionStartFailed(@NonNull T t, int i);

    void onSessionStarted(@NonNull T t, @NonNull String str);

    void onSessionStarting(@NonNull T t);

    void onSessionSuspended(@NonNull T t, int i);
}
