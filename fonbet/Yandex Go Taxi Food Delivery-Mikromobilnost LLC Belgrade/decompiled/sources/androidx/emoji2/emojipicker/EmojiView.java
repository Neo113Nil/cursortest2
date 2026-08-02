package androidx.emoji2.emojipicker;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import defpackage.d0i0;
import defpackage.ftn;
import defpackage.l3h0;
import defpackage.ny61;
import defpackage.pun;
import defpackage.wqj;
import defpackage.yug0;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 /2\u00020\u0001:\u00010B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\u001d\u001a\u00020\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R.\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010)\u001a\u0004\u0018\u00010\b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.¨\u00061"}, d2 = {"Landroidx/emoji2/emojipicker/EmojiView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "emoji", "", "drawVariantIndicator", "Lzy11;", "drawEmoji", "(Ljava/lang/CharSequence;Z)V", "Landroid/text/Spanned;", "", "width", "Landroid/text/StaticLayout;", "createStaticLayout", "(Landroid/text/Spanned;I)Landroid/text/StaticLayout;", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "willDrawVariantIndicator", "Z", "getWillDrawVariantIndicator$emoji2_emojipicker_release", "()Z", "setWillDrawVariantIndicator$emoji2_emojipicker_release", "(Z)V", "Landroid/text/TextPaint;", "textPaint", "Landroid/text/TextPaint;", "Landroid/graphics/Bitmap;", "offscreenCanvasBitmap", "Landroid/graphics/Bitmap;", "value", "Ljava/lang/CharSequence;", "getEmoji", "()Ljava/lang/CharSequence;", "setEmoji", "(Ljava/lang/CharSequence;)V", "Companion", "pun", "emoji2-emojipicker_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class EmojiView extends View {
    public static final pun Companion = new pun();
    private static final int EMOJI_DRAW_TEXT_SIZE_SP = 30;
    private CharSequence emoji;
    private final Bitmap offscreenCanvasBitmap;
    private final TextPaint textPaint;
    private boolean willDrawVariantIndicator;

    public EmojiView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(context.getDrawable(l3h0.ripple_emoji_view));
        setImportantForAccessibility(1);
        this.willDrawVariantIndicator = true;
        TextPaint textPaint = new TextPaint(3);
        textPaint.setTextSize(TypedValue.applyDimension(2, 30.0f, context.getResources().getDisplayMetrics()));
        this.textPaint = textPaint;
        Paint.FontMetricsInt fontMetricsInt = textPaint.getFontMetricsInt();
        int i = fontMetricsInt.bottom - fontMetricsInt.top;
        this.offscreenCanvasBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _set_emoji_$lambda$3(CharSequence charSequence, EmojiView emojiView) {
        boolean z;
        CharSequence charSequence2;
        boolean z2 = false;
        if (charSequence == null) {
            emojiView.offscreenCanvasBitmap.eraseColor(0);
            return;
        }
        if (charSequence.equals(emojiView.emoji)) {
            EmojiPickerView.Companion.getClass();
            z = EmojiPickerView.emojiCompatLoaded;
            if (!z || (charSequence2 = ftn.a().j(charSequence)) == null) {
                charSequence2 = charSequence;
            }
            if (emojiView.willDrawVariantIndicator) {
                LinkedHashMap linkedHashMap = a.c;
                if (linkedHashMap == null) {
                    ny61.r("BundledEmojiListLoader.load is not called or complete");
                    return;
                } else if (linkedHashMap.containsKey(charSequence)) {
                    z2 = true;
                }
            }
            emojiView.drawEmoji(charSequence2, z2);
            emojiView.setContentDescription(emojiView.getContext().getString(d0i0.emoji_content_desc, emojiView.emoji));
        }
        emojiView.invalidate();
    }

    private final StaticLayout createStaticLayout(Spanned emoji, int width) {
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(emoji, 0, emoji.length(), this.textPaint, width);
        obtain.setAlignment(Layout.Alignment.ALIGN_CENTER);
        obtain.setLineSpacing(0.0f, 1.0f);
        obtain.setIncludePad(false);
        return obtain.build();
    }

    private final void drawEmoji(CharSequence emoji, boolean drawVariantIndicator) {
        this.offscreenCanvasBitmap.eraseColor(0);
        Canvas canvas = new Canvas(this.offscreenCanvasBitmap);
        if (emoji instanceof Spanned) {
            createStaticLayout((Spanned) emoji, canvas.getWidth()).draw(canvas);
        } else {
            canvas.drawText(emoji, 0, emoji.length(), (canvas.getWidth() - this.textPaint.measureText(emoji, 0, emoji.length())) / 2.0f, -this.textPaint.getFontMetrics().top, this.textPaint);
        }
        if (drawVariantIndicator) {
            Drawable drawable = getContext().getDrawable(l3h0.variant_availability_indicator);
            if (drawable != null) {
                int width = canvas.getWidth();
                int height = canvas.getHeight();
                drawable.setBounds(new Rect(width - getContext().getResources().getDimensionPixelSize(yug0.variant_availability_indicator_width), height - getContext().getResources().getDimensionPixelSize(yug0.variant_availability_indicator_height), width, height));
            } else {
                drawable = null;
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        canvas.save();
        canvas.scale(canvas.getWidth() / this.offscreenCanvasBitmap.getWidth(), canvas.getHeight() / this.offscreenCanvasBitmap.getHeight());
        canvas.drawBitmap(this.offscreenCanvasBitmap, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
    }

    public final CharSequence getEmoji() {
        return this.emoji;
    }

    /* renamed from: getWillDrawVariantIndicator$emoji2_emojipicker_release, reason: from getter */
    public final boolean getWillDrawVariantIndicator() {
        return this.willDrawVariantIndicator;
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int min = Math.min(View.MeasureSpec.getSize(widthMeasureSpec), View.MeasureSpec.getSize(heightMeasureSpec)) - getContext().getResources().getDimensionPixelSize(yug0.emoji_picker_emoji_view_padding);
        setMeasuredDimension(min, min);
    }

    public final void setEmoji(CharSequence charSequence) {
        this.emoji = charSequence;
        post(new wqj(21, charSequence, this));
    }

    public final void setWillDrawVariantIndicator$emoji2_emojipicker_release(boolean z) {
        this.willDrawVariantIndicator = z;
    }

    public /* synthetic */ EmojiView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EmojiView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }
}
