package com.ybsdk.feature.qr.payments.internal.screens.presentation;

import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.navigation.cicerone.Screen;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.qr.payments.api.QrPaymentsSecondFactorScreenProvider$Request;
import defpackage.e8g0;
import defpackage.e9g0;
import defpackage.gdf0;
import defpackage.job1;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qag0;
import defpackage.rbv;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.qr.payments.internal.screens.presentation.QrPaymentsMainViewModel$onAuthorizationRequired$1", f = "QrPaymentsMainViewModel.kt", l = {398}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class QrPaymentsMainViewModel$onAuthorizationRequired$1 extends SuspendLambda implements wls {
    final /* synthetic */ QrPaymentsSecondFactorScreenProvider$Request $request;
    final /* synthetic */ e9g0 $resultScreenState;
    final /* synthetic */ String $trackId;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QrPaymentsMainViewModel$onAuthorizationRequired$1(b bVar, e9g0 e9g0Var, String str, QrPaymentsSecondFactorScreenProvider$Request qrPaymentsSecondFactorScreenProvider$Request, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$resultScreenState = e9g0Var;
        this.$trackId = str;
        this.$request = qrPaymentsSecondFactorScreenProvider$Request;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new QrPaymentsMainViewModel$onAuthorizationRequired$1(this.this$0, this.$resultScreenState, this.$trackId, this.$request, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((QrPaymentsMainViewModel$onAuthorizationRequired$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            qag0 qag0Var = this.this$0.F;
            Text.Empty empty = Text.Empty.INSTANCE;
            ThemedImageUrlEntity cornerImage = this.$resultScreenState.d.getCornerImage();
            rbv f = cornerImage != null ? job1.f(cornerImage, new gdf0(26)) : null;
            String str = this.$trackId;
            QrPaymentsSecondFactorScreenProvider$Request qrPaymentsSecondFactorScreenProvider$Request = this.$request;
            this.label = 1;
            obj = ((e8g0) qag0Var).b(f, empty, str, qrPaymentsSecondFactorScreenProvider$Request);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        this.this$0.C.h((Screen) obj);
        return zy11.a;
    }
}
