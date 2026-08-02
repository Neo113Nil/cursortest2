package xsna;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMetadataRetriever;
import android.media.MediaMuxer;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.Range;
import com.vk.media.MediaUtils;
import com.vk.media.pipeline.di.MediaPipelineComponent;
import com.vk.media.pipeline.model.item.AudioItem;
import com.vk.media.pipeline.model.item.VideoEncodedItem;
import com.vk.media.pipeline.model.quality.MediaQuality;
import com.vk.media.pipeline.model.source.local.TrackMediaSource;
import com.vk.media.pipeline.model.transform.TransformFormat;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Ref$IntRef;
import xsna.hpa0;
import xsna.qpa0;

/* compiled from: VideoReverterImpl.kt */
/* loaded from: classes16.dex */
public final class wdt0 {
    public final tdt0 a;
    public final lxd b;
    public final uv20 c;
    public volatile gpa0 d;
    public final Handler e = new Handler(Looper.getMainLooper());
    public final AtomicBoolean f = new AtomicBoolean(false);

    /* compiled from: VideoReverterImpl.kt */
    public static final class a {
        public final izs<Integer, s3q0> a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(File file, File file2, int i, Integer num, izs<? super Integer, s3q0> izsVar) {
            this.a = izsVar;
        }
    }

    public wdt0(tdt0 tdt0Var, lxd lxdVar, nh nhVar, uv20 uv20Var) {
        this.a = tdt0Var;
        this.b = lxdVar;
        this.c = uv20Var;
    }

    public static int f(MediaExtractor mediaExtractor, boolean z) {
        int trackCount = mediaExtractor.getTrackCount();
        for (int i = 0; i < trackCount; i++) {
            String string = mediaExtractor.getTrackFormat(i).getString("mime");
            if (string != null) {
                if (z) {
                    if (brm0.B(string, "audio/", false)) {
                        return i;
                    }
                } else if (brm0.B(string, "video/", false) && !string.equals("video/dolby-vision") && !string.equals("video/scrambled")) {
                    return i;
                }
            }
        }
        return -5;
    }

    public final void a() {
        gpa0 gpa0Var = this.d;
        if (gpa0Var != null) {
            gpa0Var.cancel();
        }
        this.d = null;
    }

    public final ArrayList b(MediaExtractor mediaExtractor) {
        ArrayList arrayList = new ArrayList();
        while (!this.f.get()) {
            long sampleTime = mediaExtractor.getSampleTime();
            if (sampleTime < 0) {
                break;
            }
            arrayList.add(Long.valueOf(sampleTime));
            mediaExtractor.advance();
        }
        return arrayList;
    }

    public final void c(File file, File file2, int i, Integer num, izs<? super Integer, s3q0> izsVar) {
        if (this.f.get()) {
            a();
            return;
        }
        a aVar = new a(file, file2, i, num, izsVar);
        if (this.f.get()) {
            return;
        }
        TrackMediaSource trackMediaSource = new TrackMediaSource(Uri.fromFile(file), -1);
        long micros = TimeUnit.MILLISECONDS.toMicros(MediaUtils.a.h(file.getAbsolutePath()));
        VideoEncodedItem videoEncodedItem = new VideoEncodedItem(trackMediaSource, 0L, micros, 1.0d, null, 16, null);
        AudioItem audioItem = new AudioItem(trackMediaSource, 0L, micros, 1.0d, 1.0f, null, 32, null);
        meg megVar = new meg(new lwo0(this.b.b().Gd()));
        megVar.c(videoEncodedItem);
        megVar.a(audioItem);
        lwo0 b = megVar.b();
        MediaPipelineComponent b2 = this.b.b();
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        gpa0 build = hpa0.a.a(b2.p6(context).c(b.b()), "clip_reverter").build();
        MediaUtils.f d = MediaUtils.a.d(file.getAbsolutePath());
        if (d == null) {
            throw new IllegalArgumentException("can't extract video info");
        }
        ykm0 ykm0Var = new ykm0(file2, new TransformFormat(MediaQuality.HIGH, new TransformFormat.VideoOutputFormat(d.a, d.b, null, Float.valueOf(num.intValue()), Integer.valueOf(i)), null), new jkp0(new xdt0(this, aVar)));
        a();
        this.d = build;
        if (this.f.get()) {
            a();
            return;
        }
        qpa0 c = build.c(ykm0Var);
        if (c instanceof qpa0.c) {
            throw ((qpa0.c) c).a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0158  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d() {
        AtomicBoolean atomicBoolean;
        int i;
        File file;
        int i2;
        Ref$IntRef ref$IntRef;
        Ref$IntRef ref$IntRef2;
        File file2;
        Ref$IntRef ref$IntRef3;
        final Ref$IntRef ref$IntRef4;
        File file3;
        Range<Integer> bitrateRange;
        tdt0 tdt0Var = this.a;
        File file4 = tdt0Var.b;
        File file5 = tdt0Var.a;
        File file6 = tdt0Var.c;
        File file7 = tdt0Var.d;
        MediaExtractor mediaExtractor = new MediaExtractor();
        s3q0 s3q0Var = s3q0.a;
        mediaExtractor.setDataSource(file5.getAbsolutePath());
        int f = f(mediaExtractor, false);
        if (f < 0) {
            throw new IllegalArgumentException("input video " + file5.getPath() + " has no video track");
        }
        mediaExtractor.selectTrack(f);
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            atomicBoolean = this.f;
            if (atomicBoolean.get()) {
                break;
            }
            int sampleFlags = mediaExtractor.getSampleFlags();
            if (sampleFlags > 0 && (sampleFlags & 1) != 0) {
                i3++;
            }
            long sampleTime = mediaExtractor.getSampleTime();
            if (sampleTime < 0) {
                break;
            }
            arrayList.add(Long.valueOf(sampleTime));
            i4++;
            mediaExtractor.advance();
        }
        mediaExtractor.release();
        if (atomicBoolean.get()) {
            a();
            return;
        }
        if (i4 == i3 || i4 == i3 + 1) {
            e(file5.getAbsolutePath(), file4.getAbsolutePath(), arrayList, new efr0(this, 8));
            return;
        }
        float f2 = i4 - i3;
        float f3 = i3;
        float f4 = (f2 / f3) + 1;
        MediaUtils.f e = MediaUtils.a.e(file5.getAbsolutePath(), true);
        int i5 = e != null ? e.f : 0;
        int i6 = e != null ? e.c : 0;
        String str = e != null ? e.h : null;
        int i7 = 80000000;
        if (str != null) {
            i = 0;
            new gq10(this.b.b().Gd());
            ArrayList c = gq10.c(str);
            ArrayList arrayList2 = new ArrayList();
            Iterator it = c.iterator();
            while (it.hasNext()) {
                MediaCodecInfo.VideoCapabilities videoCapabilities = ((MediaCodecInfo.CodecCapabilities) it.next()).getVideoCapabilities();
                Integer upper = (videoCapabilities == null || (bitrateRange = videoCapabilities.getBitrateRange()) == null) ? null : bitrateRange.getUpper();
                if (upper != null) {
                    arrayList2.add(upper);
                }
            }
            int intValue = ((Number) j5g.n0(arrayList2)).intValue();
            if (intValue <= 80000000) {
                i7 = intValue;
            }
        } else {
            i = 0;
        }
        int min = Math.min((int) (i6 * f4), i7);
        final Ref$IntRef ref$IntRef5 = new Ref$IntRef();
        final Ref$IntRef ref$IntRef6 = new Ref$IntRef();
        final Ref$IntRef ref$IntRef7 = new Ref$IntRef();
        try {
            ref$IntRef2 = ref$IntRef7;
            ref$IntRef = ref$IntRef6;
            try {
                c(file5, file6, min, Integer.valueOf(i), new izs() { // from class: xsna.udt0
                    @Override // xsna.izs
                    public final Object invoke(Object obj) {
                        int intValue2 = ((Integer) obj).intValue();
                        Ref$IntRef.this.element = intValue2;
                        this.g(intValue2, ref$IntRef6.element, ref$IntRef7.element);
                        return s3q0.a;
                    }
                });
                ref$IntRef4 = ref$IntRef;
                ref$IntRef3 = ref$IntRef5;
                file3 = file6;
            } catch (MediaCodec.CodecException e2) {
                e = e2;
                file = file5;
                file2 = file6;
                i2 = min;
                lyd.a.a("VideoReverter", e);
                Ref$IntRef ref$IntRef8 = ref$IntRef;
                oee oeeVar = new oee(ref$IntRef5, this, ref$IntRef8, ref$IntRef2, 2);
                ref$IntRef3 = ref$IntRef5;
                ref$IntRef4 = ref$IntRef8;
                file3 = file2;
                c(file, file3, i2, -1, oeeVar);
                if (!atomicBoolean.get()) {
                }
            }
        } catch (MediaCodec.CodecException e3) {
            e = e3;
            file = file5;
            i2 = min;
            ref$IntRef = ref$IntRef6;
            ref$IntRef2 = ref$IntRef7;
            file2 = file6;
        }
        if (!atomicBoolean.get()) {
            a();
            return;
        }
        final Ref$IntRef ref$IntRef9 = ref$IntRef3;
        final Ref$IntRef ref$IntRef10 = ref$IntRef2;
        e(file3.getAbsolutePath(), file7.getAbsolutePath(), null, new rqb(ref$IntRef10, this, ref$IntRef9, ref$IntRef4, 3));
        int i8 = (int) ((i5 / 1000.0f) / f3);
        c(file7, file4, i6, Integer.valueOf(i8 == 0 ? 1 : i8), new izs() { // from class: xsna.vdt0
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                int intValue2 = ((Integer) obj).intValue();
                Ref$IntRef.this.element = intValue2;
                this.c.invoke(Float.valueOf(((ref$IntRef10.element * 0.2f) + ((intValue2 * 0.4f) + (ref$IntRef9.element * 0.4f))) / 100.0f));
                return s3q0.a;
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0190 A[Catch: all -> 0x0112, Exception -> 0x0115, TryCatch #1 {Exception -> 0x0115, blocks: (B:21:0x0092, B:28:0x00a4, B:30:0x00aa, B:33:0x00b6, B:36:0x00d1, B:38:0x00e8, B:40:0x00ef, B:46:0x0190, B:49:0x01a4, B:52:0x01bd, B:54:0x01d2, B:56:0x01da, B:69:0x0126, B:71:0x012c, B:74:0x013a, B:76:0x0150, B:80:0x0165), top: B:20:0x0092, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(String str, String str2, ArrayList arrayList, izs izsVar) {
        MediaCodec.BufferInfo bufferInfo;
        int i;
        MediaCodec.BufferInfo bufferInfo2;
        AtomicBoolean atomicBoolean;
        AtomicBoolean atomicBoolean2 = this.f;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        mediaMetadataRetriever.setDataSource(str);
        String extractMetadata = mediaMetadataRetriever.extractMetadata(9);
        int parseInt = extractMetadata != null ? Integer.parseInt(extractMetadata) : 0;
        mediaMetadataRetriever.release();
        MediaExtractor mediaExtractor = new MediaExtractor();
        mediaExtractor.setDataSource(str);
        int f = f(mediaExtractor, false);
        int f2 = f(mediaExtractor, true);
        boolean z = f2 >= 0;
        MediaMuxer mediaMuxer = new MediaMuxer(str2, 0);
        mediaExtractor.selectTrack(f);
        MediaFormat trackFormat = mediaExtractor.getTrackFormat(f);
        int addTrack = mediaMuxer.addTrack(trackFormat);
        int addTrack2 = z ? mediaMuxer.addTrack(mediaExtractor.getTrackFormat(f2)) : 0;
        mediaMuxer.start();
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(trackFormat.getInteger("max-input-size"));
        int i2 = parseInt * 1000;
        if (mediaExtractor.getSampleTrackIndex() != f) {
            mediaExtractor.selectTrack(f);
        }
        int i3 = 1;
        mediaExtractor.seekTo(i2, 0);
        int i4 = i2;
        while (i4 > 0 && mediaExtractor.getSampleTrackIndex() != f) {
            i4 -= 10000;
            mediaExtractor.seekTo(i4, 0);
            z = z;
        }
        boolean z2 = z;
        MediaCodec.BufferInfo bufferInfo3 = new MediaCodec.BufferInfo();
        try {
            try {
                if (!atomicBoolean2.get()) {
                    int i5 = 2;
                    if (arrayList == null || arrayList.isEmpty()) {
                        bufferInfo = bufferInfo3;
                        long j = -1;
                        long j2 = -1;
                        i = 0;
                        while (!atomicBoolean2.get()) {
                            bufferInfo2 = bufferInfo;
                            long sampleTime = mediaExtractor.getSampleTime();
                            long j3 = j == -1 ? sampleTime : j;
                            bufferInfo2.presentationTimeUs = j3 - sampleTime;
                            bufferInfo2.size = mediaExtractor.readSampleData(allocateDirect, 0);
                            bufferInfo2.flags = mediaExtractor.getSampleFlags();
                            if (bufferInfo2.size >= 0) {
                                mediaMuxer.writeSampleData(addTrack, allocateDirect, bufferInfo2);
                                long j4 = sampleTime - 10000;
                                if (j4 > 0 && j2 != j4) {
                                    AtomicBoolean atomicBoolean3 = atomicBoolean2;
                                    mediaExtractor.seekTo(j4, 0);
                                    int i6 = (int) ((i3 - (sampleTime / i2)) * 100);
                                    izsVar.invoke(Integer.valueOf(i6 / 2));
                                    bufferInfo = bufferInfo2;
                                    i = i6;
                                    atomicBoolean2 = atomicBoolean3;
                                    j = j3;
                                    j2 = j4;
                                    i3 = 1;
                                }
                            }
                            atomicBoolean = atomicBoolean2;
                        }
                        atomicBoolean = atomicBoolean2;
                        bufferInfo2 = bufferInfo;
                        if (z2) {
                            mediaExtractor.unselectTrack(f);
                            mediaExtractor.selectTrack(f2);
                            ArrayList b = b(mediaExtractor);
                            int size = b.size() - 1;
                            if (size >= 0) {
                                long j5 = -1;
                                while (true) {
                                    int i7 = size - 1;
                                    mediaExtractor.seekTo(((Number) b.get(size)).longValue(), 2);
                                    long sampleTime2 = mediaExtractor.getSampleTime();
                                    if (j5 == -1) {
                                        j5 = sampleTime2;
                                    }
                                    bufferInfo2.presentationTimeUs = j5 - sampleTime2;
                                    bufferInfo2.size = mediaExtractor.readSampleData(allocateDirect, 0);
                                    bufferInfo2.flags = mediaExtractor.getSampleFlags();
                                    if (bufferInfo2.size < 0 || atomicBoolean.get()) {
                                        break;
                                    }
                                    mediaMuxer.writeSampleData(addTrack2, allocateDirect, bufferInfo2);
                                    izsVar.invoke(Integer.valueOf(((100 - ((size * 100) / (b.size() - 1))) + i) / 2));
                                    if (i7 < 0) {
                                        break;
                                    } else {
                                        size = i7;
                                    }
                                }
                            }
                        }
                    } else {
                        int size2 = arrayList.size() - 1;
                        if (size2 >= 0) {
                            i = 0;
                            long j6 = -1;
                            while (true) {
                                int i8 = size2 - 1;
                                MediaCodec.BufferInfo bufferInfo4 = bufferInfo3;
                                mediaExtractor.seekTo(((Number) arrayList.get(size2)).longValue(), i5);
                                long sampleTime3 = mediaExtractor.getSampleTime();
                                if (j6 == -1) {
                                    j6 = sampleTime3;
                                }
                                bufferInfo = bufferInfo4;
                                bufferInfo.presentationTimeUs = j6 - sampleTime3;
                                bufferInfo.size = mediaExtractor.readSampleData(allocateDirect, 0);
                                bufferInfo.flags = mediaExtractor.getSampleFlags();
                                if (bufferInfo.size < 0 || atomicBoolean2.get()) {
                                    break;
                                }
                                mediaMuxer.writeSampleData(addTrack, allocateDirect, bufferInfo);
                                i = (size2 * 100) / (arrayList.size() - 1);
                                izsVar.invoke(Integer.valueOf(i / 2));
                                if (i8 < 0) {
                                    break;
                                }
                                bufferInfo3 = bufferInfo;
                                size2 = i8;
                                i5 = 2;
                            }
                            atomicBoolean = atomicBoolean2;
                            bufferInfo2 = bufferInfo;
                            if (z2) {
                            }
                        } else {
                            atomicBoolean = atomicBoolean2;
                            bufferInfo2 = bufferInfo3;
                            i = 0;
                            if (z2) {
                            }
                        }
                    }
                }
            } catch (Exception e) {
                lyd.a.a("VideoReverter", e);
            }
        } finally {
            mediaExtractor.release();
            mediaMuxer.release();
        }
    }

    public final void g(int i, int i2, int i3) {
        this.c.invoke(Float.valueOf(((i3 * 0.2f) + ((i2 * 0.4f) + (i * 0.4f))) / 100.0f));
    }
}
