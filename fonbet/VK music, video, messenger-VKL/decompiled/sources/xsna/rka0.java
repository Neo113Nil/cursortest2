package xsna;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.mbridge.msdk.MBridgeConstans;
import com.unity3d.ads.core.domain.GetLimitedSessionToken;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.di.ServicesRegistry;
import com.vk.auth.modal.base.ModalAuthHostActivity;
import com.vk.auth.modal.qrwithcode.QrWithCodeAuthModal;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog2.common.ui.mvp.clip.VideoCatalogSearchFragment;
import com.vk.catalog2.common.ui.mvp.holder.video.offline.di.component.api.VideoCatalogComponent;
import com.vk.clips.design.view.timeline.TimelineBottomActionsView;
import com.vk.clips.design.view.timeline.VideoEditTimelineView;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.common.data.ApiApplication;
import com.vk.music.bottomsheets.onboarding.di.RecommendationOnboardingComponentImpl;
import com.vk.music.player.StandalonePlayerFragment;
import com.vk.newsfeed.impl.presentation.suggested.presentation.fragment.SuggestedPostsFragment;
import com.vk.poll.fragments.PollEditorFragment;
import com.vk.popupmanager.api.di.PopupManagerComponent;
import com.vk.profile.user.impl.ui.UserProfileAction;
import com.vk.repository.internal.repos.stickers.database.StickersDatabase_Impl;
import com.vk.settings.impl.presentation.base.fragment.settings.RedesignNotificationSettingsFragment;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.story.viewer.api.di.StoryViewerComponent;
import com.vk.superapp.sessionmanagment.api.domain.di.SessionManagementComponent;
import com.vk.superapp.ui.miniapp.VKSuperAppBrowserFragment;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.concurrent.Future;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.c9p0;
import xsna.ma5;
import xsna.mbc0;
import xsna.nyd0.b;
import xsna.sx40;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class rka0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rka0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r1v50, types: [T, xsna.us2] */
    /* JADX WARN: Type inference failed for: r1v51, types: [T, xsna.qko0] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i;
        yvj yvjVar;
        GetLimitedSessionToken initialize$lambda$220$lambda$114;
        ApiApplication apiApplication;
        int i2 = this.b;
        boolean z = true;
        Object obj = this.c;
        switch (i2) {
            case 0:
                return ((ma5.a) obj).c;
            case 1:
                return ((BridgeComponent) m7m.d((tma0) obj).a(fpf0.a(BridgeComponent.class))).p().e();
            case 2:
                PollEditorFragment pollEditorFragment = (PollEditorFragment) obj;
                int i3 = PollEditorFragment.X;
                pollEditorFragment.io().c(pollEditorFragment);
                FragmentActivity activity = pollEditorFragment.getActivity();
                if (activity != null) {
                    activity.onBackPressed();
                }
                return s3q0.a;
            case 3:
                ((Future) obj).cancel(true);
                return s3q0.a;
            case 4:
                return ((y8c0) obj).a();
            case 5:
                return new mbc0.c((mbc0) obj);
            case 6:
                return ((nyd0) obj).new b();
            case 7:
                return (RecyclerView) ((View) ((i0e0) obj).d.getValue()).findViewById(R.id.recycler_view);
            case 8:
                ModalAuthHostActivity modalAuthHostActivity = ((QrWithCodeAuthModal) obj).e;
                if (modalAuthHostActivity != null) {
                    return ((SessionManagementComponent) m7m.a(modalAuthHostActivity).a(fpf0.a(SessionManagementComponent.class))).J2();
                }
                throw new IllegalStateException("QrWithCodeAuthModal is not shown");
            case 9:
                b3f0 b3f0Var = (b3f0) obj;
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether((ValueAnimator) b3f0Var.e.getValue(), (ValueAnimator) b3f0Var.f.getValue(), (ValueAnimator) b3f0Var.g.getValue(), (ValueAnimator) b3f0Var.h.getValue(), (ValueAnimator) b3f0Var.i.getValue());
                return animatorSet;
            case 10:
                RecommendationOnboardingComponentImpl recommendationOnboardingComponentImpl = (RecommendationOnboardingComponentImpl) obj;
                return new abf0(recommendationOnboardingComponentImpl.b.r(), recommendationOnboardingComponentImpl.a.Q0());
            case 11:
                RedesignNotificationSettingsFragment.a aVar = RedesignNotificationSettingsFragment.Y;
                Bundle arguments = ((RedesignNotificationSettingsFragment) obj).getArguments();
                if (arguments != null) {
                    return arguments.getString("section_title");
                }
                return null;
            case 12:
                com.vk.registration.funnels.b.z(com.vk.registration.funnels.b.a, SchemeStatSak$EventScreen.REGISTRATION_EXISTENT_ACCOUNT_NO_PASSWORD, (ArrayList) obj, null, null, 28);
                return s3q0.a;
            case 13:
                ((mqe0) obj).invoke();
                return s3q0.a;
            case 14:
                FragmentActivity activity2 = ((FragmentImpl) obj).getActivity();
                if (activity2 != null) {
                    activity2.onBackPressed();
                }
                return s3q0.a;
            case 15:
                e0i0 e0i0Var = (e0i0) obj;
                e0i0Var.b.setVisibility(8);
                e0i0Var.b.setAlpha(1.0f);
                return s3q0.a;
            case 16:
                bei0 bei0Var = (bei0) obj;
                bei0Var.y = true;
                bei0Var.o();
                ((zak0) bei0Var.s).setValue(null);
                ((zak0) bei0Var.t).setValue(null);
                if (bei0Var.v && bei0Var.h()) {
                    Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                    Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                    Ref$LongRef ref$LongRef = new Ref$LongRef();
                    oei0 oei0Var = bei0Var.a;
                    ArrayList j = oei0Var.j(bei0Var.j());
                    ListIterator listIterator = j.listIterator(j.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            obi0 b = oei0Var.i().b(((cai0) listIterator.previous()).e());
                            if (b != null && b.a.b != b.b.b) {
                                i = listIterator.nextIndex();
                            }
                        } else {
                            i = -1;
                        }
                    }
                    if (i != -1) {
                        int size = j.size();
                        int i4 = 0;
                        while (true) {
                            if (i4 < size) {
                                cai0 cai0Var = (cai0) j.get(i4);
                                boolean z2 = z;
                                obi0 b2 = oei0Var.i().b(cai0Var.e());
                                if (b2 != null) {
                                    ?? text = cai0Var.getText();
                                    long c = jgz.c(b2.a.b, b2.b.b);
                                    boolean z3 = i4 >= i ? z2 : false;
                                    long e = cai0Var.e();
                                    if (z3) {
                                        ref$ObjectRef.element = text;
                                        ref$ObjectRef2.element = new qko0(c);
                                        ref$LongRef.element = e;
                                    }
                                } else {
                                    i4++;
                                    z = z2;
                                }
                            }
                        }
                    }
                    T t = ref$ObjectRef.element;
                    if (t != 0 && ref$ObjectRef2.element != 0 && ref$LongRef.element != 0 && ((CharSequence) t).length() > 0 && (yvjVar = bei0Var.w) != null) {
                        myc0.h(yvjVar, null, null, new aei0(bei0Var, ref$ObjectRef, ref$ObjectRef2, ref$LongRef, null), 3);
                    }
                }
                bei0Var.v = false;
                return s3q0.a;
            case 17:
                initialize$lambda$220$lambda$114 = ServiceProvider.initialize$lambda$220$lambda$114((ServicesRegistry) obj);
                return initialize$lambda$220$lambda$114;
            case 18:
                cvj0 cvj0Var = (cvj0) obj;
                u1c0 J0 = cvj0Var.J0();
                if (J0 != null) {
                    gvj0 b7 = cvj0Var.b7();
                    J0.g = b7 != null ? gvj0.a(b7, null, 5) : null;
                }
                return s3q0.a;
            case 19:
                int i5 = StandalonePlayerFragment.a0;
                return ((PopupManagerComponent) m7m.d((StandalonePlayerFragment) obj).a(fpf0.a(PopupManagerComponent.class))).Dc();
            case 20:
                int i6 = StickersDatabase_Impl.B;
                return new a5e0((StickersDatabase_Impl) obj);
            case 21:
                return ((StoryViewerComponent) ((k7m) m7m.c(((zim0) obj).b)).a(fpf0.a(StoryViewerComponent.class))).l9();
            case 22:
                qcy<Object>[] qcyVarArr = SuggestedPostsFragment.r0;
                return m7m.d((SuggestedPostsFragment) obj);
            case 23:
                ((izs) ((zak0) ((c9p0.b) obj).b).getValue()).invoke(sx40.g.b);
                return s3q0.a;
            case 24:
                vrq0 vrq0Var = (vrq0) obj;
                vrq0Var.o.a(new UserProfileAction.s.b.a(new e4t(vrq0Var, 17)));
                return s3q0.a;
            case 25:
                int i7 = VKSuperAppBrowserFragment.Y;
                Bundle arguments2 = ((VKSuperAppBrowserFragment) obj).getArguments();
                if (arguments2 == null || (apiApplication = (ApiApplication) arguments2.getParcelable(MBridgeConstans.DYNAMIC_VIEW_WX_APP)) == null) {
                    return null;
                }
                return chx0.c(apiApplication);
            case 26:
                return Integer.valueOf(((com.vk.video.ui.discovery.minimizable.announce.a) obj).a.d.getWidth());
            case 27:
                int i8 = VideoCatalogSearchFragment.X;
                ((VideoCatalogComponent) m7m.d((VideoCatalogSearchFragment) obj).mo408a(fpf0.a(VideoCatalogComponent.class))).getClass();
                return null;
            case 28:
                int i9 = VideoEditTimelineView.H;
                return (TimelineBottomActionsView) ((VideoEditTimelineView) obj).findViewById(R.id.bottom_actions);
            default:
                int i10 = VideoMinimizableDiscoveryFragment.p1;
                return Boolean.valueOf(fxc0.B().J().d(((VideoMinimizableDiscoveryFragment) obj).requireContext()));
        }
    }
}
