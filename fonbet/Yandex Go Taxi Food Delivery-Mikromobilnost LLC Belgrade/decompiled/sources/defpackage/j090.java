package defpackage;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes2.dex */
public final class j090 {
    public static void a(Rect rect, ArrayList arrayList, ArrayList arrayList2) {
        rect.left = Collections.binarySearch(arrayList, Integer.valueOf(rect.left));
        rect.top = Collections.binarySearch(arrayList2, Integer.valueOf(rect.top));
        rect.right = Collections.binarySearch(arrayList, Integer.valueOf(rect.right));
        rect.bottom = Collections.binarySearch(arrayList2, Integer.valueOf(rect.bottom));
    }
}
