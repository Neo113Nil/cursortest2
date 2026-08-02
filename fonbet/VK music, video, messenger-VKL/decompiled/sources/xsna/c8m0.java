package xsna;

import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.unity3d.services.UnityAdsConstants;
import com.vk.stickers.api.models.photo.PhotoStickerStyle;
import com.vk.stickers.api.models.photo.ShapeType;
import com.vk.superapp.api.dto.story.WebStickerType;
import kotlin.NoWhenBranchMatchedException;
import xsna.nov;

/* compiled from: StoryPhotoSticker.kt */
/* loaded from: classes6.dex */
public final class c8m0 extends ad7 {
    public boolean q;
    public PhotoStickerStyle r;
    public final boolean s;
    public final Path t;
    public final Paint u;
    public float v;
    public float w;

    /* compiled from: StoryPhotoSticker.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ShapeType.values().length];
            try {
                iArr[ShapeType.CIRCLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ShapeType.SQUARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ShapeType.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ShapeType.RECTANGLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public c8m0(c8m0 c8m0Var) {
        super(c8m0Var);
        this.s = true;
        this.t = new Path();
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        this.u = paint;
        PhotoStickerStyle photoStickerStyle = c8m0Var.r;
        this.r = photoStickerStyle;
        this.c.q = c8m0Var.c.q;
        this.q = c8m0Var.q;
        s(photoStickerStyle, false);
    }

    @Override // xsna.ad7, xsna.kr9, xsna.nov
    public final nov E0(nov novVar) {
        return super.E0(new c8m0(this));
    }

    @Override // xsna.ad7, xsna.nov
    public final void G0(Canvas canvas) {
        int save = canvas.save();
        ShapeType l = this.r.l();
        if (l == ShapeType.CIRCLE || l == ShapeType.SQUARE) {
            RectF rectF = this.i;
            canvas.translate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (-(rectF.height() - rectF.width())) / 2.0f);
        }
        canvas.save();
        canvas.clipPath(this.t);
        super.G0(canvas);
        canvas.restoreToCount(save);
    }

    @Override // xsna.ad7, xsna.nov
    public final float getOriginalHeight() {
        return this.w;
    }

    @Override // xsna.ad7, xsna.nov
    public final float getOriginalWidth() {
        return this.v;
    }

    public final float r() {
        RectF rectF = this.i;
        return Math.min(rectF.width(), rectF.height()) / 2;
    }

    public final void s(PhotoStickerStyle photoStickerStyle, boolean z) {
        this.r = photoStickerStyle;
        float f = this.v;
        float f2 = this.w;
        int i = photoStickerStyle.i();
        Paint paint = this.u;
        paint.setColor(i);
        paint.setStrokeWidth(photoStickerStyle.k());
        paint.setMaskFilter(new BlurMaskFilter(photoStickerStyle.k(), BlurMaskFilter.Blur.NORMAL));
        ShapeType l = photoStickerStyle.l();
        Path path = this.t;
        path.reset();
        float h = l.h();
        int i2 = a.$EnumSwitchMapping$0[l.ordinal()];
        RectF rectF = this.i;
        if (i2 == 1) {
            path.addRoundRect(rectF.centerX() - r(), rectF.centerY() - r(), r() + rectF.centerX(), r() + rectF.centerY(), r(), r(), Path.Direction.CW);
        } else if (i2 == 2) {
            float min = Math.min(rectF.width(), rectF.height()) / 2;
            path.addRoundRect(new RectF(rectF.centerX() - min, rectF.centerY() - min, rectF.centerX() + min, rectF.centerY() + min), h, h, Path.Direction.CW);
        } else {
            if (i2 != 3 && i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            path.addRoundRect(rectF, h, h, Path.Direction.CW);
        }
        ShapeType l2 = photoStickerStyle.l();
        if (l2 == ShapeType.CIRCLE || l2 == ShapeType.SQUARE) {
            float min2 = Math.min(rectF.width(), rectF.height());
            this.v = min2;
            this.w = min2;
        } else {
            this.v = rectF.width();
            this.w = rectF.height();
        }
        if (f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f2 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            float f3 = (f2 - this.w) / 2.0f;
            float f4 = (f - this.v) / 2.0f;
            float o = o();
            float f5 = this.c.l;
            y0(o, this.v / 2.0f, this.w / 2.0f, true);
            nov.a.f(this, 1 / f5, this.v / 2.0f, this.w / 2.0f);
            nov.a.i(this, f4, f3);
            y0(-o, this.v / 2.0f, this.w / 2.0f, true);
            nov.a.f(this, f5, this.v / 2.0f, this.w / 2.0f);
        }
        if (z) {
            xaq.a(this, new w2j0(this, 2));
            return;
        }
        o1l0 o1l0Var = this.f;
        if (o1l0Var != null) {
            ((kdl0) o1l0Var).a(this);
        }
    }

    public c8m0(Bitmap bitmap, PhotoStickerStyle photoStickerStyle, boolean z, boolean z2) {
        super(bitmap, (iah0.f().widthPixels * 4) / 3, WebStickerType.PHOTO, "");
        this.s = true;
        this.t = new Path();
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        this.u = paint;
        this.r = photoStickerStyle;
        this.c.q = z;
        this.s = z2;
        s(photoStickerStyle, false);
    }
}
