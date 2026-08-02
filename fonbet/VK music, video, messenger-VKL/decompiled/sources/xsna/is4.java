package xsna;

import android.media.MediaCodec;
import android.util.SparseArray;
import com.vk.media.pipeline.audio.AudioPcm;
import com.vk.media.pipeline.codec.CodecDrainer;
import com.vk.media.pipeline.model.item.AudioItem;
import com.vk.media.pipeline.model.timeline.AudioFragmentItem;
import com.vk.media.pipeline.transcoder.DecodedSampleStatus;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.TimeUnit;
import xsna.dz4;
import xsna.py4;

/* compiled from: AudioPlaybackTrackHandler.kt */
/* loaded from: classes3.dex */
public final class is4 {
    public static final AudioPcm.EncodingType m = AudioPcm.EncodingType.PCM_16BIT;
    public final j630 a;
    public final AudioPcm b;
    public volatile boolean c;
    public final f100 d;
    public final py4 e;
    public int f;
    public boolean g;
    public boolean h;
    public long i;
    public boolean j;
    public dz4 k;
    public final bqk l;

    /* compiled from: AudioPlaybackTrackHandler.kt */
    public final class a extends q56 {
        public final AudioPcm d;

        /* compiled from: AudioPlaybackTrackHandler.kt */
        /* renamed from: xsna.is4$a$a, reason: collision with other inner class name */
        public static final class C3077a implements dz4.a {
            public final /* synthetic */ is4 a;

            public C3077a(is4 is4Var) {
                this.a = is4Var;
            }

            @Override // xsna.dz4.a
            public final void a(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
                this.a.l.a(byteBuffer);
            }
        }

        public a(csp cspVar, lzf lzfVar, d80 d80Var, AudioPcm audioPcm) {
            super(cspVar, lzfVar, d80Var);
            this.d = audioPcm;
        }

        @Override // xsna.q56, xsna.py4.b
        public final void a(long j) {
            is4 is4Var = is4.this;
            f100 f100Var = is4Var.d;
            if (f100Var != null) {
                f100Var.d("AudioPlaybackTrackHandler", "onAudioTimelineRebind");
            }
            is4Var.i = j;
            is4Var.j = false;
            dz4 dz4Var = is4Var.k;
            if (dz4Var != null) {
                dz4Var.e(false, null);
            }
            is4Var.k = null;
        }

        @Override // xsna.py4.b
        public final void b(List list, qy4[] qy4VarArr) {
            is4 is4Var = is4.this;
            dz4 dz4Var = is4Var.k;
            if (dz4Var != null) {
                dz4Var.b(list, qy4VarArr);
                return;
            }
            f100 f100Var = is4Var.d;
            if (f100Var != null) {
                f100Var.e("AudioPlaybackTrackHandler", "Tried to push samples to null decoder");
            }
        }

        @Override // xsna.py4.b
        public final void c() {
            f100 f100Var = is4.this.d;
            if (f100Var != null) {
                f100Var.d("AudioPlaybackTrackHandler", "onAudioTimelineEndReached");
            }
            is4 is4Var = is4.this;
            dz4 dz4Var = is4Var.k;
            if (dz4Var != null) {
                dz4Var.e(true, null);
            }
            is4Var.k = null;
            is4 is4Var2 = is4.this;
            is4Var2.i = 0L;
            is4Var2.c = true;
        }

        @Override // xsna.q56
        public final void e(csp cspVar, f8l<qm4> f8lVar, SparseArray<kz4> sparseArray, d80 d80Var) {
            f100 f100Var = cspVar.d;
            is4 is4Var = is4.this;
            is4Var.k = new dz4(new n3q0(this.d, d80Var, f100Var, is4Var.i), f8lVar, sparseArray, is4Var.new b(), is4Var.a, new C3077a(is4Var));
        }
    }

    public is4(csp cspVar, lzf lzfVar, el4 el4Var, d80 d80Var, int i, int i2, j630 j630Var) {
        this.a = j630Var;
        AudioPcm audioPcm = new AudioPcm(i2, i, m);
        this.b = audioPcm;
        f100 f100Var = cspVar.d;
        this.d = f100Var;
        this.e = new py4(el4Var, new a(cspVar, lzfVar, d80Var, audioPcm), f100Var);
        this.j = true;
        this.l = new bqk(f100Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ByteBuffer a(int i, int i2) {
        py4.a aVar;
        long j;
        if (this.c && this.l.d <= 0) {
            throw new IllegalStateException("Tried to getAudioData but end of track reached");
        }
        int i3 = this.b.e * i2;
        boolean z = true;
        boolean z2 = true;
        while (this.l.d < i3 && !this.c && !Thread.currentThread().isInterrupted()) {
            if (z2) {
                if (this.f != i || this.j) {
                    f100 f100Var = this.d;
                    if (f100Var != null) {
                        f100Var.i("AudioPlaybackTrackHandler", "requested out of order audio startSample, seeking: " + this.f + '/' + i + " (actual/requested)");
                    }
                    long micros = TimeUnit.MILLISECONDS.toMicros(100L) + (TimeUnit.SECONDS.toMicros(i) / this.b.a);
                    this.g = z;
                    this.h = false;
                    bqk bqkVar = this.l;
                    bqkVar.d = 0;
                    bqkVar.e = 0;
                    bqkVar.f = 0;
                    ByteBuffer byteBuffer = bqkVar.c;
                    byteBuffer.rewind();
                    byteBuffer.limit(byteBuffer.capacity());
                    py4 py4Var = this.e;
                    f100 f100Var2 = py4Var.c;
                    py4.a aVar2 = py4Var.e;
                    py4.b bVar = py4Var.b;
                    bVar.a(micros);
                    if (aVar2 != null) {
                        el4 el4Var = py4Var.a;
                        aVar = new py4.a(f100Var2, el4Var, micros);
                        py4Var.e = aVar;
                        bVar.d(el4Var, aVar.d, aVar.e);
                    } else {
                        el4 el4Var2 = py4Var.a;
                        aVar = new py4.a(f100Var2, el4Var2, micros);
                        py4Var.e = aVar;
                        bVar.d(el4Var2, aVar.d, aVar.e);
                    }
                    int i4 = 0;
                    for (Object obj : aVar.e) {
                        int i5 = i4 + 1;
                        if (i4 < 0) {
                            e43.t();
                            throw null;
                        }
                        xx4 xx4Var = (xx4) obj;
                        AudioFragmentItem audioFragmentItem = aVar.d.get(i4);
                        long j2 = audioFragmentItem.c;
                        AudioItem audioItem = audioFragmentItem.b;
                        py4 py4Var2 = py4Var;
                        if (micros >= j2) {
                            double d = micros;
                            j = micros;
                            long j3 = audioItem.d;
                            long j4 = audioItem.c;
                            double d2 = j3 - j4;
                            double d3 = audioItem.e;
                            if (d <= (d2 / d3) + j2) {
                                xx4Var.seekTo(((long) ((j - j2) * d3)) + j4);
                            }
                        } else {
                            j = micros;
                        }
                        i4 = i5;
                        py4Var = py4Var2;
                        micros = j;
                    }
                    py4.a aVar3 = py4Var.e;
                    List<xx4> list = aVar3 != null ? aVar3.e : null;
                    if (list != null) {
                        for (k0h0 k0h0Var : list) {
                            dz4 dz4Var = this.k;
                            if (dz4Var != 0) {
                                f8l<D>.a<qm4> aVar4 = dz4Var.b.e.get(k0h0Var.m());
                                CodecDrainer codecDrainer = aVar4 != null ? aVar4.c : null;
                                if (codecDrainer != null) {
                                    dz4Var.a(codecDrainer);
                                }
                            }
                        }
                    }
                    this.g = false;
                }
                z2 = false;
            }
            dz4 dz4Var2 = this.k;
            py4 py4Var3 = this.e;
            py4.a aVar5 = py4Var3.e;
            if ((aVar5 != null ? aVar5.c : true) && dz4Var2 != null) {
                f8l<qm4> f8lVar = dz4Var2.b;
                if (!f8lVar.c()) {
                    f8lVar.e(new p40(dz4Var2, 6));
                }
            }
            py4.a aVar6 = py4Var3.e;
            if (!(aVar6 != null ? aVar6.c : true) || this.h) {
                z = true;
                py4Var3.a();
            } else {
                dz4 dz4Var3 = this.k;
                if (dz4Var3 != null) {
                    tz4 tz4Var = dz4Var3.i;
                    tll c = tz4Var.c();
                    if (c != null) {
                        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                        bufferInfo.set(0, c.c, c.b, c.d);
                        dz4Var3.d(c.a, bufferInfo);
                    }
                    z = true;
                    if (tz4Var.b() > 0) {
                    }
                } else {
                    z = true;
                }
                this.h = z;
            }
        }
        ByteBuffer allocate = ByteBuffer.allocate(i3);
        this.l.b(Math.min(this.l.d, i3), allocate);
        allocate.position(0);
        allocate.limit(i3);
        this.f = i + i2;
        return allocate;
    }

    /* compiled from: AudioPlaybackTrackHandler.kt */
    public final class b implements j8l<qm4> {
        public b() {
        }

        @Override // xsna.j8l
        public final DecodedSampleStatus a(MediaCodec.BufferInfo bufferInfo) {
            return is4.this.g ? DecodedSampleStatus.SKIP : DecodedSampleStatus.RENDER;
        }

        @Override // xsna.j8l
        public final /* bridge */ /* synthetic */ void c(hzf hzfVar) {
        }

        @Override // xsna.j8l
        public final void b(MediaCodec.BufferInfo bufferInfo) {
        }
    }
}
