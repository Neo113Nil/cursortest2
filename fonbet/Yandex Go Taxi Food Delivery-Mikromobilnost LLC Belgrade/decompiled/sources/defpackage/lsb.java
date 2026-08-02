package defpackage;

import com.google.protobuf.n;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;

/* loaded from: classes8.dex */
public final class lsb extends n implements zt10 {
    public final void c(Iterable iterable) {
        copyOnWrite();
        ((msb) this.instance).addAllHistogramEvent(iterable);
    }

    public final void d(tcy tcyVar) {
        copyOnWrite();
        ((msb) this.instance).addLibraryMetrics(tcyVar);
    }

    public final tcy e(int i) {
        return ((msb) this.instance).getLibraryMetrics(i);
    }

    public final SystemProfileProtos$SystemProfileProto f() {
        return ((msb) this.instance).getSystemProfile();
    }

    public final void g(long j) {
        copyOnWrite();
        ((msb) this.instance).setClientId(j);
    }

    public final void h(int i, tcy tcyVar) {
        copyOnWrite();
        ((msb) this.instance).setLibraryMetrics(i, tcyVar);
    }

    public final void i(int i) {
        copyOnWrite();
        ((msb) this.instance).setSessionId(i);
    }

    public final void j(SystemProfileProtos$SystemProfileProto systemProfileProtos$SystemProfileProto) {
        copyOnWrite();
        ((msb) this.instance).setSystemProfile(systemProfileProtos$SystemProfileProto);
    }
}
