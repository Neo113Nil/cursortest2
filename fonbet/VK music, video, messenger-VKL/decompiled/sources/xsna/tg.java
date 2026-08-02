package xsna;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.mbridge.msdk.config.dynamic.baseview.ComponentButton;
import com.vk.auth.DefaultAuthActivity;
import com.vk.auth.main.AuthActivity;
import com.vk.auth.restore.RestoreReason;
import com.vk.catalog2.common.ui.mvp.holder.header.VkSearchQueryVh;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.components.context.menu.e;
import com.vk.core.view.search.ModernSearchView;
import com.vk.stickers.keyboard.StickersView;
import com.vk.stories.design.view.polls.AbstractPollView;
import com.vk.voip.ui.call_list.scheduled.feature.model.ScheduledAudioMuteOption;
import com.vkontakte.android.R;
import one.video.controls20.SimpleControlsView;
import one.video.player.OneVideoPlayer;
import xsna.trr;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class tg implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ tg(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r1v33, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.izs] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.b;
        int i2 = 1;
        int i3 = 0;
        Object obj = this.c;
        switch (i) {
            case 0:
                AbstractPollView abstractPollView = (AbstractPollView) obj;
                AppCompatImageView appCompatImageView = abstractPollView.r;
                abstractPollView.m();
                int l = krv0.l(R.attr.vk_ui_icon_accent);
                appCompatImageView.getContext();
                e.b bVar = new e.b(appCompatImageView, null, null, l, 6);
                bVar.w = R.layout.ds_internal_context_menu_item;
                bVar.e = abstractPollView.getContext();
                if (abstractPollView.getPoll().Ab()) {
                    VkContextMenu.c.c(bVar, R.string.poll_cancel_vote, null, false, null, new yg(abstractPollView, i3), 30);
                }
                if (abstractPollView.getPoll().t0() && abstractPollView.p) {
                    VkContextMenu.c.c(bVar, R.string.poll_edit, null, false, null, new zg(abstractPollView, i3), 30);
                }
                if (abstractPollView.getPoll().q) {
                    vtb0.a().getClass();
                    VkContextMenu.c.c(bVar, R.string.poll_sharing, null, false, null, new ah(abstractPollView, i3), 30);
                }
                vtb0.a().getClass();
                VkContextMenu.c.c(bVar, R.string.poll_copy_link, null, false, null, new m4(abstractPollView, i2), 30);
                if (abstractPollView.getPoll().p) {
                    vtb0.a().getClass();
                    VkContextMenu.c.c(bVar, R.string.poll_report_content, null, false, null, new com.vk.movika.sdk.base.model.b(abstractPollView, i2), 30);
                }
                bVar.j();
                break;
            case 1:
                isb isbVar = (isb) obj;
                isbVar.b(new gy0(isbVar, 17));
                break;
            case 2:
                ((ComponentButton) obj).a(view);
                break;
            case 3:
                ww wwVar = ((trr.a) ((trr) obj)).c;
                if (wwVar != null) {
                    wwVar.invoke();
                    break;
                }
                break;
            case 4:
                int i4 = gm90.v;
                oju0 oju0Var = ((gm90) obj).tn().c;
                RestoreReason.ForgetPassword forgetPassword = new RestoreReason.ForgetPassword(null, null, null);
                DefaultAuthActivity defaultAuthActivity = DefaultAuthActivity.U;
                Context context = oju0Var.a;
                r55.b();
                Intent intent = new Intent(context, (Class<?>) AuthActivity.class);
                intent.putExtra("restoreReason", forgetPassword);
                DefaultAuthActivity.b.a(intent);
                context.startActivity(intent);
                break;
            case 5:
                s2j0 s2j0Var = (s2j0) obj;
                s2j0Var.l.performHapticFeedback(0);
                s2j0Var.m.invoke(Integer.valueOf(s2j0Var.getLayoutPosition()));
                break;
            case 6:
                OneVideoPlayer oneVideoPlayer = ((SimpleControlsView) obj).x;
                if (oneVideoPlayer != null) {
                    OneVideoPlayer.State state = oneVideoPlayer.getState();
                    OneVideoPlayer.State state2 = OneVideoPlayer.State.PLAYING;
                    if (state != state2) {
                        OneVideoPlayer.State state3 = OneVideoPlayer.State.PAUSED;
                    }
                    if (state != state2) {
                        oneVideoPlayer.resume();
                        break;
                    } else {
                        oneVideoPlayer.pause();
                        break;
                    }
                }
                break;
            case 7:
                StickersView stickersView = (StickersView) obj;
                if (f4m.h(stickersView.t)) {
                    stickersView.u.smoothScrollToPosition(0);
                    break;
                }
                break;
            case 8:
                ((ffo0) obj).b.invoke(keo0.a);
                break;
            case 9:
                ((tts0) obj).d.invoke();
                break;
            case 10:
                VkSearchQueryVh vkSearchQueryVh = (VkSearchQueryVh) obj;
                vkSearchQueryVh.d(vkSearchQueryVh.l, true);
                vkSearchQueryVh.N2();
                vkSearchQueryVh.fi();
                vkSearchQueryVh.r9();
                vkSearchQueryVh.d(vkSearchQueryVh.q, false);
                vkSearchQueryVh.a();
                ModernSearchView modernSearchView = vkSearchQueryVh.b.k;
                if (modernSearchView != null) {
                    modernSearchView.f();
                    modernSearchView.c(0L);
                    break;
                }
                break;
            case 11:
                uxw0 uxw0Var = (uxw0) obj;
                uxw0Var.c.invoke(ScheduledAudioMuteOption.Enabled);
                dw20 dw20Var = uxw0Var.i;
                if (dw20Var != null) {
                    dw20Var.tn();
                    break;
                }
                break;
            default:
                ((dhy0) obj).i.c(view, 1);
                break;
        }
    }
}
