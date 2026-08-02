package xsna;

import com.vk.log.L;

/* compiled from: Logger.kt */
/* loaded from: classes3.dex */
public final class g100 {
    public final int a;

    public g100(int i) {
        this.a = i;
    }

    public final void a(String str, String str2) {
        L.LogType logType = L.LogType.d;
        StringBuilder b = v1v.b(str, '_');
        b.append(this.a);
        b.append(", ");
        b.append(Thread.currentThread().getName());
        b.append(", ");
        b.append(str2);
        L.r(logType, "MEDIA_LOGGER", b.toString());
    }

    public final void b(String str, String str2, Throwable th) {
        L.LogType logType = L.LogType.e;
        StringBuilder b = v1v.b(str, '_');
        b.append(this.a);
        b.append(", ");
        b.append(Thread.currentThread().getName());
        b.append(", ");
        b.append(str2);
        L.s(logType, "MEDIA_LOGGER", b.toString(), th);
    }
}
