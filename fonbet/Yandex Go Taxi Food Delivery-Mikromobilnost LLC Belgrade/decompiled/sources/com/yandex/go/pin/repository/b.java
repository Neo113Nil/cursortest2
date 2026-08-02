package com.yandex.go.pin.repository;

import android.graphics.drawable.BitmapDrawable;
import defpackage.c0c0;
import defpackage.e800;
import defpackage.f0c0;
import defpackage.fji;
import defpackage.fnx0;
import defpackage.kb5;
import defpackage.lub0;
import defpackage.nj6;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.wiq0;
import defpackage.zdt0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.tariffs.model.DeliveryPinType;
import ru.yandex.taxi.widget.map.SourceOnMapControl;

/* loaded from: classes13.dex */
public final class b implements e800 {
    public final ru.yandex.taxi.address.interactor.a a;
    public final ru.yandex.taxi.widget.utils.e b;
    public final ru.yandex.taxi.delivery.pin.k c;
    public final wiq0 d;
    public final nj6 e;

    public b(nj6 nj6Var, wiq0 wiq0Var, ru.yandex.taxi.address.interactor.a aVar, ru.yandex.taxi.delivery.pin.k kVar, ru.yandex.taxi.widget.utils.e eVar) {
        this.a = aVar;
        this.b = eVar;
        this.c = kVar;
        this.d = wiq0Var;
        this.e = nj6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0073 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        MainPinStateRepositoryImpl$defaultDestinationV2State$1 mainPinStateRepositoryImpl$defaultDestinationV2State$1;
        int i;
        f0c0 f0c0Var;
        if (continuationImpl instanceof MainPinStateRepositoryImpl$defaultDestinationV2State$1) {
            mainPinStateRepositoryImpl$defaultDestinationV2State$1 = (MainPinStateRepositoryImpl$defaultDestinationV2State$1) continuationImpl;
            int i2 = mainPinStateRepositoryImpl$defaultDestinationV2State$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mainPinStateRepositoryImpl$defaultDestinationV2State$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mainPinStateRepositoryImpl$defaultDestinationV2State$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mainPinStateRepositoryImpl$defaultDestinationV2State$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    fnx0 l = ((com.yandex.go.taxi.tariffs.internal.repository.k) this.d).l();
                    pex0 pex0Var = l != null ? l.c : null;
                    mainPinStateRepositoryImpl$defaultDestinationV2State$1.L$0 = null;
                    mainPinStateRepositoryImpl$defaultDestinationV2State$1.label = 1;
                    ru.yandex.taxi.delivery.pin.k kVar = this.c;
                    kVar.getClass();
                    obj = pex0Var != null ? kVar.d(pex0Var, DeliveryPinType.MAP_DESTINATION, mainPinStateRepositoryImpl$defaultDestinationV2State$1) : null;
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                fji fjiVar = (fji) obj;
                f0c0Var = fjiVar == null ? fjiVar.a : null;
                if (f0c0Var == null) {
                    return new SourceOnMapControl.a(f0c0Var, null, null, false, false, null, null, 2046);
                }
                return null;
            }
        }
        mainPinStateRepositoryImpl$defaultDestinationV2State$1 = new MainPinStateRepositoryImpl$defaultDestinationV2State$1(this, continuationImpl);
        Object obj2 = mainPinStateRepositoryImpl$defaultDestinationV2State$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mainPinStateRepositoryImpl$defaultDestinationV2State$1.label;
        if (i != 0) {
        }
        fji fjiVar2 = (fji) obj2;
        if (fjiVar2 == null) {
        }
        if (f0c0Var == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x010d, code lost:
    
        if (r1 == r3) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0141, code lost:
    
        if (r1 == r3) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00a2, code lost:
    
        if (r1 == r3) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        MainPinStateRepositoryImpl$defaultSourceV2State$1 mainPinStateRepositoryImpl$defaultSourceV2State$1;
        int i;
        fnx0 l;
        f0c0 f0c0Var;
        lub0 e;
        f0c0 f0c0Var2;
        zdt0 zdt0Var;
        kb5 kb5Var;
        f0c0 f0c0Var3;
        lub0 lub0Var;
        if (continuationImpl instanceof MainPinStateRepositoryImpl$defaultSourceV2State$1) {
            mainPinStateRepositoryImpl$defaultSourceV2State$1 = (MainPinStateRepositoryImpl$defaultSourceV2State$1) continuationImpl;
            int i2 = mainPinStateRepositoryImpl$defaultSourceV2State$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mainPinStateRepositoryImpl$defaultSourceV2State$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mainPinStateRepositoryImpl$defaultSourceV2State$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mainPinStateRepositoryImpl$defaultSourceV2State$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    l = ((com.yandex.go.taxi.tariffs.internal.repository.k) this.d).l();
                    pex0 pex0Var = l != null ? l.c : null;
                    mainPinStateRepositoryImpl$defaultSourceV2State$1.L$0 = l;
                    mainPinStateRepositoryImpl$defaultSourceV2State$1.label = 1;
                    ru.yandex.taxi.delivery.pin.k kVar = this.c;
                    kVar.getClass();
                    obj = pex0Var != null ? kVar.d(pex0Var, DeliveryPinType.MAP_SOURCE, mainPinStateRepositoryImpl$defaultSourceV2State$1) : null;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                kotlin.b.b(obj);
                                BitmapDrawable bitmapDrawable = (BitmapDrawable) obj;
                                if (bitmapDrawable != null) {
                                    return new SourceOnMapControl.a(new c0c0(bitmapDrawable), null, null, false, false, null, null, 2046);
                                }
                                return null;
                            }
                            if (i != 4) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.b.b(obj);
                            BitmapDrawable bitmapDrawable2 = (BitmapDrawable) obj;
                            if (bitmapDrawable2 != null) {
                                return new SourceOnMapControl.a(new c0c0(bitmapDrawable2), null, null, false, false, null, null, 2046);
                            }
                            return null;
                        }
                        lub0Var = (lub0) mainPinStateRepositoryImpl$defaultSourceV2State$1.L$2;
                        f0c0Var3 = (f0c0) mainPinStateRepositoryImpl$defaultSourceV2State$1.L$1;
                        kotlin.b.b(obj);
                        zdt0Var = (zdt0) obj;
                        e = lub0Var;
                        f0c0Var2 = f0c0Var3;
                        if (f0c0Var2 == null) {
                            return new SourceOnMapControl.a(f0c0Var2, null, null, false, false, null, null, 2046);
                        }
                        ru.yandex.taxi.widget.utils.e eVar = this.b;
                        if (e == null) {
                            if ((zdt0Var != null ? zdt0Var.c : null) != null) {
                                String str = zdt0Var.c;
                                mainPinStateRepositoryImpl$defaultSourceV2State$1.L$0 = null;
                                mainPinStateRepositoryImpl$defaultSourceV2State$1.L$1 = null;
                                mainPinStateRepositoryImpl$defaultSourceV2State$1.L$2 = null;
                                mainPinStateRepositoryImpl$defaultSourceV2State$1.L$3 = null;
                                mainPinStateRepositoryImpl$defaultSourceV2State$1.label = 4;
                                obj = ru.yandex.taxi.widget.utils.e.f(eVar, str, null, mainPinStateRepositoryImpl$defaultSourceV2State$1, 6);
                            }
                            return null;
                        }
                        String str2 = e.a;
                        mainPinStateRepositoryImpl$defaultSourceV2State$1.L$0 = null;
                        mainPinStateRepositoryImpl$defaultSourceV2State$1.L$1 = null;
                        mainPinStateRepositoryImpl$defaultSourceV2State$1.L$2 = null;
                        mainPinStateRepositoryImpl$defaultSourceV2State$1.L$3 = null;
                        mainPinStateRepositoryImpl$defaultSourceV2State$1.label = 3;
                        obj = ru.yandex.taxi.widget.utils.e.f(eVar, str2, null, mainPinStateRepositoryImpl$defaultSourceV2State$1, 6);
                        return coroutineSingletons;
                    }
                    l = (fnx0) mainPinStateRepositoryImpl$defaultSourceV2State$1.L$0;
                    kotlin.b.b(obj);
                }
                fji fjiVar = (fji) obj;
                f0c0Var = fjiVar == null ? fjiVar.a : null;
                pex0 m = ((com.yandex.go.taxi.tariffs.internal.repository.k) ((com.yandex.go.summary.branding_pin.i) this.e).a).m();
                e = m == null ? com.yandex.go.summary.branding_pin.i.e(m) : null;
                if (l == null && (kb5Var = l.e) != null) {
                    mainPinStateRepositoryImpl$defaultSourceV2State$1.L$0 = null;
                    mainPinStateRepositoryImpl$defaultSourceV2State$1.L$1 = f0c0Var;
                    mainPinStateRepositoryImpl$defaultSourceV2State$1.L$2 = e;
                    mainPinStateRepositoryImpl$defaultSourceV2State$1.L$3 = null;
                    mainPinStateRepositoryImpl$defaultSourceV2State$1.label = 2;
                    Object a = this.a.a(kb5Var, mainPinStateRepositoryImpl$defaultSourceV2State$1);
                    if (a != coroutineSingletons) {
                        f0c0Var3 = f0c0Var;
                        obj = a;
                        lub0Var = e;
                        zdt0Var = (zdt0) obj;
                        e = lub0Var;
                        f0c0Var2 = f0c0Var3;
                        if (f0c0Var2 == null) {
                        }
                    }
                    return coroutineSingletons;
                }
                f0c0Var2 = f0c0Var;
                zdt0Var = null;
                if (f0c0Var2 == null) {
                }
            }
        }
        mainPinStateRepositoryImpl$defaultSourceV2State$1 = new MainPinStateRepositoryImpl$defaultSourceV2State$1(this, continuationImpl);
        Object obj2 = mainPinStateRepositoryImpl$defaultSourceV2State$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mainPinStateRepositoryImpl$defaultSourceV2State$1.label;
        if (i != 0) {
        }
        fji fjiVar2 = (fji) obj2;
        if (fjiVar2 == null) {
        }
        pex0 m2 = ((com.yandex.go.taxi.tariffs.internal.repository.k) ((com.yandex.go.summary.branding_pin.i) this.e).a).m();
        if (m2 == null) {
        }
        if (l == null) {
        }
        f0c0Var2 = f0c0Var;
        zdt0Var = null;
        if (f0c0Var2 == null) {
        }
    }
}
