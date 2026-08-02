package com.yandex.go.taxi.order.domain.repositories;

import defpackage.bvf0;
import defpackage.ffx;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.tls;
import defpackage.vez0;
import defpackage.x4e;
import java.util.ArrayList;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes8.dex */
public final class f0 {
    public final r0 a;
    public final r0 b;
    public final r0 c;
    public final r0 d;
    public final r0 e;
    public final r0 f;
    public final r0 g;
    public final r0 h;
    public final n0 i;
    public final n0 j;
    public final ArrayList k;
    public final r0 l;
    public final r0 m;
    public int n;
    public int o;
    public final r0 p;
    public final r0 q;

    public f0() {
        r0 c = bvf0.c(Boolean.TRUE);
        this.a = c;
        this.b = c;
        r0 c2 = bvf0.c(0);
        this.c = c2;
        this.d = c2;
        r0 c3 = bvf0.c(0);
        this.e = c3;
        this.f = c3;
        r0 c4 = bvf0.c(0);
        this.g = c4;
        this.h = c4;
        n0 b = ffx.b(1, 0, BufferOverflow.DROP_OLDEST);
        this.i = b;
        this.j = b;
        this.k = new ArrayList();
        r0 c5 = bvf0.c(Boolean.FALSE);
        this.l = c5;
        this.m = c5;
        r0 c6 = bvf0.c(null);
        this.p = c6;
        this.q = c6;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CoroutineSingletons a(tls tlsVar, ContinuationImpl continuationImpl) {
        TaxiOrderTrackingViewStateRepository$doOnEachSlideOffset$1 taxiOrderTrackingViewStateRepository$doOnEachSlideOffset$1;
        int i;
        ArrayList arrayList;
        try {
            if (continuationImpl instanceof TaxiOrderTrackingViewStateRepository$doOnEachSlideOffset$1) {
                taxiOrderTrackingViewStateRepository$doOnEachSlideOffset$1 = (TaxiOrderTrackingViewStateRepository$doOnEachSlideOffset$1) continuationImpl;
                int i2 = taxiOrderTrackingViewStateRepository$doOnEachSlideOffset$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    taxiOrderTrackingViewStateRepository$doOnEachSlideOffset$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = taxiOrderTrackingViewStateRepository$doOnEachSlideOffset$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = taxiOrderTrackingViewStateRepository$doOnEachSlideOffset$1.label;
                    arrayList = this.k;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        vez0.h0();
                        if (!arrayList.contains(tlsVar)) {
                            arrayList.add(tlsVar);
                        }
                        Float f = (Float) kotlin.collections.a.b0(this.i.b());
                        if (f != null) {
                            tlsVar.invoke(f);
                        }
                        taxiOrderTrackingViewStateRepository$doOnEachSlideOffset$1.L$0 = tlsVar;
                        taxiOrderTrackingViewStateRepository$doOnEachSlideOffset$1.L$1 = null;
                        taxiOrderTrackingViewStateRepository$doOnEachSlideOffset$1.label = 1;
                        if (kotlinx.coroutines.a.d(taxiOrderTrackingViewStateRepository$doOnEachSlideOffset$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        tlsVar = (tls) taxiOrderTrackingViewStateRepository$doOnEachSlideOffset$1.L$0;
                        kotlin.b.b(obj);
                    }
                    throw new KotlinNothingValueException();
                }
            }
            if (i != 0) {
            }
            throw new KotlinNothingValueException();
        } catch (Throwable th) {
            vez0.h0();
            arrayList.remove(tlsVar);
            throw th;
        }
        taxiOrderTrackingViewStateRepository$doOnEachSlideOffset$1 = new TaxiOrderTrackingViewStateRepository$doOnEachSlideOffset$1(this, continuationImpl);
        Object obj2 = taxiOrderTrackingViewStateRepository$doOnEachSlideOffset$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxiOrderTrackingViewStateRepository$doOnEachSlideOffset$1.label;
        arrayList = this.k;
    }

    public final void b(int i, o2y0 o2y0Var) {
        if (jl40.l(this.q.getValue(), o2y0Var)) {
            this.n = i;
            x4e.z(this.o + i, this.c, null);
        }
    }
}
