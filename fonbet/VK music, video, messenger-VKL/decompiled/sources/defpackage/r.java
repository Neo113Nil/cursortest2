package defpackage;

import android.widget.Button;
import com.vk.articles.ArticleFragment;
import com.vk.biometrics.lock.impl.presentation.base.mvi.pin.BiometricsLockPinFragment;
import com.vk.catalog2.common.ui.mvp.holder.header.AnimSearchQueryVh;
import com.vk.clips.coauthors.list.common.mvi.entity.viewstate.a;
import com.vk.clips.interests.impl.di.ClipsInterestsComponentImpl;
import com.vk.clips.tool.view.newsfeed.overlay.ClipEndOverlayView;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.content.privacy.di.ContentPrivacyComponent;
import com.vk.core.view.components.button.VkButton;
import com.vk.ecomm.market.api.di.MarketComponent;
import com.vk.im.channelcreation.impl.di.ChannelCreationInternalDiComponent;
import com.vk.im.chat.restriction.api.ChatWriteRestrictionFeatureComponent;
import com.vk.im.engine.models.conversations.BotButton;
import com.vk.im.engine.models.conversations.BotKeyboard;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.newsfeed.api.di.PostingSettingsComponent;
import com.vk.newsfeed.posting.additional_settings.presentation.base.fragment.AdditionalSettingsFragment;
import com.vk.stories.design.view.editor.StoryStylePickerView;
import com.vk.superapp.base.js.bridge.data.VKWebAppPermission;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vk.translate.api.di.TranslateComponent;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.subjects.d;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.externcalls.sdk.analytics.CallAnalyticsInitializer;
import xsna.amf;
import xsna.bbd;
import xsna.c0p;
import xsna.cfd;
import xsna.e370;
import xsna.eoc;
import xsna.exv0;
import xsna.fpf0;
import xsna.ftb;
import xsna.fvv0;
import xsna.fxv0;
import xsna.g5d;
import xsna.gzs;
import xsna.hie;
import xsna.hj9;
import xsna.i5s;
import xsna.i70;
import xsna.iw0;
import xsna.j5;
import xsna.k3c;
import xsna.k47;
import xsna.k7m;
import xsna.l5;
import xsna.lz0;
import xsna.m7m;
import xsna.mzp0;
import xsna.nmg0;
import xsna.nwy;
import xsna.ow3;
import xsna.p97;
import xsna.poc;
import xsna.pw0;
import xsna.qcy;
import xsna.rcg0;
import xsna.s3q0;
import xsna.swv0;
import xsna.tzp0;
import xsna.uhx;
import xsna.w6d;
import xsna.wf8;
import xsna.wgb;
import xsna.xf8;
import xsna.xkg;
import xsna.y440;
import xsna.ylc;
import xsna.yp80;
import xsna.ysg0;
import xsna.yw9;
import xsna.z6y;
import xsna.zad;
import xsna.zh;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class r implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ r(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        Integer init$lambda$2;
        int i = this.b;
        int i2 = 19;
        Object obj = this.c;
        switch (i) {
            case 0:
                z6y z6yVar = ((l0) obj).g;
                ysg0<exv0> ysg0Var = fxv0.a;
                fvv0 M = z6yVar.a.M();
                ysg0Var.a(new swv0(M != null ? M.getAppId() : uhx.a().a, Collections.singletonList(VKWebAppPermission.CAMERA)));
                SuperappUiRouterBridge superappUiRouterBridge = e370.d;
                (superappUiRouterBridge != null ? superappUiRouterBridge : null).N(1001);
                return s3q0.a;
            case 1:
                return (rcg0) obj;
            case 2:
                ((zh) obj).a.invalidate();
                return s3q0.a;
            case 3:
                qcy<Object>[] qcyVarArr = AdditionalSettingsFragment.U;
                return ((PostingSettingsComponent) m7m.d((AdditionalSettingsFragment) obj).mo408a(fpf0.a(PostingSettingsComponent.class))).X();
            case 4:
                return pw0.c(((iw0) obj).a);
            case 5:
                ((AnimSearchQueryVh) obj).c.invoke();
                return s3q0.a;
            case 6:
                yp80 yp80Var = (yp80) obj;
                if (yp80Var != null) {
                    yp80Var.onSuccess();
                }
                return s3q0.a;
            case 7:
                int i3 = ArticleFragment.E0;
                ((ArticleFragment) obj).uo(true);
                return s3q0.a;
            case 8:
                return (Button) ((ow3) obj).c.findViewById(R.id.btn_asr_start);
            case 9:
                return (StoryStylePickerView) ((y440) obj).findViewById(R.id.repost_style_picker);
            case 10:
                BiometricsLockPinFragment biometricsLockPinFragment = (BiometricsLockPinFragment) obj;
                int i4 = BiometricsLockPinFragment.c0;
                return Boolean.valueOf(((k47) biometricsLockPinFragment.Y.getValue()).c(biometricsLockPinFragment.requireContext()) && ((p97) biometricsLockPinFragment.V.getValue()).k());
            case 11:
                Iterator<List<BotButton>> it = ((BotKeyboard) obj).f.iterator();
                int i5 = 1;
                while (it.hasNext()) {
                    i5 *= it.next().size();
                }
                return Integer.valueOf(Math.max(1, i5));
            case 12:
                ((wf8) obj).d(xf8.c.a);
                return s3q0.a;
            case 13:
                init$lambda$2 = CallAnalyticsInitializer.init$lambda$2((i70) obj);
                return init$lambda$2;
            case 14:
                return d.O0(Boolean.valueOf(((hj9) obj).g()));
            case 15:
                return (ContentPrivacyComponent) ((nmg0) obj).a(fpf0.a(ContentPrivacyComponent.class));
            case 16:
                float f = CameraUIView.w1;
                ((CameraUIView) obj).getDeps().a.getClass();
                xkg.c.m(null, true);
                return s3q0.a;
            case 17:
                return ((MarketComponent) m7m.d(((yw9) obj).d).a(fpf0.a(MarketComponent.class))).Ob();
            case 18:
                return ((ChannelCreationInternalDiComponent) obj).a.g5();
            case 19:
                return i5s.a(new StringBuilder(), ((wgb) obj).s, ": loadRecommendations: started");
            case 20:
                ChatFragment.d dVar = ChatFragment.w1;
                return ((TranslateComponent) m7m.d((ChatFragment) obj).a(fpf0.a(TranslateComponent.class))).Q6();
            case 21:
                ftb ftbVar = (ftb) obj;
                return (ChatWriteRestrictionFeatureComponent) ((k7m) m7m.f(ftbVar)).d(ftbVar.b).a(fpf0.a(ChatWriteRestrictionFeatureComponent.class));
            case 22:
                k3c k3cVar = (k3c) obj;
                mzp0 mzp0Var = k3cVar.g;
                if (mzp0Var != null) {
                    mzp0Var.d(k3cVar.c());
                }
                return s3q0.a;
            case 23:
                return new c0p(((ylc) obj).d);
            case 24:
                tzp0.c.a aVar = poc.l1;
                return a.a(((eoc) obj).getCurrentState());
            case 25:
                int i6 = ClipEndOverlayView.u;
                return (VkButton) ((ClipEndOverlayView) obj).findViewById(R.id.attach_clip_end_overlay_replay);
            case 26:
                ((w6d) obj).e.a(g5d.b);
                return s3q0.a;
            case 27:
                bbd bbdVar = (bbd) obj;
                return new zad(new j5(bbdVar, i2), new lz0(bbdVar, 16), new l5(bbdVar, 20));
            case 28:
                return new com.vk.newsfeed.posting.impl.presentation.base.fragment.a((cfd) obj, i2);
            default:
                nwy nwyVar = ((ClipsInterestsComponentImpl) obj).i;
                qcy<Object> qcyVar = ClipsInterestsComponentImpl.o[8];
                return new hie((amf) nwyVar.c());
        }
    }
}
