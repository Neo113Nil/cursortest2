package xsna;

import android.content.Context;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import xsna.i940;

/* compiled from: MusicAddTrackToPlaylistLauncherImpl.kt */
/* loaded from: classes3.dex */
public final class l940 implements i940.c {
    @Override // xsna.i940.c
    public final void a(Throwable th) {
        VKApiExecutionException vKApiExecutionException = th instanceof VKApiExecutionException ? (VKApiExecutionException) th : null;
        if (vKApiExecutionException != null) {
            Context context = e43.a;
            rte0.z(context != null ? context : null, vKApiExecutionException);
        }
    }

    @Override // xsna.i940.c
    public final void b() {
    }
}
