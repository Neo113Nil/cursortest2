package xsna;

import com.vk.badges.di.BadgesComponentImpl;
import com.vk.clips.edit.di.ClipEditComponentImpl;
import com.vk.core.apps.VkBuildAppStore;
import com.vk.dialogtags.impl.di.TagsComponentImpl;
import com.vk.ecomm.cart.impl.di.CartComponentImpl;
import com.vk.ecomm.market.impl.di.MarketComponentImpl;
import com.vk.music.offline.api.di.OfflineAudioComponent;
import com.vk.music.offline.impl.di.OfflineAudioComponentImpl;
import com.vk.music.onboarding.impl.di.MusicOnboardingComponentImpl;
import com.vk.superapp.libverify.js.bridge.api.di.JsLibverifyDelegateComponent;
import com.vk.superapp.libverify.js.bridge.impl.di.JsLibverifyDelegateComponentImpl;
import com.vk.textformat.di.MsgTextFormatComponentImpl;
import com.vk.toggle.features.SearchFeatures;
import com.vk.unitylevelplay.impl.di.UnityLevelPlayAdsSdkComponentImpl;
import com.vk.voip.OKVoipEngine;
import com.vkontakte.android.VKApplication;
import kotlin.Lazy;
import kotlin.Result;
import xsna.df5;
import xsna.k840;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class ib3 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ ib3(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        Object failure;
        Lazy lazy;
        switch (this.b) {
            case 0:
                return new tz2(new bpn0(new s63(1)));
            case 1:
                VkBuildAppStore.Companion.getClass();
                lazy = VkBuildAppStore.DEFAULT$delegate;
                return (VkBuildAppStore) lazy.getValue();
            case 2:
                qcy<Object>[] qcyVarArr = CartComponentImpl.f;
                return new jwl();
            case 3:
                return new ClipEditComponentImpl.a();
            case 4:
                return rkg.a;
            case 5:
                qcy<Object>[] qcyVarArr2 = MarketComponentImpl.l;
                return new nt00(new nw00(), new yz00());
            case 6:
                qcy<Object>[] qcyVarArr3 = MsgTextFormatComponentImpl.c;
                return new s040();
            case 7:
                return !k840.a.i() ? df5.a.a.getSTUB() : ((OfflineAudioComponent) k840.a.b().a(fpf0.a(OfflineAudioComponent.class))).u3();
            case 8:
                return new MusicOnboardingComponentImpl.a();
            case 9:
                SearchFeatures searchFeatures = SearchFeatures.SEARCH_INSIDE_COMMUNITY;
                searchFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(searchFeatures));
            case 10:
                qcy<Object>[] qcyVarArr4 = OfflineAudioComponentImpl.M;
                r5v0 r5v0Var = k840.a.h;
                if (r5v0Var == null) {
                    r5v0Var = null;
                }
                return new vi40(r5v0Var);
            case 11:
                return new sno();
            case 12:
                try {
                    failure = new JsLibverifyDelegateComponentImpl.a();
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                JsLibverifyDelegateComponent.Companion.getClass();
                Object b = JsLibverifyDelegateComponent.Companion.b();
                if (failure instanceof Result.Failure) {
                    failure = b;
                }
                return (c8m) failure;
            case 13:
                VKApplication.a aVar = VKApplication.c;
                o2l.a.getClass();
                return Boolean.valueOf(o2l.b("__dbg_force_send_firebase", false));
            case 14:
                return new in();
            case 15:
                return new mup0();
            case 16:
                return new UnityLevelPlayAdsSdkComponentImpl.a();
            case 17:
                return new BadgesComponentImpl.a();
            case 18:
                return new TagsComponentImpl.a();
            case 19:
                asu0.a.getClass();
                return ((Boolean) asu0.I.getValue()).booleanValue() ? asu0.n() : asu0.E(asu0.v.invoke(), "vk-network-image-thread-");
            case 20:
                return new fcu0("");
            default:
                OKVoipEngine oKVoipEngine = com.vk.voip.ui.c.r;
                com.vk.voip.ui.c.b.getClass();
                return new t4x0(oKVoipEngine, (d8j) com.vk.voip.ui.c.a0.getValue());
        }
    }
}
