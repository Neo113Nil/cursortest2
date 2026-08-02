package com.yandex.go.taxi.summary.mobilityhub.interactor;

import defpackage.bf31;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oa31;
import defpackage.pb31;
import defpackage.scc;
import defpackage.tcc;
import defpackage.za31;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00000\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "Lza31;", "verticals", "", "", "verticalsVisibility", "Lob31;", "<anonymous>", "(Ljava/util/List;Ljava/util/Map;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.summary.mobilityhub.interactor.MobilityHubVerticalsUiStateInteractor$uiStateFlow$1", f = "MobilityHubVerticalsUiStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class MobilityHubVerticalsUiStateInteractor$uiStateFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ m this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MobilityHubVerticalsUiStateInteractor$uiStateFlow$1(m mVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = mVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        MobilityHubVerticalsUiStateInteractor$uiStateFlow$1 mobilityHubVerticalsUiStateInteractor$uiStateFlow$1 = new MobilityHubVerticalsUiStateInteractor$uiStateFlow$1(this.this$0, (Continuation) obj3);
        mobilityHubVerticalsUiStateInteractor$uiStateFlow$1.L$0 = (List) obj;
        mobilityHubVerticalsUiStateInteractor$uiStateFlow$1.L$1 = (Map) obj2;
        return mobilityHubVerticalsUiStateInteractor$uiStateFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        boolean z;
        List list = (List) this.L$0;
        Map map = (Map) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        m mVar = this.this$0;
        mVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (!((za31) obj2).a.o) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            oa31 oa31Var = ((za31) it.next()).a;
            arrayList2.add(new bf31(oa31Var.a, oa31Var.d));
        }
        Iterator it2 = arrayList2.iterator();
        int i = 0;
        while (true) {
            if (!it2.hasNext()) {
                i = -1;
                break;
            }
            if (jl40.l(((bf31) it2.next()).a, mVar.a)) {
                break;
            }
            i++;
        }
        Integer valueOf = Integer.valueOf(i);
        if (i == -1) {
            valueOf = null;
        }
        if (valueOf == null) {
            return EmptyList.a;
        }
        int intValue = valueOf.intValue();
        ArrayList arrayList3 = new ArrayList(tcc.n(arrayList2, 10));
        Iterator it3 = arrayList2.iterator();
        int i2 = 0;
        while (it3.hasNext()) {
            Object next = it3.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                scc.m();
                throw null;
            }
            bf31 bf31Var = (bf31) next;
            int i4 = i2;
            pb31 pb31Var = mVar.d;
            String str2 = bf31Var.a;
            String str3 = bf31Var.b;
            if (i4 == intValue) {
                z = true;
                str = str3;
            } else {
                str = str3;
                z = false;
            }
            arrayList3.add(pb31Var.a(str2, str, z, map, arrayList2));
            i2 = i3;
        }
        return arrayList3;
    }
}
