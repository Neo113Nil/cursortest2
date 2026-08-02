package defpackage;

import android.content.Context;
import android.content.res.Resources;
import java.util.Arrays;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class bu11 extends cu11 {
    public final int a;
    public final Object[] b;

    public bu11(int i, Object... objArr) {
        this.a = i;
        this.b = Arrays.copyOf(objArr, objArr.length);
    }

    public final String a(Context context) {
        Object[] objArr = this.b;
        boolean z = objArr.length == 0;
        int i = this.a;
        Resources resources = context.getResources();
        return !z ? resources.getString(i, Arrays.copyOf(objArr, objArr.length)) : resources.getString(i);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bu11)) {
            return false;
        }
        bu11 bu11Var = (bu11) obj;
        return this.a == bu11Var.a && Arrays.equals(this.b, bu11Var.b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        int i = 0;
        for (Object obj : this.b) {
            i += obj.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return bu11.class.getName() + " (stringResId = " + this.a + ", formatArgs = " + this.b + Extension.C_BRAKE;
    }

    public bu11(int i) {
        this(i, Arrays.copyOf(new Object[0], 0));
    }
}
