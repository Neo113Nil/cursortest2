package xsna;

import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;

/* compiled from: ColorPickerAccessibilityDelegate.kt */
/* loaded from: classes12.dex */
public final class d7g extends hk {
    public static final Object e;
    public final j7g b;
    public final a c;
    public final Rect d = new Rect();

    /* compiled from: ColorPickerAccessibilityDelegate.kt */
    public final class a extends y9q {
        public a(j7g j7gVar) {
            super(j7gVar);
        }

        @Override // xsna.y9q
        public final int getVirtualViewAt(float f, float f2) {
            j7g j7gVar = d7g.this.b;
            t5g b = j7gVar.b(f, f2);
            if (b == null) {
                return j7gVar.getColorCircleList().size();
            }
            int indexOf = j7gVar.getColorCircleList().indexOf(b);
            return indexOf == -1 ? j7gVar.getColorCircleList().size() : indexOf;
        }

        @Override // xsna.y9q
        public final void getVisibleVirtualViews(List<Integer> list) {
            g5g.y(new k9x(0, d7g.this.b.getColorCircleList().size(), 1), list);
        }

        @Override // xsna.y9q
        public final boolean onPerformActionForVirtualView(int i, int i2, Bundle bundle) {
            j7g j7gVar = d7g.this.b;
            if (i2 != 16) {
                return false;
            }
            t5g t5gVar = (t5g) j5g.b0(i, j7gVar.getColorCircleList());
            if (t5gVar == null) {
                t5gVar = (t5g) j5g.Y(j7gVar.getColorCircleList());
            }
            j7gVar.setCurrentColorCircle(t5gVar);
            j7gVar.c();
            return true;
        }

        @Override // xsna.y9q
        public final void onPopulateEventForVirtualView(int i, AccessibilityEvent accessibilityEvent) {
            d7g d7gVar = d7g.this;
            j7g j7gVar = d7gVar.b;
            t5g t5gVar = (t5g) j5g.b0(i, j7gVar.getColorCircleList());
            accessibilityEvent.setContentDescription(t5gVar != null ? d7gVar.a(t5gVar.d) : j7gVar.getResources().getString(R.string.color_picker_choice_no_color));
        }

        @Override // xsna.y9q
        public final void onPopulateNodeForVirtualView(int i, am amVar) {
            d7g d7gVar = d7g.this;
            Rect rect = d7gVar.d;
            j7g j7gVar = d7gVar.b;
            t5g t5gVar = (t5g) j5g.b0(i, j7gVar.getColorCircleList());
            amVar.r(t5gVar != null ? d7gVar.a(t5gVar.d) : j7gVar.getResources().getString(R.string.color_picker_choice_no_color));
            amVar.t(true);
            amVar.o(true);
            if (t5gVar != null) {
                float f = t5gVar.a;
                float f2 = t5gVar.c;
                float f3 = t5gVar.b;
                rect.set((int) (f - f2), (int) (f3 - f2), (int) (f + f2), (int) (f3 + f2));
            }
            if (rect.isEmpty()) {
                rect.set(0, 0, 1, 1);
            }
            amVar.j(rect);
            amVar.a(16);
        }
    }

    static {
        Float valueOf = Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        Float valueOf2 = Float.valueOf(1.0f);
        List l = e43.l(valueOf, valueOf2, valueOf2);
        Integer valueOf3 = Integer.valueOf(R.string.color_picker_color_name_red);
        e = pn00.k(new Pair(l, valueOf3), new Pair(e43.l(Float.valueOf(30.0f), valueOf2, valueOf2), Integer.valueOf(R.string.color_picker_color_name_orange)), new Pair(e43.l(Float.valueOf(60.0f), valueOf2, valueOf2), Integer.valueOf(R.string.color_picker_color_name_yellow)), new Pair(e43.l(Float.valueOf(75.0f), valueOf2, valueOf2), Integer.valueOf(R.string.color_picker_color_name_light_green)), new Pair(e43.l(Float.valueOf(120.0f), valueOf2, valueOf2), Integer.valueOf(R.string.color_picker_color_name_green)), new Pair(e43.l(Float.valueOf(180.0f), valueOf2, valueOf2), Integer.valueOf(R.string.color_picker_color_name_turquoise)), new Pair(e43.l(Float.valueOf(230.0f), valueOf2, valueOf2), Integer.valueOf(R.string.color_picker_color_name_blue)), new Pair(e43.l(Float.valueOf(288.0f), valueOf2, valueOf2), Integer.valueOf(R.string.color_picker_color_name_purple)), new Pair(e43.l(Float.valueOf(306.0f), valueOf2, valueOf2), Integer.valueOf(R.string.color_picker_color_name_pink)), new Pair(e43.l(Float.valueOf(342.0f), valueOf2, valueOf2), valueOf3));
    }

    public d7g(j7g j7gVar) {
        this.b = j7gVar;
        this.c = new a(j7gVar);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.Map] */
    public final String a(float[] fArr) {
        Object next;
        float f = fArr[1];
        j7g j7gVar = this.b;
        int i = 2;
        if (f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && fArr[2] == 1.0f) {
            return j7gVar.getResources().getString(R.string.color_picker_color_name_white);
        }
        int i2 = 0;
        double d = 180;
        double cos = Math.cos((fArr[0] * 3.141592653589793d) / d) * f;
        double sin = Math.sin((fArr[0] * 3.141592653589793d) / d) * fArr[1];
        ?? r1 = e;
        Set<List> keySet = r1.keySet();
        ArrayList arrayList = new ArrayList(c5g.u(keySet, 10));
        for (List list : keySet) {
            double d2 = cos;
            double d3 = i;
            arrayList.add(new Pair(list, Double.valueOf(Math.pow((Math.sin((((Number) list.get(i2)).doubleValue() * 3.141592653589793d) / d) * ((Number) list.get(1)).doubleValue()) - sin, d3) + Math.pow((Math.cos((((Number) list.get(i2)).doubleValue() * 3.141592653589793d) / d) * ((Number) list.get(1)).doubleValue()) - d2, d3))));
            cos = d2;
            d = d;
            i = 2;
            i2 = 0;
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                double doubleValue = ((Number) ((Pair) next).j()).doubleValue();
                do {
                    Object next2 = it.next();
                    double doubleValue2 = ((Number) ((Pair) next2).j()).doubleValue();
                    if (Double.compare(doubleValue, doubleValue2) > 0) {
                        next = next2;
                        doubleValue = doubleValue2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Pair pair = (Pair) next;
        List list2 = pair != null ? (List) pair.i() : null;
        Resources resources = j7gVar.getResources();
        Integer num = (Integer) r1.get(list2);
        return resources.getString(num != null ? num.intValue() : R.string.color_picker_color_name_white);
    }

    @Override // xsna.hk
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.c.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // xsna.hk
    public final bm getAccessibilityNodeProvider(View view) {
        return this.c.getAccessibilityNodeProvider(view);
    }

    @Override // xsna.hk
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.c.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // xsna.hk
    public final void onInitializeAccessibilityNodeInfo(View view, am amVar) {
        this.c.onInitializeAccessibilityNodeInfo(view, amVar);
    }

    @Override // xsna.hk
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.c.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // xsna.hk
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.c.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // xsna.hk
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        return this.c.performAccessibilityAction(view, i, bundle);
    }

    @Override // xsna.hk
    public final void sendAccessibilityEvent(View view, int i) {
        this.c.sendAccessibilityEvent(view, i);
    }

    @Override // xsna.hk
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.c.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
