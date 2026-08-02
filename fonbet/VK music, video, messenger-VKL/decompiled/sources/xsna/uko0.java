package xsna;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import androidx.annotation.Nullable;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.source.i;
import androidx.media3.extractor.text.SubtitleDecoderException;
import com.google.common.collect.ImmutableList;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Objects;

/* compiled from: TextRenderer.java */
/* loaded from: classes12.dex */
public final class uko0 extends androidx.media3.exoplayer.a implements Handler.Callback {

    @Nullable
    public u0n0 A;

    @Nullable
    public y0n0 B;

    @Nullable
    public y0n0 C;
    public int D;

    @Nullable
    public final Handler E;
    public final ako0 F;
    public final w8s G;
    public boolean H;
    public boolean I;

    @Nullable
    public androidx.media3.common.a J;
    public long K;
    public long L;
    public boolean M;
    public final skk t;
    public final DecoderInputBuffer u;
    public vkk v;
    public final p0n0 w;
    public boolean x;
    public int y;

    @Nullable
    public o0n0 z;

    public uko0(ako0 ako0Var, @Nullable Looper looper, p0n0 p0n0Var) {
        super(3);
        this.F = ako0Var;
        this.E = looper == null ? null : new Handler(looper, this);
        this.w = p0n0Var;
        this.t = new skk();
        this.u = new DecoderInputBuffer(1);
        this.G = new w8s();
        this.L = C.TIME_UNSET;
        this.K = C.TIME_UNSET;
        this.M = false;
    }

    public final void C() {
        boolean z = this.M || Objects.equals(this.J.n, MimeTypes.APPLICATION_CEA608) || Objects.equals(this.J.n, MimeTypes.APPLICATION_MP4CEA608) || Objects.equals(this.J.n, MimeTypes.APPLICATION_CEA708);
        String str = this.J.n;
        if (!z) {
            throw new IllegalStateException(f370.E("Legacy decoding is disabled, can't handle %s samples (expected %s).", str, "application/x-media3-cues"));
        }
    }

    public final long D() {
        if (this.D == -1) {
            return Long.MAX_VALUE;
        }
        this.B.getClass();
        if (this.D >= this.B.getEventTimeCount()) {
            return Long.MAX_VALUE;
        }
        return this.B.getEventTime(this.D);
    }

    public final long E(long j) {
        fxc0.z(j != C.TIME_UNSET);
        return j - this.l;
    }

    public final void F() {
        this.A = null;
        this.D = -1;
        y0n0 y0n0Var = this.B;
        if (y0n0Var != null) {
            y0n0Var.h();
            this.B = null;
        }
        y0n0 y0n0Var2 = this.C;
        if (y0n0Var2 != null) {
            y0n0Var2.h();
            this.C = null;
        }
    }

    @Override // androidx.media3.exoplayer.k
    public final int a(androidx.media3.common.a aVar) {
        if (Objects.equals(aVar.n, "application/x-media3-cues") || this.w.a(aVar)) {
            return androidx.media3.exoplayer.k.f(aVar.O == 0 ? 4 : 2, 0, 0, 0);
        }
        return io20.o(aVar.n) ? androidx.media3.exoplayer.k.f(1, 0, 0, 0) : androidx.media3.exoplayer.k.f(0, 0, 0, 0);
    }

    @Override // androidx.media3.exoplayer.j, androidx.media3.exoplayer.k
    public final String getName() {
        return "TextRenderer";
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        ukk ukkVar = (ukk) message.obj;
        com.google.common.collect.g gVar = ukkVar.a;
        ako0 ako0Var = this.F;
        ako0Var.y(gVar);
        ako0Var.d(ukkVar);
        return true;
    }

    @Override // androidx.media3.exoplayer.a, androidx.media3.exoplayer.j
    public final boolean isEnded() {
        return this.I;
    }

    @Override // androidx.media3.exoplayer.j
    public final boolean isReady() {
        androidx.media3.common.a aVar = this.J;
        if (aVar != null) {
            if (!Objects.equals(aVar.n, "application/x-media3-cues")) {
                if (!this.I) {
                    if (this.H) {
                        y0n0 y0n0Var = this.B;
                        long j = this.K;
                        if (y0n0Var == null || y0n0Var.getEventTimeCount() <= 0 || y0n0Var.getEventTime(y0n0Var.getEventTimeCount() - 1) <= j) {
                            y0n0 y0n0Var2 = this.C;
                            long j2 = this.K;
                            if ((y0n0Var2 == null || y0n0Var2.getEventTimeCount() <= 0 || y0n0Var2.getEventTime(y0n0Var2.getEventTimeCount() - 1) <= j2) && this.A != null) {
                            }
                        }
                    }
                }
                return false;
            }
            vkk vkkVar = this.v;
            vkkVar.getClass();
            if (vkkVar.d(this.K) == Long.MIN_VALUE) {
                try {
                    maybeThrowStreamError();
                    return true;
                } catch (IOException unused) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0271 A[EXC_TOP_SPLITTER, LOOP:2: B:92:0x0271->B:113:0x0271, LOOP_START, SYNTHETIC] */
    @Override // androidx.media3.exoplayer.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void render(long j, long j2) {
        boolean z;
        String str;
        boolean z2;
        long j3;
        if (this.o) {
            long j4 = this.L;
            if (j4 != C.TIME_UNSET && j >= j4) {
                F();
                this.I = true;
            }
        }
        if (this.I) {
            return;
        }
        androidx.media3.common.a aVar = this.J;
        aVar.getClass();
        boolean equals = Objects.equals(aVar.n, "application/x-media3-cues");
        ako0 ako0Var = this.F;
        Handler handler = this.E;
        w8s w8sVar = this.G;
        boolean z3 = false;
        z3 = false;
        z3 = false;
        if (equals) {
            this.v.getClass();
            if (!this.H) {
                DecoderInputBuffer decoderInputBuffer = this.u;
                if (B(w8sVar, decoderInputBuffer, 0) == -4) {
                    if (decoderInputBuffer.b(4)) {
                        this.H = true;
                    } else {
                        decoderInputBuffer.h();
                        ByteBuffer byteBuffer = decoderInputBuffer.e;
                        byteBuffer.getClass();
                        long j5 = decoderInputBuffer.g;
                        byte[] array = byteBuffer.array();
                        int arrayOffset = byteBuffer.arrayOffset();
                        int limit = byteBuffer.limit();
                        this.t.getClass();
                        Parcel obtain = Parcel.obtain();
                        obtain.unmarshall(array, arrayOffset, limit);
                        obtain.setDataPosition(0);
                        Bundle readBundle = obtain.readBundle(Bundle.class.getClassLoader());
                        obtain.recycle();
                        ArrayList parcelableArrayList = readBundle.getParcelableArrayList("c");
                        parcelableArrayList.getClass();
                        ImmutableList.b bVar = ImmutableList.c;
                        ImmutableList.a aVar2 = new ImmutableList.a();
                        for (int i = 0; i < parcelableArrayList.size(); i++) {
                            Bundle bundle = (Bundle) parcelableArrayList.get(i);
                            bundle.getClass();
                            aVar2.c(rkk.b(bundle));
                        }
                        wkk wkkVar = new wkk(aVar2.g(), j5, readBundle.getLong("d"));
                        decoderInputBuffer.c();
                        z3 = this.v.a(wkkVar, j);
                    }
                }
            }
            long d = this.v.d(this.K);
            if (d == Long.MIN_VALUE && this.H && !z3) {
                this.I = true;
            }
            if (d != Long.MIN_VALUE && d <= j) {
                z3 = true;
            }
            if (z3) {
                ImmutableList<rkk> c = this.v.c(j);
                long f = this.v.f(j);
                E(f);
                ukk ukkVar = new ukk(c);
                if (handler != null) {
                    handler.obtainMessage(1, ukkVar).sendToTarget();
                } else {
                    ako0Var.y(ukkVar.a);
                    ako0Var.d(ukkVar);
                }
                this.v.e(f);
            }
            this.K = j;
            return;
        }
        C();
        this.K = j;
        y0n0 y0n0Var = this.C;
        p0n0 p0n0Var = this.w;
        if (y0n0Var == null) {
            o0n0 o0n0Var = this.z;
            o0n0Var.getClass();
            o0n0Var.setPositionUs(j);
            try {
                o0n0 o0n0Var2 = this.z;
                o0n0Var2.getClass();
                this.C = o0n0Var2.dequeueOutputBuffer();
            } catch (SubtitleDecoderException e) {
                ahn.o("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.J, e);
                com.google.common.collect.g gVar = com.google.common.collect.g.f;
                E(this.K);
                ukk ukkVar2 = new ukk(gVar);
                if (handler != null) {
                    handler.obtainMessage(1, ukkVar2).sendToTarget();
                } else {
                    ako0Var.y(ukkVar2.a);
                    ako0Var.d(ukkVar2);
                }
                F();
                o0n0 o0n0Var3 = this.z;
                o0n0Var3.getClass();
                o0n0Var3.release();
                this.z = null;
                this.y = 0;
                this.x = true;
                androidx.media3.common.a aVar3 = this.J;
                aVar3.getClass();
                o0n0 b = p0n0Var.b(aVar3);
                this.z = b;
                b.a(this.m);
                return;
            }
        }
        if (this.i != 2) {
            return;
        }
        if (this.B != null) {
            long D = D();
            z = false;
            while (D <= j) {
                this.D++;
                D = D();
                z = true;
            }
        } else {
            z = false;
        }
        y0n0 y0n0Var2 = this.C;
        if (y0n0Var2 != null) {
            if (!y0n0Var2.b(4)) {
                str = "Subtitle decoding failed. streamFormat=";
                z2 = z;
                if (y0n0Var2.c <= j) {
                    y0n0 y0n0Var3 = this.B;
                    if (y0n0Var3 != null) {
                        y0n0Var3.h();
                    }
                    this.D = y0n0Var2.getNextEventTimeIndex(j);
                    this.B = y0n0Var2;
                    this.C = null;
                    z2 = true;
                }
            } else if (!z && D() == Long.MAX_VALUE) {
                if (this.y == 2) {
                    F();
                    o0n0 o0n0Var4 = this.z;
                    o0n0Var4.getClass();
                    o0n0Var4.release();
                    this.z = null;
                    this.y = 0;
                    this.x = true;
                    androidx.media3.common.a aVar4 = this.J;
                    aVar4.getClass();
                    o0n0 b2 = p0n0Var.b(aVar4);
                    this.z = b2;
                    str = "Subtitle decoding failed. streamFormat=";
                    b2.a(this.m);
                    z2 = z;
                } else {
                    str = "Subtitle decoding failed. streamFormat=";
                    F();
                    this.I = true;
                    z2 = z;
                }
            }
            if (z2) {
                this.B.getClass();
                int nextEventTimeIndex = this.B.getNextEventTimeIndex(j);
                if (nextEventTimeIndex == 0 || this.B.getEventTimeCount() == 0) {
                    j3 = this.B.c;
                } else if (nextEventTimeIndex == -1) {
                    y0n0 y0n0Var4 = this.B;
                    j3 = y0n0Var4.getEventTime(y0n0Var4.getEventTimeCount() - 1);
                } else {
                    j3 = this.B.getEventTime(nextEventTimeIndex - 1);
                }
                E(j3);
                ukk ukkVar3 = new ukk(this.B.getCues(j));
                if (handler != null) {
                    handler.obtainMessage(1, ukkVar3).sendToTarget();
                } else {
                    ako0Var.y(ukkVar3.a);
                    ako0Var.d(ukkVar3);
                }
            }
            if (this.y != 2) {
                return;
            }
            while (!this.H) {
                try {
                    u0n0 u0n0Var = this.A;
                    if (u0n0Var == null) {
                        o0n0 o0n0Var5 = this.z;
                        o0n0Var5.getClass();
                        u0n0Var = o0n0Var5.dequeueInputBuffer();
                        if (u0n0Var == null) {
                            return;
                        } else {
                            this.A = u0n0Var;
                        }
                    }
                    if (this.y == 1) {
                        u0n0Var.b = 4;
                        o0n0 o0n0Var6 = this.z;
                        o0n0Var6.getClass();
                        o0n0Var6.b(u0n0Var);
                        this.A = null;
                        this.y = 2;
                        return;
                    }
                    int B = B(w8sVar, u0n0Var, 0);
                    if (B == -4) {
                        if (u0n0Var.b(4)) {
                            this.H = true;
                            this.x = false;
                        } else {
                            androidx.media3.common.a aVar5 = w8sVar.b;
                            if (aVar5 == null) {
                                return;
                            }
                            u0n0Var.j = aVar5.s;
                            u0n0Var.h();
                            this.x &= !u0n0Var.b(1);
                        }
                        if (!this.x) {
                            o0n0 o0n0Var7 = this.z;
                            o0n0Var7.getClass();
                            o0n0Var7.b(u0n0Var);
                            this.A = null;
                        }
                    } else if (B == -3) {
                        return;
                    }
                } catch (SubtitleDecoderException e2) {
                    ahn.o("TextRenderer", str + this.J, e2);
                    com.google.common.collect.g gVar2 = com.google.common.collect.g.f;
                    E(this.K);
                    ukk ukkVar4 = new ukk(gVar2);
                    if (handler != null) {
                        handler.obtainMessage(1, ukkVar4).sendToTarget();
                    } else {
                        ako0Var.y(ukkVar4.a);
                        ako0Var.d(ukkVar4);
                    }
                    F();
                    o0n0 o0n0Var8 = this.z;
                    o0n0Var8.getClass();
                    o0n0Var8.release();
                    this.z = null;
                    this.y = 0;
                    this.x = true;
                    androidx.media3.common.a aVar6 = this.J;
                    aVar6.getClass();
                    o0n0 b3 = p0n0Var.b(aVar6);
                    this.z = b3;
                    b3.a(this.m);
                    return;
                }
            }
            return;
        }
        str = "Subtitle decoding failed. streamFormat=";
        z2 = z;
        if (z2) {
        }
        if (this.y != 2) {
        }
    }

    @Override // androidx.media3.exoplayer.a
    public final void s() {
        this.J = null;
        this.L = C.TIME_UNSET;
        com.google.common.collect.g gVar = com.google.common.collect.g.f;
        E(this.K);
        ukk ukkVar = new ukk(gVar);
        Handler handler = this.E;
        if (handler != null) {
            handler.obtainMessage(1, ukkVar).sendToTarget();
        } else {
            com.google.common.collect.g gVar2 = ukkVar.a;
            ako0 ako0Var = this.F;
            ako0Var.y(gVar2);
            ako0Var.d(ukkVar);
        }
        this.K = C.TIME_UNSET;
        if (this.z != null) {
            F();
            o0n0 o0n0Var = this.z;
            o0n0Var.getClass();
            o0n0Var.release();
            this.z = null;
            this.y = 0;
        }
    }

    @Override // androidx.media3.exoplayer.a
    public final void u(long j, boolean z, boolean z2) {
        this.K = j;
        vkk vkkVar = this.v;
        if (vkkVar != null) {
            vkkVar.clear();
        }
        com.google.common.collect.g gVar = com.google.common.collect.g.f;
        E(this.K);
        ukk ukkVar = new ukk(gVar);
        Handler handler = this.E;
        if (handler != null) {
            handler.obtainMessage(1, ukkVar).sendToTarget();
        } else {
            com.google.common.collect.g gVar2 = ukkVar.a;
            ako0 ako0Var = this.F;
            ako0Var.y(gVar2);
            ako0Var.d(ukkVar);
        }
        this.H = false;
        this.I = false;
        this.L = C.TIME_UNSET;
        androidx.media3.common.a aVar = this.J;
        if (aVar == null || Objects.equals(aVar.n, "application/x-media3-cues")) {
            return;
        }
        if (this.y == 0) {
            F();
            o0n0 o0n0Var = this.z;
            o0n0Var.getClass();
            o0n0Var.flush();
            o0n0Var.a(this.m);
            return;
        }
        F();
        o0n0 o0n0Var2 = this.z;
        o0n0Var2.getClass();
        o0n0Var2.release();
        this.z = null;
        this.y = 0;
        this.x = true;
        androidx.media3.common.a aVar2 = this.J;
        aVar2.getClass();
        o0n0 b = this.w.b(aVar2);
        this.z = b;
        b.a(this.m);
    }

    @Override // androidx.media3.exoplayer.a
    public final void z(androidx.media3.common.a[] aVarArr, long j, long j2, i.b bVar) {
        androidx.media3.common.a aVar = aVarArr[0];
        this.J = aVar;
        if (Objects.equals(aVar.n, "application/x-media3-cues")) {
            this.v = this.J.L == 1 ? new j920() : new kly();
            return;
        }
        C();
        if (this.z != null) {
            this.y = 1;
            return;
        }
        this.x = true;
        androidx.media3.common.a aVar2 = this.J;
        aVar2.getClass();
        o0n0 b = this.w.b(aVar2);
        this.z = b;
        b.a(this.m);
    }
}
