package xsna;

import android.graphics.Paint;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class rqi {
    public static int a(int i, int i2, int i3, int i4) {
        return (i * i2) + i3 + i4;
    }

    public static Paint b(int i, int i2) {
        Paint paint = new Paint(i);
        paint.setColor(i2);
        return paint;
    }

    public static String c(Object obj, String str) {
        return (str + obj).toString();
    }

    public static StringBuilder d(long j, String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(j);
        return sb;
    }
}
