package xsna;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import com.vkontakte.android.api.ExtendedCommunityProfile;

/* compiled from: CommunityProfileHeaderItemsFactoryParams.kt */
/* loaded from: classes5.dex */
public final class bph {
    public final Context a;
    public final ExtendedCommunityProfile b;
    public final defpackage.t c;
    public final com.vk.movika.sdk.base.presenter.c d;
    public final t2o e;
    public final ynh f;
    public final o3h g;
    public final yte h;
    public final izs<View, s3q0> i;
    public final Lifecycle j;
    public final f5z k;

    public bph(Context context, ExtendedCommunityProfile extendedCommunityProfile, defpackage.t tVar, com.vk.movika.sdk.base.presenter.c cVar, t2o t2oVar, ynh ynhVar, sph sphVar, yte yteVar, com.vk.newsfeed.posting.impl.presentation.base.fragment.a aVar, Lifecycle lifecycle, f5z f5zVar) {
        this.a = context;
        this.b = extendedCommunityProfile;
        this.c = tVar;
        this.d = cVar;
        this.e = t2oVar;
        this.f = ynhVar;
        this.g = sphVar;
        this.h = yteVar;
        this.i = aVar;
        this.j = lifecycle;
        this.k = f5zVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bph)) {
            return false;
        }
        bph bphVar = (bph) obj;
        return this.a.equals(bphVar.a) && epx.f(this.b, bphVar.b) && this.c.equals(bphVar.c) && this.d.equals(bphVar.d) && epx.f(this.e, bphVar.e) && epx.f(this.f, bphVar.f) && epx.f(this.g, bphVar.g) && this.h.equals(bphVar.h) && epx.f(this.i, bphVar.i) && epx.f(this.j, bphVar.j) && this.k.equals(bphVar.k);
    }

    public final int hashCode() {
        int hashCode = (this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        o3h o3hVar = this.g;
        int hashCode2 = (this.h.hashCode() + ((hashCode + (o3hVar == null ? 0 : o3hVar.hashCode())) * 31)) * 31;
        izs<View, s3q0> izsVar = this.i;
        return this.k.hashCode() + ((this.j.hashCode() + ((hashCode2 + (izsVar != null ? izsVar.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "CommunityProfileHeaderItemsFactorySharedParams(context=" + this.a + ", community=" + this.b + ", headerActionsDelegateProvider=" + this.c + ", postingItemPresenterProvider=" + this.d + ", donutStatsItemCallback=" + this.e + ", diDependencies=" + this.f + ", communityOnboardingConfiguration=" + this.g + ", sendAction=" + this.h + ", onJoinButtonCreated=" + this.i + ", lifecycle=" + this.j + ", lifecycleOwner=" + this.k + ')';
    }
}
