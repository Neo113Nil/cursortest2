package com.yandex.go.superapp_carts.domain.loading;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.c231;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pwy;
import defpackage.q3m;
import defpackage.u1m;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import java.util.Arrays;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lkr;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.superapp_carts.domain.loading.SuperappCartLoadingInteractor$createPreviewAndLoadActions$1", f = "SuperappCartLoadingInteractor.kt", l = {44, 46, SystemProfileProtos$SystemProfileProto.ComponentId.SAFETY_TIPS_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class SuperappCartLoadingInteractor$createPreviewAndLoadActions$1 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $shouldShowPreview;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperappCartLoadingInteractor$createPreviewAndLoadActions$1(a aVar, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$shouldShowPreview = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SuperappCartLoadingInteractor$createPreviewAndLoadActions$1 superappCartLoadingInteractor$createPreviewAndLoadActions$1 = new SuperappCartLoadingInteractor$createPreviewAndLoadActions$1(this.this$0, this.$shouldShowPreview, continuation);
        superappCartLoadingInteractor$createPreviewAndLoadActions$1.L$0 = obj;
        return superappCartLoadingInteractor$createPreviewAndLoadActions$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SuperappCartLoadingInteractor$createPreviewAndLoadActions$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0098, code lost:
    
        if (r0.emit(r5, r9) != r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x009a, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005e, code lost:
    
        if (r10 == r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0040, code lost:
    
        if (r10 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0087  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u1m u1mVar;
        q3m q3mVar;
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            a aVar = this.this$0;
            this.L$0 = vprVar;
            this.label = 1;
            obj = a.a(aVar, this);
        } else if (i == 1) {
            kotlin.b.b(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11.a;
            }
            u1mVar = (u1m) this.L$1;
            kotlin.b.b(obj);
            q3mVar = (q3m) obj;
            boolean z = false;
            if (q3mVar != null) {
                Collection collection = q3mVar.b;
                com.yandex.div.core.expression.variables.a aVar2 = this.this$0.d;
                c231[] c231VarArr = (c231[]) collection.toArray(new c231[0]);
                aVar2.i((c231[]) Arrays.copyOf(c231VarArr, c231VarArr.length));
            }
            pwy pwyVar = new pwy(u1mVar, q3mVar == null ? q3mVar.a : null, z, 4);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 3;
        }
        u1mVar = (u1m) obj;
        if (this.$shouldShowPreview) {
            com.yandex.go.superapp_carts.ui.preview.b bVar = (com.yandex.go.superapp_carts.ui.preview.b) this.this$0.c.get();
            this.L$0 = vprVar;
            this.L$1 = u1mVar;
            this.label = 2;
            obj = bVar.a(u1mVar, this);
        } else {
            q3mVar = null;
            boolean z2 = false;
            if (q3mVar != null) {
            }
            pwy pwyVar2 = new pwy(u1mVar, q3mVar == null ? q3mVar.a : null, z2, 4);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 3;
        }
    }
}
