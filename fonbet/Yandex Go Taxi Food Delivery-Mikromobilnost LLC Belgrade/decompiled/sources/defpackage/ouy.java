package defpackage;

import android.os.Looper;
import java.util.concurrent.Executor;

/* loaded from: classes11.dex */
public final class ouy {
    public final Executor a;
    public volatile Object b;
    public volatile luy c;

    public ouy(Looper looper, Object obj, String str) {
        this.a = new iju(looper);
        cvw.m(obj, "Listener must not be null");
        this.b = obj;
        cvw.i(str);
        this.c = new luy(obj, str);
    }

    public final void a() {
        this.b = null;
        this.c = null;
    }

    public final luy b() {
        return this.c;
    }

    public final void c(muy muyVar) {
        this.a.execute(new uqs(20, this, muyVar));
    }

    public ouy(Object obj, String str, Executor executor) {
        cvw.m(executor, "Executor must not be null");
        this.a = executor;
        cvw.m(obj, "Listener must not be null");
        this.b = obj;
        cvw.i(str);
        this.c = new luy(obj, str);
    }
}
