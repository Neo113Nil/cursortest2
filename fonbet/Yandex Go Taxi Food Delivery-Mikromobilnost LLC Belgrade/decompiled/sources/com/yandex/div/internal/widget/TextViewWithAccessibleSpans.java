package com.yandex.div.internal.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;
import androidx.core.view.b;
import com.yandex.div.core.view2.spannable.ImageSpan;
import defpackage.afv;
import defpackage.fuy0;
import defpackage.jl40;
import defpackage.scc;
import defpackage.tcc;
import defpackage.yh;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001:\u00013B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0012\u0010\fJ#\u0010\u0018\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001b\u001a\u00020\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001dH\u0014¢\u0006\u0004\b\u001f\u0010 J)\u0010&\u001a\u00020\n2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u00062\b\u0010%\u001a\u0004\u0018\u00010$H\u0014¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020!2\u0006\u0010)\u001a\u00020(H\u0014¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020!2\u0006\u0010)\u001a\u00020,H\u0016¢\u0006\u0004\b-\u0010.R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020\r0/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\r0/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00101R\u001a\u00104\u001a\b\u0018\u000103R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u00107\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108¨\u00069"}, d2 = {"Lcom/yandex/div/internal/widget/TextViewWithAccessibleSpans;", "Lcom/yandex/div/internal/widget/EllipsizedTextView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzy11;", "evaluateAndSetContentDescription", "()V", "Lcom/yandex/div/core/view2/spannable/ImageSpan;", "span", "addImageSpan$div_release", "(Lcom/yandex/div/core/view2/spannable/ImageSpan;)V", "addImageSpan", "clearImageSpans$div_release", "clearImageSpans", "", "text", "Landroid/widget/TextView$BufferType;", "type", "setText", "(Ljava/lang/CharSequence;Landroid/widget/TextView$BufferType;)V", "contentDescription", "setContentDescription", "(Ljava/lang/CharSequence;)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "", "gainFocus", "direction", "Landroid/graphics/Rect;", "previouslyFocusedRect", "onFocusChanged", "(ZILandroid/graphics/Rect;)V", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "dispatchHoverEvent", "(Landroid/view/MotionEvent;)Z", "Landroid/view/KeyEvent;", "dispatchKeyEvent", "(Landroid/view/KeyEvent;)Z", "", "accessibleImageSpans", "Ljava/util/List;", "imageSpans", "Lfuy0;", "spanHelper", "Lfuy0;", "", "_contentDescription", "Ljava/lang/String;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class TextViewWithAccessibleSpans extends EllipsizedTextView {
    private String _contentDescription;
    private final List<ImageSpan> accessibleImageSpans;
    private final List<ImageSpan> imageSpans;
    private final fuy0 spanHelper;

    /* loaded from: classes11.dex */
    public static final class a implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Integer.valueOf(((Number) obj2).intValue()).compareTo(Integer.valueOf(((Number) obj).intValue()));
        }
    }

    public TextViewWithAccessibleSpans(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.accessibleImageSpans = new ArrayList();
        this.imageSpans = new ArrayList();
        if (yh.b == null) {
            Object systemService = context.getSystemService("accessibility");
            AccessibilityManager accessibilityManager = systemService instanceof AccessibilityManager ? (AccessibilityManager) systemService : null;
            yh.b = accessibilityManager != null ? Boolean.valueOf(accessibilityManager.isTouchExplorationEnabled()) : Boolean.FALSE;
        }
        if (!jl40.l(yh.b, Boolean.TRUE)) {
            this.spanHelper = null;
            return;
        }
        fuy0 fuy0Var = new fuy0(this);
        this.spanHelper = fuy0Var;
        b.p(this, fuy0Var);
        setAccessibilityLiveRegion(1);
    }

    private final void evaluateAndSetContentDescription() {
        String str;
        if (!jl40.l(yh.b, Boolean.TRUE)) {
            super.setContentDescription(this._contentDescription);
            return;
        }
        List<ImageSpan> list = this.imageSpans;
        if (list == null || this._contentDescription != null) {
            str = this._contentDescription;
        } else {
            str = null;
            str = null;
            if (list.size() != 0 && getText().length() != 0) {
                CharSequence text = getText();
                SpannableString spannableString = text instanceof SpannableString ? (SpannableString) text : null;
                if (spannableString != null) {
                    List<ImageSpan> list2 = this.imageSpans;
                    ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
                    Iterator<T> it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Integer.valueOf(spannableString.getSpanStart((ImageSpan) it.next())));
                    }
                    List x0 = kotlin.collections.a.x0(arrayList, new a());
                    StringBuilder sb = new StringBuilder();
                    Iterator it2 = x0.iterator();
                    int i = 0;
                    while (it2.hasNext()) {
                        int intValue = ((Number) it2.next()).intValue();
                        sb.append(getText().subSequence(i, intValue));
                        i = intValue + 1;
                    }
                    sb.append(getText().subSequence(i, getText().length()));
                    str = sb.toString();
                } else {
                    str = getText().toString();
                }
            }
        }
        super.setContentDescription(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
    
        if ((r0 != null ? r0.c : null) != null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void addImageSpan$div_release(ImageSpan span) {
        if (jl40.l(yh.b, Boolean.TRUE)) {
            this.imageSpans.add(span);
            afv accessibility = span.getAccessibility();
            if ((accessibility != null ? accessibility.b : null) == null) {
                afv accessibility2 = span.getAccessibility();
            }
            this.accessibleImageSpans.add(span);
            fuy0 fuy0Var = this.spanHelper;
            if (fuy0Var != null) {
                fuy0Var.g(this.accessibleImageSpans.size() - 1, 0);
            }
        }
    }

    public final void clearImageSpans$div_release() {
        this.accessibleImageSpans.clear();
        this.imageSpans.clear();
        fuy0 fuy0Var = this.spanHelper;
        if (fuy0Var != null) {
            fuy0Var.g(-1, 1);
        }
        evaluateAndSetContentDescription();
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(MotionEvent event) {
        fuy0 fuy0Var = this.spanHelper;
        return (fuy0Var != null && fuy0Var.c(event)) || super.dispatchHoverEvent(event);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent event) {
        fuy0 fuy0Var = this.spanHelper;
        return (fuy0Var != null && fuy0Var.d(event)) || super.dispatchKeyEvent(event);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i = 0;
        for (Object obj : this.accessibleImageSpans) {
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            fuy0 fuy0Var = this.spanHelper;
            if (fuy0Var != null) {
                fuy0Var.g(i, 0);
            }
            i = i2;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onFocusChanged(boolean gainFocus, int direction, Rect previouslyFocusedRect) {
        super.onFocusChanged(gainFocus, direction, previouslyFocusedRect);
        fuy0 fuy0Var = this.spanHelper;
        if (fuy0Var != null) {
            fuy0Var.j(gainFocus, direction, previouslyFocusedRect);
        }
    }

    @Override // android.view.View
    public void setContentDescription(CharSequence contentDescription) {
        this._contentDescription = contentDescription != null ? contentDescription.toString() : null;
        super.setContentDescription(contentDescription);
    }

    @Override // com.yandex.div.internal.widget.EllipsizedTextView, android.widget.TextView
    public void setText(CharSequence text, TextView.BufferType type) {
        super.setText(text, type);
        evaluateAndSetContentDescription();
    }

    public /* synthetic */ TextViewWithAccessibleSpans(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
