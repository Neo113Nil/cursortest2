package com.yandex.payment.sdk.xflags;

import android.os.Parcelable;
import defpackage.d0a0;
import defpackage.ifr;
import defpackage.jl40;
import defpackage.jnl;
import defpackage.pfr;
import defpackage.q96;
import defpackage.xl2;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class a {
    public static void a(Parcelable[] parcelableArr) {
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable instanceof ParcelableFlag) {
                pfr pfrVar = pfr.b;
                ParcelableFlag parcelableFlag = (ParcelableFlag) parcelable;
                if (((xl2) pfrVar.a.get(parcelableFlag.getName())) == null) {
                    if (jl40.l(parcelableFlag.getName(), d0a0.a.b) || jl40.l(parcelableFlag.getName(), ifr.a.b)) {
                        pfrVar.a(new q96(parcelableFlag.getName(), 0, Boolean.valueOf(jl40.l(parcelableFlag.getValue(), "true"))));
                    } else {
                        pfrVar.a(new q96(parcelableFlag.getName(), 1, parcelableFlag.getValue()));
                    }
                }
            }
        }
    }

    public static Parcelable[] b() {
        ParcelableFlag parcelableFlag;
        List<xl2> L0 = kotlin.collections.a.L0(kotlin.collections.a.M0(pfr.b.a.values()));
        ArrayList arrayList = new ArrayList();
        for (xl2 xl2Var : L0) {
            String str = xl2Var.b;
            jnl jnlVar = xl2Var.c.b;
            if (jl40.l(str, d0a0.a.b) || jl40.l(str, ifr.a.b)) {
                Object a = jnlVar.a();
                parcelableFlag = new ParcelableFlag(str, jl40.l(a instanceof Boolean ? (Boolean) a : null, Boolean.TRUE) ? "true" : "false");
            } else {
                Object a2 = jnlVar.a();
                String str2 = a2 instanceof String ? (String) a2 : null;
                if (str2 == null) {
                    str2 = xl2Var.a.toString();
                }
                parcelableFlag = new ParcelableFlag(str, str2);
            }
            arrayList.add(parcelableFlag);
        }
        return (Parcelable[]) arrayList.toArray(new Parcelable[0]);
    }
}
