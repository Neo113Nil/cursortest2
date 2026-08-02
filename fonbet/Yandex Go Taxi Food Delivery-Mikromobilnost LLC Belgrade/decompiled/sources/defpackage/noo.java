package defpackage;

import androidx.media3.common.PlaybackException;
import com.ybsdk.feature.videoplayer.impl.a;
import com.ybsdk.widgets.common.communication.CommunicationFullScreenVideoView;

/* loaded from: classes4.dex */
public final class noo implements xxc0 {
    public final /* synthetic */ a a;

    public noo(a aVar) {
        this.a = aVar;
    }

    @Override // defpackage.xxc0
    public final void onPlayerError(PlaybackException playbackException) {
        asc ascVar;
        orc orcVar = this.a.d;
        if (orcVar != null) {
            orcVar.a = true;
            ascVar = orcVar.b.eventsListener;
            if (ascVar != null) {
                ascVar.p(new wrc(playbackException));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        r3 = r0.eventsListener;
     */
    @Override // defpackage.xxc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onRenderedFirstFrame() {
        asc ascVar;
        i5z0.a.a("Exo video player rendered first frame", new Object[0]);
        orc orcVar = this.a.d;
        if (orcVar != null) {
            CommunicationFullScreenVideoView communicationFullScreenVideoView = orcVar.b;
            if (orcVar.a || ascVar == null) {
                return;
            }
            ascVar.p(xrc.a);
        }
    }
}
