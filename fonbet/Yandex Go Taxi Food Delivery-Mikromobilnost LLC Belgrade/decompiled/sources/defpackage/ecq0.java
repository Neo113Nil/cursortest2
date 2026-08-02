package defpackage;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.selects.b;

/* loaded from: classes9.dex */
public final class ecq0 {
    public final Object a;
    public final zls b;
    public final zls c;
    public final Object d;
    public final SuspendLambda e;
    public final zls f;
    public Object g;
    public int h = -1;
    public final /* synthetic */ b i;

    public ecq0(b bVar, Object obj, zls zlsVar, zls zlsVar2, jb20 jb20Var, SuspendLambda suspendLambda, zls zlsVar3) {
        this.i = bVar;
        this.a = obj;
        this.b = zlsVar;
        this.c = zlsVar2;
        this.d = jb20Var;
        this.e = suspendLambda;
        this.f = zlsVar3;
    }

    public final void a() {
        Object obj = this.g;
        if (obj instanceof s7q0) {
            ((s7q0) obj).m(this.h, this.i.a);
            return;
        }
        m1k m1kVar = obj instanceof m1k ? (m1k) obj : null;
        if (m1kVar != null) {
            m1kVar.dispose();
        }
    }
}
