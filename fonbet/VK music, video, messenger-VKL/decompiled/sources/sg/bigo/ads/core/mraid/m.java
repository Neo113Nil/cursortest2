package sg.bigo.ads.core.mraid;

import android.graphics.Rect;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import xsna.efz;

/* loaded from: classes9.dex */
final class m {
    List<Rect> a;

    public static class a {
        final int a;
        final int b;

        public a(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public final boolean a(a aVar) {
            return this.a <= aVar.b && this.b >= aVar.a;
        }

        public final String toString() {
            return efz.a(this.a, this.b, "Range: ", " - ");
        }
    }

    public m(List<Rect> list, int[] iArr) {
        List<Integer> a2 = a(list);
        this.a = new ArrayList();
        int i = 0;
        while (i < a2.size() - 1) {
            int intValue = a2.get(i).intValue();
            i++;
            int intValue2 = a2.get(i).intValue();
            if (intValue < intValue2) {
                a aVar = new a(intValue, intValue2);
                this.a.addAll(b(aVar, a(aVar, list)));
            }
        }
        Collections.sort(this.a, new Comparator<Rect>() { // from class: sg.bigo.ads.core.mraid.m.1
            @Override // java.util.Comparator
            public final /* synthetic */ int compare(Rect rect, Rect rect2) {
                Rect rect3 = rect;
                Rect rect4 = rect2;
                return (rect3.height() * rect3.width()) - (rect4.height() * rect4.width());
            }
        });
        Iterator<Rect> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().offset(-iArr[0], -iArr[1]);
        }
    }

    private static List<Rect> b(a aVar, List<a> list) {
        ArrayList arrayList = new ArrayList();
        for (a aVar2 : list) {
            arrayList.add(new Rect(aVar.a, aVar2.a, aVar.b, aVar2.b));
        }
        return arrayList;
    }

    public final float a() {
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        for (Rect rect : this.a) {
            f += rect.height() * rect.width();
        }
        return f;
    }

    private List<Integer> a(List<Rect> list) {
        ArrayList arrayList = new ArrayList();
        for (Rect rect : list) {
            arrayList.add(Integer.valueOf(rect.left));
            arrayList.add(Integer.valueOf(rect.right));
        }
        Collections.sort(arrayList, new Comparator<Integer>() { // from class: sg.bigo.ads.core.mraid.m.2
            @Override // java.util.Comparator
            public final /* synthetic */ int compare(Integer num, Integer num2) {
                return num.intValue() - num2.intValue();
            }
        });
        return arrayList;
    }

    private static List<a> a(List<a> list, a aVar) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            a aVar2 = list.get(i);
            if (!aVar.a(aVar2)) {
                arrayList.add(aVar2);
            } else if (aVar.a(aVar2)) {
                int i2 = aVar.a;
                int i3 = aVar2.a;
                if (i2 >= i3) {
                    i2 = i3;
                }
                int i4 = aVar.b;
                int i5 = aVar2.b;
                if (i4 <= i5) {
                    i4 = i5;
                }
                aVar = new a(i2, i4);
            }
        }
        arrayList.add(aVar);
        return arrayList;
    }

    private static List<a> a(a aVar, List<Rect> list) {
        List<a> arrayList = new ArrayList<>();
        for (Rect rect : list) {
            if (aVar.a < rect.right && aVar.b > rect.left) {
                arrayList = a(arrayList, new a(rect.top, rect.bottom));
            }
        }
        return arrayList;
    }
}
