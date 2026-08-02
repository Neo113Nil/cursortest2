package com.yandex.go.flex.common.divkit;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import defpackage.c231;
import defpackage.ccj;
import defpackage.jxi;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.y131;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class a {
    public final Context a;
    public final tse b;

    public a(Context context, tse tseVar) {
        this.a = context;
        this.b = tseVar;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [com.yandex.go.flex.common.divkit.DynamicVariableUpdateInteractor$updateVariablesByConfig$configurationCallback$1] */
    public final void a(Iterable iterable, final com.yandex.div.core.expression.variables.a aVar) {
        final ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (obj instanceof ccj) {
                arrayList.add(obj);
            }
        }
        tje.N(this.b, null, null, new DynamicVariableUpdateInteractor$updateVariablesByConfig$1(this, new ComponentCallbacks() { // from class: com.yandex.go.flex.common.divkit.DynamicVariableUpdateInteractor$updateVariablesByConfig$configurationCallback$1
            @Override // android.content.ComponentCallbacks
            public void onConfigurationChanged(Configuration newConfig) {
                Iterable<ccj> iterable2 = arrayList;
                ArrayList arrayList2 = new ArrayList(tcc.n(iterable2, 10));
                Iterator<ccj> it = iterable2.iterator();
                while (it.hasNext()) {
                    it.next().getClass();
                    arrayList2.add(new y131("device.viewport.width", newConfig.screenWidthDp));
                }
                c231[] c231VarArr = (c231[]) arrayList2.toArray(new c231[0]);
                aVar.i((c231[]) Arrays.copyOf(c231VarArr, c231VarArr.length));
            }

            @Override // android.content.ComponentCallbacks
            @jxi
            public void onLowMemory() {
            }
        }, null), 3);
    }
}
