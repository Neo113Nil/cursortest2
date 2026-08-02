package com.yandex.go.shortcuts.dto.request;

import com.yandex.go.shortcuts.dto.response.StackCommon$StackItemType;
import defpackage.tcc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.KSerializer;

/* loaded from: classes8.dex */
public final class g {
    public static final List a(g gVar) {
        StackCommon$StackItemType[] values = StackCommon$StackItemType.values();
        ArrayList arrayList = new ArrayList();
        for (StackCommon$StackItemType stackCommon$StackItemType : values) {
            if (stackCommon$StackItemType != StackCommon$StackItemType.UNKNOWN) {
                arrayList.add(stackCommon$StackItemType);
            }
        }
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new StackItemTypeFeature((StackCommon$StackItemType) it.next()));
        }
        return Collections.singletonList(new VerticalStackItemFeature(arrayList2, 4));
    }

    public final KSerializer serializer() {
        return ProductsParam$$serializer.INSTANCE;
    }
}
