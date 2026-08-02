package xsna;

import com.vk.ecomm.market.api.ctabutton.di.ProductTileCtaButtonComponent$Companion$STUB$1;
import com.vk.im.ui.formatters.DisplayNameFormatter;
import com.vk.libvideo.design.view.overlay.VideoOverlayView;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.toggle.features.VideoFeatures;
import com.vk.video.ui.upload.impl.settings.presentation.fragment.SettingsFragmentInternalComponent;
import com.vkontakte.android.R;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import xsna.ksd0;
import xsna.smh0;
import xsna.xhe0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class xk70 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ xk70(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return new DisplayNameFormatter(null, 3, null);
            case 1:
                return new Exception();
            case 2:
                dhr0.a.getClass();
                return new brj0(0, 0, dhr0.t.b(R.drawable.vk_icon_story_outline_28, R.attr.vk_ui_icon_accent), R.string.modal_dialog_option_go_to_story, null, false, false, null, 0, null, null, null, null, null, 131058);
            case 3:
                return new m2c0();
            case 4:
                qcy<Object>[] qcyVarArr = ProductTileCtaButtonComponent$Companion$STUB$1.c;
                return ksd0.a.a.getSTUB();
            case 5:
                return new xhe0.a.C4004a();
            case 6:
                RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
                frf0.g(SchemeStatSak$EventScreen.PARTIAL_SILENT_EXPAND_PASSWORD, null, null, null, 12);
                return s3q0.a;
            case 7:
                return new smh0.b();
            case 8:
                float f = 2;
                float f2 = 18;
                float f3 = 10;
                return new s5b0(f, f2, 4, f, f, l5g.d, e43.l(new pco(f3), new pco(16), new pco(f2), new pco(f3)), new l5g(l5g.c(14, l5g.b, 0.3f)));
            case 9:
                SettingsFragmentInternalComponent.a aVar = SettingsFragmentInternalComponent.j;
                return com.vk.core.utils.newtork.b.a;
            case 10:
                return new io.reactivex.rxjava3.disposables.b();
            case 11:
                return s3q0.a;
            case 12:
                bpn0 bpn0Var = VideoOverlayView.I;
                return Integer.valueOf(iah0.a(12));
            case 13:
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_NEW_SEEKBAR;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 14:
                return tlo0.Companion.serializer();
            default:
                return new Regex("(^|[a-z0-9.\\-]*\\.)(vk|vkontakte)\\.(com|ru|me)", RegexOption.IGNORE_CASE);
        }
    }
}
