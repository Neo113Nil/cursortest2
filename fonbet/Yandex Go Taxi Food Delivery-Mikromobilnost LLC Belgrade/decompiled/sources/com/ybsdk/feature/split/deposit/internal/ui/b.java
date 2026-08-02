package com.ybsdk.feature.split.deposit.internal.ui;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.split.deposit.internal.ui.StatusScreenView;
import defpackage.jl40;
import defpackage.oc70;
import defpackage.rr51;
import defpackage.tc70;
import defpackage.uc70;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class b {
    public static final b f = new b(new tc70(oc70.a, true), null, null, null, 30);
    public final uc70 a;
    public final Text b;
    public final Text c;
    public final StatusScreenView.TitleStyle d;
    public final rr51 e;

    public b(uc70 uc70Var, Text.Constant constant, Text.Constant constant2, rr51 rr51Var, int i) {
        constant = (i & 2) != 0 ? null : constant;
        constant2 = (i & 4) != 0 ? null : constant2;
        StatusScreenView.TitleStyle titleStyle = StatusScreenView.TitleStyle.HEADLINE2;
        rr51Var = (i & 16) != 0 ? null : rr51Var;
        this.a = uc70Var;
        this.b = constant;
        this.c = constant2;
        this.d = titleStyle;
        this.e = rr51Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return jl40.l(this.a, bVar.a) && jl40.l(this.b, bVar.b) && jl40.l(this.c, bVar.c) && this.d == bVar.d && jl40.l(this.e, bVar.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Text text = this.b;
        int hashCode2 = (hashCode + (text == null ? 0 : text.hashCode())) * 31;
        Text text2 = this.c;
        int hashCode3 = (this.d.hashCode() + ((hashCode2 + (text2 == null ? 0 : text2.hashCode())) * 31)) * 31;
        rr51 rr51Var = this.e;
        return hashCode3 + (rr51Var != null ? rr51Var.hashCode() : 0);
    }

    public final String toString() {
        return "State(operationState=" + this.a + ", label=" + this.b + ", sublabel=" + this.c + ", labelStyle=" + this.d + ", bottomDivData=" + this.e + Extension.C_BRAKE;
    }
}
