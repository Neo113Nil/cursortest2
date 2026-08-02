package xsna;

import android.os.SystemClock;
import android.util.Size;
import com.google.common.collect.ImmutableList;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import one.video.player.model.FrameSize;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.ik0;
import xsna.vp9;

/* compiled from: OneVideoTrackSelection.kt */
/* loaded from: classes8.dex */
public final class yn80 extends ik0 {
    public final zn80 A;
    public final Object B;
    public final Object C;
    public final Object D;
    public final bpn0 E;
    public final bpn0 F;
    public final xgp0 v;
    public final gzs<hk0> w;
    public final gzs<Size> x;
    public final fbi0 y;
    public final su5 z;

    /* compiled from: OneVideoTrackSelection.kt */
    public static final class a extends ik0.b {
        public final xgp0 a;
        public final gzs<hk0> b;
        public final gzs<Size> c;
        public final fbi0 d;
        public final su5 e;
        public final hw3 f;
        public final etw g;

        public a(xgp0 xgp0Var, gzs<hk0> gzsVar, gzs<Size> gzsVar2, fbi0 fbi0Var, su5 su5Var, hw3 hw3Var, etw etwVar) {
            this.a = xgp0Var;
            this.b = gzsVar;
            this.c = gzsVar2;
            this.d = fbi0Var;
            this.e = su5Var;
            this.f = hw3Var;
            this.g = etwVar;
        }
    }

    public yn80(pfp0 pfp0Var, int[] iArr, p06 p06Var, ImmutableList immutableList, xgp0 xgp0Var, gzs gzsVar, gzs gzsVar2, fbi0 fbi0Var, int[] iArr2, su5 su5Var, hw3 hw3Var, etw etwVar) {
        super(pfp0Var, iArr, p06Var, xgp0Var.c, xgp0Var.d, xgp0Var.e, xgp0Var.f, xgp0Var.g, xgp0Var.h, xgp0Var.i, immutableList);
        this.v = xgp0Var;
        this.w = gzsVar;
        this.x = gzsVar2;
        this.y = fbi0Var;
        this.z = su5Var;
        this.A = (wn80.q ? this : null) != null ? new zn80(pfp0Var.c) : null;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.B = msy.a(lazyThreadSafetyMode, new f550(this, 8));
        this.C = msy.a(lazyThreadSafetyMode, new f5x(this, 24));
        this.D = msy.a(lazyThreadSafetyMode, new cm(22, iArr2, this));
        this.E = new bpn0(new xo8(hw3Var, pfp0Var, this, 5));
        this.F = new bpn0(new m1y(etwVar, 21));
    }

    @Override // xsna.ik0, xsna.lp6, xsna.d7q
    public final int evaluateQueueSize(long j, List<? extends aq10> list) {
        if (wn80.m && wn80.n && this.a.c == 2) {
            fbi0 fbi0Var = this.y;
            if ((fbi0Var != null ? fbi0Var.a : null) != null) {
                return k(j, list, swe0.i(y2r0.S(wn80.o), 0L, this.j), Integer.MAX_VALUE, Integer.MAX_VALUE);
            }
        }
        if (this.z != null) {
            return list.size();
        }
        int evaluateQueueSize = super.evaluateQueueSize(j, list);
        vp9 vp9Var = (vp9) this.E.getValue();
        return (vp9Var == null || vp9Var.k == null) ? evaluateQueueSize : list.size();
    }

    /* JADX WARN: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01fb  */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.ik0, xsna.d7q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(long j, final long j2, long j3, List<? extends aq10> list, bq10[] bq10VarArr) {
        boolean z;
        int i;
        int i2;
        int h;
        int i3;
        qei0 qei0Var;
        boolean z2;
        vp9.a aVar;
        final boolean z3;
        vp9.a aVar2;
        final int i4;
        zn80 zn80Var = this.A;
        if (zn80Var != null) {
            j5g.g0(list, null, null, null, 0, new p010(zn80Var, 17), 31);
        }
        Integer q = q();
        bpn0 bpn0Var = this.E;
        if (q != null) {
            this.s = 2;
            this.r = q.intValue();
            vp9 vp9Var = (vp9) bpn0Var.getValue();
            if (vp9Var != null) {
                vp9Var.k = null;
                return;
            }
            return;
        }
        long o = o(bq10VarArr, list);
        final vp9 vp9Var2 = (vp9) bpn0Var.getValue();
        if (vp9Var2 != null) {
            pp9 pp9Var = vp9Var2.f;
            if (vp9Var2.k != null) {
                if (o <= 0) {
                    o = y2r0.S(pp9Var.a);
                }
                vp9.a aVar3 = vp9Var2.k;
                if (aVar3 != null) {
                    long j4 = aVar3.c;
                    long j5 = aVar3.d;
                    double d = vp9Var2.j;
                    long j0 = y2r0.j0(j2);
                    long j02 = y2r0.j0(o);
                    long elapsedRealtime = SystemClock.elapsedRealtime() - j5;
                    if (!pp9Var.d || j0 <= j4 + j02) {
                        aVar = aVar3;
                        z3 = false;
                    } else {
                        aVar = aVar3;
                        z3 = true;
                    }
                    final boolean z4 = elapsedRealtime > ((long) ((int) Math.ceil(d))) * j02;
                    final boolean z5 = j0 > j4;
                    final boolean z6 = z4 && z5;
                    final boolean z7 = elapsedRealtime > ((long) ((int) Math.ceil(((double) 2) * d))) * j02;
                    boolean z8 = z3 || z6 || z7;
                    if (z8) {
                        aVar2 = aVar;
                        vp9Var2.b(new gzs() { // from class: xsna.up9
                            @Override // xsna.gzs
                            public final Object invoke() {
                                return vp9.this.a() + ": shouldRestore: bufferRestored: " + z3 + ", bufferIsStableForLongEnough: " + z6 + "(bufferDidNotDecreased: " + z5 + ", enoughTimePassed: " + z4 + "), veryLongTimePassed: " + z7;
                            }
                        });
                    } else {
                        aVar2 = aVar;
                    }
                    if (z8) {
                        final long j6 = o;
                        vp9Var2.b(new gzs() { // from class: xsna.qp9
                            @Override // xsna.gzs
                            public final Object invoke() {
                                vp9 vp9Var3 = vp9.this;
                                String a2 = vp9Var3.a();
                                vp9.a aVar4 = vp9Var3.k;
                                Long valueOf = aVar4 != null ? Long.valueOf(aVar4.c) : null;
                                long j03 = y2r0.j0(j2);
                                long j04 = y2r0.j0(j6);
                                StringBuilder sb = new StringBuilder("UPDATE_SELECTED_TRACK[");
                                sb.append(a2);
                                sb.append("]: RESTORE CONDITION MET: bufferLevelWhenCancelActivatedMs: ");
                                sb.append(valueOf);
                                sb.append(", bufferedDurationMs:");
                                sb.append(j03);
                                return xy6.a(j04, ", segmentDuration: ", sb);
                            }
                        });
                        vp9Var2.k = null;
                    } else {
                        final int intValue = ((Number) vp9Var2.b.invoke()).intValue();
                        if (vp9Var2.d == 1) {
                            int i5 = vp9Var2.e;
                            i4 = i5 > 1 ? i5 / 2 : 0;
                        } else {
                            i4 = aVar2.b;
                        }
                        if (intValue != i4) {
                            vp9Var2.b(new gzs() { // from class: xsna.rp9
                                @Override // xsna.gzs
                                public final Object invoke() {
                                    vp9 vp9Var3 = vp9.this;
                                    String a2 = vp9Var3.a();
                                    uv20 uv20Var = vp9Var3.a;
                                    int i6 = intValue;
                                    int i7 = ((androidx.media3.common.a) uv20Var.invoke(Integer.valueOf(i6))).j;
                                    int i8 = ((androidx.media3.common.a) uv20Var.invoke(Integer.valueOf(i6))).u;
                                    int i9 = ((androidx.media3.common.a) uv20Var.invoke(Integer.valueOf(i6))).v;
                                    int i10 = i4;
                                    int i11 = ((androidx.media3.common.a) uv20Var.invoke(Integer.valueOf(i10))).j;
                                    int i12 = ((androidx.media3.common.a) uv20Var.invoke(Integer.valueOf(i10))).u;
                                    int i13 = ((androidx.media3.common.a) uv20Var.invoke(Integer.valueOf(i10))).v;
                                    StringBuilder b = xy6.b(i6, "UPDATE_SELECTED_TRACK[", a2, "]: oldIndex: ", X3.j.d);
                                    cgn.a(i7, i8, ", ", "x", b);
                                    cgn.a(i9, i10, "], newIndex= ", X3.j.d, b);
                                    cgn.a(i11, i12, StringUtils.COMMA, "x", b);
                                    return h5s.c(i13, X3.j.e, b);
                                }
                            });
                            vp9Var2.c.invoke(Integer.valueOf(i4));
                        }
                    }
                    z2 = !z8;
                    if (z2) {
                        z = true;
                        if (z) {
                            su5 su5Var = this.z;
                            if (su5Var == null || j2 < su5Var.c || this.a.c != 2) {
                                super.g(j, j2, j3, list, bq10VarArr);
                            } else {
                                qei0 qei0Var2 = new qei0(this.r, this.s);
                                List list2 = (List) this.C.getValue();
                                su5 su5Var2 = this.z;
                                long j7 = su5Var2.b;
                                long j8 = su5Var2.a;
                                int i6 = qei0Var2.b;
                                if (i6 == 0) {
                                    qei0Var = new qei0(e43.h(list2), 1);
                                } else if (list2.size() == 1) {
                                    qei0Var = new qei0(0, i6);
                                } else {
                                    if (!list.isEmpty()) {
                                        Iterator it = list2.iterator();
                                        i = 0;
                                        while (it.hasNext()) {
                                            if (epx.f(((one.video.player.tracks.c) it.next()).b, ((aq10) sd9.k(list)).d.a)) {
                                                break;
                                            } else {
                                                i++;
                                            }
                                        }
                                    }
                                    i = -1;
                                    if (i != -1) {
                                        i6 = ((aq10) sd9.k(list)).e;
                                    } else {
                                        i = qei0Var2.a;
                                    }
                                    List list3 = list2;
                                    int h2 = swe0.h(i - 1, e43.g(list3));
                                    int h3 = swe0.h(i + 1, e43.g(list3));
                                    long j03 = y2r0.j0(j2);
                                    if (j03 <= j8) {
                                        h = e43.h(list2);
                                    } else if (j03 >= j7 + j8) {
                                        h = 0;
                                    } else {
                                        i2 = i;
                                        h = e43.h(list2) - ((int) Math.ceil((j03 - j8) / (j7 / (list2.size() - 1))));
                                        int i7 = ((cms0) ((one.video.player.tracks.c) list2.get(h)).c).d;
                                        if (j03 > j8) {
                                            i3 = e43.h(list2);
                                        } else if (j03 >= j8 + j7) {
                                            i3 = 0;
                                        } else if (i7 >= ((cms0) ((one.video.player.tracks.c) list2.get(h2)).c).d) {
                                            Iterator it2 = list2.iterator();
                                            i3 = 0;
                                            while (it2.hasNext()) {
                                                if (((cms0) ((one.video.player.tracks.c) it2.next()).c).d < i7) {
                                                    break;
                                                } else {
                                                    i3++;
                                                }
                                            }
                                            i3 = -1;
                                        } else if (i7 <= ((cms0) ((one.video.player.tracks.c) list2.get(h3)).c).d) {
                                            Iterator it3 = list2.iterator();
                                            i3 = 0;
                                            while (it3.hasNext()) {
                                                if (((cms0) ((one.video.player.tracks.c) it3.next()).c).d < i7) {
                                                    break;
                                                } else {
                                                    i3++;
                                                }
                                            }
                                            i3 = -1;
                                        } else {
                                            i3 = i2;
                                        }
                                        if (i3 != i2) {
                                            i6 = 3;
                                        }
                                        qei0Var = new qei0(i3, i6);
                                    }
                                    i2 = i;
                                    int i72 = ((cms0) ((one.video.player.tracks.c) list2.get(h)).c).d;
                                    if (j03 > j8) {
                                    }
                                    if (i3 != i2) {
                                    }
                                    qei0Var = new qei0(i3, i6);
                                }
                                this.r = qei0Var.a;
                                this.s = qei0Var.b;
                            }
                            this.r = r(this.r);
                            return;
                        }
                        return;
                    }
                }
            }
            z2 = false;
            if (z2) {
            }
        }
        z = false;
        if (z) {
        }
    }

    @Override // xsna.d7q
    public final boolean h(long j, final ccc cccVar, List<? extends aq10> list) {
        Object obj;
        long j2;
        boolean z;
        int i;
        int i2;
        int i3;
        final int i4;
        String str;
        if (wn80.m && this.a.c == 2) {
            fbi0 fbi0Var = this.y;
            if ((fbi0Var != null ? fbi0Var.a : null) != null) {
                return false;
            }
        }
        final vp9 vp9Var = (vp9) this.E.getValue();
        if (vp9Var == null || cccVar.c != 1) {
            return false;
        }
        long j3 = cccVar.g;
        if (j <= 0 || j3 == C.TIME_UNSET || j >= j3) {
            return false;
        }
        final long j0 = y2r0.j0(j3 - j);
        Object obj2 = cccVar.b.k;
        Long l = obj2 instanceof Long ? (Long) obj2 : null;
        long j02 = y2r0.j0(cccVar.a());
        vp9.a aVar = vp9Var.k;
        boolean z2 = aVar != null && aVar.a == cccVar.a;
        long j4 = vp9Var.f.c;
        if (j4 < 0) {
            j4 = 0;
        }
        boolean z3 = j4 < j0;
        if (l == null || j02 <= 0 || z2 || z3 || y2r0.j0(cccVar.a()) < vp9Var.f.a || vp9Var.c(cccVar) > vp9Var.f.f || ((androidx.media3.common.a) vp9Var.a.invoke(Integer.valueOf(vp9Var.e - 1))).j == cccVar.d.j) {
            return false;
        }
        op9 op9Var = vp9Var.g;
        Long l2 = op9Var.b;
        if (l2 != null) {
            if (System.currentTimeMillis() - l2.longValue() < op9Var.a) {
                return false;
            }
        }
        final long elapsedRealtime = SystemClock.elapsedRealtime() - l.longValue();
        final double d = elapsedRealtime / j02;
        if (d <= vp9Var.j) {
            return false;
        }
        if (vp9Var.d == 1) {
            int i5 = cccVar.d.j;
            uv20 uv20Var = vp9Var.a;
            int i6 = vp9Var.e;
            if (i5 <= ((androidx.media3.common.a) uv20Var.invoke(Integer.valueOf(i6 > 1 ? i6 / 2 : 0))).j) {
                return false;
            }
        }
        vp9Var.b(new gzs() { // from class: xsna.tp9
            @Override // xsna.gzs
            public final Object invoke() {
                String a2 = vp9.this.a();
                ccc cccVar2 = cccVar;
                int i7 = cccVar2.d.j;
                int i8 = cccVar2.e;
                long j5 = 1024;
                long j6 = cccVar2.i.b / j5;
                long j7 = cccVar2.b.h / j5;
                long j03 = y2r0.j0(cccVar2.g);
                long j04 = y2r0.j0(cccVar2.a());
                StringBuilder b = xy6.b(i7, "\n                ----------------------------\n                CANCELLING ", a2, " CHUNK!\n                loadingChunk.bitrate: ", "\n                loadingChunk.trackSelectionReason: ");
                b.append(i8);
                b.append("\n                totalKiloBytesLoaded: ");
                b.append(j6);
                tj0.d(b, "Kb out of ", j7, "Kb\n                chunkStartTime: ");
                b.append(j03);
                tj0.d(b, " ms \n                chunkDuration: ", j04, " ms\n                timeDiffRatio: ");
                b.append(d);
                tj0.d(b, "\n                timeDiff: ", elapsedRealtime, "\n                bufferLevel: ");
                b.append(j0);
                b.append("\n                ----------------------------\n                ");
                return xqm0.g(b.toString());
            }
        });
        final double c = vp9Var.c(cccVar) / d;
        long j5 = cccVar.a;
        long a2 = cccVar.a();
        tju tjuVar = vp9Var.b;
        int i7 = vp9Var.h;
        vp9.b.a aVar2 = vp9.b.Companion;
        String str2 = vp9Var.f.b;
        aVar2.getClass();
        Iterator<E> it = vp9.b.j().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            Object next = it.next();
            str = ((vp9.b) next).strVal;
            if (epx.f(str, str2)) {
                obj = next;
                break;
            }
        }
        vp9.b bVar = (vp9.b) obj;
        if (bVar == null) {
            bVar = vp9.b.DEFAULT;
        }
        int i8 = vp9.c.$EnumSwitchMapping$0[bVar.ordinal()];
        if (i8 == 1) {
            j2 = j5;
            z = true;
            if (c != ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                i7 = swe0.g(((Number) tjuVar.invoke()).intValue() + ((int) Math.ceil(Math.log(1.0d / c) / Math.log(2.0d))), 0, i7);
            }
        } else {
            if (i8 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            uv20 uv20Var2 = vp9Var.a;
            if (c == ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                j2 = j5;
                z = true;
            } else {
                double j03 = y2r0.j0(a2);
                double d2 = j03 / c;
                int intValue = ((Number) tjuVar.invoke()).intValue();
                androidx.media3.common.a aVar3 = (androidx.media3.common.a) uv20Var2.invoke(Integer.valueOf(intValue));
                z = true;
                int i9 = aVar3.j;
                int i10 = vp9Var.e;
                j2 = j5;
                int i11 = 0;
                while (i11 < i10) {
                    if (i11 == intValue) {
                        i2 = i10;
                    } else {
                        final androidx.media3.common.a aVar4 = (androidx.media3.common.a) uv20Var2.invoke(Integer.valueOf(i11));
                        i2 = i10;
                        final int i12 = aVar4.j;
                        if (i12 <= i9) {
                            i3 = intValue;
                            final float f = i9 / i12;
                            i4 = i11;
                            final double d3 = d2 / f;
                            if (d3 < j03 && j0 > d3) {
                                final int i13 = i9;
                                final androidx.media3.common.a aVar5 = aVar3;
                                vp9Var.b(new gzs() { // from class: xsna.sp9
                                    @Override // xsna.gzs
                                    public final Object invoke() {
                                        androidx.media3.common.a aVar6 = aVar5;
                                        int i14 = aVar6.u;
                                        int i15 = aVar6.v;
                                        int a3 = an10.a(i13 / 1024.0d);
                                        androidx.media3.common.a aVar7 = aVar4;
                                        int i16 = aVar7.u;
                                        int i17 = aVar7.v;
                                        int a4 = an10.a(i12 / 1024.0d);
                                        StringBuilder a5 = eq0.a(i4, "optimalIndexByBitrate: timeDiff: ", ", fmtIdx: ", elapsedRealtime);
                                        a5.append(", bitrateRatio: ");
                                        a5.append(f);
                                        a5.append(", loadedPercent=");
                                        a5.append(c);
                                        a5.append(", srcSize:");
                                        a5.append(i14);
                                        dgn.a(i15, a3, "x", ", srcBitrate: ", a5);
                                        com.vk.movika.sdk.android.defaultplayer.view.a.a(a5, ", newTimeDiff: ", d3, " ms, srcSize: ");
                                        cgn.a(i16, i17, "x", ", bitrate: ", a5);
                                        a5.append(a4);
                                        return a5.toString();
                                    }
                                });
                                i = i4;
                                break;
                            }
                            i11 = i4 + 1;
                            intValue = i3;
                            i10 = i2;
                            aVar3 = aVar3;
                            i9 = i9;
                        }
                    }
                    i3 = intValue;
                    i4 = i11;
                    i11 = i4 + 1;
                    intValue = i3;
                    i10 = i2;
                    aVar3 = aVar3;
                    i9 = i9;
                }
            }
        }
        i = i7;
        vp9Var.k = new vp9.a(i, j2, j0, SystemClock.elapsedRealtime());
        return z;
    }

    @Override // xsna.ik0
    public final int j(long j, long j2) {
        Integer q = q();
        return q != null ? q.intValue() : r(super.j(j, j2));
    }

    @Override // xsna.ik0
    public final long m(long j) {
        ftw ftwVar = (ftw) this.F.getValue();
        return ftwVar != null ? ftwVar.a.a.a(j) : this.h;
    }

    @Override // xsna.ik0
    public final long n(long j) {
        ftw ftwVar = (ftw) this.F.getValue();
        return ftwVar != null ? ftwVar.a.b.a(j) : this.j;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final List<one.video.player.tracks.c> p() {
        return (List) this.D.getValue();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    public final Integer q() {
        fbi0 fbi0Var;
        one.video.player.tracks.c cVar;
        if (this.a.c != 2 || (fbi0Var = this.y) == null || (cVar = fbi0Var.a) == null) {
            return null;
        }
        Iterator it = ((List) this.C.getValue()).iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (epx.f(((one.video.player.tracks.c) it.next()).b, cVar.b)) {
                break;
            }
            i++;
        }
        Integer valueOf = Integer.valueOf(i);
        if (i != -1) {
            return valueOf;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.Lazy] */
    public final int r(int i) {
        hk0 a2;
        if (this.a.c != 2) {
            return i;
        }
        hk0 invoke = this.w.invoke();
        if (invoke == null) {
            invoke = hk0.e;
        }
        boolean z = wn80.m;
        xgp0 xgp0Var = this.v;
        int i2 = 0;
        if (z) {
            p();
            FrameSize.Companion.getClass();
            FrameSize frameSize = FrameSize._4320p;
            for (int i3 = 0; i3 < p().size(); i3++) {
                if (frameSize.compareTo(((cms0) p().get(i3).c).b()) > 0) {
                    frameSize = ((cms0) p().get(i3).c).b();
                }
            }
            p();
            FrameSize.Companion.getClass();
            FrameSize frameSize2 = FrameSize._144p;
            for (int i4 = 0; i4 < p().size(); i4++) {
                if (frameSize2.compareTo(((cms0) p().get(i4).c).b()) < 0) {
                    frameSize2 = ((cms0) p().get(i4).c).b();
                }
            }
            a2 = hk0.a(invoke, (FrameSize) jw5.v(xgp0Var.a, jw5.v(invoke.a, frameSize)), (FrameSize) jw5.w(xgp0Var.b, jw5.w(invoke.b, frameSize2)), false, 12);
        } else {
            FrameSize frameSize3 = xgp0Var.a;
            FrameSize frameSize4 = invoke.a;
            if (frameSize3.compareTo(frameSize4) < 0) {
                frameSize3 = frameSize4;
            }
            FrameSize frameSize5 = xgp0Var.b;
            FrameSize frameSize6 = invoke.b;
            if (frameSize5.compareTo(frameSize6) > 0) {
                frameSize5 = frameSize6;
            }
            a2 = hk0.a(invoke, frameSize3, frameSize5, false, 12);
        }
        List list = (List) this.C.getValue();
        gzs<Size> gzsVar = this.x;
        Size invoke2 = gzsVar != null ? gzsVar.invoke() : null;
        FrameSize frameSize7 = a2.a;
        FrameSize frameSize8 = a2.b;
        if (((cms0) ((one.video.player.tracks.c) list.get(i)).c).b().compareTo(frameSize7) < 0) {
            i = e43.h(list);
            int i5 = 0;
            while (true) {
                if (-1 >= i) {
                    i = i5;
                    break;
                }
                if (((cms0) ((one.video.player.tracks.c) list.get(i)).c).b().compareTo(frameSize7) >= 0) {
                    break;
                }
                i5 = i;
                i--;
            }
        }
        if (((cms0) ((one.video.player.tracks.c) list.get(i)).c).b().compareTo(frameSize8) > 0) {
            i = e43.h(list);
            int h = e43.h(list);
            if (h >= 0) {
                i = 0;
                while (((cms0) ((one.video.player.tracks.c) list.get(i)).c).b().compareTo(frameSize8) > 0 && i != h) {
                    i++;
                }
            }
        }
        if (a2.c && invoke2 != null) {
            Size c = ((cms0) ((one.video.player.tracks.c) list.get(i)).c).c();
            if (c.getWidth() > invoke2.getWidth() || c.getHeight() > invoke2.getHeight()) {
                i = e43.h(list);
                FrameSize frameSize9 = a2.d;
                if (frameSize9.compareTo(frameSize7) >= 0) {
                    frameSize7 = frameSize9;
                }
                int h2 = e43.h(list);
                if (h2 >= 0) {
                    while (((cms0) ((one.video.player.tracks.c) list.get(i2)).c).b().compareTo(frameSize7) > 0) {
                        Size c2 = ((cms0) ((one.video.player.tracks.c) list.get(i2)).c).c();
                        if (c2.getWidth() <= invoke2.getWidth() && c2.getHeight() <= invoke2.getHeight()) {
                            break;
                        }
                        if (i2 != h2) {
                            i2++;
                        }
                    }
                    return i2;
                }
            }
        }
        return i;
    }
}
