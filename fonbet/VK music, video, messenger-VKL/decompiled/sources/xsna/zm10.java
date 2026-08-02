package xsna;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.R$attr;

/* compiled from: MaterialThemeOverlay.java */
/* loaded from: classes.dex */
public final class zm10 {
    public static final int[] a = {R.attr.theme, R$attr.theme};
    public static final int[] b = {R$attr.materialThemeOverlay};

    @NonNull
    public static Context a(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        boolean z = (context instanceof lpj) && ((lpj) context).getThemeResId() == resourceId;
        if (resourceId == 0 || z) {
            return context;
        }
        lpj lpjVar = new lpj(context, resourceId);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, a);
        int resourceId2 = obtainStyledAttributes2.getResourceId(0, 0);
        int resourceId3 = obtainStyledAttributes2.getResourceId(1, 0);
        obtainStyledAttributes2.recycle();
        if (resourceId2 == 0) {
            resourceId2 = resourceId3;
        }
        if (resourceId2 != 0) {
            lpjVar.getTheme().applyStyle(resourceId2, true);
        }
        return lpjVar;
    }
}
