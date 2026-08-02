package xsna;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import java.time.Duration;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import one.video.calls.sdk_private.bE;
import one.video.calls.sdk_private.bF;

/* compiled from: Http3ConnectionFactory.java */
/* loaded from: classes8.dex */
public final class ury0 {
    public final one.video.calls.sdk_private.z a;
    public final ConcurrentHashMap b = new ConcurrentHashMap();

    /* compiled from: Http3ConnectionFactory.java */
    public static class a {
        public String a;
        public String b;
        public int c;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.c == aVar.c && Objects.equals(this.a, aVar.a)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Objects.hash(this.a, Integer.valueOf(this.c));
        }
    }

    public ury0(one.video.calls.sdk_private.z zVar) {
        this.a = zVar;
    }

    public final one.video.calls.sdk_private.a0 a(a aVar) {
        try {
            Duration duration = (Duration) Optional.ofNullable(this.a.b).orElse(bry0.a);
            String str = aVar.a;
            String str2 = aVar.b;
            int i = aVar.c;
            one.video.calls.sdk_private.z zVar = this.a;
            one.video.calls.sdk_private.a0 a0Var = new one.video.calls.sdk_private.a0(str, str2, i, duration, zVar, zVar.d, zVar.g);
            if (!Optional.ofNullable(null).isPresent()) {
                return a0Var;
            }
            long longValue = ((Long) Optional.ofNullable(null).get()).longValue();
            bE bEVar = a0Var.b;
            if (longValue < PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) {
                bEVar.getClass();
                throw new IllegalArgumentException("Receiver buffer size must be at least 1024");
            }
            if (longValue > bEVar.J.d) {
                throw new IllegalArgumentException("Bidirectional stream buffer size cannot be larger than connection buffer size");
            }
            if (bEVar.p == bF.f.a) {
                bEVar.J.f = longValue;
                return a0Var;
            }
            if (bEVar.p != bF.f.c) {
                throw new IllegalStateException("Cannot change setting while connection is being established or closed");
            }
            mky0 mky0Var = bEVar.E;
            jdy0 jdy0Var = mky0Var.g;
            mky0Var.g = new ojy0(jdy0Var.a(), jdy0Var.b(), jdy0Var.d(), jdy0Var.c(), jdy0Var.e(), jdy0Var.f(), jdy0Var.g(), longValue);
            return a0Var;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
