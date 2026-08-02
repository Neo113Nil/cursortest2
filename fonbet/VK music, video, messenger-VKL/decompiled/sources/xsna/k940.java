package xsna;

import android.app.Activity;
import android.os.Bundle;
import com.vk.core.widget.LifecycleHandler;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.music.fragment.impl.MusicAddTrackToPlaylistLauncherImpl;
import kotlin.Pair;

/* compiled from: MusicAddTrackToPlaylistLauncherImpl.kt */
/* loaded from: classes3.dex */
public final class k940 extends ja0 {
    public final /* synthetic */ MusicAddTrackToPlaylistLauncherImpl b;

    public k940(MusicAddTrackToPlaylistLauncherImpl musicAddTrackToPlaylistLauncherImpl) {
        this.b = musicAddTrackToPlaylistLauncherImpl;
    }

    @Override // xsna.ja0, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.b.c(activity);
    }

    @Override // xsna.ja0, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        MusicAddTrackToPlaylistLauncherImpl musicAddTrackToPlaylistLauncherImpl = this.b;
        Pair pair = (Pair) musicAddTrackToPlaylistLauncherImpl.a.remove(activity);
        if (pair != null) {
            LifecycleHandler lifecycleHandler = (LifecycleHandler) pair.d();
            b5z b5zVar = (b5z) pair.g();
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l, L.LogType.d, new Object[]{activity.getClass().getSimpleName()});
            }
            lifecycleHandler.e(b5zVar);
            LifecycleHandler.h(activity, lifecycleHandler);
        }
        musicAddTrackToPlaylistLauncherImpl.e.remove(activity);
    }
}
