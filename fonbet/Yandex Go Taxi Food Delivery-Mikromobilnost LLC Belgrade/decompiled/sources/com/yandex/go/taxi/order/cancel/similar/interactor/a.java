package com.yandex.go.taxi.order.cancel.similar.interactor;

import com.yandex.go.taxi.order.cancel.similar.model.CancelSimilarButton$State;
import com.yandex.go.taxi.order.models.api.cancel.Button;
import com.yandex.go.taxi.order.models.api.cancel.Buttons;
import com.yandex.go.taxi.order.models.api.cancel.CancelSimilarOrdersModal;
import com.yandex.go.taxi.order.models.api.cancel.CancelSimilarOrdersNotification;
import defpackage.ny61;
import defpackage.oz7;
import defpackage.tcc;
import defpackage.ufu;
import defpackage.vpr;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes14.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ CancelSimilarOrdersNotification b;
    public final /* synthetic */ h c;

    public a(vpr vprVar, CancelSimilarOrdersNotification cancelSimilarOrdersNotification, h hVar) {
        this.a = vprVar;
        this.b = cancelSimilarOrdersNotification;
        this.c = hVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x01be, code lost:
    
        if (r0.emit(r2, r14) != r3) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0165 -> B:18:0x0170). Please report as a decompilation issue!!! */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        CancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$1 cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$1;
        int i;
        CancelSimilarButton$State cancelSimilarButton$State;
        vpr vprVar;
        CancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$1 cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$12;
        List list;
        Buttons buttons;
        List list2;
        Iterator it;
        Collection collection;
        vpr vprVar2;
        CancelSimilarButton$State cancelSimilarButton$State2;
        Collection collection2;
        Collection collection3;
        Iterator it2;
        Button button;
        Object e;
        if (continuation instanceof CancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$1) {
            cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$1 = (CancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$1) continuation;
            int i2 = cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$1.label;
                h hVar = this.c;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    cancelSimilarButton$State = (CancelSimilarButton$State) obj;
                    CancelSimilarOrdersModal cancelSimilarOrdersModal = this.b.e;
                    vprVar = this.a;
                    if (cancelSimilarOrdersModal == null || (buttons = cancelSimilarOrdersModal.c) == null || (list2 = buttons.b) == null) {
                        cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$12 = cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$1;
                        list = null;
                        if (list == null) {
                        }
                        cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$12.L$0 = null;
                        cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$12.L$1 = null;
                        cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$12.L$2 = null;
                        cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$12.L$3 = null;
                        cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$12.L$4 = null;
                        cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$12.L$5 = null;
                        cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$12.L$6 = null;
                        cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$12.L$7 = null;
                        cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$12.L$8 = null;
                        cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$12.L$9 = null;
                        cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$12.L$10 = null;
                        cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$12.L$11 = null;
                        cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$12.L$12 = null;
                        cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$12.L$13 = null;
                        cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$12.L$14 = null;
                        cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$12.label = 3;
                    } else {
                        List list3 = list2;
                        ArrayList arrayList = new ArrayList(tcc.n(list3, 10));
                        it = list3.iterator();
                        cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$12 = cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$1;
                        collection = arrayList;
                        if (it.hasNext()) {
                        }
                    }
                } else {
                    if (i == 1) {
                        Collection collection4 = (Collection) cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$1.L$13;
                        Button button2 = (Button) cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$1.L$12;
                        Iterator it3 = (Iterator) cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$1.L$10;
                        Collection collection5 = (Collection) cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$1.L$9;
                        CancelSimilarButton$State cancelSimilarButton$State3 = (CancelSimilarButton$State) cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$1.L$6;
                        vpr vprVar3 = (vpr) cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$1.L$4;
                        kotlin.b.b(obj2);
                        collection3 = collection4;
                        button = button2;
                        cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$12 = cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$1;
                        it2 = it3;
                        collection2 = collection5;
                        cancelSimilarButton$State2 = cancelSimilarButton$State3;
                        vprVar2 = vprVar3;
                        CharSequence charSequence = (CharSequence) obj2;
                        ru.yandex.taxi.widget.c cVar = hVar.g;
                        FormattedText formattedText = button.c;
                        cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$12.L$0 = null;
                        cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$12.L$1 = null;
                        cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$12.L$2 = null;
                        cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$12.L$3 = null;
                        cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$12.L$4 = vprVar2;
                        cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$12.L$5 = null;
                        cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$12.L$6 = cancelSimilarButton$State2;
                        cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$12.L$7 = null;
                        cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$12.L$8 = null;
                        cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$12.L$9 = collection2;
                        cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$12.L$10 = it2;
                        cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$12.L$11 = null;
                        cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$12.L$12 = button;
                        cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$12.L$13 = collection3;
                        cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$12.L$14 = charSequence;
                        cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$12.label = 2;
                        vpr vprVar4 = vprVar2;
                        Collection collection6 = collection2;
                        CancelSimilarButton$State cancelSimilarButton$State4 = cancelSimilarButton$State2;
                        e = ru.yandex.taxi.widget.c.e(cVar, formattedText, null, false, cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$12, 30);
                        if (e != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    }
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj2);
                        return zy11.a;
                    }
                    CharSequence charSequence2 = (CharSequence) cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$1.L$14;
                    collection3 = (Collection) cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$1.L$13;
                    Button button3 = (Button) cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$1.L$12;
                    Iterator it4 = (Iterator) cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$1.L$10;
                    Collection collection7 = (Collection) cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$1.L$9;
                    CancelSimilarButton$State cancelSimilarButton$State5 = (CancelSimilarButton$State) cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$1.L$6;
                    vpr vprVar5 = (vpr) cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$1.L$4;
                    kotlin.b.b(obj2);
                    CharSequence charSequence3 = charSequence2;
                    CancelSimilarButton$State cancelSimilarButton$State6 = cancelSimilarButton$State5;
                    vprVar = vprVar5;
                    cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$12 = cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$1;
                    collection = collection7;
                    collection3.add(new oz7(charSequence3, ((ufu) hVar.h).b(button3.b), (CharSequence) obj2, button3.d, cancelSimilarButton$State6));
                    it = it4;
                    cancelSimilarButton$State = cancelSimilarButton$State6;
                    if (it.hasNext()) {
                        Button button4 = (Button) it.next();
                        ru.yandex.taxi.widget.c cVar2 = hVar.g;
                        FormattedText formattedText2 = button4.a;
                        cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$12.L$0 = null;
                        cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$12.L$1 = null;
                        cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$12.L$2 = null;
                        cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$12.L$3 = null;
                        cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$12.L$4 = vprVar;
                        cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$12.L$5 = null;
                        cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$12.L$6 = cancelSimilarButton$State;
                        cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$12.L$7 = null;
                        cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$12.L$8 = null;
                        cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$12.L$9 = collection;
                        cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$12.L$10 = it;
                        cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$12.L$11 = null;
                        cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$12.L$12 = button4;
                        cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$12.L$13 = collection;
                        cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$12.L$14 = null;
                        cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$12.label = 1;
                        Object e2 = ru.yandex.taxi.widget.c.e(cVar2, formattedText2, null, false, cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$12, 30);
                        if (e2 != coroutineSingletons) {
                            vprVar2 = vprVar;
                            cancelSimilarButton$State2 = cancelSimilarButton$State;
                            obj2 = e2;
                            button = button4;
                            collection2 = collection;
                            it2 = it;
                            collection3 = collection2;
                            CharSequence charSequence4 = (CharSequence) obj2;
                            ru.yandex.taxi.widget.c cVar3 = hVar.g;
                            FormattedText formattedText3 = button.c;
                            cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$12.L$0 = null;
                            cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$12.L$1 = null;
                            cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$12.L$2 = null;
                            cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$12.L$3 = null;
                            cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$12.L$4 = vprVar2;
                            cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$12.L$5 = null;
                            cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$12.L$6 = cancelSimilarButton$State2;
                            cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$12.L$7 = null;
                            cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$12.L$8 = null;
                            cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$12.L$9 = collection2;
                            cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$12.L$10 = it2;
                            cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$12.L$11 = null;
                            cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$12.L$12 = button;
                            cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$12.L$13 = collection3;
                            cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$12.L$14 = charSequence4;
                            cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$12.label = 2;
                            vpr vprVar42 = vprVar2;
                            Collection collection62 = collection2;
                            CancelSimilarButton$State cancelSimilarButton$State42 = cancelSimilarButton$State2;
                            e = ru.yandex.taxi.widget.c.e(cVar3, formattedText3, null, false, cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$12, 30);
                            if (e != coroutineSingletons) {
                                charSequence3 = charSequence4;
                                it4 = it2;
                                obj2 = e;
                                collection = collection62;
                                cancelSimilarButton$State6 = cancelSimilarButton$State42;
                                button3 = button;
                                vprVar = vprVar42;
                                collection3.add(new oz7(charSequence3, ((ufu) hVar.h).b(button3.b), (CharSequence) obj2, button3.d, cancelSimilarButton$State6));
                                it = it4;
                                cancelSimilarButton$State = cancelSimilarButton$State6;
                                if (it.hasNext()) {
                                    list = (List) collection;
                                    if (list == null) {
                                        list = EmptyList.a;
                                    }
                                    cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$12.L$0 = null;
                                    cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$12.L$1 = null;
                                    cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$12.L$2 = null;
                                    cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$12.L$3 = null;
                                    cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$12.L$4 = null;
                                    cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$12.L$5 = null;
                                    cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$12.L$6 = null;
                                    cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$12.L$7 = null;
                                    cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$12.L$8 = null;
                                    cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$12.L$9 = null;
                                    cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$12.L$10 = null;
                                    cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$12.L$11 = null;
                                    cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$12.L$12 = null;
                                    cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$12.L$13 = null;
                                    cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$12.L$14 = null;
                                    cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$12.label = 3;
                                }
                            }
                        }
                        return coroutineSingletons;
                    }
                }
            }
        }
        cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$1 = new CancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cancelSimilarOrdersFeatureInteractor$buttonsFlow$$inlined$map$1$2$1.label;
        h hVar2 = this.c;
        if (i != 0) {
        }
    }
}
