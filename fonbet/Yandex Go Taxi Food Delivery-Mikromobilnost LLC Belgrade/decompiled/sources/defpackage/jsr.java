package defpackage;

import io.flutter.embedding.engine.FlutterJNI;
import java.util.concurrent.ExecutorService;

/* loaded from: classes4.dex */
public final class jsr {
    public static jsr e;
    public static boolean f;
    public psr a;
    public ixc0 b;
    public FlutterJNI.a c;
    public ExecutorService d;

    public static jsr d() {
        f = true;
        if (e == null) {
            e = new isr().a();
        }
        return e;
    }

    public final poh a() {
        return this.b;
    }

    public final psr b() {
        return this.a;
    }

    public final FlutterJNI.a c() {
        return this.c;
    }
}
