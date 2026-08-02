package com.yandex.go.taxi.order.popup;

import com.yandex.go.taxi.order.models.api.response.ModalItemDto$StepsInstructionsItem;
import com.yandex.go.taxi.order.models.api.response.Step;
import com.yandex.go.taxi.order.models.api.response.StepImage;
import com.yandex.go.taxi.order.models.api.response.TotwPromotionWidgets;
import defpackage.ebu0;
import defpackage.fbu0;
import defpackage.gbu0;
import defpackage.hbu0;
import defpackage.jbu0;
import defpackage.mau0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qos0;
import defpackage.tcc;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.widget.c;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Ljbu0;", "<anonymous>", "(Ltse;)Ljbu0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.popup.OrderPopupMapper$mapStepsInstructions$2", f = "OrderPopupMapper.kt", l = {209, 212, 213}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderPopupMapper$mapStepsInstructions$2 extends SuspendLambda implements wls {
    final /* synthetic */ ModalItemDto$StepsInstructionsItem $item;
    Object L$0;
    Object L$1;
    Object L$10;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderPopupMapper$mapStepsInstructions$2(b bVar, ModalItemDto$StepsInstructionsItem modalItemDto$StepsInstructionsItem, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$item = modalItemDto$StepsInstructionsItem;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrderPopupMapper$mapStepsInstructions$2(this.this$0, this.$item, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrderPopupMapper$mapStepsInstructions$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00fc, code lost:
    
        if (r15 == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x011c, code lost:
    
        if (r7 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0083, code lost:
    
        if (r15 == r0) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x010a  */
    /* JADX WARN: Type inference failed for: r10v11, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00fc -> B:7:0x00ff). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0102 -> B:8:0x0103). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CharSequence charSequence;
        b bVar;
        ArrayList arrayList;
        Iterator it;
        ArrayList arrayList2;
        b bVar2;
        ArrayList arrayList3;
        Iterator it2;
        Step step;
        CharSequence charSequence2;
        Collection collection;
        CharSequence charSequence3;
        FormattedText formattedText;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            c cVar = this.this$0.b;
            FormattedText formattedText2 = this.$item.b;
            this.label = 1;
            obj = c.i(cVar, formattedText2, null, this, 30);
        } else if (i == 1) {
            kotlin.b.b(obj);
        } else if (i == 2) {
            collection = (Collection) this.L$8;
            charSequence2 = (CharSequence) this.L$7;
            Step step2 = (Step) this.L$6;
            Iterator it3 = (Iterator) this.L$4;
            ?? r9 = (Collection) this.L$3;
            b bVar3 = (b) this.L$1;
            kotlin.b.b(obj);
            bVar2 = bVar3;
            arrayList3 = r9;
            it2 = it3;
            step = step2;
            charSequence3 = (CharSequence) obj;
            formattedText = step.c;
            if (formattedText == null) {
            }
        } else {
            if (i != 3) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            collection = (Collection) this.L$10;
            charSequence2 = (CharSequence) this.L$9;
            charSequence3 = (CharSequence) this.L$7;
            step = (Step) this.L$6;
            it2 = (Iterator) this.L$4;
            ?? r10 = (Collection) this.L$3;
            bVar2 = (b) this.L$1;
            kotlin.b.b(obj);
            ArrayList arrayList4 = r10;
            CharSequence charSequence4 = (CharSequence) obj;
            ArrayList arrayList5 = arrayList4;
            StepImage stepImage = step.d;
            collection.add(new mau0(charSequence3, charSequence4, stepImage == null ? stepImage.a : null, step.a));
            charSequence = charSequence2;
            it = it2;
            arrayList = arrayList5;
            bVar = bVar2;
            if (it.hasNext()) {
                step = (Step) it.next();
                c cVar2 = bVar.b;
                FormattedText formattedText3 = step.b;
                this.L$0 = null;
                this.L$1 = bVar;
                this.L$2 = null;
                this.L$3 = arrayList;
                this.L$4 = it;
                this.L$5 = null;
                this.L$6 = step;
                this.L$7 = charSequence;
                this.L$8 = arrayList;
                this.L$9 = null;
                this.L$10 = null;
                this.label = 2;
                Object i2 = c.i(cVar2, formattedText3, null, this, 30);
                if (i2 != coroutineSingletons) {
                    bVar2 = bVar;
                    ArrayList arrayList6 = arrayList;
                    charSequence2 = charSequence;
                    obj = i2;
                    it2 = it;
                    collection = arrayList6;
                    arrayList3 = arrayList6;
                    charSequence3 = (CharSequence) obj;
                    formattedText = step.c;
                    if (formattedText == null) {
                        c cVar3 = bVar2.b;
                        this.L$0 = null;
                        this.L$1 = bVar2;
                        this.L$2 = null;
                        this.L$3 = arrayList3;
                        this.L$4 = it2;
                        this.L$5 = null;
                        this.L$6 = step;
                        this.L$7 = charSequence3;
                        this.L$8 = null;
                        this.L$9 = charSequence2;
                        this.L$10 = collection;
                        this.label = 3;
                        obj = c.i(cVar3, formattedText, null, this, 30);
                        arrayList4 = arrayList3;
                    } else {
                        charSequence4 = null;
                        arrayList5 = arrayList3;
                        StepImage stepImage2 = step.d;
                        collection.add(new mau0(charSequence3, charSequence4, stepImage2 == null ? stepImage2.a : null, step.a));
                        charSequence = charSequence2;
                        it = it2;
                        arrayList = arrayList5;
                        bVar = bVar2;
                        if (it.hasNext()) {
                            arrayList2 = arrayList;
                        }
                    }
                }
                return coroutineSingletons;
            }
        }
        charSequence = (CharSequence) obj;
        List list = this.$item.f;
        if (list != null) {
            List list2 = list;
            bVar = this.this$0;
            arrayList = new ArrayList(tcc.n(list2, 10));
            it = list2.iterator();
            if (it.hasNext()) {
            }
        }
        arrayList2 = EmptyList.a;
        b bVar4 = this.this$0;
        TotwPromotionWidgets totwPromotionWidgets = this.$item.e;
        bVar4.getClass();
        qos0 qos0Var = totwPromotionWidgets.b;
        List list3 = totwPromotionWidgets.a;
        List list4 = totwPromotionWidgets.c;
        return new jbu0(charSequence, arrayList2, list4 != null ? new hbu0(list4) : qos0Var != null ? new gbu0(qos0Var) : !list3.isEmpty() ? new ebu0(list3) : fbu0.a);
    }
}
