package com.yandex.go.places.impl.ui.search.utils;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.widget.utils.e;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lug10;", "<anonymous>", "()Lug10;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.impl.ui.search.utils.MediaInfoConverterUtilsKt$getFormattedText$function0$1", f = "MediaInfoConverterUtils.kt", l = {18}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class MediaInfoConverterUtilsKt$getFormattedText$function0$1 extends SuspendLambda implements tls {
    final /* synthetic */ CharSequence $rawTextSequence;
    final /* synthetic */ FormattedText $text;
    final /* synthetic */ e $this_getFormattedText;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaInfoConverterUtilsKt$getFormattedText$function0$1(e eVar, FormattedText formattedText, CharSequence charSequence, Continuation continuation) {
        super(1, continuation);
        this.$this_getFormattedText = eVar;
        this.$text = formattedText;
        this.$rawTextSequence = charSequence;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new MediaInfoConverterUtilsKt$getFormattedText$function0$1(this.$this_getFormattedText, this.$text, this.$rawTextSequence, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((MediaInfoConverterUtilsKt$getFormattedText$function0$1) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        e eVar = this.$this_getFormattedText;
        FormattedText formattedText = this.$text;
        CharSequence charSequence = this.$rawTextSequence;
        this.label = 1;
        Object b = a.b(eVar, formattedText, charSequence, this);
        return b == coroutineSingletons ? coroutineSingletons : b;
    }
}
