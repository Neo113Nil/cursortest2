package xsna;

import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;

/* compiled from: AccountSetSilenceModeApiCmd.kt */
/* loaded from: classes2.dex */
public final class js extends nx2<Boolean> {
    public final String b;
    public final Peer c;
    public final Peer d;
    public final long e;
    public final boolean f;
    public final boolean g = true;

    public js(String str, Peer peer, Peer peer2, long j, boolean z) {
        this.b = str;
        this.c = peer;
        this.d = peer2;
        this.e = j;
        this.f = z;
        if (drm0.N(str)) {
            throw new IllegalArgumentException("Illegal deviceId value: ".concat(str).toString());
        }
    }

    @Override // xsna.nx2
    public final Boolean f(l7r0 l7r0Var) {
        es esVar = new es();
        UserId b = com.vk.dto.common.a.b(this.c);
        return Boolean.valueOf(bz2.l(esVar.f(this.b, Integer.valueOf((int) this.e), b, Integer.valueOf(this.f ? 1 : 0), fto0.d(this.d)), this.g) == BaseOkResponseDto.OK);
    }
}
