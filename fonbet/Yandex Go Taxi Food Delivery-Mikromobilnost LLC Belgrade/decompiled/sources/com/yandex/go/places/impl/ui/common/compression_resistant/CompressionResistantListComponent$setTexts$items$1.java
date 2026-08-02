package com.yandex.go.places.impl.ui.common.compression_resistant;

import android.text.TextUtils;
import android.widget.LinearLayout;
import defpackage.evu0;
import defpackage.jwd;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "Lru/yandex/taxi/widget/RobotoTextView;", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.impl.ui.common.compression_resistant.CompressionResistantListComponent$setTexts$items$1", f = "CompressionResistantListComponent.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
public final class CompressionResistantListComponent$setTexts$items$1 extends SuspendLambda implements wls {
    final /* synthetic */ List<jwd> $texts;
    int label;
    final /* synthetic */ CompressionResistantListComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CompressionResistantListComponent$setTexts$items$1(CompressionResistantListComponent compressionResistantListComponent, List list, Continuation continuation) {
        super(2, continuation);
        this.this$0 = compressionResistantListComponent;
        this.$texts = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CompressionResistantListComponent$setTexts$items$1(this.this$0, this.$texts, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CompressionResistantListComponent$setTexts$items$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        CompressionResistantListComponent compressionResistantListComponent = this.this$0;
        Iterator<T> it = this.$texts.iterator();
        int i = 0;
        while (it.hasNext()) {
            Integer num = ((jwd) it.next()).b;
            i += num != null ? num.intValue() : 0;
        }
        compressionResistantListComponent.totalPriority = i;
        List<jwd> list = this.$texts;
        CompressionResistantListComponent compressionResistantListComponent2 = this.this$0;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        for (jwd jwdVar : list) {
            RobotoTextView robotoTextView = new RobotoTextView(compressionResistantListComponent2.getContext(), null, 0, 6, null);
            robotoTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            robotoTextView.setMaxLines(1);
            robotoTextView.setEllipsize(TextUtils.TruncateAt.END);
            CharSequence charSequence = jwdVar.a;
            robotoTextView.setText(charSequence);
            Integer num2 = jwdVar.b;
            robotoTextView.setTag(Integer.valueOf(num2 != null ? num2.intValue() : 1));
            if (evu0.y(charSequence, CompressionResistantListComponent.TEXT_DELIMITER, false)) {
                robotoTextView.setImportantForAccessibility(2);
            } else {
                robotoTextView.setContentDescription(charSequence);
            }
            arrayList.add(robotoTextView);
        }
        return arrayList;
    }
}
