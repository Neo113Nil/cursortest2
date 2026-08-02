package xsna;

import android.R;
import android.content.res.TypedArray;
import android.text.Layout;
import android.view.View;
import androidx.appcompat.widget.SwitchCompat;
import com.vk.balance.BalanceFragment;
import com.vk.catalog2.common.ui.holders.group.GroupFilterVh;
import com.vk.catalog2.common.ui.holders.group.GroupVh;
import com.vk.content.design.view.camera.MasksWrap;
import com.vk.dto.posting.PostingVisibilityMode;
import com.vk.libvideo.embedded_players.ui.fragments.VideoEmbedFragment;
import com.vk.newsfeed.impl.explore.ExploreFragment;
import com.vk.stories.analytics.StoryPublishEvent;
import xsna.fov;
import xsna.ptw0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class wz5 implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wz5(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.vk.dto.common.id.UserId] */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.appcompat.widget.SwitchCompat] */
    /* JADX WARN: Type inference failed for: r3v2 */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.b;
        ?? r2 = 0;
        dbs0 dbs0Var = null;
        Object obj = this.c;
        switch (i) {
            case 0:
                SwitchCompat switchCompat = ((BalanceFragment) obj).a0;
                (switchCompat != null ? switchCompat : 0).toggle();
                break;
            case 1:
                MasksWrap masksWrap = (MasksWrap) obj;
                yg10 yg10Var = masksWrap.d;
                if (yg10Var != null) {
                    yg10Var.a(masksWrap.getSelectedMask());
                }
                am9 am9Var = masksWrap.h;
                if (am9Var != null) {
                    am9Var.c(StoryPublishEvent.CANCEL_MASK_LOADING, null);
                }
                masksWrap.setSelectedMask(null);
                masksWrap.q(false);
                s3q0 s3q0Var = s3q0.a;
                break;
            case 2:
                ((qg9) obj).m.D();
                break;
            case 3:
                int i2 = ExploreFragment.h0;
                ((ExploreFragment) obj).s();
                break;
            case 4:
                ((GroupFilterVh) obj).onClick(view);
                break;
            case 5:
                com.vk.catalog2.common.ui.holders.group.a aVar = ((GroupVh) obj).q;
                if (aVar != null) {
                    aVar.b();
                    break;
                }
                break;
            case 6:
                quv.k((quv) obj);
                break;
            case 7:
                nw20 nw20Var = (nw20) obj;
                if (nw20Var.p && nw20Var.isShowing()) {
                    if (!nw20Var.s) {
                        TypedArray obtainStyledAttributes = nw20Var.getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
                        nw20Var.r = obtainStyledAttributes.getBoolean(0, true);
                        obtainStyledAttributes.recycle();
                        nw20Var.s = true;
                    }
                    if (nw20Var.r) {
                        nw20Var.cancel();
                        break;
                    }
                }
                izs<? super View, s3q0> izsVar = nw20Var.J;
                if (izsVar != null) {
                    izsVar.invoke(view);
                    break;
                }
                break;
            case 8:
                cqb0.n((cqb0) obj);
                break;
            case 9:
                ((cqc0) obj).X0(PostingVisibilityMode.FRIENDS);
                break;
            case 10:
                fov.a aVar2 = (fov.a) obj;
                if (aVar2 != null) {
                    aVar2.close();
                    break;
                }
                break;
            case 11:
                xpk<Layout.Alignment, Integer> xpkVar = ((cmo0) obj).t;
                xpk<Layout.Alignment, Integer> xpkVar2 = xpkVar != null ? xpkVar : null;
                int i3 = xpkVar2.d;
                xpkVar2.a(i3 != xpkVar2.a.length - 1 ? i3 + 1 : 0);
                break;
            case 12:
                VideoEmbedFragment videoEmbedFragment = (VideoEmbedFragment) obj;
                int i4 = VideoEmbedFragment.q0;
                int id = view.getId();
                if (id == com.vkontakte.android.R.id.add) {
                    dbs0Var = yzr0.a;
                } else if (id == com.vkontakte.android.R.id.shares) {
                    dbs0Var = kgt0.a;
                } else if (id == com.vkontakte.android.R.id.comments) {
                    dbs0Var = r0t0.a;
                } else if (id == com.vkontakte.android.R.id.add_video) {
                    dbs0Var = yzr0.a;
                } else if (id == com.vkontakte.android.R.id.more) {
                    dbs0Var = new qws0(15, r3, r2 == true ? 1 : 0);
                } else if (id == com.vkontakte.android.R.id.cancel) {
                    dbs0Var = d8s0.a;
                } else if (id == com.vkontakte.android.R.id.info) {
                    dbs0Var = u0t0.a;
                } else if (id == com.vkontakte.android.R.id.profile || id == com.vkontakte.android.R.id.user_photo || id == com.vkontakte.android.R.id.title || id == com.vkontakte.android.R.id.subtitle) {
                    dbs0Var = t6t0.a;
                } else if (id == com.vkontakte.android.R.id.likes) {
                    dbs0Var = dss0.a;
                } else if (id == com.vkontakte.android.R.id.watch_video_later) {
                    dbs0Var = kst0.a;
                }
                if (dbs0Var != null) {
                    videoEmbedFragment.bk(dbs0Var);
                    break;
                }
                break;
            case 13:
                Object obj2 = ((x2v0) obj).o;
                ((u2v0) (obj2 != null ? obj2 : null)).Z();
                break;
            case 14:
                ((cuw0) obj).c.invoke(ptw0.g.b);
                break;
            default:
                pla.e().b().c = null;
                ((wzb0) obj).invoke();
                break;
        }
    }
}
