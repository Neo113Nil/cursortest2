package com.yandex.passport.internal.methods;

import android.os.Bundle;
import defpackage.vg10;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes15.dex */
public abstract class b3 implements f {
    public final Object a;

    @Override // com.yandex.passport.internal.methods.f
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public List c(Bundle bundle) {
        String str = (String) this.a;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(str);
        if (parcelableArrayList != null) {
            return parcelableArrayList;
        }
        vg10.d("can't get required parcelable array list ".concat(str));
        return null;
    }

    @Override // com.yandex.passport.internal.methods.f
    public void d(Bundle bundle, Object obj) {
        bundle.putParcelableArrayList((String) this.a, new ArrayList<>((List) obj));
    }

    @Override // com.yandex.passport.internal.methods.f
    public String getKey() {
        return (String) this.a;
    }
}
