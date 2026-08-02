package xsna;

import com.huawei.hms.hihealth.data.DeviceInfo;

/* compiled from: DrawScope.kt */
/* loaded from: classes11.dex */
public final class frm0 extends qio {
    public final float a;
    public final float b;
    public final int c;
    public final int d;
    public final db2 e;

    public frm0(float f, float f2, int i, int i2, db2 db2Var, int i3) {
        f2 = (i3 & 2) != 0 ? 4.0f : f2;
        i = (i3 & 4) != 0 ? 0 : i;
        i2 = (i3 & 8) != 0 ? 0 : i2;
        db2Var = (i3 & 16) != 0 ? null : db2Var;
        this.a = f;
        this.b = f2;
        this.c = i;
        this.d = i2;
        this.e = db2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof frm0)) {
            return false;
        }
        frm0 frm0Var = (frm0) obj;
        return this.a == frm0Var.a && this.b == frm0Var.b && this.c == frm0Var.c && this.d == frm0Var.d && epx.f(this.e, frm0Var.e);
    }

    public final int hashCode() {
        int a = shy.a(this.d, shy.a(this.c, io.reactivex.rxjava3.subjects.b.a(this.b, Float.hashCode(this.a) * 31, 31), 31), 31);
        db2 db2Var = this.e;
        return a + (db2Var != null ? db2Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Stroke(width=");
        sb.append(this.a);
        sb.append(", miter=");
        sb.append(this.b);
        sb.append(", cap=");
        String str = DeviceInfo.STR_TYPE_UNKNOWN;
        int i = this.c;
        sb.append((Object) (i == 0 ? "Butt" : i == 1 ? "Round" : i == 2 ? "Square" : DeviceInfo.STR_TYPE_UNKNOWN));
        sb.append(", join=");
        int i2 = this.d;
        if (i2 == 0) {
            str = "Miter";
        } else if (i2 == 1) {
            str = "Round";
        } else if (i2 == 2) {
            str = "Bevel";
        }
        sb.append((Object) str);
        sb.append(", pathEffect=");
        sb.append(this.e);
        sb.append(')');
        return sb.toString();
    }
}
