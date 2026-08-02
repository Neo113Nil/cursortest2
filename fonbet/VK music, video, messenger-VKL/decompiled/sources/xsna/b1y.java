package xsna;

import com.vk.content.design.view.camera.CameraUIView;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.Peer;
import com.vk.stat.scheme.CommonOnboardingStat$TypeUiHintItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.LongAdder;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* compiled from: JreLongAdder.java */
@IgnoreJRERequirement
/* loaded from: classes8.dex */
public final class b1y implements a300, g0m0, bu90, g6p0 {
    public final /* synthetic */ int b;
    public final Object c;

    public /* synthetic */ b1y(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.bu90
    public void a(Peer peer) {
        w2w w2wVar = (w2w) this.c;
        xgl0 I0 = w2wVar.I0();
        long j = peer.b;
        boolean n = w2wVar.getExperiments().n();
        List singletonList = Collections.singletonList(Long.valueOf(j));
    }

    @Override // xsna.a300
    public void add(long j) {
        ((LongAdder) this.c).add(j);
    }

    @Override // xsna.a300
    public long b() {
        return ((LongAdder) this.c).sumThenReset();
    }

    @Override // xsna.f6p0
    public void c() {
        k5p0 k5p0Var = (k5p0) ((bpn0) this.c).getValue();
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        k5p0Var.getClass();
        k5p0Var.b = System.currentTimeMillis();
        iid0 iid0Var = new iid0();
        SchemeStat$TypeAction b = SchemeStat$TypeAction.a.b(null, null, new CommonOnboardingStat$TypeUiHintItem(k5p0Var.a, CommonOnboardingStat$TypeUiHintItem.Action.TOOLTIP_SHOW, 0), 3);
        iid0Var.f = c;
        iid0Var.g = b;
        iid0Var.q();
    }

    @Override // xsna.f6p0
    public void d(int i) {
        bpn0 bpn0Var = (bpn0) this.c;
        if (i == 1 || i == 3) {
            k5p0 k5p0Var = (k5p0) bpn0Var.getValue();
            UiTracker uiTracker = UiTracker.a;
            MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
            k5p0Var.getClass();
            iid0 iid0Var = new iid0();
            SchemeStat$TypeAction b = SchemeStat$TypeAction.a.b(null, null, new CommonOnboardingStat$TypeUiHintItem(k5p0Var.a, CommonOnboardingStat$TypeUiHintItem.Action.TOOLTIP_HIDE_BY_CLICK, (int) (System.currentTimeMillis() - k5p0Var.b)), 3);
            iid0Var.f = c;
            iid0Var.g = b;
            iid0Var.q();
            return;
        }
        k5p0 k5p0Var2 = (k5p0) bpn0Var.getValue();
        UiTracker uiTracker2 = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c2 = UiTracker.c();
        k5p0Var2.getClass();
        iid0 iid0Var2 = new iid0();
        SchemeStat$TypeAction b2 = SchemeStat$TypeAction.a.b(null, null, new CommonOnboardingStat$TypeUiHintItem(k5p0Var2.a, CommonOnboardingStat$TypeUiHintItem.Action.TOOLTIP_HIDE_BY_INTERFACE_INTERACTION, (int) (System.currentTimeMillis() - k5p0Var2.b)), 3);
        iid0Var2.f = c2;
        iid0Var2.g = b2;
        iid0Var2.q();
    }

    public boolean e(int i) {
        p8v p8vVar = (p8v) this.c;
        if (i >= 0 && i < p8vVar.b) {
        }
        return false;
    }

    public void f() {
        PriorityQueue priorityQueue = (PriorityQueue) this.c;
        Exception exc = (Exception) priorityQueue.poll();
        if (exc != null) {
            while (!priorityQueue.isEmpty()) {
                Exception exc2 = (Exception) priorityQueue.poll();
                if (exc2 != null) {
                    exc.addSuppressed(exc2);
                }
            }
            throw exc;
        }
    }

    public void g(Future future) {
        boolean z;
        PriorityQueue priorityQueue = (PriorityQueue) this.c;
        try {
            if (priorityQueue.peek() instanceof InterruptedException) {
                z = true;
            } else {
                future.get();
                z = false;
            }
        } catch (Exception e) {
            priorityQueue.add(e);
            z = e instanceof InterruptedException;
        }
        if (z) {
            future.cancel(true);
        }
    }

    @Override // xsna.g0m0
    public void o5(boolean z) {
        ((CameraUIView) this.c).M(false);
    }

    @Override // xsna.a300
    public void reset() {
        ((LongAdder) this.c).reset();
    }

    @Override // xsna.a300
    public long sum() {
        return ((LongAdder) this.c).sum();
    }

    public String toString() {
        switch (this.b) {
            case 0:
                return ((LongAdder) this.c).toString();
            default:
                return super.toString();
        }
    }

    public b1y(String str) {
        this.b = 9;
        this.c = new bpn0(new orj0(str, 10));
    }

    public b1y(byte b, int i) {
        this.b = i;
        switch (i) {
            case 7:
                this.c = new Object();
                break;
            default:
                this.c = new LongAdder();
                break;
        }
    }

    public b1y(int i) {
        this.b = 4;
        this.c = new PriorityQueue(i, new q1q(new f6g((byte) 0, 5)));
    }
}
