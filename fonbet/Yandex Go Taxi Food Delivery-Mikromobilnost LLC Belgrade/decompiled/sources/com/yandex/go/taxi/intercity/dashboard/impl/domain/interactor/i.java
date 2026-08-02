package com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor;

import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.IntercityDashboardSectionDto$SeatsSelectorSectionDtoIntercity;
import defpackage.b580;
import defpackage.c9v;
import defpackage.dqe0;
import defpackage.ejj0;
import defpackage.if70;
import defpackage.jl40;
import defpackage.jmw0;
import defpackage.lmw0;
import defpackage.miw;
import defpackage.mth;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.pj;
import defpackage.q5z;
import defpackage.w3r0;
import defpackage.wiq0;
import defpackage.xfw;
import defpackage.yfw;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes14.dex */
public final class i implements miw {
    public final com.yandex.go.taxi.intercity.dashboard.impl.data.repository.a a;
    public final wiq0 b;
    public final w3r0 c;
    public final c9v d;
    public final dqe0 e;

    public i(com.yandex.go.taxi.intercity.dashboard.impl.data.repository.a aVar, wiq0 wiq0Var, w3r0 w3r0Var, c9v c9vVar, dqe0 dqe0Var) {
        this.a = aVar;
        this.b = wiq0Var;
        this.c = w3r0Var;
        this.d = c9vVar;
        this.e = dqe0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        IntercityDashboardSeatsInteractorImpl$awaitTaxiTariffClassChangedTo$1 intercityDashboardSeatsInteractorImpl$awaitTaxiTariffClassChangedTo$1;
        int i;
        if (continuationImpl instanceof IntercityDashboardSeatsInteractorImpl$awaitTaxiTariffClassChangedTo$1) {
            intercityDashboardSeatsInteractorImpl$awaitTaxiTariffClassChangedTo$1 = (IntercityDashboardSeatsInteractorImpl$awaitTaxiTariffClassChangedTo$1) continuationImpl;
            int i2 = intercityDashboardSeatsInteractorImpl$awaitTaxiTariffClassChangedTo$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                intercityDashboardSeatsInteractorImpl$awaitTaxiTariffClassChangedTo$1.label = i2 - Integer.MIN_VALUE;
                Object obj = intercityDashboardSeatsInteractorImpl$awaitTaxiTariffClassChangedTo$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = intercityDashboardSeatsInteractorImpl$awaitTaxiTariffClassChangedTo$1.label;
                zy11 zy11Var = zy11.a;
                if (i == 0) {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return zy11Var;
                }
                kotlin.b.b(obj);
                com.yandex.go.taxi.tariffs.internal.repository.k kVar = (com.yandex.go.taxi.tariffs.internal.repository.k) this.b;
                pex0 m = kVar.m();
                if (!jl40.l(m != null ? m.b : null, str)) {
                    mth b = kVar.j.b();
                    IntercityDashboardSeatsInteractorImpl$awaitTaxiTariffClassChangedTo$2 intercityDashboardSeatsInteractorImpl$awaitTaxiTariffClassChangedTo$2 = new IntercityDashboardSeatsInteractorImpl$awaitTaxiTariffClassChangedTo$2(str, null);
                    intercityDashboardSeatsInteractorImpl$awaitTaxiTariffClassChangedTo$1.L$0 = null;
                    intercityDashboardSeatsInteractorImpl$awaitTaxiTariffClassChangedTo$1.label = 1;
                    if (kotlinx.coroutines.flow.e.z(b, intercityDashboardSeatsInteractorImpl$awaitTaxiTariffClassChangedTo$2, intercityDashboardSeatsInteractorImpl$awaitTaxiTariffClassChangedTo$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return zy11Var;
            }
        }
        intercityDashboardSeatsInteractorImpl$awaitTaxiTariffClassChangedTo$1 = new IntercityDashboardSeatsInteractorImpl$awaitTaxiTariffClassChangedTo$1(this, continuationImpl);
        Object obj2 = intercityDashboardSeatsInteractorImpl$awaitTaxiTariffClassChangedTo$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = intercityDashboardSeatsInteractorImpl$awaitTaxiTariffClassChangedTo$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        IntercityDashboardSeatsInteractorImpl$decrementSeats$1 intercityDashboardSeatsInteractorImpl$decrementSeats$1;
        int i;
        int i2;
        Integer num;
        int intValue;
        String str;
        if (continuationImpl instanceof IntercityDashboardSeatsInteractorImpl$decrementSeats$1) {
            intercityDashboardSeatsInteractorImpl$decrementSeats$1 = (IntercityDashboardSeatsInteractorImpl$decrementSeats$1) continuationImpl;
            int i3 = intercityDashboardSeatsInteractorImpl$decrementSeats$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                intercityDashboardSeatsInteractorImpl$decrementSeats$1.label = i3 - Integer.MIN_VALUE;
                Object obj = intercityDashboardSeatsInteractorImpl$decrementSeats$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = intercityDashboardSeatsInteractorImpl$decrementSeats$1.label;
                zy11 zy11Var = zy11.a;
                Integer num2 = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    yfw a = this.a.a();
                    IntercityDashboardSectionDto$SeatsSelectorSectionDtoIntercity.SeatsSelectorTariffRule seatsSelectorTariffRule = a.i;
                    if (seatsSelectorTariffRule != null && (num = a.j) != null && (intValue = num.intValue()) > seatsSelectorTariffRule.b) {
                        num2 = new Integer(intValue);
                    }
                    if (num2 != null) {
                        int intValue2 = num2.intValue();
                        int i4 = intValue2 - 1;
                        intercityDashboardSeatsInteractorImpl$decrementSeats$1.I$0 = intValue2;
                        intercityDashboardSeatsInteractorImpl$decrementSeats$1.I$1 = i4;
                        intercityDashboardSeatsInteractorImpl$decrementSeats$1.label = 1;
                        if (d(i4, intercityDashboardSeatsInteractorImpl$decrementSeats$1) == obj2) {
                            return obj2;
                        }
                        i2 = intValue2;
                    }
                    return zy11Var;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i2 = intercityDashboardSeatsInteractorImpl$decrementSeats$1.I$0;
                kotlin.b.b(obj);
                c9v c9vVar = this.d;
                yfw a2 = ((com.yandex.go.taxi.intercity.dashboard.impl.data.repository.a) c9vVar.c).a();
                pj pjVar = (pj) c9vVar.b;
                str = a2.h;
                if (str == null) {
                    str = "";
                }
                pjVar.g(i2, str, "decrement");
                return zy11Var;
            }
        }
        intercityDashboardSeatsInteractorImpl$decrementSeats$1 = new IntercityDashboardSeatsInteractorImpl$decrementSeats$1(this, continuationImpl);
        Object obj3 = intercityDashboardSeatsInteractorImpl$decrementSeats$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = intercityDashboardSeatsInteractorImpl$decrementSeats$1.label;
        zy11 zy11Var2 = zy11.a;
        Integer num22 = null;
        if (i != 0) {
        }
        c9v c9vVar2 = this.d;
        yfw a22 = ((com.yandex.go.taxi.intercity.dashboard.impl.data.repository.a) c9vVar2.c).a();
        pj pjVar2 = (pj) c9vVar2.b;
        str = a22.h;
        if (str == null) {
        }
        pjVar2.g(i2, str, "decrement");
        return zy11Var2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        IntercityDashboardSeatsInteractorImpl$incrementSeats$1 intercityDashboardSeatsInteractorImpl$incrementSeats$1;
        int i;
        int i2;
        Integer num;
        int intValue;
        String str;
        if (continuationImpl instanceof IntercityDashboardSeatsInteractorImpl$incrementSeats$1) {
            intercityDashboardSeatsInteractorImpl$incrementSeats$1 = (IntercityDashboardSeatsInteractorImpl$incrementSeats$1) continuationImpl;
            int i3 = intercityDashboardSeatsInteractorImpl$incrementSeats$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                intercityDashboardSeatsInteractorImpl$incrementSeats$1.label = i3 - Integer.MIN_VALUE;
                Object obj = intercityDashboardSeatsInteractorImpl$incrementSeats$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = intercityDashboardSeatsInteractorImpl$incrementSeats$1.label;
                zy11 zy11Var = zy11.a;
                Integer num2 = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    yfw a = this.a.a();
                    IntercityDashboardSectionDto$SeatsSelectorSectionDtoIntercity.SeatsSelectorTariffRule seatsSelectorTariffRule = a.i;
                    if (seatsSelectorTariffRule != null && (num = a.j) != null && (intValue = num.intValue()) < seatsSelectorTariffRule.c) {
                        num2 = new Integer(intValue);
                    }
                    if (num2 != null) {
                        int intValue2 = num2.intValue();
                        int i4 = intValue2 + 1;
                        intercityDashboardSeatsInteractorImpl$incrementSeats$1.I$0 = intValue2;
                        intercityDashboardSeatsInteractorImpl$incrementSeats$1.I$1 = i4;
                        intercityDashboardSeatsInteractorImpl$incrementSeats$1.label = 1;
                        if (d(i4, intercityDashboardSeatsInteractorImpl$incrementSeats$1) == obj2) {
                            return obj2;
                        }
                        i2 = intValue2;
                    }
                    return zy11Var;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i2 = intercityDashboardSeatsInteractorImpl$incrementSeats$1.I$0;
                kotlin.b.b(obj);
                c9v c9vVar = this.d;
                yfw a2 = ((com.yandex.go.taxi.intercity.dashboard.impl.data.repository.a) c9vVar.c).a();
                pj pjVar = (pj) c9vVar.b;
                str = a2.h;
                if (str == null) {
                    str = "";
                }
                pjVar.g(i2, str, "increment");
                return zy11Var;
            }
        }
        intercityDashboardSeatsInteractorImpl$incrementSeats$1 = new IntercityDashboardSeatsInteractorImpl$incrementSeats$1(this, continuationImpl);
        Object obj3 = intercityDashboardSeatsInteractorImpl$incrementSeats$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = intercityDashboardSeatsInteractorImpl$incrementSeats$1.label;
        zy11 zy11Var2 = zy11.a;
        Integer num22 = null;
        if (i != 0) {
        }
        c9v c9vVar2 = this.d;
        yfw a22 = ((com.yandex.go.taxi.intercity.dashboard.impl.data.repository.a) c9vVar2.c).a();
        pj pjVar2 = (pj) c9vVar2.b;
        str = a22.h;
        if (str == null) {
        }
        pjVar2.g(i2, str, "increment");
        return zy11Var2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(int i, ContinuationImpl continuationImpl) {
        IntercityDashboardSeatsInteractorImpl$setSeatsCount$1 intercityDashboardSeatsInteractorImpl$setSeatsCount$1;
        int i2;
        Object value;
        yfw a;
        int i3;
        yfw yfwVar;
        pex0 m;
        jmw0 jmw0Var;
        ejj0 q;
        Object obj;
        zy11 zy11Var = zy11.a;
        if (continuationImpl instanceof IntercityDashboardSeatsInteractorImpl$setSeatsCount$1) {
            intercityDashboardSeatsInteractorImpl$setSeatsCount$1 = (IntercityDashboardSeatsInteractorImpl$setSeatsCount$1) continuationImpl;
            int i4 = intercityDashboardSeatsInteractorImpl$setSeatsCount$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                intercityDashboardSeatsInteractorImpl$setSeatsCount$1.label = i4 - Integer.MIN_VALUE;
                Object obj2 = intercityDashboardSeatsInteractorImpl$setSeatsCount$1.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = intercityDashboardSeatsInteractorImpl$setSeatsCount$1.label;
                if (i2 != 0) {
                    kotlin.b.b(obj2);
                    r0 r0Var = this.a.b;
                    do {
                        value = r0Var.getValue();
                        a = yfw.a((yfw) value, null, Integer.valueOf(i), null, null, null, null, HProv.PP_DELETE_KEYSET);
                    } while (!r0Var.k(value, a));
                    xfw xfwVar = a.a;
                    if (xfwVar != null && a.i != null) {
                        String str = xfwVar.b;
                        intercityDashboardSeatsInteractorImpl$setSeatsCount$1.L$0 = a;
                        intercityDashboardSeatsInteractorImpl$setSeatsCount$1.I$0 = i;
                        intercityDashboardSeatsInteractorImpl$setSeatsCount$1.label = 1;
                        if (a(str, intercityDashboardSeatsInteractorImpl$setSeatsCount$1) == obj3) {
                            return obj3;
                        }
                        i3 = i;
                        yfwVar = a;
                    }
                    return zy11Var;
                }
                if (i2 != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i3 = intercityDashboardSeatsInteractorImpl$setSeatsCount$1.I$0;
                yfwVar = (yfw) intercityDashboardSeatsInteractorImpl$setSeatsCount$1.L$0;
                kotlin.b.b(obj2);
                String str2 = yfwVar.i.a;
                m = ((com.yandex.go.taxi.tariffs.internal.repository.k) this.b).m();
                if (m == null) {
                    Iterator it = m.f().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        lmw0 lmw0Var = (lmw0) obj;
                        if (jl40.l(lmw0Var.getName(), str2) && (lmw0Var instanceof jmw0)) {
                            break;
                        }
                    }
                    if (!(obj instanceof jmw0)) {
                        obj = null;
                    }
                    jmw0Var = (jmw0) obj;
                } else {
                    jmw0Var = null;
                }
                q = jmw0Var != null ? jmw0Var.q(new if70(i3)) : null;
                if (q != null) {
                    b580 u = q5z.u(jmw0Var, Collections.singletonList(q));
                    List list = this.e.a.x;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj4 : list) {
                        if (!jl40.l(((b580) obj4).a, u.a)) {
                            arrayList.add(obj4);
                        }
                    }
                    w3r0.b(this.c, kotlin.collections.a.o0(arrayList, u), null, null, null, 14);
                }
                return zy11Var;
            }
        }
        intercityDashboardSeatsInteractorImpl$setSeatsCount$1 = new IntercityDashboardSeatsInteractorImpl$setSeatsCount$1(this, continuationImpl);
        Object obj22 = intercityDashboardSeatsInteractorImpl$setSeatsCount$1.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = intercityDashboardSeatsInteractorImpl$setSeatsCount$1.label;
        if (i2 != 0) {
        }
        String str22 = yfwVar.i.a;
        m = ((com.yandex.go.taxi.tariffs.internal.repository.k) this.b).m();
        if (m == null) {
        }
        if (jmw0Var != null) {
        }
        if (q != null) {
        }
        return zy11Var;
    }
}
