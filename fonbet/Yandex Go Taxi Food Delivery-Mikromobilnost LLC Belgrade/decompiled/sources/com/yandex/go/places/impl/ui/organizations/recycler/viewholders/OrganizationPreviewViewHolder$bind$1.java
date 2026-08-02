package com.yandex.go.places.impl.ui.organizations.recycler.viewholders;

import com.yandex.go.places.impl.ui.common.compression_resistant.CompressionResistantListComponent;
import defpackage.a65;
import defpackage.kwd;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.so80;
import defpackage.tse;
import defpackage.wls;
import defpackage.zo31;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.impl.ui.organizations.recycler.viewholders.OrganizationPreviewViewHolder$bind$1", f = "OrganizationPreviewViewHolder.kt", l = {91, HProv.PP_HASHOID}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class OrganizationPreviewViewHolder$bind$1 extends SuspendLambda implements wls {
    final /* synthetic */ a65 $data;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrganizationPreviewViewHolder$bind$1(b bVar, a65 a65Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$data = a65Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrganizationPreviewViewHolder$bind$1(this.this$0, this.$data, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrganizationPreviewViewHolder$bind$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0057, code lost:
    
        if (com.yandex.go.places.impl.ui.organizations.recycler.viewholders.b.c0(r7, r1, r2, r6) == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0059, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003a, code lost:
    
        if (com.yandex.go.places.impl.ui.organizations.recycler.viewholders.b.c0(r7, r1, r5, r6) == r0) goto L22;
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
            b bVar = this.this$0;
            int i2 = b.f0;
            CompressionResistantListComponent compressionResistantListComponent = ((so80) ((zo31) bVar.R)).h;
            kwd kwdVar = this.$data.d;
            List list = kwdVar != null ? kwdVar.a : null;
            this.label = 1;
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
        b bVar2 = this.this$0;
        int i3 = b.f0;
        CompressionResistantListComponent compressionResistantListComponent2 = ((so80) ((zo31) bVar2.R)).e;
        kwd kwdVar2 = this.$data.e;
        List list2 = kwdVar2 != null ? kwdVar2.a : null;
        this.label = 2;
    }
}
