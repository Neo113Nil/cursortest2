package xsna;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.unity3d.services.UnityAdsConstants;
import com.vk.cameraui.impl.a;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.view.components.picture.VkPicture;
import com.vk.core.view.components.text.VkText;
import com.vk.dto.actionlinks.ActionLink;
import com.vk.dto.actionlinks.ActionLinks;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.UserProfile;
import com.vk.libvideo.live.impl.views.stat.StatAdapter;
import com.vk.poll.fragments.PollViewerFragment;
import com.vkontakte.android.R;
import com.vkontakte.android.actionlinks.SourceType;
import com.vkontakte.android.actionlinks.views.fragments.ItemsDialogWrapper;
import xsna.gr6;
import xsna.nzb;

/* compiled from: CommonActionLinksBridge.kt */
/* loaded from: classes7.dex */
public final class rgg implements t20 {
    public final bpn0 a;

    public rgg(bpn0 bpn0Var) {
        this.a = bpn0Var;
    }

    @Override // xsna.t20
    public final void a(Context context, gr6.b bVar, UserId userId, SourceType sourceType, dz20 dz20Var) {
        qbi0.a(context, bVar, userId, sourceType, dz20Var, null, 32);
    }

    @Override // xsna.t20
    public final vmz b(ViewGroup viewGroup) {
        return new vmz(viewGroup);
    }

    @Override // xsna.t20
    public final void c(Context context, UserId userId, String str, boolean z, boolean z2, ActionLinks actionLinks, hb hbVar, a.j jVar) {
        uhj0 uhj0Var = new uhj0();
        uhj0Var.e = userId;
        uhj0Var.l = actionLinks;
        uhj0Var.m = false;
        uhj0Var.b = hbVar;
        uhj0Var.c = null;
        uhj0Var.n = str;
        uhj0Var.j = jVar;
        uhj0Var.f = z;
        uhj0Var.g = false;
        uhj0Var.h = z2;
        xhj0 xhj0Var = new xhj0(context);
        xhj0Var.c = uhj0Var;
        xhj0Var.e = R.string.collection_add_selection_live;
        xhj0Var.f = R.string.collection_add_hint_live;
        uhj0Var.k = xhj0Var;
        xhj0Var.c();
    }

    @Override // xsna.t20
    public final izs d(Context context, ViewGroup viewGroup, boolean z, ActionLink actionLink, int i, nzb.d dVar, nzb.e eVar, int i2, UserId userId) {
        if (z) {
            imb imbVar = new imb(context);
            viewGroup.addView(imbVar, new ViewGroup.LayoutParams(-1, -2));
            vh9 vh9Var = new vh9(imbVar, actionLink, i2, userId, dVar);
            vh9Var.invoke(Integer.valueOf(i));
            return vh9Var;
        }
        nmb nmbVar = new nmb(context);
        viewGroup.addView(nmbVar, new ViewGroup.LayoutParams(-1, -2));
        qgg qggVar = new qgg(nmbVar, actionLink, i2, userId, dVar, eVar);
        qggVar.invoke(0);
        return qggVar;
    }

    @Override // xsna.t20
    public final void e(RecyclerView.e0 e0Var, UserProfile userProfile, boolean z, StatAdapter.c cVar) {
        vmz vmzVar = (vmz) e0Var;
        vmzVar.i6(userProfile);
        vmzVar.B = cVar;
        vmzVar.x = z;
        vmzVar.y = userProfile;
        ekq0.s6(vmzVar.p, userProfile, Integer.valueOf(dhr0.t.c(R.attr.vk_ui_background_modal)));
        ImageView imageView = vmzVar.w;
        imageView.animate().cancel();
        imageView.setAlpha(1.0f);
        if (!userProfile.j && !qr.f(userProfile.c)) {
            imageView.setImageDrawable(new baf0(m33.a(R.drawable.vk_icon_user_add_outline_24, vmzVar.itemView.getContext()), vmzVar.itemView.getContext().getColor(R.color.vk_blue_300)));
            imageView.setVisibility(0);
            return;
        }
        imageView.setImageDrawable(new baf0(m33.a(R.drawable.vk_icon_user_added_outline_24, vmzVar.itemView.getContext()), vmzVar.itemView.getContext().getColor(R.color.vk_steel_gray_300)));
        if (!vmzVar.x) {
            imageView.setVisibility(8);
        } else {
            vmzVar.x = false;
            imageView.animate().setStartDelay(vmzVar.z).setDuration(vmzVar.A).alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).start();
        }
    }

    @Override // xsna.t20
    public final void f(Context context, ActionLink actionLink, UserId userId, String str, ActionLinks actionLinks, lb lbVar, com.vk.movika.sdk.base.observable.k kVar) {
        uhj0 uhj0Var = new uhj0();
        uhj0Var.e = userId;
        uhj0Var.b = lbVar;
        uhj0Var.c = kVar;
        uhj0Var.n = str;
        uhj0Var.p = actionLink;
        uhj0Var.l = actionLinks;
        uhj0Var.d = true;
        uhj0Var.j = null;
        uhj0Var.f = false;
        uhj0Var.g = true;
        uhj0Var.h = false;
        xhj0 xhj0Var = new xhj0(context);
        xhj0Var.c = uhj0Var;
        xhj0Var.e = R.string.collection_add_selection_live;
        xhj0Var.f = R.string.collection_add_select_hint_live;
        xhj0Var.d = R.string.collection_add_select_live;
        uhj0Var.k = xhj0Var;
        xhj0Var.c();
    }

    @Override // xsna.t20
    public final io.reactivex.rxjava3.internal.operators.observable.m1 g(UserId userId) {
        long j = fkq0.b(userId) ? -userId.b : 0L;
        z20 z20Var = new z20("actionLinks.getByTag", 0);
        z20Var.K("tag", "live");
        if (j != 0) {
            z20Var.D(j, "group_id");
        }
        return rsg0.y0(z20Var, null, null, 3);
    }

    @Override // xsna.t20
    public final void h(int i, Context context, UserId userId) {
        Activity h = e3m.h(context);
        AppCompatActivity appCompatActivity = h instanceof AppCompatActivity ? (AppCompatActivity) h : null;
        if (appCompatActivity == null) {
            return;
        }
        FragmentImpl f = new PollViewerFragment.a(userId, false, true, "d", i).f();
        ItemsDialogWrapper itemsDialogWrapper = new ItemsDialogWrapper();
        itemsDialogWrapper.N = f;
        itemsDialogWrapper.O = Integer.valueOf(R.string.poll_viewer_title);
        FragmentManager supportFragmentManager = appCompatActivity.getSupportFragmentManager();
        androidx.fragment.app.a b = tk5.b(supportFragmentManager, supportFragmentManager);
        b.f(0, itemsDialogWrapper, "PollViewerFragment", 1);
        b.k(false);
    }

    @Override // xsna.t20
    public final rtx i(Context context) {
        rtx rtxVar = new rtx(context, null, 0);
        LayoutInflater.from(context).inflate(R.layout.collection_item_action_link_stat, (ViewGroup) rtxVar, true);
        rtxVar.c = (VkPicture) rtxVar.findViewById(R.id.collection_item_action_link_photo);
        rtxVar.e = (VkText) rtxVar.findViewById(R.id.collection_item_action_link_title);
        rtxVar.f = (VkText) rtxVar.findViewById(R.id.collection_item_action_link_subtitle);
        rtxVar.d = (VkPicture) rtxVar.findViewById(R.id.collection_item_action_link_photo_placeholder);
        rtxVar.g = (VkText) rtxVar.findViewById(R.id.collection_item_action_link_clicks);
        rtxVar.h = (VkText) rtxVar.findViewById(R.id.collection_item_action_link_views);
        rtxVar.setOnClickListener(new e9i(rtxVar, 6));
        ptx ptxVar = new ptx(new bpn0(new b3(this, 22)));
        ptxVar.e = rtxVar;
        rtxVar.setPresenter((ntx) ptxVar);
        return rtxVar;
    }

    @Override // xsna.t20
    public final void j(View view, ActionLink actionLink, int i, int i2, dp0 dp0Var) {
        ntx presenter = ((rtx) view).getPresenter();
        if (presenter != null) {
            ntx.O3(presenter, actionLink, i, i2, dp0Var, null, false, false, false, PsExtractor.VIDEO_STREAM_MASK);
        }
    }
}
