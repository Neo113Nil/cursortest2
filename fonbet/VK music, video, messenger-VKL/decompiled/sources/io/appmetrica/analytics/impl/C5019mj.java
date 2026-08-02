package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.ecommerce.ECommerceScreen;
import java.util.List;
import java.util.Map;
import xsna.cjl0;

/* renamed from: io.appmetrica.analytics.impl.mj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5019mj {
    public final String a;
    public final List b;
    public final String c;
    public final Map d;

    public C5019mj(ECommerceScreen eCommerceScreen) {
        this(eCommerceScreen.getName(), eCommerceScreen.getSearchQuery(), CollectionUtils.arrayListCopyOfNullableCollection(eCommerceScreen.getCategoriesPath()), CollectionUtils.mapCopyOfNullableMap(eCommerceScreen.getPayload()));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScreenWrapper{name='");
        sb.append(this.a);
        sb.append("', categoriesPath=");
        sb.append(this.b);
        sb.append(", searchQuery='");
        sb.append(this.c);
        sb.append("', payload=");
        return cjl0.a(sb, this.d, '}');
    }

    public C5019mj(String str, String str2, List list, Map map) {
        this.a = str;
        this.b = list;
        this.c = str2;
        this.d = map;
    }
}
