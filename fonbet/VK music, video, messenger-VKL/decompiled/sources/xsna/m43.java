package xsna;

import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import com.vk.dto.photo.Photo;
import com.vk.ecomm.tool.view.feed.ProductsPhotoOverlayView;
import com.vk.feed.tool.view.posting.zoomimage.ZoomImageView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class m43 implements View.OnTouchListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ w8i c;

    public /* synthetic */ m43(w8i w8iVar, int i) {
        this.b = i;
        this.c = w8iVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        m1o m1oVar;
        RectF rectF;
        switch (this.b) {
            case 0:
                ((w43) this.c).e.onTouch(view, motionEvent);
                return false;
            default:
                pha0 pha0Var = (pha0) this.c;
                ProductsPhotoOverlayView productsPhotoOverlayView = pha0Var.b;
                if (motionEvent.getPointerCount() > 1) {
                    ZoomImageView zoomImageView = pha0Var.c;
                    if (zoomImageView != null) {
                        return zoomImageView.dispatchTouchEvent(motionEvent);
                    }
                    return false;
                }
                int action = motionEvent.getAction();
                if (action == 0) {
                    m1o m1oVar2 = pha0Var.p;
                    RectF rectF2 = m1oVar2 != null ? (RectF) m1oVar2.invoke() : null;
                    if (rectF2 == null || !rectF2.contains(motionEvent.getX(), motionEvent.getY())) {
                        pha0Var.m = null;
                        pha0Var.n = null;
                    } else {
                        pha0Var.m = Float.valueOf(motionEvent.getX());
                        pha0Var.n = Float.valueOf(motionEvent.getY());
                    }
                    ZoomImageView zoomImageView2 = pha0Var.c;
                    if (zoomImageView2 != null) {
                        return zoomImageView2.dispatchTouchEvent(motionEvent);
                    }
                    return false;
                }
                if (action == 1) {
                    int i = pha0Var.j;
                    productsPhotoOverlayView.getParent().requestDisallowInterceptTouchEvent(false);
                    Float f = pha0Var.m;
                    Float f2 = pha0Var.n;
                    if (f != null && f2 != null) {
                        float f3 = i;
                        if (Math.abs(f.floatValue() - motionEvent.getX()) < f3 && gq.a(motionEvent, f2.floatValue()) < f3) {
                            via0 via0Var = pha0Var.l;
                            if (via0Var != null) {
                                pha0Var.a(via0Var, motionEvent.getX(), motionEvent.getY());
                                pha0Var.l = null;
                            } else {
                                float x = motionEvent.getX();
                                float y = motionEvent.getY();
                                Photo photo = pha0Var.o;
                                if (photo != null && (m1oVar = pha0Var.p) != null && (rectF = (RectF) m1oVar.invoke()) != null) {
                                    float width = (x - rectF.left) / rectF.width();
                                    float height = (y - rectF.top) / rectF.height();
                                    o0o0 o0o0Var = pha0Var.i;
                                    if (o0o0Var != null) {
                                        o0o0Var.b(photo, width, height);
                                    }
                                }
                                ZoomImageView zoomImageView3 = pha0Var.c;
                                if (zoomImageView3 != null) {
                                    zoomImageView3.dispatchTouchEvent(motionEvent);
                                }
                            }
                        }
                    }
                    ZoomImageView zoomImageView4 = pha0Var.c;
                    if (zoomImageView4 == null) {
                        return false;
                    }
                    zoomImageView4.dispatchTouchEvent(motionEvent);
                    return false;
                }
                if (action != 2) {
                    ZoomImageView zoomImageView5 = pha0Var.c;
                    if (zoomImageView5 != null) {
                        return zoomImageView5.dispatchTouchEvent(motionEvent);
                    }
                    return false;
                }
                via0 via0Var2 = pha0Var.l;
                if (via0Var2 == null) {
                    ZoomImageView zoomImageView6 = pha0Var.c;
                    if (zoomImageView6 != null) {
                        return zoomImageView6.dispatchTouchEvent(motionEvent);
                    }
                    return false;
                }
                pha0Var.m = Float.valueOf(motionEvent.getX());
                pha0Var.n = Float.valueOf(motionEvent.getY());
                pha0Var.a(via0Var2, motionEvent.getX(), motionEvent.getY());
                productsPhotoOverlayView.getParent().requestDisallowInterceptTouchEvent(true);
                return true;
        }
    }
}
