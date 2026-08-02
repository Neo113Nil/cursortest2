package xsna;

import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.dto.messages.MsgIdType;
import com.vk.im.engine.commands.messages.MsgHistoryCreator;
import com.vk.im.engine.models.Order;
import com.vk.im.engine.models.dialogs.Dialog;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: MsgHistoryGetCmd.kt */
/* loaded from: classes2.dex */
public final class pj30 extends le6<gj30> {
    public final Peer b;
    public final de c;
    public final int d;
    public final Source e;
    public final boolean f;
    public final Object g;
    public final Order h;
    public final f9w i;

    /* compiled from: MsgHistoryGetCmd.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Source.values().length];
            try {
                iArr[Source.CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Source.NETWORK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Source.ACTUAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public pj30(Peer peer, de deVar, int i, Source source, boolean z, Object obj) {
        Order order = Order.ASC;
        this.b = peer;
        this.c = deVar;
        this.d = i;
        this.e = source;
        this.f = z;
        this.g = obj;
        this.h = order;
        this.i = e9w.b("MsgHistoryGetCmd");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004e, code lost:
    
        if (r8 != false) goto L39;
     */
    @Override // xsna.le6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final gj30 e(w2w w2wVar) {
        int i = a.$EnumSwitchMapping$0[this.e.ordinal()];
        Order order = this.h;
        de deVar = this.c;
        Peer peer = this.b;
        boolean z = true;
        if (i == 1) {
            return f(w2wVar).a(peer, deVar, this.d, order);
        }
        if (i == 2) {
            return g(w2wVar, this.b, this.c, this.d, this.h);
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        qfu f = f(w2wVar);
        int i2 = this.d;
        gj30 a2 = f.a(peer, deVar, i2, order);
        if (deVar instanceof wj30) {
            z = dk30.c(a2, (wj30) deVar);
        } else if (deVar instanceof tj30) {
            boolean m = a2.m();
            boolean z2 = a2.p() || a2.o();
            if (!m) {
            }
            z = false;
        } else if (deVar instanceof vj30) {
            z = dk30.b(a2, (vj30) deVar);
        } else if (deVar instanceof rj30) {
            z = dk30.a(a2, (rj30) deVar);
        } else {
            if (!(deVar instanceof sj30)) {
                throw new NoWhenBranchMatchedException();
            }
            Dialog dialog = (Dialog) ((wpp) w2wVar.J0(this, new tqm(new sqm(this.b, Source.ACTUAL, this.f, this.g, 16))).await()).c.get(Long.valueOf(peer.b));
            if (dialog != null) {
                boolean Qb = dialog.Qb();
                int fc = dialog.fc();
                if (Qb) {
                    z = dk30.a(a2, new rj30(MsgIdType.CNV_ID, fc));
                } else {
                    if (Qb) {
                        throw new NoWhenBranchMatchedException();
                    }
                    z = dk30.c(a2, uj30.d);
                }
            }
            z = false;
        }
        return z ? a2 : g(w2wVar, peer, deVar, i2, order);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pj30)) {
            return false;
        }
        pj30 pj30Var = (pj30) obj;
        return epx.f(this.b, pj30Var.b) && epx.f(this.c, pj30Var.c) && this.d == pj30Var.d && this.e == pj30Var.e && this.f == pj30Var.f && epx.f(this.g, pj30Var.g) && this.h == pj30Var.h;
    }

    public final qfu f(w2w w2wVar) {
        return new qfu(w2wVar.I0().o(), new kly(w2wVar), new eyf(), w2wVar.I0(), new MsgHistoryCreator(this.i), new cf00(w2wVar, 4), w2wVar.getExperiments());
    }

    public final gj30 g(w2w w2wVar, Peer peer, de deVar, int i, Order order) {
        return new svf0(f(w2wVar), new mbl(w2wVar), new dvf0(w2wVar, this.f), w2wVar.I0().o(), new hkp(w2wVar)).c(peer, deVar, i, order);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        int b = qoy.b(io.reactivex.rxjava3.internal.operators.mixed.k.c(shy.a(this.d, (this.c.hashCode() + (Long.hashCode(this.b.b) * 31)) * 31, 31), 31, this.e), 31, this.f);
        Object obj = this.g;
        return this.h.hashCode() + ((b + (obj == null ? 0 : obj.hashCode())) * 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        return "MsgHistoryGetCmd(peer=" + this.b + ", mode=" + this.c + ", limit=" + this.d + ", source=" + this.e + ", awaitNetwork=" + this.f + ", changerTag=" + this.g + ", orderBy=" + this.h + ')';
    }
}
