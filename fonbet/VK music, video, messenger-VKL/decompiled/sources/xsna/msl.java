package xsna;

import android.content.Context;
import androidx.work.Data;
import androidx.work.ExistingWorkPolicy;
import androidx.work.NetworkType;
import androidx.work.c;
import com.vk.im.sync.impl.DeferredSyncWorker;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;

/* compiled from: DeferredSyncManager.kt */
/* loaded from: classes.dex */
public final class msl implements lsl {
    public final long a;
    public final bpn0 b;

    public msl(Context context, long j) {
        this.a = j;
        this.b = new bpn0(new o66(context, 3));
    }

    @Override // xsna.lsl
    public final void a(String str) {
        awx0 awx0Var = (awx0) this.b.getValue();
        ExistingWorkPolicy existingWorkPolicy = ExistingWorkPolicy.REPLACE;
        c.a g = new c.a(DeferredSyncWorker.class).a("com.vk.im.deferred_sync_job").g(this.a, TimeUnit.MILLISECONDS);
        Pair[] pairArr = {new Pair("sync_worker_caller", str)};
        Data.a aVar = new Data.a();
        Pair pair = pairArr[0];
        aVar.b(pair.j(), (String) pair.i());
        c.a h = g.h(aVar.a());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        androidx.work.c b = h.f(new p6j(new b560(null), NetworkType.CONNECTED, false, false, true, false, -1L, -1L, j5g.S0(linkedHashSet))).b();
        awx0Var.getClass();
        awx0Var.f("im_deferred_sync", existingWorkPolicy, Collections.singletonList(b));
    }
}
