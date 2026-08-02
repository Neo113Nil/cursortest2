package androidx.work.impl.workers;

import android.content.Context;
import androidx.room.RoomDatabase;
import androidx.room.util.a;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.b;
import defpackage.d3x0;
import defpackage.hgz;
import defpackage.ia51;
import defpackage.iuy;
import defpackage.juy;
import defpackage.ka51;
import defpackage.pzy0;
import defpackage.scj;
import defpackage.u431;
import defpackage.v951;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/work/impl/workers/DiagnosticsWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "parameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DiagnosticsWorker extends Worker {
    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // androidx.work.Worker
    public final juy doWork() {
        b i = b.i(getApplicationContext());
        WorkDatabase workDatabase = i.c;
        ia51 X0 = workDatabase.X0();
        v951 V0 = workDatabase.V0();
        ka51 Y0 = workDatabase.Y0();
        d3x0 U0 = workDatabase.U0();
        i.b.d.getClass();
        List list = (List) a.b(X0.a, true, false, new pzy0(System.currentTimeMillis() - 86400000, 6));
        RoomDatabase roomDatabase = X0.a;
        List list2 = (List) a.b(roomDatabase, true, false, new u431(14));
        List list3 = (List) a.b(roomDatabase, true, false, new u431(18));
        if (!list.isEmpty()) {
            hgz g = hgz.g();
            String str = scj.a;
            g.h(str, "Recently completed work:\n\n");
            hgz.g().h(str, scj.a(V0, Y0, U0, list));
        }
        if (!list2.isEmpty()) {
            hgz g2 = hgz.g();
            String str2 = scj.a;
            g2.h(str2, "Running work:\n\n");
            hgz.g().h(str2, scj.a(V0, Y0, U0, list2));
        }
        if (!list3.isEmpty()) {
            hgz g3 = hgz.g();
            String str3 = scj.a;
            g3.h(str3, "Enqueued work:\n\n");
            hgz.g().h(str3, scj.a(V0, Y0, U0, list3));
        }
        return new iuy();
    }
}
