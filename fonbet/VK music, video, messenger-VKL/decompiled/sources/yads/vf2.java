package yads;

import android.os.Handler;
import android.os.Message;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes10.dex */
public final class vf2 implements Handler.Callback {
    public final qe b;
    public final tf2 c;
    public c30 g;
    public boolean h;
    public boolean i;
    public boolean j;
    public final TreeMap f = new TreeMap();
    public final Handler e = mc3.a((Handler.Callback) this);
    public final ym0 d = new ym0();

    public vf2(c30 c30Var, com.monetization.ads.exo.source.dash.c cVar, qe qeVar) {
        this.g = c30Var;
        this.c = cVar;
        this.b = qeVar;
    }

    public final boolean a(long j) {
        boolean z;
        c30 c30Var = this.g;
        if (!c30Var.d) {
            return false;
        }
        if (this.i) {
            return true;
        }
        Map.Entry ceilingEntry = this.f.ceilingEntry(Long.valueOf(c30Var.h));
        if (ceilingEntry == null || ((Long) ceilingEntry.getValue()).longValue() >= j) {
            z = false;
        } else {
            long longValue = ((Long) ceilingEntry.getKey()).longValue();
            com.monetization.ads.exo.source.dash.i iVar = ((com.monetization.ads.exo.source.dash.c) this.c).a;
            long j2 = iVar.N;
            if (j2 == C.TIME_UNSET || j2 < longValue) {
                iVar.N = longValue;
            }
            z = true;
        }
        if (z && this.h) {
            this.i = true;
            this.h = false;
            com.monetization.ads.exo.source.dash.i iVar2 = ((com.monetization.ads.exo.source.dash.c) this.c).a;
            iVar2.D.removeCallbacks(iVar2.w);
            iVar2.h();
        }
        return z;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (this.j) {
            return true;
        }
        if (message.what != 1) {
            return false;
        }
        sf2 sf2Var = (sf2) message.obj;
        long j = sf2Var.a;
        long j2 = sf2Var.b;
        Long l = (Long) this.f.get(Long.valueOf(j2));
        if (l == null) {
            this.f.put(Long.valueOf(j2), Long.valueOf(j));
        } else if (l.longValue() > j) {
            this.f.put(Long.valueOf(j2), Long.valueOf(j));
        }
        return true;
    }
}
