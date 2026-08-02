package xsna;

import com.my.tracker.ads.AdEvent;
import one.video.player.OneVideoPlayer;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class xft0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ xft0(long j, Object obj, Object obj2, int i) {
        this.b = i;
        this.d = obj;
        this.e = obj2;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                ((OneVideoPlayer) this.d).C((sht0) this.e, this.c);
                break;
            default:
                ((com.my.tracker.obfuscated.e0) this.d).a((AdEvent) this.e, this.c);
                break;
        }
    }
}
