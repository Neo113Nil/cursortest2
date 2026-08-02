package defpackage;

import android.content.Context;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.savings.internal.entities.CellType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class eam0 extends fam0 {
    public final Text c;
    public final Text.Constant d;
    public final String e;
    public final CellType f;
    public final dam0 g;

    public eam0(Text text, Text.Constant constant, String str, CellType cellType, dam0 dam0Var) {
        super(null, 3);
        this.c = text;
        this.d = constant;
        this.e = str;
        this.f = cellType;
        this.g = dam0Var;
    }

    @Override // defpackage.fam0
    public final aam0 c(Context context) {
        dam0 dam0Var = this.g;
        rbv rbvVar = dam0Var.a;
        ColorModel colorModel = dam0Var.b;
        ColorModel colorModel2 = dam0Var.c;
        return new z9m0(this.c, this.d, rbvVar, colorModel, colorModel2, colorModel2, dam0Var.d, this.e, this.f, dam0Var.e);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean equals;
        if (this != obj) {
            if (obj instanceof eam0) {
                eam0 eam0Var = (eam0) obj;
                if (jl40.l(this.c, eam0Var.c) && this.d.equals(eam0Var.d)) {
                    String str = eam0Var.e;
                    String str2 = this.e;
                    if (str2 == null) {
                        if (str == null) {
                            equals = true;
                            if (equals && this.f == eam0Var.f && this.g.equals(eam0Var.g)) {
                            }
                        }
                        equals = false;
                        if (equals) {
                        }
                    } else {
                        if (str != null) {
                            equals = str2.equals(str);
                            if (equals) {
                            }
                        }
                        equals = false;
                        if (equals) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int d = xvz.d(this.d, this.c.hashCode() * 31, 31);
        String str = this.e;
        return this.g.hashCode() + ((this.f.hashCode() + ((d + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        String str = this.e;
        return "SavingsCellImageItemSavings(titleText=" + this.c + ", imageText=" + this.d + ", action=" + (str == null ? "null" : jr.a(str)) + ", cellType=" + this.f + ", theme=" + this.g + Extension.C_BRAKE;
    }
}
