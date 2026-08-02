package xsna;

import com.vk.voip.dto.call_member.CallMemberId;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.EmptySet;

/* compiled from: WaitingRoomParticipantsData.kt */
/* loaded from: classes7.dex */
public final class k8x0 {
    public final Set<CallMemberId> a;
    public final boolean b;
    public final boolean c;

    public k8x0() {
        this(0);
    }

    public static k8x0 a(k8x0 k8x0Var, LinkedHashSet linkedHashSet) {
        boolean z = k8x0Var.b;
        boolean z2 = k8x0Var.c;
        k8x0Var.getClass();
        return new k8x0(linkedHashSet, z, z2);
    }

    public final Set<CallMemberId> b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k8x0)) {
            return false;
        }
        k8x0 k8x0Var = (k8x0) obj;
        return epx.f(this.a, k8x0Var.a) && this.b == k8x0Var.b && this.c == k8x0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + qoy.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WaitingRoomParticipantsData(waitingRoomParticipants=");
        sb.append(this.a);
        sb.append(", hasAdded=");
        sb.append(this.b);
        sb.append(", hasRemoved=");
        return defpackage.q0.a(sb, this.c, ')');
    }

    public k8x0(Set<CallMemberId> set, boolean z, boolean z2) {
        this.a = set;
        this.b = z;
        this.c = z2;
    }

    public k8x0(int i) {
        this(EmptySet.b, false, false);
    }
}
