package xsna;

import android.content.Context;
import androidx.work.Data;
import androidx.work.ExistingPeriodicWorkPolicy;
import androidx.work.ExistingWorkPolicy;
import androidx.work.NetworkType;
import androidx.work.c;
import androidx.work.d;
import androidx.work.e;
import com.vk.libdelayedjobs.WorkPolicy;
import com.vk.libdelayedjobs.impl.JobWorker;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: DelayedJobsManagerImpl.kt */
/* loaded from: classes.dex */
public final class xsl implements wsl {
    public final Context a;
    public final bpn0 b = new bpn0(new f25(this, 2));

    /* compiled from: DelayedJobsManagerImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WorkPolicy.values().length];
            try {
                iArr[WorkPolicy.KEEP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WorkPolicy.REPLACE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WorkPolicy.UPDATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public xsl(Context context) {
        this.a = context;
    }

    public static Data b(tsl tslVar) {
        String canonicalName = tslVar.getClass().getCanonicalName();
        fyx fyxVar = tslVar.b;
        Data.a aVar = new Data.a();
        String jSONObject = fyxVar.a.toString();
        LinkedHashMap linkedHashMap = aVar.a;
        linkedHashMap.put("job_args", jSONObject);
        linkedHashMap.put("job_class_name", canonicalName);
        return aVar.a();
    }

    public static void d(e.a aVar, usl uslVar) {
        b560 b560Var = new b560(null);
        NetworkType networkType = NetworkType.NOT_REQUIRED;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (uslVar.c) {
            networkType = NetworkType.CONNECTED;
            b560Var = new b560(null);
        }
        aVar.f(new p6j(b560Var, networkType, uslVar.e, uslVar.d, false, uslVar.f, -1L, -1L, j5g.S0(linkedHashSet)));
    }

    @Override // xsna.wsl
    public final void a(String str, tsl tslVar, usl uslVar) {
        ExistingWorkPolicy existingWorkPolicy;
        c.a g = new c.a(JobWorker.class).g(uslVar.b, TimeUnit.MILLISECONDS);
        String str2 = uslVar.g;
        if (str2 != null) {
            g = g.a(str2);
        }
        c.a h = g.h(b(tslVar));
        d(h, uslVar);
        androidx.work.c b = h.b();
        int i = a.$EnumSwitchMapping$0[uslVar.a.ordinal()];
        if (i == 1) {
            existingWorkPolicy = ExistingWorkPolicy.KEEP;
        } else if (i == 2) {
            existingWorkPolicy = ExistingWorkPolicy.REPLACE;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            existingWorkPolicy = ExistingWorkPolicy.REPLACE;
        }
        awx0 awx0Var = (awx0) this.b.getValue();
        awx0Var.getClass();
        awx0Var.a(str, existingWorkPolicy, Collections.singletonList(b)).c();
    }

    public final void c(String str) {
        dwx0.h(this.a).c(str);
    }

    public final void e(String str, tsl tslVar, lx90 lx90Var) {
        ExistingPeriodicWorkPolicy existingPeriodicWorkPolicy;
        d.a aVar = new d.a(JobWorker.class, lx90Var.a, lx90Var.b);
        usl uslVar = lx90Var.c;
        d.a g = aVar.g(uslVar.b, TimeUnit.MILLISECONDS);
        String str2 = uslVar.g;
        if (str2 != null) {
            g = g.a(str2);
        }
        d.a h = g.h(b(tslVar));
        d(h, uslVar);
        androidx.work.d b = h.b();
        int i = a.$EnumSwitchMapping$0[uslVar.a.ordinal()];
        if (i == 1) {
            existingPeriodicWorkPolicy = ExistingPeriodicWorkPolicy.KEEP;
        } else if (i == 2) {
            existingPeriodicWorkPolicy = ExistingPeriodicWorkPolicy.CANCEL_AND_REENQUEUE;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            existingPeriodicWorkPolicy = ExistingPeriodicWorkPolicy.UPDATE;
        }
        ((awx0) this.b.getValue()).e(str, existingPeriodicWorkPolicy, b);
    }
}
