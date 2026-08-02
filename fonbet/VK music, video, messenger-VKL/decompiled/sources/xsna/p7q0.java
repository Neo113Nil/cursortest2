package xsna;

import android.graphics.Rect;
import android.graphics.Region;
import android.util.ArrayMap;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: UpdatableTouchDelegate.kt */
/* loaded from: classes17.dex */
public final class p7q0 extends TouchDelegate {
    public final Rect a;
    public final View b;
    public final a c;
    public final Rect d;
    public boolean e;
    public final int f;
    public AccessibilityNodeInfo.TouchDelegateInfo g;

    /* compiled from: UpdatableTouchDelegate.kt */
    public interface a {
        float a(MotionEvent motionEvent);

        float getY();
    }

    public p7q0(Rect rect, View view, a aVar) {
        super(rect, view);
        this.a = rect;
        this.b = view;
        this.c = aVar;
        Rect rect2 = new Rect(rect);
        this.d = rect2;
        int scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.f = scaledTouchSlop;
        rect2.inset(-scaledTouchSlop, -scaledTouchSlop);
    }

    @Override // android.view.TouchDelegate
    public final AccessibilityNodeInfo.TouchDelegateInfo getTouchDelegateInfo() {
        AccessibilityNodeInfo.TouchDelegateInfo touchDelegateInfo = this.g;
        if (touchDelegateInfo != null) {
            return touchDelegateInfo;
        }
        ArrayMap arrayMap = new ArrayMap(1);
        arrayMap.put(new Region(this.a), this.b);
        t32.e();
        AccessibilityNodeInfo.TouchDelegateInfo c = s32.c(arrayMap);
        this.g = c;
        return c;
    }

    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean contains;
        Rect rect = this.a;
        if (!rect.isEmpty()) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z = true;
            if (action != 0) {
                if (action != 1 && action != 2) {
                    if (action == 3) {
                        contains = this.e;
                        this.e = false;
                    } else if (action != 5 && action != 6) {
                        contains = false;
                    }
                }
                contains = this.e;
                if (contains && !this.d.contains(x, y)) {
                    z = false;
                }
            } else {
                contains = rect.contains(x, y);
                this.e = contains;
            }
            if (contains) {
                if (z) {
                    a aVar = this.c;
                    motionEvent.setLocation(aVar.a(motionEvent), aVar.getY());
                } else {
                    float f = -(this.f * 2.0f);
                    motionEvent.setLocation(f, f);
                }
                return this.b.dispatchTouchEvent(motionEvent);
            }
        }
        return false;
    }

    @Override // android.view.TouchDelegate
    public final boolean onTouchExplorationHoverEvent(MotionEvent motionEvent) {
        Rect rect = this.a;
        if (!rect.isEmpty()) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            boolean contains = rect.contains(x, y);
            int actionMasked = motionEvent.getActionMasked();
            boolean z = true;
            if (actionMasked != 7) {
                if (actionMasked == 9) {
                    this.e = contains;
                } else if (actionMasked == 10) {
                    this.e = true;
                }
            } else if (contains) {
                this.e = true;
            } else if (this.e && !this.d.contains(x, y)) {
                z = false;
            }
            if (this.e) {
                if (z) {
                    a aVar = this.c;
                    motionEvent.setLocation(aVar.a(motionEvent), aVar.getY());
                } else {
                    this.e = false;
                }
                return this.b.dispatchGenericMotionEvent(motionEvent);
            }
        }
        return false;
    }
}
