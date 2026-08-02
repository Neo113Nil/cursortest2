package xsna;

import android.content.Context;
import android.view.ViewGroup;
import com.vk.friends.impl.followers.presentation.fragments.AbsFollowersListFragment;
import com.vk.lists.CustomSwipeRefreshLayout;
import com.vkontakte.android.attachments.VideoAttachment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class ua implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ua(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                int i2 = AbsFollowersListFragment.Y;
                ((CustomSwipeRefreshLayout) obj5).setVisibility(8);
                ((ViewGroup) obj4).setVisibility(0);
                ((ViewGroup) obj3).setVisibility(8);
                ((ViewGroup) obj2).setVisibility(8);
                break;
            default:
                nsq nsqVar = (nsq) obj5;
                Context context = (Context) obj4;
                VideoAttachment videoAttachment = (VideoAttachment) obj3;
                pqq pqqVar = (pqq) obj2;
                lsq lsqVar = new lsq(2, nsqVar, nsq.class, "navigateToWatchLater", "navigateToWatchLater(Landroid/content/Context;Lcom/vk/fave/entities/FaveMetaInfo;)V", 0);
                nsqVar.getClass();
                if (videoAttachment.k.X()) {
                    lsqVar.invoke(context, pqqVar);
                } else {
                    g7s0.X(fxc0.B(), context, videoAttachment.k, pqqVar.b, pqqVar.c, null, null, 48);
                }
                break;
        }
        return s3q0.a;
    }
}
