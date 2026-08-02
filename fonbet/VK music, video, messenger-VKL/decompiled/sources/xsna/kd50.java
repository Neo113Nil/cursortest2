package xsna;

import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.dto.music.MusicTrack;
import com.vk.music.common.MusicPlaybackLaunchContext;

/* compiled from: MusicTrackModel.kt */
/* loaded from: classes3.dex */
public interface kd50 extends i80 {

    /* compiled from: MusicTrackModel.kt */
    public interface a {
        void a(MusicTrack musicTrack, VKApiExecutionException vKApiExecutionException, boolean z);

        void b(MusicTrack musicTrack);
    }

    void N(a aVar);

    void U(zoi0 zoi0Var);

    boolean i(MusicTrack musicTrack);

    void o1(MusicTrack musicTrack, MusicPlaybackLaunchContext musicPlaybackLaunchContext);
}
