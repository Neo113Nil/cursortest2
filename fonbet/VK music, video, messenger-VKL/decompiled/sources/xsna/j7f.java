package xsna;

import kotlin.LazyThreadSafetyMode;

/* compiled from: ClipsTemplateEditorDeps.kt */
/* loaded from: classes16.dex */
public final class j7f {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final bpn0 f;

    public j7f(l7m l7mVar) {
        e7f e7fVar = new e7f(l7mVar, 0);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.a = msy.a(lazyThreadSafetyMode, e7fVar);
        int i = 0;
        this.b = msy.a(lazyThreadSafetyMode, new f7f(l7mVar, i));
        this.c = msy.a(lazyThreadSafetyMode, new g7f(l7mVar, i));
        this.d = msy.a(lazyThreadSafetyMode, new h7f(l7mVar, i));
        this.e = msy.a(lazyThreadSafetyMode, new i7f(l7mVar, i));
        this.f = new bpn0(new jxd(l7mVar, 1));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final lbk a() {
        return (lbk) this.b.getValue();
    }
}
