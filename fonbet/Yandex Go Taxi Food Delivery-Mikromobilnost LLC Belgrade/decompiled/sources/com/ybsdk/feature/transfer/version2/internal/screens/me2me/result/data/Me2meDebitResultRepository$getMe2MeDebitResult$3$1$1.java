package com.ybsdk.feature.transfer.version2.internal.screens.me2me.result.data;

import com.ybsdk.core.common.data.network.dto.Themes;
import com.ybsdk.core.common.data.network.dto.WidgetDto;
import com.ybsdk.core.common.data.network.dto.c;
import com.ybsdk.core.common.domain.entities.WidgetEntity;
import com.ybsdk.feature.transfer.version2.internal.network.dto.me2me.Me2MeDebitAutoPullWidgetDto;
import com.ybsdk.feature.transfer.version2.internal.network.dto.me2me.Me2MeDebitResultDto;
import com.ybsdk.feature.transfer.version2.internal.screens.me2me.result.domain.Me2MeDebitResultEntity$Status;
import defpackage.g910;
import defpackage.h910;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.v910;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/me2me/Me2MeDebitResultDto;", "resultDto", "Lkotlin/Result;", "Lh910;", "<anonymous>", "(Lcom/ybsdk/feature/transfer/version2/internal/network/dto/me2me/Me2MeDebitResultDto;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.transfer.version2.internal.screens.me2me.result.data.Me2meDebitResultRepository$getMe2MeDebitResult$3$1$1", f = "Me2meDebitResultRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class Me2meDebitResultRepository$getMe2MeDebitResult$3$1$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        Me2meDebitResultRepository$getMe2MeDebitResult$3$1$1 me2meDebitResultRepository$getMe2MeDebitResult$3$1$1 = new Me2meDebitResultRepository$getMe2MeDebitResult$3$1$1(2, continuation);
        me2meDebitResultRepository$getMe2MeDebitResult$3$1$1.L$0 = obj;
        return me2meDebitResultRepository$getMe2MeDebitResult$3$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((Me2meDebitResultRepository$getMe2MeDebitResult$3$1$1) create((Me2MeDebitResultDto) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Me2MeDebitResultEntity$Status me2MeDebitResultEntity$Status;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        g910 g910Var = null;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        Me2MeDebitResultDto me2MeDebitResultDto = (Me2MeDebitResultDto) this.L$0;
        switch (v910.a[me2MeDebitResultDto.getStatus().ordinal()]) {
            case 1:
                me2MeDebitResultEntity$Status = Me2MeDebitResultEntity$Status.PROCESSING;
                break;
            case 2:
                me2MeDebitResultEntity$Status = Me2MeDebitResultEntity$Status.FAILED;
                break;
            case 3:
                me2MeDebitResultEntity$Status = Me2MeDebitResultEntity$Status.SUCCESS;
                break;
            case 4:
            case 5:
            case 6:
                return new Result(new Result.Failure(new Exception("[Me2m2 debit] Unknown status : " + me2MeDebitResultDto)));
            default:
                w511.b();
                return null;
        }
        String title = me2MeDebitResultDto.getTitle();
        String description = me2MeDebitResultDto.getDescription();
        Me2MeDebitAutoPullWidgetDto widget = me2MeDebitResultDto.getWidget();
        if (widget != null) {
            String title2 = widget.getTitle();
            String description2 = widget.getDescription();
            WidgetDto.Theme light = widget.getThemes().getLight();
            WidgetEntity.Theme a = light != null ? c.a(light) : null;
            WidgetDto.Theme dark = widget.getThemes().getDark();
            g910Var = new g910(title2, description2, new Themes(a, dark != null ? c.a(dark) : null));
        }
        return new Result(new h910(me2MeDebitResultEntity$Status, title, description, g910Var));
    }
}
