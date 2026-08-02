package com.google.android.gms.internal.play_billing;

import defpackage.ms91;
import defpackage.wp91;
import java.util.Collection;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes11.dex */
public abstract class e {
    public static boolean a(Comparator comparator, Collection collection) {
        Object obj;
        comparator.getClass();
        collection.getClass();
        if (collection instanceof SortedSet) {
            obj = ((SortedSet) collection).comparator();
            if (obj == null) {
                obj = zzdc.a;
            }
        } else {
            if (!(collection instanceof zzcw)) {
                return false;
            }
            obj = ((zzcw) collection).c;
        }
        return comparator.equals(obj);
    }

    public static wp91 b(wp91 wp91Var, ScheduledExecutorService scheduledExecutorService) {
        if (wp91Var.isDone()) {
            return wp91Var;
        }
        ms91 ms91Var = new ms91();
        ms91Var.A = wp91Var;
        h hVar = new h();
        hVar.a = ms91Var;
        ms91Var.B = scheduledExecutorService.schedule(hVar, 28500L, TimeUnit.MILLISECONDS);
        wp91Var.d(hVar, zzed.zza);
        return ms91Var;
    }
}
