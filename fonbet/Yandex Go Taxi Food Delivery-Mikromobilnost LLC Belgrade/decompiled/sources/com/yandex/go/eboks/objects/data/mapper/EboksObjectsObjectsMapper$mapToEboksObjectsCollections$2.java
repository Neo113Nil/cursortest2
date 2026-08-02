package com.yandex.go.eboks.objects.data.mapper;

import com.yandex.go.eboks.objects.data.model.EboksObjectsDto;
import com.yandex.go.eboks.objects.data.model.EboksObjectsResponse;
import com.yandex.go.eboks.objects.data.model.EboksRowanDto;
import defpackage.jl40;
import defpackage.kin;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rhn;
import defpackage.tse;
import defpackage.vj00;
import defpackage.wls;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lkin;", "<anonymous>", "(Ltse;)Lkin;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.eboks.objects.data.mapper.EboksObjectsObjectsMapper$mapToEboksObjectsCollections$2", f = "EboksObjectsObjectsMapper.kt", l = {60, 67}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class EboksObjectsObjectsMapper$mapToEboksObjectsCollections$2 extends SuspendLambda implements wls {
    final /* synthetic */ EboksObjectsResponse $eboksObjectsResponse;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EboksObjectsObjectsMapper$mapToEboksObjectsCollections$2(a aVar, EboksObjectsResponse eboksObjectsResponse, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$eboksObjectsResponse = eboksObjectsResponse;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        EboksObjectsObjectsMapper$mapToEboksObjectsCollections$2 eboksObjectsObjectsMapper$mapToEboksObjectsCollections$2 = new EboksObjectsObjectsMapper$mapToEboksObjectsCollections$2(this.this$0, this.$eboksObjectsResponse, continuation);
        eboksObjectsObjectsMapper$mapToEboksObjectsCollections$2.L$0 = obj;
        return eboksObjectsObjectsMapper$mapToEboksObjectsCollections$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((EboksObjectsObjectsMapper$mapToEboksObjectsCollections$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0082, code lost:
    
        if (r8 == r1) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00aa, code lost:
    
        if (r8 == r1) goto L57;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.List] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        List list;
        ?? r3;
        String str;
        Object obj2;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        vj00 vj00Var = null;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return new kin((List) obj, null);
            }
            if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            List list2 = (List) obj;
            EboksObjectsDto eboksObjectsDto = this.$eboksObjectsResponse.a;
            if (eboksObjectsDto != null && (str = eboksObjectsDto.b) != null) {
                Iterator it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Iterator it2 = ((rhn) it.next()).b.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it2.next();
                        if (jl40.l(((vj00) obj2).getId(), str)) {
                            break;
                        }
                    }
                    vj00 vj00Var2 = (vj00) obj2;
                    if (vj00Var2 != null) {
                        vj00Var = vj00Var2;
                        break;
                    }
                }
            }
            return new kin(list2, vj00Var);
        }
        kotlin.b.b(obj);
        this.this$0.h.b();
        EboksObjectsDto eboksObjectsDto2 = this.$eboksObjectsResponse.a;
        List list3 = eboksObjectsDto2 != null ? eboksObjectsDto2.c : null;
        EmptyList emptyList = EmptyList.a;
        if (list3 == null || list3.isEmpty()) {
            EboksRowanDto eboksRowanDto = this.$eboksObjectsResponse.b;
            List list4 = eboksRowanDto != null ? eboksRowanDto.b : null;
            if (list4 == null || list4.isEmpty()) {
                return new kin(emptyList, null);
            }
        }
        EboksRowanDto eboksRowanDto2 = this.$eboksObjectsResponse.b;
        List list5 = eboksRowanDto2 != null ? eboksRowanDto2.b : null;
        if (list5 == null || list5.isEmpty()) {
            a aVar = this.this$0;
            EboksObjectsDto eboksObjectsDto3 = this.$eboksObjectsResponse.a;
            if (eboksObjectsDto3 == null || (list = eboksObjectsDto3.a) == null) {
                list = emptyList;
            }
            if (eboksObjectsDto3 != null && (r3 = eboksObjectsDto3.c) != 0) {
                emptyList = r3;
            }
            this.L$0 = null;
            this.label = 2;
            obj = a.a(aVar, tseVar, list, emptyList, this);
        } else {
            a aVar2 = this.this$0;
            EboksRowanDto eboksRowanDto3 = this.$eboksObjectsResponse.b;
            ?? r6 = eboksRowanDto3.a;
            if (r6 != 0) {
                emptyList = r6;
            }
            List list6 = eboksRowanDto3.b;
            this.L$0 = null;
            this.label = 1;
            obj = a.b(aVar2, tseVar, emptyList, list6, this);
        }
        return coroutineSingletons;
    }
}
