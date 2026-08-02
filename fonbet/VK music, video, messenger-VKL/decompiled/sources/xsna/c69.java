package xsna;

import com.vk.voip.dto.call_member.CallMemberId;
import java.util.Map;

/* compiled from: CallMemberFilter.kt */
/* loaded from: classes7.dex */
public final class c69 implements izs<CallMemberId, Boolean> {
    public final Map<String, whr0> b;
    public final String c;
    public final boolean d;

    public c69(String str, Map<String, whr0> map) {
        this.b = map;
        String obj = str != null ? drm0.p0(str).toString() : null;
        obj = obj == null ? "" : obj;
        this.c = obj;
        this.d = drm0.N(obj);
    }

    @Override // xsna.izs
    public final Boolean invoke(CallMemberId callMemberId) {
        CallMemberId callMemberId2 = callMemberId;
        if (this.d) {
            return Boolean.TRUE;
        }
        whr0 whr0Var = this.b.get(callMemberId2.b);
        if (whr0Var == null) {
            return Boolean.FALSE;
        }
        String str = whr0Var.s;
        String str2 = this.c;
        boolean z = true;
        boolean B = brm0.B(str, str2, true);
        boolean B2 = brm0.B(whr0Var.t, str2, true);
        if (!B && !B2) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
