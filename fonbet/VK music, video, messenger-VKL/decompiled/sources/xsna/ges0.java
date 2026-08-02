package xsna;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import xsna.ht80;

/* compiled from: VideoDecoder.java */
/* loaded from: classes12.dex */
public final class ges0<T> implements mag0<T, Bitmap> {
    public static final ht80<Long> d = new ht80<>("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new a());
    public static final ht80<Integer> e = new ht80<>("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new b());
    public static final f f = new f();
    public static final List<String> g = Collections.unmodifiableList(Arrays.asList("TP1A", "TD1A.220804.031"));
    public final e<T> a;
    public final tc7 b;
    public final f c = f;

    /* compiled from: VideoDecoder.java */
    public class a implements ht80.b<Long> {
        public final ByteBuffer a = ByteBuffer.allocate(8);

        @Override // xsna.ht80.b
        public final void a(@NonNull byte[] bArr, @NonNull Long l, @NonNull MessageDigest messageDigest) {
            Long l2 = l;
            messageDigest.update(bArr);
            synchronized (this.a) {
                this.a.position(0);
                messageDigest.update(this.a.putLong(l2.longValue()).array());
            }
        }
    }

    /* compiled from: VideoDecoder.java */
    public class b implements ht80.b<Integer> {
        public final ByteBuffer a = ByteBuffer.allocate(4);

        @Override // xsna.ht80.b
        public final void a(@NonNull byte[] bArr, @NonNull Integer num, @NonNull MessageDigest messageDigest) {
            Integer num2 = num;
            if (num2 == null) {
                return;
            }
            messageDigest.update(bArr);
            synchronized (this.a) {
                this.a.position(0);
                messageDigest.update(this.a.putInt(num2.intValue()).array());
            }
        }
    }

    /* compiled from: VideoDecoder.java */
    public static final class c implements e<AssetFileDescriptor> {
        @Override // xsna.ges0.e
        public final void a(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) {
            AssetFileDescriptor assetFileDescriptor2 = assetFileDescriptor;
            mediaMetadataRetriever.setDataSource(assetFileDescriptor2.getFileDescriptor(), assetFileDescriptor2.getStartOffset(), assetFileDescriptor2.getLength());
        }

        @Override // xsna.ges0.e
        public final void b(MediaExtractor mediaExtractor, AssetFileDescriptor assetFileDescriptor) throws IOException {
            AssetFileDescriptor assetFileDescriptor2 = assetFileDescriptor;
            mediaExtractor.setDataSource(assetFileDescriptor2.getFileDescriptor(), assetFileDescriptor2.getStartOffset(), assetFileDescriptor2.getLength());
        }
    }

    /* compiled from: VideoDecoder.java */
    public static final class d implements e<ByteBuffer> {
        @Override // xsna.ges0.e
        public final void a(MediaMetadataRetriever mediaMetadataRetriever, ByteBuffer byteBuffer) {
            mediaMetadataRetriever.setDataSource(new hes0(byteBuffer));
        }

        @Override // xsna.ges0.e
        public final void b(MediaExtractor mediaExtractor, ByteBuffer byteBuffer) throws IOException {
            mediaExtractor.setDataSource(new hes0(byteBuffer));
        }
    }

    /* compiled from: VideoDecoder.java */
    public interface e<T> {
        void a(MediaMetadataRetriever mediaMetadataRetriever, T t);

        void b(MediaExtractor mediaExtractor, T t) throws IOException;
    }

    /* compiled from: VideoDecoder.java */
    public static class f {
    }

    /* compiled from: VideoDecoder.java */
    public static final class g implements e<ParcelFileDescriptor> {
        @Override // xsna.ges0.e
        public final void a(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }

        @Override // xsna.ges0.e
        public final void b(MediaExtractor mediaExtractor, ParcelFileDescriptor parcelFileDescriptor) throws IOException {
            mediaExtractor.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    /* compiled from: VideoDecoder.java */
    public static final class h extends RuntimeException {
        private static final long serialVersionUID = -2556382523004027815L;
    }

    public ges0(tc7 tc7Var, e<T> eVar) {
        this.b = tc7Var;
        this.a = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.mag0
    public final hag0<Bitmap> a(@NonNull T t, int i, int i2, @NonNull au80 au80Var) throws IOException {
        boolean isTerminated;
        boolean isTerminated2;
        long longValue = ((Long) au80Var.c(d)).longValue();
        if (longValue < 0 && longValue != -1) {
            throw new IllegalArgumentException(defpackage.k0.a(longValue, "Requested frame must be non-negative, or DEFAULT_FRAME, given: "));
        }
        Integer num = (Integer) au80Var.c(e);
        if (num == null) {
            num = 2;
        }
        DownsampleStrategy downsampleStrategy = (DownsampleStrategy) au80Var.c(DownsampleStrategy.d);
        if (downsampleStrategy == null) {
            downsampleStrategy = DownsampleStrategy.c;
        }
        DownsampleStrategy downsampleStrategy2 = downsampleStrategy;
        this.c.getClass();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        boolean z = false;
        try {
            this.a.a(mediaMetadataRetriever, t);
            Bitmap c2 = c(t, mediaMetadataRetriever, longValue, num.intValue(), i, i2, downsampleStrategy2);
            if (Build.VERSION.SDK_INT < 29) {
                mediaMetadataRetriever.release();
            } else if (mediaMetadataRetriever instanceof AutoCloseable) {
                mediaMetadataRetriever.close();
            } else if (mediaMetadataRetriever instanceof ExecutorService) {
                ExecutorService executorService = (ExecutorService) mediaMetadataRetriever;
                if (executorService != ForkJoinPool.commonPool() && !(isTerminated2 = executorService.isTerminated())) {
                    executorService.shutdown();
                    while (!isTerminated2) {
                        try {
                            isTerminated2 = executorService.awaitTermination(1L, TimeUnit.DAYS);
                        } catch (InterruptedException unused) {
                            if (!z) {
                                executorService.shutdownNow();
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                }
            } else {
                mediaMetadataRetriever.release();
            }
            return wc7.c(c2, this.b);
        } catch (Throwable th) {
            if (Build.VERSION.SDK_INT < 29) {
                mediaMetadataRetriever.release();
            } else if (mediaMetadataRetriever instanceof AutoCloseable) {
                mediaMetadataRetriever.close();
            } else if (mediaMetadataRetriever instanceof ExecutorService) {
                ExecutorService executorService2 = (ExecutorService) mediaMetadataRetriever;
                if (executorService2 != ForkJoinPool.commonPool() && !(isTerminated = executorService2.isTerminated())) {
                    executorService2.shutdown();
                    while (!isTerminated) {
                        try {
                            isTerminated = executorService2.awaitTermination(1L, TimeUnit.DAYS);
                        } catch (InterruptedException unused2) {
                            if (!z) {
                                executorService2.shutdownNow();
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                }
            } else {
                mediaMetadataRetriever.release();
            }
            throw th;
        }
    }

    @Override // xsna.mag0
    public final boolean b(@NonNull T t, @NonNull au80 au80Var) {
        return true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(4:5|6|7|(1:9)(6:10|12|13|(2:15|(1:17)(3:18|19|20))|23|24))|28|(5:33|34|35|(1:41)|39)|(1:44)|45|(3:73|(0)|(1:61)(2:62|63))(4:49|(3:52|(1:54)(1:71)|50)|72|(0)(0))|55|56|57|(3:65|66|(1:68))|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0058, code lost:
    
        if (r4 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00dd, code lost:
    
        if (r1 < 33) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:61:0x013e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013f  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bitmap c(@NonNull T t, MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2, int i3, DownsampleStrategy downsampleStrategy) {
        MediaExtractor mediaExtractor;
        String str = Build.DEVICE;
        Bitmap bitmap = null;
        if (str != null && str.matches(".+_cheets|cheets_.+")) {
            try {
            } catch (Throwable unused) {
                mediaExtractor = null;
            }
            if ("video/webm".equals(mediaMetadataRetriever.extractMetadata(12))) {
                mediaExtractor = new MediaExtractor();
                try {
                    this.a.b(mediaExtractor, t);
                    int trackCount = mediaExtractor.getTrackCount();
                    for (int i4 = 0; i4 < trackCount; i4++) {
                        if (MimeTypes.VIDEO_VP8.equals(mediaExtractor.getTrackFormat(i4).getString("mime"))) {
                            mediaExtractor.release();
                            throw new IllegalStateException("Cannot decode VP8 video on CrOS.");
                        }
                    }
                } catch (Throwable unused2) {
                }
                mediaExtractor.release();
            }
        }
        if (i2 != Integer.MIN_VALUE && i3 != Integer.MIN_VALUE && downsampleStrategy != DownsampleStrategy.b) {
            try {
                int parseInt = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
                int parseInt2 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
                int parseInt3 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
                if (parseInt3 == 90 || parseInt3 == 270) {
                    parseInt2 = parseInt;
                    parseInt = parseInt2;
                }
                float b2 = downsampleStrategy.b(parseInt, parseInt2, i2, i3);
                bitmap = mediaMetadataRetriever.getScaledFrameAtTime(j, i, Math.round(parseInt * b2), Math.round(b2 * parseInt2));
            } catch (Throwable unused3) {
            }
        }
        if (bitmap == null) {
            bitmap = mediaMetadataRetriever.getFrameAtTime(j, i);
        }
        if (!Build.MODEL.startsWith("Pixel") || Build.VERSION.SDK_INT != 33) {
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 30) {
            }
            if (bitmap != null) {
                return bitmap;
            }
            throw new h("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
        }
        Iterator<String> it = g.iterator();
        while (it.hasNext()) {
            if (Build.ID.startsWith(it.next())) {
            }
        }
        if (bitmap != null) {
        }
        String extractMetadata = mediaMetadataRetriever.extractMetadata(36);
        String extractMetadata2 = mediaMetadataRetriever.extractMetadata(35);
        int parseInt4 = Integer.parseInt(extractMetadata);
        int parseInt5 = Integer.parseInt(extractMetadata2);
        if ((parseInt4 == 7 || parseInt4 == 6) && parseInt5 == 6) {
            if (Math.abs(Integer.parseInt(mediaMetadataRetriever.extractMetadata(24))) == 180) {
                Matrix matrix = new Matrix();
                matrix.postRotate(180.0f, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
                bitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            }
        }
        if (bitmap != null) {
        }
    }
}
