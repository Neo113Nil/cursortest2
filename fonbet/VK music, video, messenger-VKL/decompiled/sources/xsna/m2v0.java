package xsna;

import android.net.Uri;
import kotlin.LazyThreadSafetyMode;
import kotlin.text.Regex;

/* compiled from: VkLinkUtils.kt */
/* loaded from: classes17.dex */
public final class m2v0 {
    public static final m2v0 a = new m2v0();
    public static final Object b;
    public static final Object c;
    public static final Object d;
    public static final Object e;

    static {
        xk70 xk70Var = new xk70(15);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        b = msy.a(lazyThreadSafetyMode, xk70Var);
        c = msy.a(lazyThreadSafetyMode, new rjg0(12));
        d = msy.a(lazyThreadSafetyMode, new zqf0(12));
        e = msy.a(lazyThreadSafetyMode, new e6k0(10));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public static boolean a(Uri uri) {
        String host = uri.getHost();
        return host != null && ((Regex) b.getValue()).f(host);
    }
}
