package xsna;

import android.os.Handler;
import android.os.Looper;
import com.vk.clips.viewer.impl.di.ClipsViewerComponentImpl;
import com.vk.core.preference.Preference;
import com.vk.httpexecutor.api.NetworkClient;
import com.vk.libvideo.design.view.actionlink.ActionLinkView;
import com.vk.music.di.MusicBroadcastManagerComponentImpl;
import com.vk.settings.impl.di.component.ManageCommunitiesNotificationsComponentImpl;
import com.vk.toggle.features.ComFeatures;
import com.vk.toggle.features.SmbFeatures;
import java.util.concurrent.TimeUnit;
import xsna.bbv0;
import xsna.ds60;
import xsna.lg60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class d4 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ d4(int i) {
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r0v55, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v57, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return Boolean.valueOf(fxc0.B().J().X1());
            case 1:
                bpn0 bpn0Var = ActionLinkView.f;
                return Integer.valueOf(iah0.a(198));
            case 2:
                return Boolean.valueOf(com.vk.toggle.d.Q());
            case 3:
                return s3q0.a;
            case 4:
                return Preference.f("cache_info");
            case 5:
                return "markOnboardingShowed: ";
            case 6:
                return s3q0.a;
            case 7:
                return new w4c();
            case 8:
                return new qxq();
            case 9:
                return new Handler(Looper.getMainLooper());
            case 10:
                qcy<Object>[] qcyVarArr = ClipsViewerComponentImpl.o0;
                return new uoe();
            case 11:
                return new es();
            case 12:
                return s3q0.a;
            case 13:
                return s3q0.a;
            case 14:
                return ojo0.a;
            case 15:
                ComFeatures comFeatures = ComFeatures.COM_DONUT_PRICE_DISCOUNT;
                comFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(comFeatures));
            case 16:
                return new sm6();
            case 17:
                SmbFeatures smbFeatures = SmbFeatures.PRODUCT_BUTTONS_REFACH;
                smbFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(smbFeatures));
            case 18:
                return Long.valueOf(TimeUnit.DAYS.toMillis(1L));
            case 19:
                qcy<Object>[] qcyVarArr2 = ManageCommunitiesNotificationsComponentImpl.b;
                return new bh00();
            case 20:
                return Boolean.valueOf(vua0.r());
            case 21:
                qcy<Object>[] qcyVarArr3 = w920.v;
                return "checkHistoryUpdate: skipped with needUpdate = false";
            case 22:
                return new fy30();
            case 23:
                qcy<Object>[] qcyVarArr4 = MusicBroadcastManagerComponentImpl.b;
                return new nc40();
            case 24:
                return s3q0.a;
            case 25:
                return new h170();
            case 26:
                return e43.l(lg60.a.C3266a.b, new cg60(ds60.a.C2747a.b), new cg60(ds60.a.b.b));
            case 27:
                return NetworkClient.ClientType.CLIENT_PLAYER_DOWNLOADER;
            case 28:
                bbv0.g.getClass();
                bbv0.a.f().d.i();
                return s3q0.a;
            default:
                return new p4b0(false, (q4b0) q4b0.g.getValue(), (n4b0) n4b0.b.getValue(), 0L);
        }
    }
}
