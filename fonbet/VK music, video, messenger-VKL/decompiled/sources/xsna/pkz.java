package xsna;

import android.content.Context;
import android.os.HandlerThread;
import android.util.Log;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Objects;
import one.video.player.live.DebugInfo;
import one.video.player.live.media.audio.AudioPlayerNative;
import one.video.player.live.media.utils.DecoderInterface$FrameAction;
import xsna.l;

/* compiled from: LivePlayerImpl.java */
/* loaded from: classes8.dex */
public final class pkz extends oqg0 {
    public final /* synthetic */ qkz x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pkz(qkz qkzVar, ArrayList arrayList, HandlerThread handlerThread, Context context, DebugInfo debugInfo) {
        super(arrayList, handlerThread, context, debugInfo);
        this.x = qkzVar;
    }

    @Override // xsna.oqg0
    public final ByteBuffer a(int i, int i2) {
        k kVar;
        if (i != 10) {
            return null;
        }
        qkz qkzVar = this.x;
        int i3 = qkzVar.g;
        if ((i3 < 0 || i3 == i) && (kVar = qkzVar.e) != null) {
            return kVar.f(i2);
        }
        return null;
    }

    @Override // xsna.oqg0
    public final ByteBuffer b(int i, int i2) {
        if (i != 7) {
            return null;
        }
        okz okzVar = this.x.d;
        if (okzVar != null) {
            return okzVar.f(i2);
        }
        Log.e("xsna.qkz", "allocateVideoBuffer() - video decoder is not created");
        return null;
    }

    @Override // xsna.oqg0
    public final int d() {
        AudioPlayerNative audioPlayerNative = this.x.f;
        if (audioPlayerNative == null) {
            return 0;
        }
        return audioPlayerNative.getBufferedMS();
    }

    @Override // xsna.oqg0
    public final void e(int i, ByteBuffer byteBuffer, DecoderInterface$FrameAction decoderInterface$FrameAction) {
        qkz qkzVar = this.x;
        k kVar = qkzVar.e;
        if (kVar == null) {
            return;
        }
        if (qkzVar.i) {
            qkzVar.j = i;
            qkzVar.k = i;
            qkzVar.i = false;
        }
        qkzVar.l += (i - qkzVar.j) * 1000;
        qkzVar.j = i;
        kVar.e(byteBuffer.remaining(), qkzVar.l, decoderInterface$FrameAction);
    }

    @Override // xsna.oqg0
    public final void f(int i, ByteBuffer byteBuffer) {
        l.a aVar;
        if (i != 10) {
            return;
        }
        qkz qkzVar = this.x;
        if (qkzVar.e == null) {
            k kVar = new k(false, this.v);
            qkzVar.e = kVar;
            kVar.j = new fy2(qkzVar);
            qkzVar.g = i;
            qkzVar.i = true;
        }
        k kVar2 = qkzVar.e;
        byte[] bArr = kVar2.i;
        if (bArr == null || !ByteBuffer.wrap(bArr).equals(byteBuffer)) {
            byte[] bArr2 = new byte[byteBuffer.remaining()];
            kVar2.i = bArr2;
            byteBuffer.get(bArr2);
            kVar2.h.set(true);
        }
        vi90 vi90Var = new vi90(kVar2.i);
        vi90Var.d(5);
        int a = vi90Var.a(4);
        int a2 = a == 15 ? vi90Var.a(24) : l.a[a];
        int a3 = vi90Var.a(4);
        if (a2 < 1 || a3 < 1) {
            aVar = null;
        } else {
            aVar = new l.a();
            aVar.a = a2;
            aVar.b = a3;
        }
        if (aVar == null) {
            Log.e("xsna.k", "Failed to parse decoder config");
        } else {
            kVar2.l = aVar.a;
            kVar2.m = aVar.b;
        }
    }

    @Override // xsna.oqg0
    public final void g(boolean z) {
        qkz qkzVar = this.x;
        if (qkzVar.p != z) {
            qkzVar.p = z;
            qkzVar.b(z);
        }
    }

    @Override // xsna.oqg0
    public final void h(int i) {
        this.x.c(i);
    }

    @Override // xsna.oqg0
    public final boolean i(int i, int i2, ByteBuffer byteBuffer, DecoderInterface$FrameAction decoderInterface$FrameAction) {
        qkz qkzVar = this.x;
        if (qkzVar.d == null) {
            return false;
        }
        if (qkzVar.i) {
            qkzVar.j = i;
            qkzVar.k = i;
            qkzVar.i = false;
        }
        int i3 = qkzVar.k;
        if (i3 != 0 && i3 - i > 0) {
            DebugInfo debugInfo = this.v;
            if (debugInfo != null) {
                debugInfo.s++;
            }
            this.x.k = i;
        }
        qkz qkzVar2 = this.x;
        qkzVar2.m = ((i - qkzVar2.k) * 1000) + qkzVar2.m;
        qkzVar2.k = i;
        if (this.v != null) {
            byteBuffer.remaining();
            Objects.toString(decoderInterface$FrameAction);
        }
        if (!this.x.d.e(byteBuffer.remaining(), (i2 * 1000) + this.x.m, decoderInterface$FrameAction)) {
            return false;
        }
        this.x.getClass();
        return true;
    }

    @Override // xsna.oqg0
    public final void j(int i, ByteBuffer byteBuffer) {
        if (i != 7) {
            return;
        }
        okz okzVar = this.x.d;
        if (okzVar == null) {
            Log.e("xsna.qkz", "handleVideoHeader() - video decoder is not created");
            return;
        }
        byte[] bArr = okzVar.i;
        if (bArr == null || !ByteBuffer.wrap(bArr).equals(byteBuffer)) {
            byte[] bArr2 = new byte[byteBuffer.remaining()];
            okzVar.i = bArr2;
            byteBuffer.get(bArr2);
            okzVar.h.set(true);
        }
    }
}
