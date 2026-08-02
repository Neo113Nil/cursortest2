package xsna;

import com.vk.avatar.api.border.AvatarBorderType;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.voip.api.dto.VoipChatInfo;
import com.vk.voip.dto.call_member.CallMemberId;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.EmptySet;

/* compiled from: VoipCallInfoConvert.kt */
/* loaded from: classes7.dex */
public final class ehw0 {
    public static final dhw0 a(zqk0 zqk0Var) {
        String str = zqk0Var.a;
        long j = zqk0Var.b;
        String str2 = zqk0Var.c;
        String str3 = zqk0Var.d;
        String str4 = zqk0Var.e;
        boolean z = zqk0Var.f;
        boolean z2 = zqk0Var.g;
        Set<String> set = zqk0Var.h;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Serializer.c<CallMemberId> cVar = CallMemberId.CREATOR;
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(CallMemberId.a.a((String) it.next()));
        }
        boolean z3 = zqk0Var.i;
        UserId userId = zqk0Var.j;
        xdw0 xdw0Var = zqk0Var.k;
        VoipChatInfo voipChatInfo = zqk0Var.l;
        xmw0 xmw0Var = zqk0Var.m;
        int i = zqk0Var.n;
        kr5 kr5Var = new kr5(zqk0Var.u ? AvatarBorderType.HEXAGON : AvatarBorderType.CIRCLE, (h2z) null, new gfv0(zqk0Var, 3), 6);
        int size = linkedHashSet.size();
        EmptySet emptySet = EmptySet.b;
        k8x0 k8x0Var = new k8x0(0);
        jgp jgpVar = jgp.b;
        return new dhw0(str, j, str2, str3, str4, z, z2, linkedHashSet, size, emptySet, emptySet, emptySet, null, emptySet, emptySet, emptySet, jgpVar, emptySet, jgpVar, jgpVar, jgpVar, jgpVar, emptySet, emptySet, null, null, xdw0Var, voipChatInfo, xmw0Var, z3, z3, i, emptySet, false, false, false, false, k8x0Var, userId, kr5Var);
    }
}
