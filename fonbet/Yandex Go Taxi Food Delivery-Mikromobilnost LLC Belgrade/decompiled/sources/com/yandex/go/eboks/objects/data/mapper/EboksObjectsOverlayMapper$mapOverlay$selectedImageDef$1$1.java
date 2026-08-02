package com.yandex.go.eboks.objects.data.mapper;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcom/yandex/runtime/image/ImageProvider;", "<anonymous>", "(Ltse;)Lcom/yandex/runtime/image/ImageProvider;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.eboks.objects.data.mapper.EboksObjectsOverlayMapper$mapOverlay$selectedImageDef$1$1", f = "EboksObjectsOverlayMapper.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SAFETY_TIPS_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class EboksObjectsOverlayMapper$mapOverlay$selectedImageDef$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $it;
    final /* synthetic */ CharSequence $selectedText;
    final /* synthetic */ CharSequence $text;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EboksObjectsOverlayMapper$mapOverlay$selectedImageDef$1$1(b bVar, String str, CharSequence charSequence, CharSequence charSequence2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$it = str;
        this.$selectedText = charSequence;
        this.$text = charSequence2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new EboksObjectsOverlayMapper$mapOverlay$selectedImageDef$1$1(this.this$0, this.$it, this.$selectedText, this.$text, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((EboksObjectsOverlayMapper$mapOverlay$selectedImageDef$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        com.yandex.go.eboks.objects.data.b bVar = this.this$0.b;
        String str = this.$it;
        CharSequence charSequence = this.$selectedText;
        if (charSequence == null) {
            charSequence = this.$text;
        }
        this.label = 1;
        Object b = bVar.b(str, charSequence, this);
        return b == coroutineSingletons ? coroutineSingletons : b;
    }
}
