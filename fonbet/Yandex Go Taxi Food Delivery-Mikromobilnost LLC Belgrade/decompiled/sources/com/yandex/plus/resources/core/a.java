package com.yandex.plus.resources.core;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import com.yandex.plus.core.strings.PlusSdkBrandType;
import defpackage.cvu0;
import defpackage.i3y;
import defpackage.lld0;
import java.util.Map;

/* loaded from: classes8.dex */
public final class a implements lld0 {
    public final PlusSdkBrandType a;
    public final Resources b;
    public final i3y c = kotlin.a.a(PlusSdkStringsResolverImpl$cachedResId$2.b);

    public a(Context context, PlusSdkBrandType plusSdkBrandType) {
        this.a = plusSdkBrandType;
        this.b = context.getApplicationContext().getResources();
    }

    public final int a(int i) {
        String resourceEntryName = this.b.getResourceEntryName(i);
        boolean x = cvu0.x(resourceEntryName, "international.", false);
        PlusSdkBrandType plusSdkBrandType = PlusSdkBrandType.YANDEX;
        PlusSdkBrandType plusSdkBrandType2 = this.a;
        return (plusSdkBrandType2 == plusSdkBrandType && x) ? b(i, resourceEntryName.substring(14)) : (plusSdkBrandType2 != PlusSdkBrandType.YANGO || x) ? i : b(i, "international.".concat(resourceEntryName));
    }

    public final int b(int i, String str) {
        Resources resources = this.b;
        String str2 = resources.getResourcePackageName(i) + ':' + resources.getResourceTypeName(i) + '/' + str;
        Map map = (Map) this.c.getValue();
        Object obj = map.get(str2);
        if (obj == null) {
            TypedValue typedValue = new TypedValue();
            resources.getValue(str2, typedValue, true);
            obj = Integer.valueOf(typedValue.resourceId);
            map.put(str2, obj);
        }
        return ((Number) obj).intValue();
    }
}
