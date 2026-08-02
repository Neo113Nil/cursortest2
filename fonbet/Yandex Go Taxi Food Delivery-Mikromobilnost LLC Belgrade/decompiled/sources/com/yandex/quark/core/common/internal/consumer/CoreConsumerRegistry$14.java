package com.yandex.quark.core.common.internal.consumer;

import defpackage.ilu;
import defpackage.klu;
import defpackage.sq6;
import defpackage.tq6;
import defpackage.uq6;
import defpackage.vq6;
import defpackage.w511;
import defpackage.wls;
import defpackage.wq6;
import defpackage.xc41;
import defpackage.xq6;
import defpackage.yq6;
import defpackage.zy11;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedDeque;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
final /* synthetic */ class CoreConsumerRegistry$14 extends FunctionReferenceImpl implements wls {
    public static final CoreConsumerRegistry$14 b = new CoreConsumerRegistry$14(2, 0, klu.class, "setHistogramRecorder", "setHistogramRecorder(Lcom/yandex/quark/histograms/HistogramRecorder;)V");

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        yq6 yq6Var = ((xc41) ((klu) obj)).w;
        yq6Var.b = (ilu) obj2;
        ConcurrentLinkedDeque concurrentLinkedDeque = yq6Var.a;
        Iterator it = concurrentLinkedDeque.iterator();
        while (it.hasNext()) {
            xq6 xq6Var = (xq6) it.next();
            if (xq6Var instanceof wq6) {
                wq6 wq6Var = (wq6) xq6Var;
                yq6Var.e(wq6Var.b(), wq6Var.a(), wq6Var.c());
            } else if (xq6Var instanceof vq6) {
                vq6 vq6Var = (vq6) xq6Var;
                yq6Var.a(vq6Var.b(), vq6Var.a());
            } else if (xq6Var instanceof tq6) {
                tq6 tq6Var = (tq6) xq6Var;
                yq6Var.d(tq6Var.b(), tq6Var.a());
            } else if (xq6Var instanceof uq6) {
                uq6 uq6Var = (uq6) xq6Var;
                yq6Var.c(uq6Var.c(), uq6Var.a(), uq6Var.b());
            } else {
                if (!(xq6Var instanceof sq6)) {
                    w511.b();
                    return null;
                }
                sq6 sq6Var = (sq6) xq6Var;
                yq6Var.b(sq6Var.a(), sq6Var.b());
            }
        }
        concurrentLinkedDeque.clear();
        return zy11.a;
    }
}
