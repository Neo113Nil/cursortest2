package xsna;

import android.graphics.Rect;
import android.graphics.Region;
import android.util.ArrayMap;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.List;

/* compiled from: CompositeTouchDelegate.kt */
/* loaded from: classes4.dex */
public final class tui extends TouchDelegate {
    public final ArrayList a;
    public final List<Rect> b;
    public final a c;
    public final ArrayList d;
    public View e;
    public final int f;
    public AccessibilityNodeInfo.TouchDelegateInfo g;

    /* compiled from: CompositeTouchDelegate.kt */
    public static final class a {
    }

    public tui() {
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tui(ArrayList arrayList, ArrayList arrayList2) {
        super((Rect) j5g.Y(arrayList2), (View) j5g.Y(arrayList));
        a aVar = new a();
        this.a = arrayList;
        this.b = arrayList2;
        this.c = aVar;
        ArrayList arrayList3 = new ArrayList(arrayList2.size());
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            arrayList3.add(new Rect(this.b.get(i)));
        }
        this.d = arrayList3;
        this.f = ViewConfiguration.get(((View) j5g.Y(this.a)).getContext()).getScaledTouchSlop();
        int size2 = arrayList3.size();
        for (int i2 = 0; i2 < size2; i2++) {
            Rect rect = (Rect) this.d.get(i2);
            int i3 = -this.f;
            rect.inset(i3, i3);
        }
    }

    public static View a(int i, int i2, ArrayList arrayList, List list) {
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (((Rect) list.get(i3)).contains(i, i2)) {
                return (View) arrayList.get(i3);
            }
        }
        return null;
    }

    @Override // android.view.TouchDelegate
    public final AccessibilityNodeInfo.TouchDelegateInfo getTouchDelegateInfo() {
        AccessibilityNodeInfo.TouchDelegateInfo touchDelegateInfo = this.g;
        if (touchDelegateInfo != null) {
            return touchDelegateInfo;
        }
        ArrayList arrayList = this.a;
        ArrayMap arrayMap = new ArrayMap(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayMap.put(new Region(this.b.get(i)), arrayList.get(i));
        }
        t32.e();
        AccessibilityNodeInfo.TouchDelegateInfo c = s32.c(arrayMap);
        this.g = c;
        return c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
    
        if (r4 != 6) goto L25;
     */
    @Override // android.view.TouchDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        View a2;
        List<Rect> list = this.b;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            if (list.get(i).isEmpty()) {
                i++;
            } else {
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                int action = motionEvent.getAction();
                ArrayList arrayList = this.a;
                boolean z = true;
                if (action != 0) {
                    if (action != 1 && action != 2) {
                        a2 = null;
                        if (action == 3) {
                            View view = this.e;
                            this.e = null;
                            a2 = view;
                        } else if (action != 5) {
                        }
                    }
                    a2 = this.e;
                    if (a2 != null && a(x, y, arrayList, this.d) == null) {
                        z = false;
                    }
                } else {
                    a2 = a(x, y, arrayList, list);
                    this.e = a2;
                }
                if (a2 != null) {
                    if (z) {
                        this.c.getClass();
                        motionEvent.setLocation(a2.getWidth() / 2.0f, a2.getHeight() / 2.0f);
                    } else {
                        float f = -(this.f * 2.0f);
                        motionEvent.setLocation(f, f);
                    }
                    return a2.dispatchTouchEvent(motionEvent);
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    @Override // android.view.TouchDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchExplorationHoverEvent(MotionEvent motionEvent) {
        boolean z;
        View view;
        List<Rect> list = this.b;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            if (list.get(i).isEmpty()) {
                i++;
            } else {
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                ArrayList arrayList = this.a;
                View a2 = a(x, y, arrayList, list);
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked != 7) {
                    if (actionMasked == 9) {
                        this.e = a2;
                    }
                } else if (a2 != null) {
                    this.e = a2;
                } else if (this.e != null && a(x, y, arrayList, this.d) != null) {
                    z = false;
                    view = this.e;
                    if (view != null) {
                        if (z) {
                            this.c.getClass();
                            motionEvent.setLocation(view.getWidth() / 2.0f, view.getHeight() / 2.0f);
                        } else {
                            this.e = null;
                        }
                        return view.dispatchGenericMotionEvent(motionEvent);
                    }
                }
                z = true;
                view = this.e;
                if (view != null) {
                }
            }
        }
        return false;
    }
}
