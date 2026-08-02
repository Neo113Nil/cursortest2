package com.yandex.go.places.impl.ui.common.compression_resistant;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.impl.ui.common.compression_resistant.CompressionResistantListComponent$setTexts$2", f = "CompressionResistantListComponent.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
public final class CompressionResistantListComponent$setTexts$2 extends SuspendLambda implements wls {
    final /* synthetic */ List<RobotoTextView> $items;
    int label;
    final /* synthetic */ CompressionResistantListComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CompressionResistantListComponent$setTexts$2(CompressionResistantListComponent compressionResistantListComponent, List list, Continuation continuation) {
        super(2, continuation);
        this.this$0 = compressionResistantListComponent;
        this.$items = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CompressionResistantListComponent$setTexts$2(this.this$0, this.$items, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        CompressionResistantListComponent$setTexts$2 compressionResistantListComponent$setTexts$2 = (CompressionResistantListComponent$setTexts$2) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        compressionResistantListComponent$setTexts$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        this.this$0.removeAllViews();
        List<RobotoTextView> list = this.$items;
        CompressionResistantListComponent compressionResistantListComponent = this.this$0;
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            compressionResistantListComponent.addView((RobotoTextView) it.next());
        }
        return zy11.a;
    }
}
