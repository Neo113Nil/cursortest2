package com.yandex.go.places.impl.ui.organizations.recycler.viewholders;

import com.yandex.go.places.impl.ui.common.compression_resistant.CompressionResistantListComponent;
import defpackage.b65;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.to80;
import defpackage.tse;
import defpackage.wls;
import defpackage.zo31;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.impl.ui.organizations.recycler.viewholders.OrganizationPreviewV2ViewHolder$bind$1", f = "OrganizationPreviewV2ViewHolder.kt", l = {111}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class OrganizationPreviewV2ViewHolder$bind$1 extends SuspendLambda implements wls {
    final /* synthetic */ b65 $data;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrganizationPreviewV2ViewHolder$bind$1(a aVar, b65 b65Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$data = b65Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrganizationPreviewV2ViewHolder$bind$1(this.this$0, this.$data, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrganizationPreviewV2ViewHolder$bind$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            a aVar = this.this$0;
            int i2 = a.h0;
            CompressionResistantListComponent compressionResistantListComponent = ((to80) ((zo31) aVar.R)).n;
            List list = this.$data.d;
            this.label = 1;
            if (a.c0(aVar, compressionResistantListComponent, list, this) == coroutineSingletons) {
                return coroutineSingletons;
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
