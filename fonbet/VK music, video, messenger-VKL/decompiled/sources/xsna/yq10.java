package xsna;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.net.Uri;
import com.vk.media.pipeline.audio.AudioPcm;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import xsna.k0h0;
import xsna.zq10;

/* compiled from: MediaExtractorAudioSource.kt */
/* loaded from: classes3.dex */
public final class yq10 extends zq10 implements xx4 {
    public final int m;
    public AudioPcm n;
    public final LinkedList<k0h0.b> o;
    public final ByteBuffer p;
    public final boolean q;
    public Long r;
    public final MediaFormat s;
    public final int t;
    public final int u;
    public final long v;

    public yq10(int i, MediaExtractor mediaExtractor, int i2, Uri uri, ejp0 ejp0Var, f100 f100Var, rm4 rm4Var, boolean z) {
        super(uri, i2, f100Var, mediaExtractor, ejp0Var, "MediaExtractorAudioSource");
        this.m = i;
        this.o = new LinkedList<>();
        this.p = ByteBuffer.allocate(8192);
        this.q = rm4Var.a && (!z || rm4Var.b);
        MediaFormat mediaFormat = this.i.a;
        mediaFormat.setInteger("max-input-size", 8192);
        this.s = mediaFormat;
        Integer num = this.i.o;
        if (num == null) {
            throw new IllegalArgumentException("Failed to retrieve sample rate. Audio format: " + this.i);
        }
        this.t = num.intValue();
        Integer num2 = this.i.p;
        if (num2 == null) {
            throw new IllegalArgumentException("Failed to retrieve channelCount. Audio format: " + this.i);
        }
        this.u = num2.intValue();
        Long l = this.i.q;
        if (l != null) {
            this.v = l.longValue();
        } else {
            throw new IllegalStateException("Failed to retrieve audio track duration. Audio format: " + this.i);
        }
    }

    @Override // xsna.xx4
    public final void a(AudioPcm audioPcm) {
        this.n = audioPcm;
    }

    @Override // xsna.xx4
    public final int c() {
        return this.t;
    }

    @Override // xsna.xx4
    public final long f() {
        return this.v;
    }

    @Override // xsna.zq10, xsna.k0h0
    public final k0h0.b g() {
        Long l = this.r;
        if (l != null) {
            super.seekTo(l.longValue());
            this.o.clear();
            this.r = null;
        }
        AudioPcm audioPcm = this.n;
        if (!this.q || audioPcm == null) {
            return super.g();
        }
        k0h0.b g = super.g();
        LinkedList<k0h0.b> linkedList = this.o;
        if (g == null) {
            return (k0h0.b) g5g.H(linkedList);
        }
        ByteBuffer byteBuffer = this.p;
        byteBuffer.clear();
        zq10.b bVar = (zq10.b) g;
        ByteBuffer byteBuffer2 = bVar.a;
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer2.remaining());
        allocate.put(byteBuffer2);
        allocate.flip();
        byteBuffer2.flip();
        linkedList.addLast(new tll(allocate, bVar.b, bVar.c, bVar.d, false, bVar.b()));
        if (linkedList.size() < 2) {
            j();
        }
        long a = ((k0h0.b) j5g.Y(linkedList)).a();
        while (linkedList.size() >= 2 && byteBuffer.remaining() > ((k0h0.b) j5g.Y(linkedList)).getData().remaining()) {
            long a2 = linkedList.get(1).a() - a;
            if ((a2 < 0 ? -1 : (int) (a2 / audioPcm.f)) >= 131072) {
                break;
            }
            byteBuffer.put(linkedList.removeFirst().getData());
            j();
        }
        byteBuffer.flip();
        if (byteBuffer.remaining() != 0) {
            return new tll(a, byteBuffer.remaining(), byteBuffer);
        }
        k0h0.b bVar2 = (k0h0.b) g5g.H(linkedList);
        if (bVar2 == null) {
            return null;
        }
        ByteBuffer data = bVar2.getData();
        ByteBuffer allocate2 = ByteBuffer.allocate(data.remaining());
        allocate2.put(data);
        allocate2.flip();
        data.flip();
        return new tll(allocate2, bVar2.a(), bVar2.getSize(), bVar2.getFlags(), bVar2.c(), bVar2.b());
    }

    @Override // xsna.k0h0
    public final MediaFormat getFormat() {
        return this.s;
    }

    @Override // xsna.xx4
    public final int h() {
        return this.u;
    }

    @Override // xsna.zq10, xsna.k0h0
    public final boolean i() {
        Long l = this.r;
        if (l != null) {
            super.seekTo(l.longValue());
            this.o.clear();
            this.r = null;
        }
        return super.i();
    }

    public final void j() {
        i();
        k0h0.b g = super.g();
        if (g != null) {
            zq10.b bVar = (zq10.b) g;
            ByteBuffer byteBuffer = bVar.a;
            ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
            allocate.put(byteBuffer);
            allocate.flip();
            byteBuffer.flip();
            this.o.addLast(new tll(allocate, bVar.b, bVar.c, bVar.d, false, bVar.b()));
        }
    }

    @Override // xsna.k0h0
    public final int m() {
        return this.m;
    }

    @Override // xsna.zq10, xsna.k0h0
    public final void seekTo(long j) {
        this.r = Long.valueOf(j);
    }
}
