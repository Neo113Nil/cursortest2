package defpackage;

import com.ybsdk.widgets.common.bottomsheet.BottomSheetDialogView;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class eh6 implements ih6 {
    public final BottomSheetDialogView.State a;

    public eh6(BottomSheetDialogView.State state) {
        this.a = state;
    }

    public final BottomSheetDialogView.State a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eh6) && this.a.equals(((eh6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SbpEnableRequired(state=" + this.a + Extension.C_BRAKE;
    }
}
