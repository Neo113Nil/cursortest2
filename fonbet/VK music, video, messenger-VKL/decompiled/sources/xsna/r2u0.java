package xsna;

import androidx.annotation.NonNull;
import com.vk.dto.common.id.UserId;
import com.vk.libvideo.RangeCollection;
import com.vk.libvideo.storage.CachedVideoViewedSegments;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import xsna.irt0;

/* compiled from: ViewedSegments.java */
/* loaded from: classes.dex */
public final class r2u0 {
    public boolean b;
    public long c;
    public final crt0 a = new crt0(this);
    public final LinkedList<qg90<String, String>> d = new LinkedList<>();

    public final void a(CachedVideoViewedSegments cachedVideoViewedSegments) {
        qg90<UserId, Integer> qg90Var = new qg90<>(cachedVideoViewedSegments.q(), Integer.valueOf(cachedVideoViewedSegments.Ib()));
        bpn0 bpn0Var = irt0.d;
        CachedVideoViewedSegments a = irt0.b.a().a(qg90Var);
        if (a == null) {
            return;
        }
        if (a.Eb().equals(cachedVideoViewedSegments.Eb())) {
            irt0.b.a().d(qg90Var);
        } else {
            RangeCollection.g(a.Eb(), cachedVideoViewedSegments.Eb());
            irt0.b.a().e(a);
        }
    }

    public final void b(@NonNull CachedVideoViewedSegments cachedVideoViewedSegments) {
        CachedVideoViewedSegments zb;
        cachedVideoViewedSegments.Eb().d();
        if (cachedVideoViewedSegments.Eb().e()) {
            bpn0 bpn0Var = irt0.d;
            irt0.b.a().e(cachedVideoViewedSegments);
            zb = cachedVideoViewedSegments.zb();
        } else {
            zb = null;
        }
        if (zb == null || !zb.Jb() || zb.Ib() == 0 || !fkq0.c(zb.q())) {
            return;
        }
        crt0 crt0Var = this.a;
        crt0Var.c.addLast(zb);
        io.reactivex.rxjava3.disposables.c cVar = crt0Var.b;
        if (cVar == null || cVar.h()) {
            crt0Var.a();
        }
    }

    public final void c() {
        if (this.b) {
            return;
        }
        bpn0 bpn0Var = irt0.d;
        irt0 a = irt0.b.a();
        boolean c = a.c();
        this.b = c;
        if (c) {
            Iterator it = new ArrayList(a.b()).iterator();
            while (it.hasNext()) {
                b((CachedVideoViewedSegments) it.next());
            }
        }
    }
}
