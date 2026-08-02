package androidx.compose.foundation.lazy.layout;

import defpackage.by40;
import defpackage.suw;
import defpackage.tls;

/* loaded from: classes10.dex */
public abstract class a {
    public final Object c(int i) {
        suw b = d().b(i);
        return b.c.getType().invoke(Integer.valueOf(i - b.a));
    }

    public abstract by40 d();

    public final Object e(int i) {
        Object invoke;
        suw b = d().b(i);
        int i2 = i - b.a;
        tls key = b.c.getKey();
        return (key == null || (invoke = key.invoke(Integer.valueOf(i2))) == null) ? new DefaultLazyKey(i) : invoke;
    }
}
