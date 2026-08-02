package xsna;

import com.vk.mediastore.media.exo.datasource.VkHttpCallFactory;
import com.vk.reefton.Reef;
import com.vk.reefton.ReefEvent;

/* compiled from: PlayerAnalyticsWrapper.kt */
/* loaded from: classes3.dex */
public final class oza0 implements VkHttpCallFactory.a {
    public final /* synthetic */ nza0 a;

    public oza0(nza0 nza0Var) {
        this.a = nza0Var;
    }

    @Override // com.vk.mediastore.media.exo.datasource.VkHttpCallFactory.a
    public final void e(jkv jkvVar, int i) {
        Reef reef = this.a.c;
        if (reef != null) {
            reef.a(new ReefEvent.i(ine0.r(jkvVar, i)));
        }
    }
}
