package xsna;

import android.content.Context;
import com.facebook.soloader.SoLoader;
import com.vk.antispam.di.AntispamComponentImpl;
import com.vk.biometrics.lock.impl.di.BiometricsLockComponentImpl;
import com.vk.clips.config.authors.impl.di.ClipsConfigAuthorsComponentBase;
import com.vk.clips.edit.di.ClipEditComponentImpl;
import com.vk.core.native_loader.NativeLibLoader;
import com.vk.core.preference.Preference;
import com.vk.dto.common.id.UserId;
import com.vk.libvideo.impl.di.VkVideoPromoComponentImpl;
import com.vk.music.di.DefaultPlayerUIComponentImpl;
import com.vk.notifications.dnd.impl.di.DndComponentImpl;
import com.vk.queue.di.QueueSyncComponentImpl;
import com.vk.superapp.health.js.bridge.api.di.JsHealthDelegateComponent;
import com.vk.superapp.health.js.bridge.impl.di.JsHealthDelegateComponentImpl;
import com.vk.superapp.miniapp.MenuApiApplicationsCache;
import com.vk.toggle.features.CoreFeatures;
import com.vk.toggle.features.MusicFeatures;
import com.vk.toggle.features.VideoFeatures;
import com.vkontakte.android.VKApplication;
import kotlin.Result;
import kotlin.collections.EmptySet;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class mb3 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ mb3(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        Object failure;
        switch (this.b) {
            case 0:
                return Boolean.valueOf(MusicFeatures.AUDIO_PLAYER_BUFFERING.h());
            case 1:
                qcy<Object>[] qcyVarArr = BiometricsLockComponentImpl.d;
                return new d87();
            case 2:
                qcy<Object>[] qcyVarArr2 = ClipEditComponentImpl.c;
                return new sld();
            case 3:
                qcy<Object>[] qcyVarArr3 = ClipsConfigAuthorsComponentBase.f;
                return new com.vk.movika.sdk.base.utils.b(10);
            case 4:
                CoreFeatures coreFeatures = CoreFeatures.START_NETWORK_WHITELIST_VIOLATION;
                coreFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(coreFeatures));
            case 5:
                qcy<Object>[] qcyVarArr4 = DefaultPlayerUIComponentImpl.h;
                return new k140();
            case 6:
                Context context = e43.a;
                return Preference.g(context != null ? context : null);
            case 7:
                return utb0.a;
            case 8:
                MenuApiApplicationsCache menuApiApplicationsCache = MenuApiApplicationsCache.b;
                return MenuApiApplicationsCache.c(MenuApiApplicationsCache.AppsType.APP);
            case 9:
                return EmptySet.b;
            case 10:
                NativeLibLoader.a.getClass();
                if (!NativeLibLoader.d) {
                    return "";
                }
                if (NativeLibLoader.k != NativeLibLoader.SoLoaderState.INITIALIZED) {
                    return NativeLibLoader.m();
                }
                String makeLdLibraryPath = SoLoader.makeLdLibraryPath();
                return (NativeLibLoader.n && makeLdLibraryPath.length() == 0) ? NativeLibLoader.m() : makeLdLibraryPath;
            case 11:
                asu0.a.getClass();
                return asu0.u();
            case 12:
                return new lfu();
            case 13:
                return new udv();
            case 14:
                qcy<Object>[] qcyVarArr5 = QueueSyncComponentImpl.f;
                return null;
            case 15:
                try {
                    failure = new JsHealthDelegateComponentImpl.a();
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                JsHealthDelegateComponent.Companion.getClass();
                Object b = JsHealthDelegateComponent.Companion.b();
                if (failure instanceof Result.Failure) {
                    failure = b;
                }
                return (c8m) failure;
            case 16:
                return UserId.d;
            case 17:
                VKApplication.a aVar = VKApplication.c;
                return m7m.e();
            case 18:
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_FIX_PLAYLIST_COVER;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 19:
                return new VkVideoPromoComponentImpl.a();
            case 20:
                return new DndComponentImpl.a();
            case 21:
                return new AntispamComponentImpl.a();
            case 22:
                return asu0.a.b(5, 0L, "bg-apply-prefs-thread");
            default:
                return Boolean.valueOf(com.vk.toggle.d.O());
        }
    }

    public /* synthetic */ mb3(VKApplication vKApplication) {
        this.b = 17;
    }
}
