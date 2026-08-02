package defpackage;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.autotopup.internal.presentation.saver.AutoTopupRegularViewModel$AutoTopupRegularSideEffect$Tooltip$Target;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class dy3 implements qas0 {
    public final Text.Constant a;
    public final AutoTopupRegularViewModel$AutoTopupRegularSideEffect$Tooltip$Target b;

    public dy3(Text.Constant constant, AutoTopupRegularViewModel$AutoTopupRegularSideEffect$Tooltip$Target autoTopupRegularViewModel$AutoTopupRegularSideEffect$Tooltip$Target) {
        this.a = constant;
        this.b = autoTopupRegularViewModel$AutoTopupRegularSideEffect$Tooltip$Target;
    }

    public final AutoTopupRegularViewModel$AutoTopupRegularSideEffect$Tooltip$Target a() {
        return this.b;
    }

    public final Text b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dy3)) {
            return false;
        }
        dy3 dy3Var = (dy3) obj;
        return this.a.equals(dy3Var.a) && this.b == dy3Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Tooltip(title=" + this.a + ", target=" + this.b + Extension.C_BRAKE;
    }
}
