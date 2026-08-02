package com.yandex.go.navigator.domain.jam_forecast;

import com.yandex.mapkit.geometry.Geo;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.navigation.JamSegment;
import com.yandex.mapkit.navigation.JamType;
import defpackage.e4x;
import defpackage.iby;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pwd;
import defpackage.scc;
import defpackage.tcc;
import defpackage.tse;
import defpackage.w8q0;
import defpackage.wls;
import defpackage.x8q0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "Lx8q0;", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.domain.jam_forecast.ComputeSegmentsWithNearestJamInfoUseCase$execute$2", f = "ComputeSegmentsWithNearestJamInfoUseCase.kt", l = {25, 26, 27}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ComputeSegmentsWithNearestJamInfoUseCase$execute$2 extends SuspendLambda implements wls {
    final /* synthetic */ Polyline $polyline;
    final /* synthetic */ List<JamSegment> $segments;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ pwd this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComputeSegmentsWithNearestJamInfoUseCase$execute$2(pwd pwdVar, Polyline polyline, List list, Continuation continuation) {
        super(2, continuation);
        this.this$0 = pwdVar;
        this.$polyline = polyline;
        this.$segments = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ComputeSegmentsWithNearestJamInfoUseCase$execute$2(this.this$0, this.$polyline, this.$segments, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ComputeSegmentsWithNearestJamInfoUseCase$execute$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x0156, code lost:
    
        if (r4 == r1) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00c8, code lost:
    
        if (r2 == r1) goto L74;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v2, types: [e4x] */
    /* JADX WARN: Type inference failed for: r8v7, types: [e4x] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean z;
        Throwable th;
        Object obj2;
        List list;
        ?? arrayList;
        boolean z2;
        Throwable th2;
        Throwable th3;
        ?? r8;
        ArrayList arrayList2;
        List list2;
        Iterator it;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        int i2 = 0;
        boolean z3 = true;
        Throwable th4 = null;
        if (i == 0) {
            b.b(obj);
            pwd pwdVar = this.this$0;
            Polyline polyline = this.$polyline;
            List<JamSegment> list3 = this.$segments;
            this.label = 1;
            pwdVar.getClass();
            if (list3.size() != polyline.getPoints().size() - 1) {
                ny61.g("Failed requirement.");
                return null;
            }
            List<JamSegment> list4 = list3;
            ArrayList arrayList3 = new ArrayList(tcc.n(list4, 10));
            int i3 = 0;
            for (Object obj3 : list4) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    Throwable th5 = th4;
                    scc.m();
                    throw th5;
                }
                JamSegment jamSegment = (JamSegment) obj3;
                kotlinx.coroutines.a.k(get_context());
                double distance = Geo.distance(polyline.getPoints().get(i3), polyline.getPoints().get(i4));
                arrayList3.add(new w8q0(new iby(distance / jamSegment.getSpeed(), distance), jamSegment.getJamType()));
                i3 = i4;
                th4 = th4;
                z3 = z3;
            }
            z = z3;
            th = th4;
            obj2 = arrayList3;
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    return obj;
                }
                list = (List) this.L$0;
                b.b(obj);
                arrayList = obj;
                th = null;
                List list5 = (List) arrayList;
                pwd pwdVar2 = this.this$0;
                Throwable th6 = th;
                this.L$0 = th6;
                this.L$1 = th6;
                this.label = 3;
                pwdVar2.getClass();
                int size = list.size();
                ArrayList arrayList4 = new ArrayList(size);
                int i5 = 0;
                while (i5 < size) {
                    arrayList4.add(th6);
                    i5++;
                    th6 = null;
                }
                Iterator it2 = list5.iterator();
                int i6 = 0;
                while (it2.hasNext()) {
                    e4x e4xVar = (e4x) it2.next();
                    kotlinx.coroutines.a.k(get_context());
                    iby ibyVar = new iby(i2);
                    int i7 = e4xVar.a;
                    iby ibyVar2 = e4xVar.c;
                    int i8 = i7 - 1;
                    if (i6 <= i8) {
                        while (true) {
                            iby ibyVar3 = ((w8q0) list.get(i8)).a;
                            ibyVar.a(ibyVar3);
                            arrayList2 = arrayList4;
                            arrayList2.set(i8, new x8q0(ibyVar3, new iby(ibyVar.a, ibyVar.b), ibyVar2));
                            if (i8 == i6) {
                                break;
                            }
                            i8--;
                            arrayList4 = arrayList2;
                        }
                    } else {
                        arrayList2 = arrayList4;
                    }
                    iby ibyVar4 = new iby(0);
                    int i9 = e4xVar.a;
                    int i10 = e4xVar.b + i9;
                    int i11 = i10 - 1;
                    if (i9 <= i11) {
                        while (true) {
                            iby ibyVar5 = ((w8q0) list.get(i9)).a;
                            list2 = list;
                            it = it2;
                            arrayList2.set(i9, new x8q0(ibyVar5, new iby(ibyVar4.a, ibyVar4.b), ibyVar2));
                            ibyVar4.a -= ibyVar5.a;
                            ibyVar4.b -= ibyVar5.b;
                            if (i9 != i11) {
                                i9++;
                                list = list2;
                                it2 = it;
                            }
                        }
                    } else {
                        list2 = list;
                        it = it2;
                    }
                    list = list2;
                    arrayList4 = arrayList2;
                    i6 = i10;
                    it2 = it;
                    i2 = 0;
                }
                List M = kotlin.collections.a.M(arrayList4);
                return M == coroutineSingletons ? coroutineSingletons : M;
            }
            b.b(obj);
            obj2 = obj;
            z = true;
            th = null;
        }
        list = (List) obj2;
        pwd pwdVar3 = this.this$0;
        this.L$0 = list;
        this.label = 2;
        pwdVar3.getClass();
        arrayList = new ArrayList();
        iby ibyVar6 = new iby(0);
        int i12 = 0;
        ?? r82 = th;
        for (Object obj4 : list) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                scc.m();
                throw th;
            }
            w8q0 w8q0Var = (w8q0) obj4;
            kotlinx.coroutines.a.k(get_context());
            JamType jamType = w8q0Var.b;
            iby ibyVar7 = w8q0Var.a;
            if (jamType == JamType.FREE || jamType == JamType.UNKNOWN) {
                ibyVar6.a(ibyVar7);
                th3 = r82;
                if (ibyVar6.a > 5.0d) {
                    z2 = z;
                    th2 = r82;
                    if (th2 != null && (z2 || i12 == scc.f(list))) {
                        arrayList.add(th2);
                        th2 = th;
                    }
                    i12 = i13;
                    r82 = th2;
                }
            } else {
                if (r82 == 0) {
                    r8 = new e4x(i12, new iby(0));
                } else {
                    r82.c.a(ibyVar6);
                    r8 = r82;
                }
                ibyVar6 = new iby(0);
                r8.c.a(ibyVar7);
                r8.b = (i12 - r8.a) + 1;
                th3 = r8;
            }
            z2 = false;
            th2 = th3;
            if (th2 != null) {
                arrayList.add(th2);
                th2 = th;
            }
            i12 = i13;
            r82 = th2;
        }
    }
}
