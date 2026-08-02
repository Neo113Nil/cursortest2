package xsna;

import com.vk.voip.ui.BannedBottomSheet;

/* compiled from: ShowBottomSheet.kt */
/* loaded from: classes7.dex */
public final class shj0 {
    public final BannedBottomSheet a;
    public final gzs<s3q0> b;

    public shj0(BannedBottomSheet bannedBottomSheet, gzs gzsVar) {
        this.a = bannedBottomSheet;
        this.b = gzsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof shj0)) {
            return false;
        }
        shj0 shj0Var = (shj0) obj;
        return this.a.equals(shj0Var.a) && epx.f(this.b, shj0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        gzs<s3q0> gzsVar = this.b;
        return hashCode + (gzsVar == null ? 0 : gzsVar.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShowBottomSheet(dialog=");
        sb.append(this.a);
        sb.append(", callback=");
        return uf3.d(sb, this.b, ')');
    }
}
