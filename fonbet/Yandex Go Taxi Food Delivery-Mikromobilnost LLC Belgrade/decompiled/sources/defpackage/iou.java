package defpackage;

import android.text.TextUtils;

/* loaded from: classes10.dex */
public final class iou {
    public final int a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public iou(int i, int i2, String str, String str2, String str3, String str4) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && iou.class == obj.getClass()) {
            iou iouVar = (iou) obj;
            if (this.a == iouVar.a && this.b == iouVar.b && TextUtils.equals(this.c, iouVar.c) && TextUtils.equals(this.d, iouVar.d) && TextUtils.equals(this.e, iouVar.e) && TextUtils.equals(this.f, iouVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = ((this.a * 31) + this.b) * 31;
        String str = this.c;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.d;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.e;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }
}
