package xsna;

import android.content.Context;
import android.util.Size;
import com.vungle.ads.internal.protos.Sdk;
import xsna.ikv0;
import xsna.tlo0;

/* compiled from: SnackbarData.kt */
/* loaded from: classes4.dex */
public final class j7k0 {
    public final tlo0 a;
    public final Integer b;
    public final Integer c;
    public final tlo0 d;
    public final gzs<s3q0> e;
    public final tjc f;

    public j7k0() {
        this(null, null, null, null, null, null, 63);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends kj50> ikv0 a(Context context, izs<? super T, s3q0> izsVar) {
        CharSequence a;
        String obj;
        ikv0.a aVar = new ikv0.a(context);
        Size size = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Integer num = this.b;
        if (num != null) {
            aVar.t = new ikv0.c.C3058c(num.intValue(), this.c, size, 12);
        }
        tlo0 tlo0Var = this.a;
        if (tlo0Var != null) {
            CharSequence a2 = tlo0Var.a(context);
            aVar.u = new ikv0.d(a2 != null ? a2.toString() : null, (String) (objArr4 == true ? 1 : 0), (ikv0.d.a) (objArr3 == true ? 1 : 0), 6);
        }
        int i = Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE;
        tjc tjcVar = this.f;
        if (tjcVar != null) {
            aVar.u = new ikv0.d(tlo0.b.a(tjcVar.a, context).toString(), (String) (objArr == true ? 1 : 0), new ikv0.d.a(tlo0.b.a(tjcVar.b, context).toString(), objArr2 == true ? 1 : 0, new qt5(tjcVar, izsVar), i), 2);
        }
        tlo0 tlo0Var2 = this.d;
        if (tlo0Var2 != null && (a = tlo0Var2.a(context)) != null && (obj = a.toString()) != null) {
            aVar.s = new ikv0.e.a(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, obj, new alj0(this, 2));
        }
        return aVar.b();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j7k0)) {
            return false;
        }
        j7k0 j7k0Var = (j7k0) obj;
        return epx.f(this.a, j7k0Var.a) && epx.f(this.b, j7k0Var.b) && epx.f(this.c, j7k0Var.c) && epx.f(this.d, j7k0Var.d) && epx.f(this.e, j7k0Var.e) && epx.f(this.f, j7k0Var.f);
    }

    public final int hashCode() {
        tlo0 tlo0Var = this.a;
        int hashCode = (tlo0Var == null ? 0 : tlo0Var.hashCode()) * 31;
        Integer num = this.b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        tlo0 tlo0Var2 = this.d;
        int hashCode4 = (hashCode3 + (tlo0Var2 == null ? 0 : tlo0Var2.hashCode())) * 31;
        gzs<s3q0> gzsVar = this.e;
        int hashCode5 = (hashCode4 + (gzsVar == null ? 0 : gzsVar.hashCode())) * 31;
        tjc tjcVar = this.f;
        return hashCode5 + (tjcVar != null ? tjcVar.hashCode() : 0);
    }

    public final String toString() {
        return "SnackbarData(text=" + this.a + ", drawableResId=" + this.b + ", drawableTintRes=" + this.c + ", buttonText=" + this.d + ", buttonClickListener=" + this.e + ", clickableMessage=" + this.f + ')';
    }

    public j7k0(tlo0 tlo0Var, Integer num, Integer num2, tlo0 tlo0Var2, gzs<s3q0> gzsVar, tjc tjcVar) {
        this.a = tlo0Var;
        this.b = num;
        this.c = num2;
        this.d = tlo0Var2;
        this.e = gzsVar;
        this.f = tjcVar;
    }

    public /* synthetic */ j7k0(tlo0 tlo0Var, Integer num, Integer num2, tlo0 tlo0Var2, gzs gzsVar, tjc tjcVar, int i) {
        this((i & 1) != 0 ? null : tlo0Var, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : tlo0Var2, (i & 16) != 0 ? null : gzsVar, (i & 32) != 0 ? null : tjcVar);
    }
}
