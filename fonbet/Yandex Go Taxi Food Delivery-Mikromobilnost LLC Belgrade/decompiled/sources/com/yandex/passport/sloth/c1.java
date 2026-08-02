package com.yandex.passport.sloth;

import com.yandex.passport.sloth.data.SlothParams;
import defpackage.fse;
import defpackage.g8e;
import defpackage.l8x;
import defpackage.qhw0;
import defpackage.seu;
import defpackage.zy11;
import java.io.Closeable;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class c1 implements Closeable {
    public final com.yandex.passport.sloth.url.a A;
    public final z0 B;
    public final b1 C = new b1(this);
    public final SlothParams a;
    public final com.yandex.passport.sloth.command.f b;
    public final v c;
    public final com.yandex.passport.sloth.url.j w;
    public final h x;
    public final com.yandex.passport.sloth.url.c y;
    public final com.yandex.passport.sloth.ui.a1 z;

    public c1(SlothParams slothParams, com.yandex.passport.sloth.command.f fVar, v vVar, com.yandex.passport.sloth.url.j jVar, h hVar, com.yandex.passport.sloth.url.c cVar, com.yandex.passport.sloth.ui.a1 a1Var, com.yandex.passport.sloth.url.a aVar, z0 z0Var) {
        this.a = slothParams;
        this.b = fVar;
        this.c = vVar;
        this.w = jVar;
        this.x = hVar;
        this.y = cVar;
        this.z = a1Var;
        this.A = aVar;
        this.B = z0Var;
    }

    public final Object a(ContinuationImpl continuationImpl) {
        com.yandex.passport.sloth.data.c0 variant = this.a.getVariant();
        this.B.a(new n0(SlothMetricaEvent$Event.SESSION_START, g8e.z("variant", variant.toString())));
        Object o = this.y.o(variant, continuationImpl);
        return o == CoroutineSingletons.COROUTINE_SUSPENDED ? o : zy11.a;
    }

    public final Object c(fse fseVar, ContinuationImpl continuationImpl) {
        h hVar = this.x;
        qhw0 qhw0Var = hVar.c;
        if (qhw0Var != null) {
            qhw0Var.a(null);
        }
        qhw0 qhw0Var2 = new qhw0((l8x) fseVar.get(seu.C));
        hVar.c = qhw0Var2;
        qhw0Var2.w(new com.yandex.passport.internal.analytics.a0(22, hVar));
        Object a = a(continuationImpl);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : zy11.a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.x.close();
    }
}
