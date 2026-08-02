package xsna;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.cell.VkCell;
import com.vk.libvideo.design.view.overlay.VideoOverlayView;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.shared.di.ReportComponentImpl;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.superapp.di.SuperAppServicesComponentImpl;
import com.vkontakte.android.R;
import java.lang.annotation.Annotation;
import xsna.k840;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class x1c0 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ x1c0(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return new f6y0();
            case 1:
                return k840.a.g().b();
            case 2:
                RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
                frf0.g(SchemeStatSak$EventScreen.REGISTRATION_EMAIL_PASSWORD, null, null, null, 12);
                return s3q0.a;
            case 3:
                qcy<Object>[] qcyVarArr = ReportComponentImpl.b;
                return new o5g0();
            case 4:
                return new lxq();
            case 5:
                return new afa();
            case 6:
                return new zej0();
            case 7:
                return new com.vk.music.track.a();
            case 8:
                return new RecyclerView.u();
            case 9:
                qcy<Object>[] qcyVarArr2 = SuperAppServicesComponentImpl.f;
                return new com.vk.superapp.miniapps.picker.a();
            case 10:
                return new pco(0);
            case 11:
                return wjs0.a;
            case 12:
                return rhs.e();
            case 13:
                return new PorterDuffColorFilter(Color.argb(153, 0, 0, 0), PorterDuff.Mode.SRC_ATOP);
            case 14:
                bpn0 bpn0Var = VideoOverlayView.I;
                return Integer.valueOf(iah0.a(28));
            case 15:
                return Boolean.valueOf(fxc0.B().J().l0());
            case 16:
                return Integer.valueOf(R.layout.fullscreen_ads_item_controls);
            case 17:
                return new tub0(fpf0.a(VkCell.f.class), new Annotation[0]);
            default:
                int i = c2x0.o1;
                return new f3x0();
        }
    }
}
