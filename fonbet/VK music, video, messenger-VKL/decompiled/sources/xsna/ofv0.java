package xsna;

import com.vk.log.L;

/* compiled from: VkReefLogger.kt */
/* loaded from: classes5.dex */
public final class ofv0 implements aof0 {
    public final boolean b;

    public ofv0(boolean z) {
        this.b = z;
    }

    @Override // xsna.aof0
    public final void a(String str) {
        d(str, false);
    }

    @Override // xsna.aof0
    public final void b() {
        if (this.b) {
            L.LogType logType = L.LogType.v;
            L l = L.a;
        }
    }

    @Override // xsna.aof0
    public final void c(String str) {
        L.e(str);
    }

    @Override // xsna.aof0
    public final void d(String str, boolean z) {
        if (this.b) {
            L.LogType logType = L.LogType.v;
            if (z) {
                int length = str.length();
                if (500 <= length) {
                    length = 500;
                }
                str.substring(0, length);
            }
            L l = L.a;
        }
    }
}
