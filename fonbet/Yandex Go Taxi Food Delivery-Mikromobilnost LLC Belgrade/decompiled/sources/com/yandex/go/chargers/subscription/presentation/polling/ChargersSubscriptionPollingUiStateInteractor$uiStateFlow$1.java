package com.yandex.go.chargers.subscription.presentation.polling;

import com.yandex.go.chargers.error.api.ChargersErrorCode;
import com.yandex.go.chargers.subscription.domain.model.ChargersPollingRetriesExceededException;
import defpackage.cy9;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tua;
import defpackage.uua;
import defpackage.vl9;
import defpackage.vua;
import defpackage.w511;
import defpackage.wl9;
import defpackage.xl9;
import defpackage.xua;
import defpackage.yl9;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lyl9;", "activeSubscriptions", "Lru/yandex/taxi/theme/ThemeType;", "<unused var>", "Lwua;", "<anonymous>", "(Lyl9;Lru/yandex/taxi/theme/ThemeType;)Lwua;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.subscription.presentation.polling.ChargersSubscriptionPollingUiStateInteractor$uiStateFlow$1", f = "ChargersSubscriptionPollingUiStateInteractor.kt", l = {33, 39, 42}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersSubscriptionPollingUiStateInteractor$uiStateFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ xua this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersSubscriptionPollingUiStateInteractor$uiStateFlow$1(xua xuaVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = xuaVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ChargersSubscriptionPollingUiStateInteractor$uiStateFlow$1 chargersSubscriptionPollingUiStateInteractor$uiStateFlow$1 = new ChargersSubscriptionPollingUiStateInteractor$uiStateFlow$1(this.this$0, (Continuation) obj3);
        chargersSubscriptionPollingUiStateInteractor$uiStateFlow$1.L$0 = (yl9) obj;
        return chargersSubscriptionPollingUiStateInteractor$uiStateFlow$1.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0040, code lost:
    
        if (r10 == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005f, code lost:
    
        if (r10 == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0098, code lost:
    
        if (r10 == r1) goto L33;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        yl9 yl9Var = (yl9) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return new uua((CharSequence) obj);
            }
            if (i == 2) {
                kotlin.b.b(obj);
                return new vua((CharSequence) obj);
            }
            if (i == 3) {
                kotlin.b.b(obj);
                return new tua((cy9) obj);
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (yl9Var instanceof xl9) {
            ru.yandex.taxi.widget.c cVar = this.this$0.b;
            FormattedText formattedText = ((xl9) yl9Var).a;
            this.L$0 = null;
            this.label = 1;
            obj = ru.yandex.taxi.widget.c.i(cVar, formattedText, null, this, 30);
        } else if (yl9Var instanceof vl9) {
            ru.yandex.taxi.widget.c cVar2 = this.this$0.b;
            FormattedText formattedText2 = ((vl9) yl9Var).a;
            this.L$0 = null;
            this.label = 2;
            obj = ru.yandex.taxi.widget.c.i(cVar2, formattedText2, null, this, 30);
        } else {
            if (!(yl9Var instanceof wl9)) {
                w511.b();
                return null;
            }
            xua xuaVar = this.this$0;
            Throwable th = ((wl9) yl9Var).a;
            this.L$0 = null;
            this.label = 3;
            if (th instanceof ChargersPollingRetriesExceededException) {
                xuaVar.getClass();
                obj = new cy9(14, ChargersErrorCode.SUBSCRIPTION_POLLING_FAILURE.getStringValue(), null, null, null);
            } else {
                obj = xuaVar.c.a(th, this);
            }
        }
        return coroutineSingletons;
    }
}
