package com.yandex.messaging.internal.avatar;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.yandex.messaging.domain.statuses.StatusAvailability;
import defpackage.a370;
import defpackage.ay4;
import defpackage.bb4;
import defpackage.gu21;
import defpackage.gvg0;
import defpackage.jl40;
import defpackage.jt21;
import defpackage.k3i0;
import defpackage.kjs0;
import defpackage.kt21;
import defpackage.lt21;
import defpackage.mt21;
import defpackage.nds0;
import defpackage.nt21;
import defpackage.r0f;
import defpackage.r0k;
import defpackage.va6;
import defpackage.w511;
import defpackage.wwg0;
import defpackage.z83;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 j2\u00020\u0001:\u0001kB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0016\u001a\u00020\f2\b\b\u0001\u0010\u0013\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\f¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\f¢\u0006\u0004\b\u001a\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010!\u001a\u00020\f2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\f2\u0006\u0010#\u001a\u00020\u0006H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0006H\u0016¢\u0006\u0004\b&\u0010%J/\u0010+\u001a\u00020\f2\u0006\u0010'\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u0006H\u0014¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\fH\u0014¢\u0006\u0004\b-\u0010\u0019J\u000f\u0010.\u001a\u00020\fH\u0014¢\u0006\u0004\b.\u0010\u0019J\u0017\u00101\u001a\u00020\f2\u0006\u00100\u001a\u00020/H\u0014¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\fH\u0002¢\u0006\u0004\b3\u0010\u0019J\u0017\u00104\u001a\u00020\f2\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\b4\u00102J\u0013\u00105\u001a\u00020\n*\u00020/H\u0002¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\fH\u0002¢\u0006\u0004\b7\u0010\u0019J\u000f\u00108\u001a\u00020\fH\u0002¢\u0006\u0004\b8\u0010\u0019R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010=\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010@\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010C\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010F\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010H\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010GR\u0014\u0010I\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010GR\u0016\u0010J\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010LR\u0016\u0010M\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010KR\u0018\u0010N\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bN\u0010OR*\u0010R\u001a\u00020P2\u0006\u0010Q\u001a\u00020P8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\u0018\u0010X\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u0018\u0010Z\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u0018\u0010]\u001a\u0004\u0018\u00010\\8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u0016\u0010_\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b_\u0010KR*\u0010`\u001a\u00020\u00062\u0006\u0010Q\u001a\u00020\u00068\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b`\u0010K\u001a\u0004\ba\u0010b\"\u0004\bc\u0010%R*\u0010d\u001a\u00020\u00062\u0006\u0010Q\u001a\u00020\u00068\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\bd\u0010K\u001a\u0004\be\u0010b\"\u0004\bf\u0010%R&\u0010i\u001a\u00020\u00062\b\b\u0001\u0010Q\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bg\u0010b\"\u0004\bh\u0010%¨\u0006l"}, d2 = {"Lcom/yandex/messaging/internal/avatar/AvatarImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "onlineIndicatorSize", "Lzy11;", "setOnlineIndicatorSize", "(F)V", "Lr0k;", "displayUserStatus", "updateDisplayUserStatus", "(Lr0k;)V", "color", "", "placeHolder", "setPlaceholder", "(ILjava/lang/String;)V", "clear", "()V", "clearBorder", "Landroid/graphics/Typeface;", "typeface", "setTypeface", "(Landroid/graphics/Typeface;)V", "Landroid/graphics/drawable/Drawable;", "drawable", "setImageDrawable", "(Landroid/graphics/drawable/Drawable;)V", "resId", "setImageResource", "(I)V", "setBackgroundColor", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "onDetachedFromWindow", "onAttachedToWindow", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "updatePadding", "drawUserStatusIndicatorIfNeeded", "calcRadius", "(Landroid/graphics/Canvas;)F", "clearText", "clearImage", "Lr0f;", "counterRenderer", "Lr0f;", "La370;", "onlineIndicatorRenderer", "La370;", "Lva6;", "borderRenderer", "Lva6;", "Lnds0;", "meetingIndicationRenderer", "Lnds0;", "Landroid/graphics/Paint;", "textPaint", "Landroid/graphics/Paint;", "backgroundPaint", "placeholderBitmapPaint", "avatarPadding", CA20Status.STATUS_USER_I, "F", "counter", "indicatorIcon", "Ljava/lang/Integer;", "", "value", "hasMeeting", "Z", "getHasMeeting", "()Z", "setHasMeeting", "(Z)V", "text", "Ljava/lang/String;", "placeholderDrawable", "Landroid/graphics/drawable/Drawable;", "Landroid/graphics/Bitmap;", "placeholderBitmap", "Landroid/graphics/Bitmap;", "avatarResId", "borderThickness", "getBorderThickness", "()I", "setBorderThickness", "borderMargin", "getBorderMargin", "setBorderMargin", "getBorderColor", "setBorderColor", "borderColor", "Companion", "bb4", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AvatarImageView extends AppCompatImageView {
    public static final int $stable = 8;
    public static final bb4 Companion = new bb4();
    private static final int DEFAULT_RES = wwg0.msg_ic_online_status;
    private int avatarPadding;
    private int avatarResId;
    private final Paint backgroundPaint;
    private int borderMargin;
    private final va6 borderRenderer;
    private int borderThickness;
    private int counter;
    private final r0f counterRenderer;
    private boolean hasMeeting;
    private Integer indicatorIcon;
    private final nds0 meetingIndicationRenderer;
    private final a370 onlineIndicatorRenderer;
    private float onlineIndicatorSize;
    private Bitmap placeholderBitmap;
    private final Paint placeholderBitmapPaint;
    private Drawable placeholderDrawable;
    private String text;
    private final Paint textPaint;

    public AvatarImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.counterRenderer = new r0f(context);
        this.onlineIndicatorRenderer = new a370(context);
        this.borderRenderer = new va6();
        nds0 nds0Var = new nds0();
        nds0Var.a = context.getDrawable(wwg0.msg_ic_avatar_meeting_indication);
        this.meetingIndicationRenderer = nds0Var;
        Paint paint = new Paint();
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setTextSize(context.getResources().getDimensionPixelSize(gvg0.timeline_message_text_size));
        this.textPaint = paint;
        Paint paint2 = new Paint();
        paint2.setStyle(style);
        paint2.setAntiAlias(true);
        paint2.setColor(0);
        this.backgroundPaint = paint2;
        this.placeholderBitmapPaint = new Paint();
        setWillNotDraw(false);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k3i0.AvatarImageView, i, 0);
            try {
                paint.setColor(obtainStyledAttributes.getColor(k3i0.AvatarImageView_avatarTextColor, -1));
                paint.setTextSize(obtainStyledAttributes.getDimension(k3i0.AvatarImageView_avatarTextSize, kjs0.e(16)));
                this.avatarPadding = (int) obtainStyledAttributes.getDimension(k3i0.AvatarImageView_avatarPadding, kjs0.e(16));
                this.placeholderDrawable = obtainStyledAttributes.getDrawable(k3i0.AvatarImageView_placeholderBackground);
                setBorderThickness(obtainStyledAttributes.getDimensionPixelSize(k3i0.AvatarImageView_borderThickness, 0));
                setBorderMargin(obtainStyledAttributes.getDimensionPixelSize(k3i0.AvatarImageView_borderMargin, 0));
                updatePadding();
                this.onlineIndicatorSize = obtainStyledAttributes.getDimension(k3i0.AvatarImageView_onlineIndicatorSize, kjs0.b(14));
                obtainStyledAttributes.recycle();
                try {
                    this.avatarResId = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.src}, i, 0).getResourceId(0, 0);
                } finally {
                }
            } finally {
            }
        }
    }

    private final float calcRadius(Canvas canvas) {
        return (((canvas.getWidth() - getPaddingLeft()) - getPaddingRight()) - (this.avatarPadding * 2)) / 2.0f;
    }

    private final void clearImage() {
        this.avatarResId = 0;
    }

    private final void clearText() {
        this.text = null;
    }

    private final void drawUserStatusIndicatorIfNeeded(Canvas canvas) {
        Integer num = this.indicatorIcon;
        if (num != null) {
            int intValue = num.intValue();
            a370 a370Var = this.onlineIndicatorRenderer;
            a370Var.b = a370Var.a.getDrawable(intValue);
            int i = this.avatarPadding;
            float f = this.onlineIndicatorSize;
            float width = canvas.getWidth() - i;
            Drawable drawable = a370Var.b;
            if (drawable != null) {
                int i2 = (int) (width - f);
                int i3 = (int) width;
                drawable.setBounds(i2, i2, i3, i3);
            }
            Drawable drawable2 = a370Var.b;
            if (drawable2 != null) {
                drawable2.draw(canvas);
            }
        }
    }

    private final void updatePadding() {
        int i = this.borderThickness + this.borderMargin;
        setPadding(i, i, i, i);
    }

    public final void clear() {
        clearImage();
        clearText();
        clearBorder();
        this.backgroundPaint.setColor(0);
        setImageDrawable(null);
        this.indicatorIcon = null;
        invalidate();
    }

    public final void clearBorder() {
        this.borderRenderer.b.setColor(0);
    }

    public final int getBorderColor() {
        return this.borderRenderer.b.getColor();
    }

    public final int getBorderMargin() {
        return this.borderMargin;
    }

    public final int getBorderThickness() {
        return this.borderThickness;
    }

    public final boolean getHasMeeting() {
        return this.hasMeeting;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setLayerType(2, null);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        setLayerType(0, null);
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        nds0 nds0Var;
        Drawable drawable;
        if (this.avatarResId != 0) {
            super.onDraw(canvas);
            return;
        }
        super.onDraw(canvas);
        if (getDrawable() == null) {
            float width = getWidth() / 2.0f;
            float height = getHeight() / 2.0f;
            canvas.drawCircle(width, height, calcRadius(canvas), this.backgroundPaint);
            Drawable drawable2 = this.placeholderDrawable;
            if (drawable2 != null) {
                Bitmap bitmap = this.placeholderBitmap;
                if (bitmap == null) {
                    if (drawable2 instanceof BitmapDrawable) {
                        bitmap = ((BitmapDrawable) drawable2).getBitmap();
                    } else {
                        if (drawable2 instanceof NinePatchDrawable) {
                            z83.j("You shouldn't convert 9-patch to bitmap!");
                        } else {
                            int intrinsicWidth = drawable2.getIntrinsicWidth();
                            int intrinsicHeight = drawable2.getIntrinsicHeight();
                            if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
                                Rect bounds = drawable2.getBounds();
                                if (intrinsicWidth <= 0) {
                                    intrinsicWidth = bounds.width();
                                }
                                if (intrinsicHeight <= 0) {
                                    intrinsicHeight = bounds.height();
                                }
                            }
                            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                                bitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
                                Canvas canvas2 = new Canvas(bitmap);
                                drawable2.setBounds(0, 0, canvas2.getWidth(), canvas2.getHeight());
                                drawable2.draw(canvas2);
                            }
                        }
                        bitmap = null;
                    }
                }
                this.placeholderBitmap = bitmap;
            }
            Bitmap bitmap2 = this.placeholderBitmap;
            if (bitmap2 != null) {
                canvas.drawBitmap(bitmap2, 0.0f, 0.0f, this.placeholderBitmapPaint);
            }
            String str = this.text;
            if (str != null) {
                canvas.drawText(str, width, height - ((this.textPaint.ascent() + this.textPaint.descent()) / 2.0f), this.textPaint);
            }
        }
        if (this.hasMeeting && (drawable = (nds0Var = this.meetingIndicationRenderer).a) != null) {
            drawable.setBounds(nds0Var.b);
            int saveLayer = canvas.saveLayer(nds0Var.c, nds0Var.d);
            drawable.draw(canvas);
            canvas.restoreToCount(saveLayer);
        }
        va6 va6Var = this.borderRenderer;
        Paint paint = va6Var.b;
        if (paint.getColor() != 0) {
            canvas.drawOval(va6Var.a, paint);
        }
        r0f r0fVar = this.counterRenderer;
        int i = this.counter;
        int i2 = this.avatarPadding;
        r0fVar.getClass();
        if (i > 0 && canvas.getWidth() > 0) {
            int width2 = canvas.getWidth() - (i2 * 2);
            Paint paint2 = new Paint();
            paint2.setColor(-1);
            paint2.setTextSize(22.0f);
            paint2.setAntiAlias(true);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setTextAlign(Paint.Align.LEFT);
            String valueOf = i > 99 ? r0fVar.a : String.valueOf(i);
            new Rect();
            paint2.getTextBounds(valueOf, 0, valueOf.length(), new Rect());
            int i3 = r0fVar.b;
            float f = width2;
            Paint paint3 = new Paint();
            paint3.setAntiAlias(true);
            paint3.setColor(i3);
            float f2 = (r8.right - r8.left) / 2.0f;
            float f3 = (r8.bottom - r8.top) / 2.0f;
            float f4 = 0.1875f * f;
            float f5 = r0fVar.c;
            float f6 = i2;
            float f7 = ((f4 - f3) - f5) + f6;
            float f8 = f * 0.8125f;
            float f9 = ((f8 - f2) - f5) + f6;
            float f10 = f2 + f8 + f5 + f6;
            float f11 = f3 + f4 + f5 + f6;
            float f12 = f11 - f7;
            if (f10 - f9 < f12) {
                f10 = f9 + f12;
            }
            float f13 = f12 / 2.0f;
            canvas.drawRoundRect(new RectF(f9, f7, f10, f11), f13, f13, paint3);
            new Rect();
            paint2.getTextBounds(valueOf, 0, valueOf.length(), new Rect());
            canvas.drawText(valueOf, (f8 - r0.centerX()) + f6, (f4 - r0.centerY()) + f6, paint2);
        }
        drawUserStatusIndicatorIfNeeded(canvas);
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        va6 va6Var = this.borderRenderer;
        int width = getWidth();
        int height = getHeight();
        float f = this.borderThickness;
        RectF rectF = va6Var.a;
        rectF.top = f;
        rectF.left = f;
        rectF.bottom = height - f;
        rectF.right = width - f;
        va6Var.b.setStrokeWidth(f);
        int i = this.borderThickness + this.borderMargin;
        nds0 nds0Var = this.meetingIndicationRenderer;
        Rect rect = nds0Var.b;
        rect.top = i;
        rect.left = i;
        rect.bottom = h - i;
        rect.right = w - i;
        nds0Var.c.set(rect);
    }

    @Override // android.view.View
    public void setBackgroundColor(int color) {
        if (this.backgroundPaint.getColor() == color) {
            return;
        }
        this.backgroundPaint.setColor(color);
        invalidate();
    }

    public final void setBorderColor(int i) {
        if (this.borderRenderer.b.getColor() == i) {
            return;
        }
        this.borderRenderer.b.setColor(i);
        invalidate();
    }

    public final void setBorderMargin(int i) {
        this.borderMargin = i;
        updatePadding();
    }

    public final void setBorderThickness(int i) {
        this.borderThickness = i;
        updatePadding();
    }

    public final void setHasMeeting(boolean z) {
        if (this.hasMeeting == z) {
            return;
        }
        this.hasMeeting = z;
        invalidate();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        clearText();
        this.avatarResId = 0;
        super.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int resId) {
        super.setImageResource(resId);
        this.avatarResId = resId;
    }

    public final void setOnlineIndicatorSize(float onlineIndicatorSize) {
        this.onlineIndicatorSize = onlineIndicatorSize;
    }

    public final void setPlaceholder(int color, String placeHolder) {
        if (jl40.l(placeHolder, this.text) && color == this.backgroundPaint.getColor()) {
            return;
        }
        clearImage();
        this.text = placeHolder;
        this.backgroundPaint.setColor(color);
        invalidate();
    }

    public final void setTypeface(Typeface typeface) {
        this.textPaint.setTypeface(typeface);
    }

    public final void updateDisplayUserStatus(r0k displayUserStatus) {
        StatusAvailability statusAvailability;
        ay4 ay4Var;
        boolean z = displayUserStatus.b.a;
        gu21 gu21Var = displayUserStatus.a;
        Integer num = null;
        if (gu21Var != null) {
            if (!z && gu21Var.a == StatusAvailability.Default) {
                gu21Var = null;
            }
            if (gu21Var != null && (statusAvailability = gu21Var.a) != null) {
                int i = lt21.a[statusAvailability.ordinal()];
                if (i == 1) {
                    ay4Var = mt21.c;
                } else if (i == 2) {
                    ay4Var = nt21.c;
                } else if (i == 3) {
                    ay4Var = kt21.c;
                } else {
                    if (i != 4) {
                        w511.b();
                        return;
                    }
                    ay4Var = jt21.c;
                }
                num = Integer.valueOf(ay4Var.b);
            }
        }
        if (num == null && z) {
            num = Integer.valueOf(DEFAULT_RES);
        }
        if (jl40.l(num, this.indicatorIcon)) {
            return;
        }
        this.indicatorIcon = num;
        invalidate();
    }

    public AvatarImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ AvatarImageView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public AvatarImageView(Context context) {
        this(context, null, 0, 6, null);
    }
}
