package xsna;

import android.support.v4.media.session.PlaybackStateCompat;
import kotlin.Pair;

/* compiled from: WebSocketCompressionConfig.kt */
/* loaded from: classes11.dex */
public final class shx0 {
    public static final a b = new a();
    public static final Pair<Boolean, Long> c = new Pair<>(Boolean.FALSE, Long.valueOf(PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID));
    public static final shx0 d = new shx0(0);
    public final Pair<Boolean, Long> a;

    /* compiled from: WebSocketCompressionConfig.kt */
    public static final class a {
    }

    public shx0() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof shx0) && epx.f(this.a, ((shx0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "WebSocketCompressionConfig(compressionEnabledMinSize=" + this.a + ')';
    }

    public shx0(Pair<Boolean, Long> pair) {
        this.a = pair;
    }

    public /* synthetic */ shx0(int i) {
        this(c);
    }
}
