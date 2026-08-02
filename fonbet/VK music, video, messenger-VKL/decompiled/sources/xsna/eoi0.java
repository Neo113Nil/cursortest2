package xsna;

import com.github.luben.zstd.ZstdDictDecompress;
import com.vk.profile.community.impl.ui.profile.state.Services;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;

/* compiled from: CommunityProfileContentAdsPromoteTarget.kt */
/* loaded from: classes5.dex */
public final class eoi0 implements dfh {
    public final String b;
    public final Object c;

    public eoi0(String str, byte[] bArr) {
        this.b = str;
        this.c = new ZstdDictDecompress(bArr);
    }

    @Override // xsna.dfh
    public CommunityProfileContentItem a() {
        return (Services) this.c;
    }

    @Override // xsna.dfh
    public String b() {
        return this.b;
    }

    public eoi0(String str, Services services) {
        this.b = str;
        this.c = services;
    }
}
