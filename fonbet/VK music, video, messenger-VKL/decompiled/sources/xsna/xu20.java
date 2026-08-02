package xsna;

import android.app.Activity;

/* compiled from: ModalActionSheetItem.kt */
/* loaded from: classes17.dex */
public final class xu20 extends yu20 {
    public final String a;
    public final String b;
    public final int c;
    public final izs<Activity, s3q0> d;

    public xu20() {
        this(null, null, 0, null, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xu20)) {
            return false;
        }
        xu20 xu20Var = (xu20) obj;
        return epx.f(this.a, xu20Var.a) && epx.f(this.b, xu20Var.b) && this.c == xu20Var.c && epx.f(this.d, xu20Var.d);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int a = shy.a(this.c, (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        izs<Activity, s3q0> izsVar = this.d;
        return a + (izsVar != null ? izsVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ModalActionSheetHeader(title=");
        sb.append(this.a);
        sb.append(", description=");
        sb.append(this.b);
        sb.append(", descriptionRowsCount=");
        sb.append(this.c);
        sb.append(", descriptionClick=");
        return up.c(sb, this.d, ')');
    }

    public xu20(String str, String str2, int i, com.vk.movika.sdk.base.observable.w wVar, int i2) {
        str = (i2 & 1) != 0 ? null : str;
        str2 = (i2 & 2) != 0 ? null : str2;
        i = (i2 & 4) != 0 ? 2 : i;
        wVar = (i2 & 8) != 0 ? null : wVar;
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = wVar;
    }
}
