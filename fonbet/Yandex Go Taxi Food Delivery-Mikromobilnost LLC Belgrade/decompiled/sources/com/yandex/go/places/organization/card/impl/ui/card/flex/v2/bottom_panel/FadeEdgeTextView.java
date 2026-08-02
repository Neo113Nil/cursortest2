package com.yandex.go.places.organization.card.impl.ui.card.flex.v2.bottom_panel;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.text.Layout;
import android.util.AttributeSet;
import defpackage.b8p;
import defpackage.gvu0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0017B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/yandex/go/places/organization/card/impl/ui/card/flex/v2/bottom_panel/FadeEdgeTextView;", "Lru/yandex/taxi/widget/RobotoTextView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "isTextOverflowing", "()Z", "Landroid/graphics/Canvas;", "canvas", "", "text", "Lzy11;", "drawTextWithFade", "(Landroid/graphics/Canvas;Ljava/lang/String;)V", "onDraw", "(Landroid/graphics/Canvas;)V", "Companion", "b8p", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FadeEdgeTextView extends RobotoTextView {
    public static final int $stable = 8;
    private static final b8p Companion = new b8p();

    @Deprecated
    public static final int FADE_CHAR_COUNT = 2;

    public /* synthetic */ FadeEdgeTextView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final void drawTextWithFade(Canvas canvas, String text) {
        Layout layout;
        if (text.length() == 0 || (layout = getLayout()) == null) {
            return;
        }
        int lineBounds = layout.getLineBounds(0, null);
        float lineLeft = layout.getLineLeft(0);
        float paddingTop = getPaddingTop() + lineBounds;
        int breakText = getPaint().breakText(text, true, (getWidth() - getPaddingLeft()) - getPaddingRight(), null);
        if (breakText <= 0) {
            return;
        }
        Shader shader = getPaint().getShader();
        int max = Math.max(1, breakText - 2);
        String A0 = gvu0.A0(max, text);
        String substring = text.substring(max, breakText);
        float measureText = getPaint().measureText(A0) + lineLeft;
        float measureText2 = getPaint().measureText(substring) + measureText;
        int currentTextColor = getCurrentTextColor();
        getPaint().setShader(new LinearGradient(measureText - getPaint().measureText(String.valueOf(text.charAt(max - 1))), 0.0f, measureText2, 0.0f, new int[]{currentTextColor, currentTextColor, 16777215 & currentTextColor}, new float[]{0.0f, 0.3f, 1.0f}, Shader.TileMode.CLAMP));
        canvas.drawText(gvu0.A0(breakText, text), lineLeft, paddingTop, getPaint());
        getPaint().setShader(shader);
    }

    private final boolean isTextOverflowing() {
        Layout layout = getLayout();
        return layout != null && layout.getEllipsisCount(0) > 0;
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        CharSequence text = getText();
        String obj = text != null ? text.toString() : null;
        if (obj == null || obj.length() == 0 || !isTextOverflowing()) {
            super.onDraw(canvas);
        } else {
            drawTextWithFade(canvas, obj);
        }
    }

    public FadeEdgeTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public FadeEdgeTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public FadeEdgeTextView(Context context) {
        this(context, null, 0, 6, null);
    }
}
