package xsna;

import android.annotation.SuppressLint;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;

/* compiled from: InvitesReporter.kt */
/* loaded from: classes2.dex */
public final class osx {
    public static final osx a = new osx();

    @SuppressLint({"CheckResult"})
    public final void a(Peer peer, String str) {
        d1e0 d1e0Var = new d1e0(new g1e0(peer, Source.CACHE));
        a1w a1wVar = q1w.a;
        if (a1wVar == null) {
            a1wVar = null;
        }
        io.reactivex.rxjava3.kotlin.c.e(a1wVar.E(this, d1e0Var), new jr3(21), new fh1(16, peer, str));
    }
}
