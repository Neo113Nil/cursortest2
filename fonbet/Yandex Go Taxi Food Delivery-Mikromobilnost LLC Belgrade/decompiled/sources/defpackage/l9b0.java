package defpackage;

import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import com.ybsdk.core.utils.ColorModel;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class l9b0 extends n9b0 {
    public static final ColorModel.Attr k = new ColorModel.Attr(ung0.ybColor_textIcon_primary);
    public static final ColorModel.Attr l = new ColorModel.Attr(ung0.ybColor_textIcon_secondary);
    public static final ColorModel.Attr m = new ColorModel.Attr(ung0.ybColor_textIcon_tertiary);
    public static final ColorMatrixColorFilter n;
    public final String c;
    public final String d;
    public final String e;
    public final he60 f;
    public final rbv g;
    public final j9b0 h;
    public final k9b0 i;
    public final ColorMatrixColorFilter j;

    static {
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        n = new ColorMatrixColorFilter(colorMatrix);
    }

    public l9b0(String str, String str2, String str3, he60 he60Var, rbv rbvVar, j9b0 j9b0Var, k9b0 k9b0Var, ColorMatrixColorFilter colorMatrixColorFilter) {
        super(str, 2);
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = he60Var;
        this.g = rbvVar;
        this.h = j9b0Var;
        this.i = k9b0Var;
        this.j = colorMatrixColorFilter;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean equals;
        if (this != obj) {
            if (obj instanceof l9b0) {
                l9b0 l9b0Var = (l9b0) obj;
                if (this.c.equals(l9b0Var.c)) {
                    String str = l9b0Var.d;
                    String str2 = this.d;
                    if (str2 == null) {
                        if (str == null) {
                            equals = true;
                            if (equals && jl40.l(this.e, l9b0Var.e) && this.f.equals(l9b0Var.f) && jl40.l(this.g, l9b0Var.g) && this.h.equals(l9b0Var.h) && jl40.l(this.i, l9b0Var.i) && jl40.l(this.j, l9b0Var.j)) {
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
        int hashCode = this.c.hashCode() * 31;
        String str = this.d;
        int hashCode2 = (this.f.hashCode() + unr0.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.e)) * 31;
        rbv rbvVar = this.g;
        int hashCode3 = (this.h.hashCode() + ((hashCode2 + (rbvVar == null ? 0 : rbvVar.hashCode())) * 31)) * 31;
        k9b0 k9b0Var = this.i;
        int hashCode4 = (hashCode3 + (k9b0Var == null ? 0 : k9b0Var.a.hashCode())) * 31;
        ColorMatrixColorFilter colorMatrixColorFilter = this.j;
        return hashCode4 + (colorMatrixColorFilter != null ? colorMatrixColorFilter.hashCode() : 0);
    }

    public final String toString() {
        String a = h9b0.a(this.c);
        String str = this.d;
        StringBuilder v = b64.v("Category(categoryId=", a, ", parentCategoryId=", str == null ? "null" : h9b0.a(str), ", logId=");
        v.append(this.e);
        v.append(", text=");
        v.append(this.f);
        v.append(", icon=");
        v.append(this.g);
        v.append(", background=");
        v.append(this.h);
        v.append(", border=");
        v.append(this.i);
        v.append(", colorFilter=");
        v.append(this.j);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
