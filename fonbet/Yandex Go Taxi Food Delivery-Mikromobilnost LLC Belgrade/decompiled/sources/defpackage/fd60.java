package defpackage;

import android.app.NotificationChannel;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.go.shortcuts.dto.response.Background;
import com.yandex.go.shortcuts.dto.response.Counters;
import com.yandex.go.shortcuts.dto.response.Offer$Animation;
import com.yandex.go.shortcuts.dto.response.Offer$MainScreenOnboarding;
import com.yandex.go.shortcuts.dto.response.TextStyleDto;
import com.yandex.go.shortcuts.dto.response.e0;
import com.yandex.go.shortcuts.dto.response.f;
import com.yandex.go.shortcuts.dto.response.f0;
import com.yandex.go.shortcuts.models.OfferType;
import com.yandex.payment.sdk.core.data.PaymentMethod;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.ybsdk.feature.cashback.impl.views.OpenCashbackSelectorButtonView;
import io.appmetrica.analytics.impl.C0553n3;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.c;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.common_models.net.b;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes13.dex */
public final /* synthetic */ class fd60 implements tls {
    public final /* synthetic */ int a;

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        List W;
        zy11 iconsAdapter$lambda$3;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                ull0 T0 = ((oll0) obj).T0("SELECT namespace FROM no_phone_namespaces");
                try {
                    ArrayList arrayList = new ArrayList();
                    while (T0.q()) {
                        arrayList.add(Integer.valueOf((int) T0.getLong(0)));
                    }
                    return arrayList;
                } finally {
                    T0.close();
                }
            case 1:
                return ((cya0) obj).a();
            case 2:
                Byte b = (Byte) obj;
                b.byteValue();
                return String.format("%02X", Arrays.copyOf(new Object[]{b}, 1));
            case 3:
                return Boolean.valueOf(cvu0.x((String) obj, "BannerNotificationComponent_", false));
            case 4:
                return ((NotificationChannel) obj).getId();
            case 5:
                return Boolean.valueOf(cvu0.x((String) obj, "messenger-chat-v2", false));
            case 6:
                W = evu0.W((String) obj, new String[]{"_"}, (r2 & 4) != 0 ? 0 : 2);
                return Boolean.valueOf(W.size() == 2);
            case 7:
                return mbb1.d((y3x) obj, new fd60(9));
            case 8:
                wj00 b2 = ((y3x) obj).b();
                return new ml60(b2.f("web_client_active"), b2.f("sbscr_supported"), b2.p("bank_name"), b2.p("logo_url"), b2.p("schema"), b2.h("package_name"), b2.h("web_client_url"), b2.p("url_template"));
            case 9:
                List m = ((y3x) obj).b().m("bank_apps");
                ArrayList arrayList2 = new ArrayList();
                Iterator it = ((ArrayList) m).iterator();
                while (it.hasNext()) {
                    arrayList2.add(mbb1.d((y3x) it.next(), new fd60(8)).d());
                }
                return new ol60(arrayList2);
            case 10:
                return Boolean.valueOf(a8a0.f((PaymentMethod) obj));
            case 11:
                czj0 czj0Var = (czj0) obj;
                if (!czj0Var.d) {
                    return null;
                }
                Throwable th = czj0Var.c;
                Objects.requireNonNull(th);
                qwf0.a("Observer.onChanged", th);
                return null;
            case 12:
                h0c h0cVar = (h0c) obj;
                o2f0 o2f0Var = auu0.b;
                h0cVar.a("shortcut_id", o2f0Var, (r3 & 8) == 0);
                h0cVar.a("title", o2f0Var, (r3 & 8) == 0);
                h0cVar.a("subtitle", o2f0Var, (r3 & 8) == 0);
                b bVar = FormattedText.Companion;
                h0cVar.a("attributed_title", bVar.serializer().getDescriptor(), (r3 & 8) == 0);
                h0cVar.a("attributed_subtitle", bVar.serializer().getDescriptor(), (r3 & 8) == 0);
                o2f0 o2f0Var2 = e6m.b;
                h0cVar.a("width", o2f0Var2, (r3 & 8) == 0);
                h0cVar.a("height", o2f0Var2, (r3 & 8) == 0);
                e0.a.getClass();
                h0cVar.a("overlays", ((KSerializer) e0.b.getValue()).getDescriptor(), (r3 & 8) == 0);
                h0cVar.a("text_style", TextStyleDto.Companion.serializer().getDescriptor(), (r3 & 8) == 0);
                f fVar = Background.Companion;
                h0cVar.a(C0553n3.g, fVar.serializer().getDescriptor(), (r3 & 8) == 0);
                h0cVar.a("thumb_background", fVar.serializer().getDescriptor(), (r3 & 8) == 0);
                h0cVar.a("counters", Counters.Companion.serializer().getDescriptor(), (r3 & 8) == 0);
                h0cVar.a("onboarding", qke.n(f0.Companion.serializer()).getDescriptor(), (r3 & 8) == 0);
                h0cVar.a("type", OfferType.Companion.serializer().getDescriptor(), (r3 & 8) == 0);
                h0cVar.a("action", c.Companion.serializer().getDescriptor(), (r3 & 8) == 0);
                h0cVar.a(Constants.KEY_SERVICE, o2f0Var, (r3 & 8) == 0);
                h0cVar.a("icon_tag", o2f0Var, (r3 & 8) == 0);
                h0cVar.a("icon_background", o2f0Var, (r3 & 8) == 0);
                h0cVar.a("nested_buttons", ((KSerializer) e0.c.getValue()).getDescriptor(), (r3 & 8) == 0);
                h0cVar.a("on_screen_onboarding", qke.n(Offer$MainScreenOnboarding.Companion.serializer()).getDescriptor(), (r3 & 8) == 0);
                h0cVar.a("animation", Offer$Animation.Companion.serializer().getDescriptor(), (r3 & 8) == 0);
                h0cVar.a("nested_offer_ids", ((KSerializer) e0.d.getValue()).getDescriptor(), (r3 & 8) == 0);
                h0cVar.a("icon_animation", qke.n(di2.Companion.serializer()).getDescriptor(), (r3 & 8) == 0);
                h0cVar.a("analytics", qke.n(cei0.Companion.serializer()).getDescriptor(), (r3 & 8) == 0);
                return zy11Var;
            case 13:
                return ((PlusPayCompositeOffers.Offer.Option) obj).getId();
            case 14:
                return (String) obj;
            case 15:
                return zy11Var;
            case 16:
                iconsAdapter$lambda$3 = OpenCashbackSelectorButtonView.iconsAdapter$lambda$3((n70) obj);
                return iconsAdapter$lambda$3;
            case 17:
                return new ConstraintLayout(((ViewGroup) obj).getContext());
            case 18:
                return Boolean.valueOf(((noh) ((Map.Entry) obj).getValue()).isCancelled());
            case 19:
                return ((DriveState) obj).name();
            case 20:
                ((Integer) obj).getClass();
                return 32;
            case 21:
                ((Integer) obj).getClass();
                return 10;
            case 22:
                ((Integer) obj).getClass();
                return 16;
            case 23:
                return new ArrayList();
            case 24:
                return Boolean.valueOf(jl40.l((String) obj, "GOOGLE_PAY_UNAVAILABLE_DIALOG_TAG"));
            case 25:
                return Boolean.valueOf(cvu0.x(((pp70) obj).b, "NotAcceptable: ", false));
            case 26:
                return Boolean.valueOf(((pp70) obj).b.equals("showNoNetwork"));
            case 27:
                ((ir70) obj).L0();
                return zy11Var;
            case 28:
                ((ir70) obj).r();
                return zy11Var;
            default:
                ((ir70) obj).N();
                return zy11Var;
        }
    }

    public /* synthetic */ fd60(int i) {
        this.a = i;
    }
}
