package com.yandex.go.explorer.impl.data.repositories;

import com.yandex.go.explorer.impl.data.api.ExplorerInternalApi;
import com.yandex.go.explorer.impl.data.models.DiscoveredCellsRequest;
import com.yandex.go.explorer.impl.data.models.DiscoveredCellsResponse;
import defpackage.cmt;
import defpackage.ito;
import defpackage.jst;
import defpackage.kto;
import defpackage.l0o;
import defpackage.lto;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.tse;
import defpackage.wls;
import defpackage.xuo;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.explorer.impl.data.repositories.ExplorerDiscoveredCellRepositoryImpl$syncCellsWithRemote$2", f = "ExplorerDiscoveredCellRepositoryImpl.kt", l = {58, 62, 66, 67}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ExplorerDiscoveredCellRepositoryImpl$syncCellsWithRemote$2 extends SuspendLambda implements wls {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExplorerDiscoveredCellRepositoryImpl$syncCellsWithRemote$2(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ExplorerDiscoveredCellRepositoryImpl$syncCellsWithRemote$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ExplorerDiscoveredCellRepositoryImpl$syncCellsWithRemote$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0171 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0172 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0103 A[Catch: all -> 0x002c, CancellationException -> 0x017b, TryCatch #2 {CancellationException -> 0x017b, all -> 0x002c, blocks: (B:9:0x0028, B:15:0x004b, B:16:0x0149, B:23:0x005e, B:25:0x00e6, B:26:0x00fd, B:28:0x0103, B:30:0x0116, B:32:0x012b, B:35:0x0131, B:40:0x006b, B:42:0x00a9, B:47:0x0076), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0147  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        a aVar;
        long longValue;
        Object d;
        Object c;
        a aVar2;
        List list;
        ArrayList arrayList;
        a aVar3;
        long j;
        Object c2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                aVar = this.this$0;
                xuo xuoVar = aVar.c;
                longValue = ((Number) xuoVar.a.getValue(xuoVar, xuo.b[0])).longValue();
                cmt<DiscoveredCellsResponse> a = ((ExplorerInternalApi) aVar.b.a.getValue()).a(new DiscoveredCellsRequest(longValue));
                this.L$0 = aVar;
                this.J$0 = longValue;
                this.label = 1;
                d = ru.yandex.taxi.network.api.a.d(a, this);
                if (d == coroutineSingletons) {
                }
            } else if (i == 1) {
                longValue = this.J$0;
                aVar = (a) this.L$0;
                kotlin.b.b(obj);
                d = obj;
            } else {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return zy11Var;
                    }
                    j = this.J$0;
                    aVar3 = (a) this.L$0;
                    kotlin.b.b(obj);
                    kto ktoVar = aVar3.a;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.J$0 = j;
                    this.label = 4;
                    c2 = androidx.room.util.a.c(new l0o(18), ktoVar.a, this, false, true);
                    if (c2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        c2 = zy11Var;
                    }
                    return c2 != coroutineSingletons ? coroutineSingletons : zy11Var;
                }
                longValue = this.J$0;
                list = (List) this.L$2;
                aVar2 = (a) this.L$0;
                kotlin.b.b(obj);
                c = obj;
                Set N0 = kotlin.collections.a.N0((Iterable) c);
                List<ito> list2 = list;
                arrayList = new ArrayList(tcc.n(list2, 10));
                for (ito itoVar : list2) {
                    if (N0.contains(new Long(itoVar.a))) {
                        itoVar = new ito(itoVar.a, itoVar.b, itoVar.c, true);
                    }
                    arrayList.add(itoVar);
                }
                this.L$0 = aVar2;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.J$0 = longValue;
                this.label = 3;
                if (aVar2.b(arrayList, this) == coroutineSingletons) {
                    aVar3 = aVar2;
                    j = longValue;
                    kto ktoVar2 = aVar3.a;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.J$0 = j;
                    this.label = 4;
                    c2 = androidx.room.util.a.c(new l0o(18), ktoVar2.a, this, false, true);
                    if (c2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    }
                    if (c2 != coroutineSingletons) {
                    }
                }
            }
            DiscoveredCellsResponse discoveredCellsResponse = (DiscoveredCellsResponse) d;
            xuo xuoVar2 = aVar.c;
            xuoVar2.a.setValue(xuoVar2, xuo.b[0], Long.valueOf(discoveredCellsResponse.b));
            lto ltoVar = aVar.d;
            List list3 = discoveredCellsResponse.a;
            ltoVar.getClass();
            ArrayList a2 = lto.a(list3);
            kto ktoVar3 = aVar.a;
            this.L$0 = aVar;
            this.L$1 = null;
            this.L$2 = a2;
            this.J$0 = longValue;
            this.label = 2;
            c = androidx.room.util.a.c(new l0o(16), ktoVar3.a, this, true, false);
            if (c != coroutineSingletons) {
                aVar2 = aVar;
                list = a2;
                Set N02 = kotlin.collections.a.N0((Iterable) c);
                List<ito> list22 = list;
                arrayList = new ArrayList(tcc.n(list22, 10));
                while (r2.hasNext()) {
                }
                this.L$0 = aVar2;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.J$0 = longValue;
                this.label = 3;
                if (aVar2.b(arrayList, this) == coroutineSingletons) {
                }
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            jst.e.k(th, "Failed to sync discovered cells with remote");
            return zy11Var;
        }
    }
}
