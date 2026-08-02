package defpackage;

import com.google.firebase.crashlytics.internal.concurrency.a;
import java.util.concurrent.atomic.AtomicMarkableReference;

/* loaded from: classes.dex */
public final class jp21 {
    public final m820 a;
    public final a b;
    public String c;
    public final lxj d = new lxj(this, false);
    public final lxj e = new lxj(this, true);
    public final dwk0 f = new dwk0();
    public final AtomicMarkableReference g = new AtomicMarkableReference(null, false);

    public jp21(String str, q1r q1rVar, a aVar) {
        this.c = str;
        this.a = new m820(q1rVar);
        this.b = aVar;
    }
}
