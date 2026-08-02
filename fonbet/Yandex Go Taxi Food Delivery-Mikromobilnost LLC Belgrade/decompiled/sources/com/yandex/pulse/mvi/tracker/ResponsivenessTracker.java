package com.yandex.pulse.mvi.tracker;

import android.util.SparseArray;
import com.yandex.pulse.mvi.utils.WeakHandler;
import defpackage.av20;
import defpackage.gfp0;
import defpackage.h6u;
import defpackage.kdh;
import defpackage.lwa0;
import defpackage.owj0;
import defpackage.qwj0;
import defpackage.v941;
import defpackage.y60;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes8.dex */
public class ResponsivenessTracker {
    public final av20 a;
    public final long b;
    public final boolean c;
    public final long d;
    public final kdh e;
    public final h6u f;
    public boolean g;
    public boolean h;
    public final SparseArray i;
    public final WeakHandler j;
    private final v941 mObservationCallback;

    public ResponsivenessTracker(av20 av20Var) {
        kdh kdhVar = new kdh();
        kdhVar.b = new ArrayList();
        this.e = kdhVar;
        this.f = new h6u(2, this);
        this.i = new SparseArray();
        owj0 owj0Var = new owj0(0, this);
        this.mObservationCallback = owj0Var;
        this.j = new WeakHandler(owj0Var);
        this.a = av20Var;
        this.b = Math.max(15000L, 1000L);
        this.c = true;
        this.d = Math.max(0L, 0L);
    }

    public final void a(Long l, lwa0 lwa0Var, lwa0 lwa0Var2) {
        if (this.h) {
            long max = Math.max(lwa0Var2.a - lwa0Var.a, l != null ? l.longValue() : 0L);
            kdh kdhVar = this.e;
            ArrayList arrayList = kdhVar.b;
            kdhVar.a++;
            if (max <= 1) {
                return;
            }
            int binarySearch = Collections.binarySearch(arrayList, Long.valueOf(max), new y60(21));
            if (binarySearch < 0) {
                binarySearch = (-binarySearch) - 1;
            }
            arrayList.add(binarySearch, Long.valueOf(max));
            if (arrayList.size() > 10) {
                arrayList.remove(arrayList.size() - 1);
            }
        }
    }

    public final void b(gfp0 gfp0Var) {
        this.i.put(gfp0Var.e(gfp0Var.b() == 5 ? gfp0Var.a() : 0), new qwj0(new lwa0(gfp0Var.c())));
    }
}
