package defpackage;

import com.ybsdk.widgets.common.bottomsheet.BottomSheetDialogView;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class pij implements rij {
    public final BottomSheetDialogView.State a;

    public pij(BottomSheetDialogView.State state) {
        this.a = state;
    }

    @Override // defpackage.rij
    public final BottomSheetDialogView.State a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pij) && this.a.equals(((pij) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Loading(bottomSheet=" + this.a + Extension.C_BRAKE;
    }
}
