package com.yandex.go.scooters.passes.data.jason;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import defpackage.bia0;
import defpackage.ffx;
import defpackage.g8e;
import defpackage.hfa0;
import defpackage.lea0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.s7a0;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.x2h0;
import defpackage.xeo0;
import defpackage.zgz;
import defpackage.zy11;
import java.io.ByteArrayOutputStream;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Ls7a0;", "<anonymous>", "(Ltse;)Ls7a0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.passes.data.jason.ScootersPassesPaymentMethodStateFactory$create$2", f = "ScootersPassesPaymentMethodStateFactory.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersPassesPaymentMethodStateFactory$create$2 extends SuspendLambda implements wls {
    final /* synthetic */ hfa0 $paymentOptions;
    int label;
    final /* synthetic */ xeo0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersPassesPaymentMethodStateFactory$create$2(hfa0 hfa0Var, xeo0 xeo0Var, Continuation continuation) {
        super(2, continuation);
        this.$paymentOptions = hfa0Var;
        this.this$0 = xeo0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersPassesPaymentMethodStateFactory$create$2(this.$paymentOptions, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersPassesPaymentMethodStateFactory$create$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
    
        if (r0 == null) goto L8;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Drawable y;
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        lea0 b = this.$paymentOptions.b();
        if (b != null) {
            xeo0 xeo0Var = this.this$0;
            y = bia0.a(xeo0Var.c, xeo0Var.a, b);
        }
        y = tje.y(x2h0.ic_payment_add_card, this.this$0.a);
        String str2 = "";
        if (b == null || (str = b.getId()) == null) {
            str = "";
        }
        xeo0 xeo0Var2 = this.this$0;
        Bitmap d0 = ffx.d0(y, 0, 0, 7);
        xeo0Var2.getClass();
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            d0.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            str2 = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
        } catch (Throwable th) {
            zgz.a("Base64 convert problems", th);
        }
        return new s7a0(str, g8e.o("data:image/png;base64,", str2));
    }
}
