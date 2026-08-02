package defpackage;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.pin.api.entities.StartSessionState;
import com.ybsdk.feature.pin.internal.entities.PinTokenEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class phb {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final Text e;
    public final String f;
    public final ykb1 g;
    public final Integer h;
    public final wzb0 i;
    public final StartSessionState j;
    public final boolean k;
    public final PinTokenEntity l;

    public phb(boolean z, boolean z2, boolean z3, boolean z4, Text text, String str, ykb1 ykb1Var, Integer num, wzb0 wzb0Var, StartSessionState startSessionState, boolean z5, PinTokenEntity pinTokenEntity) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = text;
        this.f = str;
        this.g = ykb1Var;
        this.h = num;
        this.i = wzb0Var;
        this.j = startSessionState;
        this.k = z5;
        this.l = pinTokenEntity;
    }

    public static phb a(phb phbVar, boolean z, boolean z2, Text text, String str, ykb1 ykb1Var, Integer num, wzb0 wzb0Var, StartSessionState startSessionState, boolean z3, PinTokenEntity pinTokenEntity, int i) {
        boolean z4 = (i & 1) != 0 ? phbVar.a : z;
        boolean z5 = phbVar.b;
        boolean z6 = phbVar.c;
        boolean z7 = (i & 8) != 0 ? phbVar.d : z2;
        Text text2 = (i & 16) != 0 ? phbVar.e : text;
        String str2 = (i & 32) != 0 ? phbVar.f : str;
        ykb1 ykb1Var2 = (i & 64) != 0 ? phbVar.g : ykb1Var;
        Integer num2 = (i & 128) != 0 ? phbVar.h : num;
        wzb0 wzb0Var2 = (i & 256) != 0 ? phbVar.i : wzb0Var;
        StartSessionState startSessionState2 = (i & 512) != 0 ? phbVar.j : startSessionState;
        boolean z8 = (i & 1024) != 0 ? phbVar.k : z3;
        PinTokenEntity pinTokenEntity2 = (i & 2048) != 0 ? phbVar.l : pinTokenEntity;
        phbVar.getClass();
        return new phb(z4, z5, z6, z7, text2, str2, ykb1Var2, num2, wzb0Var2, startSessionState2, z8, pinTokenEntity2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof phb)) {
            return false;
        }
        phb phbVar = (phb) obj;
        return this.a == phbVar.a && this.b == phbVar.b && this.c == phbVar.c && this.d == phbVar.d && jl40.l(this.e, phbVar.e) && this.f.equals(phbVar.f) && jl40.l(this.g, phbVar.g) && jl40.l(this.h, phbVar.h) && jl40.l(this.i, phbVar.i) && jl40.l(this.j, phbVar.j) && this.k == phbVar.k && jl40.l(this.l, phbVar.l);
    }

    public final int hashCode() {
        int e = unr0.e(unr0.e(unr0.e(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
        Text text = this.e;
        int hashCode = (this.g.hashCode() + unr0.b((e + (text == null ? 0 : text.hashCode())) * 31, 31, this.f)) * 31;
        Integer num = this.h;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        wzb0 wzb0Var = this.i;
        int hashCode3 = (hashCode2 + (wzb0Var == null ? 0 : wzb0Var.hashCode())) * 31;
        StartSessionState startSessionState = this.j;
        int e2 = unr0.e((hashCode3 + (startSessionState == null ? 0 : startSessionState.hashCode())) * 31, 31, this.k);
        PinTokenEntity pinTokenEntity = this.l;
        return e2 + (pinTokenEntity != null ? pinTokenEntity.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder u = qv10.u("CheckPinState(shouldShowBiometric=", ", shouldShowSignOutButton=", ", shouldShowBankLogo=", this.a, this.b);
        nnm.v(", nfcReadyToPay=", ", errorHint=", u, this.c, this.d);
        u.append(this.e);
        u.append(", codeInput=");
        u.append(this.f);
        u.append(", screenState=");
        u.append(this.g);
        u.append(", requestsLeft=");
        u.append(this.h);
        u.append(", signOutState=");
        u.append(this.i);
        u.append(", startSessionState=");
        u.append(this.j);
        u.append(", shouldShowErrorView=");
        u.append(this.k);
        u.append(", currentTokenEntity=");
        u.append(this.l);
        u.append(Extension.C_BRAKE);
        return u.toString();
    }
}
