package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.newsfeed.api.posting.PostingCreationEntryPoint;
import com.vk.stat.scheme.MobileOfficialAppsStoriesStat$TypeStoryPublishItem;
import java.util.Iterator;
import xsna.gij;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class nxl0 implements bd70 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ nxl0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.bd70
    public final void x0(int i, int i2, Object obj) {
        Object obj2;
        PostingCreationEntryPoint postingCreationEntryPoint;
        switch (this.b) {
            case 0:
                oxl0 oxl0Var = (oxl0) this.c;
                oxl0Var.g.clear();
                com.vk.lists.c cVar = oxl0Var.h;
                if (cVar != null) {
                    cVar.p(false);
                    break;
                }
                break;
            default:
                io.reactivex.rxjava3.core.r rVar = (io.reactivex.rxjava3.core.r) this.c;
                zjm0 zjm0Var = (zjm0) obj;
                if (zjm0Var != null) {
                    UserId e = zjm0Var.j.Kb() ? fkq0.e(zjm0Var.j.e) : zjm0Var.j.b;
                    String str = zjm0Var.j.h;
                    Iterator<E> it = MobileOfficialAppsStoriesStat$TypeStoryPublishItem.CreationEntryPoint.h().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj2 = it.next();
                            if (brm0.w(((MobileOfficialAppsStoriesStat$TypeStoryPublishItem.CreationEntryPoint) obj2).name(), str, true)) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    MobileOfficialAppsStoriesStat$TypeStoryPublishItem.CreationEntryPoint creationEntryPoint = (MobileOfficialAppsStoriesStat$TypeStoryPublishItem.CreationEntryPoint) obj2;
                    if (creationEntryPoint != null) {
                        switch (obk.$EnumSwitchMapping$0[creationEntryPoint.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                                postingCreationEntryPoint = PostingCreationEntryPoint.FeedPlus;
                                break;
                            case 4:
                            case 5:
                            case 6:
                                postingCreationEntryPoint = PostingCreationEntryPoint.ProfilePlusButton;
                                break;
                            case 7:
                            case 8:
                            case 9:
                                postingCreationEntryPoint = PostingCreationEntryPoint.GroupWallButton;
                                break;
                            default:
                                postingCreationEntryPoint = PostingCreationEntryPoint.Other;
                                break;
                        }
                    } else {
                        postingCreationEntryPoint = PostingCreationEntryPoint.Other;
                    }
                    rVar.onNext(new gij.c(e, postingCreationEntryPoint));
                    break;
                }
                break;
        }
    }
}
