package xsna;

import android.util.Log;
import com.vk.log.L;

/* compiled from: ConsoleTarget.kt */
/* loaded from: classes3.dex */
public final class e5j extends u000 {
    @Override // xsna.u000
    public final void b(L.LogType logType, String str, String str2, boolean z) {
        int h = logType.h();
        if (str2 == null) {
            str2 = "EMPTY_MSG";
        }
        Log.println(h, str, str2);
    }
}
