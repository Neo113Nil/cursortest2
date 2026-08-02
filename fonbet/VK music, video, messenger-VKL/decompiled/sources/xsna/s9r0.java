package xsna;

import android.graphics.Color;
import java.util.ArrayList;

/* compiled from: VKAvatarBorderItemColorMapper.kt */
/* loaded from: classes15.dex */
public final class s9r0 {
    public static int[] a(String[] strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(Integer.valueOf(Color.parseColor("#" + str)));
        }
        return j5g.N0(arrayList);
    }
}
