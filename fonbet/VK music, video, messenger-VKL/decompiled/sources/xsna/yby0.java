package xsna;

import com.ironsource.X3;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.nio.ByteBuffer;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import one.video.calls.sdk_private.aG;
import one.video.calls.sdk_private.ap$a;
import one.video.calls.sdk_private.bF;
import one.video.calls.sdk_private.bJ;

/* compiled from: AckFrame.java */
/* loaded from: classes8.dex */
public final class yby0 extends ihy0 {
    public static final int h = (int) Math.pow(2.0d, 3.0d);
    public final byte[] b;
    public long c;
    public int d;
    public List<jhy0> e;
    public int f;
    public String g;

    public yby0() {
        this.f = 8;
        this.g = null;
    }

    @Override // xsna.ihy0
    public final int a() {
        byte[] bArr = this.b;
        if (bArr != null) {
            return bArr.length;
        }
        throw new IllegalStateException("frame length not known for parsed frames");
    }

    @Override // xsna.ihy0
    public final void b(ByteBuffer byteBuffer) {
        byteBuffer.put(this.b);
    }

    @Override // xsna.ihy0
    public final void c(bF bFVar, tly0 tly0Var, com.vk.movika.sdk.base.data.converter.c cVar) {
        this.f = (int) Math.pow(2.0d, bFVar.n);
        bFVar.s().a[tly0Var.o().ordinal()].a(this);
        cny0 cny0Var = bFVar.m;
        aG o = tly0Var.o();
        Instant instant = (Instant) cVar.b;
        if (cny0Var.p) {
            return;
        }
        if (cny0Var.m > 0 && !cny0Var.j()) {
            cny0Var.m = 0;
        }
        final vmy0 vmy0Var = cny0Var.e[o.ordinal()];
        if (!vmy0Var.k) {
            vmy0Var.h = Long.max(vmy0Var.h, this.c);
            List list = (List) this.e.stream().flatMap(new yvn()).filter(new qj6(vmy0Var, 1)).map(new Function() { // from class: xsna.rmy0
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return (xmy0) vmy0.this.f.get((Long) obj);
                }
            }).filter(new smy0()).filter(new i44(3)).collect(Collectors.toList());
            vmy0Var.g.getAndAdd(((int) list.stream().filter(new xay0(1)).count()) * (-1));
            int i = 1;
            vmy0Var.d.a((List) list.stream().filter(new mjy0(i)).collect(Collectors.toList()));
            vmy0Var.b();
            vmy0Var.b.g();
            eny0 eny0Var = vmy0Var.c;
            Optional findFirst = list.stream().filter(new by10(this, i)).findFirst();
            if (findFirst.isPresent() && list.stream().anyMatch(new dny0())) {
                Instant instant2 = ((xmy0) findFirst.get()).a;
                int i2 = (this.d * this.f) / 1000;
                if (instant.isBefore(instant2)) {
                    Objects.toString(instant2);
                    instant.toString();
                } else {
                    if (i2 > eny0Var.f) {
                        i2 = eny0Var.f;
                    }
                    int millis = (int) Duration.between(instant2, instant).toMillis();
                    if (millis < eny0Var.b) {
                        eny0Var.b = millis;
                    }
                    if (millis >= eny0Var.b + i2) {
                        millis -= i2;
                    }
                    eny0Var.e = millis;
                    if (eny0Var.c == -1) {
                        eny0Var.c = millis;
                        eny0Var.d = millis / 2;
                    } else {
                        eny0Var.d = (((eny0Var.d * 3) + Math.abs(eny0Var.c - millis)) + 2) / 4;
                        eny0Var.c = (((eny0Var.c * 7) + millis) + 4) / 8;
                    }
                }
            }
            list.stream().forEach(new y0z(vmy0Var, 1));
        }
        cny0Var.f(true);
    }

    public final void i(long j, int i) throws bJ {
        long j2 = (j - i) + 1;
        if (j2 < 0) {
            throw new bJ(ap$a.FRAME_ENCODING_ERROR, "negative packet number in ACK frame");
        }
        this.e.add(new jhy0(j2, j));
    }

    public final void j(ByteBuffer byteBuffer) throws one.video.calls.sdk_private.bq, one.video.calls.sdk_private.bp, bJ {
        this.e = new ArrayList();
        byte b = byteBuffer.get();
        this.c = alk.l(byteBuffer);
        this.d = ihy0.d(byteBuffer);
        int j = alk.j(byteBuffer);
        long j2 = this.c;
        int d = ihy0.d(byteBuffer);
        i(this.c, d + 1);
        long j3 = j2 - d;
        for (int i = 0; i < j; i++) {
            int d2 = ihy0.d(byteBuffer) + 1;
            i((j3 - d2) - 1, ihy0.d(byteBuffer) + 1);
            j3 -= d2 + r6;
        }
        if (b == 3) {
            alk.l(byteBuffer);
            alk.l(byteBuffer);
            alk.l(byteBuffer);
        }
    }

    public final String toString() {
        if (this.g == null) {
            this.g = (String) this.e.stream().map(new xby0()).collect(Collectors.joining(StringUtils.COMMA));
        }
        return iq.a((this.d * this.f) / 1000, "AckFrame[", this.g, "|Δ", X3.j.e);
    }

    public yby0(ArrayList arrayList, int i) {
        this.f = 8;
        this.g = null;
        Iterator it = arrayList.iterator();
        long j = Long.MAX_VALUE;
        while (it.hasNext()) {
            jhy0 jhy0Var = (jhy0) it.next();
            if (jhy0Var.b < j - 1) {
                j = jhy0Var.a;
            } else {
                throw new IllegalArgumentException("invalid range");
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            Objects.requireNonNull(next);
            arrayList2.add(next);
        }
        this.e = Collections.unmodifiableList(arrayList2);
        int i2 = h;
        this.f = i2;
        this.d = (i * 1000) / i2;
        Iterator it3 = arrayList.iterator();
        jhy0 jhy0Var2 = (jhy0) it3.next();
        long j2 = jhy0Var2.b;
        long j3 = jhy0Var2.a;
        this.c = j2;
        ByteBuffer allocate = ByteBuffer.allocate(1000);
        allocate.put((byte) 2);
        alk.g(this.c, allocate);
        alk.d(this.d, allocate);
        alk.d(arrayList.size() - 1, allocate);
        alk.d(((int) ((jhy0Var2.b - j3) + 1)) - 1, allocate);
        while (it3.hasNext()) {
            jhy0 jhy0Var3 = (jhy0) it3.next();
            long j4 = jhy0Var3.b;
            long j5 = jhy0Var3.a;
            alk.d((int) ((j3 - j4) - 2), allocate);
            alk.d(((int) ((j4 - j5) + 1)) - 1, allocate);
            j3 = j5;
        }
        byte[] bArr = new byte[allocate.position()];
        this.b = bArr;
        allocate.get(bArr);
    }
}
