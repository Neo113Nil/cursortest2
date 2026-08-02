package xsna;

import com.vk.posting.presentation.model.PickerRootParams;

/* compiled from: PickerRootState.kt */
/* loaded from: classes5.dex */
public final class oia0 implements km50 {
    public final boolean b;
    public final PickerRootParams c;
    public final int d;

    public oia0(boolean z, PickerRootParams pickerRootParams, int i) {
        this.b = z;
        this.c = pickerRootParams;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oia0)) {
            return false;
        }
        oia0 oia0Var = (oia0) obj;
        return this.b == oia0Var.b && epx.f(this.c, oia0Var.c) && this.d == oia0Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + ((this.c.hashCode() + (Boolean.hashCode(this.b) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PickerRootState(isShowTabs=");
        sb.append(this.b);
        sb.append(", params=");
        sb.append(this.c);
        sb.append(", positionTabSelected=");
        return vu5.b(sb, this.d, ')');
    }
}
