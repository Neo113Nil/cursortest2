package com.yandex.messaging.domain.folders;

import com.yandex.messaging.core.net.entities.BackendConfig;
import com.yandex.messaging.core.net.entities.FoldersConfig;
import defpackage.clb1;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.t4r;
import defpackage.tcc;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/yandex/messaging/core/net/entities/BackendConfig;", ConfigConstants.CONFIG, "", "currentOrgId", "", "Lt4r;", "<anonymous>", "(Lcom/yandex/messaging/core/net/entities/BackendConfig;J)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.domain.folders.GetFolderAllFiltersUseCase$run$1", f = "GetFolderAllFiltersUseCase.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class GetFolderAllFiltersUseCase$run$1 extends SuspendLambda implements zls {
    /* synthetic */ long J$0;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetFolderAllFiltersUseCase$run$1(g gVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = gVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long longValue = ((Number) obj2).longValue();
        GetFolderAllFiltersUseCase$run$1 getFolderAllFiltersUseCase$run$1 = new GetFolderAllFiltersUseCase$run$1(this.this$0, (Continuation) obj3);
        getFolderAllFiltersUseCase$run$1.L$0 = (BackendConfig) obj;
        getFolderAllFiltersUseCase$run$1.J$0 = longValue;
        return getFolderAllFiltersUseCase$run$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        BackendConfig backendConfig = (BackendConfig) this.L$0;
        long j = this.J$0;
        List<String> filtersList = backendConfig.getFolders().getFiltersList();
        ArrayList arrayList = new ArrayList();
        for (String str : filtersList) {
            FoldersConfig.Filter filter = backendConfig.getFolders().getFilters().get(str);
            Pair pair = filter != null ? new Pair(str, filter) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        g gVar = this.this$0;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!jl40.l((String) ((Pair) next).getFirst(), "telemost") || !clb1.d(gVar.d)) {
                arrayList2.add(next);
            }
        }
        g gVar2 = this.this$0;
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            boolean l = jl40.l((String) ((Pair) next2).getFirst(), FoldersConfig.SUPPORT_FILTER_ID);
            boolean z = gVar2.e.c;
            boolean z2 = j == 0;
            if (!l || (z && z2)) {
                arrayList3.add(next2);
            }
        }
        g gVar3 = this.this$0;
        ArrayList arrayList4 = new ArrayList(tcc.n(arrayList3, 10));
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            Pair pair2 = (Pair) it3.next();
            String str2 = (String) pair2.getFirst();
            FoldersConfig.Filter filter2 = (FoldersConfig.Filter) pair2.getSecond();
            arrayList4.add(new t4r(str2, gVar3.c.a(filter2), com.yandex.messaging.internal.images.b.f(filter2.getAvatarUrl())));
        }
        return arrayList4;
    }
}
