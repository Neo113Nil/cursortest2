package one.video.streaming.oktp;

import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.ironsource.X3;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import one.video.streaming.tools.LogInterface;
import one.video.streaming.tools.TimeMachine;
import one.video.streaming.tools.exceptions.ProtocolException;
import ru.ok.android.commons.nio.charset.CharsetEncoder;
import ru.ok.proto.okmp.OkmpClient;
import xsna.bd3;
import xsna.c9f0;
import xsna.cgn;
import xsna.fp;
import xsna.gji0;
import xsna.h1x;
import xsna.jdy;
import xsna.k7b0;
import xsna.kkx0;
import xsna.l190;
import xsna.lf00;
import xsna.lvf;
import xsna.m6a;
import xsna.muk;
import xsna.mz70;
import xsna.ne7;
import xsna.nsr;
import xsna.odj;
import xsna.pj;
import xsna.q600;
import xsna.r490;
import xsna.tgw;
import xsna.urf0;
import xsna.vm9;
import xsna.vwo;
import xsna.wr;
import xsna.xno;
import xsna.xo9;
import xsna.ywk;
import xsna.zvo0;

/* compiled from: OktpChannelImpl.java */
/* loaded from: classes8.dex */
public final class a implements OktpChannel {
    public long a;
    public long b;
    public OkmpClient d;
    public final muk e;
    public final TransportWriter f;
    public final ywk g;
    public final LogInterface h;
    public final nsr o;
    public final lf00 p;
    public final xno q;
    public m6a r;
    public final TimeMachine s;
    public final AtomicInteger i = new AtomicInteger(-1);
    public final AtomicLong j = new AtomicLong();
    public final AtomicLong k = new AtomicLong();
    public final PriorityQueue<gji0> l = new PriorityQueue<>();
    public final HashMap m = new HashMap();
    public final HashMap n = new HashMap();
    public final vm9 c = new vm9(2);

    public a(TimeMachine timeMachine, jdy jdyVar, OkmpClient okmpClient, TransportWriter transportWriter, int i, mz70 mz70Var, LogInterface logInterface) {
        this.s = timeMachine;
        this.d = okmpClient;
        ywk ywkVar = new ywk();
        this.g = ywkVar;
        muk mukVar = new muk(timeMachine, transportWriter, ywkVar, false, false);
        this.e = mukVar;
        mukVar.e = mz70Var.a;
        int maxMTU = transportWriter.getMaxMTU();
        lf00 lf00Var = new lf00();
        lf00Var.b = timeMachine;
        transportWriter.getGuaranteedMTU();
        int guaranteedMTU = transportWriter.getGuaranteedMTU();
        lf00Var.a = guaranteedMTU;
        Math.max(maxMTU, guaranteedMTU + 1);
        this.p = lf00Var;
        this.f = transportWriter;
        this.o = new nsr(timeMachine, lf00Var.a);
        this.q = new xno(this, jdyVar);
        this.h = logInterface;
    }

    @Override // one.video.streaming.oktp.OktpChannel
    public final int allocateSendStream(int i, int i2) {
        int incrementAndGet = this.i.incrementAndGet();
        if (incrementAndGet >= 20) {
            throw new IllegalStateException(tgw.b(incrementAndGet, "Too many streams in one channel: ", " max=20"));
        }
        gji0 gji0Var = new gji0(this.s, incrementAndGet, this.j, i);
        this.l.add(gji0Var);
        this.m.put(Integer.valueOf(incrementAndGet), gji0Var);
        return incrementAndGet;
    }

    @Override // one.video.streaming.oktp.OktpChannel
    public final long bytesPending() {
        long j;
        long j2 = 0;
        for (gji0 gji0Var : this.m.values()) {
            synchronized (gji0Var) {
                l190 l190Var = gji0Var.b;
                l190Var.c();
                j = l190Var.i;
            }
            j2 += j;
        }
        return j2;
    }

    @Override // one.video.streaming.oktp.OktpChannel
    public final void close() throws IOException, ProtocolException {
        ne7.m("Publisher", "close()");
    }

    @Override // one.video.streaming.oktp.OktpChannel
    public final void connect(int i) throws IOException, ProtocolException {
        ne7.m("Publisher", "connect(" + i + ")");
        ((zvo0) this.q.c).b();
    }

    @Override // one.video.streaming.oktp.OktpChannel
    public final String dumpToString() {
        return toString();
    }

    @Override // one.video.streaming.oktp.OktpChannel
    public final float getAverageLossRateFast() {
        return this.o.b.a.b;
    }

    @Override // one.video.streaming.oktp.OktpChannel
    public final float getAverageLossRateSlow() {
        return this.o.b.b.b;
    }

    @Override // one.video.streaming.oktp.OktpChannel
    public final float getAverageRTT() {
        return this.o.g.b;
    }

    @Override // one.video.streaming.oktp.OktpChannel
    public final long getEstimatedBitrate(long j) {
        float f = (long) this.o.i.f;
        return f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? j : (long) f;
    }

    @Override // one.video.streaming.oktp.OktpChannel
    public final int getExpectedDeliveryDelayMS(int i) {
        int i2;
        float f = this.o.g.b;
        float sqrt = (float) Math.sqrt(r0.h.b);
        if (Float.isNaN(f) || Float.isNaN(sqrt)) {
            i2 = 500;
        } else {
            i2 = (int) Math.min(5000.0f, Math.max(20.0f, Math.min(r1 * 2, (sqrt * 2.0f) + ((int) f)) + 30.0f));
        }
        return i * i2;
    }

    @Override // one.video.streaming.oktp.OktpChannel
    public final long getInactiveTime() {
        return this.o.a.a(0L);
    }

    @Override // one.video.streaming.oktp.OktpChannel
    public final int getMTU() {
        return this.p.a;
    }

    @Override // one.video.streaming.oktp.OktpChannel
    public final double getRetransmitOverhead() {
        Iterator it = this.m.values().iterator();
        while (it.hasNext()) {
            ((gji0) it.next()).getClass();
        }
        double d = 0L;
        return d / d;
    }

    @Override // one.video.streaming.oktp.OktpChannel
    public final TimeMachine getTimeMachine() {
        return this.s;
    }

    @Override // one.video.streaming.oktp.OktpChannel
    public final boolean isClosed() {
        m6a m6aVar = this.r;
        if (m6aVar == null) {
            return false;
        }
        m6aVar.getClass();
        return false;
    }

    @Override // one.video.streaming.oktp.OktpChannel
    public final boolean isHandshaked() {
        return this.g.b != 0;
    }

    @Override // one.video.streaming.oktp.OktpChannel
    public final void pause() {
        ne7.m("Publisher", "pause()");
        this.o.i.h = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:264:0x0776, code lost:
    
        throw new one.video.streaming.tools.exceptions.ProtocolException(xsna.lhg.a(r4, "Received invalid message, size="));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0641  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x06dd  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0712 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:269:0x06e9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x06e4  */
    /* JADX WARN: Type inference failed for: r7v51, types: [byte[], java.io.Serializable] */
    @Override // one.video.streaming.oktp.OktpChannel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void process(boolean z, ByteBuffer byteBuffer) throws ProtocolException, IOException {
        byte b;
        Integer num;
        int i;
        int i2;
        byte b2;
        Integer num2;
        int i3;
        Map.Entry<Long, ByteBuffer> firstEntry;
        long j;
        long j2;
        ByteBuffer byteBuffer2;
        byte b3;
        Integer num3;
        int i4;
        int i5;
        int i6;
        lf00 lf00Var;
        int i7;
        a aVar = this;
        ByteBuffer byteBuffer3 = byteBuffer;
        byte b4 = 5;
        byte b5 = byteBuffer3.get(byteBuffer3.position() + 5);
        aVar.c.getClass();
        byte b6 = 0;
        if (ne7.y(0, "OKTP")) {
            StringBuilder sb = new StringBuilder("Client <- Server: ");
            sb.append(X3.j.d + byteBuffer3.limit() + "] ");
            sb.append(r490.g(byteBuffer3));
            sb.append("");
            ne7.m("OKTP", sb.toString());
        }
        aVar.c.getClass();
        int remaining = byteBuffer3.remaining();
        byte b7 = 1;
        if ((byteBuffer3.get(byteBuffer3.position() + 5) & 1) == 0) {
            aVar.a++;
        }
        aVar.b += byteBuffer3.remaining();
        Integer valueOf = byteBuffer3.remaining() < 10 ? null : Integer.valueOf(byteBuffer3.getInt(byteBuffer3.position() + 6));
        if (valueOf == null) {
            ne7.p("Publisher", "OktpChannel.process() - failed to extract channelId!!!");
            return;
        }
        aVar.c.getClass();
        byteBuffer3.position(byteBuffer3.position() + 10);
        byte b8 = -1;
        int i8 = -1;
        loop0: while (byteBuffer3.remaining() >= 3) {
            byte b9 = byteBuffer3.get();
            byte b10 = (b9 & 128) != 0 ? b7 : b6;
            byte b11 = (byte) (b9 & CharsetEncoder.DEFAULT_REPLACEMENT);
            int i9 = byteBuffer3.getShort() & 65535;
            int remaining2 = byteBuffer3.remaining();
            if (remaining2 < i9) {
                byte b12 = b5;
                StringBuilder a = odj.a(remaining2, i9, "Datagram validation error: datagram.remaining()=", " payloadSize=", " prevPacket=");
                cgn.a(b8, i8, DomExceptionUtils.SEPARATOR, " datagramSize=", a);
                throw new ProtocolException(bd3.b(" datgramFlags=", remaining, b12, a));
            }
            int position = byteBuffer3.position() + i9;
            int limit = byteBuffer3.limit();
            byteBuffer3.limit(position);
            int intValue = valueOf.intValue();
            boolean z2 = (valueOf.intValue() == 0 || !z) ? (byte) 0 : b7;
            if (b11 != 0) {
                if (b11 != b7) {
                    if (b11 != 2) {
                        if (b11 != 3) {
                            if (b11 != b4) {
                                if (b11 != 6) {
                                    if (b11 != 8) {
                                        if (b11 == 9) {
                                            int i10 = byteBuffer3.getInt();
                                            StringBuilder sb2 = new StringBuilder("handleSNPacket() - channelId=");
                                            sb2.append(intValue);
                                            sb2.append(", verified=");
                                            sb2.append(z2);
                                            sb2.append(", sn=");
                                            cgn.a(i10, remaining, ",  datagramSize=", ", data=", sb2);
                                            sb2.append(byteBuffer3);
                                            ne7.t("Publisher", sb2.toString());
                                        }
                                        b = b5;
                                        num = valueOf;
                                        i = i9;
                                        i2 = limit;
                                        b2 = b11;
                                        b3 = 0;
                                        i3 = remaining;
                                    } else {
                                        byteBuffer3.getInt();
                                        ne7.m("Publisher", "handleClosePacket()");
                                        if (aVar.g.b == 0 || z2 != 0 || aVar.o.a.a(0L) > 3000) {
                                            ne7.m("Publisher", "initClosing()");
                                            if (aVar.r == null) {
                                                TimeMachine timeMachine = aVar.s;
                                                m6a m6aVar = new m6a();
                                                m6aVar.b = timeMachine;
                                                aVar.r = m6aVar;
                                                Iterator it = aVar.n.values().iterator();
                                                while (it.hasNext()) {
                                                    ((c9f0) it.next()).g = null;
                                                }
                                            }
                                            m6a m6aVar2 = aVar.r;
                                            muk mukVar = aVar.e;
                                            m6aVar2.getClass();
                                            mukVar.d(new lvf(8), 0);
                                            mukVar.b();
                                            mukVar.a(true);
                                        }
                                        b = b5;
                                        num = valueOf;
                                        i = i9;
                                        i2 = limit;
                                        b2 = b11;
                                        b3 = 0;
                                        i3 = remaining;
                                    }
                                } else if (z2 != 0) {
                                    ne7.n("Publisher", "PT_ACCEPT: ignored - not verified");
                                } else {
                                    ne7.m("Publisher", "handleAcceptPacket()");
                                    byteBuffer3.get();
                                    byte[] i11 = xo9.i(byteBuffer3);
                                    byte[] i12 = xo9.i(byteBuffer3);
                                    if (i11 != null && i12 != null) {
                                        xno xnoVar = aVar.q;
                                        a aVar2 = (a) xnoVar.a;
                                        jdy jdyVar = (jdy) xnoVar.d;
                                        byte[] bArr = jdyVar.c;
                                        if (bArr == null) {
                                            jdyVar.setRemoteKey(i12);
                                            aVar2.setSecret(jdyVar.b);
                                            aVar2.g.b = intValue;
                                        } else if (!Arrays.equals(i11, bArr)) {
                                            aVar2.sendReject(i11);
                                        }
                                        if (aVar.g.b != 0) {
                                            aVar.d.onAccept();
                                        }
                                    }
                                    b = b5;
                                    num = valueOf;
                                    i = i9;
                                    i2 = limit;
                                    b2 = b11;
                                    b3 = 0;
                                    i3 = remaining;
                                }
                            } else if (z2 != 0) {
                                ne7.n("Publisher", "PT_INVITE: ignored - not verified");
                            } else {
                                ne7.m("Publisher", "handleInvitePacket()");
                                byteBuffer3.get();
                                ?? i13 = xo9.i(byteBuffer3);
                                if (i13 != 0) {
                                    xno xnoVar2 = aVar.q;
                                    muk mukVar2 = aVar.e;
                                    a aVar3 = (a) xnoVar2.a;
                                    jdy jdyVar2 = (jdy) xnoVar2.d;
                                    byte[] bArr2 = (byte[]) xnoVar2.b;
                                    if (bArr2 == null) {
                                        xnoVar2.b = i13;
                                        jdyVar2.setRemoteKey(i13);
                                        aVar3.setSecret(jdyVar2.b);
                                    } else if (!Arrays.equals((byte[]) i13, bArr2)) {
                                        aVar3.sendReject(i13);
                                    }
                                    ByteBuffer d = mukVar2.d(new pj(6), -1);
                                    d.putShort((short) i13.length);
                                    d.put((byte[]) i13);
                                    byte[] publicKey = jdyVar2.getPublicKey();
                                    d.putShort((short) publicKey.length);
                                    d.put(publicKey);
                                    mukVar2.b();
                                    mukVar2.a(false);
                                    b = b5;
                                    b3 = 0;
                                    num = valueOf;
                                    i = i9;
                                    i5 = limit;
                                    b2 = b11;
                                    i3 = remaining;
                                }
                                b = b5;
                                num = valueOf;
                                i = i9;
                                i2 = limit;
                                b2 = b11;
                                b3 = 0;
                                i3 = remaining;
                            }
                            byteBuffer3.limit(i5);
                            byteBuffer3.position(position);
                            remaining = i3;
                            b6 = b3;
                            valueOf = num;
                            b8 = b2;
                            b5 = b;
                            i8 = i;
                            b4 = 5;
                            b7 = 1;
                        } else if (z2 == 0) {
                            ne7.n("Publisher", "PT_ECHO_RESPONSE: ignored - not verified");
                        } else {
                            int i14 = byteBuffer3.getInt();
                            int i15 = byteBuffer3.getInt();
                            int position2 = byteBuffer3.position();
                            nsr nsrVar = aVar.o;
                            int i16 = aVar.p.a;
                            nsrVar.a.b();
                            num = valueOf;
                            nsrVar.d += i14 - nsrVar.e;
                            nsrVar.e = i14;
                            int i17 = i15 - nsrVar.f;
                            nsrVar.c = i16;
                            if (i17 > 0) {
                                nsrVar.i.a(i17);
                                nsrVar.a();
                            }
                            nsrVar.f = i15;
                            long j3 = byteBuffer3.getInt() - ((int) 0);
                            int i18 = byteBuffer3.getInt();
                            nsrVar.k = Math.max(nsrVar.k, j3);
                            long j4 = nsrVar.d;
                            q600 q600Var = nsrVar.b;
                            kkx0 kkx0Var = q600Var.a;
                            b2 = b11;
                            kkx0 kkx0Var2 = q600Var.b;
                            b = b5;
                            zvo0 zvo0Var = q600Var.c;
                            i = i9;
                            i2 = limit;
                            long j5 = q600Var.d;
                            if (j3 >= j5) {
                                long j6 = q600Var.e;
                                if (j4 >= j6) {
                                    long j7 = j3 - j5;
                                    long j8 = j4 - j6;
                                    long j9 = j7 - j8;
                                    if (j7 < -1000 || j9 < -1000 || j7 > 500000 || j9 > 500000 || j9 > j7) {
                                        i6 = position2;
                                        q600Var.d = j3;
                                        q600Var.e = j4;
                                        zvo0Var.b();
                                    } else {
                                        i6 = position2;
                                        long a2 = zvo0Var.a(0L);
                                        if (j7 > 0 && j8 > 0 && a2 > 100) {
                                            float f = j9 / j7;
                                            if (kkx0Var2.a(f) >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && (kkx0Var.a(f) >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || a2 >= 5000)) {
                                                kkx0Var.b = kkx0Var.a(f);
                                                kkx0Var2.b = kkx0Var2.a(f);
                                                q600Var.d = j3;
                                                q600Var.e = j4;
                                                zvo0Var.b();
                                            }
                                        }
                                    }
                                    int currentTimeMillis = ((int) nsrVar.l.currentTimeMillis()) - i18;
                                    kkx0 kkx0Var3 = nsrVar.g;
                                    float f2 = currentTimeMillis;
                                    kkx0Var3.b = kkx0Var3.a(f2);
                                    float f3 = f2 - nsrVar.g.b;
                                    kkx0 kkx0Var4 = nsrVar.h;
                                    kkx0Var4.b = kkx0Var4.a(f3 * f3);
                                    byteBuffer3 = byteBuffer;
                                    byteBuffer3.position(i6);
                                    aVar = this;
                                    lf00Var = aVar.p;
                                    lf00Var.getClass();
                                    byteBuffer3.position(byteBuffer3.position() + 8);
                                    if (byteBuffer3.remaining() >= 2 && (i7 = byteBuffer3.getShort() & 65535) > lf00Var.a) {
                                        lf00Var.a = i7;
                                    }
                                    muk mukVar3 = aVar.e;
                                    int i19 = aVar.p.a;
                                    mukVar3.g = i19;
                                    mukVar3.o = i19 + 19;
                                }
                            }
                            i6 = position2;
                            int currentTimeMillis2 = ((int) nsrVar.l.currentTimeMillis()) - i18;
                            kkx0 kkx0Var32 = nsrVar.g;
                            float f22 = currentTimeMillis2;
                            kkx0Var32.b = kkx0Var32.a(f22);
                            float f32 = f22 - nsrVar.g.b;
                            kkx0 kkx0Var42 = nsrVar.h;
                            kkx0Var42.b = kkx0Var42.a(f32 * f32);
                            byteBuffer3 = byteBuffer;
                            byteBuffer3.position(i6);
                            aVar = this;
                            lf00Var = aVar.p;
                            lf00Var.getClass();
                            byteBuffer3.position(byteBuffer3.position() + 8);
                            if (byteBuffer3.remaining() >= 2) {
                                lf00Var.a = i7;
                            }
                            muk mukVar32 = aVar.e;
                            int i192 = aVar.p.a;
                            mukVar32.g = i192;
                            mukVar32.o = i192 + 19;
                        }
                        b = b5;
                        num = valueOf;
                        i = i9;
                        i5 = limit;
                        b2 = b11;
                        b3 = 0;
                        i3 = remaining;
                        byteBuffer3.limit(i5);
                        byteBuffer3.position(position);
                        remaining = i3;
                        b6 = b3;
                        valueOf = num;
                        b8 = b2;
                        b5 = b;
                        i8 = i;
                        b4 = 5;
                        b7 = 1;
                    } else {
                        b = b5;
                        num = valueOf;
                        i = i9;
                        i2 = limit;
                        b2 = b11;
                        if (z2 == 0) {
                            ne7.n("Publisher", "PT_ECHO: ignored - not verified");
                        } else {
                            int remaining3 = byteBuffer3.remaining();
                            muk mukVar4 = aVar.e;
                            int i20 = mukVar4.g;
                            mukVar4.c.getClass();
                            if (remaining3 <= i20 - 47) {
                                k7b0.c(byteBuffer3, mukVar4.d(new vwo((int) aVar.a, (int) aVar.b), remaining3), remaining3);
                                mukVar4.b();
                            }
                            i3 = remaining;
                            b3 = 0;
                        }
                    }
                    i3 = remaining;
                    i5 = i2;
                    b3 = 0;
                    byteBuffer3.limit(i5);
                    byteBuffer3.position(position);
                    remaining = i3;
                    b6 = b3;
                    valueOf = num;
                    b8 = b2;
                    b5 = b;
                    i8 = i;
                    b4 = 5;
                    b7 = 1;
                } else {
                    b = b5;
                    num = valueOf;
                    i = i9;
                    i2 = limit;
                    b2 = b11;
                    int i21 = 8;
                    if (z2 == 0) {
                        ne7.n("Publisher", "PT_ACK: ignored - not verified");
                    } else {
                        gji0 gji0Var = (gji0) aVar.m.get(Integer.valueOf(byteBuffer3.get()));
                        if (gji0Var != null) {
                            synchronized (gji0Var) {
                                try {
                                    if (byteBuffer3.remaining() >= 4) {
                                        int i22 = byteBuffer3.getInt();
                                        l190 l190Var = gji0Var.b;
                                        long j10 = (i22 + l190Var.d) - ((int) r7);
                                        TreeMap<Long, l190.a> treeMap = l190Var.a;
                                        if (j10 < (treeMap.isEmpty() ? l190Var.d : treeMap.firstEntry().getValue().d)) {
                                            gji0Var.h = 1;
                                        } else {
                                            gji0Var.h = 0;
                                        }
                                        gji0Var.b.b(0L, j10);
                                        while (true) {
                                            int i23 = i21;
                                            if (byteBuffer3.remaining() < i23) {
                                                break;
                                            }
                                            long j11 = j10 + byteBuffer3.getInt();
                                            long j12 = byteBuffer3.getInt() + j11;
                                            gji0Var.b.b(j11, j12 - j11);
                                            i21 = i23;
                                            j10 = j12;
                                        }
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                        i3 = remaining;
                        b3 = 0;
                    }
                    i3 = remaining;
                    i5 = i2;
                    b3 = 0;
                    byteBuffer3.limit(i5);
                    byteBuffer3.position(position);
                    remaining = i3;
                    b6 = b3;
                    valueOf = num;
                    b8 = b2;
                    b5 = b;
                    i8 = i;
                    b4 = 5;
                    b7 = 1;
                }
                i5 = i2;
                byteBuffer3.limit(i5);
                byteBuffer3.position(position);
                remaining = i3;
                b6 = b3;
                valueOf = num;
                b8 = b2;
                b5 = b;
                i8 = i;
                b4 = 5;
                b7 = 1;
            } else {
                b = b5;
                num = valueOf;
                i = i9;
                i2 = limit;
                b2 = b11;
                if (z2 == 0) {
                    ne7.n("Publisher", "PT_DATA: ignored - not verified");
                    i3 = remaining;
                    i5 = i2;
                    b3 = 0;
                    byteBuffer3.limit(i5);
                    byteBuffer3.position(position);
                    remaining = i3;
                    b6 = b3;
                    valueOf = num;
                    b8 = b2;
                    b5 = b;
                    i8 = i;
                    b4 = 5;
                    b7 = 1;
                } else {
                    byte b13 = byteBuffer3.get();
                    int i24 = byteBuffer3.getInt();
                    Integer valueOf2 = b10 != 0 ? Integer.valueOf(byteBuffer3.getInt()) : null;
                    HashMap hashMap = aVar.n;
                    c9f0 c9f0Var = (c9f0) hashMap.get(Integer.valueOf(b13));
                    if (c9f0Var == null) {
                        c9f0 c9f0Var2 = new c9f0(aVar.k);
                        c9f0Var2.g = aVar;
                        hashMap.put(Integer.valueOf(b13), c9f0Var2);
                        c9f0Var = c9f0Var2;
                    }
                    h1x h1xVar = c9f0Var.a;
                    long j13 = c9f0Var.c + (i24 - c9f0Var.b);
                    c9f0Var.c = j13;
                    c9f0Var.b = i24;
                    long j14 = h1xVar.a;
                    AtomicLong atomicLong = h1xVar.b;
                    TreeMap<Long, ByteBuffer> treeMap2 = h1xVar.c;
                    if (j13 < h1xVar.d) {
                        if (byteBuffer3.remaining() + j13 > h1xVar.d) {
                            byteBuffer3.position(byteBuffer3.position() + ((int) (h1xVar.d - j13)));
                            j13 = h1xVar.d;
                        }
                        num2 = valueOf2;
                        i3 = remaining;
                        if (num2 != null) {
                            int intValue2 = num2.intValue();
                            long j15 = c9f0Var.c + (intValue2 - c9f0Var.b);
                            c9f0Var.c = j15;
                            c9f0Var.b = intValue2;
                            AtomicLong atomicLong2 = h1xVar.b;
                            TreeMap<Long, ByteBuffer> treeMap3 = h1xVar.c;
                            if (j15 > h1xVar.d) {
                                h1xVar.d = j15;
                                Iterator<Map.Entry<Long, ByteBuffer>> it2 = treeMap3.entrySet().iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        break;
                                    }
                                    Map.Entry<Long, ByteBuffer> next = it2.next();
                                    long longValue = h1xVar.d - next.getKey().longValue();
                                    ByteBuffer value = next.getValue();
                                    if (longValue <= 0) {
                                        break;
                                    }
                                    if (longValue < value.remaining()) {
                                        it2.remove();
                                        value.position(value.position() + ((int) longValue));
                                        atomicLong2.addAndGet(-longValue);
                                        treeMap3.put(Long.valueOf(h1xVar.d), value);
                                        break;
                                    }
                                    it2.remove();
                                    atomicLong2.addAndGet(-value.remaining());
                                }
                            }
                        }
                        firstEntry = h1xVar.c.firstEntry();
                        if (firstEntry != null && firstEntry.getKey().longValue() == h1xVar.d) {
                            ByteBuffer byteBuffer4 = c9f0Var.e;
                            while (true) {
                                j = h1xVar.e;
                                j2 = h1xVar.d;
                                if (j == j2) {
                                    c9f0Var.d = null;
                                    c9f0Var.f = true;
                                }
                                byteBuffer2 = c9f0Var.d;
                                if (byteBuffer2 != null) {
                                    Iterator<Map.Entry<Long, ByteBuffer>> it3 = h1xVar.c.entrySet().iterator();
                                    while (it3.hasNext()) {
                                        if (it3.next().getKey().longValue() != j2) {
                                            break;
                                        }
                                        j2 += r10.getValue().remaining();
                                        c9f0 c9f0Var3 = c9f0Var;
                                        if (j2 >= h1xVar.d + 4) {
                                            byteBuffer4.position(0);
                                            c9f0Var3.a(byteBuffer4);
                                            byteBuffer4.flip();
                                            int i25 = byteBuffer4.getInt();
                                            if (i25 < 0 || i25 > 3000000) {
                                                break loop0;
                                            }
                                            c9f0Var3.d = ByteBuffer.allocate(i25);
                                            c9f0Var = c9f0Var3;
                                        } else {
                                            c9f0Var = c9f0Var3;
                                        }
                                    }
                                    break;
                                }
                                c9f0Var.a(byteBuffer2);
                                if (c9f0Var.d.remaining() != 0) {
                                    break;
                                }
                                c9f0Var.d.rewind();
                                a aVar4 = c9f0Var.g;
                                if (aVar4 != null) {
                                    ByteBuffer byteBuffer5 = c9f0Var.d;
                                    boolean z3 = c9f0Var.f;
                                    OkmpClient okmpClient = aVar4.d;
                                    if (okmpClient != null) {
                                        okmpClient.handleIncomingData(byteBuffer5, z3);
                                    }
                                }
                                c9f0Var.d = null;
                                c9f0Var.f = false;
                                i5 = i2;
                                byteBuffer3.limit(i5);
                                byteBuffer3.position(position);
                                remaining = i3;
                                b6 = b3;
                                valueOf = num;
                                b8 = b2;
                                b5 = b;
                                i8 = i;
                                b4 = 5;
                                b7 = 1;
                            }
                            b3 = 0;
                            i5 = i2;
                            byteBuffer3.limit(i5);
                            byteBuffer3.position(position);
                            remaining = i3;
                            b6 = b3;
                            valueOf = num;
                            b8 = b2;
                            b5 = b;
                            i8 = i;
                            b4 = 5;
                            b7 = 1;
                        }
                        b3 = 0;
                        i5 = i2;
                        byteBuffer3.limit(i5);
                        byteBuffer3.position(position);
                        remaining = i3;
                        b6 = b3;
                        valueOf = num;
                        b8 = b2;
                        b5 = b;
                        i8 = i;
                        b4 = 5;
                        b7 = 1;
                    }
                    Map.Entry<Long, ByteBuffer> floorEntry = treeMap2.floorEntry(Long.valueOf(j13));
                    SortedMap<Long, ByteBuffer> subMap = treeMap2.subMap(Long.valueOf(floorEntry == null ? 0L : floorEntry.getKey().longValue()), Long.valueOf(byteBuffer3.remaining() + j13));
                    int position3 = byteBuffer3.position();
                    Iterator<Map.Entry<Long, ByteBuffer>> it4 = subMap.entrySet().iterator();
                    while (it4.hasNext() && byteBuffer3.remaining() > 0) {
                        long longValue2 = it4.next().getKey().longValue();
                        long j16 = j13;
                        long remaining4 = longValue2 + r15.getValue().remaining();
                        if (longValue2 > j16) {
                            num3 = valueOf2;
                            i4 = remaining;
                            if (remaining4 <= j16 + byteBuffer3.remaining()) {
                                atomicLong.addAndGet(-(remaining4 - longValue2));
                                it4.remove();
                            } else {
                                byteBuffer3.limit(((int) (longValue2 - j16)) + byteBuffer3.position());
                            }
                        } else if (remaining4 <= j16) {
                            i4 = remaining;
                            num3 = valueOf2;
                        } else if (remaining4 >= j16 + byteBuffer3.remaining()) {
                            num2 = valueOf2;
                            i3 = remaining;
                            break;
                        } else {
                            i4 = remaining;
                            num3 = valueOf2;
                            int min = Math.min(byteBuffer3.remaining(), (int) (remaining4 - j16));
                            wr.c(min, byteBuffer3);
                            j16 += min;
                        }
                        remaining = i4;
                        valueOf2 = num3;
                        j13 = j16;
                    }
                    num2 = valueOf2;
                    long j17 = j13;
                    int i26 = remaining;
                    int remaining5 = byteBuffer3.remaining();
                    i3 = i26;
                    if (remaining5 > 0) {
                        long addAndGet = atomicLong.addAndGet(remaining5);
                        if (addAndGet > j14) {
                            StringBuilder b14 = fp.b(addAndGet, "Input buffer overflow: total=", " limit=");
                            b14.append(j14);
                            throw new ProtocolException(b14.toString());
                        }
                        ByteBuffer allocate = ByteBuffer.allocate(remaining5);
                        byteBuffer3.get(allocate.array(), allocate.arrayOffset(), remaining5);
                        allocate.rewind();
                        treeMap2.put(Long.valueOf(j17), allocate);
                    }
                    byteBuffer3.position(position3);
                    if (num2 != null) {
                    }
                    firstEntry = h1xVar.c.firstEntry();
                    if (firstEntry != null) {
                        ByteBuffer byteBuffer42 = c9f0Var.e;
                        while (true) {
                            j = h1xVar.e;
                            j2 = h1xVar.d;
                            if (j == j2) {
                            }
                            byteBuffer2 = c9f0Var.d;
                            if (byteBuffer2 != null) {
                            }
                            i5 = i2;
                            byteBuffer3.limit(i5);
                            byteBuffer3.position(position);
                            remaining = i3;
                            b6 = b3;
                            valueOf = num;
                            b8 = b2;
                            b5 = b;
                            i8 = i;
                            b4 = 5;
                            b7 = 1;
                        }
                        b3 = 0;
                        i5 = i2;
                        byteBuffer3.limit(i5);
                        byteBuffer3.position(position);
                        remaining = i3;
                        b6 = b3;
                        valueOf = num;
                        b8 = b2;
                        b5 = b;
                        i8 = i;
                        b4 = 5;
                        b7 = 1;
                    }
                    b3 = 0;
                    i5 = i2;
                    byteBuffer3.limit(i5);
                    byteBuffer3.position(position);
                    remaining = i3;
                    b6 = b3;
                    valueOf = num;
                    b8 = b2;
                    b5 = b;
                    i8 = i;
                    b4 = 5;
                    b7 = 1;
                }
            }
        }
    }

    @Override // one.video.streaming.oktp.OktpChannel
    public final void removeListener() {
        ne7.m("Publisher", "removeListener");
        this.d = null;
    }

    @Override // one.video.streaming.oktp.OktpChannel
    public final void resume() {
        ne7.m("Publisher", "resume()");
        this.o.i.h = false;
    }

    @Override // one.video.streaming.oktp.OktpChannel
    public final void sendReject(byte[] bArr) throws IOException, ProtocolException {
        ne7.m("Publisher", "sendReject()");
        urf0 urf0Var = new urf0(7);
        int length = bArr.length;
        muk mukVar = this.e;
        ByteBuffer d = mukVar.d(urf0Var, length);
        d.putShort((short) bArr.length);
        d.put(bArr);
        mukVar.b();
        mukVar.a(false);
    }

    @Override // one.video.streaming.oktp.OktpChannel
    public final long sendStreamGetBufferDeepnessMS(int i) {
        gji0 gji0Var = (gji0) this.m.get(Integer.valueOf(i));
        long j = 0;
        if (gji0Var == null) {
            return 0L;
        }
        synchronized (gji0Var) {
            l190 l190Var = gji0Var.b;
            if (!l190Var.a.isEmpty() && l190Var.h > 0) {
                j = l190Var.j.currentTimeMillis() - l190Var.h;
            }
        }
        return j;
    }

    @Override // one.video.streaming.oktp.OktpChannel
    public final long sendStreamGetPacketsSent(int i) {
        gji0 gji0Var = (gji0) this.m.get(Integer.valueOf(i));
        if (gji0Var != null) {
            return gji0Var.b.k;
        }
        return 0L;
    }

    @Override // one.video.streaming.oktp.OktpChannel
    public final long sendStreamGetTotalDrops(int i) {
        gji0 gji0Var = (gji0) this.m.get(Integer.valueOf(i));
        if (gji0Var != null) {
            return gji0Var.b.l;
        }
        return 0L;
    }

    @Override // one.video.streaming.oktp.OktpChannel
    public final boolean sendStreamIsWaitingForSync(int i) {
        boolean z;
        gji0 gji0Var = (gji0) this.m.get(Integer.valueOf(i));
        if (gji0Var == null) {
            return false;
        }
        synchronized (gji0Var) {
            z = gji0Var.b.g;
        }
        return z;
    }

    @Override // one.video.streaming.oktp.OktpChannel
    public final int sendStreamPushPacket(int i, ByteBuffer byteBuffer, int i2, boolean z) throws ProtocolException {
        int a;
        gji0 gji0Var = (gji0) this.m.get(Integer.valueOf(i));
        if (gji0Var == null) {
            return 0;
        }
        synchronized (gji0Var) {
            a = gji0Var.b.a(byteBuffer, z);
            if (a > 0) {
                gji0Var.h = 3;
            }
        }
        return a;
    }

    @Override // one.video.streaming.oktp.OktpChannel
    public final void sendStreamSetMaxDeepness(int i, int i2, int i3) {
        gji0 gji0Var = (gji0) this.m.get(Integer.valueOf(i));
        if (gji0Var != null) {
            synchronized (gji0Var) {
                l190 l190Var = gji0Var.b;
                l190Var.e = i2;
                l190Var.f = i3;
            }
        }
    }

    @Override // one.video.streaming.oktp.OktpChannel
    public final void sendStreamSetMustEncrypt(int i, boolean z) {
        gji0 gji0Var = (gji0) this.m.get(Integer.valueOf(i));
        if (gji0Var != null) {
            gji0Var.i = z;
        }
    }

    @Override // one.video.streaming.oktp.OktpChannel
    public final void setKey(int i) {
        this.g.b = i;
    }

    @Override // one.video.streaming.oktp.OktpChannel
    public final void setSecret(byte[] bArr) {
        this.c.c = bArr;
        ((vm9) this.g.c).c = bArr;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OktpChannelImpl {\n  sendStreams = {\n");
        HashMap hashMap = this.m;
        for (Integer num : hashMap.keySet()) {
            int intValue = num.intValue();
            gji0 gji0Var = (gji0) hashMap.get(num);
            sb.append("    ");
            sb.append(intValue);
            sb.append(": ");
            sb.append(gji0Var);
            sb.append("\n");
        }
        sb.append("  }\n}");
        return sb.toString();
    }

    @Override // one.video.streaming.oktp.OktpChannel
    public final void flush() throws IOException, ProtocolException {
    }
}
