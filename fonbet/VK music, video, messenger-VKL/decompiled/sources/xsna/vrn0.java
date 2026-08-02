package xsna;

import java.util.ArrayList;
import one.video.stat.transport.Param;
import one.video.stat2.Event;
import one.video.stat2.a;
import xsna.yi80;

/* compiled from: TVTHelper.kt */
/* loaded from: classes8.dex */
public final class vrn0 {
    public final o860 a;
    public final qw80 b;
    public final ao90 c;
    public final vw3 d = ryk0.a;
    public volatile long e;
    public final ArrayList f;
    public final bpn0 g;
    public final bpn0 h;
    public long i;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TVTHelper.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a INVALID_INTERVAL_STATE;
        public static final a INVALID_INTERVAL_STATE2;
        public static final a INVALID_POSITION;
        public static final a INVALID_POSITION2;
        public static final a UNKNOWN_POSITION_CHANGE;
        public static final a UNKNOWN_POSITION_START;
        private final String value;

        static {
            a aVar = new a("INVALID_POSITION", 0, "tvt_inv_p");
            INVALID_POSITION = aVar;
            a aVar2 = new a("INVALID_POSITION2", 1, "tvt_inv_p2");
            INVALID_POSITION2 = aVar2;
            a aVar3 = new a("INVALID_INTERVAL_STATE", 2, "tvt_inv_int");
            INVALID_INTERVAL_STATE = aVar3;
            a aVar4 = new a("INVALID_INTERVAL_STATE2", 3, "tvt_inv_int2");
            INVALID_INTERVAL_STATE2 = aVar4;
            a aVar5 = new a("UNKNOWN_POSITION_CHANGE", 4, "tvt_unk_p_chg");
            UNKNOWN_POSITION_CHANGE = aVar5;
            a aVar6 = new a("UNKNOWN_POSITION_START", 5, "tvt_unk_p_start");
            UNKNOWN_POSITION_START = aVar6;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6};
            $VALUES = aVarArr;
            $ENTRIES = new asp(aVarArr);
        }

        public a(String str, int i, String str2) {
            this.value = str2;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        @Override // java.lang.Enum
        public final String toString() {
            return this.value;
        }
    }

    public vrn0(o860 o860Var, qw80 qw80Var, ao90 ao90Var) {
        this.a = o860Var;
        this.b = qw80Var;
        this.c = ao90Var;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(j5g.C0(ryk0.c));
        this.f = arrayList;
        this.g = new bpn0(new xv0(25));
        this.h = new bpn0(new xqi0(4));
        this.i = -1L;
    }

    public final boolean a() {
        return this.i >= 0;
    }

    public final void b(final long j) {
        String str;
        int i = wn80.a;
        if (a()) {
            this.d.b(j >= this.i, a.INVALID_POSITION, new gzs() { // from class: xsna.urn0
                @Override // xsna.gzs
                public final Object invoke() {
                    long j2 = this.i;
                    StringBuilder b = fp.b(j, "playbackPosition= ", " < startPlaybackPosition= ");
                    b.append(j2);
                    return b.toString();
                }
            });
            if (j < 0) {
                this.d.b(false, a.UNKNOWN_POSITION_CHANGE, new uw3(0));
                return;
            }
            long j2 = this.e;
            this.e = (j - this.i) + this.e;
            this.i = j;
            if (j2 == this.e) {
                return;
            }
            while (true) {
                str = null;
                if (!this.f.isEmpty()) {
                    long longValue = ((Number) this.f.get(0)).longValue();
                    if (j2 >= longValue || longValue > this.e) {
                        break;
                    }
                    this.f.remove(0);
                    o860 o860Var = this.a;
                    long j3 = this.e;
                    one.video.stat2.a aVar = (one.video.stat2.a) o860Var.c;
                    yi80.a c = aVar.c(Event.WATCHED_N, j, aVar.i, j3);
                    c.i.put(Param.TARGET_DURATION, Long.valueOf(longValue));
                    one.video.stat2.a.g(aVar, c, null, 4);
                } else {
                    break;
                }
            }
            if (((Number) this.g.getValue()).longValue() > 0 && j2 / ((Number) this.g.getValue()).longValue() != this.e / ((Number) this.g.getValue()).longValue()) {
                ((one.video.stat2.a) this.b.c).i(j, this.e);
            }
            if (((Number) this.h.getValue()).longValue() <= 0 || j2 / ((Number) this.h.getValue()).longValue() == this.e / ((Number) this.h.getValue()).longValue()) {
                return;
            }
            ao90 ao90Var = this.c;
            final long j4 = this.e;
            final one.video.stat2.a aVar2 = (one.video.stat2.a) ao90Var.c;
            aVar2.g.b(j4 == aVar2.j.e, a.EnumC2182a.TVT_MISMATCH_IN_HEARTBEAT, new gzs() { // from class: xsna.qsi0
                @Override // xsna.gzs
                public final Object invoke() {
                    long j5 = j4;
                    long j6 = aVar2.j.e;
                    StringBuilder b = fp.b(j5, "TVT mismatch: currentTvt = ", " tvtHelper.tvt= ");
                    b.append(j6);
                    return b.toString();
                }
            });
            qbx0 qbx0Var = aVar2.k;
            qbx0Var.getClass();
            int i2 = wn80.a;
            if (qbx0Var.a()) {
                str = qbx0Var.c(j);
                qbx0Var.b(j);
            }
            if (str != null) {
                aVar2.k(j, str);
            }
        }
    }

    public final void c(long j) {
        int i = wn80.a;
        boolean z = !a();
        a aVar = a.INVALID_INTERVAL_STATE;
        vw3 vw3Var = this.d;
        vw3Var.b(z, aVar, new uw3(0));
        if (j >= 0) {
            this.i = j;
        } else {
            vw3Var.b(false, a.UNKNOWN_POSITION_START, new uw3(0));
        }
    }
}
