package xsna;

import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMetadataRetriever;
import android.media.MediaMuxer;
import androidx.annotation.NonNull;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.ByteBuffer;
import xsna.ewi;
import xsna.gj50;

/* compiled from: VideoRecorder.java */
/* loaded from: classes8.dex */
public final class abt0 {

    @NonNull
    public final a a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public ByteBuffer f;
    public MediaExtractor g;
    public int h;
    public int i;
    public long j;
    public z7l k;
    public q190 l;
    public xip m;
    public m0g0 n;
    public p1t o;
    public s1t p;
    public boolean q;
    public boolean r;
    public boolean s;
    public gj50 t;
    public final String u;
    public final FileInputStream v;

    /* compiled from: VideoRecorder.java */
    public interface a {
        void onFailure(Throwable th);

        void onProgress(float f);

        void onSuccess();
    }

    public abt0(String str, String str2, int i, int i2, int i3, @NonNull a aVar) throws FileNotFoundException {
        this.h = -1;
        this.i = -1;
        this.j = 0L;
        this.q = false;
        this.r = false;
        this.s = false;
        this.v = new FileInputStream(str);
        this.u = str2;
        this.b = i;
        this.c = i2;
        this.e = i3;
        this.a = aVar;
        this.d = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0098 A[Catch: all -> 0x00a2, TryCatch #1 {all -> 0x00a2, blocks: (B:3:0x0011, B:5:0x002d, B:7:0x004b, B:10:0x005d, B:12:0x0069, B:14:0x0080, B:15:0x0086, B:18:0x008f, B:20:0x0098, B:21:0x009d, B:25:0x00a5, B:29:0x00b4, B:31:0x00b8, B:33:0x00c0, B:35:0x00c6, B:36:0x00e0, B:37:0x012b, B:39:0x012f, B:47:0x00d5, B:50:0x0114, B:52:0x011d), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009d A[Catch: all -> 0x00a2, TryCatch #1 {all -> 0x00a2, blocks: (B:3:0x0011, B:5:0x002d, B:7:0x004b, B:10:0x005d, B:12:0x0069, B:14:0x0080, B:15:0x0086, B:18:0x008f, B:20:0x0098, B:21:0x009d, B:25:0x00a5, B:29:0x00b4, B:31:0x00b8, B:33:0x00c0, B:35:0x00c6, B:36:0x00e0, B:37:0x012b, B:39:0x012f, B:47:0x00d5, B:50:0x0114, B:52:0x011d), top: B:2:0x0011 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        int i;
        MediaFormat mediaFormat;
        int i2;
        float f;
        String extractMetadata;
        FileInputStream fileInputStream = this.v;
        this.f = ByteBuffer.allocate(SQLiteDatabase.OPEN_PRIVATECACHE);
        this.g = new MediaExtractor();
        try {
            this.t = new gj50(this.u);
            this.g.setDataSource(fileInputStream.getFD());
            int trackCount = this.g.getTrackCount();
            for (int i3 = 0; i3 < trackCount; i3++) {
                MediaFormat trackFormat = this.g.getTrackFormat(i3);
                String string = trackFormat.getString("mime");
                trackFormat.toString();
                this.g.selectTrack(i3);
                if (string.startsWith("video/")) {
                    this.h = i3;
                    this.j = trackFormat.getLong("durationUs");
                    int i4 = this.b;
                    int i5 = this.c;
                    int i6 = this.d;
                    if (i6 != -1) {
                        int integer = trackFormat.getInteger("width");
                        int integer2 = trackFormat.getInteger("height");
                        try {
                            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                            mediaMetadataRetriever.setDataSource(fileInputStream.getFD());
                            extractMetadata = mediaMetadataRetriever.extractMetadata(24);
                            mediaMetadataRetriever.release();
                        } catch (Exception unused) {
                        }
                        if (extractMetadata != null) {
                            i2 = Integer.parseInt(extractMetadata);
                            if (i2 % 180 == 90) {
                                integer2 = integer;
                                integer = integer2;
                            }
                            f = integer / integer2;
                            if (f <= 1.0f) {
                                i5 = (int) (i6 / f);
                                i4 = i6;
                            } else {
                                i4 = (int) (i6 * f);
                                i5 = i6;
                            }
                        }
                        i2 = 0;
                        if (i2 % 180 == 90) {
                        }
                        f = integer / integer2;
                        if (f <= 1.0f) {
                        }
                    }
                    int i7 = i4 - (i4 % 4);
                    int i8 = i5 - (i5 % 4);
                    try {
                        i = trackFormat.getInteger("frame-rate");
                    } catch (Throwable unused2) {
                        i = 15;
                    }
                    if (wn80.f && string.equals("video/hevc") && gcd0.k() != null) {
                        mediaFormat = trackFormat;
                        this.m = new xip(i7, i8, i, this.e, trackFormat, this);
                    } else {
                        mediaFormat = trackFormat;
                        this.m = new xip(i7, i8, i, this.e, this);
                    }
                    m0g0 m0g0Var = new m0g0(4);
                    this.n = m0g0Var;
                    p1t p1tVar = new p1t(m0g0Var);
                    this.o = p1tVar;
                    s1t s1tVar = new s1t(this.n, p1tVar, this.m.c);
                    this.p = s1tVar;
                    s1tVar.a(new hij0(this, 17));
                    this.k = new z7l(string, mediaFormat, this.l, this);
                    this.t.e = true;
                } else if (string.startsWith("audio/")) {
                    this.i = i3;
                    gj50 gj50Var = this.t;
                    gj50Var.f = true;
                    gj50Var.d = gj50Var.a.addTrack(trackFormat);
                }
                if (this.i != -1 && this.h != -1) {
                    return;
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
            xip xipVar = this.m;
            if (xipVar != null) {
                xipVar.c();
            }
            z7l z7lVar = this.k;
            if (z7lVar != null) {
                z7lVar.b();
            }
            this.g.release();
            gj50 gj50Var2 = this.t;
            if (gj50Var2 != null) {
                gj50Var2.c();
            }
        }
    }

    public final void b() {
        a aVar = this.a;
        while (!this.s) {
            try {
                if (Thread.currentThread().isInterrupted()) {
                    return;
                }
                while (true) {
                    if (this.q) {
                        break;
                    }
                    int sampleTrackIndex = this.g.getSampleTrackIndex();
                    if (sampleTrackIndex == this.h) {
                        z7l z7lVar = this.k;
                        MediaExtractor mediaExtractor = this.g;
                        MediaCodec mediaCodec = z7lVar.a;
                        int dequeueInputBuffer = mediaCodec.dequeueInputBuffer(10000L);
                        if (dequeueInputBuffer >= 0) {
                            z7lVar.a.queueInputBuffer(dequeueInputBuffer, 0, mediaExtractor.readSampleData(mediaCodec.getInputBuffer(dequeueInputBuffer), 0), mediaExtractor.getSampleTime(), 0);
                            mediaExtractor.advance();
                        }
                    } else {
                        int i = this.i;
                        if (sampleTrackIndex == i && i != -1) {
                            this.f.rewind();
                            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                            bufferInfo.offset = 0;
                            bufferInfo.size = this.g.readSampleData(this.f, 0);
                            bufferInfo.presentationTimeUs = this.g.getSampleTime();
                            int sampleFlags = this.g.getSampleFlags();
                            int i2 = (sampleFlags & 1) > 0 ? 1 : 0;
                            if ((sampleFlags & 4) > 0) {
                                i2 |= 8;
                            }
                            bufferInfo.flags = i2;
                            gj50 gj50Var = this.t;
                            ByteBuffer byteBuffer = this.f;
                            MediaMuxer mediaMuxer = gj50Var.a;
                            if (gj50Var.b()) {
                                if (!gj50Var.b) {
                                    mediaMuxer.start();
                                    gj50Var.b = true;
                                }
                                gj50Var.a();
                                mediaMuxer.writeSampleData(gj50Var.d, byteBuffer, bufferInfo);
                            } else {
                                gj50Var.g.add(new gj50.a(gj50Var.d, byteBuffer, bufferInfo));
                            }
                            this.g.advance();
                        } else if (sampleTrackIndex == -1) {
                            this.q = true;
                            this.g.release();
                            z7l z7lVar2 = this.k;
                            int dequeueInputBuffer2 = z7lVar2.a.dequeueInputBuffer(10000L);
                            if (dequeueInputBuffer2 >= 0) {
                                z7lVar2.a.queueInputBuffer(dequeueInputBuffer2, 0, 0, 0L, 4);
                            }
                        } else {
                            this.g.advance();
                        }
                    }
                }
                if (!this.r) {
                    this.k.a();
                }
                if (!this.s) {
                    this.m.a();
                }
            } finally {
            }
        }
        this.g.release();
        this.k.b();
        this.m.c();
        this.t.c();
        aVar.onSuccess();
    }

    public abt0(String str, String str2, int i, int i2, @NonNull ewi.a.C2839a c2839a) throws FileNotFoundException {
        this.h = -1;
        this.i = -1;
        this.j = 0L;
        this.q = false;
        this.r = false;
        this.s = false;
        this.v = new FileInputStream(str);
        this.u = str2;
        this.b = -1;
        this.c = -1;
        this.e = i2;
        this.a = c2839a;
        this.d = i;
    }
}
