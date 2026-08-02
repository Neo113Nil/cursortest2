package xsna;

import androidx.annotation.NonNull;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import ru.ok.media.utils.DebugUtils;
import ru.ok.media.utils.StreamerDebugUtils;

/* compiled from: Configs.java */
/* loaded from: classes3.dex */
public final class byi {
    public int a;
    public int b;
    public int c;
    public int d;

    @NonNull
    public final String toString() {
        String channelsString = DebugUtils.channelsString(this.b, true);
        String formatNumber = StreamerDebugUtils.formatNumber(this.d, "bps");
        StringBuilder sb = new StringBuilder();
        jax0.a(this.c, DomExceptionUtils.SEPARATOR, channelsString, DomExceptionUtils.SEPARATOR, sb);
        sb.append(formatNumber);
        return sb.toString();
    }
}
