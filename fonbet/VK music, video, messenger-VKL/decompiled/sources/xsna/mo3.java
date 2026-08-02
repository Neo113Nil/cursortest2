package xsna;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.widget.CheckBox;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.ui.holders.ClickType;
import com.vk.catalog2.common.ui.holders.search.SearchStaticMapPreviewVh;
import com.vk.catalog2.common.ui.mvp.holder.ComposeHeaderShowAllVh;
import com.vk.channels.impl.list.ChannelsListFragment;
import com.vk.core.tips.Tooltip;
import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.attachments.ArticleAttachment;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.im.ui.components.msg_view.header.MsgViewHeaderComponent;
import com.vk.photo.editor.features.filter.d;
import com.vk.video.profile.presentation.a;
import com.vk.voip.ui.scheduled.callslist.VoipScheduledCallsFragment;
import com.vkontakte.android.R;
import com.vungle.ads.NativeAd;
import xsna.cs00;
import xsna.e3m;
import xsna.fzw0;
import xsna.kdk0;
import xsna.s7h0;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class mo3 implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mo3(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        op5 op5Var;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                oo3 oo3Var = (oo3) obj;
                ArticleAttachment articleAttachment = (ArticleAttachment) oo3Var.C;
                if (articleAttachment != null) {
                    NewsEntry q6 = oo3Var.q6();
                    Post post = q6 instanceof Post ? (Post) q6 : null;
                    gd60.X0(hd60.a(), oo3Var.itemView.getContext(), articleAttachment, new pqq(null, oo3Var.u, post != null ? post.L.b : null, null, 9), new no3(oo3Var, 0), new v9(oo3Var, 3), 32);
                    break;
                }
                break;
            case 1:
                us6 us6Var = (us6) obj;
                xn50.a.c(us6Var, new fzw0.c(us6Var.o1.g));
                break;
            case 2:
                gm7 gm7Var = (gm7) obj;
                if (gm7Var.m != null) {
                    Rect e = f4m.e(gm7Var.l);
                    Context context = gm7Var.itemView.getContext();
                    Context context2 = gm7Var.itemView.getContext();
                    e3m.a aVar = e3m.a;
                    Tooltip.l(new Tooltip(context, "1 Б = 1 ₽\n\nБонусами можно оплатить до 20% от стоимости покупки\n\nНа эту покупку начислим ️5%🔥", "", null, null, null, null, context2.getColor(R.color.vk_white), gm7Var.itemView.getContext().getColor(R.color.vk_black), null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 48, 0, false, null, 0, false, null, null, null, null, null, null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, false, 0, null, null, null, null, -2440, 15), gm7Var.itemView.getContext(), new RectF(e), false, false, false, false, 236);
                    break;
                }
                break;
            case 3:
                int i2 = ChannelsListFragment.f0;
                ((ChannelsListFragment) obj).finish();
                break;
            case 4:
                ((izs) obj).invoke(view);
                break;
            case 5:
                ComposeHeaderShowAllVh composeHeaderShowAllVh = (ComposeHeaderShowAllVh) obj;
                qcy<Object>[] qcyVarArr = ComposeHeaderShowAllVh.x;
                if (!jjc.d().a()) {
                    qcy<Object>[] qcyVarArr2 = ComposeHeaderShowAllVh.x;
                    composeHeaderShowAllVh.b(ClickType.SHOW_ITEM);
                    s3q0 s3q0Var = s3q0.a;
                    break;
                }
                break;
            case 6:
                oer oerVar = (oer) obj;
                d.b bVar = oerVar.m;
                if (bVar != null) {
                    bVar.invoke(oerVar);
                    break;
                }
                break;
            case 7:
                ((wzx) obj).c.invoke(czx.b);
                break;
            case 8:
                ps00 ps00Var = (ps00) obj;
                os00 os00Var = ps00Var.u;
                if (os00Var != null) {
                    ps00Var.l.a(new cs00.h(os00Var.b));
                    break;
                }
                break;
            case 9:
                ((p930) ((VkCell.f) obj)).a.invoke();
                break;
            case 10:
                com.vk.movika.sdk.base.asset.b bVar2 = ((m140) obj).g;
                if (bVar2 != null && (op5Var = ((MsgViewHeaderComponent) bVar2.b).n) != null) {
                    op5Var.h();
                    break;
                }
                break;
            case 11:
                ((qo50) obj).un(lfb0.class, null);
                break;
            case 12:
                NativeAd.a((NativeAd) obj, view);
                break;
            case 13:
                ((dw20) obj).hide();
                break;
            case 14:
                CheckBox checkBox = ((wif0) obj).p;
                if (!checkBox.isChecked()) {
                    checkBox.setChecked(true);
                    break;
                }
                break;
            case 15:
                ((SearchStaticMapPreviewVh) obj).c();
                break;
            case 16:
                odk0 odk0Var = (odk0) obj;
                kdk0.b bVar3 = kdk0.b.b;
                odk0Var.getClass();
                xn50.a.c(odk0Var, bVar3);
                odk0Var.kn().onBackPressed();
                break;
            case 17:
                ((com.vk.story.viewer.impl.presentation.stories.b) obj).finish();
                break;
            case 18:
                ((cys0) obj).b0.invoke(a.h0.b);
                break;
            case 19:
                ((pmu0) obj).b.invoke();
                break;
            case 20:
                ((VoipScheduledCallsFragment) obj).T.a(s7h0.a.a);
                break;
            default:
                n5z0 n5z0Var = (n5z0) obj;
                b520 b520Var = n5z0Var.i;
                if (b520Var != null) {
                    n5z0Var.k.a(b520Var);
                    break;
                }
                break;
        }
    }
}
