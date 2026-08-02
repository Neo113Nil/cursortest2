package xsna;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewpager.widget.ViewPager;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.catalog2.feature.music.dto.ui.UIBlockExtendedPodcastItem;
import com.vk.catalog2.feature.music.ui.holder.MusicHidingToolbarVh;
import com.vk.common.links.LaunchContext;
import com.vk.dto.ads.PixelStats;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachWithTranscription;
import com.vk.dto.podcast.ExtendedPodcast;
import com.vk.dto.polls.Poll;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.ecomm.moderation.impl.restrictions.dialogs.blocked.e;
import com.vk.ecomm.products_multipicker.api.model.MultipickerProduct;
import com.vk.im.engine.models.messages.Msg;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.music.view.vkmix.view.MusicMixAnimationView;
import com.vk.newsfeed.impl.fragments.NewsfeedFeedbackPollFragment;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.newsfeed.posting.impl.presentation.model.PostingGroupInfo;
import com.vk.photos.root.photoflow.presentation.a;
import com.vk.photos.root.presentation.a;
import com.vk.superapp.api.dto.menu.SuperAppAnimationConfig;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.gfp0;
import xsna.h7u0;
import xsna.ikv0;
import xsna.lh6;
import xsna.nox0;
import xsna.osb0;
import xsna.qd90;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class w620 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ w620(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v15, types: [xsna.pk30] */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.String, xsna.ikv0$d$a] */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.vk.dto.attaches.AttachWithTranscription] */
    /* JADX WARN: Type inference failed for: r5v14 */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        int i2 = 6;
        PostingGroupInfo postingGroupInfo = null;
        r6 = false;
        r6 = false;
        r6 = false;
        boolean z = false;
        int i3 = 1;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                SuperAppAnimationConfig superAppAnimationConfig = (SuperAppAnimationConfig) obj2;
                SuperAppAnimationConfig superAppAnimationConfig2 = (SuperAppAnimationConfig) obj;
                return superAppAnimationConfig != null ? superAppAnimationConfig2.d(superAppAnimationConfig) : superAppAnimationConfig2;
            case 1:
                com.vk.ecomm.moderation.impl.restrictions.dialogs.blocked.b bVar = (com.vk.ecomm.moderation.impl.restrictions.dialogs.blocked.b) obj2;
                com.vk.ecomm.moderation.impl.restrictions.dialogs.blocked.e eVar = (com.vk.ecomm.moderation.impl.restrictions.dialogs.blocked.e) obj;
                qcy<Object>[] qcyVarArr = com.vk.ecomm.moderation.impl.restrictions.dialogs.blocked.b.n1;
                if (eVar instanceof e.a) {
                    bVar.dismiss();
                } else if (eVar instanceof e.c) {
                    maz.c(((qdz) bVar.l1.getValue()).e(), bVar.requireContext(), ((e.c) eVar).a, LaunchContext.A, null, null, 24);
                    bVar.dismiss();
                } else {
                    if (!(eVar instanceof e.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i4 = h7u0.p;
                    h7u0.a c = h7u0.b.c(bVar.requireContext());
                    c.g0(R.string.market_delete_item_confirm_title);
                    c.U(R.string.market_delete_item_confirm);
                    c.c0(R.string.delete, new nv(bVar, i2));
                    c.W(R.string.cancel, new kzy(i3));
                    c.m();
                }
                return s3q0.a;
            case 2:
                is30 is30Var = (is30) obj2;
                ?? r1 = is30Var.k;
                js30 js30Var = is30Var.l;
                Msg msg = js30Var != null ? js30Var.m : null;
                Attach attach = js30Var != null ? js30Var.o : null;
                r5 = attach instanceof AttachWithTranscription ? (AttachWithTranscription) attach : 0;
                if (r1 != 0 && msg != null && r5 != 0) {
                    r1.q(msg, r5, false);
                }
                return s3q0.a;
            case 3:
                gfp0.b.c cVar = (gfp0.b.c) obj2;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                return Integer.valueOf((booleanValue && cVar.h) ? R.string.music_kids_talkback_player_remove_track_from_favorite : booleanValue ? R.string.music_talkback_player_remove_track_from_favorite : cVar.h ? R.string.music_kids_talkback_player_add_track_to_favorite : R.string.music_talkback_player_add_track_to_favorite);
            case 4:
                Boolean bool = (Boolean) obj;
                MusicMixAnimationView musicMixAnimationView = ((MusicHidingToolbarVh) obj2).H;
                if (musicMixAnimationView != null) {
                    boolean booleanValue2 = bool.booleanValue();
                    yn40 yn40Var = musicMixAnimationView.b;
                    if (yn40Var != null) {
                        ValueAnimator valueAnimator = yn40Var.q;
                        utk0 utk0Var = yn40Var.s;
                        if (((lh6.a) utk0Var.getValue()).h.b == 1) {
                            valueAnimator.cancel();
                            valueAnimator.setFloatValues(((lh6.a) utk0Var.getValue()).c, ((lh6.a) utk0Var.getValue()).c + (!booleanValue2 ? 1.0f : -1.0f));
                            valueAnimator.addUpdateListener(new gs6(yn40Var, i3));
                            valueAnimator.setDuration(1000L);
                            valueAnimator.start();
                        }
                    }
                }
                return s3q0.a;
            case 5:
                com.vk.superapp.widget_settings.p004new.a aVar = (com.vk.superapp.widget_settings.p004new.a) obj2;
                nox0 nox0Var = (nox0) obj;
                int i5 = com.vk.superapp.widget_settings.p004new.a.n1;
                if (nox0Var instanceof nox0.c) {
                    aVar.bo();
                } else if (nox0Var instanceof nox0.b) {
                    ikv0.a aVar2 = new ikv0.a(aVar.kn());
                    aVar2.u = new ikv0.d(aVar.getString(R.string.super_app_loading_error_message), (String) r5, (ikv0.d.a) r5, i2);
                    aVar2.o = Integer.valueOf(iah0.a(16.0f));
                    aVar2.e = 3000L;
                    FrameLayout frameLayout = aVar.l1;
                    aVar2.o(frameLayout != null ? frameLayout : null);
                } else {
                    if (!(nox0Var instanceof nox0.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar.bo();
                }
                return s3q0.a;
            case 6:
                int i6 = ge60.l1;
                ((ge60) obj2).getFeature().C((ee60) obj);
                return s3q0.a;
            case 7:
                ViewPager viewPager = ((NewsfeedFeedbackPollFragment) obj2).V;
                if (viewPager != null) {
                    viewPager.setCurrentItem(1, true);
                }
                return s3q0.a;
            case 8:
                bl70 bl70Var = (bl70) obj2;
                int i7 = bl70.f1;
                bl70Var.tn();
                int i8 = h7u0.p;
                h7u0.a c2 = h7u0.b.c(bl70Var.requireContext());
                c2.g0(R.string.voip_session_room_hangup_confirmation_title);
                c2.U(R.string.voip_session_room_hangup_confirmation_description);
                c2.c0(R.string.voip_session_room_hangup_confirmation_exit_action, new fta(i3));
                c2.W(R.string.cancel, new vcl(i3));
                c2.m();
                return s3q0.a;
            case 9:
                yp80 yp80Var = (yp80) obj2;
                Throwable th = (Throwable) obj;
                if (yp80Var != null) {
                    yp80Var.onError(th);
                }
                return s3q0.a;
            case 10:
                awt0.r((am) obj, ((qd90.b.a) obj2).itemView.getContext());
                return s3q0.a;
            case 11:
                int i9 = u1a0.A1;
                ((u1a0) obj2).bo();
                return s3q0.a;
            case 12:
                ((com.vk.photos.root.photoflow.presentation.b) obj2).C(new a.v((h7o0) obj));
                return s3q0.a;
            case 13:
                ((com.vk.photos.root.presentation.h) obj2).d.invoke(a.g.b);
                return s3q0.a;
            case 14:
                return new io.reactivex.rxjava3.internal.operators.observable.s0(new kqa0(r6 ? 1 : 0, (mqa0) obj2, (PixelStats) obj));
            case 15:
                return new UIBlockExtendedPodcastItem(((bi20) obj2).b(), (ExtendedPodcast) obj);
            case 16:
                lsb0 lsb0Var = (lsb0) obj2;
                onb0 onb0Var = (onb0) obj;
                boolean z2 = onb0Var.b;
                Poll poll = onb0Var.a;
                if (z2) {
                    lsb0Var.T(new osb0.f(poll));
                } else {
                    lsb0Var.T(new osb0.a(Integer.valueOf(R.string.poll_user_didnt_vote), poll));
                }
                return s3q0.a;
            case 17:
                l6c0 l6c0Var = (l6c0) obj2;
                UsersUserFullDto usersUserFullDto = (UsersUserFullDto) j5g.a0((List) obj);
                if (usersUserFullDto == null) {
                    return null;
                }
                l6c0Var.l.getClass();
                return j2r0.a(usersUserFullDto);
            case 18:
                return new avu((ViewGroup) obj, ((xfc0) obj2).h);
            case 19:
                ((ikc0) obj2).M = ((Long) obj).longValue() > 0;
                return s3q0.a;
            case 20:
                PostingState.Editing editing = (PostingState.Editing) obj;
                ((qkc0) obj2).d.getClass();
                Iterator it = editing.u.iterator();
                while (true) {
                    if (it.hasNext()) {
                        ?? next = it.next();
                        if (epx.f(((PostingGroupInfo) next).b, editing.c.b.b)) {
                            postingGroupInfo = next;
                        }
                    }
                }
                PostingGroupInfo postingGroupInfo2 = postingGroupInfo;
                if (postingGroupInfo2 != null && ((postingGroupInfo2.d || postingGroupInfo2.c) && postingGroupInfo2.e && postingGroupInfo2.f >= 2)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 21:
                return new hod0((ViewGroup) obj, ((aod0) obj2).i);
            case 22:
                ((rbe0) obj2).b.invoke(new PostingAction.Navigation.Close(false, false, false, 4, null));
                return s3q0.a;
            case 23:
                dm0 dm0Var = (dm0) obj2;
                List list = (List) obj;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(i740.a((MultipickerProduct) it2.next()));
                }
                dm0Var.g(arrayList);
                return s3q0.a;
            case 24:
                ((io.reactivex.rxjava3.core.b) obj2).onError((Throwable) obj);
                return s3q0.a;
            case 25:
                if2 if2Var = (if2) obj2;
                return new h9x((an10.b(((Number) if2Var.d()).floatValue() * UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) & 4294967295L) | (an10.b(((Number) if2Var.d()).floatValue() * 5.0f) << 32));
            case 26:
                ((wh50) obj2).setValue((bwf) obj);
                return s3q0.a;
            case 27:
                vjk0 vjk0Var = ((bkk0) obj2).G;
                if (vjk0Var != null) {
                    vjk0Var.f();
                }
                return s3q0.a;
            case 28:
                com.vk.stickers.keyboard.d dVar = ((w7l0) obj2).c;
                if (dVar != null) {
                    dVar.d();
                }
                return s3q0.a;
            default:
                StoryEntry storyEntry = (StoryEntry) obj2;
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.d, new Object[]{"preload prepare ".concat(storyEntry.Kb())});
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ w620(if2 if2Var, e5j0 e5j0Var) {
        this.b = 25;
        this.c = if2Var;
    }
}
