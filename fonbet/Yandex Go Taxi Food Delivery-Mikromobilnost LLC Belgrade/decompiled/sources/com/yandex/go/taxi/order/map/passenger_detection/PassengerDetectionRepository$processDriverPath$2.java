package com.yandex.go.taxi.order.map.passenger_detection;

import com.yandex.go.taxi.order.experiments.TaxiTravelerPassengerGpsExperiment;
import defpackage.jo0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.scc;
import defpackage.sk90;
import defpackage.tk90;
import defpackage.tse;
import defpackage.uk90;
import defpackage.vh10;
import defpackage.vk90;
import defpackage.wls;
import defpackage.x4e;
import defpackage.ycc;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.map.passenger_detection.PassengerDetectionRepository$processDriverPath$2", f = "PassengerDetectionRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class PassengerDetectionRepository$processDriverPath$2 extends SuspendLambda implements wls {
    final /* synthetic */ List<sk90> $driverTrack;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PassengerDetectionRepository$processDriverPath$2(a aVar, List list, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$driverTrack = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PassengerDetectionRepository$processDriverPath$2(this.this$0, this.$driverTrack, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        PassengerDetectionRepository$processDriverPath$2 passengerDetectionRepository$processDriverPath$2 = (PassengerDetectionRepository$processDriverPath$2) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        passengerDetectionRepository$processDriverPath$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x012e, code lost:
    
        if (r7 < (2 * r23)) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01d6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01fb A[SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        Throwable th;
        Triple triple;
        Object next;
        long j;
        long j2;
        sk90 sk90Var;
        List list;
        int i;
        Pair pair;
        sk90 sk90Var2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        TaxiTravelerPassengerGpsExperiment a = this.this$0.a();
        TaxiTravelerPassengerGpsExperiment.Companion.getClass();
        boolean equals = a.equals(TaxiTravelerPassengerGpsExperiment.g);
        zy11 zy11Var = zy11.a;
        if (!equals && this.this$0.a.p()) {
            this.this$0.g.addAll(this.$driverTrack);
            if (!this.this$0.f.isEmpty()) {
                a aVar = this.this$0;
                ArrayList arrayList2 = aVar.g;
                ArrayList arrayList3 = aVar.h;
                long currentTimeMillis = System.currentTimeMillis() - TimeUnit.SECONDS.toMillis(aVar.a().c);
                ArrayList arrayList4 = aVar.f;
                ycc.w(arrayList4, new vh10(currentTimeMillis, 17), true);
                if (!arrayList4.isEmpty() && !arrayList2.isEmpty()) {
                    long j3 = aVar.a().d;
                    List x0 = kotlin.collections.a.x0(arrayList2, new vk90());
                    List x02 = kotlin.collections.a.x0(arrayList4, new uk90());
                    Iterator it = x0.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            arrayList = arrayList2;
                            th = null;
                            triple = null;
                            break;
                        }
                        sk90 sk90Var3 = (sk90) it.next();
                        if (x02.isEmpty()) {
                            arrayList = arrayList2;
                            j2 = j3;
                            sk90Var2 = 0;
                            th = null;
                        } else {
                            long j4 = sk90Var3.d;
                            List list2 = x02;
                            Iterator it2 = list2.iterator();
                            if (it2.hasNext()) {
                                next = it2.next();
                                if (it2.hasNext()) {
                                    th = null;
                                    j = j4;
                                    long abs = Math.abs(((sk90) next).d - j);
                                    while (true) {
                                        Object next2 = it2.next();
                                        j2 = j3;
                                        long abs2 = Math.abs(((sk90) next2).d - j);
                                        if (abs > abs2) {
                                            next = next2;
                                            abs = abs2;
                                        }
                                        if (!it2.hasNext()) {
                                            break;
                                        }
                                        j3 = j2;
                                    }
                                    sk90Var = (sk90) next;
                                    sk90 sk90Var4 = sk90Var;
                                    if (sk90Var == null) {
                                        List x03 = kotlin.collections.a.x0(list2, new tk90());
                                        if (x03.size() == 1) {
                                            sk90 sk90Var5 = (sk90) x03.get(0);
                                            long abs3 = Math.abs(sk90Var5.d - j);
                                            sk90Var4 = sk90Var5;
                                        } else {
                                            int size = x03.size() - 1;
                                            int i2 = 0;
                                            while (i2 < size) {
                                                sk90 sk90Var6 = (sk90) x03.get(i2);
                                                int i3 = i2 + 1;
                                                sk90 sk90Var7 = (sk90) x03.get(i3);
                                                long j5 = sk90Var6.d;
                                                if (j5 < j) {
                                                    i = i3;
                                                    long j6 = sk90Var7.d;
                                                    arrayList = arrayList2;
                                                    list = x03;
                                                    if (j < j6) {
                                                        double d = sk90Var6.a;
                                                        double d2 = sk90Var6.b;
                                                        double d3 = sk90Var7.a;
                                                        double d4 = sk90Var7.b;
                                                        if (j5 == j6) {
                                                            if (j == j5) {
                                                                pair = new Pair(Double.valueOf(d), Double.valueOf(d2));
                                                                if (pair == 0) {
                                                                    sk90Var2 = new sk90(((Number) pair.c()).doubleValue(), ((Number) pair.f()).doubleValue(), sk90Var6.c, j);
                                                                    break;
                                                                }
                                                            }
                                                            pair = th;
                                                            if (pair == 0) {
                                                            }
                                                        } else {
                                                            if (j >= j5 && j <= j6) {
                                                                double d5 = (j - j5) / (j6 - j5);
                                                                double a2 = x4e.a(d3, d, d5, d);
                                                                double d6 = d4 - d2;
                                                                if (d6 > 180.0d) {
                                                                    d6 -= 360.0d;
                                                                } else if (d6 < -180.0d) {
                                                                    d6 += 360.0d;
                                                                }
                                                                pair = new Pair(Double.valueOf(a2), Double.valueOf(((((((d5 * d6) + d2) + 180.0d) % 360.0d) + 360.0d) % 360.0d) - 180.0d));
                                                                if (pair == 0) {
                                                                }
                                                            }
                                                            pair = th;
                                                            if (pair == 0) {
                                                            }
                                                        }
                                                    } else {
                                                        continue;
                                                    }
                                                } else {
                                                    arrayList = arrayList2;
                                                    list = x03;
                                                    i = i3;
                                                }
                                                i2 = i;
                                                x03 = list;
                                                arrayList2 = arrayList;
                                            }
                                        }
                                        arrayList = arrayList2;
                                        sk90Var2 = th;
                                    }
                                    arrayList = arrayList2;
                                    sk90Var2 = sk90Var4;
                                } else {
                                    j2 = j3;
                                    j = j4;
                                }
                            } else {
                                j2 = j3;
                                j = j4;
                                next = null;
                            }
                            th = null;
                            sk90Var = (sk90) next;
                            sk90 sk90Var42 = sk90Var;
                            if (sk90Var == null) {
                            }
                            arrayList = arrayList2;
                            sk90Var2 = sk90Var42;
                        }
                        if (sk90Var2 != 0) {
                            arrayList3.add(Float.valueOf(ru.yandex.taxi.map.utils.a.i(sk90Var3.a, sk90Var3.b, sk90Var2.a, sk90Var2.b)));
                            int i4 = aVar.a().e;
                            if (arrayList3.size() > i4) {
                                arrayList3.remove(0);
                            }
                            if (arrayList3.size() >= i4) {
                                Iterator it3 = arrayList3.iterator();
                                double d7 = 0.0d;
                                int i5 = 0;
                                while (it3.hasNext()) {
                                    d7 += ((Number) it3.next()).floatValue();
                                    i5++;
                                    if (i5 < 0) {
                                        scc.l();
                                        throw th;
                                    }
                                }
                                float f = (float) (i5 == 0 ? Double.NaN : d7 / i5);
                                int i6 = aVar.a().f;
                                triple = new Triple(Boolean.valueOf(f <= ((float) i6)), Float.valueOf(f), Integer.valueOf(i6));
                            }
                        }
                        j3 = j2;
                        arrayList2 = arrayList;
                    }
                    if (triple != null) {
                        Boolean bool = (Boolean) triple.f();
                        boolean booleanValue = bool.booleanValue();
                        Float f2 = (Float) triple.g();
                        Integer num = (Integer) triple.h();
                        r0 r0Var = aVar.e;
                        if (booleanValue != ((Boolean) r0Var.getValue()).booleanValue()) {
                            aVar.d.f(new jo0(booleanValue ? "IN_CAR" : "NOT_IN_CAR", f2, num, aVar), "setAndLogState");
                        }
                        r0Var.m(th, bool);
                        arrayList.clear();
                        return zy11Var;
                    }
                    arrayList4.clear();
                    arrayList.clear();
                }
            }
        }
        return zy11Var;
    }
}
