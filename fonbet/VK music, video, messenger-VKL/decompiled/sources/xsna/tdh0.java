package xsna;

import android.util.Size;
import java.util.List;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.stat.screenshare.ScreenshareFirstFrameStat;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class tdh0 implements Runnable {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ tdh0(ScreenshareFirstFrameStat screenshareFirstFrameStat, CallParticipant.ParticipantId participantId, Size size, long j) {
        this.d = screenshareFirstFrameStat;
        this.e = participantId;
        this.f = size;
        this.c = j;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                ScreenshareFirstFrameStat.a((ScreenshareFirstFrameStat) this.d, (CallParticipant.ParticipantId) this.e, (Size) this.f, this.c);
                break;
            default:
                nwl0 nwl0Var = (nwl0) this.d;
                one.video.player.tracks.c cVar = (one.video.player.tracks.c) this.e;
                List<? extends one.video.player.tracks.c> list = (List) this.f;
                knf0 knf0Var = (knf0) nwl0Var.c.getValue();
                if (knf0Var != null) {
                    knf0Var.a(cVar, this.c, list);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ tdh0(nwl0 nwl0Var, one.video.player.tracks.c cVar, long j, List list) {
        this.d = nwl0Var;
        this.e = cVar;
        this.c = j;
        this.f = list;
    }
}
