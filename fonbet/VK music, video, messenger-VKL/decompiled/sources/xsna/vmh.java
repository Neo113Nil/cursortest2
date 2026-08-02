package xsna;

import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import xsna.tmh;

/* compiled from: CommunityProfileDetailsDialogViewDelegate.kt */
/* loaded from: classes5.dex */
public final class vmh implements tmh.a {
    public final /* synthetic */ tmh a;
    public final /* synthetic */ ExtendedCommunityProfile b;

    public vmh(tmh tmhVar, ExtendedCommunityProfile extendedCommunityProfile) {
        this.a = tmhVar;
        this.b = extendedCommunityProfile;
    }

    @Override // xsna.tmh.a
    public final void a() {
        this.a.d.invoke(new CommunityProfileAction.e.d.C1582e(this.b));
    }
}
