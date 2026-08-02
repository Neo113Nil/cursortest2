package xsna;

import android.content.Context;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Handler;
import com.vk.im.engine.models.camera.VideoParams;
import com.vk.media.model.CameraVideoEncoderParameters;
import com.vk.stories.StoriesVideoEncoder;
import com.vk.stories.d;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.Regex;

/* compiled from: ImStoryConverter.kt */
/* loaded from: classes7.dex */
public final class tdw implements s0m0 {
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ae, code lost:
    
        if (r3 == null) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b6  */
    /* JADX WARN: Type inference failed for: r3v0, types: [long] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v4, types: [android.media.MediaMetadataRetriever] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    @Override // xsna.s0m0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Uri a(VideoParams videoParams, yjt yjtVar) {
        d.a bVar;
        MediaMetadataRetriever mediaMetadataRetriever;
        long j = videoParams.k;
        ?? r3 = videoParams.j;
        File file = videoParams.b;
        if (!file.exists()) {
            com.vk.metrics.eventtracking.b.a.q(new Exception("CameraVideoEncoder input doesn't exist"));
        }
        CameraVideoEncoderParameters cameraVideoEncoderParameters = new CameraVideoEncoderParameters(file);
        cameraVideoEncoderParameters.f = videoParams.f;
        int i = videoParams.g;
        int i2 = videoParams.h;
        cameraVideoEncoderParameters.h = i;
        cameraVideoEncoderParameters.g = i2;
        cameraVideoEncoderParameters.e = videoParams.e;
        cameraVideoEncoderParameters.i = videoParams.c;
        cameraVideoEncoderParameters.d = videoParams.d;
        cameraVideoEncoderParameters.j = videoParams.i;
        cameraVideoEncoderParameters.m = videoParams.p;
        cameraVideoEncoderParameters.k = r3;
        cameraVideoEncoderParameters.l = j;
        File file2 = videoParams.l;
        if (file2 != null) {
            int i3 = videoParams.m;
            int i4 = videoParams.n;
            int i5 = videoParams.o;
            float f = videoParams.q;
            float f2 = videoParams.r;
            cameraVideoEncoderParameters.r = file2;
            cameraVideoEncoderParameters.s = i3;
            cameraVideoEncoderParameters.t = i4;
            cameraVideoEncoderParameters.u = i5;
            cameraVideoEncoderParameters.o = f;
            cameraVideoEncoderParameters.v = f2;
            cameraVideoEncoderParameters.x = true;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        Regex regex = com.vk.core.files.a.a;
        if (!vhk0.g(file)) {
            throw new FileNotFoundException(file.getAbsoluteFile() + " not exist. Abort IM story encoding task");
        }
        MediaMetadataRetriever mediaMetadataRetriever2 = null;
        if (file.getAbsolutePath().endsWith("mp4")) {
            if (j <= r3) {
                String absolutePath = file.getAbsolutePath();
                long j2 = 0;
                try {
                    try {
                        mediaMetadataRetriever = new MediaMetadataRetriever();
                        try {
                            mediaMetadataRetriever.setDataSource(absolutePath);
                            String extractMetadata = mediaMetadataRetriever.extractMetadata(9);
                            r3 = mediaMetadataRetriever;
                            if (extractMetadata != null) {
                                j2 = Long.parseLong(extractMetadata);
                                r3 = mediaMetadataRetriever;
                            }
                        } catch (Exception e) {
                            e = e;
                            e.toString();
                            r3 = mediaMetadataRetriever;
                        }
                    } catch (Throwable th) {
                        th = th;
                        mediaMetadataRetriever2 = r3;
                        if (mediaMetadataRetriever2 != null) {
                            mediaMetadataRetriever2.release();
                        }
                        throw th;
                    }
                } catch (Exception e2) {
                    e = e2;
                    mediaMetadataRetriever = null;
                } catch (Throwable th2) {
                    th = th2;
                    if (mediaMetadataRetriever2 != null) {
                    }
                    throw th;
                }
                r3.release();
                cameraVideoEncoderParameters.l = j2;
            }
            bVar = new d.a.c(file);
        } else {
            if (j <= r3) {
                cameraVideoEncoderParameters.l = 4000L;
            }
            bVar = new d.a.b(file);
        }
        StoriesVideoEncoder.StoriesEncoderParameters a = new com.vk.stories.d(bVar, cameraVideoEncoderParameters).a();
        Context context = e43.a;
        StoriesVideoEncoder.b a2 = new StoriesVideoEncoder(context != null ? context : null, com.vk.core.files.a.u(), a, new sdw(yjtVar, countDownLatch, ref$ObjectRef), "ImStoryConverter").a();
        try {
            countDownLatch.await();
            Object obj = ref$ObjectRef.element;
            if (obj == null) {
                return Uri.fromFile(StoriesVideoEncoder.this.c);
            }
            throw ((Throwable) obj);
        } catch (InterruptedException e3) {
            a2.a();
            Handler handler = owi.a;
            boolean z = false;
            while (true) {
                try {
                    countDownLatch.await();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            if (!z) {
                throw e3;
            }
            Thread.interrupted();
            throw e3;
        }
    }
}
