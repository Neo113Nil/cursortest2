package xsna;

import android.media.metrics.LogSessionId;
import android.os.Build;
import androidx.annotation.Nullable;

/* compiled from: PlayerId.java */
/* loaded from: classes12.dex */
public final class x1b0 {
    public static final x1b0 c = new x1b0("");
    public static final x1b0 d = new x1b0("preload");
    public final String a;

    @Nullable
    public final a b;

    /* compiled from: PlayerId.java */
    public static final class a {
        public LogSessionId a;
    }

    public x1b0(String str) {
        a aVar;
        LogSessionId logSessionId;
        this.a = str;
        if (Build.VERSION.SDK_INT >= 31) {
            aVar = new a();
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            aVar.a = logSessionId;
        } else {
            aVar = null;
        }
        this.b = aVar;
    }

    public final synchronized LogSessionId a() {
        a aVar;
        aVar = this.b;
        aVar.getClass();
        return aVar.a;
    }
}
