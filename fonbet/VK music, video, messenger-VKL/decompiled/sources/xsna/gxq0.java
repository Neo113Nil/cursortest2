package xsna;

import android.app.Activity;
import com.vk.profile.core.tabs.state.CommunityProfileContent;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import com.vk.profile.user.impl.ui.UserProfileAction;
import com.vk.profile.user.impl.ui.b;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: UserProfileWallTabActionFeatureDelegate.kt */
/* loaded from: classes5.dex */
public final class gxq0 implements huq {
    public izs<? super com.vk.profile.user.impl.ui.b, s3q0> b;

    @Override // xsna.ruu
    public final izs<com.vk.profile.user.impl.ui.b, s3q0> L() {
        izs izsVar = this.b;
        if (izsVar != null) {
            return izsVar;
        }
        return null;
    }

    public final void a(UserProfileAction.e0 e0Var, com.vk.profile.user.impl.ui.g gVar) {
        List<CommunityProfileContentItem> list;
        Object obj;
        List<CommunityProfileContentItem> list2;
        Object obj2;
        b9x0 b9x0Var;
        xl50 dVar;
        Object obj3;
        hg3 hg3Var;
        List<CommunityProfileContentItem> list3;
        Object obj4;
        CommunityProfileContent communityProfileContent = gVar.g;
        if (!(e0Var instanceof UserProfileAction.e0.a)) {
            if (!(e0Var instanceof UserProfileAction.e0.b)) {
                throw new NoWhenBranchMatchedException();
            }
            if (!(((UserProfileAction.e0.b) e0Var).b instanceof hg3) || communityProfileContent == null || (list = communityProfileContent.b) == null) {
                return;
            }
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (obj instanceof b9x0) {
                        break;
                    }
                }
            }
            if (!(obj instanceof b9x0)) {
                obj = null;
            }
            b9x0 b9x0Var2 = (b9x0) obj;
            if (b9x0Var2 == null) {
                return;
            }
            izs<? super com.vk.profile.user.impl.ui.b, s3q0> izsVar = this.b;
            (izsVar != null ? izsVar : null).invoke(new b.c(b9x0.i(b9x0Var2, CommunityProfileContentItem.State.RELOAD, 27)));
            return;
        }
        UserProfileAction.e0.a aVar = (UserProfileAction.e0.a) e0Var;
        ExtendedUserProfile extendedUserProfile = gVar.j;
        if (extendedUserProfile == null || !bwd0.d(extendedUserProfile)) {
            return;
        }
        if (aVar.c) {
            if (communityProfileContent == null || (list3 = communityProfileContent.b) == null) {
                hg3Var = null;
            } else {
                Iterator<T> it2 = list3.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj4 = null;
                        break;
                    } else {
                        obj4 = it2.next();
                        if (obj4 instanceof hg3) {
                            break;
                        }
                    }
                }
                if (!(obj4 instanceof hg3)) {
                    obj4 = null;
                }
                hg3Var = (hg3) obj4;
            }
            dVar = hg3Var == null ? new b.C1708b(new hg3(new CommunityProfileContentItem.b(R.string.community_content_wall_empty, null, null, null, null, 30), new CommunityProfileContentItem.c(R.string.community_content_wall_error), CommunityProfileContentItem.State.RELOAD, false, null)) : new b.c(hg3.i(hg3Var, CommunityProfileContentItem.State.RELOAD, 27));
        } else {
            if (communityProfileContent == null || (list2 = communityProfileContent.b) == null) {
                return;
            }
            List<CommunityProfileContentItem> list4 = list2;
            Iterator<T> it3 = list4.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    obj2 = null;
                    break;
                } else {
                    obj2 = it3.next();
                    if (obj2 instanceof hg3) {
                        break;
                    }
                }
            }
            if (!(obj2 instanceof hg3)) {
                obj2 = null;
            }
            hg3 hg3Var2 = (hg3) obj2;
            if (hg3Var2 == null) {
                return;
            }
            if (aVar.d) {
                Iterator<T> it4 = list4.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        obj3 = null;
                        break;
                    } else {
                        obj3 = it4.next();
                        if (obj3 instanceof b9x0) {
                            break;
                        }
                    }
                }
                if (!(obj3 instanceof b9x0)) {
                    obj3 = null;
                }
                b9x0Var = (b9x0) obj3;
            } else {
                b9x0Var = null;
            }
            dVar = new b.d(hg3Var2, b9x0Var);
        }
        izs<? super com.vk.profile.user.impl.ui.b, s3q0> izsVar2 = this.b;
        (izsVar2 != null ? izsVar2 : null).invoke(dVar);
    }

    @Override // xsna.ruu
    public final void r(r9c0 r9c0Var) {
        this.b = r9c0Var;
    }

    @Override // xsna.huq
    public final void j() {
    }

    @Override // xsna.huq
    public final void onDestroy() {
    }

    @Override // xsna.huq
    public final void onPause() {
    }

    @Override // xsna.huq
    public final void onResume() {
    }

    @Override // xsna.huq
    public final void onStart() {
    }

    @Override // xsna.huq
    public final void onStop() {
    }

    @Override // xsna.huq
    public final void H(fpq0 fpq0Var) {
    }

    @Override // xsna.huq
    public final void i(io.reactivex.rxjava3.disposables.b bVar) {
    }

    @Override // xsna.huq
    public final void k(u5p0 u5p0Var) {
    }

    @Override // xsna.huq
    public final void m(Activity activity) {
    }

    @Override // xsna.huq
    public final void J(com.vk.profile.user.impl.ui.g gVar, UserProfileAction.a aVar) {
    }
}
