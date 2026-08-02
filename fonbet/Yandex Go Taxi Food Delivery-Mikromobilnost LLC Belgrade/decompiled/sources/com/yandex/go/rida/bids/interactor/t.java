package com.yandex.go.rida.bids.interactor;

import com.yandex.mapkit.geometry.Point;
import defpackage.a3v;
import defpackage.ah00;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.o400;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class t {
    public final ah00 a;
    public final o2y0 b;
    public final a3v c;
    public final ru.yandex.taxi.map_common.map.p d;
    public final Object e = new Object();

    public t(ah00 ah00Var, tt2 tt2Var, o2y0 o2y0Var, a3v a3vVar, ru.yandex.taxi.map_common.map.p pVar) {
        this.a = ah00Var;
        this.b = o2y0Var;
        this.c = a3vVar;
        this.d = pVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0052, code lost:
    
        if (kotlinx.coroutines.a.i(50, r0) != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0047, code lost:
    
        if (r9.d.c(r0) == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        InitMapInteractor$attachMap$1 initMapInteractor$attachMap$1;
        int i;
        if (continuationImpl instanceof InitMapInteractor$attachMap$1) {
            initMapInteractor$attachMap$1 = (InitMapInteractor$attachMap$1) continuationImpl;
            int i2 = initMapInteractor$attachMap$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                initMapInteractor$attachMap$1.label = i2 - Integer.MIN_VALUE;
                Object obj = initMapInteractor$attachMap$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = initMapInteractor$attachMap$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    initMapInteractor$attachMap$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                kotlin.b.b(obj);
                                return obj;
                            }
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        this.c.b8(this.e);
                        initMapInteractor$attachMap$1.label = 3;
                        zzs v = this.b.b().v();
                        Object obj3 = zy11.a;
                        if (v != null) {
                            Point point = new Point(v.a, v.b);
                            sjh sjhVar = uyj.a;
                            Object k0 = tje.k0(o400.a, new InitMapInteractor$initMapPosition$2(this, point, null), initMapInteractor$attachMap$1);
                            if (k0 == obj2) {
                                obj3 = k0;
                            }
                        }
                        return obj3 == obj2 ? obj2 : obj3;
                    }
                    kotlin.b.b(obj);
                }
                initMapInteractor$attachMap$1.label = 2;
            }
        }
        initMapInteractor$attachMap$1 = new InitMapInteractor$attachMap$1(this, continuationImpl);
        Object obj4 = initMapInteractor$attachMap$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = initMapInteractor$attachMap$1.label;
        if (i != 0) {
        }
        initMapInteractor$attachMap$1.label = 2;
    }
}
