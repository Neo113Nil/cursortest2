package com.yandex.passport.internal.methods;

import android.os.Bundle;
import defpackage.tcc;
import defpackage.vg10;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* loaded from: classes8.dex */
public final class d2 extends x2 {
    public final ArrayList b;
    public final ArrayList c;
    public final d3 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(Bundle bundle) {
        super(MethodRef.OverrideExperiments);
        Set<String> keySet = bundle.keySet();
        ArrayList arrayList = new ArrayList(tcc.n(keySet, 10));
        for (String str : keySet) {
            String string = bundle.getString(str);
            if (string == null) {
                vg10.d("can't get required string ".concat(str));
                throw null;
            }
            arrayList.add(new k3(str, string));
        }
        this.b = arrayList;
        this.c = arrayList;
        this.d = d3.w;
    }

    @Override // com.yandex.passport.internal.methods.x2
    public final List b() {
        return this.c;
    }

    @Override // com.yandex.passport.internal.methods.x2
    public final f c() {
        return this.d;
    }
}
