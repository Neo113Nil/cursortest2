package xsna;

import android.graphics.Rect;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.VkLinkedTextView;
import java.util.List;

/* compiled from: VkLinkAccessibilityHelper.java */
@Deprecated
/* loaded from: classes17.dex */
public final class f2v0 extends hk {
    public final VkLinkedTextView b;
    public final Rect c = new Rect();
    public final a d;

    /* compiled from: VkLinkAccessibilityHelper.java */
    public class a extends y9q {
        public a(VkLinkedTextView vkLinkedTextView) {
            super(vkLinkedTextView);
        }

        @Override // xsna.y9q
        public final int getVirtualViewAt(float f, float f2) {
            int offsetForHorizontal;
            VkLinkedTextView vkLinkedTextView = f2v0.this.b;
            CharSequence text = vkLinkedTextView.getText();
            if (!(text instanceof Spanned)) {
                return Integer.MIN_VALUE;
            }
            Spanned spanned = (Spanned) text;
            if (vkLinkedTextView.getLayout() == null) {
                offsetForHorizontal = -1;
            } else {
                offsetForHorizontal = vkLinkedTextView.getLayout().getOffsetForHorizontal(vkLinkedTextView.getLayout().getLineForVertical((int) (Math.min((vkLinkedTextView.getHeight() - vkLinkedTextView.getTotalPaddingBottom()) - 1, Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2 - vkLinkedTextView.getTotalPaddingTop())) + vkLinkedTextView.getScrollY())), Math.min((vkLinkedTextView.getWidth() - vkLinkedTextView.getTotalPaddingRight()) - 1, Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f - vkLinkedTextView.getTotalPaddingLeft())) + vkLinkedTextView.getScrollX());
            }
            qku0[] qku0VarArr = (qku0[]) spanned.getSpans(offsetForHorizontal, offsetForHorizontal, qku0.class);
            if (qku0VarArr.length == 1) {
                return spanned.getSpanStart(qku0VarArr[0]);
            }
            return Integer.MIN_VALUE;
        }

        @Override // xsna.y9q
        public final void getVisibleVirtualViews(List<Integer> list) {
            CharSequence text = f2v0.this.b.getText();
            if (text instanceof Spanned) {
                Spanned spanned = (Spanned) text;
                for (qku0 qku0Var : (qku0[]) spanned.getSpans(0, spanned.length(), qku0.class)) {
                    list.add(Integer.valueOf(spanned.getSpanStart(qku0Var)));
                }
            }
        }

        @Override // xsna.y9q
        public final boolean onPerformActionForVirtualView(int i, int i2, Bundle bundle) {
            if (i2 != 16) {
                return false;
            }
            f2v0 f2v0Var = f2v0.this;
            qku0 a = f2v0Var.a(i);
            if (a != null) {
                f2v0Var.b.getContext();
                a.a();
                return true;
            }
            Log.e("VkLinkAccessibility", "LinkSpan is null for offset: " + i);
            return false;
        }

        @Override // xsna.y9q
        public final void onPopulateEventForVirtualView(int i, @NonNull AccessibilityEvent accessibilityEvent) {
            f2v0 f2v0Var = f2v0.this;
            VkLinkedTextView vkLinkedTextView = f2v0Var.b;
            qku0 a = f2v0Var.a(i);
            if (a == null) {
                Log.e("VkLinkAccessibility", "LinkSpan is null for offset: " + i);
                accessibilityEvent.setContentDescription(vkLinkedTextView.getText());
                return;
            }
            CharSequence text = vkLinkedTextView.getText();
            if (text instanceof Spanned) {
                Spanned spanned = (Spanned) text;
                text = spanned.subSequence(spanned.getSpanStart(a), spanned.getSpanEnd(a));
            }
            accessibilityEvent.setContentDescription(text);
        }

        @Override // xsna.y9q
        public final void onPopulateNodeForVirtualView(int i, @NonNull am amVar) {
            Layout layout;
            f2v0 f2v0Var = f2v0.this;
            VkLinkedTextView vkLinkedTextView = f2v0Var.b;
            Rect rect = f2v0Var.c;
            qku0 a = f2v0Var.a(i);
            if (a != null) {
                CharSequence text = vkLinkedTextView.getText();
                if (text instanceof Spanned) {
                    Spanned spanned = (Spanned) text;
                    text = spanned.subSequence(spanned.getSpanStart(a), spanned.getSpanEnd(a));
                }
                amVar.r(text);
            } else {
                Log.e("VkLinkAccessibility", "LinkSpan is null for offset: " + i);
                amVar.r(vkLinkedTextView.getText());
            }
            if (amVar.a.getContentDescription() == null) {
                amVar.r("");
            }
            amVar.t(true);
            amVar.o(true);
            CharSequence text2 = vkLinkedTextView.getText();
            rect.setEmpty();
            if ((text2 instanceof Spanned) && (layout = vkLinkedTextView.getLayout()) != null) {
                Spanned spanned2 = (Spanned) text2;
                int spanStart = spanned2.getSpanStart(a);
                int spanEnd = spanned2.getSpanEnd(a);
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
                    rect.offset(vkLinkedTextView.getTotalPaddingLeft(), vkLinkedTextView.getTotalPaddingTop());
                }
            }
            if (rect.isEmpty()) {
                Log.e("VkLinkAccessibility", "LinkSpan bounds is empty for: " + i);
                rect.set(0, 0, 1, 1);
            }
            amVar.j(rect);
            amVar.a(16);
        }
    }

    public f2v0(VkLinkedTextView vkLinkedTextView) {
        this.d = new a(vkLinkedTextView);
        this.b = vkLinkedTextView;
    }

    public final qku0 a(int i) {
        CharSequence text = this.b.getText();
        if (!(text instanceof Spanned)) {
            return null;
        }
        qku0[] qku0VarArr = (qku0[]) ((Spanned) text).getSpans(i, i, qku0.class);
        if (qku0VarArr.length == 1) {
            return qku0VarArr[0];
        }
        return null;
    }

    @Override // xsna.hk
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.d.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // xsna.hk
    public final bm getAccessibilityNodeProvider(View view) {
        return this.d.getAccessibilityNodeProvider(view);
    }

    @Override // xsna.hk
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.d.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // xsna.hk
    public final void onInitializeAccessibilityNodeInfo(View view, am amVar) {
        this.d.onInitializeAccessibilityNodeInfo(view, amVar);
    }

    @Override // xsna.hk
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.d.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // xsna.hk
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.d.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // xsna.hk
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        return this.d.performAccessibilityAction(view, i, bundle);
    }

    @Override // xsna.hk
    public final void sendAccessibilityEvent(View view, int i) {
        this.d.sendAccessibilityEvent(view, i);
    }

    @Override // xsna.hk
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.d.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
