package xsna;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicLong;
import one.video.streaming.tools.TimeMachine;
import one.video.streaming.tools.exceptions.BufferOverflowException;

/* compiled from: OutputBuffer.java */
/* loaded from: classes8.dex */
public final class l190 {
    public final AtomicLong c;
    public long d;
    public volatile boolean g;
    public long h;
    public long i;
    public final TimeMachine j;
    public final TreeMap<Long, a> a = new TreeMap<>();
    public int e = Integer.MAX_VALUE;
    public int f = Integer.MAX_VALUE;
    public final int b = 20000000;
    public volatile long k = 0;
    public volatile long l = 0;

    /* compiled from: OutputBuffer.java */
    public static class a {
        public final ByteBuffer a;
        public final int b;
        public final boolean c;
        public long d;
        public final long e;
        public ArrayList f;
        public int g;
        public int h;
        public final long i;

        public a(ByteBuffer byteBuffer, long j, long j2, boolean z) {
            this.a = byteBuffer;
            this.d = j;
            this.e = j;
            this.i = j2;
            this.b = byteBuffer.remaining();
            this.c = z;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("{ ");
            sb.append(this.c ? "[s] " : "");
            sb.append(this.d);
            sb.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
            sb.append(this.d + this.a.remaining());
            sb.append(" (");
            return efz.b(this.i, ") }", sb);
        }
    }

    public l190(TimeMachine timeMachine, AtomicLong atomicLong) {
        this.j = timeMachine;
        this.c = atomicLong;
    }

    public final int a(ByteBuffer byteBuffer, boolean z) {
        long currentTimeMillis = this.j.currentTimeMillis();
        this.k++;
        if (this.g && !z) {
            this.l++;
            return 1;
        }
        this.g = false;
        a aVar = new a(byteBuffer, this.d, currentTimeMillis, z);
        this.a.put(Long.valueOf(this.d), aVar);
        long j = this.d;
        long j2 = aVar.b;
        this.d = j + j2;
        long addAndGet = this.c.addAndGet(j2);
        if (addAndGet > this.b) {
            StringBuilder b = fp.b(addAndGet, "Send buffer overflow: size=", "; limit=");
            b.append(this.b);
            throw new BufferOverflowException(b.toString());
        }
        Iterator<Map.Entry<Long, a>> it = this.a.entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            a value = it.next().getValue();
            if (this.d - value.d <= this.f && currentTimeMillis - value.i <= this.e && (!this.g || value.c)) {
                this.g = this.g && !value.c;
                c();
                return i;
            }
            this.g = true;
            it.remove();
            this.c.addAndGet(-value.b);
            this.l++;
            i++;
        }
        c();
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x01b8, code lost:
    
        if (r14.remaining() == 0) goto L71;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(long j, long j2) {
        Iterator<Map.Entry<Long, a>> it;
        boolean z;
        long j3;
        long j4;
        a aVar;
        long j5;
        long j6 = j;
        Long valueOf = Long.valueOf(j6);
        TreeMap<Long, a> treeMap = this.a;
        Long floorKey = treeMap.floorKey(valueOf);
        long j7 = j6 + j2;
        boolean z2 = true;
        Iterator<Map.Entry<Long, a>> it2 = treeMap.subMap(Long.valueOf(floorKey == null ? 0L : floorKey.longValue()), true, Long.valueOf(j7), false).entrySet().iterator();
        boolean z3 = false;
        while (it2.hasNext()) {
            a value = it2.next().getValue();
            long j8 = value.d;
            long j9 = value.e;
            ByteBuffer byteBuffer = value.a;
            boolean z4 = z2;
            long remaining = j8 + byteBuffer.remaining();
            long min = Math.min(remaining, Math.max(j6, value.d));
            long max = Math.max(min, Math.min(j7, remaining));
            if (min == max) {
                it = it2;
                z = z3;
                j3 = j7;
            } else {
                it = it2;
                z = z3;
                int i = (int) (max - min);
                value.g += i;
                value.h++;
                j3 = j7;
                if (min == value.d) {
                    if (max == remaining) {
                        aVar = value;
                        it.remove();
                        this.c.addAndGet(-aVar.b);
                        z3 = z4;
                        j6 = j;
                        z2 = z4;
                        it2 = it;
                        j7 = j3;
                    } else {
                        wr.c(i, byteBuffer);
                        value.d = max;
                    }
                } else if (max == remaining) {
                    byteBuffer.limit(byteBuffer.limit() - i);
                } else {
                    if (value.f == null) {
                        value.f = new ArrayList(50);
                    }
                    ArrayList arrayList = value.f;
                    if (i + min > min) {
                        arrayList.add(Long.valueOf(((int) (r2 - min)) | ((min - j9) << 32)));
                    }
                }
                if ((value.g >= byteBuffer.remaining() || value.h > 40) && value.h != 0) {
                    value.h = 0;
                    if (value.f != null) {
                        long remaining2 = value.d + byteBuffer.remaining();
                        Collections.sort(value.f);
                        long j10 = value.d;
                        value.g = 0;
                        long j11 = j10;
                        long j12 = j11;
                        int i2 = 0;
                        int i3 = 0;
                        while (true) {
                            if (i2 >= value.f.size()) {
                                j4 = remaining2;
                                aVar = value;
                                break;
                            }
                            long longValue = ((Long) value.f.get(i2)).longValue();
                            aVar = value;
                            long j13 = ((int) (longValue >>> 32)) + j9;
                            j4 = remaining2;
                            long j14 = ((int) (longValue & 4294967295L)) + j13;
                            if (j13 > j11) {
                                if (j13 >= j4) {
                                    break;
                                }
                                if (j11 > j12) {
                                    j5 = j14;
                                    aVar.g = (int) (aVar.g + (j11 - j12));
                                    aVar.f.set(i3, Long.valueOf(((int) r8) | ((j12 - j9) << 32)));
                                    i3++;
                                } else {
                                    j5 = j14;
                                }
                                j12 = j13;
                                j11 = j5;
                            } else {
                                j11 = Math.max(j14, j11);
                            }
                            if (j11 >= j4) {
                                break;
                            }
                            i2++;
                            value = aVar;
                            remaining2 = j4;
                        }
                        if (j11 > j12) {
                            if (j11 < j4) {
                                aVar.g = (int) (aVar.g + (j11 - j12));
                                aVar.f.set(i3, Long.valueOf(((j12 - j9) << 32) | ((int) r8)));
                                i3++;
                            } else if (j12 <= aVar.d) {
                                byteBuffer.limit(byteBuffer.position());
                                aVar.f = null;
                            } else {
                                byteBuffer.limit(byteBuffer.position() + ((int) (j12 - aVar.d)));
                            }
                        }
                        ArrayList arrayList2 = aVar.f;
                        arrayList2.subList(i3, arrayList2.size()).clear();
                    }
                }
                aVar = value;
            }
            z3 = z;
            j6 = j;
            z2 = z4;
            it2 = it;
            j7 = j3;
        }
        if (z3) {
            c();
        }
    }

    public final void c() {
        TreeMap<Long, a> treeMap = this.a;
        if (treeMap.isEmpty()) {
            this.h = -1L;
            this.i = 0L;
        } else {
            a value = treeMap.firstEntry().getValue();
            this.h = value.i;
            this.i = this.d - value.d;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{ waitingForSync=" + this.g + ", tailSN=" + this.d + ", _totalBytesQueued=" + this.c.get() + ", maxDeepnessBytes=" + this.f + ", maxDeepnessMS=" + this.e + ", " + this.a.size() + " packets: [");
        for (a aVar : this.a.values()) {
            sb.append(" ");
            sb.append(aVar);
        }
        sb.append(" ] }");
        return sb.toString();
    }
}
