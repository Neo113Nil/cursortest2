package com.yandex.messaging.views;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.TextSwitcher;
import android.widget.TextView;
import defpackage.jl40;
import defpackage.jr31;
import defpackage.oew0;
import defpackage.s5r;
import defpackage.sls;
import defpackage.uiy0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.sequences.b;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ1\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\r\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0013\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\r\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u001b\u0010\u000eJ\u0017\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010\"\u001a\u00020\u000b2\b\u0010!\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b\"\u0010#J\u0019\u0010%\u001a\u00020\u000b2\b\u0010$\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b%\u0010#R\u0018\u0010&\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010)\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lcom/yandex/messaging/views/TextSwitcherView;", "Landroid/widget/TextSwitcher;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lzy11;", "addTextView", "onFinishInflate", "()V", "", "text", "setText", "(Ljava/lang/CharSequence;)V", "setCurrentText", "getText", "()Ljava/lang/CharSequence;", "Landroid/view/View;", "changedView", "visibility", "onVisibilityChanged", "(Landroid/view/View;I)V", "onDetachedFromWindow", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Landroid/view/animation/Animation;", "inAnimation", "setInAnimation", "(Landroid/view/animation/Animation;)V", "outAnimation", "setOutAnimation", "lastText", "Ljava/lang/CharSequence;", "", "isVisibleToUser", "Z", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public class TextSwitcherView extends TextSwitcher {
    public static final int $stable = 8;
    private boolean isVisibleToUser;
    private CharSequence lastText;

    public /* synthetic */ TextSwitcherView(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    private final void addTextView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        FrameLayout.LayoutParams generateLayoutParams = generateLayoutParams(attrs);
        generateLayoutParams.setMargins(0, 0, 0, 0);
        generateLayoutParams.setMarginStart(0);
        generateLayoutParams.setMarginEnd(0);
        TextView textView = new TextView(context, attrs, defStyleAttr, defStyleRes);
        textView.setBackground(null);
        addView(textView, generateLayoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setOutAnimation$lambda$5(TextSwitcherView textSwitcherView) {
        s5r s5rVar = new s5r(b.h(new jr31(textSwitcherView, 0), new uiy0(18)));
        while (s5rVar.hasNext()) {
            setOutAnimation$lambda$5$lambda$3((View) s5rVar.next()).setText("");
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setOutAnimation$lambda$5$lambda$2(View view) {
        return view.getVisibility() == 0;
    }

    private static final TextView setOutAnimation$lambda$5$lambda$3(View view) {
        return (TextView) view;
    }

    public final CharSequence getText() {
        CharSequence charSequence = this.lastText;
        return charSequence == null ? "" : charSequence;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.isVisibleToUser = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.isVisibleToUser = true;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        setPadding(0, 0, 0, 0);
    }

    @Override // android.view.View
    public void onVisibilityChanged(View changedView, int visibility) {
        super.onVisibilityChanged(changedView, visibility);
        if (visibility != 0) {
            this.isVisibleToUser = false;
        }
    }

    @Override // android.widget.TextSwitcher
    public void setCurrentText(CharSequence text) {
        if (jl40.l(this.lastText, text)) {
            return;
        }
        this.lastText = text;
        super.setCurrentText(text);
    }

    @Override // android.widget.ViewAnimator
    public void setInAnimation(Animation inAnimation) {
        super.setInAnimation(inAnimation);
    }

    @Override // android.widget.ViewAnimator
    public void setOutAnimation(Animation outAnimation) {
        if (outAnimation != null) {
            final oew0 oew0Var = new oew0(22, this);
            outAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.yandex.messaging.views.AnimationsKt$onAnimationEnd$1
                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    sls.this.invoke();
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationRepeat(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationStart(Animation animation) {
                }
            });
        }
        super.setOutAnimation(outAnimation);
    }

    @Override // android.widget.TextSwitcher
    public void setText(CharSequence text) {
        if (jl40.l(this.lastText, text)) {
            return;
        }
        this.lastText = text;
        if (this.isVisibleToUser) {
            super.setText(text);
        } else {
            super.setCurrentText(text);
        }
    }

    public TextSwitcherView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public TextSwitcherView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public TextSwitcherView(Context context) {
        this(context, null, 0, 0, 14, null);
    }

    public TextSwitcherView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        addTextView(context, attributeSet, i, i2);
        addTextView(context, attributeSet, i, i2);
    }
}
