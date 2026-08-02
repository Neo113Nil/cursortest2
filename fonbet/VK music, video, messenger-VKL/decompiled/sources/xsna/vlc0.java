package xsna;

import android.content.Context;
import com.vk.api.generated.stats.dto.StatsTrackVisitorTypeDto;
import com.vk.attachpicker.impl.fragment.StoryFragment;
import com.vk.bridges.di.LinksBridgeComponent;
import com.vk.clips.design.view.timeline.VideoEditTimelineView;
import com.vk.core.view.components.text.VkText;
import com.vk.dto.actionlinks.ActionLinks;
import com.vk.dto.common.VideoFile;
import com.vk.dto.photo.Photo;
import com.vk.dto.stories.model.StoryQuestionEntry;
import com.vk.dto.stories.model.StoryViewAction;
import com.vk.newsfeed.api.friendslists.FriendsListParams;
import com.vk.newsfeed.impl.posting.profilefriendslists.ProfileFriendsFragment;
import com.vk.newsfeed.impl.posting.settings.mvi.PostingSettingsFragmentMvi;
import com.vk.newsfeed.impl.requests.WallWithCounters;
import com.vk.posting.presentation.video.a;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.core.errors.VkAppsErrors;
import com.vk.superapp.ui.SuperAppFragment;
import com.vk.video.design.view.VideoControlsBarView;
import com.vk.video.ui.upload.impl.settings.presentation.feature.entity.SettingsState;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import ru.ok.media.StreamingStatisticsHandler;
import xsna.avp0;
import xsna.bex0;
import xsna.c5i;
import xsna.ifu0;
import xsna.isc0;
import xsna.ljk0;
import xsna.q0j0;
import xsna.qn60;
import xsna.qr60;
import xsna.sbl0;
import xsna.xn50;
import xsna.xxd0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class vlc0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vlc0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        s3q0 timer$lambda$0;
        int i = this.b;
        int i2 = 0;
        ArrayList arrayList = null;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                int i3 = PostingSettingsFragmentMvi.Y;
                ((jsj0) obj2).setItems((List) obj);
                break;
            case 1:
                isc0.a aVar = (isc0.a) obj2;
                aVar.a();
                isc0.this.e(new ksc0(qr60.a.b.a));
                break;
            case 2:
                exd0 exd0Var = (exd0) obj2;
                ProfileFriendsFragment profileFriendsFragment = exd0Var.c;
                thz thzVar = (thz) obj;
                if (thzVar.a == 173) {
                    profileFriendsFragment.so(29);
                } else {
                    cvk.w(y8g0.e(R.string.lists_friends_create_success), false);
                    profileFriendsFragment.ko(thzVar.a, ((FriendsListParams.FriendListCreation) exd0Var.d).b);
                }
                break;
            case 3:
                ((cse0) obj2).l.set(((Long) obj).longValue());
                break;
            case 4:
                omh0 omh0Var = (omh0) obj;
                ((lmh0) obj2).d.getClass();
                if (omh0Var.g != null) {
                    break;
                } else {
                    boolean z = omh0Var.e;
                    if (z) {
                        break;
                    } else if (!z) {
                        break;
                    }
                }
                break;
            case 5:
                ((tdu) obj).n(-((Number) ((c1h) obj2).p.getValue()).floatValue());
                break;
            case 6:
                ((sph0) obj2).getClass();
                break;
            case 7:
                orh0 orh0Var = (orh0) obj2;
                wwz wwzVar = (wwz) obj;
                String a = wwzVar != null ? wwzVar.a(orh0Var.b.getContext()) : null;
                if (a == null) {
                    a = "";
                }
                orh0Var.b.setDescription(a);
                break;
            case 8:
                bei0 bei0Var = (bei0) obj2;
                if (bei0Var.a.i().a(((Long) obj).longValue())) {
                    bei0Var.i();
                    bei0Var.l(null);
                }
                break;
            case 9:
                q0j0.a aVar2 = (q0j0.a) obj2;
                SettingsState settingsState = (SettingsState) obj;
                List<VideoFile> list = settingsState.b;
                if (list != null) {
                    arrayList = new ArrayList();
                    for (Object obj3 : list) {
                        if (!epx.f(((VideoFile) obj3).a1(), ((q0j0.a.d) aVar2).b)) {
                            arrayList.add(obj3);
                        }
                    }
                }
                break;
            case 10:
                break;
            case 11:
                uhj0 uhj0Var = (uhj0) obj2;
                ActionLinks actionLinks = (ActionLinks) obj;
                uhj0Var.l = actionLinks;
                uhj0Var.z(actionLinks);
                break;
            case 12:
                pjk0 pjk0Var = (pjk0) obj2;
                Throwable th = (Throwable) obj;
                pjk0Var.i = ljk0.a.a;
                pjk0Var.c = null;
                if (pjk0Var.g) {
                    pjk0Var.e = false;
                }
                j03.l(th);
                com.vk.metrics.eventtracking.b.a.a(th);
                break;
            case 13:
                ((l7l0) obj2).getClass();
                break;
            case 14:
                sbl0 sbl0Var = (sbl0) obj2;
                if (((Boolean) obj).booleanValue()) {
                    sbl0.a aVar3 = sbl0Var.f;
                    StoryQuestionEntry storyQuestionEntry = sbl0Var.d;
                    aVar3.b(storyQuestionEntry.b, storyQuestionEntry.c);
                    sbl0Var.c(y8g0.e(sbl0Var.a() ? R.string.story_question_ban_anonym_info : R.string.story_question_ban_info));
                    sbl0Var.d(sbl0Var.a() ? StoryViewAction.QUESTION_BAN_ANONYMOUS_AUTHOR : StoryViewAction.QUESTION_BAN_AUTHOR);
                } else {
                    sbl0Var.b();
                }
                break;
            case 15:
                StoryFragment storyFragment = (StoryFragment) obj2;
                int i4 = StoryFragment.X;
                storyFragment.U = false;
                d1m0 f = rwi.d().p().f(storyFragment);
                if (f != null) {
                    f.rh();
                }
                break;
            case 16:
                timer$lambda$0 = StreamingStatisticsHandler.timer$lambda$0((StreamingStatisticsHandler) obj2, (qox) obj);
                break;
            case 17:
                s5n0 s5n0Var = (s5n0) obj2;
                s5n0Var.h.clear();
                s5n0Var.g.dismiss();
                break;
            case 18:
                SuperAppFragment superAppFragment = (SuperAppFragment) obj2;
                int i5 = SuperAppFragment.o0;
                ((LinksBridgeComponent) m7m.d(superAppFragment).a(fpf0.a(LinksBridgeComponent.class))).p().f().a(superAppFragment.requireContext(), (String) obj, false);
                break;
            case 19:
                Photo photo = (Photo) obj2;
                photo.x = (List) obj;
                photo.m = true;
                break;
            case 20:
                VkText vkText = new VkText((Context) obj, null, 6, 0);
                vkText.setTextAppearance(((avp0.a) obj2).a);
                vkText.setTextColor(-65536);
                vkText.setText("Съешь ещё этих мягких французских булок, да выпей чаю");
                vkText.setIncludeFontPadding(false);
                break;
            case 21:
                ioq0 ioq0Var = (ioq0) obj2;
                xxd0.b bVar = (xxd0.b) obj;
                List<xub> list2 = bVar.o;
                ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
                for (Object obj4 : list2) {
                    if (obj4 instanceof awb) {
                        obj4 = new yub(ioq0Var.b);
                    }
                    arrayList2.add(obj4);
                }
                break;
            case 22:
                lsq0 lsq0Var = (lsq0) obj2;
                if (((c5i) obj) instanceof c5i.a) {
                    lsq0Var.g0();
                }
                break;
            case 23:
                WallWithCounters wallWithCounters = (WallWithCounters) obj2;
                qn60.c cVar = (qn60.c) obj;
                break;
            case 24:
                awt0.f((am) obj, (Context) obj2, R.string.vk_accessibility_scroll_to_top);
                break;
            case 25:
                VideoControlsBarView.a aVar4 = ((VideoControlsBarView) obj2).b;
                if (aVar4 != null) {
                    aVar4.b();
                }
                break;
            case 26:
                rwo0 rwo0Var = ((VideoEditTimelineView) obj2).F;
                if (rwo0Var != null) {
                    rwo0Var.u();
                }
                break;
            case 27:
                xn50.a.c(((com.vk.posting.presentation.video.f) obj2).c, a.b.AbstractC1533a.C1535b.b);
                break;
            case 28:
                w5u0 w5u0Var = (w5u0) obj2;
                stg0 stg0Var = w5u0Var.c;
                if (((Number) stg0Var.invoke()).longValue() > 900000) {
                    io.reactivex.rxjava3.disposables.c cVar2 = w5u0Var.d;
                    if (cVar2 != null) {
                        cVar2.dispose();
                    }
                    w5u0Var.d = null;
                } else {
                    w5u0Var.e = System.currentTimeMillis();
                    vdx0 vdx0Var = e370.e;
                    hg1.o((vdx0Var != null ? vdx0Var : null).r().b(w5u0Var.a, w5u0Var.b, Integer.valueOf((int) TimeUnit.MILLISECONDS.toSeconds(((Number) stg0Var.invoke()).longValue())), StatsTrackVisitorTypeDto.ACTIVITY), 1, new ha40(27)).subscribe(new iq60(new u5u0(i2), 3), new nan0(new dh8(xgx0.a, 6), 5));
                }
                break;
            default:
                ifu0 ifu0Var = (ifu0) obj2;
                ifu0.a aVar5 = ifu0Var.f1;
                if (aVar5 != null) {
                    bex0.a.a(aVar5.e.a.a, JsApiMethodType.ADD_MINI_APP_SNIPPET_TO_CHAT, VkAppsErrors.Client.USER_DENIED, null, null, null, 60);
                }
                ifu0Var.dismiss();
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ vlc0(avp0.a aVar, avp0 avp0Var) {
        this.b = 20;
        this.c = aVar;
    }
}
