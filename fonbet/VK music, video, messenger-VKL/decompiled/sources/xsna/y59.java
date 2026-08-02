package xsna;

import com.vk.voip.dto.call_member.CallMemberId;
import java.util.Comparator;
import java.util.Map;

/* compiled from: CallMemberComparator.kt */
/* loaded from: classes7.dex */
public final class y59 implements Comparator<CallMemberId> {
    public final CallMemberId b;
    public final Map<String, whr0> c;

    public y59(CallMemberId callMemberId, Map<String, whr0> map) {
        this.b = callMemberId;
        this.c = map;
    }

    @Override // java.util.Comparator
    public final int compare(CallMemberId callMemberId, CallMemberId callMemberId2) {
        CallMemberId callMemberId3 = callMemberId2;
        String str = callMemberId.b;
        Map<String, whr0> map = this.c;
        whr0 whr0Var = map.get(str);
        if (whr0Var == null) {
            throw new IllegalStateException("Profile must exists in profiles");
        }
        whr0 whr0Var2 = map.get(callMemberId3.b);
        if (whr0Var2 == null) {
            throw new IllegalStateException("Profile must exists in profiles");
        }
        String str2 = whr0Var.a;
        CallMemberId callMemberId4 = this.b;
        if (epx.f(str2, callMemberId4.b) || epx.f(whr0Var2.a, callMemberId4.b)) {
            return 0;
        }
        return whr0Var.e().compareTo(whr0Var2.e());
    }
}
