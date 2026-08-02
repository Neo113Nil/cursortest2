package com.yandex.go.pickup_from_photo.domain;

import android.net.Uri;
import com.yandex.go.pickup_from_photo.analytics.PhotoPickUpAnalytics$PhotoPickUpButtonName;
import com.yandex.go.pickup_from_photo.analytics.PhotoPickUpAnalytics$PhotoPickUpCloseReason;
import defpackage.a60;
import defpackage.aob0;
import defpackage.apb0;
import defpackage.bjb0;
import defpackage.bnb0;
import defpackage.cpb0;
import defpackage.dpb0;
import defpackage.epb0;
import defpackage.imb0;
import defpackage.jl40;
import defpackage.jmb0;
import defpackage.kmb0;
import defpackage.lmb0;
import defpackage.mmb0;
import defpackage.mvg;
import defpackage.nmb0;
import defpackage.ny61;
import defpackage.omb0;
import defpackage.pmb0;
import defpackage.qmb0;
import defpackage.qu;
import defpackage.rmb0;
import defpackage.smb0;
import defpackage.t71;
import defpackage.tob0;
import defpackage.tse;
import defpackage.vob0;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.pickup_from_photo.domain.CameraScreenActionsInteractor$handleAction$1", f = "CameraScreenActionsInteractor.kt", l = {85}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class CameraScreenActionsInteractor$handleAction$1 extends SuspendLambda implements wls {
    final /* synthetic */ smb0 $action;
    final /* synthetic */ aob0 $navigator;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraScreenActionsInteractor$handleAction$1(smb0 smb0Var, c cVar, aob0 aob0Var, Continuation continuation) {
        super(2, continuation);
        this.$action = smb0Var;
        this.this$0 = cVar;
        this.$navigator = aob0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CameraScreenActionsInteractor$handleAction$1(this.$action, this.this$0, this.$navigator, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CameraScreenActionsInteractor$handleAction$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            smb0 smb0Var = this.$action;
            int i2 = 0;
            if (jl40.l(smb0Var, pmb0.a)) {
                c cVar = this.this$0;
                cVar.c.c = 0;
                bjb0 bjb0Var = cVar.d.c;
                LinkedHashSet linkedHashSet = bjb0Var.b;
                int size = linkedHashSet.size();
                while (i2 < size) {
                    bjb0Var.a(i2).delete();
                    i2++;
                }
                linkedHashSet.clear();
                c cVar2 = this.this$0;
                cVar2.c.a(c.c(cVar2, null, 3));
            } else if (jl40.l(smb0Var, imb0.a)) {
                this.this$0.g.g(PhotoPickUpAnalytics$PhotoPickUpButtonName.Back);
                ((bnb0) this.$navigator).a.r(new qu(9));
                this.this$0.g.f(PhotoPickUpAnalytics$PhotoPickUpCloseReason.Back);
            } else if (jl40.l(smb0Var, rmb0.a)) {
                this.this$0.g.f(PhotoPickUpAnalytics$PhotoPickUpCloseReason.Back);
            } else if (jl40.l(smb0Var, lmb0.a)) {
                ((a60) this.this$0.b).d();
            } else if (jl40.l(smb0Var, mmb0.a)) {
                this.this$0.c.a(vob0.a);
            } else if (jl40.l(smb0Var, qmb0.a)) {
                dpb0 dpb0Var = (dpb0) this.this$0.c.a.getValue();
                tob0 tob0Var = dpb0Var instanceof tob0 ? (tob0) dpb0Var : null;
                Uri uri = tob0Var != null ? tob0Var.c : null;
                epb0 epb0Var = this.this$0.c;
                int i3 = epb0Var.c;
                epb0Var.a(new tob0(i3, i3 < epb0Var.d, uri, false));
            } else if (jl40.l(smb0Var, kmb0.a)) {
                this.this$0.g.g(PhotoPickUpAnalytics$PhotoPickUpButtonName.Flash);
                c cVar3 = this.this$0;
                epb0 epb0Var2 = cVar3.c;
                epb0Var2.b = !epb0Var2.b;
                epb0Var2.a(c.c(cVar3, null, 3));
            } else if (smb0Var instanceof nmb0) {
                this.this$0.g.g(PhotoPickUpAnalytics$PhotoPickUpButtonName.Camera);
                c cVar4 = this.this$0;
                nmb0 nmb0Var = (nmb0) this.$action;
                aob0 aob0Var = this.$navigator;
                this.label = 1;
                if (c.a(cVar4, nmb0Var, aob0Var, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (jl40.l(smb0Var, jmb0.a)) {
                c cVar5 = this.this$0;
                cVar5.c.c = 0;
                bjb0 bjb0Var2 = cVar5.d.c;
                LinkedHashSet linkedHashSet2 = bjb0Var2.b;
                int size2 = linkedHashSet2.size();
                while (i2 < size2) {
                    bjb0Var2.a(i2).delete();
                    i2++;
                }
                linkedHashSet2.clear();
            } else {
                if (!(smb0Var instanceof omb0)) {
                    w511.b();
                    return null;
                }
                c cVar6 = this.this$0;
                omb0 omb0Var = (omb0) this.$action;
                aob0 aob0Var2 = this.$navigator;
                cVar6.c.a(new cpb0(omb0Var.a, apb0.a));
                ((bnb0) aob0Var2).a.r(new t71(omb0Var.a, 11));
                cVar6.g.f(PhotoPickUpAnalytics$PhotoPickUpCloseReason.PointFound);
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
