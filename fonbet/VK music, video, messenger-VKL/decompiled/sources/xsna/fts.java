package xsna;

import android.view.View;
import com.vk.dto.user.UserProfile;
import xsna.nqs;

/* compiled from: FriendsSelectionAdapter.kt */
/* loaded from: classes15.dex */
public final class fts extends vif0<nqs> {
    public final /* synthetic */ ets n;
    public final /* synthetic */ ekq0<UserProfile> o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fts(ets etsVar, ekq0<UserProfile> ekq0Var, View view) {
        super(view);
        this.n = etsVar;
        this.o = ekq0Var;
    }

    @Override // xsna.vif0
    public final void i6(nqs nqsVar) {
        nqs nqsVar2 = nqsVar;
        UserProfile userProfile = nqsVar2 instanceof nqs.a ? ((nqs.a) nqsVar2).a : nqsVar2 instanceof pqs ? ((pqs) nqsVar2).a : null;
        if (userProfile != null) {
            userProfile.l = ((Boolean) this.n.g.invoke(userProfile.c)).booleanValue();
            this.o.V5(userProfile);
        }
    }
}
