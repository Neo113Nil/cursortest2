package xsna;

import android.view.ViewGroup;
import com.vk.catalog2.common.dto.api.CatalogFilterData;
import com.vk.catalog2.common.dto.ui.UIBlockHeader;
import com.vk.core.serialize.Serializer;
import com.vk.im.engine.models.attaches.AttachChannelMessage;
import com.vk.im.ui.components.contacts.ContactsList;
import com.vk.libvideo.autoplay.b;
import com.vk.onboardingscreens.impl.recomthemes.domain.model.UserRecomThemesBackButtonAction;
import com.vk.onboardingscreens.impl.recomthemes.domain.model.UserRecomThemesChooserStep;
import com.vkontakte.android.R;
import xsna.d5u0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class fyo0 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ fyo0(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return s3q0.a;
            case 1:
                Serializer.c<UIBlockHeader> cVar = UIBlockHeader.CREATOR;
                return ((CatalogFilterData) obj).c;
            case 2:
                h7o0 h7o0Var = (h7o0) obj;
                return Boolean.valueOf((h7o0Var instanceof paq0) || (h7o0Var instanceof abq0));
            case 3:
                ryq0 ryq0Var = (ryq0) obj;
                UserRecomThemesChooserStep userRecomThemesChooserStep = ryq0Var.l;
                return (userRecomThemesChooserStep != UserRecomThemesChooserStep.TopLevelThemes || ryq0Var.k) ? userRecomThemesChooserStep == UserRecomThemesChooserStep.SecondLevelThemes ? UserRecomThemesBackButtonAction.Back : UserRecomThemesBackButtonAction.None : UserRecomThemesBackButtonAction.Close;
            case 4:
                zhf0 zhf0Var = (zhf0) obj;
                return new vq2(zhf0Var.a, zhf0Var.b, zhf0Var.c, zhf0Var.d);
            case 5:
                bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
                yg5 e = b.C1208b.a().e(((atp) obj).b, null);
                if (!e.P0()) {
                    if (e.J() || e.v0() == null) {
                        e.S(true);
                    }
                    e.seek(r9.g * 1000);
                }
                return s3q0.a;
            case 6:
                return Boolean.valueOf(((d5u0.a) obj) instanceof d5u0.a.b);
            case 7:
                nkk nkkVar = luo.a;
                return xh2.c(anp.l(jq2.d(0, 200, nkkVar, 1), new b40(27)).b(anp.e(jq2.d(0, 200, nkkVar, 1), 2)), anp.o(jq2.d(0, 200, nkkVar, 1), new gxj0(9)).b(anp.f(jq2.d(0, 200, nkkVar, 1), 2)));
            case 8:
                return new yfw0(R.layout.voip_call_by_link_header_item, (ViewGroup) obj);
            case 9:
                return Boolean.valueOf(((ContactsList) obj).c.l);
            case 10:
                return ((fjw0) obj).a;
            default:
                return new i5g(((AttachChannelMessage) obj).g);
        }
    }
}
