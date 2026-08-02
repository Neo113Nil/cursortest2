package com.yandex.go.places.models.data.mappers;

import com.yandex.go.places.models.data.entities.network.CompressionResistantAttributedTextDto;
import defpackage.jwd;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Ljwd;", "<anonymous>", "(Ltse;)Ljwd;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.models.data.mappers.CompressionResistantAttributedTextMapper$mapModel$2", f = "CompressionResistantAttributedTextMapper.kt", l = {16}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class CompressionResistantAttributedTextMapper$mapModel$2 extends SuspendLambda implements wls {
    final /* synthetic */ CompressionResistantAttributedTextDto $dto;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CompressionResistantAttributedTextMapper$mapModel$2(e eVar, CompressionResistantAttributedTextDto compressionResistantAttributedTextDto, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$dto = compressionResistantAttributedTextDto;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CompressionResistantAttributedTextMapper$mapModel$2(this.this$0, this.$dto, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CompressionResistantAttributedTextMapper$mapModel$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CompressionResistantAttributedTextMapper$mapModel$2 compressionResistantAttributedTextMapper$mapModel$2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ru.yandex.taxi.widget.c cVar = this.this$0.a;
            FormattedText formattedText = this.$dto.a;
            this.label = 1;
            compressionResistantAttributedTextMapper$mapModel$2 = this;
            obj = ru.yandex.taxi.widget.c.e(cVar, formattedText, null, false, compressionResistantAttributedTextMapper$mapModel$2, 30);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            compressionResistantAttributedTextMapper$mapModel$2 = this;
        }
        return new jwd((CharSequence) obj, compressionResistantAttributedTextMapper$mapModel$2.$dto.b);
    }
}
