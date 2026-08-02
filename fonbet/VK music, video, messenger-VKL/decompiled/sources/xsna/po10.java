package xsna;

import com.vk.movika.sdk.base.model.t;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: MaxSeekPositionExt.kt */
/* loaded from: classes3.dex */
public final class po10 {
    public static final long a(com.vk.movika.sdk.base.model.t tVar, long j) {
        t.d dVar = tVar instanceof t.d ? (t.d) tVar : null;
        return dVar != null ? dVar.b : j;
    }

    public static final boolean b(com.vk.movika.sdk.base.model.t tVar, long j) {
        if (tVar.equals(t.a.c)) {
            return true;
        }
        if (tVar.equals(t.c.b)) {
            return false;
        }
        if (tVar instanceof t.d) {
            return ((t.d) tVar).b >= j;
        }
        throw new NoWhenBranchMatchedException();
    }
}
