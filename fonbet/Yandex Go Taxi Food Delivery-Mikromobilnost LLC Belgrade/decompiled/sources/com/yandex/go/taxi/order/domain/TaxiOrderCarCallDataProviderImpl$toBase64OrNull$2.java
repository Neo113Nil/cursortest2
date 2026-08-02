package com.yandex.go.taxi.order.domain;

import android.graphics.Bitmap;
import android.util.Base64;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.io.ByteArrayOutputStream;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Ljava/lang/String;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.domain.TaxiOrderCarCallDataProviderImpl$toBase64OrNull$2", f = "TaxiOrderCarCallDataProviderImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class TaxiOrderCarCallDataProviderImpl$toBase64OrNull$2 extends SuspendLambda implements wls {
    final /* synthetic */ Bitmap $this_toBase64OrNull;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxiOrderCarCallDataProviderImpl$toBase64OrNull$2(Bitmap bitmap, Continuation continuation) {
        super(2, continuation);
        this.$this_toBase64OrNull = bitmap;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TaxiOrderCarCallDataProviderImpl$toBase64OrNull$2(this.$this_toBase64OrNull, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TaxiOrderCarCallDataProviderImpl$toBase64OrNull$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            this.$this_toBase64OrNull.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
        } catch (Throwable unused) {
            return null;
        }
    }
}
