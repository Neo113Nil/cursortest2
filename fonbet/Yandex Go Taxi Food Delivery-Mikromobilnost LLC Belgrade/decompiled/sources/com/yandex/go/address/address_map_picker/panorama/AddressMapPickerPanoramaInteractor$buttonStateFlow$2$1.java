package com.yandex.go.address.address_map_picker.panorama;

import defpackage.d6z;
import defpackage.jqr;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rb90;
import defpackage.tb90;
import defpackage.vpr;
import defpackage.wls;
import defpackage.xb90;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.panorama.l;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lrb90;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.address.address_map_picker.panorama.AddressMapPickerPanoramaInteractor$buttonStateFlow$2$1", f = "AddressMapPickerPanoramaInteractor.kt", l = {71, 72}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class AddressMapPickerPanoramaInteractor$buttonStateFlow$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ xb90 $params;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressMapPickerPanoramaInteractor$buttonStateFlow$2$1(xb90 xb90Var, d dVar, Continuation continuation) {
        super(2, continuation);
        this.$params = xb90Var;
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AddressMapPickerPanoramaInteractor$buttonStateFlow$2$1 addressMapPickerPanoramaInteractor$buttonStateFlow$2$1 = new AddressMapPickerPanoramaInteractor$buttonStateFlow$2$1(this.$params, this.this$0, continuation);
        addressMapPickerPanoramaInteractor$buttonStateFlow$2$1.L$0 = obj;
        return addressMapPickerPanoramaInteractor$buttonStateFlow$2$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AddressMapPickerPanoramaInteractor$buttonStateFlow$2$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0068, code lost:
    
        if (kotlinx.coroutines.flow.e.u(r4, r0, r12) == r1) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006a, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
    
        if (r0.emit(r13, r12) == r1) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ru.yandex.taxi.panorama.d dVar = this.$params.d;
            rb90 rb90Var = new rb90(null, d6z.Y(dVar, dVar.d));
            this.L$0 = vprVar;
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
        d dVar2 = this.this$0;
        xb90 xb90Var = this.$params;
        l lVar = dVar2.b;
        String str = xb90Var.b;
        tb90 tb90Var = xb90Var.a;
        String str2 = xb90Var.c;
        ru.yandex.taxi.panorama.d dVar3 = xb90Var.d;
        c cVar = new c(new jqr(lVar.b(str, tb90Var, str2, dVar3, dVar3.j), new AddressMapPickerPanoramaInteractor$buildButtonFlow$1(xb90Var, dVar2, null), 3), xb90Var);
        this.L$0 = null;
        this.label = 2;
    }
}
