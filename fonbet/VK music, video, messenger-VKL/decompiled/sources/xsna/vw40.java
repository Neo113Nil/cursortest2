package xsna;

import com.vk.dto.music.MusicTrack;
import com.vk.music.player.PlayerTrack;
import java.util.Iterator;

/* compiled from: MusicPlayerFeature.kt */
/* loaded from: classes3.dex */
public final class vw40 implements gzs<s3q0> {
    public final /* synthetic */ rw40 b;
    public final /* synthetic */ gb50 c;

    public vw40(rw40 rw40Var, gb50 gb50Var) {
        this.b = rw40Var;
        this.c = gb50Var;
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        Object obj;
        Iterator<T> it = ((sy40) this.b.f.c).f.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (epx.f(((PlayerTrack) obj).b, this.c.b)) {
                break;
            }
        }
        PlayerTrack playerTrack = (PlayerTrack) obj;
        MusicTrack musicTrack = playerTrack != null ? playerTrack.b : null;
        if (musicTrack != null) {
            musicTrack.P = false;
        }
        return s3q0.a;
    }
}
