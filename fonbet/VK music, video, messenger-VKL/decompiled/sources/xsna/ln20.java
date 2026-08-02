package xsna;

import android.animation.ValueAnimator;
import android.content.DialogInterface;
import android.text.TextPaint;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.vk.catalog2.feature.music.configuration.MusicSearchCatalogConfiguration;
import com.vk.catalog2.feature.music.ui.holder.MusicMyAudiosCatalogRootVh;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.ecomm.market.api.di.MarketComponent;
import com.vk.music.player.api.di.PlayerUIComponent;
import com.vk.newsfeed.api.di.NewsFeedBridgeComponent;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.impl.newsfeed.presentation.base.fragment.NewsfeedFragment;
import com.vk.newsfeed.impl.posting.PostingFragment;
import com.vk.newsfeed.impl.presentation.from_notifications.presentation.fragment.PostsFromNotificationsFragment;
import com.vk.newsfeed.impl.presentation.newsfeed_reactions.presentation.feature.ReactionsFeedMviState;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.search.fragment.RestoreSearchFragment;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.typography.FontFamily;
import com.vk.typography.TextSizeUnit;
import com.vk.video.playlist.playlistscreen.ui.PlaylistScreenFragment;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Result;
import one.video.controls.view.seekbar.OneVideoSeekBarView;
import xsna.ds60;
import xsna.h7u0;
import xsna.nn20;
import xsna.nyd0.d;
import xsna.s1c0;
import xsna.s7d0;
import xsna.y4f0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class ln20 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ln20(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v53, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v55, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v57, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v59, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v61, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v63, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v65, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v67, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v69, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        int i2 = 2;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((zak0) ((nn20.a) obj).i).setValue(Boolean.valueOf(!((Boolean) ((zak0) r1).getValue()).booleanValue()));
                return s3q0.a;
            case 1:
                hk30 hk30Var = (hk30) obj;
                TextPaint textPaint = new TextPaint();
                textPaint.setColor(-16777216);
                com.vk.typography.b.c(textPaint, hk30Var.a, FontFamily.MEDIUM, Float.valueOf(hk30Var.b.b(R.dimen.vkim_msg_part_snippet_button_text_size)), TextSizeUnit.PX);
                return textPaint;
            case 2:
                return ((MusicMyAudiosCatalogRootVh) obj).r;
            case 3:
                return (PlayerUIComponent) ((k7m) m7m.c((com.vk.music.informer.mvi.f) obj)).a(fpf0.a(PlayerUIComponent.class));
            case 4:
                return ((MarketComponent) ((k7m) m7m.f((MusicSearchCatalogConfiguration) obj)).a(fpf0.a(MarketComponent.class))).Ob();
            case 5:
                return (gfc0) ((q860) obj).d.getValue();
            case 6:
                NewsfeedFragment newsfeedFragment = (NewsfeedFragment) obj;
                qcy<Object>[] qcyVarArr = NewsfeedFragment.J0;
                newsfeedFragment.ho();
                AtomicInteger atomicInteger = newsfeedFragment.d0;
                io.reactivex.rxjava3.disposables.b bVar = newsfeedFragment.Q;
                newsfeedFragment.fo();
                return new it60(atomicInteger, bVar);
            case 7:
                return (NewsFeedBridgeComponent) ((mo60) obj).c().a(fpf0.a(NewsFeedBridgeComponent.class));
            case 8:
                TextPaint textPaint2 = new TextPaint(1);
                b2r b2rVar = ((a880) obj).h;
                cko0.a(textPaint2, b2rVar != null ? b2rVar.b.getContext() : null, R.attr.vk_ui_typography_caption1_medium);
                textPaint2.setColor(dhr0.t.c(R.attr.vk_ui_text_contrast));
                return textPaint2;
            case 9:
                ((sra0) obj).c.yi(rqa0.b);
                return s3q0.a;
            case 10:
                qcy<Object>[] qcyVarArr2 = PlaylistScreenFragment.T;
                return Boolean.valueOf(((PlaylistScreenFragment) obj).go().Ff().J().t0());
            case 11:
                gjb0 gjb0Var = ((cib0) obj).c;
                if (gjb0Var != null) {
                    gjb0Var.m7();
                }
                return s3q0.a;
            case 12:
                return (NewsFeedComponent) ((k7m) m7m.f((xzb0) obj)).a(fpf0.a(NewsFeedComponent.class));
            case 13:
                return new yzb0(new p5y((y8c0) obj, 24));
            case 14:
                PostingFragment postingFragment = (PostingFragment) obj;
                int i3 = PostingFragment.s0;
                h7u0.a aVar = new h7u0.a(postingFragment.requireContext());
                aVar.g0(R.string.confirm_close_post_edit_title);
                aVar.U(R.string.confirm_close_post_edit);
                aVar.c0(R.string.close_post_edit_dialog_positive, (DialogInterface.OnClickListener) postingFragment.r0.getValue());
                aVar.W(R.string.close_post_edit_dialog_negative, null);
                return aVar;
            case 15:
                return Boolean.valueOf(((com.vk.newsfeed.impl.items.posting.item.modals.b) obj).a.a);
            case 16:
                ftc0 ftc0Var = ((isc0) obj).f;
                return new Result(ftc0Var.a.f(new vxf0(), new gjj0(ftc0Var.b)));
            case 17:
                qcy<Object>[] qcyVarArr3 = PostsFromNotificationsFragment.p0;
                s1c0.a aVar2 = new s1c0.a();
                aVar2.b = true;
                sf2 sf2Var = new sf2();
                sf2Var.b = ((PostsFromNotificationsFragment) obj).g0.get();
                aVar2.s = sf2Var.a();
                return aVar2.a();
            case 18:
                ((m8d0) obj).g().invoke(s7d0.f.a);
                return s3q0.a;
            case 19:
                rkd0 rkd0Var = (rkd0) obj;
                return new com.vk.ecomm.market.good.c((fy9) rkd0Var.p.getValue(), (bbj0) rkd0Var.F.getValue(), (a84) rkd0Var.G.getValue(), (d70) rkd0Var.H.getValue(), (dhc) rkd0Var.I.getValue(), (gwh0) rkd0Var.E.getValue(), (isq) rkd0Var.x.getValue(), (vrq) rkd0Var.y.getValue(), (y110) rkd0Var.C.getValue());
            case 20:
                return ((nyd0) obj).new d();
            case 21:
                return (VkTopBar) ((View) ((i0e0) obj).d.getValue()).findViewById(R.id.top_bar);
            case 22:
                b3f0 b3f0Var = (b3f0) obj;
                ValueAnimator ofInt = ValueAnimator.ofInt(0, b3f0Var.a.getDialogHeight$design_release());
                ofInt.setStartDelay(0L);
                ofInt.setDuration(b3f0.m);
                ofInt.setInterpolator(new pkk(0.17f, 0.17f, 0.67f, 1.0f));
                ofInt.addUpdateListener(new rn2(b3f0Var, i2));
                return ofInt;
            case 23:
                ReactionsFeedMviState reactionsFeedMviState = (ReactionsFeedMviState) obj;
                return e43.l(reactionsFeedMviState == null ? y4f0.a.C4075a.b : new y4f0.a.c(reactionsFeedMviState.b), new s4f0(ds60.a.C2747a.b), new s4f0(ds60.a.b.b));
            case 24:
                RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
                frf0.f(SchemeStatSak$EventScreen.QR_CODE_DISPLAY_CODE, SchemeStatSak$EventScreen.QR_CODE_DEVICE_INFO, (ArrayList) obj, false, null, null, 56);
                return s3q0.a;
            case 25:
                int i4 = RestoreSearchFragment.h0;
                FragmentActivity activity = ((RestoreSearchFragment) obj).getActivity();
                if (activity != null) {
                    activity.onBackPressed();
                }
                return s3q0.a;
            case 26:
                ((gzs) obj).invoke();
                return s3q0.a;
            case 27:
                ((e0i0) obj).c = null;
                return s3q0.a;
            case 28:
                b4i0 b4i0Var = (b4i0) obj;
                OneVideoSeekBarView oneVideoSeekBarView = (OneVideoSeekBarView) b4i0Var.findViewById(R.id.player_seekbar_view);
                oneVideoSeekBarView.c.add(new a4i0(b4i0Var));
                return oneVideoSeekBarView;
            default:
                return obj;
        }
    }
}
