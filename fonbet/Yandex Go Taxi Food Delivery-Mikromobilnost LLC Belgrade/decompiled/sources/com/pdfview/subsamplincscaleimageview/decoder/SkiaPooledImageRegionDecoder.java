package com.pdfview.subsamplincscaleimageview.decoder;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
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
import defpackage.hhs0;
import defpackage.kds0;
import defpackage.sdv;
import java.io.File;
import java.io.InputStream;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes11.dex */
public class SkiaPooledImageRegionDecoder implements sdv {
    public final Bitmap.Config c;
    public Context d;
    public Uri e;
    public hhs0 a = new hhs0(2);
    public final ReentrantReadWriteLock b = new ReentrantReadWriteLock(true);
    public long f = ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
    public final Point g = new Point(0, 0);
    public final AtomicBoolean h = new AtomicBoolean(false);

    public SkiaPooledImageRegionDecoder() {
        Bitmap.Config preferredBitmapConfig = SubsamplingScaleImageView.getPreferredBitmapConfig();
        if (preferredBitmapConfig != null) {
            this.c = preferredBitmapConfig;
        } else {
            this.c = Bitmap.Config.RGB_565;
        }
    }

    public static void setDebug(boolean z) {
    }

    @Override // defpackage.sdv
    public final synchronized void a() {
        this.b.writeLock().lock();
        try {
            hhs0 hhs0Var = this.a;
            if (hhs0Var != null) {
                synchronized (hhs0Var) {
                    while (!((ConcurrentHashMap) hhs0Var.c).isEmpty()) {
                        BitmapRegionDecoder e = hhs0Var.e();
                        e.recycle();
                        ((ConcurrentHashMap) hhs0Var.c).remove(e);
                    }
                }
                this.a = null;
                this.d = null;
                this.e = null;
            }
        } finally {
            this.b.writeLock().unlock();
        }
    }

    @Override // defpackage.sdv
    public final Point b(Context context, Uri uri) {
        this.d = context;
        this.e = uri;
        d();
        return this.g;
    }

    @Override // defpackage.sdv
    public final Bitmap c(int i, Rect rect) {
        Objects.toString(rect);
        Thread.currentThread().getName();
        int width = rect.width();
        Point point = this.g;
        if ((width < point.x || rect.height() < point.y) && this.h.compareAndSet(false, true) && this.f < ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED) {
            new kds0(1, this, false).start();
        }
        ReentrantReadWriteLock reentrantReadWriteLock = this.b;
        reentrantReadWriteLock.readLock().lock();
        try {
            hhs0 hhs0Var = this.a;
            if (hhs0Var != null) {
                BitmapRegionDecoder e = hhs0Var.e();
                if (e != null) {
                    try {
                        if (!e.isRecycled()) {
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inSampleSize = i;
                            options.inPreferredConfig = this.c;
                            Bitmap decodeRegion = e.decodeRegion(rect, options);
                            if (decodeRegion != null) {
                                return decodeRegion;
                            }
                            throw new RuntimeException("Skia image decoder returned null bitmap - image format may not be supported");
                        }
                    } finally {
                        hhs0.c(this.a, e);
                    }
                }
                if (e != null) {
                }
            }
            throw new IllegalStateException("Cannot decode region after decoder has been recycled");
        } finally {
            reentrantReadWriteLock.readLock().unlock();
        }
    }

    public final void d() {
        BitmapRegionDecoder bitmapRegionDecoder;
        int i;
        String uri = this.e.toString();
        boolean startsWith = uri.startsWith("android.resource://");
        long j = ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
        if (startsWith) {
            String authority = this.e.getAuthority();
            boolean equals = this.d.getPackageName().equals(authority);
            Context context = this.d;
            Resources resources = equals ? context.getResources() : context.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = this.e.getPathSegments();
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
            try {
                j = this.d.getResources().openRawResourceFd(i).getLength();
            } catch (Exception unused2) {
            }
            bitmapRegionDecoder = BitmapRegionDecoder.newInstance(this.d.getResources().openRawResource(i), false);
        } else if (uri.startsWith(Util.ANDROID_ASSET_URL)) {
            String substring = uri.substring(22);
            try {
                j = this.d.getAssets().openFd(substring).getLength();
            } catch (Exception unused3) {
            }
            bitmapRegionDecoder = BitmapRegionDecoder.newInstance(this.d.getAssets().open(substring, 1), false);
        } else if (uri.startsWith("file://")) {
            BitmapRegionDecoder newInstance = BitmapRegionDecoder.newInstance(uri.substring(7), false);
            try {
                File file = new File(uri);
                if (file.exists()) {
                    j = file.length();
                }
            } catch (Exception unused4) {
            }
            bitmapRegionDecoder = newInstance;
        } else {
            InputStream inputStream = null;
            try {
                ContentResolver contentResolver = this.d.getContentResolver();
                inputStream = contentResolver.openInputStream(this.e);
                BitmapRegionDecoder newInstance2 = BitmapRegionDecoder.newInstance(inputStream, false);
                try {
                    AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(this.e, "r");
                    if (openAssetFileDescriptor != null) {
                        j = openAssetFileDescriptor.getLength();
                    }
                } catch (Exception unused5) {
                }
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Exception unused6) {
                    }
                }
                bitmapRegionDecoder = newInstance2;
            } catch (Throwable th) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Exception unused7) {
                    }
                }
                throw th;
            }
        }
        this.f = j;
        this.g.set(bitmapRegionDecoder.getWidth(), bitmapRegionDecoder.getHeight());
        this.b.writeLock().lock();
        try {
            hhs0 hhs0Var = this.a;
            if (hhs0Var != null) {
                synchronized (hhs0Var) {
                    ((ConcurrentHashMap) hhs0Var.c).put(bitmapRegionDecoder, Boolean.FALSE);
                    ((Semaphore) hhs0Var.b).release();
                }
            }
        } finally {
            this.b.writeLock().unlock();
        }
    }

    @Override // defpackage.sdv
    public final synchronized boolean isReady() {
        boolean z;
        boolean isEmpty;
        hhs0 hhs0Var = this.a;
        if (hhs0Var != null) {
            synchronized (hhs0Var) {
                isEmpty = ((ConcurrentHashMap) hhs0Var.c).isEmpty();
            }
            z = isEmpty ? false : true;
        }
        return z;
    }
}
