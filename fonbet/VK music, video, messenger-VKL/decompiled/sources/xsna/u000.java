package xsna;

import com.vk.log.L;

/* compiled from: LogTarget.kt */
/* loaded from: classes.dex */
public abstract class u000 {
    public final void a(L.LogType logType, String str, String str2, Throwable th, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(str2 == null ? "" : str2);
        String str3 = str2 != null ? "\n" : null;
        if (str3 == null) {
            str3 = "";
        }
        sb.append(str3);
        String A = th != null ? mnh0.A(th) : null;
        sb.append(A != null ? A : "");
        b(logType, str, sb.toString(), z);
    }

    public abstract void b(L.LogType logType, String str, String str2, boolean z);

    public void c() {
    }
}
