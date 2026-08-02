package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.group.GroupContentTabSetting;
import com.vk.dto.group.GroupContentTabType;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vk.profile.community.impl.ui.profile.d;
import com.vk.profile.community.impl.ui.profile.state.CommunityProfileState;
import com.vk.profile.core.content.ContentTab;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import java.util.concurrent.TimeUnit;

/* compiled from: CommunityProfileContentBaseFeatureDelegate.kt */
/* loaded from: classes5.dex */
public abstract class nfh<T extends CommunityProfileContentItem, Action> implements jxg<T> {
    public final UserId a;
    public final io.reactivex.rxjava3.disposables.b b;
    public final izs<com.vk.profile.community.impl.ui.profile.d, s3q0> c;
    public final izs<com.vk.profile.community.impl.ui.profile.actions.d, s3q0> d;
    public final izs<CommunityProfileAction.f, s3q0> e;
    public final boolean f;
    public boolean g;
    public final io.reactivex.rxjava3.disposables.b h = new io.reactivex.rxjava3.disposables.b();
    public boolean i = true;

    /* JADX WARN: Multi-variable type inference failed */
    public nfh(UserId userId, io.reactivex.rxjava3.disposables.b bVar, izs<? super com.vk.profile.community.impl.ui.profile.d, s3q0> izsVar, izs<? super com.vk.profile.community.impl.ui.profile.actions.d, s3q0> izsVar2, izs<? super CommunityProfileAction.f, s3q0> izsVar3, boolean z) {
        this.a = userId;
        this.b = bVar;
        this.c = izsVar;
        this.d = izsVar2;
        this.e = izsVar3;
        this.f = z;
    }

    public static CommunityProfileContentItem.d n(nfh nfhVar, GroupContentTabSetting groupContentTabSetting, int i, int i2, boolean z, int i3) {
        com.vk.profile.core.tabs.state.a aVar;
        com.vk.profile.core.tabs.state.b bVar;
        Integer valueOf = Integer.valueOf(R.string.community_profile_fab_create);
        boolean z2 = false;
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            valueOf = null;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        if ((i3 & 64) != 0) {
            z = false;
        }
        nfhVar.getClass();
        boolean z3 = groupContentTabSetting.d;
        boolean z4 = groupContentTabSetting.e;
        GroupContentTabSetting.GroupContentTabTabletConfig groupContentTabTabletConfig = groupContentTabSetting.f;
        Boolean bool = groupContentTabTabletConfig != null ? groupContentTabTabletConfig.c : null;
        if ((!nfhVar.f || bool == null) ? z3 : bool.booleanValue()) {
            if (z4 || i == 0) {
                i = valueOf != null ? valueOf.intValue() : R.string.community_profile_fab_add;
            }
            aVar = new com.vk.profile.core.tabs.state.a(i, 0, null);
        } else {
            aVar = null;
        }
        GroupContentTabType groupContentTabType = groupContentTabSetting.b;
        GroupContentTabType groupContentTabType2 = GroupContentTabType.SHORT_VIDEOS;
        if (!(groupContentTabType != groupContentTabType2 && z4) || z3 || i2 == 0) {
            if (groupContentTabType != groupContentTabType2 && z4) {
                z2 = true;
            }
            bVar = z2 ? new com.vk.profile.core.tabs.state.b(R.string.community_profile_fab_open) : null;
        } else {
            bVar = new com.vk.profile.core.tabs.state.b(i2);
        }
        if (z) {
            bVar = null;
        }
        com.vk.profile.core.tabs.state.b bVar2 = new com.vk.profile.core.tabs.state.b(R.string.community_growth_trap_button_text);
        if (!z) {
            bVar2 = null;
        }
        if (aVar == null && bVar == null && bVar2 == null) {
            return null;
        }
        return new CommunityProfileContentItem.d(aVar, bVar, bVar2);
    }

    public static CommunityProfileContentItem.b p(nfh nfhVar, GroupContentTabSetting groupContentTabSetting, int i, Integer num, String str, int i2) {
        if ((i2 & 2) != 0) {
            num = null;
        }
        String str2 = (i2 & 8) != 0 ? null : str;
        nfhVar.getClass();
        return new CommunityProfileContentItem.b(i, groupContentTabSetting.d ? num : null, null, str2, null, 16);
    }

    @Override // xsna.jxg
    public void b(ContentTab contentTab, ExtendedCommunityProfile extendedCommunityProfile) {
        this.i = true;
    }

    @Override // xsna.jxg
    public void k(T t, ExtendedCommunityProfile extendedCommunityProfile) {
        this.h.e();
        if (this.g) {
            return;
        }
        this.g = true;
        o(t);
    }

    public final void l(io.reactivex.rxjava3.core.x xVar, izs izsVar, izs izsVar2) {
        io.reactivex.rxjava3.disposables.c subscribe = xVar.subscribe(new gf0(izsVar, 15), new y00(izsVar2, 17));
        this.b.b(subscribe);
        this.h.b(subscribe);
    }

    public io.reactivex.rxjava3.core.q<Action> m() {
        return null;
    }

    public void o(T t) {
        io.reactivex.rxjava3.disposables.c subscribe;
        io.reactivex.rxjava3.core.q<Action> m = m();
        if (m == null || (subscribe = m.v0(500L, TimeUnit.MILLISECONDS).subscribe(new w00(new he3(15, this, t), 16))) == null) {
            return;
        }
        this.b.b(subscribe);
    }

    @Override // xsna.jxg
    public final void onPause() {
        this.i = false;
    }

    public final void q(T t) {
        this.c.invoke(new d.f(t));
    }

    @Override // xsna.jxg
    public void onDestroy() {
    }

    @Override // xsna.jxg
    public void c(CommunityProfileState communityProfileState) {
    }

    @Override // xsna.jxg
    public void a(T t, ExtendedCommunityProfile extendedCommunityProfile) {
    }

    @Override // xsna.jxg
    public void e(T t, ExtendedCommunityProfile extendedCommunityProfile) {
    }

    @Override // xsna.jxg
    public void h(T t, ExtendedCommunityProfile extendedCommunityProfile) {
    }

    @Override // xsna.jxg
    public void j(T t, ExtendedCommunityProfile extendedCommunityProfile) {
    }
}
