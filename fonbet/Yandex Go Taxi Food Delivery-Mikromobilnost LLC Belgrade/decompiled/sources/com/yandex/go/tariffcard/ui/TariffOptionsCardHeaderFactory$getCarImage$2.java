package com.yandex.go.tariffcard.ui;

import android.graphics.drawable.BitmapDrawable;
import defpackage.mi31;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Landroid/graphics/drawable/BitmapDrawable;", "<anonymous>", "(Ltse;)Landroid/graphics/drawable/BitmapDrawable;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.tariffcard.ui.TariffOptionsCardHeaderFactory$getCarImage$2", f = "TariffOptionsCardHeaderFactory.kt", l = {300, 302}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TariffOptionsCardHeaderFactory$getCarImage$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $carImageTag;
    final /* synthetic */ mi31 $verticalTariff;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TariffOptionsCardHeaderFactory$getCarImage$2(String str, e eVar, mi31 mi31Var, Continuation continuation) {
        super(2, continuation);
        this.$carImageTag = str;
        this.this$0 = eVar;
        this.$verticalTariff = mi31Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TariffOptionsCardHeaderFactory$getCarImage$2(this.$carImageTag, this.this$0, this.$verticalTariff, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TariffOptionsCardHeaderFactory$getCarImage$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002d, code lost:
    
        if (r6 == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0043, code lost:
    
        if (r6 == r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return (BitmapDrawable) obj;
            }
            if (i == 2) {
                kotlin.b.b(obj);
                return (BitmapDrawable) obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        String str = this.$carImageTag;
        e eVar = this.this$0;
        if (str != null) {
            ru.yandex.taxi.widget.utils.e eVar2 = eVar.c;
            this.label = 1;
            obj = ru.yandex.taxi.widget.utils.e.f(eVar2, str, null, this, 6);
        } else {
            ru.yandex.taxi.widget.utils.e eVar3 = eVar.c;
            String str2 = this.$verticalTariff.a.i;
            this.label = 2;
            obj = ru.yandex.taxi.widget.utils.e.k(eVar3, str2, null, this, 14);
        }
        return coroutineSingletons;
    }
}
