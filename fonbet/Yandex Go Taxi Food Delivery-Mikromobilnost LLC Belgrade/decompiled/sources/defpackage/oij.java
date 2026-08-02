package defpackage;

import com.ybsdk.widgets.common.bottomsheet.BottomSheetDialogView;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class oij implements rij {
    public final kao a;
    public final BottomSheetDialogView.State b;

    public oij(kao kaoVar, BottomSheetDialogView.State state) {
        this.a = kaoVar;
        this.b = state;
    }

    @Override // defpackage.rij
    public final BottomSheetDialogView.State a() {
        return this.b;
    }

    public final kao b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof oij) {
            oij oijVar = (oij) obj;
            if (this.a == oijVar.a && this.b.equals(oijVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Error(errorState=" + this.a + ", bottomSheet=" + this.b + Extension.C_BRAKE;
    }
}
