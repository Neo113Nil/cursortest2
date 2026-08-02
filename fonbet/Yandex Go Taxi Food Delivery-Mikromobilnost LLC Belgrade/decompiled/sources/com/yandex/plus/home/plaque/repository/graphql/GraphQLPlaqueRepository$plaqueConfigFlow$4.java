package com.yandex.plus.home.plaque.repository.graphql;

import defpackage.dvw;
import defpackage.hkc0;
import defpackage.j18;
import defpackage.llc0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.plc0;
import defpackage.wls;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062&\u0010\u0005\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lkotlin/Triple;", "Lplc0;", "", "", "", "<destruct>", "Lhkc0;", "<anonymous>", "(Lkotlin/Triple;)Lhkc0;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.home.plaque.repository.graphql.GraphQLPlaqueRepository$plaqueConfigFlow$4", f = "GraphQLPlaqueRepository.kt", l = {80, 80, HProv.ALG_SID_NO_HASH, MSException.ERROR_INVALID_PASSWORD, 90, 338}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class GraphQLPlaqueRepository$plaqueConfigFlow$4 extends SuspendLambda implements wls {
    int I$0;
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    boolean Z$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GraphQLPlaqueRepository$plaqueConfigFlow$4(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        GraphQLPlaqueRepository$plaqueConfigFlow$4 graphQLPlaqueRepository$plaqueConfigFlow$4 = new GraphQLPlaqueRepository$plaqueConfigFlow$4(this.this$0, continuation);
        graphQLPlaqueRepository$plaqueConfigFlow$4.L$0 = obj;
        return graphQLPlaqueRepository$plaqueConfigFlow$4;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GraphQLPlaqueRepository$plaqueConfigFlow$4) create((Triple) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0131, code lost:
    
        if (r10 == r1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0158, code lost:
    
        if (r10 == r1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00f3, code lost:
    
        if (r10 == r1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0110, code lost:
    
        if (r10 == r1) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0117 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d1  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        plc0 plc0Var;
        Map map;
        boolean booleanValue;
        Map map2;
        com.yandex.plus.home.plaque.plugin.internal.defaults.b bVar;
        Map map3;
        plc0 plc0Var2;
        hkc0 hkc0Var;
        Triple triple = (Triple) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (this.label) {
            case 0:
                kotlin.b.b(obj);
                plc0Var = (plc0) triple.getFirst();
                map = (Map) triple.getSecond();
                booleanValue = ((Boolean) triple.getThird()).booleanValue();
                if (plc0Var == null) {
                    a aVar = this.this$0;
                    com.yandex.plus.home.plaque.plugin.internal.defaults.b bVar2 = aVar.d;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = map;
                    this.L$3 = bVar2;
                    this.Z$0 = booleanValue;
                    this.label = 1;
                    obj = a.g(aVar, this);
                    if (obj != coroutineSingletons) {
                        map2 = map;
                        bVar = bVar2;
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = map2;
                        this.L$3 = null;
                        this.Z$0 = booleanValue;
                        this.label = 2;
                        obj = bVar.b((llc0) obj, this);
                        if (obj != coroutineSingletons) {
                            map = map2;
                            plc0Var = (plc0) obj;
                        }
                    }
                    return coroutineSingletons;
                }
                map3 = map;
                plc0Var2 = plc0Var;
                if (plc0Var2 != null) {
                    a aVar2 = this.this$0;
                    if (!booleanValue) {
                        b bVar3 = aVar2.t;
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = map3;
                        this.L$3 = plc0Var2;
                        this.L$4 = null;
                        this.Z$0 = booleanValue;
                        this.I$0 = 0;
                        this.label = 4;
                        obj = bVar3.l(plc0Var2, map3, this);
                        break;
                    } else {
                        b bVar4 = aVar2.t;
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = map3;
                        this.L$3 = plc0Var2;
                        this.L$4 = null;
                        this.Z$0 = booleanValue;
                        this.I$0 = 0;
                        this.label = 3;
                        obj = bVar4.i(plc0Var2, map3, this);
                        break;
                    }
                    return coroutineSingletons;
                }
                if (!booleanValue) {
                    b bVar5 = this.this$0.t;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.Z$0 = booleanValue;
                    this.label = 5;
                    obj = bVar5.j(plc0Var2, map3, this);
                    break;
                } else {
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.Z$0 = booleanValue;
                    this.I$0 = 0;
                    this.label = 6;
                    j18 j18Var = new j18(1, dvw.b(this));
                    j18Var.u();
                    obj = j18Var.s();
                    break;
                }
                return coroutineSingletons;
            case 1:
                booleanValue = this.Z$0;
                bVar = (com.yandex.plus.home.plaque.plugin.internal.defaults.b) this.L$3;
                map2 = (Map) this.L$2;
                kotlin.b.b(obj);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = map2;
                this.L$3 = null;
                this.Z$0 = booleanValue;
                this.label = 2;
                obj = bVar.b((llc0) obj, this);
                if (obj != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 2:
                booleanValue = this.Z$0;
                map = (Map) this.L$2;
                kotlin.b.b(obj);
                plc0Var = (plc0) obj;
                map3 = map;
                plc0Var2 = plc0Var;
                if (plc0Var2 != null) {
                }
                if (!booleanValue) {
                }
                return coroutineSingletons;
            case 3:
                booleanValue = this.Z$0;
                plc0Var2 = (plc0) this.L$3;
                map3 = (Map) this.L$2;
                kotlin.b.b(obj);
                hkc0Var = (hkc0) obj;
                if (hkc0Var != null) {
                    return hkc0Var;
                }
                if (!booleanValue) {
                }
                return coroutineSingletons;
            case 4:
                booleanValue = this.Z$0;
                plc0Var2 = (plc0) this.L$3;
                map3 = (Map) this.L$2;
                kotlin.b.b(obj);
                hkc0Var = (hkc0) obj;
                if (hkc0Var != null) {
                }
                if (!booleanValue) {
                }
                return coroutineSingletons;
            case 5:
                kotlin.b.b(obj);
                return (hkc0) obj;
            case 6:
                kotlin.b.b(obj);
                return (hkc0) obj;
            default:
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
