package xsna;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;

/* compiled from: ToolButton.kt */
/* loaded from: classes4.dex */
public final class q2p0 {
    public static void a(TypedArray typedArray, int i, izs izsVar, izs izsVar2, izs izsVar3, int i2) {
        if ((i2 & 8) != 0) {
            izsVar2 = null;
        }
        if ((i2 & 16) != 0) {
            izsVar3 = null;
        }
        try {
            ColorStateList colorStateList = typedArray.getColorStateList(i);
            if (colorStateList != null && izsVar3 != null) {
                izsVar3.invoke(colorStateList);
                return;
            }
        } catch (Resources.NotFoundException unused) {
        }
        int resourceId = typedArray.getResourceId(i, -1);
        if (resourceId != -1 && izsVar2 != null) {
            izsVar2.invoke(Integer.valueOf(resourceId));
            return;
        }
        int color = typedArray.getColor(i, -1);
        if (color != -1) {
            izsVar.invoke(Integer.valueOf(color));
        }
    }
}
