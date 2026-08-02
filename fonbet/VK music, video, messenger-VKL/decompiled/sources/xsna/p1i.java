package xsna;

import android.content.Context;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedCommunityProfile;

/* compiled from: CommunitySettingsActionsDelegate.kt */
/* loaded from: classes5.dex */
public final class p1i extends beg0 {
    public final /* synthetic */ o1i d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1i(o1i o1iVar, Context context) {
        super(context);
        this.d = o1iVar;
    }

    @Override // xsna.beg0
    public final void r() {
        o1i o1iVar = this.d;
        ExtendedCommunityProfile extendedCommunityProfile = o1iVar.c;
        boolean z = extendedCommunityProfile.j1;
        extendedCommunityProfile.j1 = !z;
        cvk.w(((Context) this.b).getString(!z ? R.string.subscribed_to_posts : R.string.unsubscribed_from_posts), false);
        o1iVar.d.dl(extendedCommunityProfile);
    }
}
