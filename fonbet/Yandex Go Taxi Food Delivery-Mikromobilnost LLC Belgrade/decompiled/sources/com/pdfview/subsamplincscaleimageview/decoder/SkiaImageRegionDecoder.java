package com.pdfview.subsamplincscaleimageview.decoder;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.text.TextUtils;
import com.pdfview.subsamplincscaleimageview.SubsamplingScaleImageView;
import com.pichillilorenzo.flutter_inappwebview_android.Util;
import defpackage.sdv;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes11.dex */
public class SkiaImageRegionDecoder implements sdv {
    public BitmapRegionDecoder a;
    public final ReentrantReadWriteLock b = new ReentrantReadWriteLock(true);
    public final Bitmap.Config c;

    public SkiaImageRegionDecoder() {
        Bitmap.Config preferredBitmapConfig = SubsamplingScaleImageView.getPreferredBitmapConfig();
        if (preferredBitmapConfig != null) {
            this.c = preferredBitmapConfig;
        } else {
            this.c = Bitmap.Config.RGB_565;
        }
    }

    @Override // defpackage.sdv
    public final synchronized void a() {
        this.b.writeLock().lock();
        try {
            this.a.recycle();
            this.a = null;
        } finally {
            this.b.writeLock().unlock();
        }
    }

    @Override // defpackage.sdv
    public final Point b(Context context, Uri uri) {
        int i;
        String uri2 = uri.toString();
        if (uri2.startsWith("android.resource://")) {
            String authority = uri.getAuthority();
            Resources resources = context.getPackageName().equals(authority) ? context.getResources() : context.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            int size = pathSegments.size();
            if (size == 2 && pathSegments.get(0).equals("drawable")) {
                i = resources.getIdentifier(pathSegments.get(1), "drawable", authority);
            } else {
                if (size == 1 && TextUtils.isDigitsOnly(pathSegments.get(0))) {
                    try {
                        i = Integer.parseInt(pathSegments.get(0));
                    } catch (NumberFormatException unused) {
                    }
                }
                i = 0;
            }
            this.a = BitmapRegionDecoder.newInstance(context.getResources().openRawResource(i), false);
        } else if (uri2.startsWith(Util.ANDROID_ASSET_URL)) {
            this.a = BitmapRegionDecoder.newInstance(context.getAssets().open(uri2.substring(22), 1), false);
        } else if (uri2.startsWith("file://")) {
            this.a = BitmapRegionDecoder.newInstance(uri2.substring(7), false);
        } else {
            InputStream inputStream = null;
            try {
                inputStream = context.getContentResolver().openInputStream(uri);
                this.a = BitmapRegionDecoder.newInstance(inputStream, false);
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Exception unused2) {
                    }
                }
            } catch (Throwable th) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Exception unused3) {
                    }
                }
                throw th;
            }
        }
        return new Point(this.a.getWidth(), this.a.getHeight());
    }

    @Override // defpackage.sdv
    public final Bitmap c(int i, Rect rect) {
        ReentrantReadWriteLock reentrantReadWriteLock = this.b;
        reentrantReadWriteLock.readLock().lock();
        try {
            BitmapRegionDecoder bitmapRegionDecoder = this.a;
            if (bitmapRegionDecoder == null || bitmapRegionDecoder.isRecycled()) {
                throw new IllegalStateException("Cannot decode region after decoder has been recycled");
            }
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inSampleSize = i;
            options.inPreferredConfig = this.c;
            Bitmap decodeRegion = this.a.decodeRegion(rect, options);
            if (decodeRegion == null) {
                throw new RuntimeException("Skia image decoder returned null bitmap - image format may not be supported");
            }
            reentrantReadWriteLock.readLock().unlock();
            return decodeRegion;
        } catch (Throwable th) {
            reentrantReadWriteLock.readLock().unlock();
            throw th;
        }
    }

    @Override // defpackage.sdv
    public final synchronized boolean isReady() {
        boolean z;
        BitmapRegionDecoder bitmapRegionDecoder = this.a;
        if (bitmapRegionDecoder != null) {
            z = bitmapRegionDecoder.isRecycled() ? false : true;
        }
        return z;
    }
}
