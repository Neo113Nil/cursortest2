package xsna;

import android.os.Handler;
import android.os.Looper;
import com.vk.clips.editor.templates.impl.di.ClipsTemplatesEditorComponentBase;
import com.vk.contactssync.impl.di.ContactSyncColdStartModalComponentImpl;
import com.vk.core.apps.BuildInfo;
import com.vk.dzenarticle.impl.di.DzenArticleComponentImpl;
import com.vk.games.di.GamesFragmentsComponentImpl;
import com.vk.libvideo.impl.di.VideoPlaylistReversionComponentImpl;
import com.vk.superapp.analytics.js.bridge.api.di.JsAnalyticsDelegateComponent;
import com.vk.superapp.analytics.js.bridge.impl.di.JsAnalyticsDelegateComponentImpl;
import com.vk.toggle.features.ComFeatures;
import com.vk.toggle.features.VideoFeatures;
import com.vk.voip.OKVoipEngine;
import com.vk.voip.ui.di.VoipFirstCallCacheImplComponent;
import java.util.concurrent.ExecutorService;
import kotlin.Result;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class kb3 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ kb3(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        Object failure;
        int i = 1;
        switch (this.b) {
            case 0:
                nb3.b();
                return s3q0.a;
            case 1:
                return BuildInfo.j.invoke();
            case 2:
                return new ClipsTemplatesEditorComponentBase.a();
            case 3:
                return new o45(new Handler(Looper.getMainLooper()), i);
            case 4:
                qcy<Object>[] qcyVarArr = DzenArticleComponentImpl.b;
                return new xro();
            case 5:
                return s3q0.a;
            case 6:
                return new k15();
            case 7:
                ComFeatures comFeatures = ComFeatures.COM_DEFAULT_AUTHOR;
                comFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(comFeatures));
            case 8:
                OKVoipEngine oKVoipEngine = OKVoipEngine.b;
                return new io70(oKVoipEngine, new l63(24), new viu(12), OKVoipEngine.E, new OKVoipEngine.f(oKVoipEngine));
            case 9:
                return new eym();
            case 10:
                try {
                    failure = new JsAnalyticsDelegateComponentImpl.a();
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                JsAnalyticsDelegateComponent.Companion.getClass();
                Object b = JsAnalyticsDelegateComponent.Companion.b();
                if (failure instanceof Result.Failure) {
                    failure = b;
                }
                return (c8m) failure;
            case 11:
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_SEARCH_AUTHOR_VKUI;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 12:
                return new GamesFragmentsComponentImpl.a();
            case 13:
                return new VideoPlaylistReversionComponentImpl.a();
            case 14:
                return new ContactSyncColdStartModalComponentImpl.a();
            case 15:
                asu0.a.getClass();
                ExecutorService q = asu0.q();
                io.reactivex.rxjava3.core.w wVar = io.reactivex.rxjava3.schedulers.a.a;
                return new io.reactivex.rxjava3.internal.schedulers.d(q, true);
            case 16:
                return new qks0();
            default:
                qcy<Object>[] qcyVarArr2 = VoipFirstCallCacheImplComponent.b;
                return new gow0();
        }
    }
}
