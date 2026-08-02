package defpackage;

import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.widgets.common.ToolbarView;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class ntz0 implements rtz0 {
    public final ColorModel a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ntz0(int i) {
        this(new ColorModel.Attr(ung0.ybColor_textIcon_primary));
        mtz0 mtz0Var;
        mtz0Var = ToolbarView.Companion;
        mtz0Var.getClass();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ntz0) && jl40.l(this.a, ((ntz0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CloseButton(color=" + this.a + Extension.C_BRAKE;
    }

    public ntz0() {
        this(0);
    }

    public ntz0(ColorModel colorModel) {
        this.a = colorModel;
    }
}
