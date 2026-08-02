package xsna;

import java.util.Map;
import kotlin.LazyThreadSafetyMode;

/* compiled from: DiskCachesStoreFactory.kt */
/* loaded from: classes.dex */
public final class hbn implements yhn0<fbn> {
    public final z7r a;
    public final evb0 b;
    public final r3q c;
    public final igw d;
    public final int e;
    public final wan f;
    public final wan g;
    public final Map<String, wan> h;
    public final Object i;

    public hbn(z7r z7rVar, tkw tkwVar) {
        evb0 evb0Var = tkwVar.o;
        sel selVar = tkwVar.i;
        igw igwVar = tkwVar.j;
        wan wanVar = tkwVar.l;
        wan wanVar2 = tkwVar.u;
        this.a = z7rVar;
        this.b = evb0Var;
        this.c = selVar;
        this.d = igwVar;
        this.e = 0;
        this.f = wanVar;
        this.g = wanVar2;
        this.h = null;
        this.i = msy.a(LazyThreadSafetyMode.SYNCHRONIZED, new rx2(this, 2));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.yhn0
    public final fbn get() {
        return (fbn) this.i.getValue();
    }
}
