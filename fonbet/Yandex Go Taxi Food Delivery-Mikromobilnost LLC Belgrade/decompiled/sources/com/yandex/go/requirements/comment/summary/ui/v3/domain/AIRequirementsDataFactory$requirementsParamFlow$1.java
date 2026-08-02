package com.yandex.go.requirements.comment.summary.ui.v3.domain;

import androidx.media3.exoplayer.offline.DownloadService;
import com.yandex.go.zone.model.Zone;
import defpackage.a1;
import defpackage.kmx0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rpj0;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.requirements.models.net.RequirementsParam;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/yandex/go/zone/model/Zone;", "zone", "", "Lb580;", DownloadService.KEY_REQUIREMENTS, "Lkmx0;", "<anonymous>", "(Lcom/yandex/go/zone/model/Zone;Ljava/util/List;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.requirements.comment.summary.ui.v3.domain.AIRequirementsDataFactory$requirementsParamFlow$1", f = "AIRequirementsDataFactory.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class AIRequirementsDataFactory$requirementsParamFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ s this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AIRequirementsDataFactory$requirementsParamFlow$1(s sVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = sVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        AIRequirementsDataFactory$requirementsParamFlow$1 aIRequirementsDataFactory$requirementsParamFlow$1 = new AIRequirementsDataFactory$requirementsParamFlow$1(this.this$0, (Continuation) obj3);
        aIRequirementsDataFactory$requirementsParamFlow$1.L$0 = (Zone) obj;
        aIRequirementsDataFactory$requirementsParamFlow$1.L$1 = (List) obj2;
        return aIRequirementsDataFactory$requirementsParamFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Zone zone = (Zone) this.L$0;
        List list = (List) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        LinkedHashMap c = this.this$0.d.c(zone, list);
        ArrayList arrayList = new ArrayList(c.size());
        for (Map.Entry entry : c.entrySet()) {
            String str = (String) entry.getKey();
            List list2 = (List) entry.getValue();
            RequirementsParam.Companion.getClass();
            arrayList.add(new kmx0(str, rpj0.a(null, list2)));
        }
        return kotlin.collections.a.x0(arrayList, new a1());
    }
}
