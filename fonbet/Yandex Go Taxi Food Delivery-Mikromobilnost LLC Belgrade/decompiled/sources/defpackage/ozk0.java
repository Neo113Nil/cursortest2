package defpackage;

import com.ybsdk.widgets.common.bottomsheet.BottomSheetDialogView;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ozk0 implements qas0 {
    public final BottomSheetDialogView.State a;

    public ozk0(BottomSheetDialogView.State state) {
        this.a = state;
    }

    public final BottomSheetDialogView.State a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ozk0) && this.a.equals(((ozk0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "TurnOffNotice(bottomSheetState=" + this.a + Extension.C_BRAKE;
    }
}
