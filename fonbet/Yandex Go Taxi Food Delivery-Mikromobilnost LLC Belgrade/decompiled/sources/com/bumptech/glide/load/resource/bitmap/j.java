package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.util.Log;
import defpackage.b16;
import defpackage.ce70;
import defpackage.e77;
import defpackage.eg01;
import defpackage.egz;
import defpackage.h16;
import defpackage.mg70;
import defpackage.ml31;
import defpackage.ny61;
import defpackage.otj0;
import defpackage.qv10;
import defpackage.rtj0;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public final class j implements rtj0 {
    public static final ce70 d = new ce70("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new eg01());
    public static final ce70 e = new ce70("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new e77());
    public static final egz f = new egz();
    public static final List g = Collections.unmodifiableList(Arrays.asList("TP1A", "TD1A.220804.031"));
    public final ml31 a;
    public final b16 b;
    public final egz c = f;

    public j(b16 b16Var, ml31 ml31Var) {
        this.b = b16Var;
        this.a = ml31Var;
    }

    @Override // defpackage.rtj0
    public final otj0 a(Object obj, int i, int i2, mg70 mg70Var) {
        long longValue = ((Long) mg70Var.c(d)).longValue();
        if (longValue < 0 && longValue != -1) {
            ny61.g(qv10.j(longValue, "Requested frame must be non-negative, or DEFAULT_FRAME, given: "));
            return null;
        }
        Integer num = (Integer) mg70Var.c(e);
        if (num == null) {
            num = 2;
        }
        DownsampleStrategy downsampleStrategy = (DownsampleStrategy) mg70Var.c(DownsampleStrategy.f);
        if (downsampleStrategy == null) {
            downsampleStrategy = DownsampleStrategy.e;
        }
        DownsampleStrategy downsampleStrategy2 = downsampleStrategy;
        this.c.getClass();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            this.a.k(mediaMetadataRetriever, obj);
            Bitmap c = c(obj, mediaMetadataRetriever, longValue, num.intValue(), i, i2, downsampleStrategy2);
            mediaMetadataRetriever.close();
            return h16.c(this.b, c);
        } catch (Throwable th) {
            mediaMetadataRetriever.close();
            throw th;
        }
    }

    @Override // defpackage.rtj0
    public final boolean b(Object obj, mg70 mg70Var) {
        return true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(4:5|6|7|(1:9)(6:10|12|13|(2:15|(1:17)(3:18|19|20))|23|24))|35|(5:40|41|42|(1:48)|46)|(1:51)|52|(3:80|(0)|(1:68)(2:69|70))(4:56|(3:59|(1:61)(1:78)|57)|79|(0)(0))|62|63|64|(3:72|73|(1:75))|(0)(0)|(3:(1:29)|(0)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005c, code lost:
    
        if (r4 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0151, code lost:
    
        android.util.Log.isLoggable("VideoDecoder", 3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00ed, code lost:
    
        if (r1 < 33) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0156 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0157  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bitmap c(Object obj, MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2, int i3, DownsampleStrategy downsampleStrategy) {
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
                    this.a.g(mediaExtractor, obj);
                    int trackCount = mediaExtractor.getTrackCount();
                    for (int i4 = 0; i4 < trackCount; i4++) {
                        if ("video/x-vnd.on2.vp8".equals(mediaExtractor.getTrackFormat(i4).getString("mime"))) {
                            mediaExtractor.release();
                            ny61.r("Cannot decode VP8 video on CrOS.");
                            return null;
                        }
                    }
                } catch (Throwable unused2) {
                    try {
                        Log.isLoggable("VideoDecoder", 3);
                    } catch (Throwable th) {
                        if (mediaExtractor != null) {
                            mediaExtractor.release();
                        }
                        throw th;
                    }
                }
                mediaExtractor.release();
            }
        }
        if (i2 != Integer.MIN_VALUE && i3 != Integer.MIN_VALUE && downsampleStrategy != DownsampleStrategy.d) {
            try {
                int parseInt = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
                int parseInt2 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
                int parseInt3 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
                if (parseInt3 == 90 || parseInt3 == 270) {
                    parseInt2 = parseInt;
                    parseInt = parseInt2;
                }
                float b = downsampleStrategy.b(parseInt, parseInt2, i2, i3);
                bitmap = mediaMetadataRetriever.getScaledFrameAtTime(j, i, Math.round(parseInt * b), Math.round(b * parseInt2));
            } catch (Throwable unused3) {
                Log.isLoggable("VideoDecoder", 3);
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
            throw new VideoDecoder$VideoDecoderException("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
        }
        Iterator it = g.iterator();
        while (it.hasNext()) {
            if (Build.ID.startsWith((String) it.next())) {
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
                Log.isLoggable("VideoDecoder", 3);
                Matrix matrix = new Matrix();
                matrix.postRotate(180.0f, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
                bitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            }
        }
        if (bitmap != null) {
        }
    }
}
