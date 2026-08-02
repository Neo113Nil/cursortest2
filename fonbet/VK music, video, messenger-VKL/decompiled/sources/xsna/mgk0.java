package xsna;

import com.vk.libvideo.autoplay.VideoAutoPlay;
import xsna.px8;
import xsna.sht0;

/* compiled from: SourceGetterForPositionImpl.kt */
/* loaded from: classes17.dex */
public final class mgk0<T extends sht0> implements lgk0<T> {
    public final ai5 a;

    public mgk0(ai5 ai5Var) {
        this.a = ai5Var;
    }

    @Override // xsna.lgk0
    public final px8<T> a(int i) {
        m7q m7qVar;
        if (i >= 0) {
            ai5 ai5Var = this.a;
            if (i <= ai5Var.getItemCount()) {
                y9t0 Eh = ai5Var.Eh(i);
                if (Eh == null) {
                    return px8.a.a;
                }
                yg5 yg5Var = Eh.a;
                VideoAutoPlay videoAutoPlay = yg5Var instanceof VideoAutoPlay ? (VideoAutoPlay) yg5Var : null;
                sht0 e = (videoAutoPlay == null || (m7qVar = videoAutoPlay.k0) == null) ? null : jgz.e(m7qVar);
                sht0 sht0Var = e != null ? e : null;
                return sht0Var != null ? new px8.c(sht0Var) : px8.a.a;
            }
        }
        return px8.b.a;
    }
}
