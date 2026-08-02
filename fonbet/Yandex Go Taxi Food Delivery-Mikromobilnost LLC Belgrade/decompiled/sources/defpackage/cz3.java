package defpackage;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.bottomsheet.BottomSheetDialogView;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class cz3 {
    public final rbv a;
    public final Text b;
    public final Text c;
    public final Text d;
    public final YbButtonView.a e;
    public final YbButtonView.a f;
    public final qc70 g;
    public final BottomSheetDialogView.State h;
    public final boolean i;
    public final qc70 j;

    public cz3(rbv rbvVar, Text text, Text text2, Text text3, YbButtonView.a aVar, YbButtonView.a aVar2, qc70 qc70Var, BottomSheetDialogView.State state, boolean z, qc70 qc70Var2) {
        this.a = rbvVar;
        this.b = text;
        this.c = text2;
        this.d = text3;
        this.e = aVar;
        this.f = aVar2;
        this.g = qc70Var;
        this.h = state;
        this.i = z;
        this.j = qc70Var2;
    }

    public final Text a() {
        return this.b;
    }

    public final BottomSheetDialogView.State b() {
        return this.h;
    }

    public final Text c() {
        return this.d;
    }

    public final rbv d() {
        return this.a;
    }

    public final qc70 e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cz3)) {
            return false;
        }
        cz3 cz3Var = (cz3) obj;
        return this.a.equals(cz3Var.a) && jl40.l(this.b, cz3Var.b) && jl40.l(this.c, cz3Var.c) && jl40.l(this.d, cz3Var.d) && jl40.l(this.e, cz3Var.e) && jl40.l(this.f, cz3Var.f) && this.g.equals(cz3Var.g) && jl40.l(this.h, cz3Var.h) && this.i == cz3Var.i && this.j.equals(cz3Var.j);
    }

    public final YbButtonView.a f() {
        return this.e;
    }

    public final qc70 g() {
        return this.j;
    }

    public final YbButtonView.a h() {
        return this.f;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Text text = this.b;
        int hashCode2 = (hashCode + (text == null ? 0 : text.hashCode())) * 31;
        Text text2 = this.c;
        int hashCode3 = (hashCode2 + (text2 == null ? 0 : text2.hashCode())) * 31;
        Text text3 = this.d;
        int hashCode4 = (hashCode3 + (text3 == null ? 0 : text3.hashCode())) * 31;
        YbButtonView.a aVar = this.e;
        int hashCode5 = (hashCode4 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        YbButtonView.a aVar2 = this.f;
        int hashCode6 = (this.g.hashCode() + ((hashCode5 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31)) * 31;
        BottomSheetDialogView.State state = this.h;
        return this.j.hashCode() + unr0.e((hashCode6 + (state != null ? state.hashCode() : 0)) * 31, 31, this.i);
    }

    public final boolean i() {
        return this.i;
    }

    public final Text j() {
        return this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AutoTopupResultViewState(image=");
        sb.append(this.a);
        sb.append(", amount=");
        sb.append(this.b);
        sb.append(", title=");
        ly3.C(sb, this.c, ", description=", this.d, ", primaryButton=");
        sb.append(this.e);
        sb.append(", secondaryButton=");
        sb.append(this.f);
        sb.append(", operationIcon=");
        sb.append(this.g);
        sb.append(", bottomSheet=");
        sb.append(this.h);
        sb.append(", shouldShowSkeletons=");
        sb.append(this.i);
        sb.append(", progressBar=");
        sb.append(this.j);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
