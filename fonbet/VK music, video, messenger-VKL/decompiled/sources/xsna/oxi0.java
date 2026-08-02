package xsna;

import android.content.Context;
import com.vk.stories.analytics.session.storage.permissions.CallReason;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import org.json.JSONObject;

/* compiled from: SessionTrackerImpl.kt */
/* loaded from: classes6.dex */
public final class oxi0 implements nxi0 {
    public Pair<Long, ky90> b;
    public final AtomicInteger a = new AtomicInteger(0);
    public final bpn0 c = new bpn0(new gc(27));
    public final bpn0 d = new bpn0(new z0h0(4));

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
    
        if (r10 == null) goto L18;
     */
    @Override // xsna.nxi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Context context, Long l, io.reactivex.rxjava3.core.x<JSONObject> xVar, String str, String str2) {
        s3q0 s3q0Var;
        if (this.a.getAndIncrement() == 0) {
            boolean z = l == null;
            b().a(l);
            Pair<Long, ky90> pair = this.b;
            if (pair != null) {
                long longValue = pair.d().longValue();
                ky90 g = pair.g();
                if (l != null && longValue == l.longValue()) {
                    d().d(g);
                    s3q0Var = s3q0.a;
                } else {
                    s3q0Var = null;
                }
            }
            d().a(context, CallReason.INIT, true, true);
            this.b = null;
            if (z) {
                xVar.subscribe(new t520(new qm90(10, str, str2), 17), new p350(new y510(24), 14));
            }
        }
    }

    @Override // xsna.nxi0
    public final uti0 b() {
        return (uti0) this.c.getValue();
    }

    @Override // xsna.nxi0
    public final void c(boolean z) {
        Long id;
        if (this.a.decrementAndGet() == 0) {
            if (z && (id = b().getId()) != null) {
                this.b = new Pair<>(Long.valueOf(id.longValue()), d().e());
            }
            b().b();
            d().c();
        }
    }

    @Override // xsna.nxi0
    public final ly90 d() {
        return (ly90) this.d.getValue();
    }
}
