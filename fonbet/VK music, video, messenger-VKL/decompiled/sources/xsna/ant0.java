package xsna;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMetadataRetriever;
import android.media.MediaMuxer;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.googlecode.mp4parser.BasicContainer;
import com.googlecode.mp4parser.authoring.builder.DefaultMp4Builder;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.vk.core.files.a;
import com.vk.log.L;
import com.vk.media.muxer.QueuedMuxer;
import com.vk.media.trimmer.EncoderException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import xsna.ar10;

/* compiled from: VideoTrimmer.java */
/* loaded from: classes3.dex */
public final class ant0 {
    public static void a(MediaMuxer mediaMuxer) {
        try {
            mediaMuxer.stop();
        } catch (Throwable th) {
            L.G("VideoTrimmer", ms9.b("can't stop muxer ", th));
        }
        try {
            mediaMuxer.release();
        } catch (Throwable th2) {
            L.G("VideoTrimmer", ms9.b("can't release muxer ", th2));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:229:0x027e, code lost:
    
        if (r4.k != null) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x0211, code lost:
    
        r2.size = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0295 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0219 A[Catch: all -> 0x0214, Exception -> 0x0217, TRY_LEAVE, TryCatch #5 {Exception -> 0x0217, blocks: (B:209:0x0207, B:245:0x0211, B:211:0x0219, B:242:0x022f), top: B:208:0x0207, outer: #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0270 A[Catch: all -> 0x0275, Exception -> 0x0278, TryCatch #3 {Exception -> 0x0278, blocks: (B:219:0x0267, B:221:0x0270, B:228:0x027c), top: B:218:0x0267, outer: #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:228:0x027c A[Catch: all -> 0x0275, Exception -> 0x0278, TRY_LEAVE, TryCatch #3 {Exception -> 0x0278, blocks: (B:219:0x0267, B:221:0x0270, B:228:0x027c), top: B:218:0x0267, outer: #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0211 A[EDGE_INSN: B:244:0x0211->B:245:0x0211 BREAK  A[LOOP:7: B:207:0x0206->B:242:0x022f], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:256:0x01fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(@NonNull Context context, @NonNull File file, @NonNull File file2, long j, long j2) throws Exception {
        int i;
        MediaMuxer mediaMuxer;
        MediaMetadataRetriever mediaMetadataRetriever;
        MediaMetadataRetriever mediaMetadataRetriever2;
        int i2;
        Object obj;
        ByteBuffer allocate;
        MediaCodec.BufferInfo bufferInfo;
        boolean z;
        boolean containsKey;
        boolean containsKey2;
        MediaExtractor mediaExtractor;
        boolean z2;
        boolean z3;
        boolean z4;
        int readSampleData;
        Integer m;
        QueuedMuxer.SampleType sampleType;
        int integer;
        g8r g8rVar;
        FileChannel fileChannel;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        FileChannel fileChannel2;
        FileOutputStream fileOutputStream3;
        String path = file.getPath();
        String absolutePath = file2.getAbsolutePath();
        int i3 = (int) j;
        int i4 = (int) j2;
        MediaExtractor mediaExtractor2 = new MediaExtractor();
        Uri parse = Uri.parse(path);
        try {
            try {
                if (HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT.equals(parse.getScheme())) {
                    mediaExtractor2.setDataSource(context, Uri.parse(new Uri.Builder().scheme(parse.getScheme()).path(DomExceptionUtils.SEPARATOR + parse.getPath()).build().toString()), (Map<String, String>) null);
                } else {
                    mediaExtractor2.setDataSource(path);
                }
                i = mediaExtractor2.getTrackCount();
            } catch (IOException e) {
                e = e;
                i = 0;
                com.vk.metrics.eventtracking.b.a.a(e);
                mediaExtractor2.release();
                mediaMuxer = null;
                if (mediaMuxer == null) {
                }
                if (!z3) {
                }
            }
            try {
                mediaMuxer = new MediaMuxer(absolutePath, 0);
            } catch (IOException e2) {
                e = e2;
                com.vk.metrics.eventtracking.b.a.a(e);
                mediaExtractor2.release();
                mediaMuxer = null;
                if (mediaMuxer == null) {
                }
                if (!z3) {
                }
            }
        } catch (IOException e3) {
            e = e3;
        }
        if (mediaMuxer == null) {
            obj = HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT;
            z3 = false;
        } else {
            HashMap hashMap = new HashMap(i);
            HashMap hashMap2 = new HashMap();
            int i5 = -1;
            int i6 = 0;
            while (i6 < i) {
                MediaFormat trackFormat = mediaExtractor2.getTrackFormat(i6);
                int i7 = i;
                String string = trackFormat.getString("mime");
                if (string.startsWith("audio/")) {
                    sampleType = QueuedMuxer.SampleType.AUDIO;
                } else if (!string.startsWith("video/") || string.equals("video/dolby-vision") || string.equals("video/scrambled")) {
                    sampleType = null;
                } else {
                    sampleType = QueuedMuxer.SampleType.VIDEO;
                    if (trackFormat.containsKey("durationUs")) {
                        trackFormat.getLong("durationUs");
                    }
                }
                if (sampleType != null) {
                    mediaExtractor2.selectTrack(i6);
                    hashMap2.put(sampleType, trackFormat);
                    hashMap.put(Integer.valueOf(i6), sampleType);
                    if (trackFormat.containsKey("max-input-size") && (integer = trackFormat.getInteger("max-input-size")) > i5) {
                        i5 = integer;
                    }
                }
                i6++;
                i = i7;
            }
            QueuedMuxer queuedMuxer = new QueuedMuxer(mediaMuxer, hashMap2.keySet(), new e7b0());
            Iterator it = hashMap2.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                QueuedMuxer.SampleType sampleType2 = (QueuedMuxer.SampleType) entry.getKey();
                MediaFormat mediaFormat = (MediaFormat) entry.getValue();
                Iterator it2 = it;
                int i8 = QueuedMuxer.a.a[sampleType2.ordinal()];
                int i9 = i5;
                if (i8 == 1) {
                    queuedMuxer.b = mediaFormat;
                } else {
                    if (i8 != 2) {
                        throw new AssertionError();
                    }
                    queuedMuxer.c = mediaFormat;
                }
                queuedMuxer.k.remove(sampleType2);
                queuedMuxer.a();
                i5 = i9;
                it = it2;
            }
            int i10 = i5;
            int i11 = i10 < 0 ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : i10;
            try {
                mediaMetadataRetriever2 = new MediaMetadataRetriever();
                try {
                    try {
                        mediaMetadataRetriever2.setDataSource(path);
                        String extractMetadata = mediaMetadataRetriever2.extractMetadata(24);
                        i2 = (extractMetadata == null || (m = arm0.m(10, extractMetadata)) == null) ? 0 : m.intValue();
                        mediaMetadataRetriever2.release();
                    } catch (Throwable th) {
                        th = th;
                        mediaMetadataRetriever = mediaMetadataRetriever2;
                        if (mediaMetadataRetriever != null) {
                            mediaMetadataRetriever.release();
                        }
                        throw th;
                    }
                } catch (Exception e4) {
                    e = e4;
                    e.toString();
                    if (mediaMetadataRetriever2 != null) {
                        mediaMetadataRetriever2.release();
                    }
                    i2 = -1;
                    if (i2 >= 0) {
                    }
                    if (i3 <= 0) {
                    }
                    allocate = ByteBuffer.allocate(i11);
                    bufferInfo = new MediaCodec.BufferInfo();
                    while (true) {
                        try {
                            try {
                                bufferInfo.offset = 0;
                                readSampleData = mediaExtractor2.readSampleData(allocate, 0);
                                bufferInfo.size = readSampleData;
                                if (readSampleData >= 0) {
                                }
                                bufferInfo.flags = mediaExtractor2.getSampleFlags();
                                queuedMuxer.b((QueuedMuxer.SampleType) hashMap.get(Integer.valueOf(mediaExtractor2.getSampleTrackIndex())), allocate, bufferInfo);
                                mediaExtractor2.advance();
                            } catch (Exception e5) {
                                com.vk.metrics.eventtracking.b.a.a(e5);
                                a(mediaMuxer);
                                z = false;
                            }
                        } catch (Throwable th2) {
                            a(mediaMuxer);
                            throw th2;
                        }
                    }
                    a(mediaMuxer);
                    z = true;
                    mediaExtractor2.release();
                    containsKey = hashMap2.containsKey(QueuedMuxer.SampleType.AUDIO);
                    containsKey2 = hashMap2.containsKey(QueuedMuxer.SampleType.VIDEO);
                    mediaExtractor = new MediaExtractor();
                    try {
                        mediaExtractor.setDataSource(absolutePath);
                        ar10.a a = ar10.a(mediaExtractor);
                        if (containsKey2) {
                        }
                        if (containsKey) {
                        }
                        z4 = true;
                        mediaExtractor.release();
                        z2 = z4;
                    } catch (Exception e6) {
                        com.vk.metrics.eventtracking.b.a.a(e6);
                        mediaExtractor.release();
                        z2 = false;
                    }
                    z3 = z2 & z;
                    if (!z3) {
                    }
                }
            } catch (Exception e7) {
                e = e7;
                mediaMetadataRetriever2 = null;
            } catch (Throwable th3) {
                th = th3;
                mediaMetadataRetriever = null;
            }
            if (i2 >= 0) {
                mediaMuxer.setOrientationHint(i2);
            }
            if (i3 <= 0) {
                for (Map.Entry entry2 : hashMap.entrySet()) {
                    if (entry2.getValue() == QueuedMuxer.SampleType.AUDIO) {
                        mediaExtractor2.unselectTrack(((Integer) entry2.getKey()).intValue());
                    }
                }
                obj = HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT;
                mediaExtractor2.seekTo(i3 * 1000, 0);
                long sampleTime = mediaExtractor2.getSampleTime();
                for (Map.Entry entry3 : hashMap.entrySet()) {
                    if (entry3.getValue() == QueuedMuxer.SampleType.AUDIO) {
                        mediaExtractor2.selectTrack(((Integer) entry3.getKey()).intValue());
                    }
                }
                mediaExtractor2.seekTo(sampleTime, 2);
            } else {
                obj = HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT;
            }
            allocate = ByteBuffer.allocate(i11);
            bufferInfo = new MediaCodec.BufferInfo();
            while (true) {
                bufferInfo.offset = 0;
                readSampleData = mediaExtractor2.readSampleData(allocate, 0);
                bufferInfo.size = readSampleData;
                if (readSampleData >= 0) {
                    break;
                }
                long sampleTime2 = mediaExtractor2.getSampleTime();
                bufferInfo.presentationTimeUs = sampleTime2;
                if (i4 > 0 && sampleTime2 > i4 * 1000) {
                    break;
                }
                bufferInfo.flags = mediaExtractor2.getSampleFlags();
                queuedMuxer.b((QueuedMuxer.SampleType) hashMap.get(Integer.valueOf(mediaExtractor2.getSampleTrackIndex())), allocate, bufferInfo);
                mediaExtractor2.advance();
            }
            a(mediaMuxer);
            z = true;
            mediaExtractor2.release();
            containsKey = hashMap2.containsKey(QueuedMuxer.SampleType.AUDIO);
            containsKey2 = hashMap2.containsKey(QueuedMuxer.SampleType.VIDEO);
            mediaExtractor = new MediaExtractor();
            try {
                mediaExtractor.setDataSource(absolutePath);
                ar10.a a2 = ar10.a(mediaExtractor);
                if (containsKey2) {
                    if (a2.g == null) {
                    }
                    z4 = false;
                    mediaExtractor.release();
                    z2 = z4;
                    z3 = z2 & z;
                }
                if (containsKey) {
                }
                z4 = true;
                mediaExtractor.release();
                z2 = z4;
                z3 = z2 & z;
            } finally {
                mediaExtractor.release();
            }
        }
        if (!z3) {
            return;
        }
        vhk0.b(file2);
        Uri parse2 = Uri.parse(file.getPath());
        if (obj.equals(parse2.getScheme())) {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(Uri.parse(new Uri.Builder().scheme(parse2.getScheme()).path(DomExceptionUtils.SEPARATOR + parse2.getPath()).build().toString()), "r");
            FileChannel channel = new FileInputStream(openFileDescriptor != null ? openFileDescriptor.getFileDescriptor() : null).getChannel();
            g8rVar = new g8r();
            g8rVar.b = channel;
            g8rVar.c = "unknown";
        } else {
            String absolutePath2 = file.getAbsolutePath();
            g8rVar = new g8r();
            File file3 = new File(absolutePath2);
            g8rVar.b = new FileInputStream(file3).getChannel();
            g8rVar.c = file3.getName();
        }
        g8r g8rVar2 = g8rVar;
        try {
            pc30 i12 = ad0.i(g8rVar2);
            LinkedList<uep0> linkedList = i12.b;
            if (linkedList == null || linkedList.isEmpty()) {
                throw new IllegalStateException("The specified media file has no tracks");
            }
            i12.b = new LinkedList();
            fye0 fye0Var = new fye0(j, 1000L);
            fye0 fye0Var2 = new fye0(j2, 1000L);
            boolean z5 = false;
            for (uep0 uep0Var : linkedList) {
                long[] B3 = uep0Var.B3();
                if (B3 != null) {
                    if (!(B3.length == 0)) {
                        if (z5) {
                            throw new EncoderException("The startTime has already been corrected by another track with SyncSample. Not Supported.");
                        }
                        fye0Var = bnt0.a(uep0Var, fye0Var, false);
                        fye0Var2 = bnt0.a(uep0Var, fye0Var2, true);
                        z5 = true;
                    }
                }
            }
            fye0Var.getClass();
            if ((fye0Var2 == null ? 1 : fye0Var.a(fye0Var2.b, fye0Var2.c)) == 0) {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("can't trim video. incorrect source, can't find start I-Frame!");
                a.c.a(g8rVar2);
                throw illegalArgumentException;
            }
            Iterator it3 = linkedList.iterator();
            while (it3.hasNext()) {
                uep0 uep0Var2 = (uep0) it3.next();
                long j3 = uep0Var2.i3().c;
                long[] Q3 = uep0Var2.Q3();
                int length = Q3.length;
                long j4 = 0;
                g8r g8rVar3 = g8rVar2;
                Iterator it4 = it3;
                long j5 = -1;
                long j6 = -1;
                long j7 = 0;
                int i13 = 0;
                while (i13 < length) {
                    long j8 = Q3[i13];
                    if (fye0Var.a(j7, j3) >= 0) {
                        j5 = j4;
                    }
                    if (fye0Var2.a(j7, j3) >= 0) {
                        j7 += j8;
                        i13++;
                        j6 = j4;
                        j4++;
                    }
                }
                rik rikVar = new rik("crop(" + uep0Var2.getName() + ")");
                rikVar.e = uep0Var2;
                rikVar.f = (int) j5;
                rikVar.g = (int) j6;
                i12.a(rikVar);
                g8rVar2 = g8rVar3;
                it3 = it4;
            }
            g8r g8rVar4 = g8rVar2;
            file2.getParentFile().mkdirs();
            if (!file2.exists() && !com.vk.core.files.a.c(file2)) {
                a.c.a(g8rVar4);
                throw new IOException("Unable to make dst directory");
            }
            BasicContainer a3 = new DefaultMp4Builder().a(i12);
            try {
                fileOutputStream3 = new FileOutputStream(file2);
            } catch (Exception e8) {
                e = e8;
                fileOutputStream2 = null;
            } catch (Throwable th4) {
                th = th4;
                fileChannel = null;
                fileOutputStream = null;
            }
            try {
                fileChannel = fileOutputStream3.getChannel();
                try {
                    a3.writeContainer(fileChannel);
                    a.c.a(fileChannel);
                    a.c.a(fileOutputStream3);
                    a.c.a(g8rVar4);
                } catch (Exception e9) {
                    e = e9;
                    fileChannel2 = fileChannel;
                    fileOutputStream2 = fileOutputStream3;
                    try {
                        throw e;
                    } catch (Throwable th5) {
                        th = th5;
                        FileChannel fileChannel3 = fileChannel2;
                        fileOutputStream = fileOutputStream2;
                        fileChannel = fileChannel3;
                        a.c.a(fileChannel);
                        a.c.a(fileOutputStream);
                        a.c.a(g8rVar4);
                        throw th;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    fileOutputStream = fileOutputStream3;
                    a.c.a(fileChannel);
                    a.c.a(fileOutputStream);
                    a.c.a(g8rVar4);
                    throw th;
                }
            } catch (Exception e10) {
                e = e10;
                fileOutputStream2 = fileOutputStream3;
                fileChannel2 = null;
                throw e;
            } catch (Throwable th7) {
                th = th7;
                fileOutputStream = fileOutputStream3;
                fileChannel = null;
            }
        } catch (Exception e11) {
            a.c.a(g8rVar2);
            throw e11;
        }
    }
}
