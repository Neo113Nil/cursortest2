package com.yandex.messaging.internal.suspend;

import defpackage.e1k;
import defpackage.fse;
import defpackage.hjt;
import defpackage.ie60;
import defpackage.jse;
import defpackage.l8x;
import defpackage.o400;
import defpackage.seu;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.z83;

/* loaded from: classes15.dex */
public abstract class a {
    public static final void a(e1k e1kVar, fse fseVar, jse jseVar) {
        l8x l8xVar = (l8x) fseVar.get(seu.C);
        if (l8xVar == null) {
            z83.i();
        } else {
            if (!l8xVar.isActive()) {
                e1kVar.close();
                return;
            }
            tje.N(hjt.a, ie60.a.plus(jseVar), null, new SuspendDisposableKt$attachToContext$2(l8xVar, e1kVar, null), 2);
        }
    }

    public static void b(e1k e1kVar, tse tseVar) {
        sjh sjhVar = uyj.a;
        a(e1kVar, tseVar.getCoroutineContext(), o400.a);
    }
}
