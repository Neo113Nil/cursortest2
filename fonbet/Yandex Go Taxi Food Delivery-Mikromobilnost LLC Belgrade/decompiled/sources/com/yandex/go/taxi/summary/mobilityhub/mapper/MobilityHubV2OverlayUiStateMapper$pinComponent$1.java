package com.yandex.go.taxi.summary.mobilityhub.mapper;

import android.graphics.drawable.Drawable;
import com.yandex.go.pin.api.v2.PinV2Component;
import defpackage.h1c0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tls;
import defpackage.yyg0;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/yandex/go/pin/api/v2/PinV2Component;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.taxi.summary.mobilityhub.mapper.MobilityHubV2OverlayUiStateMapper$pinComponent$1", f = "MobilityHubV2OverlayUiStateMapper.kt", l = {72}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class MobilityHubV2OverlayUiStateMapper$pinComponent$1 extends SuspendLambda implements tls {
    Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MobilityHubV2OverlayUiStateMapper$pinComponent$1(b bVar, Continuation continuation) {
        super(1, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new MobilityHubV2OverlayUiStateMapper$pinComponent$1(this.this$0, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((MobilityHubV2OverlayUiStateMapper$pinComponent$1) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Drawable drawable;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Drawable y = tje.y(yyg0.address_select_empty_bg, this.this$0.a);
            ru.yandex.taxi.design.utils.b bVar = this.this$0.c;
            this.L$0 = y;
            this.label = 1;
            Object b = bVar.b(this);
            if (b == coroutineSingletons) {
                return coroutineSingletons;
            }
            drawable = y;
            obj = b;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            drawable = (Drawable) this.L$0;
            kotlin.b.b(obj);
        }
        return new PinV2Component(this.this$0.a, new h1c0((List) obj, drawable, drawable));
    }
}
