package com.yandex.go.scooters.offers.v2.components.tariffs.ui.v2;

import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.t5p0;
import defpackage.tse;
import defpackage.w610;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.Regex;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Ljava/lang/CharSequence;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.offers.v2.components.tariffs.ui.v2.ScootersTariffPriceFormatMapper$formatPrice$2", f = "ScootersTariffPriceFormatMapper.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersTariffPriceFormatMapper$formatPrice$2 extends SuspendLambda implements wls {
    final /* synthetic */ CharSequence $price;
    int label;
    final /* synthetic */ t5p0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersTariffPriceFormatMapper$formatPrice$2(CharSequence charSequence, t5p0 t5p0Var, Continuation continuation) {
        super(2, continuation);
        this.$price = charSequence;
        this.this$0 = t5p0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersTariffPriceFormatMapper$formatPrice$2(this.$price, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersTariffPriceFormatMapper$formatPrice$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        SpannableString valueOf = SpannableString.valueOf(this.$price);
        valueOf.setSpan(new AbsoluteSizeSpan(this.this$0.b, false), 0, valueOf.length(), 17);
        int i = this.this$0.c;
        w610 b = new Regex("\\d+|\\p{Sc}").b(valueOf);
        if (b == null) {
            return valueOf;
        }
        SpannableString valueOf2 = SpannableString.valueOf(valueOf);
        valueOf2.setSpan(new AbsoluteSizeSpan(i, false), b.b().a, b.b().b + 1, 17);
        return valueOf2;
    }
}
