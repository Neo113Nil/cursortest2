package com.yandex.messaging.chat.attachments;

import defpackage.dvw;
import defpackage.j18;
import defpackage.lc3;
import defpackage.mc3;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.t2r;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Ltse;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.chat.attachments.AttachmentsUploader$uploadFiles$$inlined$disposableCoroutineWrapper$1", f = "AttachmentsUploader.kt", l = {113}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class AttachmentsUploader$uploadFiles$$inlined$disposableCoroutineWrapper$1 extends SuspendLambda implements wls {
    final /* synthetic */ List $uploadRequests$inlined;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AttachmentsUploader$uploadFiles$$inlined$disposableCoroutineWrapper$1(Continuation continuation, b bVar, List list) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$uploadRequests$inlined = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AttachmentsUploader$uploadFiles$$inlined$disposableCoroutineWrapper$1 attachmentsUploader$uploadFiles$$inlined$disposableCoroutineWrapper$1 = new AttachmentsUploader$uploadFiles$$inlined$disposableCoroutineWrapper$1(continuation, this.this$0, this.$uploadRequests$inlined);
        attachmentsUploader$uploadFiles$$inlined$disposableCoroutineWrapper$1.L$0 = obj;
        return attachmentsUploader$uploadFiles$$inlined$disposableCoroutineWrapper$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AttachmentsUploader$uploadFiles$$inlined$disposableCoroutineWrapper$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            return obj;
        }
        kotlin.b.b(obj);
        tse tseVar = (tse) this.L$0;
        this.L$0 = tseVar;
        this.label = 1;
        j18 j18Var = new j18(1, dvw.b(this));
        j18Var.u();
        t2r t2rVar = (t2r) this.this$0.a.get();
        List list = this.$uploadRequests$inlined;
        int i2 = 0;
        mc3 mc3Var = new mc3(j18Var, i2);
        t2rVar.getClass();
        j18Var.w(new lc3(tseVar, t2rVar.c(list.iterator(), new ArrayList(), mc3Var), i2));
        Object s = j18Var.s();
        return s == coroutineSingletons ? coroutineSingletons : s;
    }
}
