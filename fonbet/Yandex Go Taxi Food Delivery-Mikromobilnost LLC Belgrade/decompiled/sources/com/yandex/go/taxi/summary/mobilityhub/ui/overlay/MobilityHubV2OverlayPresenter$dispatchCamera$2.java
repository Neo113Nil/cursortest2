package com.yandex.go.taxi.summary.mobilityhub.ui.overlay;

import com.yandex.go.address.models.Address;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.repository.HubContentState;
import defpackage.cwa1;
import defpackage.d0l0;
import defpackage.dms;
import defpackage.ew20;
import defpackage.fi6;
import defpackage.fw20;
import defpackage.gh00;
import defpackage.j73;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.w511;
import defpackage.zy11;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Ld0l0;", "route", "Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/repository/HubContentState;", "hubContentState", "", "mapMovedByUser", "Lcom/yandex/mapkit/ScreenRect;", "<unused var>", "Lzy11;", "<anonymous>", "(Ld0l0;Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/repository/HubContentState;ZLcom/yandex/mapkit/ScreenRect;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.summary.mobilityhub.ui.overlay.MobilityHubV2OverlayPresenter$dispatchCamera$2", f = "MobilityHubV2OverlayPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class MobilityHubV2OverlayPresenter$dispatchCamera$2 extends SuspendLambda implements dms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ fw20 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MobilityHubV2OverlayPresenter$dispatchCamera$2(fw20 fw20Var, Continuation continuation) {
        super(5, continuation);
        this.this$0 = fw20Var;
    }

    @Override // defpackage.dms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        MobilityHubV2OverlayPresenter$dispatchCamera$2 mobilityHubV2OverlayPresenter$dispatchCamera$2 = new MobilityHubV2OverlayPresenter$dispatchCamera$2(this.this$0, (Continuation) obj5);
        mobilityHubV2OverlayPresenter$dispatchCamera$2.L$0 = (d0l0) obj;
        mobilityHubV2OverlayPresenter$dispatchCamera$2.L$1 = (HubContentState) obj2;
        mobilityHubV2OverlayPresenter$dispatchCamera$2.Z$0 = booleanValue;
        zy11 zy11Var = zy11.a;
        mobilityHubV2OverlayPresenter$dispatchCamera$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzs zzsVar;
        List A;
        d0l0 d0l0Var = (d0l0) this.L$0;
        HubContentState hubContentState = (HubContentState) this.L$1;
        boolean z = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (!z) {
            fw20 fw20Var = this.this$0;
            Address h = d0l0Var.h();
            zzs B = h != null ? h.B() : null;
            int i = ew20.a[hubContentState.ordinal()];
            if (i != 1) {
                if (i != 2 && i != 3) {
                    w511.b();
                    return null;
                }
                Address b = d0l0Var.b();
                if (b != null) {
                    zzsVar = b.B();
                    fw20Var.getClass();
                    A = j73.A(new zzs[]{B, zzsVar});
                    if (A.isEmpty()) {
                        A = null;
                    }
                    if (A != null) {
                        fi6 fi6Var = new fi6();
                        ArrayList arrayList = new ArrayList(tcc.n(A, 10));
                        Iterator it = A.iterator();
                        while (it.hasNext()) {
                            arrayList.add(cwa1.d((zzs) it.next()));
                        }
                        fi6Var.e(arrayList);
                        ((gh00) fw20Var.y).A(fi6Var.g(), null);
                    }
                }
            }
            zzsVar = null;
            fw20Var.getClass();
            A = j73.A(new zzs[]{B, zzsVar});
            if (A.isEmpty()) {
            }
            if (A != null) {
            }
        }
        return zy11.a;
    }
}
