package defpackage;

import android.graphics.drawable.BitmapDrawable;
import com.yandex.go.sharing_personal_goals.SharingPersonalGoalsProgressStyle;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class jrr0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Integer e;
    public final Integer f;
    public final BitmapDrawable g;
    public final BitmapDrawable h;
    public final boolean i;
    public final boolean j;
    public final SharingPersonalGoalsProgressStyle k;

    public jrr0(String str, String str2, String str3, String str4, Integer num, Integer num2, BitmapDrawable bitmapDrawable, BitmapDrawable bitmapDrawable2, boolean z, boolean z2, SharingPersonalGoalsProgressStyle sharingPersonalGoalsProgressStyle) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = num;
        this.f = num2;
        this.g = bitmapDrawable;
        this.h = bitmapDrawable2;
        this.i = z;
        this.j = z2;
        this.k = sharingPersonalGoalsProgressStyle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jrr0)) {
            return false;
        }
        jrr0 jrr0Var = (jrr0) obj;
        return jl40.l(this.a, jrr0Var.a) && jl40.l(this.b, jrr0Var.b) && jl40.l(this.c, jrr0Var.c) && jl40.l(this.d, jrr0Var.d) && jl40.l(this.e, jrr0Var.e) && jl40.l(this.f, jrr0Var.f) && jl40.l(this.g, jrr0Var.g) && jl40.l(this.h, jrr0Var.h) && this.i == jrr0Var.i && this.j == jrr0Var.j && this.k == jrr0Var.k;
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.e;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        BitmapDrawable bitmapDrawable = this.g;
        int hashCode4 = (hashCode3 + (bitmapDrawable == null ? 0 : bitmapDrawable.hashCode())) * 31;
        BitmapDrawable bitmapDrawable2 = this.h;
        return this.k.hashCode() + unr0.e(unr0.e((hashCode4 + (bitmapDrawable2 != null ? bitmapDrawable2.hashCode() : 0)) * 31, 31, this.i), 31, this.j);
    }

    public final String toString() {
        StringBuilder v = b64.v("SharingPersonalGoalUiItem(id=", this.a, ", title=", this.b, ", subtitle=");
        g8e.D(v, this.c, ", deadlineLabel=", this.d, ", progressCompleted=");
        v.append(this.e);
        v.append(", progressTotal=");
        v.append(this.f);
        v.append(", actionIcon=");
        v.append(this.g);
        v.append(", rewardIcon=");
        v.append(this.h);
        v.append(", isSelected=");
        nnm.v(", isSelectable=", ", progressStyle=", v, this.i, this.j);
        v.append(this.k);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public /* synthetic */ jrr0(String str, String str2, String str3, String str4, Integer num, Integer num2, BitmapDrawable bitmapDrawable, BitmapDrawable bitmapDrawable2, SharingPersonalGoalsProgressStyle sharingPersonalGoalsProgressStyle) {
        this(str, str2, str3, str4, num, num2, bitmapDrawable, bitmapDrawable2, false, false, sharingPersonalGoalsProgressStyle);
    }
}
