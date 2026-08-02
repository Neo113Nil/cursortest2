package defpackage;

import io.flutter.plugins.videoplayer.PlatformPlaybackState;
import java.util.Collections;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class mxc0 extends mwc0 {
    public final PlatformPlaybackState a;

    public mxc0(PlatformPlaybackState platformPlaybackState) {
        this.a = platformPlaybackState;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof mxc0)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return zkb1.b(Collections.singletonList(this.a), Collections.singletonList(((mxc0) obj).a));
    }

    public final int hashCode() {
        return Collections.singletonList(this.a).hashCode();
    }

    public final String toString() {
        return "PlaybackStateChangeEvent(state=" + this.a + Extension.C_BRAKE;
    }
}
