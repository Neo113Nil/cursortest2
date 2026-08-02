package xsna;

import com.vk.dto.common.Peer;
import com.vk.im.engine.models.groups.MemberStatus;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import java.util.Collections;

/* compiled from: UpdateSubscriptionStatusCmd.kt */
/* loaded from: classes2.dex */
public final class h9q0 extends le6<s3q0> {
    public final long b;
    public final int c;
    public final Peer.Type d;

    /* compiled from: UpdateSubscriptionStatusCmd.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Peer.Type.values().length];
            try {
                iArr[Peer.Type.USER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Peer.Type.GROUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public h9q0(long j, int i, Peer.Type type) {
        this.b = j;
        this.c = i;
        this.d = type;
    }

    @Override // xsna.le6
    public final s3q0 e(w2w w2wVar) {
        int[] iArr = a.$EnumSwitchMapping$0;
        Peer.Type type = this.d;
        int i = iArr[type.ordinal()];
        int i2 = this.c;
        long j = this.b;
        if (i == 1) {
            w2wVar.I0().d().g(i2, j);
            bzp.E(w2wVar.S0(), Collections.singletonList(Long.valueOf(j)), null, null, 14);
        } else if (i != 2) {
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l, L.LogType.e, new Object[]{"Unsupported peer type " + type});
            }
        } else {
            bru n = w2wVar.I0().n();
            long j2 = -j;
            MemberStatus.a aVar = MemberStatus.Companion;
            Integer valueOf = Integer.valueOf(i2);
            aVar.getClass();
            n.h(j2, MemberStatus.a.a(valueOf));
            bzp.E(w2wVar.S0(), null, null, Collections.singletonList(Long.valueOf(j2)), 7);
        }
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h9q0)) {
            return false;
        }
        h9q0 h9q0Var = (h9q0) obj;
        return this.b == h9q0Var.b && this.c == h9q0Var.c && this.d == h9q0Var.d;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return this.d.hashCode() + shy.a(this.c, Long.hashCode(this.b) * 31, 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        return "UpdateSubscriptionStatusCmd(userId=" + this.b + ", status=" + this.c + ", type=" + this.d + ')';
    }
}
