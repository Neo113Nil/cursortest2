package xsna;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import xsna.xgl0;

/* compiled from: AsyncResultUtil.kt */
/* loaded from: classes2.dex */
public final class hz3 {
    public static final void a(mla mlaVar, String str, List<String> list) {
        if (str != null) {
            List<String> list2 = list;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                return;
            }
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                if (drm0.D((String) it.next(), str, false)) {
                    com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
                    IllegalStateException illegalStateException = new IllegalStateException(zr.a("Await is about to run on the same thread ", str, ", deadlock is possible.\nEither replace invocation with [env.submitCommandDirect(this, cmd)], or use different thread to await"));
                    nr2.L(illegalStateException, mlaVar.b());
                    bVar.q(illegalStateException);
                    return;
                }
            }
        }
    }

    public static final void b(mla mlaVar) {
        xgl0.a.getClass();
        if (epx.f(xgl0.a.b.get(), Boolean.TRUE)) {
            com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
            IllegalStateException illegalStateException = new IllegalStateException("A command is about to run inside write transaction, deadlock is possible.\nEither replace invocation with [env.submitCommandDirect(this, cmd)], or use readonly transaction");
            nr2.L(illegalStateException, mlaVar.b());
            bVar.q(illegalStateException);
        }
    }

    public static final gz3 c(mla mlaVar, io.reactivex.rxjava3.core.x xVar, String str, ArrayList arrayList) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        AtomicReference atomicReference = new AtomicReference();
        return new gz3(io.reactivex.rxjava3.kotlin.c.e(xVar, new p83(atomicReference, mlaVar, countDownLatch, 1), new defpackage.c(2, atomicReference, countDownLatch)), mlaVar, str, arrayList, countDownLatch, atomicReference);
    }
}
