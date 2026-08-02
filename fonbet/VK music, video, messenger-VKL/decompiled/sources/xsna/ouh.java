package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.group.GroupContentTabSetting;
import com.vk.dto.group.GroupContentTabType;
import com.vk.profile.core.content.ContentTab;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import java.util.Iterator;
import java.util.List;
import xsna.it80;

/* compiled from: CommunityProfileUnpublishedPostsDelegate.kt */
/* loaded from: classes5.dex */
public final class ouh {
    public final r50 a;
    public final io.reactivex.rxjava3.disposables.b b;

    public ouh(r50 r50Var, io.reactivex.rxjava3.disposables.b bVar) {
        this.a = r50Var;
        this.b = bVar;
    }

    public static io.reactivex.rxjava3.internal.operators.observable.f0 a(UserId userId, String str) {
        return rsg0.W(yfb.x(lax0.j(new max0(), userId, str, 65522)), 7);
    }

    public static void b(ouh ouhVar, ExtendedCommunityProfile extendedCommunityProfile, ContentTab contentTab, boolean z, int i) {
        if ((i & 2) != 0) {
            contentTab = null;
        }
        boolean z2 = false;
        if ((i & 4) != 0) {
            z = false;
        }
        if (extendedCommunityProfile == null || z) {
            return;
        }
        if (extendedCommunityProfile.g0 || extendedCommunityProfile.h0) {
            if (contentTab == null) {
                List<GroupContentTabSetting> list = extendedCommunityProfile.U2;
                int i2 = -1;
                if (list != null) {
                    Iterator<GroupContentTabSetting> it = list.iterator();
                    int i3 = 0;
                    while (it.hasNext()) {
                        GroupContentTabType groupContentTabType = it.next().b;
                        if (groupContentTabType == GroupContentTabType.WALL || groupContentTabType == GroupContentTabType.DONUT_WALL) {
                            i2 = i3;
                            break;
                        }
                        i3++;
                    }
                }
                z2 = !e43.l(0, 1, 2).contains(Integer.valueOf(i2));
            } else if (!(contentTab instanceof ContentTab.Wall) && !(contentTab instanceof ContentTab.DonutWall)) {
                z2 = true;
            }
        }
        if (z2) {
            UserId i4 = bwd0.i(extendedCommunityProfile);
            boolean b = w2h.b(extendedCommunityProfile);
            ouhVar.b.b(io.reactivex.rxjava3.core.x.A(a(i4, "suggests"), b ? a(i4, "postponed").l(new rf1(new nuh(1, it80.b, it80.a.class, "of", "of(Ljava/lang/Object;)Lcom/vk/core/util/Optional;", 0), 17)) : tr.b(it80.b), b ? a(i4, "drafts").l(new p7(new muh(1, it80.b, it80.a.class, "of", "of(Ljava/lang/Object;)Lcom/vk/core/util/Optional;", 0), 22)) : tr.b(it80.b), new tt0(new ec1(1), 15)).subscribe(new f60(new eqd(ouhVar, 7), 17), new yha(new nt(25), 1)));
        }
    }
}
