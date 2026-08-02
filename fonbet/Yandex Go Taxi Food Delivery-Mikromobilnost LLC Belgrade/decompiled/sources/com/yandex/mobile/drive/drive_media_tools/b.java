package com.yandex.mobile.drive.drive_media_tools;

import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMetadataRetriever;
import android.media.MediaMuxer;
import defpackage.cvu0;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.uyj;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes15.dex */
public final class b {
    public static final void a(b bVar, String str, String str2, long j, MediaMetadataRetriever mediaMetadataRetriever) {
        int integer;
        bVar.getClass();
        if (j <= 0) {
            return;
        }
        MediaExtractor mediaExtractor = new MediaExtractor();
        mediaExtractor.setDataSource(str);
        int trackCount = mediaExtractor.getTrackCount();
        MediaMuxer mediaMuxer = new MediaMuxer(str2, 0);
        HashMap hashMap = new HashMap(trackCount);
        String extractMetadata = mediaMetadataRetriever.extractMetadata(24);
        if (extractMetadata != null) {
            mediaMuxer.setOrientationHint(Integer.parseInt(extractMetadata));
        }
        int i = -1;
        for (int i2 = 0; i2 < trackCount; i2++) {
            MediaFormat trackFormat = mediaExtractor.getTrackFormat(i2);
            String string = trackFormat.getString("mime");
            if (string != null && cvu0.x(string, "video/", false)) {
                mediaExtractor.selectTrack(i2);
                hashMap.put(Integer.valueOf(i2), Integer.valueOf(mediaMuxer.addTrack(trackFormat)));
                if (trackFormat.containsKey("max-input-size") && (integer = trackFormat.getInteger("max-input-size")) > i) {
                    i = integer;
                }
            }
        }
        if (i < 0) {
            i = 8192;
        }
        ByteBuffer allocate = ByteBuffer.allocate(i);
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        mediaExtractor.seekTo(TimeUnit.MILLISECONDS.toMicros(j), 2);
        mediaMuxer.start();
        while (true) {
            try {
                int readSampleData = mediaExtractor.readSampleData(allocate, 0);
                bufferInfo.size = readSampleData;
                if (readSampleData < 0) {
                    bufferInfo.size = 0;
                    try {
                        mediaMuxer.stop();
                        return;
                    } finally {
                    }
                } else {
                    bufferInfo.presentationTimeUs = mediaExtractor.getSampleTime();
                    bufferInfo.flags = mediaExtractor.getSampleFlags();
                    Integer num = (Integer) hashMap.get(Integer.valueOf(mediaExtractor.getSampleTrackIndex()));
                    if (num != null) {
                        mediaMuxer.writeSampleData(num.intValue(), allocate, bufferInfo);
                    }
                    mediaExtractor.advance();
                }
            } catch (Throwable th) {
                try {
                    mediaMuxer.stop();
                    throw th;
                } finally {
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(int i, String str, ContinuationImpl continuationImpl) {
        VideoClipper$tailVideo$1 videoClipper$tailVideo$1;
        int i2;
        if (continuationImpl instanceof VideoClipper$tailVideo$1) {
            videoClipper$tailVideo$1 = (VideoClipper$tailVideo$1) continuationImpl;
            int i3 = videoClipper$tailVideo$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                videoClipper$tailVideo$1.label = i3 - Integer.MIN_VALUE;
                Object obj = videoClipper$tailVideo$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = videoClipper$tailVideo$1.label;
                if (i2 != 0) {
                    kotlin.b.b(obj);
                    sjh sjhVar = uyj.a;
                    mdh mdhVar = mdh.b;
                    VideoClipper$tailVideo$2 videoClipper$tailVideo$2 = new VideoClipper$tailVideo$2(str, i, this, null);
                    videoClipper$tailVideo$1.L$0 = null;
                    videoClipper$tailVideo$1.I$0 = i;
                    videoClipper$tailVideo$1.label = 1;
                    obj = tje.k0(mdhVar, videoClipper$tailVideo$2, videoClipper$tailVideo$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return obj;
            }
        }
        videoClipper$tailVideo$1 = new VideoClipper$tailVideo$1(this, continuationImpl);
        Object obj2 = videoClipper$tailVideo$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = videoClipper$tailVideo$1.label;
        if (i2 != 0) {
        }
        return obj2;
    }
}
