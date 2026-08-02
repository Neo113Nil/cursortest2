package com.yandex.messaging.internal.avatar;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import defpackage.eb4;
import defpackage.hb4;
import defpackage.ib4;
import defpackage.jb4;
import defpackage.kb4;
import defpackage.kjs0;
import defpackage.mp11;
import defpackage.ya4;
import defpackage.z83;
import defpackage.za4;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 ;2\u00020\u0001:\u0002<=B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u001b\u001a\u00020\u001a2\n\u0010\u0019\u001a\u00060\u0017R\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\"\u0010#J\u0019\u0010&\u001a\u00020\u001a2\b\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u000eH\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020*H\u0014¢\u0006\u0004\b,\u0010-R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010.R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010/R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00100R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00100R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00101R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00102R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00106\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00105R\u0014\u00107\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u0010\u000f\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010:¨\u0006>"}, d2 = {"Lcom/yandex/messaging/internal/avatar/AvatarPlaceholderDrawable;", "Landroid/graphics/drawable/Drawable;", "Lza4;", "colorGenerator", "Lmp11;", "typefaceProvider", "", "colorKey", "text", "icon", "Ljb4;", "shape", "<init>", "(Lza4;Lmp11;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/drawable/Drawable;Ljb4;)V", "", "avatarSize", "", "calcCorrespondingTextSize", "(I)F", "size", "Landroid/graphics/LinearGradient;", "createBackgroundShader", "(FLjava/lang/String;)Landroid/graphics/LinearGradient;", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "t", "Lzy11;", "applyTheme", "(Landroid/content/res/Resources$Theme;)V", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", CaretView.ALPHA_PROPERTY, "setAlpha", "(I)V", "Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "(Landroid/graphics/ColorFilter;)V", "getOpacity", "()I", "Landroid/graphics/Rect;", "bounds", "onBoundsChange", "(Landroid/graphics/Rect;)V", "Lza4;", "Lmp11;", "Ljava/lang/String;", "Landroid/graphics/drawable/Drawable;", "Ljb4;", "Landroid/graphics/Paint;", "backgroundPaint", "Landroid/graphics/Paint;", "textPaint", "iconRect", "Landroid/graphics/Rect;", "Lkb4;", "Lkb4;", "Companion", "eb4", "ymu", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AvatarPlaceholderDrawable extends Drawable {
    public static final int $stable = 8;
    public static final eb4 Companion = new eb4();
    private static final float ICON_SCALE = 0.62f;
    private kb4 avatarSize;
    private final Paint backgroundPaint;
    private final za4 colorGenerator;
    private final String colorKey;
    private final Drawable icon;
    private final Rect iconRect;
    private final jb4 shape;
    private final String text;
    private final Paint textPaint;
    private final mp11 typefaceProvider;

    public AvatarPlaceholderDrawable(za4 za4Var, mp11 mp11Var, String str, String str2, Drawable drawable, jb4 jb4Var) {
        this.colorGenerator = za4Var;
        this.typefaceProvider = mp11Var;
        this.colorKey = str;
        this.text = str2;
        this.icon = drawable;
        this.shape = jb4Var;
        Paint paint = new Paint();
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setAntiAlias(true);
        this.backgroundPaint = paint;
        Paint paint2 = new Paint();
        paint2.setStyle(style);
        paint2.setAntiAlias(true);
        paint2.setTextAlign(Paint.Align.CENTER);
        paint2.setColor(((ya4) za4Var.a.get(za4Var.a(str))).c);
        paint2.setTypeface(mp11Var.c());
        this.textPaint = paint2;
        this.iconRect = new Rect();
    }

    private final float calcCorrespondingTextSize(int avatarSize) {
        float f;
        float f2 = avatarSize;
        DisplayMetrics displayMetrics = kjs0.a;
        int i = (int) (f2 / displayMetrics.density);
        if (i >= 0 && i < 21) {
            f = 6.0f;
        } else if (20 <= i && i < 31) {
            f = 10.0f;
        } else if (30 <= i && i < 41) {
            f = 12.0f;
        } else if (40 <= i && i < 61) {
            f = 20.0f;
        } else if (60 <= i && i < 91) {
            f = 24.0f;
        } else if (90 <= i && i < 131) {
            f = 36.0f;
        } else if (130 > i || i >= 161) {
            f = i / 3.0f;
            z83.i();
        } else {
            f = 48.0f;
        }
        return f * displayMetrics.scaledDensity;
    }

    private final LinearGradient createBackgroundShader(float size, String colorKey) {
        za4 za4Var = this.colorGenerator;
        int i = ((ya4) za4Var.a.get(za4Var.a(colorKey))).b;
        za4 za4Var2 = this.colorGenerator;
        return new LinearGradient(0.0f, 0.0f, 0.0f, size, new int[]{i, ((ya4) za4Var2.a.get(za4Var2.a(colorKey))).a}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme t) {
        super.applyTheme(t);
        Drawable drawable = this.icon;
        if (drawable != null) {
            drawable.applyTheme(t);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0066  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void draw(Canvas canvas) {
        Canvas canvas2;
        Drawable drawable;
        kb4 kb4Var = this.avatarSize;
        if (kb4Var == null) {
            return;
        }
        jb4 jb4Var = this.shape;
        if (jb4Var instanceof hb4) {
            canvas.drawCircle(getBounds().exactCenterX(), getBounds().exactCenterY(), kb4Var.a / 2.0f, this.backgroundPaint);
        } else if (jb4Var instanceof ib4) {
            float intValue = ((ib4) jb4Var).a != null ? r1.intValue() : kb4Var.b();
            canvas2 = canvas;
            canvas2.drawRoundRect(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom, intValue, intValue, this.backgroundPaint);
            if (this.text != null) {
                canvas2.drawText(this.text, getBounds().exactCenterX(), getBounds().exactCenterY() - ((this.textPaint.ascent() + this.textPaint.descent()) / 2.0f), this.textPaint);
            }
            drawable = this.icon;
            if (drawable == null) {
                drawable.draw(canvas2);
                return;
            }
            return;
        }
        canvas2 = canvas;
        if (this.text != null) {
        }
        drawable = this.icon;
        if (drawable == null) {
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        int alpha = this.backgroundPaint.getAlpha();
        if (alpha != 0) {
            return alpha != 255 ? -3 : -1;
        }
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect bounds) {
        super.onBoundsChange(bounds);
        this.avatarSize = new kb4(Math.min(bounds.width(), bounds.height()));
        int min = Math.min(bounds.width(), bounds.height());
        this.textPaint.setTextSize(calcCorrespondingTextSize(min));
        this.backgroundPaint.setShader(createBackgroundShader(bounds.height(), this.colorKey));
        if (this.icon != null) {
            int i = (int) (min * ICON_SCALE);
            int i2 = (min - i) / 2;
            this.iconRect.set(0, 0, i, i);
            this.iconRect.offset(bounds.left + i2, bounds.top + i2);
            Drawable drawable = this.icon;
            Rect rect = this.iconRect;
            drawable.setBounds(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        this.backgroundPaint.setAlpha(alpha);
        this.textPaint.setAlpha(alpha);
        Drawable drawable = this.icon;
        if (drawable != null) {
            drawable.setAlpha(alpha);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
