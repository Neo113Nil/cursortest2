package xsna;

import android.content.Context;
import android.graphics.RectF;
import android.os.Build;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatEditText;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: AppCompatTextViewAutoSizeHelper.java */
/* loaded from: classes.dex */
public final class r33 {
    public int a = 0;
    public float b = -1.0f;
    public float c = -1.0f;
    public float d = -1.0f;
    public int[] e = new int[0];
    public boolean f = false;

    @NonNull
    public final TextView g;
    public final Context h;

    /* compiled from: AppCompatTextViewAutoSizeHelper.java */
    public static class a extends c {
    }

    /* compiled from: AppCompatTextViewAutoSizeHelper.java */
    public static class b extends a {
    }

    /* compiled from: AppCompatTextViewAutoSizeHelper.java */
    public static class c {
    }

    static {
        new RectF();
        new ConcurrentHashMap();
    }

    public r33(@NonNull TextView textView) {
        this.g = textView;
        this.h = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            new b();
        } else {
            new a();
        }
    }

    public static int[] a(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i : iArr) {
                if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i2 = 0; i2 < size; i2++) {
                    iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    public final boolean b() {
        return !(this.g instanceof AppCompatEditText);
    }
}
