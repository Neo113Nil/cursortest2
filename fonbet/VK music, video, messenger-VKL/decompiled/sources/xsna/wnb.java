package xsna;

import android.view.View;
import com.vk.clips.favorites.impl.ui.folders.content.ClipsFavoriteFolderContentListFragment;
import com.vk.clips.favorites.impl.ui.folders.content.ClipsFavoriteFolderContentListViewState;
import com.vk.clips.favorites.impl.ui.folders.content.a;
import com.vk.dto.common.DzenArticleBlockItem;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.RequestUserProfile;
import com.vk.stat.scheme.MobileOfficialAppsStoriesStat$TypeStoryPublishItem;
import com.vkontakte.android.R;
import xsna.dob;
import xsna.qis;
import xsna.uwl0;
import xsna.wmb;
import xsna.xn50;
import xsna.yj20;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class wnb implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ wnb(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        int i;
        int i2 = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i2) {
            case 0:
                xn50.a.c((ynb) obj2, new wmb.i(((dob.f) obj).a));
                break;
            case 1:
                ClipsFavoriteFolderContentListFragment clipsFavoriteFolderContentListFragment = (ClipsFavoriteFolderContentListFragment) obj2;
                int i3 = ClipsFavoriteFolderContentListFragment.W;
                a.e eVar = ((ClipsFavoriteFolderContentListViewState.g.b.a) obj).a;
                clipsFavoriteFolderContentListFragment.getClass();
                xn50.a.c(clipsFavoriteFolderContentListFragment, eVar);
                break;
            case 2:
                DzenArticleBlockItem dzenArticleBlockItem = (DzenArticleBlockItem) obj2;
                kro kroVar = (kro) obj;
                if (dzenArticleBlockItem != null && (str = dzenArticleBlockItem.b) != null) {
                    kroVar.o.invoke(str, Integer.valueOf(kroVar.getLayoutPosition()));
                    break;
                }
                break;
            case 3:
                final qis qisVar = (qis) obj2;
                final RequestUserProfile requestUserProfile = (RequestUserProfile) obj;
                i = qis.a.REASON_SPAM.value;
                UserId userId = requestUserProfile.c;
                io.reactivex.rxjava3.internal.operators.observable.m1 y0 = rsg0.y0(new ble(userId, userId.b, i), null, null, 3);
                hg1.m(y0, qisVar.itemView.getContext(), 0L, false, 62);
                ver0.c(qisVar.itemView.getContext(), y0.subscribe(new io.reactivex.rxjava3.functions.f() { // from class: xsna.ois
                    @Override // io.reactivex.rxjava3.functions.f
                    public final void accept(Object obj3) {
                        if (((Boolean) obj3).booleanValue()) {
                            qis qisVar2 = qis.this;
                            f4m.j(qisVar2.z);
                            f4m.j(qisVar2.A);
                            qisVar2.y.setText(R.string.report_sent);
                            requestUserProfile.q0 = true;
                            cvk.u(R.string.report_sent, false);
                        }
                    }
                }, new pis()));
                break;
            case 4:
                uwl0.a.b.c cVar = (uwl0.a.b.c) obj2;
                nzl0 nzl0Var = (nzl0) obj;
                if (!(cVar instanceof uwl0.a.b.c.e)) {
                    if (!(cVar instanceof uwl0.a.b.c.C3846b)) {
                        if (!(cVar instanceof uwl0.a.b.c.g)) {
                            if (!(cVar instanceof uwl0.a.b.c.d)) {
                                if (!(cVar instanceof uwl0.a.b.c.f)) {
                                    nzl0Var.d();
                                    break;
                                } else {
                                    nzl0Var.f(MobileOfficialAppsStoriesStat$TypeStoryPublishItem.CreationEntryPoint.STORY_REPOST, false);
                                    break;
                                }
                            }
                        } else {
                            nzl0Var.t(((uwl0.a.b.c.g) cVar).h);
                            break;
                        }
                    } else {
                        nzl0Var.t(((uwl0.a.b.c.C3846b) cVar).h);
                        break;
                    }
                } else {
                    nzl0Var.f(MobileOfficialAppsStoriesStat$TypeStoryPublishItem.CreationEntryPoint.STORY_REPLY, true);
                    break;
                }
                break;
            default:
                rj20 rj20Var = (rj20) obj2;
                yj20.c cVar2 = (yj20.c) obj;
                if (rj20Var != null) {
                    rj20Var.E(snr0.a(cVar2));
                    break;
                }
                break;
        }
    }
}
