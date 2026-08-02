package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.HashMap;
import xsna.fpf0;
import xsna.s3q0;

/* renamed from: io.appmetrica.analytics.impl.la, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4984la {
    public static volatile C4984la c;
    public final Context a;
    public final HashMap b = new HashMap();

    public C4984la(Context context) {
        this.a = context;
    }

    public static final C4984la a(Context context) {
        if (c == null) {
            synchronized (fpf0.a(C4984la.class)) {
                try {
                    if (c == null) {
                        c = new C4984la(context);
                    }
                    s3q0 s3q0Var = s3q0.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        C4984la c4984la = c;
        if (c4984la == null) {
            return null;
        }
        return c4984la;
    }

    public final synchronized J9 b(String str) {
        Object obj;
        try {
            HashMap hashMap = this.b;
            obj = hashMap.get(str);
            if (obj == null) {
                obj = new J9(this.a, str);
                hashMap.put(str, obj);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (J9) obj;
    }

    public final synchronized void a(String str) {
        this.b.remove(str);
    }
}
