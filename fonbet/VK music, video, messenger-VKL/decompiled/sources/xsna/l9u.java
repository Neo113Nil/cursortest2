package xsna;

import com.google.android.gms.fitness.data.Bucket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: GoogleFitDataSource.kt */
/* loaded from: classes6.dex */
public final class l9u implements izs<ruk, s3q0> {
    public final /* synthetic */ lq9 b;

    public l9u(lq9 lq9Var) {
        this.b = lq9Var;
    }

    @Override // xsna.izs
    public final s3q0 invoke(ruk rukVar) {
        ruk rukVar2 = rukVar;
        xgx0 xgx0Var = xgx0.a;
        StringBuilder sb = new StringBuilder("GoogleFitDataProvider.readData() -> GF steps returned, sessions: ");
        List<Bucket> a = rukVar2.a();
        ArrayList arrayList = new ArrayList(c5g.u(a, 10));
        Iterator<T> it = a.iterator();
        while (it.hasNext()) {
            arrayList.add(((Bucket) it.next()).d);
        }
        sb.append(arrayList);
        sb.append(", thread: ");
        sb.append(Thread.currentThread().getName());
        String sb2 = sb.toString();
        xgx0Var.getClass();
        xgx0.a(sb2);
        this.b.resumeWith(rukVar2);
        return s3q0.a;
    }
}
