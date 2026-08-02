package com.yandex.go.address.address_map_picker.domain;

import com.yandex.mapkit.geometry.Point;
import defpackage.gh00;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.wpb0;
import defpackage.yy0;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.address.address_map_picker.domain.AddressMapPickerMapInteractor$startCameraFinishedJob$1", f = "AddressMapPickerMapInteractor.kt", l = {122, HProv.PP_VERSION_EX}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class AddressMapPickerMapInteractor$startCameraFinishedJob$1 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressMapPickerMapInteractor$startCameraFinishedJob$1(e eVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AddressMapPickerMapInteractor$startCameraFinishedJob$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AddressMapPickerMapInteractor$startCameraFinishedJob$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0098, code lost:
    
        if (r1.e(r3, r9) == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009a, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0037, code lost:
    
        if (kotlinx.coroutines.a.i(300, r9) == r0) goto L30;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzs zzsVar;
        g gVar;
        ru.yandex.taxi.map.overlay.pickup.d dVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            this.label = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11.a;
            }
            kotlin.b.b(obj);
        }
        zzs b = ((gh00) this.this$0.a).e.b();
        f fVar = this.this$0.d;
        wpb0 h = (fVar == null || (dVar = (gVar = fVar.a).e) == null || !dVar.Kg()) ? null : gVar.b.h(gVar.c, b, false);
        if (h != null && (zzsVar = h.b) != null) {
            b = zzsVar;
        }
        if (h != null) {
            ((gh00) this.this$0.a).E(new Point(b.a, b.b), 300.0f, null);
        }
        c cVar = this.this$0.b;
        yy0 yy0Var = new yy0(b);
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.label = 2;
    }
}
