package defpackage;

import io.flutter.embedding.engine.FlutterJNI;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes4.dex */
public final class isr {
    public psr a;
    public ixc0 b;
    public FlutterJNI.a c;
    public ExecutorService d;

    public final jsr a() {
        if (this.c == null) {
            this.c = new FlutterJNI.a();
        }
        if (this.d == null) {
            hsr hsrVar = new hsr();
            hsrVar.a = 0;
            this.d = Executors.newCachedThreadPool(hsrVar);
        }
        if (this.a == null) {
            this.c.getClass();
            this.a = new psr(new FlutterJNI(), this.d);
        }
        psr psrVar = this.a;
        ixc0 ixc0Var = this.b;
        FlutterJNI.a aVar = this.c;
        ExecutorService executorService = this.d;
        jsr jsrVar = new jsr();
        jsrVar.a = psrVar;
        jsrVar.b = ixc0Var;
        jsrVar.c = aVar;
        jsrVar.d = executorService;
        return jsrVar;
    }
}
