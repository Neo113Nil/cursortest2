package xsna;

import android.content.Context;
import android.location.LocationManager;
import com.unity3d.ads.BuildConfig;
import com.vk.bridges.di.BridgeComponent;
import com.vk.donut.privacy.di.DonutPrivacyComponentImpl;
import com.vk.dto.music.SuggestMusicNotificationInfo;
import com.vk.popupmanager.impl.di.PopupManagerComponentImpl;
import com.vk.toggle.features.VideoFeatures;
import com.vk.translate.impl.di.TranslateComponentImpl;
import com.vkontakte.android.R;
import com.vkontakte.android.VKApplication;
import java.util.concurrent.ScheduledExecutorService;
import xsna.mgn0;
import xsna.thn0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class y56 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ y56(int i) {
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        byte b = 0;
        switch (this.b) {
            case 0:
                return new otu0();
            case 1:
                return new ct0();
            case 2:
                Context context = e43.a;
                if (context == null) {
                    context = null;
                }
                String string = context.getString(R.string.music_suggest_notification_title);
                Context context2 = e43.a;
                return new SuggestMusicNotificationInfo(BuildConfig.FLAVOR, string, (context2 != null ? context2 : null).getString(R.string.music_suggest_notification_message));
            case 3:
                o2l.a.getClass();
                return new xpr(o2l.b("__dbg_flipper_layout_plugin_enabled", false));
            case 4:
                qcy<Object>[] qcyVarArr = PopupManagerComponentImpl.b;
                return new zwb0();
            case 5:
                return new s4n();
            case 6:
                mgn0 mgn0Var = dgn0.a;
                mgn0 mgn0Var2 = dgn0.a;
                return ((mgn0.h) (mgn0Var2 != null ? mgn0Var2 : null).j.getValue()).a();
            case 7:
                return new keu0();
            case 8:
                thn0.b bVar = new thn0.b();
                thn0.c cVar = new thn0.c(16.0f, 6.5f, 16.0f, 7.5f);
                thn0.c cVar2 = new thn0.c(12.0f, 7.0f, 12.0f, 7.0f);
                return new thn0.d(new thn0.a(cVar, cVar2, bVar), new thn0.a(cVar, cVar2, bVar), new thn0.a(cVar, cVar2, bVar), new thn0.a(cVar, cVar2, bVar));
            case 9:
                return s3q0.a;
            case 10:
                VKApplication.a aVar = VKApplication.c;
                return ((BridgeComponent) m7m.e().a(fpf0.a(BridgeComponent.class))).s();
            case 11:
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_TOOLBAR_VH_REDESIGN;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 12:
                return new DonutPrivacyComponentImpl.a();
            case 13:
                return new TranslateComponentImpl.a();
            case 14:
                asu0.a.getClass();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) asu0.Z.getValue();
                io.reactivex.rxjava3.core.w wVar = io.reactivex.rxjava3.schedulers.a.a;
                return new io.reactivex.rxjava3.internal.schedulers.d(scheduledExecutorService, true);
            case 15:
                Context context3 = e43.a;
                return new nfv0(context3 != null ? context3 : null, (LocationManager) jfv0.e.getSystemService("location"), (kfv0) jfv0.m.getValue(), new ldi(b, 7));
            default:
                return a201.b().b();
        }
    }

    public /* synthetic */ y56(VKApplication vKApplication) {
        this.b = 10;
    }
}
