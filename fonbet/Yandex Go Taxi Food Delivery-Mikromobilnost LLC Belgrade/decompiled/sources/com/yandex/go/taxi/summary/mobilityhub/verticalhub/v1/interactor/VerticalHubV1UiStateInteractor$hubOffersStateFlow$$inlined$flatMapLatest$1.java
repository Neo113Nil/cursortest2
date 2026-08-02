package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.interactor;

import com.yandex.go.taxi.summary.mobilityhub.mapper.d;
import com.yandex.go.taxi.summary.mobilityhub.model.OffersErrorReason;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.ui.ErrorButtonAction;
import defpackage.avj0;
import defpackage.d0v;
import defpackage.g92;
import defpackage.jl40;
import defpackage.ku60;
import defpackage.kyh0;
import defpackage.lu60;
import defpackage.mu60;
import defpackage.mvg;
import defpackage.nu60;
import defpackage.ny61;
import defpackage.ou60;
import defpackage.sc31;
import defpackage.vpr;
import defpackage.w511;
import defpackage.wb31;
import defpackage.z9o;
import defpackage.zls;
import defpackage.zrm;
import defpackage.zuj0;
import defpackage.zy11;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.interactor.VerticalHubV1UiStateInteractor$hubOffersStateFlow$$inlined$flatMapLatest$1", f = "VerticalHubV1UiStateInteractor.kt", l = {216, 189}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
public final class VerticalHubV1UiStateInteractor$hubOffersStateFlow$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerticalHubV1UiStateInteractor$hubOffersStateFlow$$inlined$flatMapLatest$1(c cVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = cVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        VerticalHubV1UiStateInteractor$hubOffersStateFlow$$inlined$flatMapLatest$1 verticalHubV1UiStateInteractor$hubOffersStateFlow$$inlined$flatMapLatest$1 = new VerticalHubV1UiStateInteractor$hubOffersStateFlow$$inlined$flatMapLatest$1(this.this$0, (Continuation) obj3);
        verticalHubV1UiStateInteractor$hubOffersStateFlow$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        verticalHubV1UiStateInteractor$hubOffersStateFlow$$inlined$flatMapLatest$1.L$1 = obj2;
        return verticalHubV1UiStateInteractor$hubOffersStateFlow$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x011f, code lost:
    
        if (kotlinx.coroutines.flow.e.u((defpackage.tpr) r13, r0, r12) == r2) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0121, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
    
        if (r13 == r2) goto L40;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ErrorButtonAction errorButtonAction;
        Object g92Var;
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ou60 ou60Var = (ou60) obj2;
            if (ou60Var instanceof lu60) {
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = vprVar;
                this.L$3 = null;
                this.L$4 = null;
                this.label = 1;
                obj = c.a(this.this$0, (lu60) ou60Var, this);
            } else {
                if (ou60Var instanceof mu60) {
                    c cVar = this.this$0;
                    mu60 mu60Var = (mu60) ou60Var;
                    cVar.getClass();
                    ArrayList arrayList = new ArrayList(8);
                    for (int i2 = 0; i2 < 8; i2++) {
                        arrayList.add(d0v.a);
                    }
                    g92Var = new b(cVar.k.b(mu60Var.a), arrayList);
                } else {
                    boolean l = jl40.l(ou60Var, ku60.a);
                    int i3 = 10;
                    EmptyList emptyList = EmptyList.a;
                    if (l) {
                        avj0 avj0Var = (avj0) this.this$0.h.g;
                        g92Var = new g92(2, new sc31(emptyList, null, new z9o(avj0Var.h(kyh0.mt_select_destination_address), avj0Var.h(kyh0.mt_will_show_routes), new zrm(i3, avj0Var.h(kyh0.mt_routes_button_to_addresses), ErrorButtonAction.OPEN_ADDRESS_SELECTOR))));
                    } else {
                        if (!(ou60Var instanceof nu60)) {
                            w511.b();
                            return null;
                        }
                        d dVar = this.this$0.h;
                        OffersErrorReason offersErrorReason = ((nu60) ou60Var).a;
                        zuj0 zuj0Var = dVar.g;
                        int i4 = wb31.a[offersErrorReason.ordinal()];
                        if (i4 == 1) {
                            errorButtonAction = ErrorButtonAction.REFRESH_TRANSPORT_ROUTES;
                        } else if (i4 == 2) {
                            errorButtonAction = ErrorButtonAction.REFRESH_ROUTESTATS;
                        } else {
                            if (i4 != 3) {
                                w511.b();
                                return null;
                            }
                            errorButtonAction = ErrorButtonAction.REFRESH;
                        }
                        avj0 avj0Var2 = (avj0) zuj0Var;
                        g92Var = new g92(2, new sc31(emptyList, null, new z9o(avj0Var2.h(kyh0.mt_routes_loading_error), avj0Var2.h(kyh0.mt_try_later), new zrm(i3, avj0Var2.h(kyh0.try_again), errorButtonAction))));
                    }
                }
                obj = g92Var;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vprVar = (vpr) this.L$2;
            kotlin.b.b(obj);
        }
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.L$4 = null;
        this.label = 2;
    }
}
