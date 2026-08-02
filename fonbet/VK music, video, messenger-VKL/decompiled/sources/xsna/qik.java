package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.photo.ImageCropData;
import com.vk.newsfeed.common.recycler.holders.zhukov.CropZoomGestureRecognizer;
import com.vk.newsfeed.common.recycler.holders.zhukov.a;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.PhotoAttachment;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: CropableImageView.kt */
/* loaded from: classes4.dex */
public final class qik extends AppCompatImageView {
    public PhotoAttachment b;
    public final com.vk.newsfeed.common.recycler.holders.zhukov.a c;
    public a d;
    public boolean e;
    public gzs<s3q0> f;
    public boolean g;
    public final int h;
    public long i;
    public boolean j;

    /* compiled from: CropableImageView.kt */
    public interface a {
        void a(PhotoAttachment photoAttachment);

        void b(ImageCropData imageCropData);

        void c(String str);

        void d(String str);
    }

    public qik(Context context) {
        super(context, null, 0);
        int i = 0;
        this.c = new com.vk.newsfeed.common.recycler.holders.zhukov.a(this, new com.vk.repository.internal.repos.stickers.suggests.a(1, this, qik.class, "updateCropTransformIfNeed", "updateCropTransformIfNeed(Lcom/vk/dto/photo/ImageCropData;)V", i, 6), new ax0(0, this, qik.class, "sendGestureEvent", "sendGestureEvent()V", i, 1));
        this.h = ViewConfiguration.getLongPressTimeout();
        setBackgroundColor(dhr0.t.c(R.attr.vk_ui_background_secondary));
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    public final void U(Bitmap bitmap, boolean z) {
        PhotoAttachment photoAttachment;
        a aVar;
        setImageBitmap(bitmap);
        this.j = z;
        com.vk.newsfeed.common.recycler.holders.zhukov.a aVar2 = this.c;
        aVar2.p = z;
        aVar2.i = bitmap;
        aVar2.e();
        if (!z || (photoAttachment = this.b) == null || (aVar = this.d) == null) {
            return;
        }
        aVar.d(photoAttachment.Hb());
    }

    @Override // android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        super.dispatchTouchEvent(motionEvent);
        return this.e && this.j;
    }

    public final boolean getHasMoreVerticalSpace() {
        return this.c.r;
    }

    public final PhotoAttachment getPhotoAttachment() {
        return this.b;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        gzs<s3q0> gzsVar = this.f;
        if (gzsVar != null) {
            gzsVar.invoke();
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        com.vk.newsfeed.common.recycler.holders.zhukov.a aVar = this.c;
        aVar.j.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i, i2);
        aVar.e();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        long j;
        a aVar;
        Matrix matrix;
        int actionMasked = motionEvent.getActionMasked();
        com.vk.newsfeed.common.recycler.holders.zhukov.a aVar2 = this.c;
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                if (this.i <= 0 || System.currentTimeMillis() - this.i >= this.h) {
                    qik qikVar = aVar2.a;
                    RectF rectF = aVar2.j;
                    Matrix matrix2 = aVar2.g;
                    CropZoomGestureRecognizer cropZoomGestureRecognizer = aVar2.k;
                    CropZoomGestureRecognizer.InteractionType interactionType = cropZoomGestureRecognizer.a;
                    if (interactionType != null) {
                        RectF a2 = aVar2.a();
                        float f = a2.top;
                        float f2 = rectF.top;
                        float f3 = f < f2 ? 0.0f : -Math.abs(f2 - f);
                        float f4 = a2.bottom;
                        float f5 = rectF.bottom;
                        float abs = f4 > f5 ? 0.0f : Math.abs(f5 - f4);
                        float f6 = a2.left;
                        float f7 = rectF.left;
                        float f8 = f6 < f7 ? 0.0f : -Math.abs(f7 - f6);
                        float f9 = a2.right;
                        float f10 = rectF.right;
                        float abs2 = f9 > f10 ? 0.0f : Math.abs(f10 - f9);
                        if (f3 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || abs != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f8 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || abs2 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            float f11 = f8 + abs2;
                            float f12 = f3 + abs;
                            if (interactionType == CropZoomGestureRecognizer.InteractionType.SCALING) {
                                aVar2.c(true);
                            } else {
                                matrix2.postTranslate(f11, f12);
                                aVar2.d(qikVar, matrix2, new bih(aVar2, 9));
                            }
                            vvr0.d();
                        }
                        float[] fArr = aVar2.o;
                        matrix2.getValues(fArr);
                        float f13 = fArr[0];
                        int min = Math.min((int) Math.floor(rectF.width() / f13), (int) Math.floor(rectF.height() / f13));
                        if (min < 100) {
                            float f14 = min / 100.0f;
                            float f15 = 2;
                            matrix2.postScale(f14, f14, rectF.width() / f15, rectF.height() / f15);
                            RectF a3 = aVar2.a();
                            if (a3.top >= rectF.top || a3.bottom <= rectF.bottom || a3.left >= rectF.left || a3.right <= rectF.right) {
                                aVar2.c(false);
                            } else {
                                qikVar.setImageMatrix(matrix2);
                            }
                            for (int i = 0; i < 2; i++) {
                                vvr0.c();
                            }
                        }
                        aVar2.b();
                    }
                    j = 0;
                    cropZoomGestureRecognizer.b = 0L;
                    cropZoomGestureRecognizer.a = null;
                    cropZoomGestureRecognizer.c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    cropZoomGestureRecognizer.d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                } else {
                    PhotoAttachment photoAttachment = this.b;
                    if (photoAttachment != null && (aVar = this.d) != null) {
                        aVar.a(photoAttachment);
                    }
                    j = 0;
                }
                this.i = j;
                return true;
            }
            if (actionMasked == 2) {
                qik qikVar2 = aVar2.a;
                PointF pointF = aVar2.m;
                PointF pointF2 = aVar2.l;
                Matrix matrix3 = aVar2.f;
                Matrix matrix4 = aVar2.g;
                PointF pointF3 = aVar2.d;
                PointF pointF4 = aVar2.n;
                if (motionEvent.getPointerCount() != 2 || aVar2.q.a()) {
                    return true;
                }
                float f16 = 2;
                pointF4.set((motionEvent.getX(0) + motionEvent.getX(1)) / f16, (motionEvent.getY(0) + motionEvent.getY(1)) / f16);
                pointF2.set(motionEvent.getX(0), motionEvent.getY(0));
                pointF.set(motionEvent.getX(1), motionEvent.getY(1));
                float f17 = pointF.x - pointF2.x;
                float f18 = pointF.y - pointF2.y;
                float sqrt = (float) Math.sqrt((f18 * f18) + (f17 * f17));
                float abs3 = Math.abs(sqrt - aVar2.e);
                pointF2.set(pointF4.x, pointF4.y);
                pointF.set(pointF3.x, pointF3.y);
                float f19 = pointF.x - pointF2.x;
                float f20 = pointF.y - pointF2.y;
                float sqrt2 = (float) Math.sqrt((f20 * f20) + (f19 * f19));
                CropZoomGestureRecognizer cropZoomGestureRecognizer2 = aVar2.k;
                if (cropZoomGestureRecognizer2.b == 0) {
                    cropZoomGestureRecognizer2.b = System.nanoTime();
                    cropZoomGestureRecognizer2.c = abs3;
                    cropZoomGestureRecognizer2.d = sqrt2;
                    matrix = matrix3;
                } else {
                    if (cropZoomGestureRecognizer2.a == null) {
                        matrix = matrix3;
                        if (System.nanoTime() - cropZoomGestureRecognizer2.b > 100000000) {
                            cropZoomGestureRecognizer2.a = cropZoomGestureRecognizer2.c > cropZoomGestureRecognizer2.d ? CropZoomGestureRecognizer.InteractionType.SCALING : CropZoomGestureRecognizer.InteractionType.DRAGGING;
                        }
                    } else {
                        matrix = matrix3;
                    }
                    cropZoomGestureRecognizer2.c = abs3;
                    cropZoomGestureRecognizer2.d = sqrt2;
                }
                CropZoomGestureRecognizer.InteractionType interactionType2 = cropZoomGestureRecognizer2.a;
                int i2 = interactionType2 == null ? -1 : a.C1373a.$EnumSwitchMapping$0[interactionType2.ordinal()];
                if (i2 != -1) {
                    if (i2 == 1) {
                        float f21 = sqrt / aVar2.e;
                        matrix4.set(matrix);
                        RectF rectF2 = aVar2.j;
                        matrix4.postScale(f21, f21, rectF2.width() / f16, rectF2.height() / f16);
                        qikVar2.setImageMatrix(matrix4);
                    } else {
                        if (i2 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        float f22 = pointF4.x - pointF3.x;
                        float f23 = pointF4.y - pointF3.y;
                        matrix4.set(matrix);
                        matrix4.postTranslate(f22, f23);
                        qikVar2.setImageMatrix(matrix4);
                    }
                }
                aVar2.c.invoke();
                return true;
            }
            if (actionMasked == 3) {
                this.i = 0L;
                return false;
            }
            if (actionMasked != 5) {
                return false;
            }
        }
        if (motionEvent.getPointerCount() != 2) {
            if (motionEvent.getPointerCount() > 2) {
                this.i = 0L;
                return false;
            }
            this.i = System.currentTimeMillis();
            return true;
        }
        this.i = 0L;
        if (aVar2.q.a()) {
            return true;
        }
        aVar2.f.set(aVar2.g);
        float f24 = 2;
        aVar2.d.set((motionEvent.getX(0) + motionEvent.getX(1)) / f24, (motionEvent.getY(0) + motionEvent.getY(1)) / f24);
        PointF pointF5 = aVar2.l;
        pointF5.set(motionEvent.getX(0), motionEvent.getY(0));
        PointF pointF6 = aVar2.m;
        pointF6.set(motionEvent.getX(1), motionEvent.getY(1));
        float f25 = pointF6.x - pointF5.x;
        float f26 = pointF6.y - pointF5.y;
        aVar2.e = (float) Math.sqrt((f26 * f26) + (f25 * f25));
        return true;
    }

    public final void setCallback(a aVar) {
        this.d = aVar;
    }

    public final void setOnDetachListener(gzs<s3q0> gzsVar) {
        this.f = gzsVar;
    }

    public final void setPhotoAttachment(PhotoAttachment photoAttachment) {
        this.b = photoAttachment;
    }
}
