package com.yandex.div.internal.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.TextView;
import com.yandex.div.core.util.AccessibilityStateProvider;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.spannable.ImageSpan;
import com.yandex.div.core.view2.spannable.SpannedTextBuilder;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import xsna.am;
import xsna.c5g;
import xsna.e43;
import xsna.epx;
import xsna.iut0;
import xsna.j5g;
import xsna.jw5;
import xsna.uik0;
import xsna.y9q;

/* compiled from: TextViewWithAccessibleSpans.kt */
/* loaded from: classes7.dex */
public class TextViewWithAccessibleSpans extends EllipsizedTextView {
    private String _contentDescription;
    private final List<ImageSpan> accessibleImageSpans;
    private final List<ImageSpan> imageSpans;
    private final SpanHelper spanHelper;

    /* compiled from: TextViewWithAccessibleSpans.kt */
    public final class SpanHelper extends y9q {
        public SpanHelper() {
            super(TextViewWithAccessibleSpans.this);
        }

        private final ImageSpan getSpanForId(int i) {
            if (i != -1 && TextViewWithAccessibleSpans.this.accessibleImageSpans.size() != 0 && i < TextViewWithAccessibleSpans.this.accessibleImageSpans.size() && i >= 0) {
                return (ImageSpan) TextViewWithAccessibleSpans.this.accessibleImageSpans.get(i);
            }
            return null;
        }

        @Override // xsna.y9q
        public int getVirtualViewAt(float f, float f2) {
            RectF rectF = new RectF();
            List list = TextViewWithAccessibleSpans.this.accessibleImageSpans;
            TextViewWithAccessibleSpans textViewWithAccessibleSpans = TextViewWithAccessibleSpans.this;
            int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                if (i < 0) {
                    e43.t();
                    throw null;
                }
                ((ImageSpan) obj).getBoundsInText(rectF).offset(textViewWithAccessibleSpans.getPaddingLeft(), textViewWithAccessibleSpans.getPaddingTop());
                if (rectF.contains(f, f2)) {
                    return i;
                }
                i = i2;
            }
            return -1;
        }

        @Override // xsna.y9q
        public void getVisibleVirtualViews(List<Integer> list) {
            int i = 0;
            for (Object obj : TextViewWithAccessibleSpans.this.accessibleImageSpans) {
                int i2 = i + 1;
                if (i < 0) {
                    e43.t();
                    throw null;
                }
                list.add(Integer.valueOf(i));
                i = i2;
            }
        }

        @Override // xsna.y9q
        public boolean onPerformActionForVirtualView(int i, int i2, Bundle bundle) {
            ImageSpan.Accessibility accessibility$div_release;
            ImageSpan.OnAccessibilityClickAction onClickAction;
            ImageSpan spanForId = getSpanForId(i);
            if (spanForId == null || (accessibility$div_release = spanForId.getAccessibility$div_release()) == null || (onClickAction = accessibility$div_release.getOnClickAction()) == null || i2 != 16) {
                return false;
            }
            uik0 uik0Var = (uik0) onClickAction;
            SpannedTextBuilder.addImageSpan$lambda$22$lambda$21$lambda$20((Div2View) uik0Var.b, (BindingContext) uik0Var.c, (TextView) uik0Var.d, (List) uik0Var.e);
            return true;
        }

        @Override // xsna.y9q
        public void onPopulateNodeForVirtualView(int i, am amVar) {
            String str;
            ImageSpan spanForId = getSpanForId(i);
            if (spanForId == null) {
                return;
            }
            ImageSpan.Accessibility accessibility$div_release = spanForId.getAccessibility$div_release();
            if (accessibility$div_release == null || (str = accessibility$div_release.getAccessibilityType()) == null) {
                str = "";
            }
            amVar.n(str);
            amVar.a.setPackageName(TextViewWithAccessibleSpans.this.getContext().getPackageName());
            Rect boundsInText = spanForId.getBoundsInText(new Rect());
            TextViewWithAccessibleSpans textViewWithAccessibleSpans = TextViewWithAccessibleSpans.this;
            boundsInText.offset(textViewWithAccessibleSpans.getPaddingLeft(), textViewWithAccessibleSpans.getPaddingTop());
            ImageSpan.Accessibility accessibility$div_release2 = spanForId.getAccessibility$div_release();
            amVar.r(accessibility$div_release2 != null ? accessibility$div_release2.getContentDescription() : null);
            ImageSpan.Accessibility accessibility$div_release3 = spanForId.getAccessibility$div_release();
            if ((accessibility$div_release3 != null ? accessibility$div_release3.getOnClickAction() : null) == null) {
                amVar.o(false);
            } else {
                amVar.o(true);
                amVar.a(16);
            }
            amVar.j(boundsInText);
        }
    }

    public TextViewWithAccessibleSpans(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.accessibleImageSpans = new ArrayList();
        this.imageSpans = new ArrayList();
        AccessibilityStateProvider.Companion companion = AccessibilityStateProvider.Companion;
        companion.evaluateTouchModeEnabled(context);
        if (!epx.f(companion.getTouchExplorationEnabled(), Boolean.TRUE)) {
            this.spanHelper = null;
            return;
        }
        SpanHelper spanHelper = new SpanHelper();
        this.spanHelper = spanHelper;
        iut0.q(this, spanHelper);
        setAccessibilityLiveRegion(1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b5, code lost:
    
        if (r1 == null) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void evaluateAndSetContentDescription() {
        String str;
        if (!epx.f(AccessibilityStateProvider.Companion.getTouchExplorationEnabled(), Boolean.TRUE)) {
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
                    ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
                    Iterator<T> it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Integer.valueOf(spannableString.getSpanStart((ImageSpan) it.next())));
                    }
                    List D0 = j5g.D0(new Comparator() { // from class: com.yandex.div.internal.widget.TextViewWithAccessibleSpans$evaluateAndSetContentDescription$lambda$3$$inlined$sortedByDescending$1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.util.Comparator
                        public final int compare(T t, T t2) {
                            return jw5.b(Integer.valueOf(((Number) t2).intValue()), Integer.valueOf(((Number) t).intValue()));
                        }
                    }, arrayList);
                    StringBuilder sb = new StringBuilder();
                    Iterator it2 = D0.iterator();
                    int i = 0;
                    while (it2.hasNext()) {
                        int intValue = ((Number) it2.next()).intValue();
                        sb.append(getText().subSequence(i, intValue));
                        i = intValue + 1;
                    }
                    sb.append(getText().subSequence(i, getText().length()));
                    str = sb.toString();
                }
                str = getText().toString();
            }
        }
        super.setContentDescription(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
    
        if ((r0 != null ? r0.getOnClickAction() : null) != null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void addImageSpan$div_release(ImageSpan imageSpan) {
        if (epx.f(AccessibilityStateProvider.Companion.getTouchExplorationEnabled(), Boolean.TRUE)) {
            this.imageSpans.add(imageSpan);
            ImageSpan.Accessibility accessibility$div_release = imageSpan.getAccessibility$div_release();
            if ((accessibility$div_release != null ? accessibility$div_release.getContentDescription() : null) == null) {
                ImageSpan.Accessibility accessibility$div_release2 = imageSpan.getAccessibility$div_release();
            }
            this.accessibleImageSpans.add(imageSpan);
            SpanHelper spanHelper = this.spanHelper;
            if (spanHelper != null) {
                spanHelper.invalidateVirtualView(this.accessibleImageSpans.size() - 1);
            }
        }
    }

    public final void clearImageSpans$div_release() {
        this.accessibleImageSpans.clear();
        this.imageSpans.clear();
        SpanHelper spanHelper = this.spanHelper;
        if (spanHelper != null) {
            spanHelper.invalidateRoot();
        }
        evaluateAndSetContentDescription();
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        SpanHelper spanHelper = this.spanHelper;
        return (spanHelper != null && spanHelper.dispatchHoverEvent(motionEvent)) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        SpanHelper spanHelper = this.spanHelper;
        return (spanHelper != null && spanHelper.dispatchKeyEvent(keyEvent)) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i = 0;
        for (Object obj : this.accessibleImageSpans) {
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            SpanHelper spanHelper = this.spanHelper;
            if (spanHelper != null) {
                spanHelper.invalidateVirtualView(i);
            }
            i = i2;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        SpanHelper spanHelper = this.spanHelper;
        if (spanHelper != null) {
            spanHelper.onFocusChanged(z, i, rect);
        }
    }

    @Override // android.view.View
    public void setContentDescription(CharSequence charSequence) {
        this._contentDescription = charSequence != null ? charSequence.toString() : null;
        super.setContentDescription(charSequence);
    }

    @Override // com.yandex.div.internal.widget.EllipsizedTextView, android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        evaluateAndSetContentDescription();
    }
}
