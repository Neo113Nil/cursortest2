package xsna;

import com.vk.api.generated.reports.dto.ReportsAddReasonDto;
import com.vk.api.generated.reports.dto.ReportsAddReportSourceLabelDto;
import com.vk.api.generated.reports.dto.ReportsAddTypeDto;
import com.vk.dto.common.Peer;
import java.util.Iterator;
import xsna.r6g0;

/* compiled from: ReportApiCmd.kt */
/* loaded from: classes2.dex */
public final class x4g0 extends nx2<s3q0> {
    public final String b;
    public final Peer c;
    public final long d;
    public final boolean e;
    public final String f;
    public final ReportsAddReportSourceLabelDto g;

    public x4g0(String str, Peer peer, long j, boolean z, String str2, ReportsAddReportSourceLabelDto reportsAddReportSourceLabelDto) {
        this.b = str;
        this.c = peer;
        this.d = j;
        this.e = z;
        this.f = str2;
        this.g = reportsAddReportSourceLabelDto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x4g0)) {
            return false;
        }
        x4g0 x4g0Var = (x4g0) obj;
        return epx.f(this.b, x4g0Var.b) && epx.f(this.c, x4g0Var.c) && this.d == x4g0Var.d && this.e == x4g0Var.e && epx.f(this.f, x4g0Var.f) && this.g == x4g0Var.g;
    }

    @Override // xsna.nx2
    public final s3q0 f(l7r0 l7r0Var) {
        Object obj;
        Object obj2;
        s6g0 s6g0Var = new s6g0();
        Iterator<E> it = ReportsAddTypeDto.i().iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (brm0.w(((ReportsAddTypeDto) obj2).j(), this.b, true)) {
                break;
            }
        }
        ReportsAddTypeDto reportsAddTypeDto = (ReportsAddTypeDto) obj2;
        Iterator<E> it2 = ReportsAddReasonDto.i().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (((ReportsAddReasonDto) next).j() == 0) {
                obj = next;
                break;
            }
        }
        bz2.l(r6g0.a.a(s6g0Var, this.f, reportsAddTypeDto, (ReportsAddReasonDto) obj, com.vk.dto.common.a.b(this.c), Integer.valueOf((int) this.d), this.g, 32224), this.e);
        return s3q0.a;
    }

    public final int hashCode() {
        int b = qoy.b(bh10.a(bh10.a(shy.a(0, this.b.hashCode() * 31, 31), 31, this.c.b), 31, this.d), 31, this.e);
        String str = this.f;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        ReportsAddReportSourceLabelDto reportsAddReportSourceLabelDto = this.g;
        return hashCode + (reportsAddReportSourceLabelDto != null ? reportsAddReportSourceLabelDto.hashCode() : 0);
    }

    public final String toString() {
        return "ReportApiCmd(type=" + this.b + ", reason=0, owner=" + this.c + ", itemId=" + this.d + ", awaitNetwork=" + this.e + ", extraData=" + this.f + ", reportSourceLabel=" + this.g + ')';
    }
}
