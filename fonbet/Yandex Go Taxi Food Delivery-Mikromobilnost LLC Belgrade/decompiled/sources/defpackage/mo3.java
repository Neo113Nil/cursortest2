package defpackage;

import com.yandex.messaging.core.net.entities.Bucket;
import com.yandex.messaging.core.net.entities.BucketsData;

/* loaded from: classes15.dex */
public final class mo3 extends w920 {
    public final /* synthetic */ to3 a;
    public final /* synthetic */ Bucket.GetParams b;
    public final /* synthetic */ Class c;
    public final /* synthetic */ tls w;

    public mo3(to3 to3Var, Bucket.GetParams getParams, Class cls, tls tlsVar) {
        this.a = to3Var;
        this.b = getParams;
        this.c = cls;
        this.w = tlsVar;
    }

    @Override // defpackage.w920
    public final gg70 d(kvj0 kvj0Var) {
        Bucket a;
        gg70 b = ouu.b(this.a.b, "get_bucket", BucketsData.class, kvj0Var);
        return (!(b instanceof dg70) || (a = ((BucketsData) ((dg70) b).a).a(this.c)) == null) ? new gg70() : new dg70(a);
    }

    @Override // defpackage.w920
    public final void g(Object obj) {
        this.w.invoke((Bucket) obj);
    }

    @Override // defpackage.w920
    public final t4j0 i() {
        return this.a.b.a(this.b, "get_bucket");
    }
}
