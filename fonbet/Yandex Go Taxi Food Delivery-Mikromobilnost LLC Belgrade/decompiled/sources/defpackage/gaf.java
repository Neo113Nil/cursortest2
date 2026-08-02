package defpackage;

import com.ybsdk.widgets.common.bottomsheet.BottomSheetDialogView;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class gaf extends ptb1 {
    public final BottomSheetDialogView.State a;

    public gaf(BottomSheetDialogView.State state) {
        this.a = state;
    }

    public final BottomSheetDialogView.State d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gaf) && this.a.equals(((gaf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "InfoBottomSheet(dialogViewState=" + this.a + Extension.C_BRAKE;
    }
}
