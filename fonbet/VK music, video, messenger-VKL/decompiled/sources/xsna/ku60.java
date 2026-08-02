package xsna;

import com.vk.bridges.di.BridgeComponent;
import com.vk.community.strikes.api.di.CommunityStrikesComponent;
import kotlin.Lazy;

/* compiled from: NewsfeedNotifier.kt */
/* loaded from: classes4.dex */
public final class ku60 {
    public final Lazy<CommunityStrikesComponent> a;
    public final Lazy b;

    /* JADX WARN: Multi-variable type inference failed */
    public ku60(Lazy<? extends CommunityStrikesComponent> lazy, Lazy<? extends BridgeComponent> lazy2) {
        this.a = lazy;
        this.b = lazy2;
    }
}
