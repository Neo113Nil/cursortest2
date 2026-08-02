package xsna;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import com.vkontakte.android.R;
import java.util.List;

/* compiled from: ReactionsAccessibilityDelegate.kt */
/* loaded from: classes18.dex */
public final class r2f0 extends hk {
    public final m3r b;
    public final z5f0 c;
    public final a d;
    public final Rect e = new Rect();

    /* compiled from: ReactionsAccessibilityDelegate.kt */
    public final class a extends y9q {
        public a(m3r m3rVar) {
            super(m3rVar);
        }

        @Override // xsna.y9q
        public final int getVirtualViewAt(float f, float f2) {
            int i;
            m3r m3rVar = r2f0.this.b;
            int i2 = m3rVar.k;
            if (m3rVar.O.a()) {
                boolean z = m3rVar.C;
                Rect rect = m3rVar.I;
                if (!z) {
                    m3rVar.getGlobalVisibleRect(rect);
                }
                w1r[] reactionContainerViews = m3rVar.M.getReactionContainerViews();
                int length = reactionContainerViews.length;
                i = 0;
                while (i < length) {
                    w1r w1rVar = reactionContainerViews[i];
                    Rect rect2 = w1rVar.c;
                    w1rVar.getGlobalVisibleRect(rect2);
                    int i3 = rect2.left;
                    if (f >= (i3 - m3rVar.i) - rect.left && f <= ((w1rVar.getMeasuredWidth() + i3) + m3rVar.j) - rect.left) {
                        int i4 = rect2.top;
                        if (f2 >= (i4 - i2) - rect.top && f2 <= ((w1rVar.getMeasuredHeight() + i4) + i2) - rect.top) {
                            break;
                        }
                    }
                    i++;
                }
            }
            i = -1;
            return (i == -1 || i < 0) ? m3rVar.getReactions().size() : i;
        }

        @Override // xsna.y9q
        public final void getVisibleVirtualViews(List<Integer> list) {
            m3r m3rVar = r2f0.this.b;
            int size = m3rVar.getReactions().size();
            for (int i = 0; i < size; i++) {
                list.add(Integer.valueOf(i));
            }
            list.add(Integer.valueOf(m3rVar.getReactions().size()));
        }

        @Override // xsna.y9q
        public final boolean onPerformActionForVirtualView(int i, int i2, Bundle bundle) {
            r2f0 r2f0Var = r2f0.this;
            m3r m3rVar = r2f0Var.b;
            if (i2 != 16) {
                return false;
            }
            if (((f2f0) j5g.b0(i, m3rVar.getReactions())) != null) {
                r2f0Var.c.f.c(i);
                return true;
            }
            m3rVar.c();
            z5f0 z5f0Var = m3rVar.P;
            z5f0Var.o = true;
            z5f0Var.a();
            z5f0Var.f.b();
            return true;
        }

        @Override // xsna.y9q
        public final void onPopulateEventForVirtualView(int i, AccessibilityEvent accessibilityEvent) {
            m3r m3rVar = r2f0.this.b;
            f2f0 f2f0Var = (f2f0) j5g.b0(i, m3rVar.getReactions());
            if (f2f0Var != null) {
                accessibilityEvent.setContentDescription(f2f0Var.d());
            } else {
                accessibilityEvent.setContentDescription(m3rVar.getResources().getString(R.string.ui_accessibility_close));
            }
        }

        @Override // xsna.y9q
        public final void onPopulateNodeForVirtualView(int i, am amVar) {
            r2f0 r2f0Var = r2f0.this;
            Rect rect = r2f0Var.e;
            m3r m3rVar = r2f0Var.b;
            String string = m3rVar.getResources().getString(R.string.ui_accessibility_close);
            f2f0 f2f0Var = (f2f0) j5g.b0(i, m3rVar.getReactions());
            String d = f2f0Var != null ? f2f0Var.d() : null;
            if (d != null) {
                string = d;
            }
            amVar.r(string);
            amVar.t(true);
            amVar.o(true);
            int i2 = m3rVar.k;
            boolean z = m3rVar.C;
            Rect rect2 = m3rVar.I;
            if (!z) {
                m3rVar.getGlobalVisibleRect(rect2);
            }
            w1r w1rVar = (w1r) rl3.S(i, m3rVar.M.getReactionContainerViews());
            if (w1rVar != null) {
                Rect rect3 = w1rVar.c;
                w1rVar.getGlobalVisibleRect(rect3);
                int i3 = rect3.left;
                rect.set((i3 - m3rVar.i) - rect2.left, (rect3.top - i2) - rect2.top, ((w1rVar.getMeasuredWidth() + i3) + m3rVar.j) - rect2.left, ((w1rVar.getMeasuredHeight() + rect3.top) + i2) - rect2.top);
            } else {
                rect.set(rect2);
            }
            if (rect.isEmpty()) {
                rect.set(0, 0, 1, 1);
            }
            amVar.j(rect);
            amVar.a(16);
        }
    }

    public r2f0(m3r m3rVar, z5f0 z5f0Var) {
        this.b = m3rVar;
        this.c = z5f0Var;
        this.d = new a(m3rVar);
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
