package defpackage;

import android.text.Spanned;
import android.util.Rational;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.semantics.c;
import com.yandex.go.navigator.driving.p0;
import com.yandex.go.navigator.events.NavigatorTag;
import com.yandex.mapkit.navigation.automotive.UpcomingRoadEvent;
import com.yandex.mapkit.road_events.EventTag;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.jar.Attributes;

/* loaded from: classes10.dex */
public final class pzo implements Comparator {
    public final /* synthetic */ int a;
    public final Object b;

    public pzo(Comparator comparator) {
        this.a = 3;
        z0y z0yVar = LayoutNode.m0;
        this.b = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Object next;
        NavigatorTag navigatorTag;
        NavigatorTag navigatorTag2;
        NavigatorTag navigatorTag3;
        NavigatorTag navigatorTag4;
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                quq0 quq0Var = (quq0) obj3;
                return ((Comparable) quq0Var.invoke(obj)).compareTo((Comparable) quq0Var.invoke(obj2));
            case 1:
                Rational rational = (Rational) obj2;
                Rational rational2 = (Rational) obj3;
                float floatValue = ((Rational) obj).floatValue();
                float floatValue2 = rational2.floatValue();
                float f = floatValue > floatValue2 ? floatValue2 / floatValue : floatValue / floatValue2;
                float floatValue3 = rational.floatValue();
                float floatValue4 = rational2.floatValue();
                return Float.compare(floatValue3 > floatValue4 ? floatValue4 / floatValue3 : floatValue3 / floatValue4, f);
            case 2:
                ey40 ey40Var = (ey40) obj3;
                return Integer.valueOf(ey40Var.c(((Number) obj).longValue())).compareTo(Integer.valueOf(ey40Var.c(((Number) obj2).longValue())));
            case 3:
                int compare = ((Comparator) obj3).compare(obj, obj2);
                return compare != 0 ? compare : LayoutNode.p0.compare(((c) obj).c, ((c) obj2).c);
            case 4:
                int compare2 = ((pzo) obj3).compare(obj, obj2);
                return compare2 != 0 ? compare2 : Integer.valueOf(((c) obj).f).compareTo(Integer.valueOf(((c) obj2).f));
            case 5:
                Spanned spanned = (Spanned) obj3;
                return Integer.valueOf(spanned.getSpanStart(obj)).compareTo(Integer.valueOf(spanned.getSpanStart(obj2)));
            case 6:
                int compare3 = ((k711) obj3).compare(obj, obj2);
                return compare3 != 0 ? compare3 : Float.valueOf(((j711) obj).c).compareTo(Float.valueOf(((j711) obj2).c));
            case 7:
                LinkedHashMap linkedHashMap = ((p0) obj3).i;
                Iterator<T> it = ((UpcomingRoadEvent) obj2).getEvent().getTags().iterator();
                Object obj4 = null;
                if (it.hasNext()) {
                    next = it.next();
                    if (it.hasNext()) {
                        kg50 kg50Var = (kg50) linkedHashMap.get((EventTag) next);
                        int priority = (kg50Var == null || (navigatorTag2 = kg50Var.a) == null) ? 0 : navigatorTag2.getPriority();
                        do {
                            Object next2 = it.next();
                            kg50 kg50Var2 = (kg50) linkedHashMap.get((EventTag) next2);
                            int priority2 = (kg50Var2 == null || (navigatorTag = kg50Var2.a) == null) ? 0 : navigatorTag.getPriority();
                            if (priority < priority2) {
                                next = next2;
                                priority = priority2;
                            }
                        } while (it.hasNext());
                    }
                } else {
                    next = null;
                }
                EventTag eventTag = (EventTag) next;
                Iterator<T> it2 = ((UpcomingRoadEvent) obj).getEvent().getTags().iterator();
                if (it2.hasNext()) {
                    obj4 = it2.next();
                    if (it2.hasNext()) {
                        kg50 kg50Var3 = (kg50) linkedHashMap.get((EventTag) obj4);
                        int priority3 = (kg50Var3 == null || (navigatorTag4 = kg50Var3.a) == null) ? 0 : navigatorTag4.getPriority();
                        do {
                            Object next3 = it2.next();
                            kg50 kg50Var4 = (kg50) linkedHashMap.get((EventTag) next3);
                            int priority4 = (kg50Var4 == null || (navigatorTag3 = kg50Var4.a) == null) ? 0 : navigatorTag3.getPriority();
                            if (priority3 < priority4) {
                                obj4 = next3;
                                priority3 = priority4;
                            }
                        } while (it2.hasNext());
                    }
                }
                return uvc.b(eventTag, (EventTag) obj4);
            case 8:
                float[] fArr = (float[]) obj3;
                return Float.valueOf(fArr[((Number) obj2).intValue()]).compareTo(Float.valueOf(fArr[((Number) obj).intValue()]));
            case 9:
                ve61 ve61Var = (ve61) obj3;
                return Float.valueOf(ve61.a(ve61Var, obj)).compareTo(Float.valueOf(ve61.a(ve61Var, obj2)));
            case 10:
                int compare4 = ((w83) obj3).compare(obj, obj2);
                return compare4 != 0 ? compare4 : uvc.b(((Map.Entry) obj).getKey().toString(), ((Map.Entry) obj2).getKey().toString());
            case 11:
                int compare5 = ((pzo) obj3).compare(obj, obj2);
                return compare5 != 0 ? compare5 : uvc.b(obj.toString(), obj2.toString());
            default:
                return ((Attributes.Name) ((Map.Entry) obj).getKey()).toString().compareTo(((Attributes.Name) ((Map.Entry) obj2).getKey()).toString());
        }
    }

    public /* synthetic */ pzo(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
