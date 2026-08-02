package xsna;

import com.vk.dto.music.MusicTrack;
import com.vk.music.bottomsheets.MusicBottomSheetLaunchPoint;

/* compiled from: DefaultMusicTrackActionsFactoryProvider.kt */
/* loaded from: classes3.dex */
public final class ajl implements ea50 {
    public final MusicBottomSheetLaunchPoint a;
    public final u2b0 b;
    public final fy2 c;

    public ajl(MusicBottomSheetLaunchPoint musicBottomSheetLaunchPoint, u2b0 u2b0Var, fy2 fy2Var) {
        this.a = musicBottomSheetLaunchPoint;
        this.b = u2b0Var;
        this.c = fy2Var;
    }

    @Override // xsna.ea50
    public final gc40 a(MusicTrack musicTrack, ia50 ia50Var) {
        MusicBottomSheetLaunchPoint musicBottomSheetLaunchPoint = this.a;
        if (musicBottomSheetLaunchPoint instanceof MusicBottomSheetLaunchPoint.Stories) {
            return new gnv0(musicTrack, ia50Var);
        }
        boolean z = musicBottomSheetLaunchPoint instanceof MusicBottomSheetLaunchPoint.Delete;
        if ((z && !musicTrack.Vb()) || (musicTrack.B() && musicTrack.S4())) {
            return new t060(musicTrack, null);
        }
        if (musicTrack.Vb()) {
            return z ? new itz0(musicTrack) : new vsy(musicTrack, this.c);
        }
        if (musicTrack.Qb()) {
            return new rsu0(musicTrack, ia50Var, this.b);
        }
        throw new IllegalStateException("No actions factory for current state!");
    }
}
