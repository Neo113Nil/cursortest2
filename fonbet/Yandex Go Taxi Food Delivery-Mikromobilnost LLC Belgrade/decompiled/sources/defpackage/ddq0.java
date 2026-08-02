package defpackage;

import android.graphics.drawable.Drawable;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.widgets.common.paymentmethod.SelectPaymentMethodItem$LeftImageType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class ddq0 extends gc5 {
    public final String c;
    public final rbv d;
    public final rbv e;
    public final Text f;
    public final Text g;
    public final Drawable h;
    public final ldq0 i;
    public final boolean j;
    public final boolean k;
    public final SelectPaymentMethodItem$LeftImageType l;

    public ddq0(String str, rbv rbvVar, rbv rbvVar2, Text text, Text text2, Drawable drawable, ldq0 ldq0Var, boolean z, boolean z2, SelectPaymentMethodItem$LeftImageType selectPaymentMethodItem$LeftImageType) {
        super(str + z2, 2);
        this.c = str;
        this.d = rbvVar;
        this.e = rbvVar2;
        this.f = text;
        this.g = text2;
        this.h = drawable;
        this.i = ldq0Var;
        this.j = z;
        this.k = z2;
        this.l = selectPaymentMethodItem$LeftImageType;
    }

    public final boolean equals(Object obj) {
        ddq0 ddq0Var = obj instanceof ddq0 ? (ddq0) obj : null;
        return jl40.l(ddq0Var != null ? ddq0Var.b() : null, b());
    }

    public final int hashCode() {
        return b().hashCode();
    }

    public final String toString() {
        return "SelectPaymentMethodItem(id=" + this.c + ", leftImage=" + this.d + ", leftSubImage=" + this.e + ", title=" + this.f + ", subtitle=" + this.g + ", subtitleTextColor=null, rightImageDrawable=" + this.h + ", type=" + this.i + ", isCheckable=" + this.j + ", isChecked=" + this.k + ", fillBackground=false, leftImageType=" + this.l + Extension.C_BRAKE;
    }

    public /* synthetic */ ddq0(String str, rbv rbvVar, Text.Constant constant, Text.Constant constant2, Drawable drawable, ldq0 ldq0Var, boolean z, boolean z2) {
        this(str, rbvVar, null, constant, constant2, drawable, ldq0Var, z, z2, SelectPaymentMethodItem$LeftImageType.CIRCLE);
    }
}
