package ru.ok.android.webrtc.stat.call.methods.call_stat;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.PropertyReference1Impl;
import okcalls.a1;
import ru.ok.android.externcalls.analytics.events.EventItemsMap;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import ru.ok.android.webrtc.stat.rtc.Ssrc;
import ru.ok.android.webrtc.stat.scheme.CallStatMetric;
import ru.ok.android.webrtc.stat.utils.LongDeltaStatExt;
import xsna.b4r;
import xsna.c5g;
import xsna.e43;
import xsna.izs;
import xsna.j5g;
import xsna.k9x;
import xsna.swe0;
import xsna.zsw;

/* loaded from: classes9.dex */
public final class IncomingVideoStatistics {
    public final boolean a;
    public final RTCLog b;
    public final LongDeltaStatExt c = new LongDeltaStatExt();
    public final LongDeltaStatExt d = new LongDeltaStatExt();
    public final LongDeltaStatExt e = new LongDeltaStatExt();
    public final LongDeltaStatExt f = new LongDeltaStatExt();
    public final LongDeltaStatExt g = new LongDeltaStatExt();
    public final HashMap h = new HashMap();
    public final LongDeltaStatExt i = new LongDeltaStatExt();
    public final LongDeltaStatExt j = new LongDeltaStatExt();
    public final LongDeltaStatExt k = new LongDeltaStatExt();
    public final LongDeltaStatExt l = new LongDeltaStatExt();
    public final SsrcsReset m = new SsrcsReset();

    public IncomingVideoStatistics(boolean z, RTCLog rTCLog) {
        this.a = z;
        this.b = rTCLog;
    }

    public static final Long b(Ssrc.VideoRecv videoRecv) {
        BigInteger bigInteger = videoRecv.packetsReceived;
        if (bigInteger != null) {
            return Long.valueOf(bigInteger.longValue());
        }
        return null;
    }

    public final void a(ArrayList arrayList, EventItemsMap eventItemsMap) {
        Long update = this.k.update(Long.valueOf(a(arrayList, new zsw(0))));
        Long update2 = this.l.update(Long.valueOf(a(arrayList, new b4r(8))));
        if (update == null || update2 == null) {
            return;
        }
        if (update2.longValue() + update.longValue() == 0) {
            return;
        }
        eventItemsMap.set(CallStatMetric.VideoLossIn.getKey(), Integer.valueOf(swe0.h((int) ((update.longValue() * 100) / (update2.longValue() + update.longValue())), new k9x(0, 100, 1))));
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01d0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0206 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void addIncomingVideoStatisticsForCallStat(List<Ssrc.VideoRecv> list, EventItemsMap eventItemsMap) {
        Double d;
        if (list.isEmpty()) {
            reset();
            return;
        }
        if (this.m.shouldReset(list)) {
            reset();
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Ssrc.VideoRecv videoRecv = (Ssrc.VideoRecv) obj;
            long j = videoRecv.framesReceived;
            if (j != 0 && j != -1) {
                Long l = (Long) this.h.get(videoRecv.trackId);
                if (l == null || j > l.longValue()) {
                    arrayList.add(obj);
                } else if (j != l.longValue()) {
                    this.b.log("IncomingVideoStatistics", "newFramesReceived < oldFramesReceived");
                }
            }
        }
        for (Ssrc.VideoRecv videoRecv2 : list) {
            long j2 = videoRecv2.framesReceived;
            String str = videoRecv2.trackId;
            if (j2 == -1) {
                this.h.remove(str);
            } else {
                this.h.put(str, Long.valueOf(j2));
            }
        }
        if (arrayList.isEmpty()) {
            if (this.a) {
                reset();
                return;
            }
            return;
        }
        long a = a(arrayList, new PropertyReference1Impl() { // from class: okcalls.b1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
            public final Object get(Object obj2) {
                return Long.valueOf(((Ssrc.VideoRecv) obj2).nacksSent);
            }
        });
        String key = CallStatMetric.VideoNackSent.getKey();
        Long update = this.c.update(Long.valueOf(a));
        eventItemsMap.set(key, update != null ? Long.valueOf(swe0.i(update.longValue(), 0L, 10000L)) : null);
        long a2 = a(arrayList, new PropertyReference1Impl() { // from class: okcalls.c1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
            public final Object get(Object obj2) {
                return Long.valueOf(((Ssrc.VideoRecv) obj2).pliSent);
            }
        });
        String key2 = CallStatMetric.VideoPliSent.getKey();
        Long update2 = this.d.update(Long.valueOf(a2));
        eventItemsMap.set(key2, update2 != null ? Long.valueOf(swe0.i(update2.longValue(), 0L, 10000L)) : null);
        long a3 = a(arrayList, new PropertyReference1Impl() { // from class: okcalls.y0
            @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
            public final Object get(Object obj2) {
                return Long.valueOf(((Ssrc.VideoRecv) obj2).firSent);
            }
        });
        String key3 = CallStatMetric.VideoFirSent.getKey();
        Long update3 = this.e.update(Long.valueOf(a3));
        eventItemsMap.set(key3, update3 != null ? Long.valueOf(swe0.i(update3.longValue(), 0L, 10000L)) : null);
        long a4 = a(arrayList, new PropertyReference1Impl() { // from class: okcalls.z0
            @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
            public final Object get(Object obj2) {
                return Long.valueOf(((Ssrc.VideoRecv) obj2).framesDropped);
            }
        });
        String key4 = CallStatMetric.VideoFramesDropped.getKey();
        Long update4 = this.g.update(Long.valueOf(a4));
        eventItemsMap.set(key4, update4 != null ? Long.valueOf(swe0.i(update4.longValue(), 0L, 10000L)) : null);
        a1 a1Var = new PropertyReference1Impl() { // from class: okcalls.a1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
            public final Object get(Object obj2) {
                return Long.valueOf(((Ssrc.VideoRecv) obj2).jitterBufferMs);
            }
        };
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj2 = arrayList.get(i2);
            i2++;
            arrayList2.add(Long.valueOf(((Number) a1Var.invoke((Ssrc.VideoRecv) obj2)).longValue()));
        }
        ArrayList arrayList3 = new ArrayList();
        int size2 = arrayList2.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj3 = arrayList2.get(i3);
            i3++;
            if (((Number) obj3).longValue() != -1) {
                arrayList3.add(obj3);
            }
        }
        double O = j5g.O(arrayList3);
        if (Math.abs(O) <= Double.MAX_VALUE) {
            eventItemsMap.set(CallStatMetric.VideoJitter.getKey(), Long.valueOf((long) O));
        }
        ArrayList arrayList4 = new ArrayList();
        int size3 = arrayList.size();
        int i4 = 0;
        while (i4 < size3) {
            Object obj4 = arrayList.get(i4);
            i4++;
            Ssrc.VideoRecv videoRecv3 = (Ssrc.VideoRecv) obj4;
            long j3 = videoRecv3.framesDecoded;
            if (j3 != -1 && j3 != 0) {
                double d2 = j3;
                Double d3 = videoRecv3.totalSquaredInterFrameDelay;
                if (d3 != null) {
                    double doubleValue = d3.doubleValue();
                    Double d4 = videoRecv3.totalInterFrameDelay;
                    if (d4 != null) {
                        double doubleValue2 = d4.doubleValue();
                        d = Double.valueOf((doubleValue - ((doubleValue2 * doubleValue2) / d2)) / d2);
                        if (d == null) {
                            arrayList4.add(d);
                        }
                    }
                }
            }
            d = null;
            if (d == null) {
            }
        }
        Iterator it = arrayList4.iterator();
        double d5 = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
        while (it.hasNext()) {
            d5 += ((Number) it.next()).doubleValue();
            i++;
            if (i < 0) {
                e43.s();
                throw null;
            }
        }
        double d6 = i == 0 ? Double.NaN : d5 / i;
        if (Math.abs(d6) <= Double.MAX_VALUE) {
            eventItemsMap.set(CallStatMetric.VideoInterframeDelayVariance.getKey(), Float.valueOf((float) (d6 * 1000000)));
        }
        eventItemsMap.set(CallStatMetric.VideoFreezeCount.getKey(), this.i.update(Long.valueOf(a(arrayList, new PropertyReference1Impl() { // from class: okcalls.d1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
            public final Object get(Object obj5) {
                return Long.valueOf(((Ssrc.VideoRecv) obj5).freezeCount);
            }
        }))));
        Long update5 = this.j.update(Long.valueOf(a(arrayList, new PropertyReference1Impl() { // from class: okcalls.e1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
            public final Object get(Object obj5) {
                return Long.valueOf(((Ssrc.VideoRecv) obj5).totalFreezesDurationMs);
            }
        })));
        if (update5 == null || update5.longValue() != 0) {
            eventItemsMap.set(CallStatMetric.VideoTotalFreezesDuration.getKey(), update5);
        }
        a(arrayList, eventItemsMap);
    }

    public final void reset() {
        this.c.reset();
        this.d.reset();
        this.e.reset();
        this.f.reset();
        this.g.reset();
        this.i.reset();
        this.j.reset();
        this.l.reset();
        this.k.reset();
        if (this.a) {
            return;
        }
        this.h.clear();
    }

    public static final Long a(Ssrc.VideoRecv videoRecv) {
        BigInteger bigInteger = videoRecv.packetsLost;
        if (bigInteger != null) {
            return Long.valueOf(bigInteger.longValue());
        }
        return null;
    }

    public static long a(ArrayList arrayList, izs izsVar) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            Long l = (Long) izsVar.invoke((Ssrc.VideoRecv) obj);
            if (l != null) {
                arrayList2.add(l);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        int size2 = arrayList2.size();
        while (i < size2) {
            Object obj2 = arrayList2.get(i);
            i++;
            if (((Number) obj2).longValue() != -1) {
                arrayList3.add(obj2);
            }
        }
        return j5g.G0(arrayList3);
    }
}
