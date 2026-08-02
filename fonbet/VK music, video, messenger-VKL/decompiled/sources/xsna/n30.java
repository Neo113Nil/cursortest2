package xsna;

import com.huawei.hms.health.aacl;
import com.huawei.hms.hihealth.data.HealthKitApiInvoker;
import com.vk.dto.music.Playlist;
import com.vk.log.L;
import com.vk.newsfeed.impl.data.database.entity.action.SyncStatusEntity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.collections.EmptyList;
import org.chromium.base.task.AsyncTask;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class n30 implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n30(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Object lambda$new$1;
        Void aab;
        switch (this.b) {
            case 0:
                v30 v30Var = (v30) this.c;
                try {
                    List<a70> b = v30Var.b().b(SyncStatusEntity.NOT_SYNCED);
                    v30Var.b().d(b, SyncStatusEntity.SYNC_IN_PROGRESS);
                    List<a70> list = b;
                    ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                    for (a70 a70Var : list) {
                        arrayList.add(cn00.a(new a70(a70Var.a, a70Var.b, a70Var.c, SyncStatusEntity.SYNC_IN_PROGRESS, a70Var.e, a70Var.f, a70Var.g)));
                    }
                    return arrayList;
                } catch (Exception e) {
                    L.j(e, "Offline:ActionLocalRepositoryImpl", "Error getting all not synced actions.");
                    com.vk.metrics.eventtracking.b.a.a(e);
                    return EmptyList.b;
                }
            case 1:
                lambda$new$1 = ((AsyncTask) this.c).lambda$new$1();
                return lambda$new$1;
            case 2:
                jq40 jq40Var = (jq40) this.c;
                ArrayList L = jq40Var.L(jq40Var.E().j(o25.a().c()));
                ArrayList arrayList2 = new ArrayList();
                Iterator it = L.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (!((Playlist) next).y.isEmpty()) {
                        arrayList2.add(next);
                    }
                }
                return arrayList2;
            default:
                aab = aacl.aab((HealthKitApiInvoker) this.c);
                return aab;
        }
    }
}
