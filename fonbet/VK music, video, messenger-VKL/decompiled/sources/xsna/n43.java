package xsna;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.transition.AutoTransition;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.view.View;
import com.vk.dto.common.id.UserId;
import com.vk.dto.polls.Poll;
import com.vk.dto.stories.model.StoryViewAction;
import com.vk.dto.user.UserProfile;
import com.vk.music.player.PlayerTrack;
import com.vk.newsfeed.common.views.PrimaryAttachmentPollV2View;
import com.vk.polls.entities.exceptions.UserDidntVoteException;
import com.vk.profile.user.impl.ui.UserProfileAction;
import com.vk.profile.user.impl.ui.b;
import com.vk.profile.user.impl.ui.f;
import com.vkontakte.android.api.ExtendedUserProfile;
import com.vkontakte.android.attachments.PollAttachment;
import com.vkontakte.android.data.b;
import java.util.List;
import java.util.Set;
import xsna.a7f0;
import xsna.cf70;
import xsna.if70;
import xsna.l7x0;
import xsna.vzi0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class n43 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ n43(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        String str = null;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                izs izsVar = (izs) obj4;
                w43 w43Var = (w43) obj3;
                StoryViewAction storyViewAction = (StoryViewAction) obj2;
                b.d dVar = (b.d) obj;
                if (izsVar != null) {
                    izsVar.invoke(dVar);
                }
                if (w43Var.p1()) {
                    zwl0.a(dVar, storyViewAction);
                }
                break;
            case 1:
                mkl mklVar = (mkl) obj4;
                b7d0 b7d0Var = ((nvl) obj3).d;
                Set set = (Set) obj2;
                onb0 onb0Var = (onb0) obj;
                boolean z = onb0Var.b;
                Poll poll = onb0Var.a;
                if (z) {
                    if (((Poll) mklVar.b).Ib()) {
                        b7d0Var.h7(new l7x0.c(set));
                    } else {
                        b7d0Var.h7(l7x0.b.a);
                    }
                    lad0 e7 = b7d0Var.e7();
                    if (e7 != null) {
                        PollAttachment pollAttachment = e7.J;
                        Poll poll2 = pollAttachment.f;
                        if (poll2.b == poll.b && epx.f(poll2.c, poll.c)) {
                            pollAttachment.f = poll;
                        }
                        PrimaryAttachmentPollV2View primaryAttachmentPollV2View = b7d0Var.I;
                        AnimatorSet animatorSet = primaryAttachmentPollV2View.o;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                        }
                        Transition excludeChildren = new AutoTransition().setInterpolator((TimeInterpolator) qq2.f).setDuration(200L).excludeTarget((View) primaryAttachmentPollV2View.i, true).excludeChildren((View) primaryAttachmentPollV2View.h, true);
                        int i2 = primaryAttachmentPollV2View.H;
                        for (int i3 = 0; i3 < i2; i3++) {
                            smb0 a = primaryAttachmentPollV2View.a(i3);
                            if (a != null) {
                                excludeChildren.excludeTarget((View) a.f, true).excludeTarget((View) a.e, true);
                            }
                        }
                        TransitionManager.beginDelayedTransition(primaryAttachmentPollV2View, excludeChildren);
                        b7d0Var.f7(true);
                    }
                } else {
                    b7d0Var.h7(l7x0.b.a);
                    b7d0Var.i7(new UserDidntVoteException("User didn't vote"));
                    b7d0Var.b7(poll);
                }
                break;
            case 2:
                String str2 = (String) obj4;
                String str3 = (String) obj3;
                String str4 = (String) obj2;
                tgi0 tgi0Var = (tgi0) obj;
                bpn0 bpn0Var = cqm0.a;
                if (str2 == null) {
                    str2 = "";
                }
                qgi0.h(tgi0Var, str2);
                if (str3 == null) {
                    str3 = "";
                }
                qgi0.q(tgi0Var, str3);
                if (str4 == null) {
                    str4 = "";
                }
                qgi0.r(tgi0Var, str4);
                break;
            case 3:
                qe70 qe70Var = (qe70) obj4;
                jf70 jf70Var = (jf70) obj2;
                qe70Var.o.b(vzi0.c.a);
                qe70Var.T(new cf70.e((UserId) obj3));
                String str5 = jf70Var.d;
                if (str5 == null) {
                    break;
                } else {
                    List<UserProfile> list = jf70Var.i;
                    if (list != null) {
                        qe70Var.n.b(new if70.b(str5, list.size() - 1));
                        break;
                    } else {
                        break;
                    }
                }
            case 4:
                y1b0 y1b0Var = (y1b0) obj4;
                String str6 = (String) obj3;
                com.vk.music.player.playback.c cVar = (com.vk.music.player.playback.c) obj2;
                if (str6 == null) {
                    PlayerTrack b = cVar.q.b();
                    if (b != null) {
                        str = b.f;
                    }
                } else {
                    str = str6;
                }
                y1b0Var.invoke(str);
                break;
            default:
                fpq0 fpq0Var = (fpq0) obj4;
                UserProfileAction.x xVar = (UserProfileAction.x) obj2;
                ExtendedUserProfile extendedUserProfile = (ExtendedUserProfile) obj;
                fpq0Var.T(new b.y(extendedUserProfile));
                htq0 htq0Var = fpq0Var.f;
                ynq0.c(fpq0Var.E, extendedUserProfile, ((com.vk.profile.user.impl.ui.g) obj3).i, xVar.b ? htq0Var.l : null, 8);
                if (htq0Var.n && xVar.b) {
                    fpq0Var.B(f.c.g.a);
                }
                if (htq0Var.k) {
                    a7f0.a.e(fpq0Var, fpq0Var.l.d().U(new awi0(new k7l0(fpq0Var, 14), 2)), null, null, null, null, 15);
                }
                break;
        }
        return s3q0.a;
    }
}
