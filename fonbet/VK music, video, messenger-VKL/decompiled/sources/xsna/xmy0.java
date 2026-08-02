package xsna;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;

/* compiled from: PacketStatus.java */
/* loaded from: classes8.dex */
public final class xmy0 extends jly0 {
    public boolean d;
    public boolean e;

    public xmy0() {
        throw null;
    }

    public final synchronized boolean a() {
        if (!this.e) {
            if (!this.d) {
                return true;
            }
        }
        return false;
    }

    public final synchronized boolean b() {
        if (this.e || this.d) {
            return false;
        }
        this.d = true;
        return true;
    }

    @Override // xsna.jly0
    public final String toString() {
        tly0 tly0Var = this.b;
        return "Packet " + tly0Var.n().name().charAt(0) + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + (tly0Var.p().longValue() >= 0 ? tly0Var.p() : ".") + "| |" + tly0Var.q() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + (this.e ? "Acked" : this.d ? "Lost" : "Inflight");
    }
}
