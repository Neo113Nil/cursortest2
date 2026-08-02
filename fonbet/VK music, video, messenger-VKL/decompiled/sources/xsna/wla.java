package xsna;

import androidx.annotation.Nullable;
import androidx.media3.decoder.DecoderException;
import androidx.media3.extractor.text.SubtitleDecoderException;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayDeque;

/* compiled from: CeaDecoder.java */
/* loaded from: classes12.dex */
public abstract class wla implements o0n0 {
    public final ArrayDeque<a> a = new ArrayDeque<>();
    public final ArrayDeque<y0n0> b;
    public final ArrayDeque<a> c;

    @Nullable
    public a d;
    public long e;
    public long f;
    public long g;

    /* compiled from: CeaDecoder.java */
    public static final class a extends u0n0 implements Comparable<a> {
        public long k;

        @Override // java.lang.Comparable
        public final int compareTo(a aVar) {
            a aVar2 = aVar;
            if (b(4) != aVar2.b(4)) {
                return b(4) ? 1 : -1;
            }
            long j = this.g - aVar2.g;
            if (j == 0) {
                j = this.k - aVar2.k;
                if (j == 0) {
                    return 0;
                }
            }
            return j > 0 ? 1 : -1;
        }
    }

    /* compiled from: CeaDecoder.java */
    public static final class b extends y0n0 {
        public t34 g;

        @Override // xsna.k8l
        public final void h() {
            wla wlaVar = (wla) this.g.c;
            c();
            wlaVar.b.add(this);
        }
    }

    public wla() {
        for (int i = 0; i < 10; i++) {
            this.a.add(new a());
        }
        this.b = new ArrayDeque<>();
        for (int i2 = 0; i2 < 2; i2++) {
            ArrayDeque<y0n0> arrayDeque = this.b;
            t34 t34Var = new t34(this, 5);
            b bVar = new b();
            bVar.g = t34Var;
            arrayDeque.add(bVar);
        }
        this.c = new ArrayDeque<>();
        this.g = C.TIME_UNSET;
    }

    @Override // xsna.a8l
    public final void a(long j) {
        this.g = j;
    }

    @Override // xsna.a8l
    public final void b(u0n0 u0n0Var) throws DecoderException {
        fxc0.p(u0n0Var == this.d);
        a aVar = (a) u0n0Var;
        if (!aVar.b(4)) {
            long j = aVar.g;
            if (j != Long.MIN_VALUE) {
                long j2 = this.g;
                if (j2 != C.TIME_UNSET && j < j2) {
                    aVar.c();
                    this.a.add(aVar);
                    this.d = null;
                }
            }
        }
        long j3 = this.f;
        this.f = 1 + j3;
        aVar.k = j3;
        this.c.add(aVar);
        this.d = null;
    }

    public abstract xla c();

    public abstract void d(a aVar);

    @Override // xsna.a8l
    @Nullable
    public final u0n0 dequeueInputBuffer() throws DecoderException {
        fxc0.z(this.d == null);
        ArrayDeque<a> arrayDeque = this.a;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        a pollFirst = arrayDeque.pollFirst();
        this.d = pollFirst;
        return pollFirst;
    }

    @Override // xsna.a8l
    @Nullable
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public y0n0 dequeueOutputBuffer() throws SubtitleDecoderException {
        ArrayDeque<y0n0> arrayDeque = this.b;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        while (true) {
            ArrayDeque<a> arrayDeque2 = this.c;
            if (arrayDeque2.isEmpty()) {
                return null;
            }
            a peek = arrayDeque2.peek();
            String str = y2r0.a;
            if (peek.g > this.e) {
                return null;
            }
            a poll = arrayDeque2.poll();
            boolean b2 = poll.b(4);
            ArrayDeque<a> arrayDeque3 = this.a;
            if (b2) {
                y0n0 pollFirst = arrayDeque.pollFirst();
                pollFirst.a(4);
                poll.c();
                arrayDeque3.add(poll);
                return pollFirst;
            }
            d(poll);
            if (f()) {
                xla c = c();
                y0n0 pollFirst2 = arrayDeque.pollFirst();
                pollFirst2.i(poll.g, c, Long.MAX_VALUE);
                poll.c();
                arrayDeque3.add(poll);
                return pollFirst2;
            }
            poll.c();
            arrayDeque3.add(poll);
        }
    }

    public abstract boolean f();

    @Override // xsna.a8l
    public void flush() {
        ArrayDeque<a> arrayDeque;
        this.f = 0L;
        this.e = 0L;
        while (true) {
            ArrayDeque<a> arrayDeque2 = this.c;
            boolean isEmpty = arrayDeque2.isEmpty();
            arrayDeque = this.a;
            if (isEmpty) {
                break;
            }
            a poll = arrayDeque2.poll();
            String str = y2r0.a;
            poll.c();
            arrayDeque.add(poll);
        }
        a aVar = this.d;
        if (aVar != null) {
            aVar.c();
            arrayDeque.add(aVar);
            this.d = null;
        }
    }

    @Override // xsna.o0n0
    public final void setPositionUs(long j) {
        this.e = j;
    }

    @Override // xsna.a8l
    public void release() {
    }
}
