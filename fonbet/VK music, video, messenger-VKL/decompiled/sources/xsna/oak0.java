package xsna;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.PixelCopy;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import kotlin.Result;
import kotlin.jvm.internal.PropertyReference0Impl;

/* compiled from: snapshot.kt */
/* loaded from: classes4.dex */
public final class oak0 {
    public static final /* synthetic */ qcy<Object>[] a;
    public static final xqo0 b;
    public static final xqo0 c;
    public static final Handler d;

    static {
        PropertyReference0Impl propertyReference0Impl = new PropertyReference0Impl(oak0.class, "reusableArray", "getReusableArray()[I");
        fpf0.a.getClass();
        a = new qcy[]{propertyReference0Impl, new PropertyReference0Impl(oak0.class, "reusableRect", "getReusableRect()Landroid/graphics/Rect;")};
        b = new xqo0(new d14(26));
        c = new xqo0(new w2a0(8));
        d = new Handler(Looper.getMainLooper());
    }

    public static final void a(View view, int i, int i2, Canvas canvas) {
        if (view.getVisibility() == 0) {
            if (view instanceof TextureView) {
                view.getLocationInWindow(b());
                Bitmap bitmap = ((TextureView) view).getBitmap();
                if (bitmap != null) {
                    canvas.save();
                    canvas.drawBitmap(bitmap, rl3.K(b()) - i, rl3.a0(b()) - i2, (Paint) null);
                    canvas.restore();
                    bitmap.recycle();
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    a(viewGroup.getChildAt(i3), i, i2, canvas);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final int[] b() {
        qcy<Object> qcyVar = a[0];
        return (int[]) b.b.get();
    }

    public static final Bitmap c(View view) {
        int layerType = view.getLayerType();
        Bitmap b2 = n3p.b(view.getWidth(), view.getHeight());
        Canvas canvas = new Canvas(b2);
        view.setLayerType(0, null);
        view.invalidate();
        view.draw(canvas);
        view.getLocationInWindow(b());
        a(view, rl3.K(b()), rl3.a0(b()), canvas);
        view.setLayerType(layerType, null);
        return b2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(final View view, n4p n4pVar, final izs<? super Bitmap, s3q0> izsVar) {
        Object failure;
        Window e = fyt0.e(view, n4pVar);
        if (e == null) {
            izsVar.invoke(c(view));
            return;
        }
        final Bitmap b2 = n3p.b(view.getWidth(), view.getHeight());
        try {
            view.getLocationInWindow(b());
            int[] b3 = b();
            int i = b3[0];
            int i2 = b3[1];
            xqo0 xqo0Var = c;
            qcy<Object>[] qcyVarArr = a;
            qcy<Object> qcyVar = qcyVarArr[1];
            ((Rect) xqo0Var.b.get()).set(i, i2, view.getWidth() + i, view.getHeight() + i2);
            qcy<Object> qcyVar2 = qcyVarArr[1];
            PixelCopy.request(e, (Rect) xqo0Var.b.get(), b2, new PixelCopy.OnPixelCopyFinishedListener() { // from class: xsna.mak0
                @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                public final void onPixelCopyFinished(int i3) {
                    izs izsVar2 = izs.this;
                    Bitmap bitmap = b2;
                    if (i3 == 0) {
                        izsVar2.invoke(bitmap);
                    } else {
                        bitmap.recycle();
                        izsVar2.invoke(oak0.c(view));
                    }
                }
            }, d);
            failure = s3q0.a;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            b2.recycle();
            izsVar.invoke(c(view));
        }
    }
}
