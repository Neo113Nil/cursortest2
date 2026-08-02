package com.yandex.mobile.drive.scan.camerax;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.PixelCopy;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.Window;
import androidx.camera.view.PreviewView;
import com.yandex.mobile.drive.scan.tools.ScanReporter;
import defpackage.dvw;
import defpackage.kol0;
import defpackage.ny61;
import defpackage.tls;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes15.dex */
public abstract class a {
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e5, code lost:
    
        if (r14.invoke(r0) == r1) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x015a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x015b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(PreviewView previewView, Window window, final ScanReporter scanReporter, tls tlsVar, ContinuationImpl continuationImpl) {
        ImageCopyKt$copyImage$1 imageCopyKt$copyImage$1;
        int i;
        final View childAt;
        Rect rect;
        if (continuationImpl instanceof ImageCopyKt$copyImage$1) {
            imageCopyKt$copyImage$1 = (ImageCopyKt$copyImage$1) continuationImpl;
            int i2 = imageCopyKt$copyImage$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                imageCopyKt$copyImage$1.label = i2 - Integer.MIN_VALUE;
                Object obj = imageCopyKt$copyImage$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = imageCopyKt$copyImage$1.label;
                if (i != 0) {
                    b.b(obj);
                    Bitmap bitmap = previewView.getBitmap();
                    if (bitmap != null) {
                        ScanReporter.PhotoSource photoSource = previewView.getImplementationMode() == PreviewView.ImplementationMode.PERFORMANCE ? ScanReporter.PhotoSource.Surface : ScanReporter.PhotoSource.Texture;
                        scanReporter.getClass();
                        ScanReporter.c(photoSource);
                        return bitmap;
                    }
                    childAt = previewView.getChildAt(0);
                    if (childAt == null) {
                        return null;
                    }
                    int[] iArr = new int[2];
                    previewView.getLocationInWindow(iArr);
                    int i3 = iArr[0];
                    rect = new Rect(i3, iArr[1], previewView.getWidth() + i3, previewView.getHeight() + iArr[1]);
                    if (rect.isEmpty()) {
                        ScanReporter.PhotoSource photoSource2 = ScanReporter.PhotoSource.DrawingCache;
                        scanReporter.getClass();
                        ScanReporter.c(photoSource2);
                        return b(childAt);
                    }
                    if (!(childAt instanceof SurfaceView)) {
                        imageCopyKt$copyImage$1.L$0 = previewView;
                        imageCopyKt$copyImage$1.L$1 = window;
                        imageCopyKt$copyImage$1.L$2 = scanReporter;
                        imageCopyKt$copyImage$1.L$3 = null;
                        imageCopyKt$copyImage$1.L$4 = null;
                        imageCopyKt$copyImage$1.L$5 = childAt;
                        imageCopyKt$copyImage$1.L$6 = null;
                        imageCopyKt$copyImage$1.L$7 = rect;
                        imageCopyKt$copyImage$1.label = 1;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b.b(obj);
                        return obj;
                    }
                    Rect rect2 = (Rect) imageCopyKt$copyImage$1.L$7;
                    View view = (View) imageCopyKt$copyImage$1.L$5;
                    scanReporter = (ScanReporter) imageCopyKt$copyImage$1.L$2;
                    Window window2 = (Window) imageCopyKt$copyImage$1.L$1;
                    PreviewView previewView2 = (PreviewView) imageCopyKt$copyImage$1.L$0;
                    b.b(obj);
                    rect = rect2;
                    previewView = previewView2;
                    childAt = view;
                    window = window2;
                }
                imageCopyKt$copyImage$1.L$0 = previewView;
                imageCopyKt$copyImage$1.L$1 = window;
                imageCopyKt$copyImage$1.L$2 = scanReporter;
                imageCopyKt$copyImage$1.L$3 = null;
                imageCopyKt$copyImage$1.L$4 = null;
                imageCopyKt$copyImage$1.L$5 = childAt;
                imageCopyKt$copyImage$1.L$6 = null;
                imageCopyKt$copyImage$1.L$7 = rect;
                imageCopyKt$copyImage$1.label = 2;
                final kol0 kol0Var = new kol0(dvw.b(imageCopyKt$copyImage$1));
                final Bitmap createBitmap = Bitmap.createBitmap(previewView.getWidth(), previewView.getHeight(), Bitmap.Config.RGB_565);
                PixelCopy.OnPixelCopyFinishedListener onPixelCopyFinishedListener = new PixelCopy.OnPixelCopyFinishedListener() { // from class: com.yandex.mobile.drive.scan.camerax.ImageCopyKt$copyImage$2$copyFinishedListener$1
                    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                    public final void onPixelCopyFinished(int i4) {
                        ScanReporter scanReporter2 = ScanReporter.this;
                        if (i4 == 0) {
                            ScanReporter.PhotoSource photoSource3 = ScanReporter.PhotoSource.Screenshot;
                            scanReporter2.getClass();
                            ScanReporter.c(photoSource3);
                            kol0Var.resumeWith(createBitmap);
                            return;
                        }
                        ScanReporter.PhotoSource photoSource4 = ScanReporter.PhotoSource.DrawingCache;
                        scanReporter2.getClass();
                        ScanReporter.c(photoSource4);
                        kol0Var.resumeWith(a.b(childAt));
                    }
                };
                if (childAt instanceof SurfaceView) {
                    PixelCopy.request(window, rect, createBitmap, onPixelCopyFinishedListener, new Handler(Looper.getMainLooper()));
                } else {
                    SurfaceView surfaceView = (SurfaceView) childAt;
                    if (surfaceView.getHolder().getSurface().isValid()) {
                        PixelCopy.request(surfaceView, rect, createBitmap, onPixelCopyFinishedListener, new Handler(Looper.getMainLooper()));
                    } else {
                        ScanReporter.PhotoSource photoSource3 = ScanReporter.PhotoSource.DrawingCache;
                        scanReporter.getClass();
                        ScanReporter.c(photoSource3);
                        kol0Var.resumeWith(b(childAt));
                    }
                }
                Object a = kol0Var.a();
                return a != obj2 ? obj2 : a;
            }
        }
        imageCopyKt$copyImage$1 = new ImageCopyKt$copyImage$1(continuationImpl);
        Object obj3 = imageCopyKt$copyImage$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = imageCopyKt$copyImage$1.label;
        if (i != 0) {
        }
        imageCopyKt$copyImage$1.L$0 = previewView;
        imageCopyKt$copyImage$1.L$1 = window;
        imageCopyKt$copyImage$1.L$2 = scanReporter;
        imageCopyKt$copyImage$1.L$3 = null;
        imageCopyKt$copyImage$1.L$4 = null;
        imageCopyKt$copyImage$1.L$5 = childAt;
        imageCopyKt$copyImage$1.L$6 = null;
        imageCopyKt$copyImage$1.L$7 = rect;
        imageCopyKt$copyImage$1.label = 2;
        final Continuation<? super Bitmap> kol0Var2 = new kol0(dvw.b(imageCopyKt$copyImage$1));
        final Bitmap createBitmap2 = Bitmap.createBitmap(previewView.getWidth(), previewView.getHeight(), Bitmap.Config.RGB_565);
        PixelCopy.OnPixelCopyFinishedListener onPixelCopyFinishedListener2 = new PixelCopy.OnPixelCopyFinishedListener() { // from class: com.yandex.mobile.drive.scan.camerax.ImageCopyKt$copyImage$2$copyFinishedListener$1
            @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
            public final void onPixelCopyFinished(int i4) {
                ScanReporter scanReporter2 = ScanReporter.this;
                if (i4 == 0) {
                    ScanReporter.PhotoSource photoSource32 = ScanReporter.PhotoSource.Screenshot;
                    scanReporter2.getClass();
                    ScanReporter.c(photoSource32);
                    kol0Var2.resumeWith(createBitmap2);
                    return;
                }
                ScanReporter.PhotoSource photoSource4 = ScanReporter.PhotoSource.DrawingCache;
                scanReporter2.getClass();
                ScanReporter.c(photoSource4);
                kol0Var2.resumeWith(a.b(childAt));
            }
        };
        if (childAt instanceof SurfaceView) {
        }
        Object a2 = kol0Var2.a();
        if (a2 != obj22) {
        }
    }

    public static final Bitmap b(View view) {
        Bitmap bitmap;
        if ((view instanceof TextureView) && (bitmap = ((TextureView) view).getBitmap()) != null) {
            return bitmap;
        }
        view.buildDrawingCache();
        Bitmap createBitmap = Bitmap.createBitmap(view.getDrawingCache());
        view.destroyDrawingCache();
        return createBitmap;
    }
}
