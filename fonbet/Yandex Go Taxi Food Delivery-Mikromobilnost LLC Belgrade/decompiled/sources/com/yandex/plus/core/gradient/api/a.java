package com.yandex.plus.core.gradient.api;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public abstract class a {
    public static final PlusDrawable a(ArrayList arrayList) {
        return arrayList.size() == 1 ? (PlusDrawable) arrayList.get(0) : new MergedGradientDrawable(arrayList);
    }
}
