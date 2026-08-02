package xsna;

import android.graphics.Bitmap;
import java.util.List;

/* compiled from: VerticalizationModeState.kt */
/* loaded from: classes16.dex */
public final class xpr0 implements km50 {
    public final boolean b;
    public final iz8 c;
    public final String d;
    public final Bitmap e;
    public final Bitmap f;
    public final List<String> g;
    public final Integer h;
    public final int i;

    public xpr0(boolean z, iz8 iz8Var, String str, Bitmap bitmap, Bitmap bitmap2, List<String> list, Integer num, int i) {
        this.b = z;
        this.c = iz8Var;
        this.d = str;
        this.e = bitmap;
        this.f = bitmap2;
        this.g = list;
        this.h = num;
        this.i = i;
    }

    public static xpr0 a(xpr0 xpr0Var, List list, int i, int i2) {
        boolean z = (i2 & 1) != 0 ? xpr0Var.b : false;
        iz8 iz8Var = xpr0Var.c;
        String str = xpr0Var.d;
        Bitmap bitmap = xpr0Var.e;
        Bitmap bitmap2 = xpr0Var.f;
        if ((i2 & 32) != 0) {
            list = xpr0Var.g;
        }
        List list2 = list;
        Integer num = xpr0Var.h;
        if ((i2 & 128) != 0) {
            i = xpr0Var.i;
        }
        xpr0Var.getClass();
        return new xpr0(z, iz8Var, str, bitmap, bitmap2, list2, num, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xpr0)) {
            return false;
        }
        xpr0 xpr0Var = (xpr0) obj;
        return this.b == xpr0Var.b && epx.f(this.c, xpr0Var.c) && epx.f(this.d, xpr0Var.d) && epx.f(this.e, xpr0Var.e) && epx.f(this.f, xpr0Var.f) && epx.f(this.g, xpr0Var.g) && epx.f(this.h, xpr0Var.h) && this.i == xpr0Var.i;
    }

    public final int hashCode() {
        int hashCode = (this.f.hashCode() + ((this.e.hashCode() + urd0.a((this.c.hashCode() + (Boolean.hashCode(this.b) * 31)) * 31, 31, this.d)) * 31)) * 31;
        List<String> list = this.g;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.h;
        return Integer.hashCode(this.i) + ((hashCode2 + (num != null ? num.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VerticalizationModeState(isLoading=");
        sb.append(this.b);
        sb.append(", cadreSize=");
        sb.append(this.c);
        sb.append(", fileName=");
        sb.append(this.d);
        sb.append(", blurBitmap=");
        sb.append(this.e);
        sb.append(", initialPhotoBitmap=");
        sb.append(this.f);
        sb.append(", pickerImagesUrls=");
        sb.append(this.g);
        sb.append(", initialItemPosition=");
        sb.append(this.h);
        sb.append(", selectedPickerItemPosition=");
        return vu5.b(sb, this.i, ')');
    }
}
