package defpackage;

import android.os.Process;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.firebase.datastorage.a;
import com.yandex.go.layers.api.model.MapObjectComponentType;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Map;
import kotlin.Pair;
import kotlinx.serialization.json.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.layers.presentation.mapnotification.MapNotificationsMuteRepository;

/* loaded from: classes9.dex */
public final /* synthetic */ class p0u implements tls {
    public final /* synthetic */ int a;

    public /* synthetic */ p0u(a aVar) {
        this.a = 8;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        ym00 b;
        int i = 1;
        switch (this.a) {
            case 0:
                lm00 lm00Var = (lm00) obj;
                if (lm00Var.d.d() && (b = dn00.b(lm00Var, MapObjectComponentType.BODY)) != null && b.g().b) {
                    r2 = true;
                }
                return Boolean.valueOf(r2);
            case 1:
                String str = (String) obj;
                return Boolean.valueOf(!(str == null || evu0.J(str)));
            case 2:
                return kotlin.sequences.a.b(new ucc(((NetworkInterface) obj).getInetAddresses()));
            case 3:
                return Boolean.valueOf(!((InetAddress) obj).isLoopbackAddress());
            case 4:
                return ((InetAddress) obj).getHostAddress();
            case 5:
                return zy11.a;
            case 6:
                return Boolean.FALSE;
            case 7:
                kotlinx.serialization.modules.a aVar = new kotlinx.serialization.modules.a();
                dai0.I(aVar);
                ((acx) obj).n = aVar.a();
                return zy11.a;
            case 8:
                qoi0.a(a.class).d();
                Process.myPid();
                return kp50.i();
            case 9:
                h0c h0cVar = (h0c) obj;
                h0cVar.a("JsonPrimitive", new scx(new aww(4)), (r3 & 8) == 0);
                h0cVar.a("JsonNull", new scx(new aww(5)), (r3 & 8) == 0);
                h0cVar.a("JsonLiteral", new scx(new aww(6)), (r3 & 8) == 0);
                h0cVar.a("JsonObject", new scx(new aww(7)), (r3 & 8) == 0);
                h0cVar.a("JsonArray", new scx(new aww(8)), (r3 & 8) == 0);
                return zy11.a;
            case 10:
                Map.Entry entry = (Map.Entry) obj;
                String str2 = (String) entry.getKey();
                b bVar = (b) entry.getValue();
                StringBuilder sb = new StringBuilder();
                ytu0.a(str2, sb);
                sb.append(':');
                sb.append(bVar);
                return sb.toString();
            case 11:
                acx acxVar = (acx) obj;
                acxVar.c = true;
                acxVar.b = false;
                acxVar.a = true;
                acxVar.g = true;
                acxVar.d = true;
                return zy11.a;
            case 12:
                return ((be61) obj).b;
            case 13:
                Long l = (Long) obj;
                l.longValue();
                return l;
            case 14:
                le00 le00Var = new le00(new eot("NavigationRouter"), qoi0.e(eot.class));
                wy40 wy40Var = ((fe00) obj).a;
                int i2 = wy40Var.b + 1;
                Object[] objArr = wy40Var.a;
                if (objArr.length < i2) {
                    int length = objArr.length;
                    Object[] objArr2 = new Object[Math.max(i2, (length * 3) / 2)];
                    System.arraycopy(objArr, 0, objArr2, 0, length);
                    wy40Var.a = objArr2;
                }
                Object[] objArr3 = wy40Var.a;
                int i3 = wy40Var.b;
                objArr3[i3] = le00Var;
                wy40Var.b = i3 + 1;
                return zy11.a;
            case 15:
                return kp50.i();
            case 16:
                return Boolean.valueOf(((kr) obj) instanceof g1j0);
            case 17:
                acx acxVar2 = (acx) obj;
                acxVar2.c = true;
                acxVar2.a = true;
                return zy11.a;
            case 18:
                Pair pair = (Pair) obj;
                return g8e.p((String) pair.getFirst(), Extension.COLON_SPACE, (String) pair.getSecond());
            case 19:
                Object f = ((Pair) obj).f();
                String obj2 = f != null ? f.toString() : null;
                return Boolean.valueOf(!(obj2 == null || obj2.length() == 0));
            case 20:
                quh quhVar = (quh) obj;
                if (!(quhVar instanceof puh)) {
                    return null;
                }
                puh puhVar = (puh) quhVar;
                return puhVar.e() ? "completed" : puhVar.d() ? "cancelled" : ClidProvider.APP_ACTIVE;
            case 21:
                return zy11.a;
            case 22:
                return ((Map) obj).entrySet();
            case 23:
                return Long.valueOf(((MapNotificationsMuteRepository.NotificationVisibility) obj) == MapNotificationsMuteRepository.NotificationVisibility.MUTE ? 0L : 500L);
            case 24:
                return new h73(i, ((lm00) obj).f);
            case 25:
                return ((lm00) obj).a;
            case 26:
                fkp fkpVar = (fkp) obj;
                if (fkpVar != null) {
                    return fkpVar.getA();
                }
                return null;
            case 27:
                return ((TaxiOrder) obj).h.getB();
            case 28:
                xby.d.j((Throwable) obj);
                return zy11.a;
            default:
                ListItemComponent listItemComponent = new ListItemComponent(((ViewGroup) obj).getContext(), null, 0, 6, null);
                listItemComponent.getLeadImageView().setImportantForAccessibility(2);
                listItemComponent.setTitleTypeface(3);
                listItemComponent.setTitleTextSizePx(tje.r(mrg0.component_text_size_body, listItemComponent.getContext()));
                listItemComponent.setSubtitleTextSizePx(tje.r(mrg0.component_text_size_caption, listItemComponent.getContext()));
                listItemComponent.setTrailContentDescription(listItemComponent.getContext().getString(kyh0.payment_methods_hide));
                listItemComponent.setTrailVerticalGravity(1);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                layoutParams.setMargins(tje.r(utg0.payment_methods_notification_horizontal_margin, listItemComponent.getContext()), tje.r(utg0.payment_methods_banner_top_margin, listItemComponent.getContext()), tje.r(utg0.payment_methods_notification_horizontal_margin, listItemComponent.getContext()), tje.r(utg0.payment_methods_notification_vertical_margin, listItemComponent.getContext()));
                listItemComponent.setLayoutParams(layoutParams);
                return listItemComponent;
        }
    }

    public /* synthetic */ p0u(int i) {
        this.a = i;
    }
}
