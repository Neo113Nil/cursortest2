package defpackage;

import android.graphics.RenderEffect;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.b;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Pair;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes11.dex */
public abstract class nja1 {
    public static String a(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    public static boolean c(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str);
    }

    public static boolean d(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals(str);
    }

    public static final void e(ViewGroup viewGroup, ArrayList arrayList) {
        Pair pair;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt.getVisibility() != 0) {
                pair = new Pair(null, Boolean.TRUE);
            } else {
                WeakHashMap weakHashMap = b.a;
                int importantForAccessibility = childAt.getImportantForAccessibility();
                if (importantForAccessibility == 0 || importantForAccessibility == 1) {
                    int i2 = Build.VERSION.SDK_INT;
                    AccessibilityNodeInfo r = i2 >= 30 ? ai.r(childAt) : AccessibilityNodeInfo.obtain(childAt);
                    childAt.onInitializeAccessibilityNodeInfo(r);
                    if (r.isClickable() || !r.isEnabled()) {
                        if (i2 < 33) {
                            r.recycle();
                        }
                        pair = new Pair(null, Boolean.TRUE);
                    } else {
                        CharSequence contentDescription = r.getContentDescription();
                        if (TextUtils.isEmpty(contentDescription)) {
                            CharSequence text = r.getText();
                            if (i2 < 33) {
                                r.recycle();
                            }
                            pair = new Pair(text, Boolean.FALSE);
                        } else {
                            if (i2 < 33) {
                                r.recycle();
                            }
                            pair = new Pair(contentDescription, Boolean.TRUE);
                        }
                    }
                } else {
                    pair = new Pair(null, Boolean.TRUE);
                }
            }
            CharSequence charSequence = (CharSequence) pair.getFirst();
            boolean booleanValue = ((Boolean) pair.getSecond()).booleanValue();
            if (charSequence != null && charSequence.length() != 0) {
                arrayList.add(charSequence);
            }
            if (!booleanValue && (childAt instanceof ViewGroup)) {
                e((ViewGroup) childAt, arrayList);
            }
        }
    }

    public static final void f(Map map, List list, Object obj) {
        if (list.isEmpty()) {
            return;
        }
        if (list.size() == 1) {
            map.put(list.get(0), obj);
            return;
        }
        String str = (String) list.get(0);
        List subList = list.subList(1, list.size());
        if (map.get(str) == null || !ym11.h(map.get(str))) {
            map.put(str, new LinkedHashMap());
        }
        Object obj2 = map.get(str);
        Map map2 = ym11.h(obj2) ? (Map) obj2 : null;
        if (map2 != null) {
            f(map2, subList, obj);
        }
    }

    public abstract RenderEffect b();
}
