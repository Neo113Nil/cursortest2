package xsna;

import androidx.annotation.NonNull;
import com.vk.media.recorder.impl.Streamer;
import java.util.Locale;
import ru.ok.media.utils.StreamerDebugUtils;

/* compiled from: Configs.java */
/* loaded from: classes3.dex */
public final class cyi {
    public int a;
    public int b;
    public Streamer.c c;

    @NonNull
    public final String toString() {
        Streamer.c cVar = this.c;
        return String.format(Locale.US, "%s@%.1f %s", cVar == null ? "?" : cVar.toString(), Float.valueOf(30.0f), StreamerDebugUtils.formatNumber(this.a, "bps"));
    }
}
