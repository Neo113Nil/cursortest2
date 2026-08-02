package com.google.android.play.core.splitinstall;

import android.os.Bundle;
import android.os.RemoteException;
import defpackage.atx0;
import defpackage.mvt0;
import defpackage.x891;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
final class zzaz extends zzbb {
    public zzaz(x891 x891Var, atx0 atx0Var) {
        super(x891Var, atx0Var);
    }

    @Override // com.google.android.play.core.splitinstall.zzbb, com.google.android.play.core.splitinstall.internal.zzbp, com.google.android.play.core.splitinstall.internal.zzbq
    public final void zzh(List list) throws RemoteException {
        super.zzh(list);
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mvt0.m((Bundle) it.next()));
        }
        this.zza.c(arrayList);
    }
}
