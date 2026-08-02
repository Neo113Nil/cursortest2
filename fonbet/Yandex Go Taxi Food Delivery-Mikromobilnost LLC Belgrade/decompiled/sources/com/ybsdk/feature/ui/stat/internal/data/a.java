package com.ybsdk.feature.ui.stat.internal.data;

import com.ybsdk.core.utils.ext.c;
import com.ybsdk.feature.ui.stat.internal.data.network.UiStatEventsApi;
import com.ybsdk.feature.ui.stat.internal.data.network.dto.UiStatEventDto;
import com.ybsdk.feature.ui.stat.internal.data.network.dto.UiStatEventPayloadDto;
import com.ybsdk.feature.ui.stat.internal.data.network.dto.UiStatEventsRequest;
import defpackage.ny61;
import defpackage.qv10;
import defpackage.st11;
import defpackage.tcc;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class a {
    public final UiStatEventsApi a;

    public a(UiStatEventsApi uiStatEventsApi) {
        this.a = uiStatEventsApi;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(List list, ContinuationImpl continuationImpl) {
        UiStatEventRepository$sendEvents$1 uiStatEventRepository$sendEvents$1;
        int i;
        if (continuationImpl instanceof UiStatEventRepository$sendEvents$1) {
            uiStatEventRepository$sendEvents$1 = (UiStatEventRepository$sendEvents$1) continuationImpl;
            int i2 = uiStatEventRepository$sendEvents$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                uiStatEventRepository$sendEvents$1.label = i2 - Integer.MIN_VALUE;
                Object obj = uiStatEventRepository$sendEvents$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = uiStatEventRepository$sendEvents$1.label;
                if (i == 0) {
                    if (i == 1) {
                        b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj2 : list) {
                    String str = ((st11) obj2).a;
                    Object obj3 = linkedHashMap.get(str);
                    if (obj3 == null) {
                        obj3 = qv10.w(str, linkedHashMap);
                    }
                    ((List) obj3).add(obj2);
                }
                ArrayList arrayList = new ArrayList(linkedHashMap.size());
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    String str2 = (String) entry.getKey();
                    List<st11> list2 = (List) entry.getValue();
                    ArrayList arrayList2 = new ArrayList(tcc.n(list2, 10));
                    for (st11 st11Var : list2) {
                        arrayList2.add(new UiStatEventDto(st11Var.e, st11Var.b, new UiStatEventPayloadDto(st11Var.c.getValue(), st11Var.d)));
                    }
                    arrayList.add(new UiStatEventsRequest(str2, arrayList2));
                }
                UiStatEventRepository$sendEvents$2 uiStatEventRepository$sendEvents$2 = new UiStatEventRepository$sendEvents$2(this, arrayList, null);
                uiStatEventRepository$sendEvents$1.label = 1;
                Object c = c.c(uiStatEventRepository$sendEvents$2, uiStatEventRepository$sendEvents$1);
                return c == coroutineSingletons ? coroutineSingletons : c;
            }
        }
        uiStatEventRepository$sendEvents$1 = new UiStatEventRepository$sendEvents$1(this, continuationImpl);
        Object obj4 = uiStatEventRepository$sendEvents$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = uiStatEventRepository$sendEvents$1.label;
        if (i == 0) {
        }
    }
}
