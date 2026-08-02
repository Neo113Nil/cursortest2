package defpackage;

import com.google.android.gms.internal.play_billing.zzbg;
import java.util.logging.Logger;

/* loaded from: classes11.dex */
public final class c7y {
    public final String a;
    public volatile Logger b;
    public final Object c;

    public c7y() {
        this.c = new Object();
        this.a = w4r0.class.getName();
    }

    public Logger a() {
        Logger logger = this.b;
        if (logger != null) {
            return logger;
        }
        synchronized (this.c) {
            try {
                Logger logger2 = this.b;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.a);
                this.b = logger3;
                return logger3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Logger b() {
        Logger logger = this.b;
        if (logger != null) {
            return logger;
        }
        synchronized (((zzbg) this.c)) {
            try {
                Logger logger2 = this.b;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.a);
                this.b = logger3;
                return logger3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public c7y(Class cls) {
        this.c = new zzbg();
        this.a = cls.getName();
    }
}
