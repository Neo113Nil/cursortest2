package com.yandex.go.suggest.impl.data.flex.variables;

import com.yandex.go.suggest.impl.data.flex.actions.UpdateSearchSectionsStateAction;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.suggest.impl.data.flex.variables.SuperappSuggestSectionsStateRepository$updateSearchSectionsState$1", f = "SuperappSuggestSectionsStateRepository.kt", l = {74}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class SuperappSuggestSectionsStateRepository$updateSearchSectionsState$1 extends SuspendLambda implements wls {
    final /* synthetic */ List<UpdateSearchSectionsStateAction.QuerySectionInfo> $sections;
    Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperappSuggestSectionsStateRepository$updateSearchSectionsState$1(b bVar, List list, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$sections = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuperappSuggestSectionsStateRepository$updateSearchSectionsState$1(this.this$0, this.$sections, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SuperappSuggestSectionsStateRepository$updateSearchSectionsState$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            return zy11Var;
        }
        kotlin.b.b(obj);
        JSONObject c = this.this$0.c();
        for (UpdateSearchSectionsStateAction.QuerySectionInfo querySectionInfo : this.$sections) {
            if (c.has(querySectionInfo.a)) {
                c.getJSONObject(querySectionInfo.a).put("loading_state", "loaded");
            }
        }
        b bVar = this.this$0;
        List<UpdateSearchSectionsStateAction.QuerySectionInfo> list = this.$sections;
        bVar.getClass();
        for (UpdateSearchSectionsStateAction.QuerySectionInfo querySectionInfo2 : list) {
            bVar.e.put(querySectionInfo2.a, querySectionInfo2);
        }
        b bVar2 = this.this$0;
        this.L$0 = null;
        this.label = 1;
        b.a(bVar2, c);
        return zy11Var == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
