package androidx.compose.animation.core;

import defpackage.gl11;
import defpackage.id00;
import defpackage.jj2;
import defpackage.jl40;
import defpackage.kj2;
import defpackage.lax0;
import defpackage.oj2;
import defpackage.oz40;
import defpackage.pj2;
import defpackage.qj2;
import defpackage.sj2;
import defpackage.tls;
import defpackage.twt0;
import defpackage.y6i0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes10.dex */
public final class a {
    public final gl11 a;
    public final Object b;
    public final String c;
    public final kj2 d;
    public final oz40 e;
    public final oz40 f;
    public final d g;
    public final twt0 h;
    public final sj2 i;
    public final sj2 j;
    public final sj2 k;
    public final sj2 l;

    public a(Object obj, gl11 gl11Var, Object obj2, String str) {
        this.a = gl11Var;
        this.b = obj2;
        this.c = str;
        kj2 kj2Var = new kj2(gl11Var, obj, null, 60);
        this.d = kj2Var;
        this.e = androidx.compose.runtime.f.j(Boolean.FALSE);
        this.f = androidx.compose.runtime.f.j(obj);
        this.g = new d();
        this.h = new twt0(3, obj2);
        sj2 sj2Var = kj2Var.c;
        boolean z = sj2Var instanceof oj2;
        sj2 sj2Var2 = z ? id00.f : sj2Var instanceof pj2 ? id00.g : sj2Var instanceof qj2 ? id00.h : id00.i;
        this.i = sj2Var2;
        sj2 sj2Var3 = z ? id00.b : sj2Var instanceof pj2 ? id00.c : sj2Var instanceof qj2 ? id00.d : id00.e;
        this.j = sj2Var3;
        this.k = sj2Var2;
        this.l = sj2Var3;
    }

    public static final Object a(a aVar, Object obj) {
        gl11 gl11Var = aVar.a;
        sj2 sj2Var = aVar.l;
        sj2 sj2Var2 = aVar.k;
        if (!jl40.l(sj2Var2, aVar.i) || !jl40.l(sj2Var, aVar.j)) {
            sj2 sj2Var3 = (sj2) gl11Var.a.invoke(obj);
            int b = sj2Var3.b();
            boolean z = false;
            for (int i = 0; i < b; i++) {
                if (sj2Var3.a(i) < sj2Var2.a(i) || sj2Var3.a(i) > sj2Var.a(i)) {
                    sj2Var3.e(y6i0.c(sj2Var3.a(i), sj2Var2.a(i), sj2Var.a(i)), i);
                    z = true;
                }
            }
            if (z) {
                return gl11Var.b.invoke(sj2Var3);
            }
        }
        return obj;
    }

    public static final void b(a aVar) {
        kj2 kj2Var = aVar.d;
        kj2Var.c.d();
        kj2Var.w = Long.MIN_VALUE;
        aVar.e.setValue(Boolean.FALSE);
    }

    public static Object d(a aVar, Object obj, jj2 jj2Var, Float f, tls tlsVar, Continuation continuation, int i) {
        if ((i & 2) != 0) {
            jj2Var = aVar.h;
        }
        jj2 jj2Var2 = jj2Var;
        Object obj2 = f;
        if ((i & 4) != 0) {
            obj2 = aVar.a.b.invoke(aVar.d.c);
        }
        Object obj3 = obj2;
        if ((i & 8) != 0) {
            tlsVar = null;
        }
        return aVar.c(obj, jj2Var2, obj3, tlsVar, continuation);
    }

    public final Object c(Object obj, jj2 jj2Var, Object obj2, tls tlsVar, Continuation continuation) {
        Object e = e();
        gl11 gl11Var = this.a;
        return d.a(this.g, new Animatable$runAnimation$2(this, obj2, new lax0(jj2Var, gl11Var, e, obj, (sj2) gl11Var.a.invoke(obj2)), this.d.w, tlsVar, null), continuation);
    }

    public final Object e() {
        return this.d.b.getValue();
    }

    public final Object f(Object obj, Continuation continuation) {
        Object a = d.a(this.g, new Animatable$snapTo$2(this, obj, null), continuation);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : zy11.a;
    }

    public final Object g(ContinuationImpl continuationImpl) {
        Object a = d.a(this.g, new Animatable$stop$2(this, null), continuationImpl);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : zy11.a;
    }

    public /* synthetic */ a(Object obj, gl11 gl11Var, Object obj2, int i) {
        this(obj, gl11Var, (i & 4) != 0 ? null : obj2, "Animatable");
    }
}
