package defpackage;

import com.ybsdk.feature.dashboard.api.model.SupportState;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class nmg {
    public final mmg a;
    public final u8j0 b;
    public final SupportState c;
    public final boolean d;
    public final boolean e;
    public final List f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final sms0 k;
    public final boolean l;

    public nmg(mmg mmgVar, u8j0 u8j0Var, SupportState supportState, boolean z, boolean z2, List list, boolean z3, boolean z4, boolean z5, boolean z6, sms0 sms0Var, boolean z7) {
        this.a = mmgVar;
        this.b = u8j0Var;
        this.c = supportState;
        this.d = z;
        this.e = z2;
        this.f = list;
        this.g = z3;
        this.h = z4;
        this.i = z5;
        this.j = z6;
        this.k = sms0Var;
        this.l = z7;
    }

    public static nmg a(nmg nmgVar, u8j0 u8j0Var, SupportState supportState, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, sms0 sms0Var, int i) {
        mmg mmgVar = nmgVar.a;
        if ((i & 2) != 0) {
            u8j0Var = nmgVar.b;
        }
        u8j0 u8j0Var2 = u8j0Var;
        SupportState supportState2 = (i & 4) != 0 ? nmgVar.c : supportState;
        boolean z6 = (i & 8) != 0 ? nmgVar.d : z;
        boolean z7 = (i & 16) != 0 ? nmgVar.e : false;
        List list = (i & 32) != 0 ? nmgVar.f : null;
        if ((i & 64) != 0) {
            nmgVar.getClass();
        }
        boolean z8 = (i & 128) != 0 ? nmgVar.g : z2;
        boolean z9 = (i & 256) != 0 ? nmgVar.h : z3;
        boolean z10 = (i & 512) != 0 ? nmgVar.i : z4;
        boolean z11 = (i & 1024) != 0 ? nmgVar.j : z5;
        sms0 sms0Var2 = (i & 2048) != 0 ? nmgVar.k : sms0Var;
        boolean z12 = (i & 4096) != 0 ? nmgVar.l : true;
        nmgVar.getClass();
        return new nmg(mmgVar, u8j0Var2, supportState2, z6, z7, list, z8, z9, z10, z11, sms0Var2, z12);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nmg)) {
            return false;
        }
        nmg nmgVar = (nmg) obj;
        return this.a.equals(nmgVar.a) && this.b.equals(nmgVar.b) && this.c == nmgVar.c && this.d == nmgVar.d && this.e == nmgVar.e && jl40.l(this.f, nmgVar.f) && this.g == nmgVar.g && this.h == nmgVar.h && this.i == nmgVar.i && this.j == nmgVar.j && jl40.l(this.k, nmgVar.k) && this.l == nmgVar.l;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        SupportState supportState = this.c;
        int e = unr0.e(unr0.e(unr0.e(unr0.e(unr0.c(unr0.e(unr0.e((hashCode + (supportState == null ? 0 : supportState.hashCode())) * 31, 31, this.d), 31, this.e), 961, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j);
        sms0 sms0Var = this.k;
        return Boolean.hashCode(this.l) + ((e + (sms0Var != null ? sms0Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DashboardV3State(payload=");
        sb.append(this.a);
        sb.append(", dashboardEntityRequest=");
        sb.append(this.b);
        sb.append(", supportState=");
        sb.append(this.c);
        sb.append(", isPullToRefreshVisible=");
        sb.append(this.d);
        sb.append(", isNfcSettingsAvailable=");
        sb.append(this.e);
        sb.append(", cardTokenizedList=");
        sb.append(this.f);
        sb.append(", nfcSysChecks=null, canShowEducationV2=");
        nnm.v(", isDataStatusAfterLoading=", ", isPullToRefreshEnabled=", sb, this.g, this.h);
        nnm.v(", hasFullscreenToShow=", ", skinSelectionEntity=", sb, this.i, this.j);
        sb.append(this.k);
        sb.append(", canIgnoreCacheExpiration=");
        sb.append(this.l);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
