package com.yandex.div.internal.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.mer;
import defpackage.ner;
import defpackage.ooc;
import defpackage.q5z;
import defpackage.qoi0;
import defpackage.w511;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0010\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J1\u0010\u001f\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010#\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u0007H\u0014¢\u0006\u0004\b#\u0010$J/\u0010(\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u0007H\u0014¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0007H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0007H\u0016¢\u0006\u0004\b,\u0010+J\u0017\u0010.\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020\u0011H\u0016¢\u0006\u0004\b.\u0010\u0014J\u0017\u00101\u001a\u00020\u00112\u0006\u00100\u001a\u00020/H\u0017¢\u0006\u0004\b1\u00102R\u0016\u00103\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00105\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00104R\u0016\u00106\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00104R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010:\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010>\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0015\u0010@\u001a\u00020\u00078Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b?\u0010+R+\u0010F\u001a\u00020\u00072\u0006\u0010A\u001a\u00020\u00078V@VX\u0096\u008e\u0002¢\u0006\u0012\u001a\u0004\bB\u0010+\"\u0004\bC\u0010\u0010*\u0004\bD\u0010E¨\u0006G"}, d2 = {"Lcom/yandex/div/internal/widget/SuperLineHeightEditText;", "Landroidx/appcompat/widget/AppCompatEditText;", "Lner;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzy11;", "remeasureWrapContentConstrained", "()V", "h", "updateFittingText", "(I)V", "", BackendConfig.Restrictions.ENABLED, "requestDisallowInterceptTouchEvent", "(Z)V", "unit", "", "size", "setTextSize", "(IF)V", "", "text", "start", "lengthBefore", "lengthAfter", "onTextChanged", "(Ljava/lang/CharSequence;III)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "w", "oldw", "oldh", "onSizeChanged", "(IIII)V", "getCompoundPaddingTop", "()I", "getCompoundPaddingBottom", "whether", "setHorizontallyScrolling", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "horizontalScrollingEnabled", "Z", "isTextFitting", "isDisallowInterceptTouchEvent", "Lmer;", "fixedLineHeightHelper", "Lmer;", "currentLineCount", CA20Status.STATUS_USER_I, "getInterceptTouchEventNeeded", "()Z", "interceptTouchEventNeeded", "getVisibleLineCount", "visibleLineCount", "<set-?>", "getFixedLineHeight", "setFixedLineHeight", "getFixedLineHeight$delegate", "(Lcom/yandex/div/internal/widget/SuperLineHeightEditText;)Ljava/lang/Object;", "fixedLineHeight", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class SuperLineHeightEditText extends AppCompatEditText implements ner {
    private int currentLineCount;
    private final mer fixedLineHeightHelper;
    private boolean horizontalScrollingEnabled;
    private boolean isDisallowInterceptTouchEvent;
    private boolean isTextFitting;

    public /* synthetic */ SuperLineHeightEditText(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private static Object getFixedLineHeight$delegate(SuperLineHeightEditText superLineHeightEditText) {
        MutablePropertyReference0Impl mutablePropertyReference0Impl = new MutablePropertyReference0Impl(superLineHeightEditText.fixedLineHeightHelper, mer.class, "lineHeight", "getLineHeight()I", 0);
        qoi0.a.getClass();
        return mutablePropertyReference0Impl;
    }

    private final boolean getInterceptTouchEventNeeded() {
        return (this.horizontalScrollingEnabled || this.isTextFitting) ? false : true;
    }

    private final int getVisibleLineCount() {
        if (getLineCount() == 0) {
            return 1;
        }
        return getLineCount() > getMaxLines() ? getMaxLines() : getLineCount();
    }

    private final void remeasureWrapContentConstrained() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null || layoutParams.height != -3) {
            this.currentLineCount = getLineCount() != 0 ? getLineCount() > getMaxLines() ? getMaxLines() : getLineCount() : 1;
            return;
        }
        if (this.currentLineCount != (getLineCount() == 0 ? 1 : getLineCount() > getMaxLines() ? getMaxLines() : getLineCount())) {
            this.currentLineCount = getLineCount() != 0 ? getLineCount() > getMaxLines() ? getMaxLines() : getLineCount() : 1;
            requestLayout();
        }
    }

    private final void requestDisallowInterceptTouchEvent(boolean enabled) {
        this.isDisallowInterceptTouchEvent = enabled;
        getParent().requestDisallowInterceptTouchEvent(enabled);
    }

    private final void updateFittingText(int h) {
        if (getLayout() == null || h == 0) {
            return;
        }
        this.isTextFitting = (h - getCompoundPaddingTop()) - getCompoundPaddingBottom() >= ooc.C(this, getLayout().getLineCount());
    }

    public static /* synthetic */ void updateFittingText$default(SuperLineHeightEditText superLineHeightEditText, int i, int i2, Object obj) {
        if (obj != null) {
            w511.x("Super calls with default arguments not supported in this target, function: updateFittingText");
            return;
        }
        if ((i2 & 1) != 0) {
            i = superLineHeightEditText.getHeight();
        }
        superLineHeightEditText.updateFittingText(i);
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingBottom() {
        return super.getCompoundPaddingBottom() + this.fixedLineHeightHelper.c;
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingTop() {
        return super.getCompoundPaddingTop() + this.fixedLineHeightHelper.b;
    }

    public int getFixedLineHeight() {
        return this.fixedLineHeightHelper.d;
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        mer merVar = this.fixedLineHeightHelper;
        int maxLines = getLineCount() == 0 ? 1 : getLineCount() > getMaxLines() ? getMaxLines() : getLineCount();
        int i = merVar.d;
        TextView textView = merVar.a;
        if (i == -1 || q5z.I(heightMeasureSpec)) {
            return;
        }
        int paddingBottom = textView.getPaddingBottom() + textView.getPaddingTop() + ooc.C(textView, maxLines) + (maxLines >= textView.getLineCount() ? merVar.b + merVar.c : 0);
        int minimumHeight = textView.getMinimumHeight();
        if (paddingBottom < minimumHeight) {
            paddingBottom = minimumHeight;
        }
        super.setMeasuredDimension(getMeasuredWidthAndState(), View.MeasureSpec.getMode(heightMeasureSpec) == Integer.MIN_VALUE ? View.MeasureSpec.makeMeasureSpec(Math.min(paddingBottom, View.MeasureSpec.getSize(heightMeasureSpec)), Integer.MIN_VALUE) : View.MeasureSpec.makeMeasureSpec(paddingBottom, 1073741824));
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        updateFittingText(h);
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence text, int start, int lengthBefore, int lengthAfter) {
        super.onTextChanged(text, start, lengthBefore, lengthAfter);
        updateFittingText$default(this, 0, 1, null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        if (!getInterceptTouchEventNeeded()) {
            if (this.isDisallowInterceptTouchEvent) {
                requestDisallowInterceptTouchEvent(false);
            }
            return super.onTouchEvent(event);
        }
        int action = event.getAction() & 255;
        if (action == 0) {
            requestDisallowInterceptTouchEvent(true);
        } else if (action == 1 || action == 3) {
            requestDisallowInterceptTouchEvent(false);
        }
        return super.onTouchEvent(event);
    }

    @Override // defpackage.ner
    public void setFixedLineHeight(int i) {
        mer merVar = this.fixedLineHeightHelper;
        if (merVar.d == i) {
            return;
        }
        merVar.d = i;
        merVar.a(i);
    }

    @Override // android.widget.TextView
    public void setHorizontallyScrolling(boolean whether) {
        this.horizontalScrollingEnabled = whether;
        super.setHorizontallyScrolling(whether);
    }

    @Override // android.widget.TextView
    public void setTextSize(int unit, float size) {
        super.setTextSize(unit, size);
        mer merVar = this.fixedLineHeightHelper;
        merVar.a(merVar.d);
    }

    public SuperLineHeightEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public SuperLineHeightEditText(Context context) {
        this(context, null, 0, 6, null);
    }

    public SuperLineHeightEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.isTextFitting = true;
        this.fixedLineHeightHelper = new mer(this);
    }
}
