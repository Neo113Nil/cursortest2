package xsna;

import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.vk.profile.community.impl.ui.profile.state.CommunityProfileState;
import kotlin.jvm.internal.PropertyReference1Impl;

/* compiled from: CommunityProfileReducer.kt */
/* loaded from: classes5.dex */
public final /* synthetic */ class bth extends PropertyReference1Impl {
    public static final bth b = new bth(CommunityProfileState.class, HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT, "getContent()Lcom/vk/profile/core/tabs/state/CommunityProfileContent;", 0);

    @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
    public final Object get(Object obj) {
        return ((CommunityProfileState) obj).d;
    }
}
