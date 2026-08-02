package com.pdfview.subsamplincscaleimageview;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import com.pdfview.subsamplincscaleimageview.decoder.SkiaImageDecoder;
import com.pdfview.subsamplincscaleimageview.decoder.SkiaImageRegionDecoder;
import com.pichillilorenzo.flutter_inappwebview_android.Util;
import defpackage.a3i0;
import defpackage.g8e;
import defpackage.izu0;
import defpackage.jzu0;
import defpackage.myg;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.sdv;
import defpackage.swc;
import defpackage.yev;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public class SubsamplingScaleImageView extends View {
    public static final int EASE_IN_OUT_QUAD = 2;
    public static final int EASE_OUT_QUAD = 1;
    private static final int MESSAGE_LONG_CLICK = 1;
    public static final int ORIENTATION_0 = 0;
    public static final int ORIENTATION_90 = 90;
    public static final int ORIENTATION_USE_EXIF = -1;
    public static final int ORIGIN_ANIM = 1;
    public static final int ORIGIN_DOUBLE_TAP_ZOOM = 4;
    public static final int ORIGIN_FLING = 3;
    public static final int ORIGIN_TOUCH = 2;
    public static final int PAN_LIMIT_CENTER = 3;
    public static final int PAN_LIMIT_INSIDE = 1;
    public static final int PAN_LIMIT_OUTSIDE = 2;
    public static final int SCALE_TYPE_CENTER_CROP = 2;
    public static final int SCALE_TYPE_CENTER_INSIDE = 1;
    public static final int SCALE_TYPE_CUSTOM = 3;
    public static final int SCALE_TYPE_START = 4;
    private static final String TAG = "SubsamplingScaleImageView";
    public static final int TILE_SIZE_AUTO = Integer.MAX_VALUE;
    public static final int ZOOM_FOCUS_CENTER = 2;
    public static final int ZOOM_FOCUS_CENTER_IMMEDIATE = 3;
    public static final int ZOOM_FOCUS_FIXED = 1;
    private static Bitmap.Config preferredBitmapConfig;
    private a anim;
    private Bitmap bitmap;
    private myg bitmapDecoderFactory;
    private boolean bitmapIsCached;
    private boolean bitmapIsPreview;
    private Paint bitmapPaint;
    private boolean debug;
    private Paint debugLinePaint;
    private Paint debugTextPaint;
    private sdv decoder;
    private final ReadWriteLock decoderLock;
    private final float density;
    private GestureDetector detector;
    private int doubleTapZoomDuration;
    private float doubleTapZoomScale;
    private int doubleTapZoomStyle;
    private final float[] dstArray;
    private boolean eagerLoadingEnabled;
    private Executor executor;
    private int fullImageSampleSize;
    private final Handler handler;
    private boolean hasBaseLayerTiles;
    private boolean imageLoadedSent;
    private boolean isPanning;
    private boolean isQuickScaling;
    private boolean isZooming;
    private Matrix matrix;
    private float maxScale;
    private int maxTileHeight;
    private int maxTileWidth;
    private int maxTouchCount;
    private float minScale;
    private int minimumScaleType;
    private int minimumTileDpi;
    private izu0 onImageEventListener;
    private View.OnLongClickListener onLongClickListener;
    private jzu0 onStateChangedListener;
    private int orientation;
    private Rect pRegion;
    private boolean panEnabled;
    private int panLimit;
    private Float pendingScale;
    private boolean quickScaleEnabled;
    private float quickScaleLastDistance;
    private boolean quickScaleMoved;
    private PointF quickScaleSCenter;
    private final float quickScaleThreshold;
    private PointF quickScaleVLastPoint;
    private PointF quickScaleVStart;
    private boolean readySent;
    private myg regionDecoderFactory;
    private int sHeight;
    private int sOrientation;
    private PointF sPendingCenter;
    private RectF sRect;
    private Rect sRegion;
    private PointF sRequestedCenter;
    private int sWidth;
    private c satTemp;
    private float scale;
    private float scaleStart;
    private GestureDetector singleDetector;
    private final float[] srcArray;
    private Paint tileBgPaint;
    private Map<Integer, List<d>> tileMap;
    private Uri uri;
    private PointF vCenterStart;
    private float vDistStart;
    private PointF vTranslate;
    private PointF vTranslateBefore;
    private PointF vTranslateStart;
    private boolean zoomEnabled;
    public static final int ORIENTATION_180 = 180;
    public static final int ORIENTATION_270 = 270;
    private static final List<Integer> VALID_ORIENTATIONS = Arrays.asList(0, 90, Integer.valueOf(ORIENTATION_180), Integer.valueOf(ORIENTATION_270), -1);
    private static final List<Integer> VALID_ZOOM_STYLES = Arrays.asList(1, 2, 3);
    private static final List<Integer> VALID_EASING_STYLES = Arrays.asList(2, 1);
    private static final List<Integer> VALID_PAN_LIMITS = Arrays.asList(1, 2, 3);
    private static final List<Integer> VALID_SCALE_TYPES = Arrays.asList(2, 1, 3, 4);

    public static class BitmapLoadTask extends AsyncTask<Void, Void, Integer> {
        private Bitmap bitmap;
        private final WeakReference<Context> contextRef;
        private final WeakReference<myg> decoderFactoryRef;
        private Exception exception;
        private final boolean preview;
        private final Uri source;
        private final WeakReference<SubsamplingScaleImageView> viewRef;

        public BitmapLoadTask(SubsamplingScaleImageView subsamplingScaleImageView, Context context, myg mygVar, Uri uri, boolean z) {
            this.viewRef = new WeakReference<>(subsamplingScaleImageView);
            this.contextRef = new WeakReference<>(context);
            this.decoderFactoryRef = new WeakReference<>(mygVar);
            this.source = uri;
            this.preview = z;
        }

        @Override // android.os.AsyncTask
        public Integer doInBackground(Void... voidArr) {
            try {
                String uri = this.source.toString();
                Context context = this.contextRef.get();
                myg mygVar = this.decoderFactoryRef.get();
                SubsamplingScaleImageView subsamplingScaleImageView = this.viewRef.get();
                if (context == null || mygVar == null || subsamplingScaleImageView == null) {
                    return null;
                }
                subsamplingScaleImageView.debug("BitmapLoadTask.doInBackground", new Object[0]);
                this.bitmap = ((SkiaImageDecoder) mygVar.a()).a(context, this.source);
                return Integer.valueOf(subsamplingScaleImageView.getExifOrientation(context, uri));
            } catch (Exception e) {
                Log.e(SubsamplingScaleImageView.TAG, "Failed to load bitmap", e);
                this.exception = e;
                return null;
            } catch (OutOfMemoryError e2) {
                Log.e(SubsamplingScaleImageView.TAG, "Failed to load bitmap - OutOfMemoryError", e2);
                this.exception = new RuntimeException(e2);
                return null;
            }
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(Integer num) {
            SubsamplingScaleImageView subsamplingScaleImageView = this.viewRef.get();
            if (subsamplingScaleImageView != null) {
                Bitmap bitmap = this.bitmap;
                if (bitmap == null || num == null) {
                    if (this.exception != null) {
                        SubsamplingScaleImageView.access$5600(subsamplingScaleImageView);
                    }
                } else if (this.preview) {
                    subsamplingScaleImageView.onPreviewLoaded(bitmap);
                } else {
                    subsamplingScaleImageView.onImageLoaded(bitmap, num.intValue(), false);
                }
            }
        }
    }

    public static class TileLoadTask extends AsyncTask<Void, Void, Bitmap> {
        private final WeakReference<sdv> decoderRef;
        private Exception exception;
        private final WeakReference<d> tileRef;
        private final WeakReference<SubsamplingScaleImageView> viewRef;

        public TileLoadTask(SubsamplingScaleImageView subsamplingScaleImageView, sdv sdvVar, d dVar) {
            this.viewRef = new WeakReference<>(subsamplingScaleImageView);
            this.decoderRef = new WeakReference<>(sdvVar);
            this.tileRef = new WeakReference<>(dVar);
            dVar.d = true;
        }

        @Override // android.os.AsyncTask
        public Bitmap doInBackground(Void... voidArr) {
            try {
                SubsamplingScaleImageView subsamplingScaleImageView = this.viewRef.get();
                sdv sdvVar = this.decoderRef.get();
                d dVar = this.tileRef.get();
                if (sdvVar == null || dVar == null || subsamplingScaleImageView == null || !sdvVar.isReady() || !dVar.e) {
                    if (dVar == null) {
                        return null;
                    }
                    dVar.d = false;
                    return null;
                }
                subsamplingScaleImageView.debug("TileLoadTask.doInBackground, tile.sRect=%s, tile.sampleSize=%d", dVar.a, Integer.valueOf(dVar.b));
                subsamplingScaleImageView.decoderLock.readLock().lock();
                try {
                    if (!sdvVar.isReady()) {
                        dVar.d = false;
                        subsamplingScaleImageView.decoderLock.readLock().unlock();
                        return null;
                    }
                    subsamplingScaleImageView.fileSRect(dVar.a, dVar.g);
                    if (subsamplingScaleImageView.sRegion != null) {
                        dVar.g.offset(subsamplingScaleImageView.sRegion.left, subsamplingScaleImageView.sRegion.top);
                    }
                    Bitmap c = sdvVar.c(dVar.b, dVar.g);
                    subsamplingScaleImageView.decoderLock.readLock().unlock();
                    return c;
                } catch (Throwable th) {
                    subsamplingScaleImageView.decoderLock.readLock().unlock();
                    throw th;
                }
            } catch (Exception e) {
                Log.e(SubsamplingScaleImageView.TAG, "Failed to decode tile", e);
                this.exception = e;
                return null;
            } catch (OutOfMemoryError e2) {
                Log.e(SubsamplingScaleImageView.TAG, "Failed to decode tile - OutOfMemoryError", e2);
                this.exception = new RuntimeException(e2);
                return null;
            }
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(Bitmap bitmap) {
            SubsamplingScaleImageView subsamplingScaleImageView = this.viewRef.get();
            d dVar = this.tileRef.get();
            if (subsamplingScaleImageView == null || dVar == null) {
                return;
            }
            if (bitmap != null) {
                dVar.c = bitmap;
                dVar.d = false;
                subsamplingScaleImageView.onTileLoaded();
            } else if (this.exception != null) {
                SubsamplingScaleImageView.access$5600(subsamplingScaleImageView);
            }
        }
    }

    public static class TilesInitTask extends AsyncTask<Void, Void, int[]> {
        private final WeakReference<Context> contextRef;
        private sdv decoder;
        private final WeakReference<myg> decoderFactoryRef;
        private Exception exception;
        private final Uri source;
        private final WeakReference<SubsamplingScaleImageView> viewRef;

        public TilesInitTask(SubsamplingScaleImageView subsamplingScaleImageView, Context context, myg mygVar, Uri uri) {
            this.viewRef = new WeakReference<>(subsamplingScaleImageView);
            this.contextRef = new WeakReference<>(context);
            this.decoderFactoryRef = new WeakReference<>(mygVar);
            this.source = uri;
        }

        @Override // android.os.AsyncTask
        public int[] doInBackground(Void... voidArr) {
            try {
                String uri = this.source.toString();
                Context context = this.contextRef.get();
                myg mygVar = this.decoderFactoryRef.get();
                SubsamplingScaleImageView subsamplingScaleImageView = this.viewRef.get();
                if (context == null || mygVar == null || subsamplingScaleImageView == null) {
                    return null;
                }
                subsamplingScaleImageView.debug("TilesInitTask.doInBackground", new Object[0]);
                sdv sdvVar = (sdv) mygVar.a();
                this.decoder = sdvVar;
                Point b = sdvVar.b(context, this.source);
                int i = b.x;
                int i2 = b.y;
                int exifOrientation = subsamplingScaleImageView.getExifOrientation(context, uri);
                if (subsamplingScaleImageView.sRegion != null) {
                    subsamplingScaleImageView.sRegion.left = Math.max(0, subsamplingScaleImageView.sRegion.left);
                    subsamplingScaleImageView.sRegion.top = Math.max(0, subsamplingScaleImageView.sRegion.top);
                    subsamplingScaleImageView.sRegion.right = Math.min(i, subsamplingScaleImageView.sRegion.right);
                    subsamplingScaleImageView.sRegion.bottom = Math.min(i2, subsamplingScaleImageView.sRegion.bottom);
                    i = subsamplingScaleImageView.sRegion.width();
                    i2 = subsamplingScaleImageView.sRegion.height();
                }
                return new int[]{i, i2, exifOrientation};
            } catch (Exception e) {
                Log.e(SubsamplingScaleImageView.TAG, "Failed to initialise bitmap decoder", e);
                this.exception = e;
                return null;
            }
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(int[] iArr) {
            SubsamplingScaleImageView subsamplingScaleImageView = this.viewRef.get();
            if (subsamplingScaleImageView != null) {
                sdv sdvVar = this.decoder;
                if (sdvVar != null && iArr != null && iArr.length == 3) {
                    subsamplingScaleImageView.onTilesInited(sdvVar, iArr[0], iArr[1], iArr[2]);
                } else if (this.exception != null) {
                    SubsamplingScaleImageView.access$5600(subsamplingScaleImageView);
                }
            }
        }
    }

    public SubsamplingScaleImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int resourceId;
        String string;
        this.hasBaseLayerTiles = true;
        int i = 0;
        this.orientation = 0;
        this.maxScale = 2.0f;
        this.minScale = minScale();
        this.minimumTileDpi = -1;
        this.panLimit = 1;
        this.minimumScaleType = 1;
        this.maxTileWidth = Integer.MAX_VALUE;
        this.maxTileHeight = Integer.MAX_VALUE;
        this.executor = AsyncTask.THREAD_POOL_EXECUTOR;
        this.eagerLoadingEnabled = true;
        this.panEnabled = true;
        this.zoomEnabled = true;
        this.quickScaleEnabled = true;
        this.doubleTapZoomScale = 1.0f;
        this.doubleTapZoomStyle = 1;
        this.doubleTapZoomDuration = 500;
        this.decoderLock = new ReentrantReadWriteLock(true);
        this.bitmapDecoderFactory = new swc(i, SkiaImageDecoder.class);
        this.regionDecoderFactory = new swc(i, SkiaImageRegionDecoder.class);
        this.srcArray = new float[8];
        this.dstArray = new float[8];
        this.density = getResources().getDisplayMetrics().density;
        setMinimumDpi(160);
        setDoubleTapZoomDpi(160);
        setMinimumTileDpi(320);
        setGestureDetector(context);
        this.handler = new Handler(new Handler.Callback() { // from class: com.pdfview.subsamplincscaleimageview.SubsamplingScaleImageView.1
            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                if (message.what == 1 && SubsamplingScaleImageView.this.onLongClickListener != null) {
                    SubsamplingScaleImageView.this.maxTouchCount = 0;
                    SubsamplingScaleImageView subsamplingScaleImageView = SubsamplingScaleImageView.this;
                    SubsamplingScaleImageView.super.setOnLongClickListener(subsamplingScaleImageView.onLongClickListener);
                    SubsamplingScaleImageView.this.performLongClick();
                    SubsamplingScaleImageView.super.setOnLongClickListener(null);
                }
                return true;
            }
        });
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, a3i0.SubsamplingScaleImageView);
            if (obtainStyledAttributes.hasValue(a3i0.SubsamplingScaleImageView_assetName) && (string = obtainStyledAttributes.getString(a3i0.SubsamplingScaleImageView_assetName)) != null && string.length() > 0) {
                yev a = yev.a(Util.ANDROID_ASSET_URL.concat(string));
                a.c = true;
                setImage(a);
            }
            if (obtainStyledAttributes.hasValue(a3i0.SubsamplingScaleImageView_src) && (resourceId = obtainStyledAttributes.getResourceId(a3i0.SubsamplingScaleImageView_src, 0)) > 0) {
                yev yevVar = new yev(resourceId);
                yevVar.c = true;
                setImage(yevVar);
            }
            if (obtainStyledAttributes.hasValue(a3i0.SubsamplingScaleImageView_panEnabled)) {
                setPanEnabled(obtainStyledAttributes.getBoolean(a3i0.SubsamplingScaleImageView_panEnabled, true));
            }
            if (obtainStyledAttributes.hasValue(a3i0.SubsamplingScaleImageView_zoomEnabled)) {
                setZoomEnabled(obtainStyledAttributes.getBoolean(a3i0.SubsamplingScaleImageView_zoomEnabled, true));
            }
            if (obtainStyledAttributes.hasValue(a3i0.SubsamplingScaleImageView_quickScaleEnabled)) {
                setQuickScaleEnabled(obtainStyledAttributes.getBoolean(a3i0.SubsamplingScaleImageView_quickScaleEnabled, true));
            }
            if (obtainStyledAttributes.hasValue(a3i0.SubsamplingScaleImageView_tileBackgroundColor)) {
                setTileBackgroundColor(obtainStyledAttributes.getColor(a3i0.SubsamplingScaleImageView_tileBackgroundColor, Color.argb(0, 0, 0, 0)));
            }
            obtainStyledAttributes.recycle();
        }
        this.quickScaleThreshold = TypedValue.applyDimension(1, 20.0f, context.getResources().getDisplayMetrics());
    }

    public static /* synthetic */ izu0 access$5600(SubsamplingScaleImageView subsamplingScaleImageView) {
        subsamplingScaleImageView.getClass();
        return null;
    }

    private int calculateInSampleSize(float f) {
        int round;
        if (this.minimumTileDpi > 0) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            f *= this.minimumTileDpi / ((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f);
        }
        int sWidth = (int) (sWidth() * f);
        int sHeight = (int) (sHeight() * f);
        if (sWidth == 0 || sHeight == 0) {
            return 32;
        }
        int i = 1;
        if (sHeight() > sHeight || sWidth() > sWidth) {
            round = Math.round(sHeight() / sHeight);
            int round2 = Math.round(sWidth() / sWidth);
            if (round >= round2) {
                round = round2;
            }
        } else {
            round = 1;
        }
        while (true) {
            int i2 = i * 2;
            if (i2 >= round) {
                return i;
            }
            i = i2;
        }
    }

    private boolean checkImageLoaded() {
        boolean isBaseLayerReady = isBaseLayerReady();
        if (!this.imageLoadedSent && isBaseLayerReady) {
            preDraw();
            this.imageLoadedSent = true;
            onImageLoaded();
        }
        return isBaseLayerReady;
    }

    private boolean checkReady() {
        boolean z = getWidth() > 0 && getHeight() > 0 && this.sWidth > 0 && this.sHeight > 0 && (this.bitmap != null || isBaseLayerReady());
        if (!this.readySent && z) {
            preDraw();
            this.readySent = true;
            onReady();
        }
        return z;
    }

    private void createPaints() {
        if (this.bitmapPaint == null) {
            Paint paint = new Paint();
            this.bitmapPaint = paint;
            paint.setAntiAlias(true);
            this.bitmapPaint.setFilterBitmap(true);
            this.bitmapPaint.setDither(true);
        }
        if ((this.debugTextPaint == null || this.debugLinePaint == null) && this.debug) {
            Paint paint2 = new Paint();
            this.debugTextPaint = paint2;
            paint2.setTextSize(px(12));
            this.debugTextPaint.setColor(-65281);
            this.debugTextPaint.setStyle(Paint.Style.FILL);
            Paint paint3 = new Paint();
            this.debugLinePaint = paint3;
            paint3.setColor(-65281);
            this.debugLinePaint.setStyle(Paint.Style.STROKE);
            this.debugLinePaint.setStrokeWidth(px(1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void debug(String str, Object... objArr) {
        if (this.debug) {
            String.format(str, objArr);
        }
    }

    private float distance(float f, float f2, float f3, float f4) {
        float f5 = f - f2;
        float f6 = f3 - f4;
        return (float) Math.sqrt((f6 * f6) + (f5 * f5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doubleTapZoom(PointF pointF, PointF pointF2) {
        if (!this.panEnabled) {
            PointF pointF3 = this.sRequestedCenter;
            if (pointF3 != null) {
                pointF.x = pointF3.x;
                pointF.y = pointF3.y;
            } else {
                pointF.x = sWidth() / 2;
                pointF.y = sHeight() / 2;
            }
        }
        float min = Math.min(this.maxScale, this.doubleTapZoomScale);
        float f = this.scale;
        boolean z = ((double) f) <= ((double) min) * 0.9d || f == this.minScale;
        if (!z) {
            min = minScale();
        }
        int i = this.doubleTapZoomStyle;
        if (i == 3) {
            setScaleAndCenter(min, pointF);
        } else if (i == 2 || !z || !this.panEnabled) {
            b bVar = new b(this, min, pointF);
            bVar.g = false;
            bVar.d = this.doubleTapZoomDuration;
            bVar.f = 4;
            bVar.a();
        } else if (i == 1) {
            b bVar2 = new b(this, min, pointF, pointF2);
            bVar2.g = false;
            bVar2.d = this.doubleTapZoomDuration;
            bVar2.f = 4;
            bVar2.a();
        }
        invalidate();
    }

    private float ease(int i, long j, float f, float f2, long j2) {
        if (i == 1) {
            return easeOutQuad(j, f, f2, j2);
        }
        if (i == 2) {
            return easeInOutQuad(j, f, f2, j2);
        }
        ny61.r(oyr.i(i, "Unexpected easing type: "));
        return 0.0f;
    }

    private float easeInOutQuad(long j, float f, float f2, long j2) {
        float f3 = j / (j2 / 2.0f);
        if (f3 < 1.0f) {
            return ((f2 / 2.0f) * f3 * f3) + f;
        }
        float f4 = f3 - 1.0f;
        return ((((f4 - 2.0f) * f4) - 1.0f) * ((-f2) / 2.0f)) + f;
    }

    private float easeOutQuad(long j, float f, float f2, long j2) {
        float f3 = j / j2;
        return g8e.b(f3, 2.0f, (-f2) * f3, f);
    }

    private void execute(AsyncTask<Void, Void, ?> asyncTask) {
        asyncTask.executeOnExecutor(this.executor, new Void[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fileSRect(Rect rect, Rect rect2) {
        if (getRequiredRotation() == 0) {
            rect2.set(rect);
            return;
        }
        if (getRequiredRotation() == 90) {
            int i = rect.top;
            int i2 = this.sHeight;
            rect2.set(i, i2 - rect.right, rect.bottom, i2 - rect.left);
            return;
        }
        int requiredRotation = getRequiredRotation();
        int i3 = this.sWidth;
        if (requiredRotation != 180) {
            rect2.set(i3 - rect.bottom, rect.left, i3 - rect.top, rect.right);
            return;
        }
        int i4 = i3 - rect.right;
        int i5 = this.sHeight;
        rect2.set(i4, i5 - rect.bottom, i3 - rect.left, i5 - rect.top);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fitToBounds(boolean z, c cVar) {
        float paddingLeft;
        float max;
        int max2;
        float max3;
        if (this.panLimit == 2 && isReady()) {
            z = false;
        }
        PointF pointF = cVar.b;
        float limitedScale = limitedScale(cVar.a);
        float sWidth = sWidth() * limitedScale;
        float sHeight = sHeight() * limitedScale;
        if (this.panLimit == 3 && isReady()) {
            pointF.x = Math.max(pointF.x, (getWidth() / 2) - sWidth);
            pointF.y = Math.max(pointF.y, (getHeight() / 2) - sHeight);
        } else {
            float f = pointF.x;
            if (z) {
                pointF.x = Math.max(f, getWidth() - sWidth);
                pointF.y = Math.max(pointF.y, getHeight() - sHeight);
            } else {
                pointF.x = Math.max(f, -sWidth);
                pointF.y = Math.max(pointF.y, -sHeight);
            }
        }
        float f2 = 0.5f;
        if (getPaddingLeft() > 0 || getPaddingRight() > 0) {
            paddingLeft = getPaddingLeft() / (getPaddingRight() + getPaddingLeft());
        } else {
            paddingLeft = 0.5f;
        }
        if (getPaddingTop() > 0 || getPaddingBottom() > 0) {
            f2 = getPaddingTop() / (getPaddingBottom() + getPaddingTop());
        }
        if (this.panLimit == 3 && isReady()) {
            max = Math.max(0, getWidth() / 2);
            max2 = Math.max(0, getHeight() / 2);
        } else {
            if (z) {
                max = Math.max(0.0f, (getWidth() - sWidth) * paddingLeft);
                max3 = Math.max(0.0f, (getHeight() - sHeight) * f2);
                pointF.x = Math.min(pointF.x, max);
                pointF.y = Math.min(pointF.y, max3);
                cVar.a = limitedScale;
            }
            max = Math.max(0, getWidth());
            max2 = Math.max(0, getHeight());
        }
        max3 = max2;
        pointF.x = Math.min(pointF.x, max);
        pointF.y = Math.min(pointF.y, max3);
        cVar.a = limitedScale;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getExifOrientation(Context context, String str) {
        int i = 0;
        Cursor cursor = null;
        try {
            cursor = context.getContentResolver().query(Uri.parse(str), new String[]{"orientation"}, null, null, null);
            if (cursor != null && cursor.moveToFirst()) {
                int i2 = cursor.getInt(0);
                if (VALID_ORIENTATIONS.contains(Integer.valueOf(i2)) && i2 != -1) {
                    i = i2;
                }
            }
            if (cursor != null) {
                cursor.close();
            }
            return i;
        } catch (Exception unused) {
            if (cursor != null) {
                cursor.close();
            }
            return 0;
        } catch (Throwable th) {
            if (cursor == null) {
                throw th;
            }
            cursor.close();
            throw th;
        }
    }

    private Point getMaxBitmapDimensions(Canvas canvas) {
        return new Point(Math.min(canvas.getMaximumBitmapWidth(), this.maxTileWidth), Math.min(canvas.getMaximumBitmapHeight(), this.maxTileHeight));
    }

    public static Bitmap.Config getPreferredBitmapConfig() {
        return preferredBitmapConfig;
    }

    private int getRequiredRotation() {
        int i = this.orientation;
        return i == -1 ? this.sOrientation : i;
    }

    private synchronized void initialiseBaseLayer(Point point) {
        try {
            debug("initialiseBaseLayer maxTileDimensions=%dx%d", Integer.valueOf(point.x), Integer.valueOf(point.y));
            c cVar = new c(0.0f, new PointF(0.0f, 0.0f));
            this.satTemp = cVar;
            fitToBounds(true, cVar);
            int calculateInSampleSize = calculateInSampleSize(this.satTemp.a);
            this.fullImageSampleSize = calculateInSampleSize;
            if (calculateInSampleSize > 1) {
                this.fullImageSampleSize = calculateInSampleSize / 2;
            }
            if (this.fullImageSampleSize != 1 || this.sRegion != null || sWidth() >= point.x || sHeight() >= point.y) {
                initialiseTileMap(point);
                List<d> list = this.tileMap.get(Integer.valueOf(this.fullImageSampleSize));
                if (this.hasBaseLayerTiles) {
                    Iterator<d> it = list.iterator();
                    while (it.hasNext()) {
                        execute(new TileLoadTask(this, this.decoder, it.next()));
                    }
                    refreshRequiredTiles(true);
                } else {
                    execute(new TileLoadTask(this, this.decoder, list.get(0)));
                }
            } else {
                this.decoder.a();
                this.decoder = null;
                try {
                    execute(new BitmapLoadTask(this, getContext(), this.bitmapDecoderFactory, this.uri, false));
                } catch (Throwable th) {
                    th = th;
                    this = this;
                    Throwable th2 = th;
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void initialiseTileMap(Point point) {
        debug("initialiseTileMap maxTileDimensions=%dx%d", Integer.valueOf(point.x), Integer.valueOf(point.y));
        this.tileMap = new LinkedHashMap();
        int i = this.fullImageSampleSize;
        int i2 = 1;
        int i3 = 1;
        int i4 = 1;
        while (true) {
            int sWidth = sWidth() / i3;
            int sHeight = sHeight() / i4;
            int i5 = sWidth / i;
            int i6 = sHeight / i;
            while (true) {
                if (i5 + i3 + i2 > point.x || (i5 > getWidth() * 1.25d && i < this.fullImageSampleSize)) {
                    i3++;
                    sWidth = sWidth() / i3;
                    i5 = sWidth / i;
                }
            }
            while (true) {
                if (i6 + i4 + i2 > point.y || (i6 > getHeight() * 1.25d && i < this.fullImageSampleSize)) {
                    i4++;
                    sHeight = sHeight() / i4;
                    i6 = sHeight / i;
                }
            }
            ArrayList arrayList = new ArrayList(i3 * i4);
            int i7 = 0;
            while (i7 < i3) {
                int i8 = 0;
                while (i8 < i4) {
                    d dVar = new d();
                    dVar.b = i;
                    dVar.e = i == this.fullImageSampleSize ? i2 : 0;
                    dVar.a = new Rect(i7 * sWidth, i8 * sHeight, i7 == i3 + (-1) ? sWidth() : (i7 + 1) * sWidth, i8 == i4 + (-1) ? sHeight() : (i8 + 1) * sHeight);
                    dVar.f = new Rect(0, 0, 0, 0);
                    dVar.g = new Rect(dVar.a);
                    arrayList.add(dVar);
                    i8++;
                    i2 = 1;
                }
                i7++;
                i2 = 1;
            }
            this.tileMap.put(Integer.valueOf(i), arrayList);
            i2 = 1;
            if (i == 1) {
                return;
            } else {
                i /= 2;
            }
        }
    }

    private boolean isBaseLayerReady() {
        boolean z = true;
        if (!this.hasBaseLayerTiles || (this.bitmap != null && !this.bitmapIsPreview)) {
            return true;
        }
        Map<Integer, List<d>> map = this.tileMap;
        if (map == null) {
            return false;
        }
        for (Map.Entry<Integer, List<d>> entry : map.entrySet()) {
            if (entry.getKey().intValue() == this.fullImageSampleSize) {
                for (d dVar : entry.getValue()) {
                    if (dVar.d || dVar.c == null) {
                        z = false;
                    }
                }
            }
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public PointF limitedSCenter(float f, float f2, float f3, PointF pointF) {
        PointF vTranslateForSCenter = vTranslateForSCenter(f, f2, f3);
        pointF.set((((((getWidth() - getPaddingRight()) - getPaddingLeft()) / 2) + getPaddingLeft()) - vTranslateForSCenter.x) / f3, (((((getHeight() - getPaddingBottom()) - getPaddingTop()) / 2) + getPaddingTop()) - vTranslateForSCenter.y) / f3);
        return pointF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float limitedScale(float f) {
        return Math.min(this.maxScale, Math.max(minScale(), f));
    }

    private float minScale() {
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int i = this.minimumScaleType;
        if (i == 2 || i == 4) {
            return Math.max((getWidth() - paddingRight) / sWidth(), (getHeight() - paddingTop) / sHeight());
        }
        if (i == 3) {
            float f = this.minScale;
            if (f > 0.0f) {
                return f;
            }
        }
        return Math.min((getWidth() - paddingRight) / sWidth(), (getHeight() - paddingTop) / sHeight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void onImageLoaded(Bitmap bitmap, int i, boolean z) {
        try {
            debug("onImageLoaded", new Object[0]);
            int i2 = this.sWidth;
            if (i2 > 0) {
                if (this.sHeight > 0) {
                    if (i2 == bitmap.getWidth()) {
                        if (this.sHeight != bitmap.getHeight()) {
                        }
                    }
                    reset(false);
                }
            }
            Bitmap bitmap2 = this.bitmap;
            if (bitmap2 != null && !this.bitmapIsCached) {
                bitmap2.recycle();
            }
            this.bitmapIsPreview = false;
            this.bitmapIsCached = z;
            this.bitmap = bitmap;
            this.sWidth = bitmap.getWidth();
            this.sHeight = bitmap.getHeight();
            this.sOrientation = i;
            boolean checkReady = checkReady();
            boolean checkImageLoaded = checkImageLoaded();
            if (checkReady || checkImageLoaded) {
                invalidate();
                requestLayout();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void onPreviewLoaded(Bitmap bitmap) {
        try {
            debug("onPreviewLoaded", new Object[0]);
            if (this.bitmap == null && !this.imageLoadedSent) {
                Rect rect = this.pRegion;
                if (rect != null) {
                    this.bitmap = Bitmap.createBitmap(bitmap, rect.left, rect.top, rect.width(), this.pRegion.height());
                } else {
                    this.bitmap = bitmap;
                }
                this.bitmapIsPreview = true;
                if (checkReady()) {
                    invalidate();
                    requestLayout();
                }
                return;
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void onTileLoaded() {
        Bitmap bitmap;
        try {
            debug("onTileLoaded", new Object[0]);
            checkReady();
            checkImageLoaded();
            if (isBaseLayerReady() && (bitmap = this.bitmap) != null) {
                if (!this.bitmapIsCached) {
                    bitmap.recycle();
                }
                this.bitmap = null;
                this.bitmapIsPreview = false;
                this.bitmapIsCached = false;
            }
            invalidate();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void onTilesInited(sdv sdvVar, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        try {
            debug("onTilesInited sWidth=%d, sHeight=%d, sOrientation=%d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(this.orientation));
            int i7 = this.sWidth;
            if (i7 > 0 && (i6 = this.sHeight) > 0 && (i7 != i || i6 != i2)) {
                reset(false);
                Bitmap bitmap = this.bitmap;
                if (bitmap != null) {
                    if (!this.bitmapIsCached) {
                        bitmap.recycle();
                    }
                    this.bitmap = null;
                    this.bitmapIsPreview = false;
                    this.bitmapIsCached = false;
                }
            }
            this.decoder = sdvVar;
            this.sWidth = i;
            this.sHeight = i2;
            this.sOrientation = i3;
            checkReady();
            if (!checkImageLoaded() && (i4 = this.maxTileWidth) > 0 && i4 != Integer.MAX_VALUE && (i5 = this.maxTileHeight) > 0 && i5 != Integer.MAX_VALUE && getWidth() > 0 && getHeight() > 0) {
                initialiseBaseLayer(new Point(this.maxTileWidth, this.maxTileHeight));
            }
            invalidate();
            requestLayout();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001f, code lost:
    
        if (r1 != 262) goto L133;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean onTouchEventInternal(MotionEvent motionEvent) {
        boolean z;
        int pointerCount = motionEvent.getPointerCount();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 5) {
                        if (action != 6) {
                            if (action != 261) {
                            }
                        }
                    }
                } else if (this.maxTouchCount > 0) {
                    if (pointerCount < 2) {
                        if (this.isQuickScaling) {
                            float abs = (Math.abs(this.quickScaleVStart.y - motionEvent.getY()) * 2.0f) + this.quickScaleThreshold;
                            if (this.quickScaleLastDistance == -1.0f) {
                                this.quickScaleLastDistance = abs;
                            }
                            float y = motionEvent.getY();
                            PointF pointF = this.quickScaleVLastPoint;
                            boolean z2 = y > pointF.y;
                            pointF.set(0.0f, motionEvent.getY());
                            float abs2 = Math.abs(1.0f - (abs / this.quickScaleLastDistance)) * 0.5f;
                            if (abs2 > 0.03f || this.quickScaleMoved) {
                                this.quickScaleMoved = true;
                                float f = this.quickScaleLastDistance > 0.0f ? z2 ? abs2 + 1.0f : 1.0f - abs2 : 1.0f;
                                double d = this.scale;
                                float max = Math.max(minScale(), Math.min(this.maxScale, this.scale * f));
                                this.scale = max;
                                if (this.panEnabled) {
                                    PointF pointF2 = this.vCenterStart;
                                    float f2 = pointF2.x;
                                    PointF pointF3 = this.vTranslateStart;
                                    float f3 = f2 - pointF3.x;
                                    float f4 = pointF2.y;
                                    float f5 = f4 - pointF3.y;
                                    float f6 = this.scaleStart;
                                    float f7 = (max / f6) * f3;
                                    float f8 = (max / f6) * f5;
                                    PointF pointF4 = this.vTranslate;
                                    pointF4.x = f2 - f7;
                                    pointF4.y = f4 - f8;
                                    if ((sHeight() * d < getHeight() && this.scale * sHeight() >= getHeight()) || (d * sWidth() < getWidth() && this.scale * sWidth() >= getWidth())) {
                                        fitToBounds(true);
                                        this.vCenterStart.set(sourceToViewCoord(this.quickScaleSCenter));
                                        this.vTranslateStart.set(this.vTranslate);
                                        this.scaleStart = this.scale;
                                        abs = 0.0f;
                                    }
                                } else {
                                    PointF pointF5 = this.sRequestedCenter;
                                    PointF pointF6 = this.vTranslate;
                                    if (pointF5 != null) {
                                        pointF6.x = (getWidth() / 2) - (this.scale * this.sRequestedCenter.x);
                                        this.vTranslate.y = (getHeight() / 2) - (this.scale * this.sRequestedCenter.y);
                                    } else {
                                        pointF6.x = (getWidth() / 2) - (this.scale * (sWidth() / 2));
                                        this.vTranslate.y = (getHeight() / 2) - (this.scale * (sHeight() / 2));
                                    }
                                }
                            }
                            this.quickScaleLastDistance = abs;
                            fitToBounds(true);
                            refreshRequiredTiles(this.eagerLoadingEnabled);
                        } else if (!this.isZooming) {
                            float abs3 = Math.abs(motionEvent.getX() - this.vCenterStart.x);
                            float abs4 = Math.abs(motionEvent.getY() - this.vCenterStart.y);
                            float f9 = this.density * 5.0f;
                            if (abs3 > f9 || abs4 > f9 || this.isPanning) {
                                this.vTranslate.x = (motionEvent.getX() - this.vCenterStart.x) + this.vTranslateStart.x;
                                this.vTranslate.y = (motionEvent.getY() - this.vCenterStart.y) + this.vTranslateStart.y;
                                PointF pointF7 = this.vTranslate;
                                float f10 = pointF7.x;
                                float f11 = pointF7.y;
                                fitToBounds(true);
                                PointF pointF8 = this.vTranslate;
                                boolean z3 = f10 != pointF8.x;
                                float f12 = pointF8.y;
                                boolean z4 = f11 != f12;
                                boolean z5 = z3 && abs3 > abs4 && !this.isPanning;
                                boolean z6 = z4 && abs4 > abs3 && !this.isPanning;
                                boolean z7 = f11 == f12 && abs4 > 3.0f * f9;
                                if (!z5 && !z6 && (!z3 || !z4 || z7 || this.isPanning)) {
                                    this.isPanning = true;
                                } else if (abs3 > f9 || abs4 > f9) {
                                    this.maxTouchCount = 0;
                                    this.handler.removeMessages(1);
                                    requestDisallowInterceptTouchEvent(false);
                                }
                                if (!this.panEnabled) {
                                    PointF pointF9 = this.vTranslate;
                                    PointF pointF10 = this.vTranslateStart;
                                    pointF9.x = pointF10.x;
                                    pointF9.y = pointF10.y;
                                    requestDisallowInterceptTouchEvent(false);
                                }
                                refreshRequiredTiles(this.eagerLoadingEnabled);
                            }
                        }
                        this.handler.removeMessages(1);
                        invalidate();
                        return true;
                    }
                    float distance = distance(motionEvent.getX(0), motionEvent.getX(1), motionEvent.getY(0), motionEvent.getY(1));
                    float x = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                    float y2 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                    if (this.zoomEnabled) {
                        PointF pointF11 = this.vCenterStart;
                        if (distance(pointF11.x, x, pointF11.y, y2) > 5.0f || Math.abs(distance - this.vDistStart) > 5.0f || this.isPanning) {
                            this.isZooming = true;
                            this.isPanning = true;
                            double d2 = this.scale;
                            float min = Math.min(this.maxScale, (distance / this.vDistStart) * this.scaleStart);
                            this.scale = min;
                            if (min <= minScale()) {
                                this.vDistStart = distance;
                                this.scaleStart = minScale();
                                this.vCenterStart.set(x, y2);
                                this.vTranslateStart.set(this.vTranslate);
                            } else if (this.panEnabled) {
                                PointF pointF12 = this.vCenterStart;
                                float f13 = pointF12.x;
                                PointF pointF13 = this.vTranslateStart;
                                float f14 = f13 - pointF13.x;
                                float f15 = pointF12.y - pointF13.y;
                                float f16 = this.scale;
                                float f17 = this.scaleStart;
                                float f18 = (f16 / f17) * f14;
                                float f19 = (f16 / f17) * f15;
                                PointF pointF14 = this.vTranslate;
                                pointF14.x = x - f18;
                                pointF14.y = y2 - f19;
                                if ((sHeight() * d2 < getHeight() && this.scale * sHeight() >= getHeight()) || (d2 * sWidth() < getWidth() && this.scale * sWidth() >= getWidth())) {
                                    fitToBounds(true);
                                    this.vCenterStart.set(x, y2);
                                    this.vTranslateStart.set(this.vTranslate);
                                    this.scaleStart = this.scale;
                                    this.vDistStart = distance;
                                }
                            } else {
                                PointF pointF15 = this.sRequestedCenter;
                                PointF pointF16 = this.vTranslate;
                                if (pointF15 != null) {
                                    pointF16.x = (getWidth() / 2) - (this.scale * this.sRequestedCenter.x);
                                    this.vTranslate.y = (getHeight() / 2) - (this.scale * this.sRequestedCenter.y);
                                } else {
                                    pointF16.x = (getWidth() / 2) - (this.scale * (sWidth() / 2));
                                    this.vTranslate.y = (getHeight() / 2) - (this.scale * (sHeight() / 2));
                                }
                            }
                            fitToBounds(true);
                            refreshRequiredTiles(this.eagerLoadingEnabled);
                            this.handler.removeMessages(1);
                            invalidate();
                            return true;
                        }
                    }
                }
                return false;
            }
            this.handler.removeMessages(1);
            if (this.isQuickScaling) {
                this.isQuickScaling = false;
                if (!this.quickScaleMoved) {
                    doubleTapZoom(this.quickScaleSCenter, this.vCenterStart);
                }
            }
            if (this.maxTouchCount <= 0 || !((z = this.isZooming) || this.isPanning)) {
                if (pointerCount == 1) {
                    this.isZooming = false;
                    this.isPanning = false;
                    this.maxTouchCount = 0;
                }
                return true;
            }
            if (z && pointerCount == 2) {
                this.isPanning = true;
                PointF pointF17 = this.vTranslateStart;
                PointF pointF18 = this.vTranslate;
                pointF17.set(pointF18.x, pointF18.y);
                int actionIndex = motionEvent.getActionIndex();
                PointF pointF19 = this.vCenterStart;
                if (actionIndex == 1) {
                    pointF19.set(motionEvent.getX(0), motionEvent.getY(0));
                } else {
                    pointF19.set(motionEvent.getX(1), motionEvent.getY(1));
                }
            }
            if (pointerCount < 3) {
                this.isZooming = false;
            }
            if (pointerCount < 2) {
                this.isPanning = false;
                this.maxTouchCount = 0;
            }
            refreshRequiredTiles(true);
            return true;
        }
        this.anim = null;
        requestDisallowInterceptTouchEvent(true);
        this.maxTouchCount = Math.max(this.maxTouchCount, pointerCount);
        if (pointerCount >= 2) {
            if (this.zoomEnabled) {
                float distance2 = distance(motionEvent.getX(0), motionEvent.getX(1), motionEvent.getY(0), motionEvent.getY(1));
                this.scaleStart = this.scale;
                this.vDistStart = distance2;
                PointF pointF20 = this.vTranslateStart;
                PointF pointF21 = this.vTranslate;
                pointF20.set(pointF21.x, pointF21.y);
                this.vCenterStart.set((motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f, (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f);
            } else {
                this.maxTouchCount = 0;
            }
            this.handler.removeMessages(1);
        } else if (!this.isQuickScaling) {
            PointF pointF22 = this.vTranslateStart;
            PointF pointF23 = this.vTranslate;
            pointF22.set(pointF23.x, pointF23.y);
            this.vCenterStart.set(motionEvent.getX(), motionEvent.getY());
            this.handler.sendEmptyMessageDelayed(1, 600L);
        }
        return true;
    }

    private void preDraw() {
        Float f;
        if (getWidth() == 0 || getHeight() == 0 || this.sWidth <= 0 || this.sHeight <= 0) {
            return;
        }
        if (this.sPendingCenter != null && (f = this.pendingScale) != null) {
            this.scale = f.floatValue();
            if (this.vTranslate == null) {
                this.vTranslate = new PointF();
            }
            this.vTranslate.x = (getWidth() / 2) - (this.scale * this.sPendingCenter.x);
            this.vTranslate.y = (getHeight() / 2) - (this.scale * this.sPendingCenter.y);
            this.sPendingCenter = null;
            this.pendingScale = null;
            fitToBounds(true);
            refreshRequiredTiles(true);
        }
        fitToBounds(false);
    }

    private int px(int i) {
        return (int) (this.density * i);
    }

    private void refreshRequiredTiles(boolean z) {
        if (this.decoder == null || this.tileMap == null) {
            return;
        }
        int min = Math.min(this.fullImageSampleSize, calculateInSampleSize(this.scale));
        Iterator<Map.Entry<Integer, List<d>>> it = this.tileMap.entrySet().iterator();
        while (it.hasNext()) {
            for (d dVar : it.next().getValue()) {
                int i = dVar.b;
                if (i < min || (i > min && i != this.fullImageSampleSize)) {
                    dVar.e = false;
                    Bitmap bitmap = dVar.c;
                    if (bitmap != null) {
                        bitmap.recycle();
                        dVar.c = null;
                    }
                }
                int i2 = dVar.b;
                if (i2 == min) {
                    if (tileVisible(dVar)) {
                        dVar.e = true;
                        if (!dVar.d && dVar.c == null && z) {
                            execute(new TileLoadTask(this, this.decoder, dVar));
                        }
                    } else if (dVar.b != this.fullImageSampleSize || !this.hasBaseLayerTiles) {
                        dVar.e = false;
                        Bitmap bitmap2 = dVar.c;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                            dVar.c = null;
                        }
                    }
                } else if (i2 == this.fullImageSampleSize) {
                    dVar.e = true;
                }
            }
        }
    }

    private void requestDisallowInterceptTouchEvent(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    private void reset(boolean z) {
        debug("reset newImage=" + z, new Object[0]);
        this.scale = 0.0f;
        this.scaleStart = 0.0f;
        this.vTranslate = null;
        this.vTranslateStart = null;
        this.vTranslateBefore = null;
        this.pendingScale = Float.valueOf(0.0f);
        this.sPendingCenter = null;
        this.sRequestedCenter = null;
        this.isZooming = false;
        this.isPanning = false;
        this.isQuickScaling = false;
        this.maxTouchCount = 0;
        this.fullImageSampleSize = 0;
        this.vCenterStart = null;
        this.vDistStart = 0.0f;
        this.quickScaleLastDistance = 0.0f;
        this.quickScaleMoved = false;
        this.quickScaleSCenter = null;
        this.quickScaleVLastPoint = null;
        this.quickScaleVStart = null;
        this.anim = null;
        this.satTemp = null;
        this.matrix = null;
        this.sRect = null;
        if (z) {
            this.uri = null;
            this.decoderLock.writeLock().lock();
            try {
                sdv sdvVar = this.decoder;
                if (sdvVar != null) {
                    sdvVar.a();
                    this.decoder = null;
                }
                this.decoderLock.writeLock().unlock();
                Bitmap bitmap = this.bitmap;
                if (bitmap != null && !this.bitmapIsCached) {
                    bitmap.recycle();
                }
                this.sWidth = 0;
                this.sHeight = 0;
                this.sOrientation = 0;
                this.sRegion = null;
                this.pRegion = null;
                this.readySent = false;
                this.imageLoadedSent = false;
                this.bitmap = null;
                this.bitmapIsPreview = false;
                this.bitmapIsCached = false;
            } catch (Throwable th) {
                this.decoderLock.writeLock().unlock();
                throw th;
            }
        }
        Map<Integer, List<d>> map = this.tileMap;
        if (map != null) {
            Iterator<Map.Entry<Integer, List<d>>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                for (d dVar : it.next().getValue()) {
                    dVar.e = false;
                    Bitmap bitmap2 = dVar.c;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                        dVar.c = null;
                    }
                }
            }
            this.tileMap = null;
        }
        setGestureDetector(getContext());
    }

    private void restoreState(ImageViewState imageViewState) {
        if (imageViewState == null || !VALID_ORIENTATIONS.contains(Integer.valueOf(imageViewState.b()))) {
            return;
        }
        this.orientation = imageViewState.b();
        this.pendingScale = Float.valueOf(imageViewState.c());
        this.sPendingCenter = imageViewState.a();
        invalidate();
    }

    private int sHeight() {
        int requiredRotation = getRequiredRotation();
        return (requiredRotation == 90 || requiredRotation == 270) ? this.sWidth : this.sHeight;
    }

    private int sWidth() {
        int requiredRotation = getRequiredRotation();
        return (requiredRotation == 90 || requiredRotation == 270) ? this.sHeight : this.sWidth;
    }

    private void sendStateChanged(float f, PointF pointF, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGestureDetector(final Context context) {
        this.detector = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener() { // from class: com.pdfview.subsamplincscaleimageview.SubsamplingScaleImageView.2
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onDoubleTap(MotionEvent motionEvent) {
                if (!SubsamplingScaleImageView.this.zoomEnabled || !SubsamplingScaleImageView.this.readySent || SubsamplingScaleImageView.this.vTranslate == null) {
                    return super.onDoubleTapEvent(motionEvent);
                }
                SubsamplingScaleImageView.this.setGestureDetector(context);
                boolean z = SubsamplingScaleImageView.this.quickScaleEnabled;
                SubsamplingScaleImageView subsamplingScaleImageView = SubsamplingScaleImageView.this;
                if (!z) {
                    subsamplingScaleImageView.doubleTapZoom(subsamplingScaleImageView.viewToSourceCoord(new PointF(motionEvent.getX(), motionEvent.getY())), new PointF(motionEvent.getX(), motionEvent.getY()));
                    return true;
                }
                subsamplingScaleImageView.vCenterStart = new PointF(motionEvent.getX(), motionEvent.getY());
                SubsamplingScaleImageView.this.vTranslateStart = new PointF(SubsamplingScaleImageView.this.vTranslate.x, SubsamplingScaleImageView.this.vTranslate.y);
                SubsamplingScaleImageView subsamplingScaleImageView2 = SubsamplingScaleImageView.this;
                subsamplingScaleImageView2.scaleStart = subsamplingScaleImageView2.scale;
                SubsamplingScaleImageView.this.isQuickScaling = true;
                SubsamplingScaleImageView.this.isZooming = true;
                SubsamplingScaleImageView.this.quickScaleLastDistance = -1.0f;
                SubsamplingScaleImageView subsamplingScaleImageView3 = SubsamplingScaleImageView.this;
                subsamplingScaleImageView3.quickScaleSCenter = subsamplingScaleImageView3.viewToSourceCoord(subsamplingScaleImageView3.vCenterStart);
                SubsamplingScaleImageView.this.quickScaleVStart = new PointF(motionEvent.getX(), motionEvent.getY());
                SubsamplingScaleImageView.this.quickScaleVLastPoint = new PointF(SubsamplingScaleImageView.this.quickScaleSCenter.x, SubsamplingScaleImageView.this.quickScaleSCenter.y);
                SubsamplingScaleImageView.this.quickScaleMoved = false;
                return false;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                if (!SubsamplingScaleImageView.this.panEnabled || !SubsamplingScaleImageView.this.readySent || SubsamplingScaleImageView.this.vTranslate == null || motionEvent == null || motionEvent2 == null || ((Math.abs(motionEvent.getX() - motionEvent2.getX()) <= 50.0f && Math.abs(motionEvent.getY() - motionEvent2.getY()) <= 50.0f) || ((Math.abs(f) <= 500.0f && Math.abs(f2) <= 500.0f) || SubsamplingScaleImageView.this.isZooming))) {
                    return super.onFling(motionEvent, motionEvent2, f, f2);
                }
                PointF pointF = new PointF((f * 0.25f) + SubsamplingScaleImageView.this.vTranslate.x, (f2 * 0.25f) + SubsamplingScaleImageView.this.vTranslate.y);
                b bVar = new b(SubsamplingScaleImageView.this, new PointF(((SubsamplingScaleImageView.this.getWidth() / 2) - pointF.x) / SubsamplingScaleImageView.this.scale, ((SubsamplingScaleImageView.this.getHeight() / 2) - pointF.y) / SubsamplingScaleImageView.this.scale));
                if (!SubsamplingScaleImageView.VALID_EASING_STYLES.contains(1)) {
                    ny61.g("Unknown easing type: 1");
                    return false;
                }
                bVar.e = 1;
                bVar.h = false;
                bVar.f = 3;
                bVar.a();
                return true;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                SubsamplingScaleImageView.this.performClick();
                return true;
            }
        });
        this.singleDetector = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener() { // from class: com.pdfview.subsamplincscaleimageview.SubsamplingScaleImageView.3
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                SubsamplingScaleImageView.this.performClick();
                return true;
            }
        });
    }

    private void setMatrixArray(float[] fArr, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        fArr[3] = f4;
        fArr[4] = f5;
        fArr[5] = f6;
        fArr[6] = f7;
        fArr[7] = f8;
    }

    public static void setPreferredBitmapConfig(Bitmap.Config config) {
        preferredBitmapConfig = config;
    }

    private void sourceToViewRect(Rect rect, Rect rect2) {
        rect2.set((int) sourceToViewX(rect.left), (int) sourceToViewY(rect.top), (int) sourceToViewX(rect.right), (int) sourceToViewY(rect.bottom));
    }

    private float sourceToViewX(float f) {
        PointF pointF = this.vTranslate;
        if (pointF == null) {
            return Float.NaN;
        }
        return (f * this.scale) + pointF.x;
    }

    private float sourceToViewY(float f) {
        PointF pointF = this.vTranslate;
        if (pointF == null) {
            return Float.NaN;
        }
        return (f * this.scale) + pointF.y;
    }

    private boolean tileVisible(d dVar) {
        float viewToSourceX = viewToSourceX(0.0f);
        float viewToSourceX2 = viewToSourceX(getWidth());
        float viewToSourceY = viewToSourceY(0.0f);
        float viewToSourceY2 = viewToSourceY(getHeight());
        Rect rect = dVar.a;
        return viewToSourceX <= ((float) rect.right) && ((float) rect.left) <= viewToSourceX2 && viewToSourceY <= ((float) rect.bottom) && ((float) rect.top) <= viewToSourceY2;
    }

    private PointF vTranslateForSCenter(float f, float f2, float f3) {
        int width = (((getWidth() - getPaddingRight()) - getPaddingLeft()) / 2) + getPaddingLeft();
        int height = (((getHeight() - getPaddingBottom()) - getPaddingTop()) / 2) + getPaddingTop();
        if (this.satTemp == null) {
            this.satTemp = new c(0.0f, new PointF(0.0f, 0.0f));
        }
        c cVar = this.satTemp;
        cVar.a = f3;
        cVar.b.set(width - (f * f3), height - (f2 * f3));
        fitToBounds(true, this.satTemp);
        return this.satTemp.b;
    }

    private float viewToSourceX(float f) {
        PointF pointF = this.vTranslate;
        if (pointF == null) {
            return Float.NaN;
        }
        return (f - pointF.x) / this.scale;
    }

    private float viewToSourceY(float f) {
        PointF pointF = this.vTranslate;
        if (pointF == null) {
            return Float.NaN;
        }
        return (f - pointF.y) / this.scale;
    }

    public b animateCenter(PointF pointF) {
        if (isReady()) {
            return new b(this, pointF);
        }
        return null;
    }

    public b animateScale(float f) {
        if (isReady()) {
            return new b(this, f);
        }
        return null;
    }

    public b animateScaleAndCenter(float f, PointF pointF) {
        if (isReady()) {
            return new b(this, f, pointF);
        }
        return null;
    }

    public final int getAppliedOrientation() {
        return getRequiredRotation();
    }

    public final PointF getCenter() {
        return viewToSourceCoord(getWidth() / 2, getHeight() / 2);
    }

    public float getMaxScale() {
        return this.maxScale;
    }

    public final float getMinScale() {
        return minScale();
    }

    public final int getOrientation() {
        return this.orientation;
    }

    public final void getPanRemaining(RectF rectF) {
        if (isReady()) {
            float sWidth = this.scale * sWidth();
            float sHeight = this.scale * sHeight();
            int i = this.panLimit;
            if (i == 3) {
                rectF.top = Math.max(0.0f, -(this.vTranslate.y - (getHeight() / 2)));
                rectF.left = Math.max(0.0f, -(this.vTranslate.x - (getWidth() / 2)));
                rectF.bottom = Math.max(0.0f, this.vTranslate.y - ((getHeight() / 2) - sHeight));
                rectF.right = Math.max(0.0f, this.vTranslate.x - ((getWidth() / 2) - sWidth));
                return;
            }
            PointF pointF = this.vTranslate;
            if (i == 2) {
                rectF.top = Math.max(0.0f, -(pointF.y - getHeight()));
                rectF.left = Math.max(0.0f, -(this.vTranslate.x - getWidth()));
                rectF.bottom = Math.max(0.0f, this.vTranslate.y + sHeight);
                rectF.right = Math.max(0.0f, this.vTranslate.x + sWidth);
                return;
            }
            rectF.top = Math.max(0.0f, -pointF.y);
            rectF.left = Math.max(0.0f, -this.vTranslate.x);
            rectF.bottom = Math.max(0.0f, (sHeight + this.vTranslate.y) - getHeight());
            rectF.right = Math.max(0.0f, (sWidth + this.vTranslate.x) - getWidth());
        }
    }

    public final int getSHeight() {
        return this.sHeight;
    }

    public final int getSWidth() {
        return this.sWidth;
    }

    public final float getScale() {
        return this.scale;
    }

    public final ImageViewState getState() {
        if (this.vTranslate == null || this.sWidth <= 0 || this.sHeight <= 0) {
            return null;
        }
        return new ImageViewState(getScale(), getCenter(), getOrientation());
    }

    public boolean hasImage() {
        return (this.uri == null && this.bitmap == null) ? false : true;
    }

    public final boolean isImageLoaded() {
        return this.imageLoadedSent;
    }

    public final boolean isPanEnabled() {
        return this.panEnabled;
    }

    public final boolean isQuickScaleEnabled() {
        return this.quickScaleEnabled;
    }

    public final boolean isReady() {
        return this.readySent;
    }

    public final boolean isZoomEnabled() {
        return this.zoomEnabled;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00f5  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onDraw(Canvas canvas) {
        int i;
        float f;
        d dVar;
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        super.onDraw(canvas);
        createPaints();
        if (this.sWidth == 0 || this.sHeight == 0 || getWidth() == 0 || getHeight() == 0) {
            return;
        }
        if (this.tileMap == null && this.decoder != null) {
            initialiseBaseLayer(getMaxBitmapDimensions(canvas));
        }
        if (checkReady()) {
            preDraw();
            a aVar = this.anim;
            if (aVar != null && aVar.f != null) {
                float f2 = this.scale;
                if (this.vTranslateBefore == null) {
                    this.vTranslateBefore = new PointF(0.0f, 0.0f);
                }
                this.vTranslateBefore.set(this.vTranslate);
                long currentTimeMillis = System.currentTimeMillis();
                a aVar2 = this.anim;
                long j = currentTimeMillis - aVar2.l;
                long j2 = aVar2.h;
                boolean z2 = j > j2;
                long min = Math.min(j, j2);
                a aVar3 = this.anim;
                int i6 = aVar3.j;
                float f3 = aVar3.a;
                this.scale = ease(i6, min, f3, aVar3.b - f3, aVar3.h);
                a aVar4 = this.anim;
                int i7 = aVar4.j;
                float f4 = aVar4.f.x;
                float ease = ease(i7, min, f4, aVar4.g.x - f4, aVar4.h);
                a aVar5 = this.anim;
                int i8 = aVar5.j;
                float f5 = aVar5.f.y;
                float ease2 = ease(i8, min, f5, aVar5.g.y - f5, aVar5.h);
                this.vTranslate.x -= sourceToViewX(this.anim.d.x) - ease;
                this.vTranslate.y -= sourceToViewY(this.anim.d.y) - ease2;
                if (!z2) {
                    a aVar6 = this.anim;
                    if (aVar6.a != aVar6.b) {
                        z = false;
                        fitToBounds(z);
                        sendStateChanged(f2, this.vTranslateBefore, this.anim.k);
                        refreshRequiredTiles(z2);
                        if (z2) {
                            this.anim.getClass();
                            this.anim = null;
                        }
                        invalidate();
                    }
                }
                z = true;
                fitToBounds(z);
                sendStateChanged(f2, this.vTranslateBefore, this.anim.k);
                refreshRequiredTiles(z2);
                if (z2) {
                }
                invalidate();
            }
            Map<Integer, List<d>> map = this.tileMap;
            int i9 = ORIENTATION_180;
            int i10 = 90;
            int i11 = 5;
            if (map == null || !isBaseLayerReady()) {
                i = 5;
                if (this.bitmap != null) {
                    float f6 = this.scale;
                    if (this.bitmapIsPreview) {
                        f6 *= this.sWidth / r3.getWidth();
                        f = this.scale * (this.sHeight / this.bitmap.getHeight());
                    } else {
                        f = f6;
                    }
                    if (this.matrix == null) {
                        this.matrix = new Matrix();
                    }
                    this.matrix.reset();
                    this.matrix.postScale(f6, f);
                    this.matrix.postRotate(getRequiredRotation());
                    Matrix matrix = this.matrix;
                    PointF pointF = this.vTranslate;
                    matrix.postTranslate(pointF.x, pointF.y);
                    if (getRequiredRotation() == 180) {
                        Matrix matrix2 = this.matrix;
                        float f7 = this.scale;
                        matrix2.postTranslate(this.sWidth * f7, f7 * this.sHeight);
                    } else if (getRequiredRotation() == 90) {
                        this.matrix.postTranslate(this.scale * this.sHeight, 0.0f);
                    } else if (getRequiredRotation() == 270) {
                        this.matrix.postTranslate(0.0f, this.scale * this.sWidth);
                    }
                    if (this.tileBgPaint != null) {
                        if (this.sRect == null) {
                            this.sRect = new RectF();
                        }
                        this.sRect.set(0.0f, 0.0f, this.bitmapIsPreview ? this.bitmap.getWidth() : this.sWidth, this.bitmapIsPreview ? this.bitmap.getHeight() : this.sHeight);
                        this.matrix.mapRect(this.sRect);
                        canvas.drawRect(this.sRect, this.tileBgPaint);
                    }
                    canvas.drawBitmap(this.bitmap, this.matrix, this.bitmapPaint);
                }
            } else {
                int min2 = Math.min(this.fullImageSampleSize, calculateInSampleSize(this.scale));
                boolean z3 = false;
                for (Map.Entry<Integer, List<d>> entry : this.tileMap.entrySet()) {
                    if (entry.getKey().intValue() == min2) {
                        for (d dVar2 : entry.getValue()) {
                            if (dVar2.e && (dVar2.d || dVar2.c == null)) {
                                z3 = true;
                            }
                        }
                    }
                }
                for (Map.Entry<Integer, List<d>> entry2 : this.tileMap.entrySet()) {
                    if (entry2.getKey().intValue() == min2 || z3) {
                        for (d dVar3 : entry2.getValue()) {
                            sourceToViewRect(dVar3.a, dVar3.f);
                            boolean z4 = dVar3.d;
                            if (z4 || dVar3.c == null) {
                                dVar = dVar3;
                                i2 = i10;
                                i3 = min2;
                                i4 = i9;
                                if (z4 && this.debug) {
                                    i5 = 5;
                                    canvas.drawText("LOADING", dVar.f.left + px(5), dVar.f.top + px(35), this.debugTextPaint);
                                    if (dVar.e && this.debug) {
                                        canvas.drawText("ISS " + dVar.b + " RECT " + dVar.a.top + "," + dVar.a.left + "," + dVar.a.bottom + "," + dVar.a.right, dVar.f.left + px(i5), dVar.f.top + px(15), this.debugTextPaint);
                                    }
                                    i11 = i5;
                                    i9 = i4;
                                    i10 = i2;
                                    min2 = i3;
                                }
                            } else {
                                Paint paint = this.tileBgPaint;
                                if (paint != null) {
                                    canvas.drawRect(dVar3.f, paint);
                                }
                                if (this.matrix == null) {
                                    this.matrix = new Matrix();
                                }
                                this.matrix.reset();
                                i3 = min2;
                                i4 = i9;
                                i2 = i10;
                                dVar = dVar3;
                                setMatrixArray(this.srcArray, 0.0f, 0.0f, dVar3.c.getWidth(), 0.0f, dVar3.c.getWidth(), dVar3.c.getHeight(), 0.0f, dVar3.c.getHeight());
                                if (getRequiredRotation() == 0) {
                                    float[] fArr = this.dstArray;
                                    Rect rect = dVar.f;
                                    float f8 = rect.left;
                                    float f9 = rect.top;
                                    float f10 = rect.right;
                                    float f11 = rect.bottom;
                                    setMatrixArray(fArr, f8, f9, f10, f9, f10, f11, f8, f11);
                                } else if (getRequiredRotation() == i2) {
                                    float[] fArr2 = this.dstArray;
                                    Rect rect2 = dVar.f;
                                    float f12 = rect2.right;
                                    float f13 = rect2.top;
                                    float f14 = rect2.bottom;
                                    float f15 = rect2.left;
                                    setMatrixArray(fArr2, f12, f13, f12, f14, f15, f14, f15, f13);
                                } else if (getRequiredRotation() == i4) {
                                    float[] fArr3 = this.dstArray;
                                    Rect rect3 = dVar.f;
                                    float f16 = rect3.right;
                                    float f17 = rect3.bottom;
                                    float f18 = rect3.left;
                                    float f19 = rect3.top;
                                    setMatrixArray(fArr3, f16, f17, f18, f17, f18, f19, f16, f19);
                                } else if (getRequiredRotation() == 270) {
                                    float[] fArr4 = this.dstArray;
                                    Rect rect4 = dVar.f;
                                    float f20 = rect4.left;
                                    float f21 = rect4.bottom;
                                    float f22 = rect4.top;
                                    float f23 = rect4.right;
                                    setMatrixArray(fArr4, f20, f21, f20, f22, f23, f22, f23, f21);
                                }
                                this.matrix.setPolyToPoly(this.srcArray, 0, this.dstArray, 0, 4);
                                canvas.drawBitmap(dVar.c, this.matrix, this.bitmapPaint);
                                if (this.debug) {
                                    canvas.drawRect(dVar.f, this.debugLinePaint);
                                }
                            }
                            i5 = 5;
                            if (dVar.e) {
                                canvas.drawText("ISS " + dVar.b + " RECT " + dVar.a.top + "," + dVar.a.left + "," + dVar.a.bottom + "," + dVar.a.right, dVar.f.left + px(i5), dVar.f.top + px(15), this.debugTextPaint);
                            }
                            i11 = i5;
                            i9 = i4;
                            i10 = i2;
                            min2 = i3;
                        }
                    }
                    i11 = i11;
                    i9 = i9;
                    i10 = i10;
                    min2 = min2;
                }
                i = i11;
            }
            if (this.debug) {
                StringBuilder sb = new StringBuilder("Scale: ");
                Locale locale = Locale.ENGLISH;
                sb.append(String.format(locale, "%.2f", Float.valueOf(this.scale)));
                sb.append(Extension.O_BRAKE_SPACE);
                sb.append(String.format(locale, "%.2f", Float.valueOf(minScale())));
                sb.append(" - ");
                sb.append(String.format(locale, "%.2f", Float.valueOf(this.maxScale)));
                sb.append(Extension.C_BRAKE);
                canvas.drawText(sb.toString(), px(i), px(15), this.debugTextPaint);
                canvas.drawText("Translate: " + String.format(locale, "%.2f", Float.valueOf(this.vTranslate.x)) + ":" + String.format(locale, "%.2f", Float.valueOf(this.vTranslate.y)), px(i), px(30), this.debugTextPaint);
                PointF center = getCenter();
                canvas.drawText("Source center: " + String.format(locale, "%.2f", Float.valueOf(center.x)) + ":" + String.format(locale, "%.2f", Float.valueOf(center.y)), px(i), px(45), this.debugTextPaint);
                a aVar7 = this.anim;
                if (aVar7 != null) {
                    PointF sourceToViewCoord = sourceToViewCoord(aVar7.c);
                    PointF sourceToViewCoord2 = sourceToViewCoord(this.anim.e);
                    PointF sourceToViewCoord3 = sourceToViewCoord(this.anim.d);
                    canvas.drawCircle(sourceToViewCoord.x, sourceToViewCoord.y, px(10), this.debugLinePaint);
                    this.debugLinePaint.setColor(-65536);
                    canvas.drawCircle(sourceToViewCoord2.x, sourceToViewCoord2.y, px(20), this.debugLinePaint);
                    this.debugLinePaint.setColor(-16776961);
                    canvas.drawCircle(sourceToViewCoord3.x, sourceToViewCoord3.y, px(25), this.debugLinePaint);
                    this.debugLinePaint.setColor(-16711681);
                    canvas.drawCircle(getWidth() / 2, getHeight() / 2, px(30), this.debugLinePaint);
                }
                if (this.vCenterStart != null) {
                    this.debugLinePaint.setColor(-65536);
                    PointF pointF2 = this.vCenterStart;
                    canvas.drawCircle(pointF2.x, pointF2.y, px(20), this.debugLinePaint);
                }
                if (this.quickScaleSCenter != null) {
                    this.debugLinePaint.setColor(-16776961);
                    canvas.drawCircle(sourceToViewX(this.quickScaleSCenter.x), sourceToViewY(this.quickScaleSCenter.y), px(35), this.debugLinePaint);
                }
                if (this.quickScaleVStart != null && this.isQuickScaling) {
                    this.debugLinePaint.setColor(-16711681);
                    PointF pointF3 = this.quickScaleVStart;
                    canvas.drawCircle(pointF3.x, pointF3.y, px(30), this.debugLinePaint);
                }
                this.debugLinePaint.setColor(-65281);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        boolean z = mode != 1073741824;
        boolean z2 = mode2 != 1073741824;
        if (this.sWidth > 0 && this.sHeight > 0) {
            if (z && z2) {
                size = sWidth();
                size2 = sHeight();
            } else if (z2) {
                size2 = (int) ((sHeight() / sWidth()) * size);
            } else if (z) {
                size = (int) ((sWidth() / sHeight()) * size2);
            }
        }
        setMeasuredDimension(Math.max(size, getSuggestedMinimumWidth()), Math.max(size2, getSuggestedMinimumHeight()));
    }

    public void onReady() {
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        debug("onSizeChanged %dx%d -> %dx%d", Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i), Integer.valueOf(i2));
        PointF center = getCenter();
        if (!this.readySent || center == null) {
            return;
        }
        this.anim = null;
        this.pendingScale = Float.valueOf(this.scale);
        this.sPendingCenter = center;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        GestureDetector gestureDetector;
        a aVar = this.anim;
        if (aVar != null && !aVar.i) {
            requestDisallowInterceptTouchEvent(true);
            return true;
        }
        this.anim = null;
        if (this.vTranslate == null) {
            GestureDetector gestureDetector2 = this.singleDetector;
            if (gestureDetector2 != null) {
                gestureDetector2.onTouchEvent(motionEvent);
                return true;
            }
        } else {
            if (!this.isQuickScaling && ((gestureDetector = this.detector) == null || gestureDetector.onTouchEvent(motionEvent))) {
                this.isZooming = false;
                this.isPanning = false;
                this.maxTouchCount = 0;
                return true;
            }
            if (this.vTranslateStart == null) {
                this.vTranslateStart = new PointF(0.0f, 0.0f);
            }
            if (this.vTranslateBefore == null) {
                this.vTranslateBefore = new PointF(0.0f, 0.0f);
            }
            if (this.vCenterStart == null) {
                this.vCenterStart = new PointF(0.0f, 0.0f);
            }
            float f = this.scale;
            this.vTranslateBefore.set(this.vTranslate);
            boolean onTouchEventInternal = onTouchEventInternal(motionEvent);
            sendStateChanged(f, this.vTranslateBefore, 2);
            if (!onTouchEventInternal && !super.onTouchEvent(motionEvent)) {
                return false;
            }
        }
        return true;
    }

    public void recycle() {
        reset(true);
        this.bitmapPaint = null;
        this.debugTextPaint = null;
        this.debugLinePaint = null;
        this.tileBgPaint = null;
    }

    public final void resetScaleAndCenter() {
        this.anim = null;
        this.pendingScale = Float.valueOf(limitedScale(0.0f));
        if (isReady()) {
            this.sPendingCenter = new PointF(sWidth() / 2, sHeight() / 2);
        } else {
            this.sPendingCenter = new PointF(0.0f, 0.0f);
        }
        invalidate();
    }

    public final void setBitmapDecoderClass(Class<? extends SkiaImageDecoder> cls) {
        if (cls != null) {
            this.bitmapDecoderFactory = new swc(0, cls);
        } else {
            ny61.g("Decoder class cannot be set to null");
        }
    }

    public final void setBitmapDecoderFactory(myg mygVar) {
        if (mygVar != null) {
            this.bitmapDecoderFactory = mygVar;
        } else {
            ny61.g("Decoder factory cannot be set to null");
        }
    }

    public final void setDebug(boolean z) {
        this.debug = z;
    }

    public final void setDoubleTapZoomDpi(int i) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        setDoubleTapZoomScale(((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f) / i);
    }

    public final void setDoubleTapZoomDuration(int i) {
        this.doubleTapZoomDuration = Math.max(0, i);
    }

    public final void setDoubleTapZoomScale(float f) {
        this.doubleTapZoomScale = f;
    }

    public final void setDoubleTapZoomStyle(int i) {
        if (VALID_ZOOM_STYLES.contains(Integer.valueOf(i))) {
            this.doubleTapZoomStyle = i;
        } else {
            ny61.g(oyr.i(i, "Invalid zoom style: "));
        }
    }

    public void setEagerLoadingEnabled(boolean z) {
        this.eagerLoadingEnabled = z;
    }

    public void setExecutor(Executor executor) {
        if (executor != null) {
            this.executor = executor;
        } else {
            ny61.t("Executor must not be null");
        }
    }

    public final void setHasBaseLayerTiles(boolean z) {
        this.hasBaseLayerTiles = z;
    }

    public final void setImage(yev yevVar, yev yevVar2, ImageViewState imageViewState) {
        if (yevVar == null) {
            ny61.t("imageSource must not be null");
            return;
        }
        Integer num = yevVar.b;
        reset(true);
        if (imageViewState != null) {
            restoreState(imageViewState);
        }
        if (yevVar2 != null) {
            ny61.g("Preview image cannot be used unless dimensions are provided for the main image");
            return;
        }
        this.sRegion = null;
        Uri uri = yevVar.a;
        this.uri = uri;
        if (uri == null && num != null) {
            this.uri = Uri.parse("android.resource://" + getContext().getPackageName() + "/" + num);
        }
        if (yevVar.c || this.sRegion != null) {
            execute(new TilesInitTask(this, getContext(), this.regionDecoderFactory, this.uri));
        } else {
            execute(new BitmapLoadTask(this, getContext(), this.bitmapDecoderFactory, this.uri, false));
        }
    }

    public final void setMaxScale(float f) {
        this.maxScale = f;
    }

    public void setMaxTileSize(int i) {
        this.maxTileWidth = i;
        this.maxTileHeight = i;
    }

    public final void setMaximumDpi(int i) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        setMinScale(((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f) / i);
    }

    public final void setMinScale(float f) {
        this.minScale = f;
    }

    public final void setMinimumDpi(int i) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        setMaxScale(((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f) / i);
    }

    public final void setMinimumScaleType(int i) {
        if (!VALID_SCALE_TYPES.contains(Integer.valueOf(i))) {
            ny61.g(oyr.i(i, "Invalid scale type: "));
            return;
        }
        this.minimumScaleType = i;
        if (isReady()) {
            fitToBounds(true);
            invalidate();
        }
    }

    public void setMinimumTileDpi(int i) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.minimumTileDpi = (int) Math.min((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f, i);
        if (isReady()) {
            reset(false);
            invalidate();
        }
    }

    public void setOnImageEventListener(izu0 izu0Var) {
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.onLongClickListener = onLongClickListener;
    }

    public void setOnStateChangedListener(jzu0 jzu0Var) {
    }

    public final void setOrientation(int i) {
        if (!VALID_ORIENTATIONS.contains(Integer.valueOf(i))) {
            ny61.g(oyr.i(i, "Invalid orientation: "));
            return;
        }
        this.orientation = i;
        reset(false);
        invalidate();
        requestLayout();
    }

    public final void setPanEnabled(boolean z) {
        PointF pointF;
        this.panEnabled = z;
        if (z || (pointF = this.vTranslate) == null) {
            return;
        }
        pointF.x = (getWidth() / 2) - (this.scale * (sWidth() / 2));
        this.vTranslate.y = (getHeight() / 2) - (this.scale * (sHeight() / 2));
        if (isReady()) {
            refreshRequiredTiles(true);
            invalidate();
        }
    }

    public final void setPanLimit(int i) {
        if (!VALID_PAN_LIMITS.contains(Integer.valueOf(i))) {
            ny61.g(oyr.i(i, "Invalid pan limit: "));
            return;
        }
        this.panLimit = i;
        if (isReady()) {
            fitToBounds(true);
            invalidate();
        }
    }

    public final void setQuickScaleEnabled(boolean z) {
        this.quickScaleEnabled = z;
    }

    public final void setRegionDecoderClass(Class<? extends sdv> cls) {
        if (cls != null) {
            this.regionDecoderFactory = new swc(0, cls);
        } else {
            ny61.g("Decoder class cannot be set to null");
        }
    }

    public final void setRegionDecoderFactory(myg mygVar) {
        if (mygVar != null) {
            this.regionDecoderFactory = mygVar;
        } else {
            ny61.g("Decoder factory cannot be set to null");
        }
    }

    public final void setScaleAndCenter(float f, PointF pointF) {
        this.anim = null;
        this.pendingScale = Float.valueOf(f);
        this.sPendingCenter = pointF;
        this.sRequestedCenter = pointF;
        invalidate();
    }

    public final void setTileBackgroundColor(int i) {
        if (Color.alpha(i) == 0) {
            this.tileBgPaint = null;
        } else {
            Paint paint = new Paint();
            this.tileBgPaint = paint;
            paint.setStyle(Paint.Style.FILL);
            this.tileBgPaint.setColor(i);
        }
        invalidate();
    }

    public final void setZoomEnabled(boolean z) {
        this.zoomEnabled = z;
    }

    public final PointF sourceToViewCoord(float f, float f2, PointF pointF) {
        if (this.vTranslate == null) {
            return null;
        }
        pointF.set(sourceToViewX(f), sourceToViewY(f2));
        return pointF;
    }

    public void viewToFileRect(Rect rect, Rect rect2) {
        if (this.vTranslate == null || !this.readySent) {
            return;
        }
        rect2.set((int) viewToSourceX(rect.left), (int) viewToSourceY(rect.top), (int) viewToSourceX(rect.right), (int) viewToSourceY(rect.bottom));
        fileSRect(rect2, rect2);
        rect2.set(Math.max(0, rect2.left), Math.max(0, rect2.top), Math.min(this.sWidth, rect2.right), Math.min(this.sHeight, rect2.bottom));
        Rect rect3 = this.sRegion;
        if (rect3 != null) {
            rect2.offset(rect3.left, rect3.top);
        }
    }

    public final PointF viewToSourceCoord(float f, float f2, PointF pointF) {
        if (this.vTranslate == null) {
            return null;
        }
        pointF.set(viewToSourceX(f), viewToSourceY(f2));
        return pointF;
    }

    public void visibleFileRect(Rect rect) {
        if (this.vTranslate == null || !this.readySent) {
            return;
        }
        rect.set(0, 0, getWidth(), getHeight());
        viewToFileRect(rect, rect);
    }

    public void setMaxTileSize(int i, int i2) {
        this.maxTileWidth = i;
        this.maxTileHeight = i2;
    }

    public final PointF sourceToViewCoord(float f, float f2) {
        return sourceToViewCoord(f, f2, new PointF());
    }

    public final PointF viewToSourceCoord(float f, float f2) {
        return viewToSourceCoord(f, f2, new PointF());
    }

    public final PointF sourceToViewCoord(PointF pointF, PointF pointF2) {
        return sourceToViewCoord(pointF.x, pointF.y, pointF2);
    }

    public final PointF viewToSourceCoord(PointF pointF, PointF pointF2) {
        return viewToSourceCoord(pointF.x, pointF.y, pointF2);
    }

    public final PointF sourceToViewCoord(PointF pointF) {
        return sourceToViewCoord(pointF.x, pointF.y, new PointF());
    }

    public final PointF viewToSourceCoord(PointF pointF) {
        return viewToSourceCoord(pointF.x, pointF.y, new PointF());
    }

    public void onImageLoaded() {
    }

    public final void setImage(yev yevVar, ImageViewState imageViewState) {
        setImage(yevVar, null, imageViewState);
    }

    public final void setImage(yev yevVar, yev yevVar2) {
        setImage(yevVar, yevVar2, null);
    }

    public final void setImage(yev yevVar) {
        setImage(yevVar, null, null);
    }

    private void fitToBounds(boolean z) {
        boolean z2;
        if (this.vTranslate == null) {
            this.vTranslate = new PointF(0.0f, 0.0f);
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.satTemp == null) {
            this.satTemp = new c(0.0f, new PointF(0.0f, 0.0f));
        }
        c cVar = this.satTemp;
        cVar.a = this.scale;
        cVar.b.set(this.vTranslate);
        fitToBounds(z, this.satTemp);
        c cVar2 = this.satTemp;
        this.scale = cVar2.a;
        this.vTranslate.set(cVar2.b);
        if (!z2 || this.minimumScaleType == 4) {
            return;
        }
        this.vTranslate.set(vTranslateForSCenter(sWidth() / 2, sHeight() / 2, this.scale));
    }

    public SubsamplingScaleImageView(Context context) {
        this(context, null);
    }
}
