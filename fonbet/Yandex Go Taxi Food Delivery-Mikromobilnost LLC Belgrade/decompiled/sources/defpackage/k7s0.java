package defpackage;

import com.yandex.payment.sdk.core.data.BankName;
import com.yandex.payment.sdk.core.data.CardId;
import com.yandex.payment.sdk.core.data.Merchant;
import com.yandex.payment.sdk.core.data.PaymentMethod;
import com.yandex.payment.sdk.core.data.PaymentToken;
import com.yandex.payment.sdk.core.data.YBCardType;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes2.dex */
public final class k7s0 implements vfr {
    public final h450 a;
    public final rwo b;

    public k7s0(h450 h450Var, rwo rwoVar) {
        this.a = h450Var;
        this.b = rwoVar;
    }

    @Override // defpackage.vfr
    public final void a(mgr mgrVar, yfr yfrVar) {
        ggr ggrVar = (ggr) mgrVar;
        Map map = ggrVar.b;
        String str = ggrVar.a;
        int hashCode = str.hashCode();
        h450 h450Var = this.a;
        if (hashCode == -930533934) {
            if (str.equals("bind_card")) {
                h450Var.a(new c450(new Merchant(c("service_token", map))));
                return;
            }
            return;
        }
        if (hashCode != -786681338) {
            if (hashCode == 117588 && str.equals("web")) {
                String c = c("url", map);
                Object obj = map.get("with_passport_auth");
                if (obj == null) {
                    obj = "false";
                }
                h450Var.a(new f450(c, obj.equals("true")));
                return;
            }
            return;
        }
        if (str.equals("payment")) {
            PaymentToken paymentToken = new PaymentToken(c("intent_id", map));
            Merchant merchant = new Merchant(c("service_token", map));
            String c2 = c("payment_method_type", map);
            int hashCode2 = c2.hashCode();
            PaymentMethod paymentMethod = null;
            if (hashCode2 == -364006754) {
                if (c2.equals("yandex_card")) {
                    paymentMethod = new PaymentMethod.YBMethod(c("payment_method_id", map), true, (YBCardType) null, 4, (DefaultConstructorMarker) null);
                }
                qv90.a.getClass();
                wj00 wj00Var = new wj00(0);
                wj00Var.k(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Пришел неизвестный тип оплаты");
                wj00Var.k("payment_type", c2);
                ((y22) this.b).a(y891.c("transport_native_route_unknown_payment_type", wj00Var));
            } else if (hashCode2 != 3046160) {
                if (hashCode2 == 744363067 && c2.equals("sbp_token")) {
                    paymentMethod = new PaymentMethod.SbpToken(c("payment_method_id", map), c("member_id", map), c("member_name", map), null);
                }
                qv90.a.getClass();
                wj00 wj00Var2 = new wj00(0);
                wj00Var2.k(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Пришел неизвестный тип оплаты");
                wj00Var2.k("payment_type", c2);
                ((y22) this.b).a(y891.c("transport_native_route_unknown_payment_type", wj00Var2));
            } else {
                if (c2.equals("card")) {
                    paymentMethod = new PaymentMethod.Card(new CardId(c("payment_method_id", map)), wme.d(tfb1.g(c("pay_system", map))), c("account_key", map), BankName.UnknownBank, null);
                }
                qv90.a.getClass();
                wj00 wj00Var22 = new wj00(0);
                wj00Var22.k(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Пришел неизвестный тип оплаты");
                wj00Var22.k("payment_type", c2);
                ((y22) this.b).a(y891.c("transport_native_route_unknown_payment_type", wj00Var22));
            }
            h450Var.a(new e450(merchant, paymentToken, paymentMethod));
        }
    }

    @Override // defpackage.vfr
    public final String b() {
        return "ShowNativeScreenAction";
    }

    public final String c(String str, Map map) {
        Object obj = map.get(str);
        if (obj == null) {
            qv90.a.getClass();
            wj00 wj00Var = new wj00(0);
            wj00Var.k(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Не получилось распарсить параметры для открытия экрана оплаты");
            wj00Var.k("field_name", str);
            ((y22) this.b).a(y891.c("transport_native_route_field_parse_error", wj00Var));
            obj = "";
        }
        return (String) obj;
    }
}
