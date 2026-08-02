package defpackage;

import com.ybsdk.widgets.common.bottomsheet.BottomSheetDialogView;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class hd9 implements kd9 {
    public final BottomSheetDialogView.State a;

    public hd9(BottomSheetDialogView.State state) {
        this.a = state;
    }

    public final BottomSheetDialogView.State a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hd9) && this.a.equals(((hd9) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Error(content=" + this.a + Extension.C_BRAKE;
    }
}
