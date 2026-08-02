package xsna;

import com.vk.media.playback.di.MediaPlaybackComponent;
import kotlin.LazyThreadSafetyMode;

/* compiled from: ClipsPublishViewerOverlayDiDeps.kt */
/* loaded from: classes17.dex */
public final class sze {
    public final bpn0 a;
    public final bpn0 b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public sze(l7m l7mVar) {
        this.a = new bpn0(new mze(l7mVar, 0));
        this.b = new bpn0(new nze(l7mVar, 0));
        oze ozeVar = new oze(l7mVar, 0);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.c = msy.a(lazyThreadSafetyMode, ozeVar);
        int i = 0;
        this.d = msy.a(lazyThreadSafetyMode, new pze(l7mVar, i));
        this.e = msy.a(lazyThreadSafetyMode, new qze(l7mVar, i));
        this.f = msy.a(lazyThreadSafetyMode, new rze(l7mVar, i));
    }

    public final MediaPlaybackComponent a() {
        return (MediaPlaybackComponent) this.b.getValue();
    }
}
