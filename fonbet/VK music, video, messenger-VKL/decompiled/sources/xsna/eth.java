package xsna;

import com.vk.profile.community.impl.ui.profile.state.CommunityProfileState;
import kotlin.jvm.internal.PropertyReference1Impl;

/* compiled from: CommunityProfileReducer.kt */
/* loaded from: classes5.dex */
public final /* synthetic */ class eth extends PropertyReference1Impl {
    public static final eth b = new eth(CommunityProfileState.class, "communityGeneration", "getCommunityGeneration()I", 0);

    @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
    public final Object get(Object obj) {
        return Integer.valueOf(((CommunityProfileState) obj).c);
    }
}
