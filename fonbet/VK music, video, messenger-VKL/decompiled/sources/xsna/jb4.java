package xsna;

import com.vk.core.apps.BuildInfo;
import com.vk.log.L;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: AudioAdLoader.kt */
/* loaded from: classes3.dex */
public final class jb4 {
    public static boolean d;
    public final mb4 a;
    public final od0 b;
    public final b25 c;

    public jb4(mb4 mb4Var, od0 od0Var, b25 b25Var) {
        this.a = mb4Var;
        this.b = od0Var;
        this.c = b25Var;
        boolean z = BuildInfo.h() || L.q();
        AtomicBoolean atomicBoolean = xr50.a;
        gu8.a = z;
        if (z) {
            gu8.c(null, "Debug mode enabled");
        }
    }
}
