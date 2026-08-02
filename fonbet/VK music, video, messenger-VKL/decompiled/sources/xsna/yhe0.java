package xsna;

import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.push.common.Logger;

/* compiled from: PushHostSdkInitializer.kt */
/* loaded from: classes.dex */
public final class yhe0 implements Logger {
    public final String a;

    public yhe0(String str) {
        this.a = str;
    }

    @Override // com.vk.push.common.Logger
    public final Logger createLogger(String str) {
        return new yhe0(str);
    }

    @Override // com.vk.push.common.Logger
    public final void debug(String str, Throwable th) {
        String str2 = this.a;
        if (th == null) {
            L l = L.a;
            l.getClass();
            if (L.m(LoggerOutputTarget.NONE)) {
                return;
            }
            L.u(l, L.LogType.i, new Object[]{str2, str});
            return;
        }
        L l2 = L.a;
        l2.getClass();
        if (L.m(LoggerOutputTarget.NONE)) {
            return;
        }
        L.u(l2, L.LogType.i, new Object[]{str2, m5k.b(th, ho8.b(str, ": "))});
    }

    @Override // com.vk.push.common.Logger
    public final void error(String str, Throwable th) {
        String str2 = this.a;
        if (th == null) {
            L l = L.a;
            l.getClass();
            if (L.m(LoggerOutputTarget.NONE)) {
                return;
            }
            L.u(l, L.LogType.e, new Object[]{str2, str});
            return;
        }
        L l2 = L.a;
        l2.getClass();
        if (L.m(LoggerOutputTarget.NONE)) {
            return;
        }
        L.w(l2, L.LogType.e, th, new Object[]{str2, str}, null, null, 24);
    }

    @Override // com.vk.push.common.Logger
    public final void info(String str, Throwable th) {
        String str2 = this.a;
        if (th == null) {
            L l = L.a;
            l.getClass();
            if (L.m(LoggerOutputTarget.NONE)) {
                return;
            }
            L.u(l, L.LogType.i, new Object[]{str2, str});
            return;
        }
        L l2 = L.a;
        l2.getClass();
        if (L.m(LoggerOutputTarget.NONE)) {
            return;
        }
        L.u(l2, L.LogType.i, new Object[]{str2, m5k.b(th, ho8.b(str, ": "))});
    }

    @Override // com.vk.push.common.Logger
    public final void verbose(String str, Throwable th) {
        String str2 = this.a;
        if (th == null) {
            L l = L.a;
            l.getClass();
            if (L.m(LoggerOutputTarget.NONE)) {
                return;
            }
            L.u(l, L.LogType.i, new Object[]{str2, str});
            return;
        }
        L l2 = L.a;
        l2.getClass();
        if (L.m(LoggerOutputTarget.NONE)) {
            return;
        }
        L.u(l2, L.LogType.i, new Object[]{str2, m5k.b(th, ho8.b(str, ": "))});
    }

    @Override // com.vk.push.common.Logger
    public final void warn(String str, Throwable th) {
        String str2 = this.a;
        if (th == null) {
            L l = L.a;
            l.getClass();
            if (L.m(LoggerOutputTarget.NONE)) {
                return;
            }
            L.u(l, L.LogType.e, new Object[]{str2, str});
            return;
        }
        L l2 = L.a;
        l2.getClass();
        if (L.m(LoggerOutputTarget.NONE)) {
            return;
        }
        L.w(l2, L.LogType.e, th, new Object[]{str2, str}, null, null, 24);
    }

    @Override // com.vk.push.common.Logger
    public final Logger createLogger(Object obj) {
        return new yhe0(obj.getClass().getSimpleName());
    }

    public /* synthetic */ yhe0() {
        this("PushHostSdk");
    }
}
