package com.yandex.go.places.models.data.mappers;

import com.yandex.go.places.models.data.entities.network.ActionDto$ShareActionDto;
import com.yandex.go.places.models.data.entities.network.ImageDto;
import defpackage.k7v;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.xq;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lxq;", "<anonymous>", "(Ltse;)Lxq;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.models.data.mappers.ActionMapper$convertShareAction$2", f = "ActionMapper.kt", l = {HProv.PP_SECURITY_LEVEL}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ActionMapper$convertShareAction$2 extends SuspendLambda implements wls {
    final /* synthetic */ ActionDto$ShareActionDto $dto;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActionMapper$convertShareAction$2(ActionDto$ShareActionDto actionDto$ShareActionDto, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$dto = actionDto$ShareActionDto;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ActionMapper$convertShareAction$2 actionMapper$convertShareAction$2 = new ActionMapper$convertShareAction$2(this.$dto, this.this$0, continuation);
        actionMapper$convertShareAction$2.L$0 = obj;
        return actionMapper$convertShareAction$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ActionMapper$convertShareAction$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        k7v k7vVar = null;
        if (i == 0) {
            kotlin.b.b(obj);
            ImageDto imageDto = this.$dto.d;
            qoh h = imageDto != null ? tje.h(tseVar, null, null, new ActionMapper$convertShareAction$2$possibleImage$1$1(this.this$0, imageDto, null), 3) : null;
            ActionDto$ShareActionDto actionDto$ShareActionDto = this.$dto;
            str = actionDto$ShareActionDto.a;
            str2 = actionDto$ShareActionDto.b;
            str3 = actionDto$ShareActionDto.c;
            if (h != null) {
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = str;
                this.L$3 = str2;
                this.L$4 = str3;
                this.label = 1;
                obj = h.s(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                str4 = str2;
            }
            return new xq(str, str2, str3, k7vVar);
        }
        if (i != 1) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        str3 = (String) this.L$4;
        str4 = (String) this.L$3;
        str = (String) this.L$2;
        kotlin.b.b(obj);
        k7vVar = (k7v) obj;
        str2 = str4;
        return new xq(str, str2, str3, k7vVar);
    }
}
