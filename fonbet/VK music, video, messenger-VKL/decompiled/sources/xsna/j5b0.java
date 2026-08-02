package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.data.VKList;
import com.vk.dto.hints.Hint;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.messagetemplates.impl.details.TemplateDetailsState;
import com.vk.messagetemplates.impl.details.a;
import com.vk.newsfeed.impl.presentation.postponed.presentation.fragment.PostponedPostsFragment;
import com.vk.newsfeed.impl.requests.WallWithCounters;
import com.vk.onboardingscreens.impl.recomthemes.domain.model.UserRecomThemesChooserStep;
import com.vk.profile.design.view.subscriptioninfo.SubscriptionInfoView;
import com.vk.stat.scheme.CommonOnboardingRecomThemesStat$TypeRecomThemesItem;
import com.vk.storycamera.picker.ui.StoryMediaPickerFragment;
import com.vk.storycamera.picker.ui.a;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.UnreadCounterSettingsFragment;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.json.JSONObject;
import xsna.iyq0;
import xsna.khm0;
import xsna.m7h0;
import xsna.qn60;
import xsna.tra0;
import xsna.xn50;
import xsna.zhg;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class j5b0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j5b0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        int i2 = 0;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return (VideoTextureView) obj2;
            case 1:
                final PostponedPostsFragment postponedPostsFragment = (PostponedPostsFragment) obj2;
                com.vk.mvi.binder.c cVar = (com.vk.mvi.binder.c) obj;
                qcy<Object>[] qcyVarArr = PostponedPostsFragment.q0;
                com.vk.mvi.binder.c.a(cVar, f9t.w(postponedPostsFragment.go()), new iyp() { // from class: xsna.lrc0
                    @Override // xsna.iyp
                    public final void a(pk50 pk50Var) {
                        qcy<Object>[] qcyVarArr2 = PostponedPostsFragment.q0;
                        PostponedPostsFragment postponedPostsFragment2 = PostponedPostsFragment.this;
                        postponedPostsFragment2.eo();
                        hrc0.a(postponedPostsFragment2.eo(), postponedPostsFragment2, postponedPostsFragment2.getActivity(), postponedPostsFragment2.Z, (wrc0) pk50Var);
                    }
                });
                com.vk.mvi.binder.c.b(cVar, f9t.F(f9t.z(postponedPostsFragment.go()), new e420(13)), new mrc0(postponedPostsFragment, i2));
                return s3q0.a;
            case 2:
                VKList vKList = (VKList) obj2;
                qn60.c cVar2 = (qn60.c) obj;
                return new mwc0(cVar2.a, cVar2.b, vKList, vKList.j());
            case 3:
                return Boolean.valueOf(!((s940) ((Ref$ObjectRef) obj2).element).a.d);
            case 4:
                return new dod0((ViewGroup) obj, ((aod0) obj2).j);
            case 5:
                Hint p = ((i8e0) obj2).a.getValue().p("feed:after_auth:unban_security_recommendation");
                return p != null ? io.reactivex.rxjava3.core.x.k(p) : io.reactivex.rxjava3.internal.operators.single.a0.b;
            case 6:
                c7h0 c7h0Var = (c7h0) obj2;
                Throwable th = (Throwable) obj;
                c7h0Var.o.b(new zhg.a(th));
                c7h0Var.T(new m7h0.a(th));
                return s3q0.a;
            case 7:
                ((wh50) obj2).setValue((tho0) obj);
                return s3q0.a;
            case 8:
                int i3 = r9i0.j1;
                ((r9i0) obj2).tn();
                return s3q0.a;
            case 9:
                ((io.reactivex.rxjava3.core.b) obj2).onError((Throwable) obj);
                return s3q0.a;
            case 10:
                View view = (View) obj;
                View.OnClickListener onClickListener = ((r8j0) obj2).x;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                return s3q0.a;
            case 11:
                return com.vk.sharing.core.view.f.S0((com.vk.sharing.core.view.f) obj2, (CharSequence) obj);
            case 12:
                ((zak0) ((a9k0) obj2).b).setValue((String) obj);
                return s3q0.a;
            case 13:
                azl0 azl0Var = (azl0) obj2;
                Throwable th2 = (Throwable) obj;
                ((uvl0) azl0Var.o.getValue()).k(azl0Var.d, null);
                azl0Var.h.g(azl0Var, (Exception) th2);
                throw th2;
            case 14:
                ((x3m0) obj2).m.h((String) obj);
                return s3q0.a;
            case 15:
                int i4 = StoryMediaPickerFragment.d0;
                xn50.a.c((StoryMediaPickerFragment) obj2, new a.i((List) obj));
                return s3q0.a;
            case 16:
                ((mfm0) obj2).e.setContentVisibility((khm0.c) obj);
                return s3q0.a;
            case 17:
                int i5 = SubscriptionInfoView.p;
                tra0.a.x((tra0.a) obj, (tra0) obj2, 0, 0);
                return s3q0.a;
            case 18:
                WallWithCounters wallWithCounters = (WallWithCounters) obj2;
                qn60.c cVar3 = (qn60.c) obj;
                return new j5n0(cVar3.a, cVar3.b, wallWithCounters, wallWithCounters.i());
            case 19:
                return TemplateDetailsState.a((TemplateDetailsState) obj, null, ((a.C1271a) ((com.vk.messagetemplates.impl.details.a) obj2)).b, false, 11);
            case 20:
                return Long.valueOf(((isp0) obj2).a.getLong("timestamp_" + ((String) obj), 0L));
            case 21:
                int i6 = UnreadCounterSettingsFragment.n0;
                ((UnreadCounterSettingsFragment) obj2).io();
                return s3q0.a;
            case 22:
                ((isq0) obj2).v().k(obj);
                return s3q0.a;
            case 23:
                hyq0 hyq0Var = (hyq0) obj2;
                ((Boolean) obj).getClass();
                fzq0 fzq0Var = hyq0Var.g;
                fzq0Var.getClass();
                fzq0.a(fzq0Var, CommonOnboardingRecomThemesStat$TypeRecomThemesItem.EventType.SHOW_SCREEN_STEP_2);
                hyq0Var.T(new iyq0.d(UserRecomThemesChooserStep.SecondLevelThemes));
                return s3q0.a;
            case 24:
                u8r0 u8r0Var = (u8r0) obj2;
                if (u8r0Var.i) {
                    com.vk.lists.c cVar4 = u8r0Var.d;
                    if (cVar4 == null) {
                        cVar4 = null;
                    }
                    cVar4.p(false);
                    RecyclerPaginatedView recyclerPaginatedView = u8r0Var.a.g;
                    (recyclerPaginatedView != null ? recyclerPaginatedView : null).f0();
                }
                return s3q0.a;
            case 25:
                ubr0 ubr0Var = (ubr0) obj2;
                ubr0Var.c.n(JsApiMethodType.SHOW_INVITE_BOX, new JSONObject().put("success", true));
                SuperappUiRouterBridge superappUiRouterBridge = e370.d;
                (superappUiRouterBridge != null ? superappUiRouterBridge : null).j(((ggu0) ubr0Var.g.c).b.getString(R.string.vk_games_invitation_sent));
                return s3q0.a;
            case 26:
                ((ber0) obj2).c.A(JsApiMethodType.ALLOW_NOTIFICATIONS, (Throwable) obj);
                return s3q0.a;
            case 27:
                oor0 oor0Var = ((ror0) obj2).e;
                if (oor0Var != null) {
                    oor0Var.f0();
                }
                return s3q0.a;
            case 28:
                return Collections.singletonList(new AboutVideoItem.g((VideoFile) obj2, (eao) obj));
            default:
                h4t0 h4t0Var = (h4t0) obj2;
                h4t0Var.q = true;
                h4t0Var.f();
                return s3q0.a;
        }
    }
}
