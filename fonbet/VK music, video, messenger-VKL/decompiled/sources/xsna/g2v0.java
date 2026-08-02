package xsna;

import android.graphics.Rect;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spanned;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.text.links.VkLinkedText;
import com.vk.core.view.text.SquareExcerptTextView;
import java.util.List;
import java.util.NoSuchElementException;
import xsna.am;

/* compiled from: VkLinkAccessibilityHelper.kt */
/* loaded from: classes17.dex */
public class g2v0 extends y9q {
    public final VkLinkedText b;
    public final ye40 c;
    public final Rect d;
    public boolean e;
    public CharSequence f;
    public w6u0 g;

    public g2v0(VkLinkedText vkLinkedText) {
        super(vkLinkedText);
        this.b = vkLinkedText;
        this.c = new ye40(28);
        this.d = new Rect();
        this.f = vkLinkedText.getContentDescription();
    }

    public final l2v0 a(int i) {
        CharSequence text = this.b.getText();
        if (!(text instanceof Spanned)) {
            return null;
        }
        l2v0[] l2v0VarArr = (l2v0[]) ((Spanned) text).getSpans(i, i, l2v0.class);
        if (l2v0VarArr.length == 1) {
            return l2v0VarArr[0];
        }
        return null;
    }

    public final CharSequence b(l2v0 l2v0Var) {
        if (l2v0Var instanceof llv0) {
            return ((llv0) l2v0Var).getContentDescription();
        }
        CharSequence text = this.b.getText();
        if (!(text instanceof Spanned)) {
            return text;
        }
        Spanned spanned = (Spanned) text;
        return spanned.subSequence(spanned.getSpanStart(l2v0Var), spanned.getSpanEnd(l2v0Var));
    }

    @Override // xsna.y9q
    public int getVirtualViewAt(float f, float f2) {
        int offsetForHorizontal;
        VkLinkedText vkLinkedText = this.b;
        CharSequence text = vkLinkedText.getText();
        if (!(text instanceof Spanned)) {
            return Integer.MIN_VALUE;
        }
        if (vkLinkedText.getLayout() == null) {
            offsetForHorizontal = -1;
        } else {
            offsetForHorizontal = vkLinkedText.getLayout().getOffsetForHorizontal(vkLinkedText.getLayout().getLineForVertical((int) (Math.min((vkLinkedText.getHeight() - vkLinkedText.getTotalPaddingBottom()) - 1, Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2 - vkLinkedText.getTotalPaddingTop())) + vkLinkedText.getScrollY())), Math.min((vkLinkedText.getWidth() - vkLinkedText.getTotalPaddingRight()) - 1, Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f - vkLinkedText.getTotalPaddingLeft())) + vkLinkedText.getScrollX());
        }
        Spanned spanned = (Spanned) text;
        l2v0[] l2v0VarArr = (l2v0[]) spanned.getSpans(offsetForHorizontal, offsetForHorizontal, l2v0.class);
        if (l2v0VarArr.length == 1) {
            return spanned.getSpanStart(l2v0VarArr[0]);
        }
        return Integer.MIN_VALUE;
    }

    @Override // xsna.y9q
    public void getVisibleVirtualViews(List<Integer> list) {
        VkLinkedText vkLinkedText = this.b;
        CharSequence text = vkLinkedText.getText();
        if (!(text instanceof Spanned)) {
            return;
        }
        Spanned spanned = (Spanned) text;
        l2v0[] l2v0VarArr = (l2v0[]) spanned.getSpans(0, spanned.length(), l2v0.class);
        int i = 0;
        while (true) {
            if (!(i < l2v0VarArr.length)) {
                return;
            }
            int i2 = i + 1;
            try {
                l2v0 l2v0Var = l2v0VarArr[i];
                Layout layout = vkLinkedText.getLayout();
                if (layout != null && spanned.getSpanStart(l2v0Var) <= layout.getLineEnd(layout.getLineCount() - 1)) {
                    list.add(Integer.valueOf(spanned.getSpanStart(l2v0Var)));
                }
                i = i2;
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new NoSuchElementException(e.getMessage());
            }
        }
    }

    @Override // xsna.y9q, xsna.hk
    public final void onInitializeAccessibilityNodeInfo(View view, am amVar) {
        super.onInitializeAccessibilityNodeInfo(view, amVar);
        w6u0 w6u0Var = this.g;
        if (w6u0Var != null) {
            am.a aVar = ((bio0) ((bx80) w6u0Var).c).P;
            SquareExcerptTextView squareExcerptTextView = view instanceof SquareExcerptTextView ? (SquareExcerptTextView) view : null;
            if (squareExcerptTextView == null || !squareExcerptTextView.k) {
                amVar.b(aVar);
            } else {
                amVar.i(aVar);
            }
        }
    }

    @Override // xsna.y9q
    public boolean onPerformActionForVirtualView(int i, int i2, Bundle bundle) {
        if (i2 != 16) {
            return false;
        }
        l2v0 a = a(i);
        if (a != null) {
            VkLinkedText vkLinkedText = this.b;
            a.f(vkLinkedText.getContext(), vkLinkedText);
            return true;
        }
        new IllegalStateException(lhg.a(i, "LinkSpan is null for offset: "));
        this.c.getClass();
        s3q0 s3q0Var = s3q0.a;
        return false;
    }

    @Override // xsna.y9q
    public void onPopulateEventForVirtualView(int i, AccessibilityEvent accessibilityEvent) {
        l2v0 a = a(i);
        if (a != null) {
            accessibilityEvent.setContentDescription(b(a));
            return;
        }
        new IllegalStateException(lhg.a(i, "LinkSpan is null for offset: "));
        this.c.getClass();
        s3q0 s3q0Var = s3q0.a;
        accessibilityEvent.setContentDescription(this.f);
    }

    @Override // xsna.y9q
    public void onPopulateNodeForVirtualView(int i, am amVar) {
        Layout layout;
        l2v0 a = a(i);
        ye40 ye40Var = this.c;
        if (a != null) {
            amVar.r(b(a));
        } else {
            new IllegalStateException(lhg.a(i, "LinkSpan is null for offset: "));
            ye40Var.getClass();
            s3q0 s3q0Var = s3q0.a;
            amVar.r(this.f);
        }
        if (amVar.a.getContentDescription() == null) {
            amVar.r("");
        }
        amVar.t(true);
        amVar.o(true);
        Rect rect = this.d;
        rect.setEmpty();
        VkLinkedText vkLinkedText = this.b;
        CharSequence text = vkLinkedText.getText();
        Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
        if (spanned != null && (layout = vkLinkedText.getLayout()) != null) {
            int spanStart = spanned.getSpanStart(a);
            int spanEnd = spanned.getSpanEnd(a);
            int lineEnd = layout.getLineEnd(layout.getLineCount() - 1);
            if (spanStart <= lineEnd) {
                if (spanEnd > lineEnd) {
                    spanEnd = lineEnd;
                }
                float primaryHorizontal = layout.getPrimaryHorizontal(spanStart);
                float primaryHorizontal2 = layout.getPrimaryHorizontal(spanEnd);
                int lineForOffset = layout.getLineForOffset(spanStart);
                int lineForOffset2 = layout.getLineForOffset(spanEnd);
                layout.getLineBounds(lineForOffset, rect);
                if (lineForOffset2 == lineForOffset) {
                    rect.left = (int) Math.min(primaryHorizontal, primaryHorizontal2);
                    rect.right = (int) Math.max(primaryHorizontal, primaryHorizontal2);
                } else if (layout.getParagraphDirection(lineForOffset) == -1) {
                    rect.right = (int) primaryHorizontal;
                } else {
                    rect.left = (int) primaryHorizontal;
                }
                rect.offset(vkLinkedText.getTotalPaddingLeft(), vkLinkedText.getTotalPaddingTop());
            }
        }
        if (rect.isEmpty()) {
            new IllegalStateException(lhg.a(i, "LinkSpan bounds is empty for: "));
            ye40Var.getClass();
            s3q0 s3q0Var2 = s3q0.a;
            rect.set(0, 0, 1, 1);
        }
        amVar.j(rect);
        amVar.a(16);
    }
}
