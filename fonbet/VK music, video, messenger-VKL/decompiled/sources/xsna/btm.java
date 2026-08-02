package xsna;

import android.app.Activity;
import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.media3.datasource.c;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.ui.mvp.holder.group.GroupCardWithBottomBtnVh;
import com.vk.feed.core.models.dzen.DzenInfo;
import com.vk.feed.core.models.dzen.DzenNews;
import com.vk.feed.core.models.info.InfoPopup;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.games.di.GamesCatalogComponent;
import com.vk.games.presentation.detail.GamesCatalogDetailFragment;
import com.vk.im.chat.clips.decoration.impl.di.ImChatClipsDecorationComponentImpl;
import com.vk.im.ui.fragments.dialogtheme.ImSettingsDialogThemeFragment;
import com.vk.im.ui.views.msg.bubble.FloatingBubbleFluidLayout;
import com.vk.im.ui.views.msg.bubble.MsgBubbleView;
import com.vk.libvideo.design.view.movika.InteractiveDurationView;
import com.vk.music.player.MusicPlaybackQueueComponentImpl;
import com.vk.newsfeed.impl.newsfeed.presentation.base.fragment.NewsfeedFragment;
import com.vk.profile.community.members.impl.ui.MviMembersListFragment;
import com.vk.superapp.ads.js.bridge.impl.di.JsAdsDelegateComponentImpl;
import com.vk.typography.FontFamily;
import com.vk.typography.TextSizeUnit;
import com.vkontakte.android.R;
import xsna.lr50;
import xsna.n1y;
import xsna.vx70;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class btm implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ btm(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        NewsEntry q6;
        DzenInfo dzenInfo;
        int i = this.b;
        InfoPopup infoPopup = null;
        infoPopup = null;
        Object obj = this.c;
        switch (i) {
            case 0:
                return "onMsgUpdate: " + ((o980) obj);
            case 1:
                j2n j2nVar = (j2n) obj;
                return new xso0(j2nVar.d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, dhr0.t.c(j2nVar.b), 0, 26);
            case 2:
                rto rtoVar = (rto) obj;
                if (!jjc.b() && (q6 = rtoVar.q6()) != null) {
                    if ((q6 instanceof DzenNews) && (dzenInfo = ((DzenNews) q6).i.e) != null) {
                        infoPopup = dzenInfo.b;
                    }
                    if (infoPopup != null) {
                        tvw tvwVar = rtoVar.F;
                        Context context = rtoVar.itemView.getContext();
                        tvwVar.getClass();
                        tvw.a(context, infoPopup);
                    }
                }
                return s3q0.a;
            case 3:
                return ((mqp) obj).n;
            case 4:
                a6q a6qVar = (a6q) obj;
                return new c.a(a6qVar.a, new etk(a6qVar.e, a6qVar.f));
            case 5:
                ((com.vk.newsfeed.common.recycler.holders.a) obj).r7();
                return s3q0.a;
            case 6:
                int i2 = FloatingBubbleFluidLayout.j;
                MsgBubbleView msgBubbleView = (MsgBubbleView) ((View) obj);
                return Integer.valueOf(msgBubbleView.getLeft() + (msgBubbleView.getBubbleStyle().f ? msgBubbleView.getStylePadding().left : msgBubbleView.getBubbleDrawablePadding().left));
            case 7:
                int i3 = GamesCatalogDetailFragment.d0;
                return ((GamesCatalogComponent) m7m.d((GamesCatalogDetailFragment) obj).a(fpf0.a(GamesCatalogComponent.class))).V9();
            case 8:
                return ((com.vk.geo.impl.presentation.b) obj).r;
            case 9:
                return ((y4u) obj).e.Md();
            case 10:
                ((f8u) obj).q6();
                return s3q0.a;
            case 11:
                com.vk.catalog2.common.ui.holders.group.a.c(((GroupCardWithBottomBtnVh) obj).l, false);
                return s3q0.a;
            case 12:
                qcy<Object>[] qcyVarArr = ImChatClipsDecorationComponentImpl.g;
                return new ImChatClipsDecorationComponentImpl.b((ImChatClipsDecorationComponentImpl) obj);
            case 13:
                int i4 = ImSettingsDialogThemeFragment.c0;
                ((com.vk.im.ui.components.theme_chooser.b) obj).a1();
                return s3q0.a;
            case 14:
                wp80.d((AppCompatActivity) obj);
                return s3q0.a;
            case 15:
                return fnw.f((fnw) obj);
            case 16:
                qcy<Object>[] qcyVarArr2 = JsAdsDelegateComponentImpl.e;
                nwy nwyVar = ((JsAdsDelegateComponentImpl) obj).a;
                qcy<Object> qcyVar = JsAdsDelegateComponentImpl.e[0];
                return new g1y((n1y.a) nwyVar.c());
            case 17:
                return new c2n0(((z4y) obj).b);
            case 18:
                puy puyVar = (puy) obj;
                return Float.valueOf(puyVar.q.d() - puyVar.q.a());
            case 19:
                whz whzVar = (whz) obj;
                return whzVar.x ? (InteractiveDurationView) whzVar.getView().findViewById(R.id.interactive_duration_up) : (InteractiveDurationView) whzVar.getView().findViewById(R.id.interactive_duration_down);
            case 20:
                y300 y300Var = (y300) obj;
                mkx mkxVar = y300Var.b;
                okhttp3.u r = mkxVar.r(new fy70(y300Var.c), y300Var.d);
                return new vx70.a(mkxVar.o(r), r.g, null);
            case 21:
                hk30 hk30Var = (hk30) obj;
                TextPaint textPaint = new TextPaint();
                textPaint.setColor(-16777216);
                com.vk.typography.b.c(textPaint, hk30Var.a, FontFamily.REGULAR, Float.valueOf(hk30Var.b.b(R.dimen.vkim_msg_part_text_body)), TextSizeUnit.PX);
                return textPaint;
            case 22:
                ym30 ym30Var = ((vm30) obj).t0;
                if (ym30Var != null) {
                    ym30Var.w0();
                }
                return s3q0.a;
            case 23:
                return new e140(((kz30) obj).i, null);
            case 24:
                ((Activity) obj).onBackPressed();
                return s3q0.a;
            case 25:
                return new bf40(((te40) obj).a);
            case 26:
                qcy<Object>[] qcyVarArr3 = MusicPlaybackQueueComponentImpl.f;
                nwy nwyVar2 = ((MusicPlaybackQueueComponentImpl) obj).c;
                qcy<Object> qcyVar2 = MusicPlaybackQueueComponentImpl.f[2];
                return new q05((yxa0) nwyVar2.c());
            case 27:
                MviMembersListFragment.a aVar = MviMembersListFragment.T;
                Fragment parentFragment = ((MviMembersListFragment) obj).getParentFragment();
                bfg0 bfg0Var = parentFragment instanceof bfg0 ? (bfg0) parentFragment : null;
                if (bfg0Var != null) {
                    bfg0Var.Sd();
                }
                return s3q0.a;
            case 28:
                cjx cjxVar = ((lr50) obj).J;
                return new lr50.e(cjxVar != null ? cjxVar : null);
            default:
                RecyclerView recyclerView = ((NewsfeedFragment) obj).k0;
                RecyclerView.o layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
                LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                if (linearLayoutManager != null) {
                    linearLayoutManager.K(0, 0);
                }
                return s3q0.a;
        }
    }
}
