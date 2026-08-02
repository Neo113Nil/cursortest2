package defpackage;

import com.yandex.go.superapp.searchbar.impl.presentation.SuperappSearchbarUiState$Visible$Button$ButtonGroup;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class dew0 {
    public final SuperappSearchbarUiState$Visible$Button$ButtonGroup a;
    public final int b;
    public final String c;

    public dew0(SuperappSearchbarUiState$Visible$Button$ButtonGroup superappSearchbarUiState$Visible$Button$ButtonGroup, int i, String str) {
        this.a = superappSearchbarUiState$Visible$Button$ButtonGroup;
        this.b = i;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dew0)) {
            return false;
        }
        dew0 dew0Var = (dew0) obj;
        return this.a == dew0Var.a && this.b == dew0Var.b && jl40.l(this.c, dew0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + oyr.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LottieAnimationKey(buttonGroup=");
        sb.append(this.a);
        sb.append(", index=");
        sb.append(this.b);
        sb.append(", url=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
