package com.yandex.delivery.attrbutedtext.impl.text.base;

import android.text.SpannableStringBuilder;
import com.yandex.delivery.attrbutedtext.api.FormattedText;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Landroid/text/SpannableStringBuilder;", "<anonymous>", "(Ltse;)Landroid/text/SpannableStringBuilder;"}, k = 3, mv = {2, 3, 0})
@mvg(c = "com.yandex.delivery.attrbutedtext.impl.text.base.BaseFormattedTextConverter$awaitConvert$2", f = "BaseFormattedTextConverter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes11.dex */
final class BaseFormattedTextConverter$awaitConvert$2 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $allowDefaultFont;
    final /* synthetic */ boolean $ignoreConvertForDarkMode;
    final /* synthetic */ boolean $safeImageLoad;
    final /* synthetic */ Map<String, String> $templates;
    final /* synthetic */ FormattedText $text;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseFormattedTextConverter$awaitConvert$2(a aVar, FormattedText formattedText, boolean z, boolean z2, boolean z3, Map map, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$text = formattedText;
        this.$safeImageLoad = z;
        this.$ignoreConvertForDarkMode = z2;
        this.$allowDefaultFont = z3;
        this.$templates = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BaseFormattedTextConverter$awaitConvert$2 baseFormattedTextConverter$awaitConvert$2 = new BaseFormattedTextConverter$awaitConvert$2(this.this$0, this.$text, this.$safeImageLoad, this.$ignoreConvertForDarkMode, this.$allowDefaultFont, this.$templates, continuation);
        baseFormattedTextConverter$awaitConvert$2.L$0 = obj;
        return baseFormattedTextConverter$awaitConvert$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BaseFormattedTextConverter$awaitConvert$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        a aVar = this.this$0;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        aVar.a(spannableStringBuilder, tseVar, this.$text.a, this.$safeImageLoad, !this.$ignoreConvertForDarkMode, this.$allowDefaultFont, this.$templates);
        return spannableStringBuilder;
    }
}
