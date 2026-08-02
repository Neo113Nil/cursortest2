package xsna;

import android.content.Context;
import androidx.annotation.Nullable;
import java.util.ArrayDeque;

/* compiled from: ServiceStarter.java */
/* loaded from: classes.dex */
public final class kri0 {
    public static kri0 e;

    @Nullable
    public String a = null;
    public Boolean b = null;
    public Boolean c = null;
    public final ArrayDeque d = new ArrayDeque();

    public static synchronized kri0 a() {
        kri0 kri0Var;
        synchronized (kri0.class) {
            try {
                if (e == null) {
                    e = new kri0();
                }
                kri0Var = e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return kri0Var;
    }

    public final boolean b(Context context) {
        if (this.c == null) {
            this.c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        this.b.booleanValue();
        return this.c.booleanValue();
    }

    public final boolean c(Context context) {
        if (this.b == null) {
            this.b = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        this.b.booleanValue();
        return this.b.booleanValue();
    }
}
