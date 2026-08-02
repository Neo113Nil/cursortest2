package com.yandex.go.navigator.driving;

import com.yandex.go.address.models.Address;
import defpackage.db50;
import defpackage.dms;
import defpackage.mvg;
import defpackage.ne50;
import defpackage.ny61;
import defpackage.pe50;
import defpackage.zjm;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\f\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lzts;", "gasStations", "Lhpv;", "incidents", "Lcf50;", "shareRoutes", "Ldb50;", "buttonConfig", "Lkotlin/Triple;", "", "", "Ldme;", "<anonymous>", "(Lzts;Lhpv;Lcf50;Ldb50;)Lkotlin/Triple;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.driving.DrivingModalContentRepository$buttonsExperimentsFlow$1", f = "DrivingModalContentRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class DrivingModalContentRepository$buttonsExperimentsFlow$1 extends SuspendLambda implements dms {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ zjm this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrivingModalContentRepository$buttonsExperimentsFlow$1(zjm zjmVar, Continuation continuation) {
        super(5, continuation);
        this.this$0 = zjmVar;
    }

    @Override // defpackage.dms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        DrivingModalContentRepository$buttonsExperimentsFlow$1 drivingModalContentRepository$buttonsExperimentsFlow$1 = new DrivingModalContentRepository$buttonsExperimentsFlow$1(this.this$0, (Continuation) obj5);
        drivingModalContentRepository$buttonsExperimentsFlow$1.L$0 = (db50) obj4;
        return drivingModalContentRepository$buttonsExperimentsFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list;
        ne50 ne50Var;
        Address address;
        db50 db50Var = (db50) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        String str = null;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        pe50 c = this.this$0.e.c();
        if (c != null && (list = c.b) != null && (ne50Var = (ne50) kotlin.collections.a.b0(list)) != null && (address = ne50Var.c) != null) {
            String d = address.d();
            str = d.length() == 0 ? address.D1() : d;
        }
        return new Triple(str, db50Var.b, db50Var.c);
    }
}
