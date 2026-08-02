package com.yandex.go.places.complaint.impl.ui.modal;

import com.yandex.go.places.complaint.impl.data.repositories.a;
import defpackage.axc;
import defpackage.mvg;
import defpackage.mxc;
import defpackage.nxc;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.yfa;
import defpackage.zy11;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.complaint.impl.ui.modal.ComplaintPresenter$onComplaintClicked$1", f = "ComplaintPresenter.kt", l = {48}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
public final class ComplaintPresenter$onComplaintClicked$1 extends SuspendLambda implements wls {
    final /* synthetic */ axc $complaintButton;
    final /* synthetic */ mxc $complaintPayload;
    int label;
    final /* synthetic */ nxc this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComplaintPresenter$onComplaintClicked$1(nxc nxcVar, mxc mxcVar, axc axcVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = nxcVar;
        this.$complaintPayload = mxcVar;
        this.$complaintButton = axcVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ComplaintPresenter$onComplaintClicked$1(this.this$0, this.$complaintPayload, this.$complaintButton, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ComplaintPresenter$onComplaintClicked$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            yfa yfaVar = this.this$0.y;
            mxc mxcVar = this.$complaintPayload;
            long j = mxcVar.a;
            String str = mxcVar.b;
            String str2 = mxcVar.c.a;
            String str3 = this.$complaintButton.c;
            this.label = 1;
            yfaVar.getClass();
            if (((a) yfaVar.a).a(UUID.randomUUID().toString(), j, str, str2, str3, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
