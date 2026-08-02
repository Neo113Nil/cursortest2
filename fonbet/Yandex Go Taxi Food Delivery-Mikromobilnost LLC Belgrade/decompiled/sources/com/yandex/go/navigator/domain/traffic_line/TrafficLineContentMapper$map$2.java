package com.yandex.go.navigator.domain.traffic_line;

import com.yandex.mapkit.navigation.JamSegment;
import com.yandex.mapkit.navigation.JamType;
import defpackage.f4x;
import defpackage.h901;
import defpackage.kj1;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.scc;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lh901;", "<anonymous>", "(Ltse;)Lh901;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.domain.traffic_line.TrafficLineContentMapper$map$2", f = "TrafficLineContentMapper.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class TrafficLineContentMapper$map$2 extends SuspendLambda implements wls {
    final /* synthetic */ List<JamSegment> $jamSegments;
    final /* synthetic */ int $preferredSegmentsCount;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrafficLineContentMapper$map$2(a aVar, List list, int i, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$jamSegments = list;
        this.$preferredSegmentsCount = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TrafficLineContentMapper$map$2(this.this$0, this.$jamSegments, this.$preferredSegmentsCount, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TrafficLineContentMapper$map$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List<kj1> list;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        f4x f4xVar = this.this$0.a;
        List<JamSegment> list2 = this.$jamSegments;
        int i = this.$preferredSegmentsCount;
        f4xVar.getClass();
        if (list2.size() <= 1) {
            JamSegment jamSegment = (JamSegment) kotlin.collections.a.R(list2);
            if (jamSegment == null) {
                jamSegment = new JamSegment(JamType.UNKNOWN, 0.0d);
            }
            list = Collections.singletonList(new kj1(jamSegment, 1.0f));
        } else {
            float size = 1.0f / (list2.size() - 1);
            ArrayList arrayList = new ArrayList();
            JamSegment jamSegment2 = list2.get(0);
            float f = 0.0f;
            for (JamSegment jamSegment3 : list2.subList(1, list2.size())) {
                if (jamSegment3.getJamType() == jamSegment2.getJamType()) {
                    f += size;
                } else {
                    arrayList.add(new kj1(jamSegment2, f));
                    f = size;
                    jamSegment2 = jamSegment3;
                }
            }
            arrayList.add(new kj1(jamSegment2, f));
            if (arrayList.size() > i) {
                ArrayList arrayList2 = new ArrayList();
                int i2 = 0;
                while (i2 < 21) {
                    float min = Math.min(1.0f, ((float) Math.pow(2.0d, i2)) * size);
                    int i3 = 0;
                    while (i3 < arrayList.size()) {
                        arrayList2.add(arrayList.get(i3));
                        if (((kj1) arrayList.get(i3)).b >= min) {
                            i3++;
                        } else {
                            boolean z = scc.f(arrayList2) > 0;
                            boolean z2 = i3 < scc.f(arrayList);
                            if (z && z2) {
                                int i4 = i3 + 1;
                                if (((kj1) arrayList.get(i4)).b < ((kj1) arrayList2.get(scc.f(arrayList2) - 1)).b) {
                                    z = false;
                                } else {
                                    z2 = false;
                                }
                                kj1 kj1Var = (kj1) kotlin.collections.a.Z(arrayList2);
                                if (z2) {
                                    kj1Var.a((kj1) arrayList.get(i4));
                                    i3 = i4;
                                } else if (z) {
                                    ((kj1) arrayList2.get(scc.f(arrayList2) - 1)).a(kj1Var);
                                    arrayList2.remove(scc.f(arrayList2));
                                }
                            }
                            i3++;
                        }
                    }
                    if (arrayList2.size() < i) {
                        list = arrayList2;
                        break;
                    }
                    arrayList2.clear();
                    i2++;
                    arrayList = arrayList2;
                }
            }
            list = arrayList;
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        float f2 = 0.0f;
        for (kj1 kj1Var2 : list) {
            arrayList3.add(new Integer(a.a(this.this$0, kj1Var2.a)));
            arrayList4.add(new Float(f2));
            f2 += kj1Var2.b;
            float nextAfter = Math.nextAfter(f2, Double.NEGATIVE_INFINITY);
            arrayList3.add(new Integer(a.a(this.this$0, kj1Var2.a)));
            arrayList4.add(new Float(nextAfter));
        }
        return new h901(kotlin.collections.a.I0(arrayList3), kotlin.collections.a.G0(arrayList4));
    }
}
