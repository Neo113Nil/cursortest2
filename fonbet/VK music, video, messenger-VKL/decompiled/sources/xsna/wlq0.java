package xsna;

import com.vk.profile.user.api.domain.actions.ProfileAction;
import xsna.gs90;
import xsna.zp0;

/* compiled from: UserProfileAdditionalActionFeatureDelegate.kt */
/* loaded from: classes5.dex */
public final class wlq0 implements ProfileAction {
    public final ztu a;
    public final ProfileAction.Type b;

    public wlq0(zp0.a aVar, ProfileAction.Type type) {
        this.a = new ztu(aVar.e, aVar.c);
        this.b = type;
    }

    @Override // com.vk.profile.user.api.domain.actions.ProfileAction
    public final ztu a() {
        return this.a;
    }

    @Override // com.vk.profile.user.api.domain.actions.ProfileAction
    public final vv5 b() {
        return null;
    }

    @Override // com.vk.profile.user.api.domain.actions.ProfileAction
    public final int c() {
        return 0;
    }

    @Override // com.vk.profile.user.api.domain.actions.ProfileAction
    public final gs90.a getPayload() {
        return null;
    }

    @Override // com.vk.profile.user.api.domain.actions.ProfileAction
    public final ProfileAction.Type getType() {
        return this.b;
    }
}
