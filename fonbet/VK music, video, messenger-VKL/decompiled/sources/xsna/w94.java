package xsna;

import android.content.Context;
import com.vk.audience.impl.di.AudienceResearchComponentImpl;
import com.vk.avatar.impl.di.VKAvatarComponentImpl;
import com.vk.bridges.di.BridgeComponent;
import com.vk.camera.editor.stories.impl.di.StoryEditorComponentImpl;
import com.vk.clips.upload.vk.impl.di.ClipsUploadVkComponentImpl;
import com.vk.core.files.PrivateFiles;
import com.vk.core.files.PrivateSubdir;
import com.vk.core.preference.Preference;
import com.vk.ecomm.reviews.impl.di.ReviewsComponentImpl;
import com.vk.httpexecutor.api.NetworkClient;
import com.vk.music.player.MusicPlayerServiceComponentImpl;
import com.vk.profile.provider.di.ProfileFragmentProviderComponent;
import com.vk.story.impl.di.StoriesComponentImpl;
import com.vk.toggle.anonymous.SakFeatures;
import com.vk.toggle.b;
import com.vk.toggle.features.CoreFeatures;
import com.vk.toggle.features.ImFeatures;
import com.vk.toggle.features.SaFeatures;
import com.vkontakte.android.task.di.components.clips.MediaPipelineComponentVkApp;
import java.io.File;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.collections.EmptyList;
import xsna.mgn0;
import xsna.vwv;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class w94 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ w94(int i) {
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        PrivateFiles.a b;
        switch (this.b) {
            case 0:
                qcy<Object>[] qcyVarArr = AudienceResearchComponentImpl.d;
                vx2.a.getClass();
                return new mto(vx2.b());
            case 1:
                umu0 umu0Var = r55.g;
                oou0 oou0Var = (oou0) (umu0Var != null ? umu0Var : null).i.invoke();
                par0.a.getClass();
                par0.a("VkCredentialsManager: " + oou0Var);
                return oou0Var;
            case 2:
                return Preference.f("prefs_blacklists");
            case 3:
                return new ClipsUploadVkComponentImpl.a();
            case 4:
                return new StoryEditorComponentImpl.a();
            case 5:
                return new wek();
            case 6:
                return com.vk.toggle.b.A.i(CoreFeatures.NETWORK_COMMON_2);
            case 7:
                return Boolean.valueOf(SakFeatures.Type.VKC_PHONE_HINT_IM.h());
            case 8:
                vwv vwvVar = vwv.b;
                vwvVar.getClass();
                EmptyList emptyList = EmptyList.b;
                wb3 wb3Var = vwv.e;
                if (wb3Var == null) {
                    wb3Var = null;
                }
                lzc0 lzc0Var = new lzc0(wb3Var, new z58(4));
                aqi aqiVar = vwv.d;
                if (aqiVar == null) {
                    aqiVar = null;
                }
                long millis = TimeUnit.DAYS.toMillis(2L);
                wb3 wb3Var2 = vwv.e;
                if (wb3Var2 == null) {
                    wb3Var2 = null;
                }
                kzc0 kzc0Var = new kzc0(millis, aqiVar, wb3Var2);
                vwv vwvVar2 = vwv.b;
                dgl0 dgl0Var = new dgl0();
                wno wnoVar = new wno(new a68(6), new uwv());
                Context context = vwv.c;
                if (context == null) {
                    context = null;
                }
                pjj0 pjj0Var = new pjj0(context);
                cii0 cii0Var = new cii0();
                aqi aqiVar2 = vwv.d;
                if (aqiVar2 == null) {
                    aqiVar2 = null;
                }
                int i = 1;
                List l = e43.l(lzc0Var, kzc0Var, dgl0Var, wnoVar, pjj0Var, cii0Var, new xn00(aqiVar2));
                Context context2 = vwv.c;
                Context context3 = context2 == null ? null : context2;
                b = e8r.a.b(r6, PrivateSubdir.AUDIO_MESSAGE.h(), true);
                File file = b.a;
                b1v b1vVar = new b1v(i);
                List list = l;
                wwv wwvVar = new wwv(1, vwvVar, vwv.class, "storagePermissionProvider", "storagePermissionProvider(Lcom/vk/audiomsg/player/impl/DefaultAudioMsgPlayer$PermissionProviderCallback;)V", 0);
                asu0.a.getClass();
                xal xalVar = new xal(context3, file, emptyList, b1vVar, list, wwvVar, asu0.o(), asu0.q());
                xalVar.v(new vwv.c());
                Context context4 = vwv.c;
                if (context4 == null) {
                    context4 = null;
                }
                ysa ysaVar = new ysa(context4, xalVar);
                c63 c63Var = c63.a;
                c63.a(new vwv.b(ysaVar));
                if (c63.f) {
                    ysaVar.b();
                }
                Context context5 = vwv.c;
                syu syuVar = new syu(context5 != null ? context5 : null, xalVar);
                syuVar.b.a(syuVar.c);
                return xalVar;
            case 9:
                return new zz2();
            case 10:
                return new MusicPlayerServiceComponentImpl.a();
            case 11:
                return new qx90(ow90.e);
            case 12:
                return ((BridgeComponent) ((k7m) m7m.f(com.vk.onepasspromo.impl.a.b)).a(fpf0.a(BridgeComponent.class))).t();
            case 13:
                qcy<Object>[] qcyVarArr2 = ReviewsComponentImpl.l;
                return new yhg0();
            case 14:
                com.vk.voip.ui.c.b.getClass();
                return new qvi0(com.vk.voip.ui.c.j0());
            case 15:
                qcy<Object>[] qcyVarArr3 = StoriesComponentImpl.N;
                return new tvl0();
            case 16:
                mgn0 mgn0Var = jgn0.a;
                return ((mgn0.h) (mgn0Var != null ? mgn0Var : null).j.getValue()).a();
            case 17:
                return dhr0.f;
            case 18:
                return NetworkClient.ClientType.CLIENT_PLAYER_DOWNLOADER;
            case 19:
                b.d i2 = com.vk.toggle.b.A.i(ImFeatures.ANIMATED_SHARING_CONTROL);
                if (i2 == null) {
                    return null;
                }
                if (!i2.a) {
                    i2 = null;
                }
                if (i2 != null) {
                    return i2.c.toString();
                }
                return null;
            case 20:
                return new MediaPipelineComponentVkApp.a();
            case 21:
                return new VKAvatarComponentImpl.a();
            case 22:
                return (String) com.vk.core.apps.a.c(null, "com.vk.APP_STORE_NAME");
            case 23:
                asu0.a.getClass();
                return new j3q((ExecutorService) asu0.r0.getValue());
            case 24:
                asu0.a.getClass();
                bsu0 bsu0Var = (bsu0) asu0.E.getValue();
                return Boolean.valueOf(bsu0Var != null ? bsu0Var.a : false);
            case 25:
                return new xlg();
            case 26:
                com.vk.voip.ui.c.b.getClass();
                Boolean bool = (Boolean) new eu2(18).invoke();
                bool.booleanValue();
                return bool;
            case 27:
                com.vk.toggle.b bVar = com.vk.toggle.b.A;
                boolean a = bVar.a(SaFeatures.SA_APPS_REQUESTS_ALIASES);
                boolean a2 = bVar.a(SaFeatures.SA_MINI_APPS_CATALOG_ALIAS);
                boolean a3 = bVar.a(SaFeatures.SA_MINI_APPS_ADS_ALIASES);
                return (a || a2 || a3) ? new xex0(new fit(), a, a2, a3) : new fit();
            default:
                return (ProfileFragmentProviderComponent) ((k7m) m7m.f(qfx0.d)).a(fpf0.a(ProfileFragmentProviderComponent.class));
        }
    }

    public /* synthetic */ w94(lnf lnfVar) {
        this.b = 14;
    }
}
