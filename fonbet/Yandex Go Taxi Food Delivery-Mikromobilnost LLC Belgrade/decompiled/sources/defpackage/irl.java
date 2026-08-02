package defpackage;

import com.yandex.go.design.compose.slot.SlotSize;
import com.yandex.go.summary.ui.model.expanded.content.tariffcard.divider.DividerUiState$CustomGroupTitleUiState$TextStyleUiState;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class irl implements prl {
    public final String a;
    public final String b;
    public final String c;
    public final wp2 d;
    public final DividerUiState$CustomGroupTitleUiState$TextStyleUiState e;
    public final to5 f;
    public final SlotSize g;
    public final String h;

    public irl(String str, String str2, String str3, wp2 wp2Var, DividerUiState$CustomGroupTitleUiState$TextStyleUiState dividerUiState$CustomGroupTitleUiState$TextStyleUiState, to5 to5Var, SlotSize slotSize) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = wp2Var;
        this.e = dividerUiState$CustomGroupTitleUiState$TextStyleUiState;
        this.f = to5Var;
        this.g = slotSize;
        this.h = g8e.p(str, "_", "CustomGroup");
    }

    @Override // defpackage.rcx0, defpackage.fex0
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof irl)) {
            return false;
        }
        irl irlVar = (irl) obj;
        return jl40.l(this.a, irlVar.a) && jl40.l(this.b, irlVar.b) && jl40.l(this.c, irlVar.c) && jl40.l(this.d, irlVar.d) && this.e == irlVar.e && jl40.l(this.f, irlVar.f) && this.g == irlVar.g;
    }

    @Override // defpackage.rcx0
    public final String getId() {
        return this.h;
    }

    @Override // defpackage.prl
    public final String getItemId() {
        return this.a;
    }

    public final int hashCode() {
        return this.g.hashCode() + g8e.c(this.f.a, (this.e.hashCode() + n.b(this.d, unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("CustomGroupTitleUiState(itemId=", this.a, ", uniqueKey=", this.b, ", text=");
        v.append(this.c);
        v.append(", textColor=");
        v.append(this.d);
        v.append(", textStyle=");
        v.append(this.e);
        v.append(", alignment=");
        v.append(this.f);
        v.append(", slotSize=");
        v.append(this.g);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
