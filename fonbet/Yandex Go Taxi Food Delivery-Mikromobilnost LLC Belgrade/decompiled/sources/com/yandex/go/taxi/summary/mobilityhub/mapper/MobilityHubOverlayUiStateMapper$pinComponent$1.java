package com.yandex.go.taxi.summary.mobilityhub.mapper;

import android.content.Context;
import com.yandex.go.pin.api.v2.PinV2Component;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.h1c0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/yandex/go/pin/api/v2/PinV2Component;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.taxi.summary.mobilityhub.mapper.MobilityHubOverlayUiStateMapper$pinComponent$1", f = "MobilityHubOverlayUiStateMapper.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SODA_DE_DE_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class MobilityHubOverlayUiStateMapper$pinComponent$1 extends SuspendLambda implements tls {
    final /* synthetic */ ru.yandex.taxi.design.utils.b $shadowBgRepository;
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MobilityHubOverlayUiStateMapper$pinComponent$1(a aVar, ru.yandex.taxi.design.utils.b bVar, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
        this.$shadowBgRepository = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new MobilityHubOverlayUiStateMapper$pinComponent$1(this.this$0, this.$shadowBgRepository, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((MobilityHubOverlayUiStateMapper$pinComponent$1) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Context context;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Context context2 = this.this$0.a;
            ru.yandex.taxi.design.utils.b bVar = this.$shadowBgRepository;
            this.L$0 = context2;
            this.label = 1;
            Object c = bVar.c(this);
            if (c == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj = c;
            context = context2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            context = (Context) this.L$0;
            kotlin.b.b(obj);
        }
        return new PinV2Component(context, (h1c0) obj);
    }
}
