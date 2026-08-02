package com.yandex.go.taxi.order.cancel.v2.data;

import android.graphics.drawable.Drawable;
import com.yandex.go.taxi.order.models.api.ChangeOrderState$Source;
import com.yandex.go.taxi.order.models.api.cancel.OrderCancelNotification;
import defpackage.jj70;
import defpackage.jl40;
import defpackage.lj70;
import defpackage.ny61;
import defpackage.oj70;
import defpackage.ol70;
import defpackage.pkf;
import defpackage.pwy0;
import defpackage.qj70;
import defpackage.uvb1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.utils.UiStateDrawableWrapper;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes14.dex */
public final class b {
    public final e a;
    public final pwy0 b;
    public final LinkedHashMap c = new LinkedHashMap();
    public final ArrayList d = new ArrayList();

    public b(e eVar, pwy0 pwy0Var) {
        this.a = eVar;
        this.b = pwy0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0110, code lost:
    
        r7 = r4;
        r4 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00bf -> B:10:0x00ca). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(b bVar, List list, ThemeType themeType, List list2, ContinuationImpl continuationImpl) {
        OrderCancelActionItemsRepository$toActionItems$1 orderCancelActionItemsRepository$toActionItems$1;
        int i;
        Iterator it;
        Collection collection;
        ThemeType themeType2;
        OrderCancelActionItemsRepository$toActionItems$1 orderCancelActionItemsRepository$toActionItems$12;
        List list3;
        bVar.getClass();
        if (continuationImpl instanceof OrderCancelActionItemsRepository$toActionItems$1) {
            orderCancelActionItemsRepository$toActionItems$1 = (OrderCancelActionItemsRepository$toActionItems$1) continuationImpl;
            int i2 = orderCancelActionItemsRepository$toActionItems$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                orderCancelActionItemsRepository$toActionItems$1.label = i2 - Integer.MIN_VALUE;
                Object obj = orderCancelActionItemsRepository$toActionItems$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderCancelActionItemsRepository$toActionItems$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ArrayList arrayList = new ArrayList();
                    it = list.iterator();
                    collection = arrayList;
                    themeType2 = themeType;
                    orderCancelActionItemsRepository$toActionItems$12 = orderCancelActionItemsRepository$toActionItems$1;
                    list3 = list2;
                    if (!it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    String str = (String) orderCancelActionItemsRepository$toActionItems$1.L$12;
                    qj70 j = (qj70) orderCancelActionItemsRepository$toActionItems$1.L$11;
                    OrderCancelNotification.ListItem listItem = (OrderCancelNotification.ListItem) orderCancelActionItemsRepository$toActionItems$1.L$10;
                    it = (Iterator) orderCancelActionItemsRepository$toActionItems$1.L$7;
                    collection = (Collection) orderCancelActionItemsRepository$toActionItems$1.L$5;
                    List list4 = (List) orderCancelActionItemsRepository$toActionItems$1.L$2;
                    ThemeType themeType3 = (ThemeType) orderCancelActionItemsRepository$toActionItems$1.L$1;
                    kotlin.b.b(obj);
                    UiStateDrawableWrapper g = pkf.g((Drawable) obj, str, themeType3);
                    boolean z = false;
                    if (jl40.l(j, lj70.a)) {
                        List list5 = list4;
                        if (!(list5 instanceof Collection) || !list5.isEmpty()) {
                            Iterator it2 = list5.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                if (((com.yandex.go.taxi.order.models.api.e) it2.next()).getB() == ChangeOrderState$Source.DRIVER) {
                                    z = true;
                                    break;
                                }
                            }
                        }
                    }
                    ol70 ol70Var = new ol70(g, listItem.b, j, z);
                    OrderCancelActionItemsRepository$toActionItems$1 orderCancelActionItemsRepository$toActionItems$13 = orderCancelActionItemsRepository$toActionItems$1;
                    list3 = list4;
                    themeType2 = themeType3;
                    if (ol70Var != null) {
                        collection.add(ol70Var);
                    }
                    orderCancelActionItemsRepository$toActionItems$12 = orderCancelActionItemsRepository$toActionItems$13;
                    if (!it.hasNext()) {
                        listItem = (OrderCancelNotification.ListItem) it.next();
                        j = uvb1.j(listItem.c);
                        if ((j instanceof oj70) || (j instanceof jj70)) {
                            orderCancelActionItemsRepository$toActionItems$13 = orderCancelActionItemsRepository$toActionItems$12;
                            ol70Var = null;
                            if (ol70Var != null) {
                            }
                            orderCancelActionItemsRepository$toActionItems$12 = orderCancelActionItemsRepository$toActionItems$13;
                            if (!it.hasNext()) {
                                return (List) collection;
                            }
                        } else {
                            String str2 = listItem.a;
                            e eVar = bVar.a;
                            orderCancelActionItemsRepository$toActionItems$12.L$0 = null;
                            orderCancelActionItemsRepository$toActionItems$12.L$1 = themeType2;
                            orderCancelActionItemsRepository$toActionItems$12.L$2 = list3;
                            orderCancelActionItemsRepository$toActionItems$12.L$3 = null;
                            orderCancelActionItemsRepository$toActionItems$12.L$4 = null;
                            orderCancelActionItemsRepository$toActionItems$12.L$5 = collection;
                            orderCancelActionItemsRepository$toActionItems$12.L$6 = null;
                            orderCancelActionItemsRepository$toActionItems$12.L$7 = it;
                            orderCancelActionItemsRepository$toActionItems$12.L$8 = null;
                            orderCancelActionItemsRepository$toActionItems$12.L$9 = null;
                            orderCancelActionItemsRepository$toActionItems$12.L$10 = listItem;
                            orderCancelActionItemsRepository$toActionItems$12.L$11 = j;
                            orderCancelActionItemsRepository$toActionItems$12.L$12 = str2;
                            orderCancelActionItemsRepository$toActionItems$12.label = 1;
                            Object i3 = e.i(eVar, str2, null, orderCancelActionItemsRepository$toActionItems$12, 14);
                            if (i3 == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            themeType3 = themeType2;
                            obj = i3;
                            list4 = list3;
                            orderCancelActionItemsRepository$toActionItems$1 = orderCancelActionItemsRepository$toActionItems$12;
                            str = str2;
                            UiStateDrawableWrapper g2 = pkf.g((Drawable) obj, str, themeType3);
                            boolean z2 = false;
                            if (jl40.l(j, lj70.a)) {
                            }
                            ol70 ol70Var2 = new ol70(g2, listItem.b, j, z2);
                            OrderCancelActionItemsRepository$toActionItems$1 orderCancelActionItemsRepository$toActionItems$132 = orderCancelActionItemsRepository$toActionItems$1;
                            list3 = list4;
                            themeType2 = themeType3;
                            if (ol70Var2 != null) {
                            }
                            orderCancelActionItemsRepository$toActionItems$12 = orderCancelActionItemsRepository$toActionItems$132;
                            if (!it.hasNext()) {
                            }
                        }
                    }
                }
            }
        }
        orderCancelActionItemsRepository$toActionItems$1 = new OrderCancelActionItemsRepository$toActionItems$1(bVar, continuationImpl);
        Object obj2 = orderCancelActionItemsRepository$toActionItems$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderCancelActionItemsRepository$toActionItems$1.label;
        if (i != 0) {
        }
    }
}
