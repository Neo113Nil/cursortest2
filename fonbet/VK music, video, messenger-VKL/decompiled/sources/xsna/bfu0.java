package xsna;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: VkBlurConfig.kt */
/* loaded from: classes17.dex */
public final class bfu0 {
    public static final /* synthetic */ int a = 0;

    static {
        int[] iArr = {Color.parseColor("#FFFFFFFF"), Color.parseColor("#CDFFFFFF"), Color.parseColor("#B4FFFFFF"), Color.parseColor("#00FFFFFF")};
        ArrayList arrayList = new ArrayList(4);
        for (int i = 0; i < 4; i = tv4.a(arrayList, iArr[i], i, 1)) {
        }
        Collections.reverse(arrayList);
        j5g.N0(arrayList);
        float[] fArr = {0.3f, 0.6f, 0.8f, 1.0f};
        ArrayList arrayList2 = new ArrayList(4);
        for (int i2 = 0; i2 < 4; i2++) {
            arrayList2.add(Float.valueOf(1 - fArr[i2]));
        }
        j5g.L0(j5g.y0(arrayList2));
    }
}
