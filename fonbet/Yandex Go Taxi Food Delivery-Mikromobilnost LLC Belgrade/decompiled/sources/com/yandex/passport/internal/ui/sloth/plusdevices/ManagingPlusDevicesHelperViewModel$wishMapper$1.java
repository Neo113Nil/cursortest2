package com.yandex.passport.internal.ui.sloth.plusdevices;

import com.yandex.passport.internal.properties.ManagingPlusDevicesPropertiesImpl;
import defpackage.ds31;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.ui.sloth.plusdevices.ManagingPlusDevicesHelperViewModel$wishMapper$1", f = "ManagingPlusDevicesHelperViewModel.kt", l = {34}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ManagingPlusDevicesHelperViewModel$wishMapper$1 extends SuspendLambda implements wls {
    final /* synthetic */ l $wish;
    int label;
    final /* synthetic */ m this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManagingPlusDevicesHelperViewModel$wishMapper$1(l lVar, m mVar, Continuation continuation) {
        super(2, continuation);
        this.$wish = lVar;
        this.this$0 = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ManagingPlusDevicesHelperViewModel$wishMapper$1(this.$wish, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ManagingPlusDevicesHelperViewModel$wishMapper$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            l lVar = this.$wish;
            if (lVar instanceof j) {
                m mVar = this.this$0;
                ManagingPlusDevicesPropertiesImpl managingPlusDevicesPropertiesImpl = ((j) lVar).a;
                this.label = 1;
                if (m.W(mVar, managingPlusDevicesPropertiesImpl, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (!(lVar instanceof k)) {
                    w511.b();
                    return null;
                }
                m mVar2 = this.this$0;
                k kVar = (k) lVar;
                boolean z = kVar.a;
                ManagingPlusDevicesPropertiesImpl managingPlusDevicesPropertiesImpl2 = kVar.b;
                mVar2.getClass();
                tje.N(ds31.a(mVar2), null, null, new ManagingPlusDevicesHelperViewModel$tryAddPlusDevice$1(mVar2, managingPlusDevicesPropertiesImpl2, z, null), 3);
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
