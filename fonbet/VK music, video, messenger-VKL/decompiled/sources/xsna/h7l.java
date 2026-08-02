package xsna;

import androidx.media3.common.VideoFrameProcessingException;
import java.util.Map;
import ru.ok.android.webrtc.stat.screenshare.ScreenshareFirstFrameStat;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class h7l implements Runnable {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ h7l(ScreenshareFirstFrameStat screenshareFirstFrameStat, long j, Map map) {
        this.d = screenshareFirstFrameStat;
        this.c = j;
        this.e = map;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Map] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                ((i7l) this.d).g.a(VideoFrameProcessingException.a(this.c, (Exception) this.e));
                break;
            default:
                ScreenshareFirstFrameStat.a((ScreenshareFirstFrameStat) this.d, this.c, (Map) this.e);
                break;
        }
    }

    public /* synthetic */ h7l(i7l i7lVar, Exception exc, long j) {
        this.d = i7lVar;
        this.e = exc;
        this.c = j;
    }
}
