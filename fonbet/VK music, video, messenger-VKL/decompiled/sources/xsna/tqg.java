package xsna;

import com.vk.dto.profile.PlainAddress;

/* compiled from: CommunityAddressClusterAdapter.kt */
/* loaded from: classes5.dex */
public final class tqg implements twf {
    public final PlainAddress a;
    public final edr0 b;

    public tqg(PlainAddress plainAddress) {
        this.a = plainAddress;
        this.b = new edr0(plainAddress.c, plainAddress.d);
    }

    @Override // xsna.twf
    public final String a() {
        return "";
    }

    @Override // xsna.twf
    public final String b() {
        return "";
    }

    @Override // xsna.twf
    public final edr0 c() {
        return this.b;
    }
}
