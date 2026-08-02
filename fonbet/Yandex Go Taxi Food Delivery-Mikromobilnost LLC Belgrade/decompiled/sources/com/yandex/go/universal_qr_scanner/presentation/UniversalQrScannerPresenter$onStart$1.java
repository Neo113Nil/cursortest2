package com.yandex.go.universal_qr_scanner.presentation;

import androidx.camera.core.f;
import androidx.camera.core.g;
import androidx.camera.core.j;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.wz11;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.universal_qr_scanner.presentation.UniversalQrScannerPresenter$onStart$1", f = "UniversalQrScannerPresenter.kt", l = {70, 74, HProv.PROV_GOST_2001_DH}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class UniversalQrScannerPresenter$onStart$1 extends SuspendLambda implements wls {
    Object L$0;
    boolean Z$0;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UniversalQrScannerPresenter$onStart$1(d dVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UniversalQrScannerPresenter$onStart$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((UniversalQrScannerPresenter$onStart$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x007e, code lost:
    
        if (r10.a(r9) == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0080, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006d, code lost:
    
        if (r10.a(r7, r9) == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
    
        if (r10 == r0) goto L22;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean booleanValue;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.go.universal_qr_scanner.domain.camera.permission.a aVar = this.this$0.G;
            this.label = 1;
            obj = aVar.a(this);
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
            booleanValue = this.Z$0;
            kotlin.b.b(obj);
            com.yandex.go.universal_qr_scanner.domain.camera.image.analyze.d dVar = this.this$0.A;
            this.L$0 = null;
            this.Z$0 = booleanValue;
            this.label = 3;
        }
        booleanValue = ((Boolean) obj).booleanValue();
        if (booleanValue) {
            wz11 wz11Var = this.this$0.F;
            j[] jVarArr = {(g) wz11Var.d.getValue(), (f) wz11Var.e.getValue()};
            com.yandex.go.universal_qr_scanner.domain.camera.a aVar2 = this.this$0.y;
            this.L$0 = null;
            this.Z$0 = booleanValue;
            this.label = 2;
        }
        return zy11.a;
    }
}
