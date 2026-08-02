package xsna;

import com.vk.voip.dto.call_member.CallMember;
import com.vk.voip.dto.call_member.CallMemberId;
import com.vk.voip.ui.groupcalls.GroupCallViewModel;
import java.util.Comparator;
import xsna.nxn0;

/* compiled from: Comparisons.kt */
/* loaded from: classes7.dex */
public final class wiu implements Comparator {
    public final /* synthetic */ int b;

    public /* synthetic */ wiu(int i) {
        this.b = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i;
        switch (this.b) {
            case 0:
                kiu kiuVar = (kiu) obj;
                CallMember callMember = kiuVar.a;
                int i2 = 7;
                if (callMember.n) {
                    i = 0;
                } else {
                    String str = callMember.a.b;
                    GroupCallViewModel.b.getClass();
                    com.vk.voip.ui.c.b.getClass();
                    CallMemberId a = com.vk.voip.ui.c.r.a();
                    if (epx.f(str, a != null ? a.b : null)) {
                        i = 1;
                    } else if (kiuVar.m) {
                        i = 2;
                    } else if (kiuVar.a.s.isEmpty()) {
                        CallMember callMember2 = kiuVar.a;
                        i = callMember2.i ? 4 : callMember2.g ? 5 : callMember2.h ? 6 : 7;
                    } else {
                        i = 3;
                    }
                }
                Integer valueOf = Integer.valueOf(i);
                kiu kiuVar2 = (kiu) obj2;
                CallMember callMember3 = kiuVar2.a;
                if (callMember3.n) {
                    i2 = 0;
                } else {
                    String str2 = callMember3.a.b;
                    GroupCallViewModel.b.getClass();
                    com.vk.voip.ui.c.b.getClass();
                    CallMemberId a2 = com.vk.voip.ui.c.r.a();
                    if (epx.f(str2, a2 != null ? a2.b : null)) {
                        i2 = 1;
                    } else if (kiuVar2.m) {
                        i2 = 2;
                    } else if (kiuVar2.a.s.isEmpty()) {
                        CallMember callMember4 = kiuVar2.a;
                        if (callMember4.i) {
                            i2 = 4;
                        } else if (callMember4.g) {
                            i2 = 5;
                        } else if (callMember4.h) {
                            i2 = 6;
                        }
                    } else {
                        i2 = 3;
                    }
                }
                return jw5.b(valueOf, Integer.valueOf(i2));
            case 1:
                return jw5.b(Long.valueOf(((jrp) obj).d), Long.valueOf(((jrp) obj2).d));
            case 2:
                return jw5.b(Integer.valueOf(((ic50) obj).e), Integer.valueOf(((ic50) obj2).e));
            default:
                return jw5.b(((nxn0.d) obj).a, ((nxn0.d) obj2).a);
        }
    }
}
