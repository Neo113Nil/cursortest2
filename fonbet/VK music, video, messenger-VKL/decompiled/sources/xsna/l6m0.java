package xsna;

import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;

/* compiled from: StoryMediaStoreItemSmallHolder.kt */
/* loaded from: classes15.dex */
public final class l6m0 implements b780 {
    @Override // xsna.b780
    public final void b(String str, Throwable th) {
        L l = L.a;
        l.getClass();
        if (L.m(LoggerOutputTarget.NONE)) {
            return;
        }
        L.LogType logType = L.LogType.e;
        StringBuilder a = t33.a("Failed to load image ", str, ". Error: ");
        a.append(th != null ? mnh0.A(th) : null);
        L.u(l, logType, new Object[]{a.toString()});
    }

    @Override // xsna.b780
    public final void g(String str) {
    }

    @Override // xsna.b780
    public final void onCancel(String str) {
    }

    @Override // xsna.b780
    public final void t(int i, int i2, String str) {
    }
}
