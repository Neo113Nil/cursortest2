package com.yandex.go.taxi.order.support.data.mappers;

import com.yandex.go.taxi.order.models.api.cancel.ActionButtonDto;
import com.yandex.go.taxi.order.models.api.cancel.ButtonsArrangementDto;
import com.yandex.go.taxi.order.models.api.cancel.ModalWindowInfo;
import com.yandex.go.taxi.order.support.domain.entities.SupportButtonsArrangement;
import defpackage.akw0;
import defpackage.bvf0;
import defpackage.jiw0;
import defpackage.jjw0;
import defpackage.k7x0;
import defpackage.niw0;
import defpackage.ny61;
import defpackage.pdc;
import defpackage.tcc;
import defpackage.w511;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.widget.c;

/* loaded from: classes14.dex */
public final class a {
    public final c a;
    public final k7x0 b;
    public final pdc c;

    public a(pdc pdcVar, k7x0 k7x0Var, c cVar) {
        this.a = cVar;
        this.b = k7x0Var;
        this.c = pdcVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x009a -> B:10:0x009d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, ModalWindowInfo modalWindowInfo, String str, ContinuationImpl continuationImpl) {
        SupportItemMapper$convertModalViewAction$1 supportItemMapper$convertModalViewAction$1;
        int i;
        ModalWindowInfo modalWindowInfo2;
        Collection collection;
        Iterator it;
        String str2;
        SupportButtonsArrangement supportButtonsArrangement;
        aVar.getClass();
        if (continuationImpl instanceof SupportItemMapper$convertModalViewAction$1) {
            supportItemMapper$convertModalViewAction$1 = (SupportItemMapper$convertModalViewAction$1) continuationImpl;
            int i2 = supportItemMapper$convertModalViewAction$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                supportItemMapper$convertModalViewAction$1.label = i2 - Integer.MIN_VALUE;
                Object obj = supportItemMapper$convertModalViewAction$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = supportItemMapper$convertModalViewAction$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    List list = modalWindowInfo.e;
                    ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                    Iterator it2 = list.iterator();
                    modalWindowInfo2 = modalWindowInfo;
                    collection = arrayList;
                    it = it2;
                    str2 = str;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    collection = (Collection) supportItemMapper$convertModalViewAction$1.L$8;
                    it = (Iterator) supportItemMapper$convertModalViewAction$1.L$5;
                    Collection collection2 = (Collection) supportItemMapper$convertModalViewAction$1.L$4;
                    str2 = (String) supportItemMapper$convertModalViewAction$1.L$1;
                    ModalWindowInfo modalWindowInfo3 = (ModalWindowInfo) supportItemMapper$convertModalViewAction$1.L$0;
                    kotlin.b.b(obj);
                    collection.add((niw0) obj);
                    collection = collection2;
                    modalWindowInfo2 = modalWindowInfo3;
                    if (it.hasNext()) {
                        ActionButtonDto actionButtonDto = (ActionButtonDto) it.next();
                        supportItemMapper$convertModalViewAction$1.L$0 = modalWindowInfo2;
                        supportItemMapper$convertModalViewAction$1.L$1 = str2;
                        supportItemMapper$convertModalViewAction$1.L$2 = null;
                        supportItemMapper$convertModalViewAction$1.L$3 = null;
                        supportItemMapper$convertModalViewAction$1.L$4 = collection;
                        supportItemMapper$convertModalViewAction$1.L$5 = it;
                        supportItemMapper$convertModalViewAction$1.L$6 = null;
                        supportItemMapper$convertModalViewAction$1.L$7 = null;
                        supportItemMapper$convertModalViewAction$1.L$8 = collection;
                        supportItemMapper$convertModalViewAction$1.label = 1;
                        Object n = bvf0.n(new SupportItemMapper$convertActionButton$2(aVar, actionButtonDto, str2, null), supportItemMapper$convertModalViewAction$1);
                        if (n == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        modalWindowInfo3 = modalWindowInfo2;
                        obj = n;
                        collection2 = collection;
                        collection.add((niw0) obj);
                        collection = collection2;
                        modalWindowInfo2 = modalWindowInfo3;
                        if (it.hasNext()) {
                            List list2 = (List) collection;
                            ButtonsArrangementDto buttonsArrangementDto = modalWindowInfo2.d;
                            int i3 = buttonsArrangementDto == null ? -1 : jjw0.a[buttonsArrangementDto.ordinal()];
                            if (i3 == -1) {
                                return null;
                            }
                            if (i3 == 1) {
                                supportButtonsArrangement = SupportButtonsArrangement.VERTICAL;
                            } else {
                                if (i3 != 2) {
                                    w511.b();
                                    return null;
                                }
                                supportButtonsArrangement = SupportButtonsArrangement.HORIZONTAL;
                            }
                            return new jiw0(new akw0(str2, modalWindowInfo2.a, modalWindowInfo2.b, modalWindowInfo2.c, supportButtonsArrangement, kotlin.collections.a.M(list2)));
                        }
                    }
                }
            }
        }
        supportItemMapper$convertModalViewAction$1 = new SupportItemMapper$convertModalViewAction$1(aVar, continuationImpl);
        Object obj2 = supportItemMapper$convertModalViewAction$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = supportItemMapper$convertModalViewAction$1.label;
        if (i != 0) {
        }
    }
}
