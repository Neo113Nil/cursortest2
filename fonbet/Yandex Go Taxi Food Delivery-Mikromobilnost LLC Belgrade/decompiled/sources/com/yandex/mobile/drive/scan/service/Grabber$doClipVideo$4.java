package com.yandex.mobile.drive.scan.service;

import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import defpackage.bn31;
import defpackage.cvu0;
import defpackage.h2b1;
import defpackage.hf11;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qgn0;
import defpackage.tk31;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.mobile.drive.scan.service.Grabber$doClipVideo$4", f = "Grabber.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class Grabber$doClipVideo$4 extends SuspendLambda implements wls {
    final /* synthetic */ File $file;
    final /* synthetic */ long $maxDurationMs;
    final /* synthetic */ bn31 $reporter;
    final /* synthetic */ File $target;
    final /* synthetic */ tk31 $video;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Grabber$doClipVideo$4(bn31 bn31Var, File file, tk31 tk31Var, long j, File file2, Continuation continuation) {
        super(2, continuation);
        this.$reporter = bn31Var;
        this.$file = file;
        this.$video = tk31Var;
        this.$maxDurationMs = j;
        this.$target = file2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new Grabber$doClipVideo$4(this.$reporter, this.$file, this.$video, this.$maxDurationMs, this.$target, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        Grabber$doClipVideo$4 grabber$doClipVideo$4 = (Grabber$doClipVideo$4) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        grabber$doClipVideo$4.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        long j;
        long j2;
        int integer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        File file = this.$file;
        File file2 = this.$target;
        tk31 tk31Var = this.$video;
        long j3 = this.$maxDurationMs;
        long currentTimeMillis = System.currentTimeMillis();
        new hf11();
        String absolutePath = file.getAbsolutePath();
        String absolutePath2 = file2.getAbsolutePath();
        long j4 = tk31Var.b - j3;
        if (j4 <= 0) {
            j = 0;
            j2 = currentTimeMillis;
        } else {
            MediaExtractor mediaExtractor = new MediaExtractor();
            mediaExtractor.setDataSource(absolutePath);
            int trackCount = mediaExtractor.getTrackCount();
            MediaMuxer mediaMuxer = new MediaMuxer(absolutePath2, 0);
            HashMap hashMap = new HashMap(trackCount);
            int i = -1;
            j = 0;
            int i2 = 0;
            while (i2 < trackCount) {
                MediaFormat trackFormat = mediaExtractor.getTrackFormat(i2);
                String string = trackFormat.getString("mime");
                long j5 = currentTimeMillis;
                if (string != null && cvu0.x(string, "video/", false)) {
                    mediaExtractor.selectTrack(i2);
                    hashMap.put(Integer.valueOf(i2), Integer.valueOf(mediaMuxer.addTrack(trackFormat)));
                    if (trackFormat.containsKey("max-input-size") && (integer = trackFormat.getInteger("max-input-size")) > i) {
                        i = integer;
                    }
                }
                i2++;
                currentTimeMillis = j5;
            }
            j2 = currentTimeMillis;
            if (i < 0) {
                i = 8192;
            }
            ByteBuffer allocate = ByteBuffer.allocate(i);
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            mediaExtractor.seekTo(TimeUnit.MILLISECONDS.toMicros(j4), 2);
            mediaMuxer.start();
            while (true) {
                try {
                    int readSampleData = mediaExtractor.readSampleData(allocate, 0);
                    bufferInfo.size = readSampleData;
                    if (readSampleData < 0) {
                        break;
                    }
                    bufferInfo.presentationTimeUs = mediaExtractor.getSampleTime();
                    bufferInfo.flags = mediaExtractor.getSampleFlags();
                    Integer num = (Integer) hashMap.get(Integer.valueOf(mediaExtractor.getSampleTrackIndex()));
                    if (num != null) {
                        mediaMuxer.writeSampleData(num.intValue(), allocate, bufferInfo);
                    }
                    mediaExtractor.advance();
                } catch (Throwable th) {
                    try {
                        mediaMuxer.stop();
                        throw th;
                    } finally {
                    }
                }
            }
            bufferInfo.size = 0;
            try {
                mediaMuxer.stop();
            } finally {
            }
        }
        if (file2.exists()) {
            if (file2.length() > j) {
                kotlin.io.b.k(file2, file, true, 4);
            }
            file2.delete();
        }
        long currentTimeMillis2 = System.currentTimeMillis() - j2;
        this.$reporter.b(new Double(this.$file.length()));
        Map i3 = kotlin.collections.b.i(new Pair("duration", Long.valueOf(this.$video.b / 1000)), new Pair("max_duration", Long.valueOf(this.$maxDurationMs / 1000)), new Pair("transcode_duration", Long.valueOf(currentTimeMillis2 / 1000)));
        qgn0 qgn0Var = h2b1.c;
        if (qgn0Var != null) {
            qgn0Var.n("debug_video_transcode_succeeded", i3);
        }
        return zy11.a;
    }
}
