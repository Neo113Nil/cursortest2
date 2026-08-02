package com.yandex.go.chargers.order.preparing;

import com.yandex.go.chargers.api.ChargersActiveOrderStatus;
import defpackage.avj0;
import defpackage.jda;
import defpackage.kda;
import defpackage.kyh0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.taa;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/yandex/taxi/theme/ThemeType;", "<unused var>", "Ltaa;", "order", "Ljda;", "<anonymous>", "(Lru/yandex/taxi/theme/ThemeType;Ltaa;)Ljda;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.order.preparing.ChargersOrderPreparingUiStateInteractor$uiStateFlow$3", f = "ChargersOrderPreparingUiStateInteractor.kt", l = {34}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersOrderPreparingUiStateInteractor$uiStateFlow$3 extends SuspendLambda implements zls {
    int I$0;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ kda this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersOrderPreparingUiStateInteractor$uiStateFlow$3(kda kdaVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = kdaVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ChargersOrderPreparingUiStateInteractor$uiStateFlow$3 chargersOrderPreparingUiStateInteractor$uiStateFlow$3 = new ChargersOrderPreparingUiStateInteractor$uiStateFlow$3(this.this$0, (Continuation) obj3);
        chargersOrderPreparingUiStateInteractor$uiStateFlow$3.L$0 = (taa) obj2;
        return chargersOrderPreparingUiStateInteractor$uiStateFlow$3.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x006d  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CharSequence h;
        int i;
        taa taaVar = (taa) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            kotlin.b.b(obj);
            ChargersActiveOrderStatus b = taaVar.b();
            ChargersActiveOrderStatus chargersActiveOrderStatus = ChargersActiveOrderStatus.LEASING;
            int i3 = b.compareTo(chargersActiveOrderStatus) < 0 ? 1 : 0;
            if (i3 == 0) {
                int i4 = i3;
                h = taaVar.b() == chargersActiveOrderStatus ? ((avj0) this.this$0.b).h(kyh0.chargers_order_preparing_leasing_status_text) : "";
                i = i4;
                return new jda(i != 0, h, taaVar.b());
            }
            ru.yandex.taxi.widget.c cVar = this.this$0.d;
            FormattedText d = taaVar.d();
            this.L$0 = taaVar;
            this.I$0 = i3;
            this.label = 1;
            Object e = ru.yandex.taxi.widget.c.e(cVar, d, null, false, this, 30);
            if (e == coroutineSingletons) {
                return coroutineSingletons;
            }
            int i5 = i3;
            obj = e;
            i = i5;
        } else {
            if (i2 != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.I$0;
            kotlin.b.b(obj);
        }
        h = (CharSequence) obj;
        return new jda(i != 0, h, taaVar.b());
    }
}
