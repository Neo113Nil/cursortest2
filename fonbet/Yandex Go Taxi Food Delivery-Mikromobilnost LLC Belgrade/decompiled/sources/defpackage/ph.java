package defpackage;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes.dex */
public final class ph {
    public static final ph e = new ph(1, (CharSequence) null);
    public static final ph f = new ph(2, (CharSequence) null);
    public static final ph g;
    public static final ph h;
    public static final ph i;
    public static final ph j;
    public static final ph k;
    public static final ph l;
    public static final ph m;
    public static final ph n;
    public static final ph o;
    public static final ph p;
    public static final ph q;
    public static final ph r;
    public static final ph s;
    public static final ph t;
    public static final ph u;
    public static final ph v;
    public final Object a;
    public final int b;
    public final Class c;
    public final pi d;

    static {
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction2;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction3;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction4;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction5;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction6;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction7;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction8;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction9;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction10;
        new ph(4, (CharSequence) null);
        new ph(8, (CharSequence) null);
        g = new ph(16, (CharSequence) null);
        h = new ph(32, (CharSequence) null);
        i = new ph(64, (CharSequence) null);
        j = new ph(128, (CharSequence) null);
        new ph(256, ii.class);
        new ph(512, ii.class);
        new ph(1024, ji.class);
        new ph(2048, ji.class);
        k = new ph(4096, (CharSequence) null);
        l = new ph(8192, (CharSequence) null);
        new ph(16384, (CharSequence) null);
        new ph(32768, (CharSequence) null);
        new ph(65536, (CharSequence) null);
        new ph(131072, ni.class);
        m = new ph(262144, (CharSequence) null);
        n = new ph(524288, (CharSequence) null);
        o = new ph(1048576, (CharSequence) null);
        new ph(2097152, oi.class);
        new ph(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
        p = new ph(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, li.class);
        q = new ph(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
        r = new ph(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
        s = new ph(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
        t = new ph(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
        new ph(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP, R.id.accessibilityActionPageUp, null, null, null);
        new ph(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN, R.id.accessibilityActionPageDown, null, null, null);
        new ph(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT, R.id.accessibilityActionPageLeft, null, null, null);
        new ph(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT, R.id.accessibilityActionPageRight, null, null, null);
        new ph(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
        u = new ph(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, mi.class);
        new ph(AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW, R.id.accessibilityActionMoveWindow, null, null, ki.class);
        new ph(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP, R.id.accessibilityActionShowTooltip, null, null, null);
        new ph(AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP, R.id.accessibilityActionHideTooltip, null, null, null);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            accessibilityAction10 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD;
            accessibilityAction = accessibilityAction10;
        } else {
            accessibilityAction = null;
        }
        new ph(accessibilityAction, R.id.accessibilityActionPressAndHold, null, null, null);
        if (i2 >= 30) {
            accessibilityAction9 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
            accessibilityAction2 = accessibilityAction9;
        } else {
            accessibilityAction2 = null;
        }
        new ph(accessibilityAction2, R.id.accessibilityActionImeEnter, null, null, null);
        new ph(i2 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
        if (i2 >= 32) {
            accessibilityAction8 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP;
            accessibilityAction3 = accessibilityAction8;
        } else {
            accessibilityAction3 = null;
        }
        new ph(accessibilityAction3, R.id.accessibilityActionDragDrop, null, null, null);
        if (i2 >= 32) {
            accessibilityAction7 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
            accessibilityAction4 = accessibilityAction7;
        } else {
            accessibilityAction4 = null;
        }
        new ph(accessibilityAction4, R.id.accessibilityActionDragCancel, null, null, null);
        if (i2 >= 33) {
            accessibilityAction6 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
            accessibilityAction5 = accessibilityAction6;
        } else {
            accessibilityAction5 = null;
        }
        new ph(accessibilityAction5, R.id.accessibilityActionShowTextSuggestions, null, null, null);
        v = new ph(i2 >= 34 ? jh.b() : null, R.id.accessibilityActionScrollInDirection, null, null, null);
    }

    public ph(Object obj, int i2, CharSequence charSequence, pi piVar, Class cls) {
        this.b = i2;
        this.d = piVar;
        if (obj == null) {
            this.a = new AccessibilityNodeInfo.AccessibilityAction(i2, charSequence);
        } else {
            this.a = obj;
        }
        this.c = cls;
    }

    public final int a() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.a).getId();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ph)) {
            return false;
        }
        Object obj2 = ((ph) obj).a;
        Object obj3 = this.a;
        return obj3 == null ? obj2 == null : obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String d = wh.d(this.b);
        if (d.equals("ACTION_UNKNOWN")) {
            Object obj = this.a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                d = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb.append(d);
        return sb.toString();
    }

    public ph(int i2, Class cls) {
        this(null, i2, null, null, cls);
    }

    public ph(int i2, CharSequence charSequence) {
        this(null, i2, charSequence, null, null);
    }
}
