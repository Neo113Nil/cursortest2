package com.yandex.passport.internal.flags;

import defpackage.c6w;
import defpackage.d6w;
import defpackage.tcc;
import defpackage.y6i0;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

/* loaded from: classes8.dex */
public final class m extends g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String str, List list) {
        super(str, list);
        Flag$Type flag$Type = Flag$Type.BOOLEAN;
    }

    @Override // com.yandex.passport.internal.flags.g
    public final Object a(String str) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            d6w n = y6i0.n(0, jSONArray.length());
            ArrayList arrayList = new ArrayList(tcc.n(n, 10));
            c6w it = n.iterator();
            while (it.c) {
                arrayList.add(jSONArray.optString(it.nextInt()));
            }
            return arrayList;
        } catch (Exception unused) {
            return (List) this.b;
        }
    }
}
