package com.google.android.play.core.splitinstall;

import android.os.Bundle;
import android.os.RemoteException;
import defpackage.atx0;
import defpackage.c3b1;
import defpackage.cub1;
import defpackage.x891;
import defpackage.z7b1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes11.dex */
public final class a extends cub1 {
    public final /* synthetic */ Collection b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ c3b1 w;
    public final /* synthetic */ atx0 x;
    public final /* synthetic */ x891 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(x891 x891Var, atx0 atx0Var, ArrayList arrayList, ArrayList arrayList2, c3b1 c3b1Var, atx0 atx0Var2) {
        super(atx0Var);
        this.y = x891Var;
        this.b = arrayList;
        this.c = arrayList2;
        this.w = c3b1Var;
        this.x = atx0Var2;
    }

    @Override // defpackage.cub1
    public final void a() {
        atx0 atx0Var = this.x;
        x891 x891Var = this.y;
        c3b1 c3b1Var = this.w;
        Collection collection = this.b;
        ArrayList b = x891.b(collection);
        ArrayList arrayList = this.c;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("language", str);
            arrayList2.add(bundle);
        }
        b.addAll(arrayList2);
        try {
            c3b1Var.a.add(new z7b1(2, System.currentTimeMillis()));
            x891Var.b.m.zzj(x891Var.a, b, x891.a(c3b1Var), new zzba(x891Var, atx0Var));
        } catch (RemoteException e) {
            x891.c.c(e, "startInstall(%s,%s)", collection, arrayList);
            atx0Var.b(new RuntimeException(e));
        }
    }
}
