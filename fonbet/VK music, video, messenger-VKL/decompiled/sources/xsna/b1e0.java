package xsna;

import com.vk.voip.dto.call_member.CallMemberId;
import java.util.Comparator;
import java.util.HashMap;

/* compiled from: ProfilesComparator.kt */
/* loaded from: classes7.dex */
public final class b1e0 implements Comparator<String> {
    public final CallMemberId b;
    public final HashMap c;

    public b1e0(CallMemberId callMemberId, HashMap hashMap) {
        this.b = callMemberId;
        this.c = hashMap;
    }

    @Override // java.util.Comparator
    public final int compare(String str, String str2) {
        String str3 = str2;
        String str4 = this.b.b;
        HashMap hashMap = this.c;
        whr0 whr0Var = (whr0) hashMap.get(str);
        if (whr0Var == null) {
            throw new IllegalStateException("Profile must exists in profiles");
        }
        whr0 whr0Var2 = (whr0) hashMap.get(str3);
        if (whr0Var2 == null) {
            throw new IllegalStateException("Profile must exists in profiles");
        }
        if (epx.f(whr0Var.a, str4) || epx.f(whr0Var2.a, str4)) {
            return 0;
        }
        return whr0Var.e().compareTo(whr0Var2.e());
    }
}
