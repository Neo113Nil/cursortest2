package com.yandex.go.pin.api.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.yandex.go.pin.api.v2.PinV2Component;
import com.yandex.go.pin.api.v2.d;
import defpackage.c0c0;
import defpackage.i1c0;
import defpackage.kdc;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.r0c0;
import defpackage.s8o;
import defpackage.tse;
import defpackage.ufu;
import defpackage.wls;
import defpackage.xzb0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.widget.map.PinSlot;
import ru.yandex.taxi.widget.map.SourceOnMapControl;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Ltse;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.pin.api.widget.PinMapKitImageFactory$orderBubblePin$$inlined$renderPinV2Content$1", f = "PinMapKitImageFactory.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
public final class PinMapKitImageFactory$orderBubblePin$$inlined$renderPinV2Content$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $bgColor$inlined;
    final /* synthetic */ Bitmap $icon$inlined;
    final /* synthetic */ PinV2Component $pin;
    final /* synthetic */ String $text$inlined;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinMapKitImageFactory$orderBubblePin$$inlined$renderPinV2Content$1(PinV2Component pinV2Component, Continuation continuation, b bVar, String str, Bitmap bitmap, String str2) {
        super(2, continuation);
        this.$pin = pinV2Component;
        this.this$0 = bVar;
        this.$bgColor$inlined = str;
        this.$icon$inlined = bitmap;
        this.$text$inlined = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PinMapKitImageFactory$orderBubblePin$$inlined$renderPinV2Content$1(this.$pin, continuation, this.this$0, this.$bgColor$inlined, this.$icon$inlined, this.$text$inlined);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PinMapKitImageFactory$orderBubblePin$$inlined$renderPinV2Content$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        PinV2Component pinV2Component = this.$pin;
        r0c0 r0c0Var = this.this$0.e;
        String str = this.$bgColor$inlined;
        r0c0Var.getClass();
        xzb0 xzb0Var = PinSlot.Companion;
        Context context = r0c0Var.a;
        xzb0Var.getClass();
        i1c0 a = xzb0.a(context);
        kdc b = ((ufu) r0c0Var.b).b(str);
        if (b != null) {
            a = i1c0.a(a, 0, s8o.m(b, context), null, 0.0f, 13);
        }
        return d.a(pinV2Component, a, PinV2Component.Position.DEFAULT, new SourceOnMapControl.a(new c0c0(new BitmapDrawable(this.this$0.a.getResources(), this.$icon$inlined)), null, this.$text$inlined, false, false, null, null, 2042));
    }
}
