package com.yandex.mobile.drive.drive_media_tools;

import android.media.MediaMetadataRetriever;
import defpackage.h2b1;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qgn0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "kotlin.jvm.PlatformType", "<anonymous>", "(Ltse;)Ljava/lang/String;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.mobile.drive.drive_media_tools.VideoClipper$tailVideo$2", f = "VideoClipper.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class VideoClipper$tailVideo$2 extends SuspendLambda implements wls {
    final /* synthetic */ int $seconds;
    final /* synthetic */ String $videoPath;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoClipper$tailVideo$2(String str, int i, b bVar, Continuation continuation) {
        super(2, continuation);
        this.$videoPath = str;
        this.$seconds = i;
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new VideoClipper$tailVideo$2(this.$videoPath, this.$seconds, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((VideoClipper$tailVideo$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        File file = new File(this.$videoPath);
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(this.$videoPath);
            String extractMetadata = mediaMetadataRetriever.extractMetadata(9);
            long parseLong = extractMetadata != null ? Long.parseLong(extractMetadata) : 0L;
            HashMap h = kotlin.collections.b.h(new Pair("name", this.$videoPath), new Pair("original_duration", Long.valueOf(parseLong / 1000)));
            qgn0 qgn0Var = h2b1.c;
            if (qgn0Var != null) {
                qgn0Var.n("tail_video_original_duration", h);
            }
            long j = parseLong - (this.$seconds * 1000);
            File file2 = new File(file.getParent(), UUID.randomUUID() + "_clipped.mp4");
            try {
                b.a(this.this$0, file.getAbsolutePath(), file2.getAbsolutePath(), j, mediaMetadataRetriever);
                if (!file2.exists() || file2.length() == 0) {
                    throw new IOException("Failed to create output video file");
                }
                String absolutePath = file2.getAbsolutePath();
                mediaMetadataRetriever.release();
                return absolutePath;
            } catch (Exception e) {
                if (!file2.exists()) {
                    throw e;
                }
                file2.delete();
                throw e;
            }
        } catch (Throwable th) {
            mediaMetadataRetriever.release();
            throw th;
        }
    }
}
