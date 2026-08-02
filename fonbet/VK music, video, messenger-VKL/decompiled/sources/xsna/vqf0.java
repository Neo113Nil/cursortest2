package xsna;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import com.vk.core.apps.BuildInfo;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.fresco.VKEnhancedImageView;
import com.vk.libvideo.api.di.VideoApiHelperComponent;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.superapp.di.SuperAppServicesComponentImpl;
import com.vk.toggle.features.CoreFeatures;
import com.vk.voip.OKVoipEngine;
import com.vkontakte.android.R;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class vqf0 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ vqf0(int i) {
        this.b = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0094, code lost:
    
        if (r0 == false) goto L40;
     */
    @Override // xsna.gzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        boolean z;
        switch (this.b) {
            case 0:
                com.vk.registration.funnels.b.z(com.vk.registration.funnels.b.a, SchemeStatSak$EventScreen.CONSENT_SCREEN, null, null, null, 28);
                return s3q0.a;
            case 1:
                cvk.u(R.string.error, false);
                return s3q0.a;
            case 2:
                return s3q0.a;
            case 3:
                t6g0 t6g0Var = t6g0.b;
                return Boolean.valueOf(t6g0.d().K0() && yse0.c.a());
            case 4:
                return new io.reactivex.rxjava3.subjects.f();
            case 5:
                qcy<Object>[] qcyVarArr = SuperAppServicesComponentImpl.f;
                return new com.vk.superapp.widget_settings.p004new.b(new wnx0());
            case 6:
                return Boolean.valueOf(o25.a().b());
            case 7:
                return xol.a;
            case 8:
                return Integer.valueOf((int) x5r0.a(4, 1));
            case 9:
                qcy<Object>[] qcyVarArr2 = VKEnhancedImageView.N;
                CoreFeatures coreFeatures = CoreFeatures.THUMB_HASH;
                coreFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(coreFeatures) && com.vk.toggle.d.s().a());
            case 10:
                return ((VideoApiHelperComponent) ((k7m) m7m.f(w1s0.b)).a(fpf0.a(VideoApiHelperComponent.class))).N4();
            case 11:
                if (gz80.a(26) && (BuildInfo.s() || BuildInfo.q())) {
                    Context context = e43.a;
                    if (context == null) {
                        context = null;
                    }
                    if (context.getPackageManager().hasSystemFeature("android.software.picture_in_picture")) {
                        Context context2 = e43.a;
                        Context context3 = context2 != null ? context2 : null;
                        if (!t5m.c()) {
                            z = false;
                            break;
                        } else {
                            z = !((AccessibilityManager) context3.getSystemService("accessibility")).getEnabledAccessibilityServiceList(1).isEmpty();
                            break;
                        }
                    }
                }
                r1 = false;
                return Boolean.valueOf(r1);
            case 12:
                return VkCell.Middle.e.b.Companion.serializer();
            case 13:
                DecimalFormat decimalFormat = new DecimalFormat();
                DecimalFormatSymbols decimalFormatSymbols = decimalFormat.getDecimalFormatSymbols();
                decimalFormatSymbols.setGroupingSeparator(' ');
                decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
                return decimalFormat;
            case 14:
                return s3q0.a;
            case 15:
                return new s7v0(new hpt0());
            case 16:
                return vog0.b(8);
            case 17:
                com.vk.voip.ui.c.r.getClass();
                return OKVoipEngine.x().a();
            default:
                return new q73(new ykg());
        }
    }

    public /* synthetic */ vqf0(z9o0 z9o0Var) {
        this.b = 6;
    }
}
