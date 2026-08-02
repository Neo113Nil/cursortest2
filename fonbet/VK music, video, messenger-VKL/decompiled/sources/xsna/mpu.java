package xsna;

import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.dto.common.id.UserId;
import java.util.Collections;

/* compiled from: GroupsEditCmd.kt */
/* loaded from: classes2.dex */
public final class mpu extends le6<s3q0> {
    public final Peer.Group b;
    public final String c;
    public final String d;
    public final Boolean e;

    public mpu(Peer.Group group, String str, String str2, Boolean bool) {
        this.b = group;
        this.c = str;
        this.d = str2;
        this.e = bool;
    }

    @Override // xsna.le6
    public final s3q0 e(w2w w2wVar) {
        xy2 o;
        zqu zquVar = new zqu();
        Peer.Group group = this.b;
        o = zquVar.o(new UserId(group.d), (r30 & 2) != 0 ? null : this.c, (r30 & 4) != 0 ? null : this.d, (r30 & 8) != 0 ? null : null, (r30 & 16) != 0 ? null : null, (r30 & 32) != 0 ? null : null, (r30 & 256) != 0 ? null : null, (r30 & 134217728) != 0 ? null : this.e, (r31 & 4) != 0 ? null : null, (r32 & 64) != 0 ? null : null, (r32 & 256) != 0 ? null : null, (r32 & 512) != 0 ? null : null, (4194304 & r32) != 0 ? null : null, (r32 & 8388608) != 0 ? null : null);
        bz2.d(o);
        w2wVar.L0(this, new tpu(Collections.singletonList(group), Source.NETWORK, false, 8));
        w2wVar.S0().H(-group.d);
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mpu)) {
            return false;
        }
        mpu mpuVar = (mpu) obj;
        return epx.f(this.b, mpuVar.b) && epx.f(this.c, mpuVar.c) && epx.f(this.d, mpuVar.d) && epx.f(this.e, mpuVar.e);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        int hashCode = Long.hashCode(this.b.b) * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.e;
        return qoy.b((hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31, 31, false);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsEditCmd(groupPeer=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", description=");
        sb.append(this.d);
        sb.append(", canMessage=");
        return xq.d(sb, this.e, ", isAwaitNetwork=false, changerTag=null)");
    }
}
