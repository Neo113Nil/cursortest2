package com.ybsdk.feature.transfer.version2.internal.screens.phone;

import com.ybsdk.core.transfer.utils.TransferScenario;
import defpackage.in01;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.r8j0;
import defpackage.s8j0;
import defpackage.t8j0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.yandex.video.m3.data.exception.network.NetworkRequestException;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.transfer.version2.internal.screens.phone.TransferPhoneInputViewModel$loadContacts$1", f = "TransferPhoneInputViewModel.kt", l = {NetworkRequestException.REGIONAL_RESTRICTION}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class TransferPhoneInputViewModel$loadContacts$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferPhoneInputViewModel$loadContacts$1(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TransferPhoneInputViewModel$loadContacts$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TransferPhoneInputViewModel$loadContacts$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        r0 r0Var;
        Object value;
        Object obj2;
        r0 r0Var2;
        Object value2;
        r0 r0Var3;
        Object value3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            pz40 Y = this.this$0.Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
            } while (!r0Var.k(value, in01.a((in01) value, null, new t8j0(), null, null, null, null, null, null, null, null, 8189)));
            boolean z = this.this$0.G.getScenario() != TransferScenario.CROSS_BORDER;
            com.ybsdk.core.transfer.utils.domain.a aVar = this.this$0.B;
            this.label = 1;
            Object a = aVar.a(z, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj2 = a;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            obj2 = ((Result) obj).getValue();
        }
        c cVar = this.this$0;
        Throwable a2 = Result.a(obj2);
        if (a2 != null) {
            pz40 Y2 = cVar.Y();
            do {
                r0Var3 = (r0) Y2;
                value3 = r0Var3.getValue();
            } while (!r0Var3.k(value3, in01.a((in01) value3, null, new s8j0(a2), null, null, null, null, null, null, PhonePlaceholder.PHONE_ONLY, null, 7933)));
        }
        c cVar2 = this.this$0;
        if (!(obj2 instanceof Result.Failure)) {
            List list = (List) obj2;
            pz40 Y3 = cVar2.Y();
            do {
                r0Var2 = (r0) Y3;
                value2 = r0Var2.getValue();
            } while (!r0Var2.k(value2, in01.a((in01) value2, null, new r8j0(list, null, 14), null, null, null, null, null, null, PhonePlaceholder.PHONE_OR_CONTACT, null, 7933)));
        }
        return zy11.a;
    }
}
