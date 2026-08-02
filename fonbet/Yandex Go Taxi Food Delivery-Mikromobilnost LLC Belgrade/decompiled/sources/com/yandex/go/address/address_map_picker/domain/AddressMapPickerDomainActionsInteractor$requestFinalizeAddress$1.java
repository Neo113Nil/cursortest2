package com.yandex.go.address.address_map_picker.domain;

import com.yandex.go.address.address_map_picker.api.AddressMapPickerPointType;
import com.yandex.go.address.address_map_picker.data.AddressMapPickerAddressStateRepository;
import defpackage.atd0;
import defpackage.f11;
import defpackage.i11;
import defpackage.lz0;
import defpackage.mo21;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ooa1;
import defpackage.po21;
import defpackage.tse;
import defpackage.wls;
import defpackage.zls;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.o;
import ru.yandex.taxi.persuggest.api.finalsuggest.Action;
import ru.yandex.taxi.persuggest.api.finalsuggest.PositionInitAction;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.address.address_map_picker.domain.AddressMapPickerDomainActionsInteractor$requestFinalizeAddress$1", f = "AddressMapPickerDomainActionsInteractor.kt", l = {345, 353}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class AddressMapPickerDomainActionsInteractor$requestFinalizeAddress$1 extends SuspendLambda implements wls {
    final /* synthetic */ zzs $point;
    final /* synthetic */ AddressMapPickerPointType $pointType;
    final /* synthetic */ PositionInitAction $positionInitAction;
    Object L$0;
    int label;
    final /* synthetic */ c this$0;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lvpr;", "Lpv0;", "", "it", "Lzy11;", "<anonymous>", "(Lvpr;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.address.address_map_picker.domain.AddressMapPickerDomainActionsInteractor$requestFinalizeAddress$1$1", f = "AddressMapPickerDomainActionsInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.address.address_map_picker.domain.AddressMapPickerDomainActionsInteractor$requestFinalizeAddress$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements zls {
        int label;
        final /* synthetic */ c this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(c cVar, Continuation continuation) {
            super(3, continuation);
            this.this$0 = cVar;
        }

        @Override // defpackage.zls
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, (Continuation) obj3);
            zy11 zy11Var = zy11.a;
            anonymousClass1.invokeSuspend(zy11Var);
            return zy11Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            this.this$0.c.b(AddressMapPickerAddressStateRepository.State.Error);
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressMapPickerDomainActionsInteractor$requestFinalizeAddress$1(c cVar, zzs zzsVar, AddressMapPickerPointType addressMapPickerPointType, PositionInitAction positionInitAction, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$point = zzsVar;
        this.$pointType = addressMapPickerPointType;
        this.$positionInitAction = positionInitAction;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AddressMapPickerDomainActionsInteractor$requestFinalizeAddress$1(this.this$0, this.$point, this.$pointType, this.$positionInitAction, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AddressMapPickerDomainActionsInteractor$requestFinalizeAddress$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0061, code lost:
    
        if (r13 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0090, code lost:
    
        if (r5.collect(r1, r12) != r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0092, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0037, code lost:
    
        if (r13 == r0) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        atd0 atd0Var;
        zzs zzsVar;
        i11 a;
        RoutePointType e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        int i2 = 1;
        if (i == 0) {
            kotlin.b.b(obj);
            c cVar = this.this$0;
            atd0Var = cVar.g;
            zzsVar = this.$point;
            if (zzsVar == null) {
                po21 po21Var = cVar.h;
                this.L$0 = atd0Var;
                this.label = 1;
                obj = ((ru.yandex.taxi.preorder.source.userposition.e) po21Var).h(this);
            }
            atd0 atd0Var2 = atd0Var;
            zzs zzsVar2 = zzsVar;
            c cVar2 = this.this$0;
            AddressMapPickerPointType addressMapPickerPointType = this.$pointType;
            a = cVar2.e.a();
            if (a != null) {
                e = a.equals(f11.a) ? RoutePointType.FAVORITE : ooa1.e(ooa1.b(a));
            }
            e = ooa1.e(addressMapPickerPointType);
            o oVar = new o(atd0.b(atd0Var2, zzsVar2, e, "auto", this.$positionInitAction, Action.FINALIZE), new AnonymousClass1(this.this$0, null));
            lz0 lz0Var = new lz0(this.this$0, i2);
            this.L$0 = null;
            this.label = 2;
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            atd0Var = (atd0) this.L$0;
            kotlin.b.b(obj);
        }
        zzsVar = ((mo21) obj).a();
        atd0 atd0Var22 = atd0Var;
        zzs zzsVar22 = zzsVar;
        c cVar22 = this.this$0;
        AddressMapPickerPointType addressMapPickerPointType2 = this.$pointType;
        a = cVar22.e.a();
        if (a != null) {
        }
        e = ooa1.e(addressMapPickerPointType2);
        o oVar2 = new o(atd0.b(atd0Var22, zzsVar22, e, "auto", this.$positionInitAction, Action.FINALIZE), new AnonymousClass1(this.this$0, null));
        lz0 lz0Var2 = new lz0(this.this$0, i2);
        this.L$0 = null;
        this.label = 2;
    }
}
