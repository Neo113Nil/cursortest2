package xsna;

import android.content.Context;
import android.widget.EditText;
import android.widget.TextView;
import com.vk.ads.api.di.AdsComponent;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog2.feature.music.ui.holder.MusicHidingToolbarVh;
import com.vk.clips.design.view.editor.speed.SpeedView;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.search.VkSearchView;
import com.vk.core.view.components.text.VkText;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.common.Peer;
import com.vk.editor.di.StoryEditorExtDepsComponentImpl;
import com.vk.im.engine.di.ImCmdRxExecutorScopedComponent;
import com.vk.im.engine.di.scope.ImFeatureScopeProviderComponent;
import com.vk.im.ui.fragments.MsgViewFragment;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.impl.fragments.PostViewFragment;
import com.vk.stories.design.view.stickers.StickersDrawingViewGroup;
import com.vk.storycamera.builder.StoryCameraParams;
import com.vk.storycamera.picker.template.ui.StoryTemplateFragment;
import com.vk.superapp.base.js.bridge.data.OnboardingModalArguments;
import com.vk.superapp.base.js.bridge.data.OnboardingStep;
import com.vk.video.music.api.di.MusicInVideoComponent;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import ru.ok.android.webrtc.OKDefaultVideoDecoderFactory;
import xsna.ccr0;
import xsna.ghc0.j;
import xsna.mo60;
import xsna.r5e0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class os30 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ os30(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        EditText editView;
        int i = 0;
        switch (this.b) {
            case 0:
                Context context = ((ps30) this.c).d;
                return new ek30(context != null ? context : null, 0);
            case 1:
                MsgViewFragment msgViewFragment = (MsgViewFragment) this.c;
                int i2 = MsgViewFragment.i0;
                l7m d = m7m.d(msgViewFragment);
                return ((ImCmdRxExecutorScopedComponent) xq.f((ImFeatureScopeProviderComponent) d.a(fpf0.a(ImFeatureScopeProviderComponent.class)), (Peer) msgViewFragment.S.getValue(), d).a(fpf0.a(ImCmdRxExecutorScopedComponent.class))).g();
            case 2:
                return new ef2((MusicHidingToolbarVh) this.c, 14);
            case 3:
                return ((MusicInVideoComponent) m7m.d((ko40) this.c).a(fpf0.a(MusicInVideoComponent.class))).T0();
            case 4:
                return (TextView) ((g850) this.c).a.findViewById(R.id.nativeads_domain);
            case 5:
                mo60 mo60Var = (mo60) this.c;
                return new yl60(mo60Var.c.h, new h0x(), new mo60.a(mo60Var.h, (hm60) mo60Var.f0.getValue()));
            case 6:
                return new tt60((Lazy) this.c);
            case 7:
                return (BridgeComponent) ((e7m) this.c).a(fpf0.a(BridgeComponent.class));
            case 8:
                return OKDefaultVideoDecoderFactory.b((OKDefaultVideoDecoderFactory) this.c);
            case 9:
                com.vk.newsfeed.impl.recycler.decorations.components.on_media_like.a aVar = (com.vk.newsfeed.impl.recycler.decorations.components.on_media_like.a) this.c;
                b2r b2rVar = aVar.h;
                int i3 = aVar.b;
                int i4 = aVar.a;
                if (b2rVar == null) {
                    return null;
                }
                Context context2 = b2rVar.b.getContext();
                int i5 = ccr0.q;
                ccr0 a = ccr0.a.a(context2);
                a.m = i4;
                a.n = i3;
                a.u(dhr0.t.a(R.drawable.user_placeholder));
                return a;
            case 10:
                de80 de80Var = (de80) this.c;
                int i6 = de80.p1;
                bpn0 bpn0Var = de80Var.f1;
                List<OnboardingStep> list = ((OnboardingModalArguments) bpn0Var.getValue()).b;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                for (Object obj : list) {
                    int i7 = i + 1;
                    if (i < 0) {
                        e43.t();
                        throw null;
                    }
                    OnboardingStep onboardingStep = (OnboardingStep) obj;
                    arrayList.add(i == ((OnboardingModalArguments) bpn0Var.getValue()).b.size() - 1 ? OnboardingStep.a(onboardingStep, de80Var.getString(R.string.vk_onboarding_sheet_okay), de80Var.getString(R.string.vk_onboarding_sheet_skip)) : OnboardingStep.a(onboardingStep, de80Var.getString(R.string.vk_onboarding_sheet_next), de80Var.getString(R.string.vk_onboarding_sheet_skip)));
                    i = i7;
                }
                return arrayList;
            case 11:
                return "getVideoFormat() - using cached value " + ((wl80) this.c).V;
            case 12:
                m8a0 m8a0Var = (m8a0) this.c;
                int i8 = m8a0.v1;
                return ((NewsFeedComponent) ((k7m) m7m.f(m8a0Var)).a(fpf0.a(NewsFeedComponent.class))).G2();
            case 13:
                return ((AdsComponent) ((k7m) m7m.f((y1c0) this.c)).mo408a(fpf0.a(AdsComponent.class))).j6();
            case 14:
                PostViewFragment postViewFragment = (PostViewFragment) this.c;
                String[] strArr = PostViewFragment.T0;
                try {
                    VkTopBar vkTopBar = postViewFragment.o0;
                    if (vkTopBar != null) {
                        awt0.q(vkTopBar);
                        s3q0 s3q0Var = s3q0.a;
                    }
                } catch (Throwable unused) {
                }
                return s3q0.a;
            case 15:
                return Boolean.valueOf(((rbc0) this.c).a.getBoolean("is_opened_from_miniapp"));
            case 16:
                return ((ghc0) this.c).new j();
            case 17:
                ((b5e0) this.c).g.b(r5e0.a.a);
                return s3q0.a;
            case 18:
                return (VkButton) ((prf0) this.c).a.findViewById(R.id.nativeads_call_to_action);
            case 19:
                return new gjl((sll) this.c);
            case 20:
                return Float.valueOf(((Number) ((mtk0) this.c).getValue()).floatValue());
            case 21:
                VkSearchView vkSearchView = ((afi0) this.c).i;
                if (vkSearchView == null || (editView = vkSearchView.getEditView()) == null) {
                    return null;
                }
                return new io.reactivex.rxjava3.internal.operators.observable.r1(bwt0.f(editView));
            case 22:
                return new i1t0(true, ((g7s0) this.c).J().Y1());
            case 23:
                ((jtj0) this.c).a.notifyDataSetChanged();
                return s3q0.a;
            case 24:
                SpeedView speedView = (SpeedView) this.c;
                int i9 = SpeedView.B;
                return (VkText) speedView.findViewById(R.id.speed_multiplier_text);
            case 25:
                StickersDrawingViewGroup stickersDrawingViewGroup = (StickersDrawingViewGroup) this.c;
                int i10 = StickersDrawingViewGroup.j0;
                return Boolean.valueOf(stickersDrawingViewGroup.n());
            case 26:
                return rl3.Z((Enum[]) ((sgl0) this.c).b.getValue(), null, null, null, new quz(21), 31);
            case 27:
                return new g6b(((StoryEditorExtDepsComponentImpl) this.c).b.a0());
            case 28:
                return ((ebm0) this.c).e;
            default:
                StoryTemplateFragment storyTemplateFragment = (StoryTemplateFragment) this.c;
                int i11 = StoryTemplateFragment.U;
                return new gjm0(storyTemplateFragment, (StoryCameraParams) storyTemplateFragment.Q.getValue());
        }
    }
}
