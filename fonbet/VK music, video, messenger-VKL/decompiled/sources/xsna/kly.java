package xsna;

import com.google.common.collect.ImmutableList;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.music.analytics.api.collector.strategy.CollectorStrategy;
import com.vk.music.player.PlaySourceMeta;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;

/* compiled from: LabelViewFactoryImpl.kt */
/* loaded from: classes3.dex */
public final class kly implements g5q0, g530, vkk, gn60, CollectorStrategy {
    public final Object b;

    public /* synthetic */ kly(Object obj) {
        this.b = obj;
    }

    @Override // xsna.g530
    public void H2() {
        wr30 wr30Var = (wr30) this.b;
        xr30 xr30Var = wr30Var.m;
        if (xr30Var != null) {
            w530 w530Var = xr30Var.c;
            if (w530Var != null) {
                w530Var.d(xr30Var.e, wr30Var, new leq(17));
            } else {
                wr30Var.o1(null);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
    @Override // xsna.vkk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean a(wkk wkkVar, long j) {
        boolean z;
        int size;
        ArrayList arrayList = (ArrayList) this.b;
        long j2 = wkkVar.b;
        fxc0.p(j2 != C.TIME_UNSET);
        if (j2 <= j) {
            long j3 = wkkVar.d;
            if (j3 == C.TIME_UNSET || j < j3) {
                z = true;
                for (size = arrayList.size() - 1; size >= 0; size--) {
                    if (j2 >= ((wkk) arrayList.get(size)).b) {
                        arrayList.add(size + 1, wkkVar);
                        return z;
                    }
                    if (((wkk) arrayList.get(size)).b <= j) {
                        z = false;
                    }
                }
                arrayList.add(0, wkkVar);
                return z;
            }
        }
        z = false;
        while (size >= 0) {
        }
        arrayList.add(0, wkkVar);
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.g5q0
    public f5q0 b(Peer peer) {
        Dialog dialog = (Dialog) ((wpp) ((w2w) this.b).b1(this, new tqm(new sqm(peer, Source.CACHE, false, (Object) this, 16)))).e(Long.valueOf(peer.b)).b;
        if (dialog == null) {
            return null;
        }
        return new f5q0(dialog.Jb(), dialog.fc());
    }

    @Override // xsna.vkk
    public ImmutableList c(long j) {
        int h = h(j);
        if (h == 0) {
            ImmutableList.b bVar = ImmutableList.c;
            return com.google.common.collect.g.f;
        }
        wkk wkkVar = (wkk) ((ArrayList) this.b).get(h - 1);
        long j2 = wkkVar.d;
        if (j2 == C.TIME_UNSET || j < j2) {
            return wkkVar.a;
        }
        ImmutableList.b bVar2 = ImmutableList.c;
        return com.google.common.collect.g.f;
    }

    @Override // xsna.vkk
    public void clear() {
        ((ArrayList) this.b).clear();
    }

    @Override // xsna.vkk
    public long d(long j) {
        ArrayList arrayList = (ArrayList) this.b;
        if (arrayList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j < ((wkk) arrayList.get(0)).b) {
            return ((wkk) arrayList.get(0)).b;
        }
        for (int i = 1; i < arrayList.size(); i++) {
            wkk wkkVar = (wkk) arrayList.get(i);
            long j2 = wkkVar.b;
            long j3 = wkkVar.b;
            if (j < j2) {
                long j4 = ((wkk) arrayList.get(i - 1)).d;
                return (j4 == C.TIME_UNSET || j4 <= j || j4 >= j3) ? j3 : j4;
            }
        }
        long j5 = ((wkk) sd9.k(arrayList)).d;
        if (j5 == C.TIME_UNSET || j >= j5) {
            return Long.MIN_VALUE;
        }
        return j5;
    }

    @Override // xsna.vkk
    public void e(long j) {
        ArrayList arrayList = (ArrayList) this.b;
        int h = h(j);
        if (h == 0) {
            return;
        }
        long j2 = ((wkk) arrayList.get(h - 1)).d;
        if (j2 == C.TIME_UNSET || j2 >= j) {
            h--;
        }
        arrayList.subList(0, h).clear();
    }

    @Override // xsna.vkk
    public long f(long j) {
        ArrayList arrayList = (ArrayList) this.b;
        if (arrayList.isEmpty() || j < ((wkk) arrayList.get(0)).b) {
            return C.TIME_UNSET;
        }
        for (int i = 1; i < arrayList.size(); i++) {
            long j2 = ((wkk) arrayList.get(i)).b;
            if (j == j2) {
                return j2;
            }
            if (j < j2) {
                wkk wkkVar = (wkk) arrayList.get(i - 1);
                long j3 = wkkVar.d;
                return (j3 == C.TIME_UNSET || j3 > j) ? wkkVar.b : j3;
            }
        }
        wkk wkkVar2 = (wkk) sd9.k(arrayList);
        long j4 = wkkVar2.d;
        return (j4 == C.TIME_UNSET || j < j4) ? wkkVar2.b : j4;
    }

    @Override // com.vk.music.analytics.api.collector.strategy.CollectorStrategy
    public ax1 g(iwa0 iwa0Var) {
        long a = qni0.a();
        my1.a(a);
        return new cv40(a, ((hs90) this.b).a(iwa0Var));
    }

    public int h(long j) {
        ArrayList arrayList = (ArrayList) this.b;
        for (int i = 0; i < arrayList.size(); i++) {
            if (j < ((wkk) arrayList.get(i)).b) {
                return i;
            }
        }
        return arrayList.size();
    }

    @Override // com.vk.music.analytics.api.collector.strategy.CollectorStrategy
    public boolean j(iwa0 iwa0Var) {
        p4b0 p4b0Var = iwa0Var.b;
        return (!(p4b0Var.b.e.d instanceof PlaySourceMeta.VKMixPlaySourceMeta) || iwa0Var.m || p4b0Var.a) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gn60
    public List x(Pair pair, bp5 bp5Var) {
        throw null;
    }

    public kly(alk alkVar, g7s0 g7s0Var) {
        this.b = g7s0Var;
    }

    public kly() {
        this.b = new ArrayList();
    }

    @Override // xsna.g530
    public void g3() {
    }
}
