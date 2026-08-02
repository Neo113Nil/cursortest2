package xsna;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.ironsource.sdk.controller.v;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.spinner.VkSpinnerContent;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.newsfeed.impl.presentation.newsfeed_custom.presentation.fragment.NewsfeedCustomFragment2;
import com.vk.stories.design.view.HashtagHintsView;
import com.vk.webapp.fragments.CommunityManageFragment;
import com.vkontakte.android.attachments.LinkAttachment;
import java.util.HashMap;
import java.util.List;
import org.chromium.base.ContextUtils;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.sessionroom.internal.participant.SessionRoomParticipantsDataProviderImpl;
import ru.ok.android.webrtc.protocol.RtcCommandOnSuccessListener;
import ru.ok.android.webrtc.protocol.RtcResponse;
import xsna.a9q0;
import xsna.s4m;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class k50 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ k50(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, kotlin.Lazy] */
    @Override // java.lang.Runnable
    public final void run() {
        ViewPropertyAnimator animate;
        ViewPropertyAnimator alpha;
        ViewPropertyAnimator interpolator;
        ViewPropertyAnimator duration;
        int i = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                StoryEntry storyEntry = (StoryEntry) obj;
                q7r q7rVar = ((q50) obj2).a;
                if (q7rVar.b0 != null && q7rVar.i0.R0()) {
                    ((ac80) q7rVar.b0).a(storyEntry);
                    break;
                }
                break;
            case 1:
                CommunityManageFragment communityManageFragment = (CommunityManageFragment) obj2;
                VkSpinnerContent.SpinnerState spinnerState = (VkSpinnerContent.SpinnerState) obj;
                com.vk.core.view.components.spinner.c cVar = communityManageFragment.h0;
                if (cVar != null) {
                    cVar.setCanceledOnTouchOutside(false);
                }
                com.vk.core.view.components.spinner.c cVar2 = communityManageFragment.h0;
                if (cVar2 != null) {
                    cVar2.h.setSpinnerState(spinnerState);
                    break;
                }
                break;
            case 2:
                ContextUtils.lambda$initApplicationContextForTests$0((Context) obj2, (SharedPreferences) obj);
                break;
            case 3:
                s4m s4mVar = (s4m) obj;
                kbj0.e(nr4.b(), ((s4m.a) obj2).itemView.getContext(), new LinkAttachment(s4mVar.l), false, null, false, null, 60);
                String str = s4mVar.l;
                String str2 = s4mVar.m;
                if (str2 != null) {
                    g2h g2hVar = new g2h(s4mVar.n);
                    String str3 = s4mVar.o;
                    if (str3 != null) {
                        g2hVar.e = str3;
                    }
                    g2hVar.b = str2;
                    g2hVar.c = "share";
                    g2hVar.f = str;
                    g2hVar.a();
                    break;
                }
                break;
            case 4:
                HashtagHintsView hashtagHintsView = (HashtagHintsView) obj;
                int i2 = HashtagHintsView.d;
                for (View view : (List) obj2) {
                    hashtagHintsView.getClass();
                    if (view != null) {
                        view.clearAnimation();
                    }
                    if (view != null && (animate = view.animate()) != null && (alpha = animate.alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) != null && (interpolator = alpha.setInterpolator(new hlq())) != null && (duration = interpolator.setDuration(200L)) != null) {
                        duration.start();
                    }
                }
                break;
            case 5:
                NewsfeedCustomFragment2 newsfeedCustomFragment2 = (NewsfeedCustomFragment2) obj2;
                sq60 sq60Var = (sq60) obj;
                qcy<Object>[] qcyVarArr = NewsfeedCustomFragment2.r0;
                a9q0 a9q0Var = sq60Var.h;
                if ((a9q0Var instanceof a9q0.b) || (a9q0Var instanceof a9q0.a) || (a9q0Var instanceof a9q0.c) || (a9q0Var instanceof a9q0.d)) {
                    bs60.b(newsfeedCustomFragment2.fo().b());
                    newsfeedCustomFragment2.fo().b().c();
                }
                if (!newsfeedCustomFragment2.fo().a().A0(sq60Var.a)) {
                    newsfeedCustomFragment2.o0.d(sq60Var, (tc60) newsfeedCustomFragment2.fo().a.U.getValue(), newsfeedCustomFragment2.ho().get());
                }
                newsfeedCustomFragment2.fo().b().l();
                break;
            case 6:
                o7o o7oVar = (o7o) obj;
                HashMap f = ((gm80) obj2).a.f();
                if (f == null) {
                    f = null;
                }
                if (f != null) {
                    break;
                }
                break;
            case 7:
                SessionRoomParticipantsDataProviderImpl.resolveInternalIdByExternal$lambda$1((izs) obj2, (ParticipantId) obj);
                break;
            case 8:
                ivy0 ivy0Var = (ivy0) obj2;
                ivy0Var.getClass();
                try {
                    RtcCommandOnSuccessListener<Command, Response> rtcCommandOnSuccessListener = ivy0Var.d.successListener;
                    if (rtcCommandOnSuccessListener != 0) {
                        rtcCommandOnSuccessListener.onRtcCommandSuccess(ivy0Var.c, (RtcResponse) obj);
                        break;
                    }
                } catch (Throwable th) {
                    ivy0Var.a.reportException("ProtocolInfo", "rtc.command.handle.command.onsuccess", th);
                    return;
                }
                break;
            default:
                ((v.s) obj2).r((String) obj);
                break;
        }
    }
}
