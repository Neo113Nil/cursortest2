package com.yandex.go.clarify_address.before_order;

import com.yandex.go.clarify_address.AddressClarificationReason;
import com.yandex.go.clarify_address.before_order.a;
import com.yandex.go.clarify_address.before_order.b;
import defpackage.mvg;
import defpackage.mzb;
import defpackage.ny61;
import defpackage.sls;
import defpackage.tse;
import defpackage.wls;
import defpackage.x880;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.preorder.source.domain.u;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.clarify_address.before_order.ClarifySourceAddressBeforeOrderPart$execute$1", f = "ClarifySourceAddressBeforeOrderPart.kt", l = {27, 28}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ClarifySourceAddressBeforeOrderPart$execute$1 extends SuspendLambda implements wls {
    final /* synthetic */ x880 $chainCallback;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClarifySourceAddressBeforeOrderPart$execute$1(b bVar, x880 x880Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$chainCallback = x880Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ClarifySourceAddressBeforeOrderPart$execute$1(this.this$0, this.$chainCallback, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ClarifySourceAddressBeforeOrderPart$execute$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004c, code lost:
    
        if (r8.e(r5, r6, r7) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004e, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002a, code lost:
    
        if (r8 == r0) goto L17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [ozb] */
    /* JADX WARN: Type inference failed for: r6v1, types: [ozb] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        final int i2 = 1;
        if (i == 0) {
            kotlin.b.b(obj);
            mzb mzbVar = this.this$0.b;
            this.label = 1;
            obj = ((a) mzbVar).e(this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        final b bVar = this.this$0;
        if (booleanValue) {
            u uVar = bVar.c;
            final x880 x880Var = this.$chainCallback;
            final int i3 = 0;
            ?? r5 = new sls() { // from class: ozb
                @Override // defpackage.sls
                public final Object invoke() {
                    int i4 = i3;
                    zy11 zy11Var = zy11.a;
                    x880 x880Var2 = x880Var;
                    b bVar2 = bVar;
                    switch (i4) {
                        case 0:
                            ((a) bVar2.b).b.c = true;
                            ((com.yandex.go.clarify_address.a) bVar2.d).c(true, AddressClarificationReason.Map);
                            x880Var2.n();
                            break;
                        default:
                            ((a) bVar2.b).b.c = false;
                            x880Var2.o();
                            break;
                    }
                    return zy11Var;
                }
            };
            ?? r6 = new sls() { // from class: ozb
                @Override // defpackage.sls
                public final Object invoke() {
                    int i4 = i2;
                    zy11 zy11Var = zy11.a;
                    x880 x880Var2 = x880Var;
                    b bVar2 = bVar;
                    switch (i4) {
                        case 0:
                            ((a) bVar2.b).b.c = true;
                            ((com.yandex.go.clarify_address.a) bVar2.d).c(true, AddressClarificationReason.Map);
                            x880Var2.n();
                            break;
                        default:
                            ((a) bVar2.b).b.c = false;
                            x880Var2.o();
                            break;
                    }
                    return zy11Var;
                }
            };
            this.label = 2;
        } else {
            x880 x880Var2 = this.$chainCallback;
            ((com.yandex.go.clarify_address.a) bVar.d).c(true, AddressClarificationReason.Map);
            x880Var2.n();
        }
        return zy11.a;
    }
}
