package com.yandex.passport.internal.ui.authsdk;

import com.yandex.passport.internal.network.response.ExternalApplicationPermissionsResult;
import defpackage.tcc;
import defpackage.ycc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class o {
    public static final ArrayList a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ycc.r(((ExternalApplicationPermissionsResult.Scope) it.next()).getPermissions(), arrayList);
        }
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((ExternalApplicationPermissionsResult.Permission) it2.next()).getCode());
        }
        return arrayList2;
    }
}
