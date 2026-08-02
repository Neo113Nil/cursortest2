package com.yandex.go.taxi.order.details.v2.state.elements.buttons;

import com.yandex.go.slot.dto.SlotItemDto;
import defpackage.avj0;
import defpackage.irs0;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qrs0;
import defpackage.tse;
import defpackage.wls;
import defpackage.xng0;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcss0;", "<anonymous>", "(Ltse;)Lcss0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.state.elements.buttons.RideCardButtonMapper$map$1$1$body$1", f = "RideCardButtonMapper.kt", l = {HProv.PP_SIGNATUREOID, HProv.PP_DHOID}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardButtonMapper$map$1$1$body$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $buttonType;
    final /* synthetic */ boolean $isEnabled;
    final /* synthetic */ SlotItemDto $slot;
    Object L$0;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardButtonMapper$map$1$1$body$1(f fVar, String str, SlotItemDto slotItemDto, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
        this.$buttonType = str;
        this.$slot = slotItemDto;
        this.$isEnabled = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RideCardButtonMapper$map$1$1$body$1(this.this$0, this.$buttonType, this.$slot, this.$isEnabled, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RideCardButtonMapper$map$1$1$body$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005a, code lost:
    
        if (r8 == r0) goto L22;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            f fVar = this.this$0;
            String str = this.$buttonType;
            SlotItemDto slotItemDto = this.$slot;
            boolean z = this.$isEnabled;
            this.label = 1;
            fVar.getClass();
            if ((jl40.l(str, "already_coming_button") || jl40.l(str, "save_ride_button")) && !z) {
                obj = qrs0.a(((avj0) fVar.g).a.getResources().getResourceEntryName(xng0.textOnControl), slotItemDto.d);
            } else {
                obj = slotItemDto.d;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return obj;
            }
            kotlin.b.b(obj);
        }
        irs0 irs0Var = this.this$0.e;
        this.L$0 = null;
        this.label = 2;
        Object k = ((com.yandex.go.slot.mapper.a) irs0Var).k((List) obj, null, this);
        return k == coroutineSingletons ? coroutineSingletons : k;
    }
}
