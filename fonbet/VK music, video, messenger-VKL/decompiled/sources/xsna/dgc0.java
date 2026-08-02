package xsna;

import android.os.Parcelable;
import android.os.SystemClock;
import com.unity3d.ads.core.data.repository.TransactionEventRepository;
import com.unity3d.services.core.di.ServiceProvider;
import com.vk.core.compose.component.defaults.SegmentSize;
import com.vk.core.view.components.cell.VkCell;
import com.vk.external.miniapp.net.app.AppFields;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.reactions.view.GridReactionsPaginatedView;
import com.vk.reefton.literx.schedulers.ExecutorScheduler;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.toggle.features.SoccomFeatures;
import com.vk.video.ui.edit.fragments.VideoAlbumEditorFragment;
import com.vk.voip.stereo.stub.create.di.VoipStereoCreateRoomComponentStub;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.concurrent.Executors;
import xsna.kqh0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class dgc0 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ dgc0(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        TransactionEventRepository initialize$lambda$220$lambda$81;
        switch (this.b) {
            case 0:
                return new hi7();
            case 1:
                SoccomFeatures soccomFeatures = SoccomFeatures.MULTI_INTEGRATION;
                soccomFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(soccomFeatures));
            case 2:
                return s3q0.a;
            case 3:
                return Long.valueOf(SystemClock.elapsedRealtime());
            case 4:
                float f = iah0.f().widthPixels;
                float f2 = GridReactionsPaginatedView.Q;
                float f3 = GridReactionsPaginatedView.R;
                float f4 = GridReactionsPaginatedView.T;
                float f5 = f / (f3 + f4);
                if (f5 < 1.0f) {
                    f5 = 1.0f;
                }
                int b = an10.b(f5);
                float f6 = iah0.f().heightPixels / (GridReactionsPaginatedView.S + f4);
                return Integer.valueOf(swe0.g((an10.b(f6 >= 1.0f ? f6 : 1.0f) * b) + 4, 10, 50));
            case 5:
                return new ExecutorScheduler(Executors.newSingleThreadExecutor(new oof0()));
            case 6:
                iyk0 iyk0Var = o1h0.a;
                return null;
            case 7:
                return new kqh0.a.C3198a();
            case 8:
                initialize$lambda$220$lambda$81 = ServiceProvider.initialize$lambda$220$lambda$81();
                return initialize$lambda$220$lambda$81;
            case 9:
                return new StringBuilder();
            case 10:
                RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
                frf0.f(null, SchemeStatSak$EventScreen.VERIFICATION_PHONE_VERIFY, null, false, null, null, 61);
                return s3q0.a;
            case 11:
                return new h9x(0L);
            case 12:
                return "pop()";
            case 13:
                Parcelable.Creator<WebApiApplication> creator = WebApiApplication.CREATOR;
                ArrayList arrayList = new ArrayList(WebApiApplication.a.a());
                arrayList.add(AppFields.SHORT_DESCRIPTION);
                arrayList.remove(AppFields.WEBVIEW_URL);
                return arrayList;
            case 14:
                bpn0 bpn0Var = o25.a;
                return (b25) (bpn0Var != null ? bpn0Var : null).getValue();
            case 15:
                int i = VideoAlbumEditorFragment.l0;
                return Boolean.FALSE;
            case 16:
                return new tub0(fpf0.a(VkCell.f.class), new Annotation[0]);
            case 17:
                return SegmentSize.Medium;
            default:
                qcy<Object>[] qcyVarArr = VoipStereoCreateRoomComponentStub.a;
                return new VoipStereoCreateRoomComponentStub.c();
        }
    }
}
