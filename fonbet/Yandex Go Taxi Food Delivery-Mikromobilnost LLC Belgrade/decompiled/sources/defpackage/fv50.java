package defpackage;

import com.yandex.fintechsdk.entities.theme.Theme;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.cardinput.contract.CardNetwork;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes12.dex */
public final class fv50 {
    public final boolean a;
    public final lk8 b;
    public final LinkedHashMap c;

    public fv50(Map map, boolean z, lk8 lk8Var) {
        LinkedHashMap linkedHashMap;
        this.a = z;
        this.b = lk8Var;
        if (map != null) {
            linkedHashMap = new LinkedHashMap(gw00.d(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put(((String) entry.getKey()).toLowerCase(Locale.ROOT), entry.getValue());
            }
        } else {
            linkedHashMap = null;
        }
        this.c = linkedHashMap;
    }

    public final xj8 a(CardNetwork cardNetwork, Theme theme) {
        int i;
        String str;
        pj8 pj8Var;
        int i2 = ev50.a[cardNetwork.ordinal()];
        boolean z = this.a;
        switch (i2) {
            case 1:
                i = b0h0.finsdk_ic_card_network_amex;
                break;
            case 2:
                i = b0h0.finsdk_ic_card_network_amex;
                break;
            case 3:
                i = b0h0.finsdk_ic_card_network_unknown;
                break;
            case 4:
                i = b0h0.finsdk_ic_card_network_unknown;
                break;
            case 5:
                i = b0h0.finsdk_ic_card_network_unknown;
                break;
            case 6:
                i = b0h0.finsdk_ic_card_network_discover;
                break;
            case 7:
                i = b0h0.finsdk_ic_card_network_unknown;
                break;
            case 8:
                i = b0h0.finsdk_ic_card_network_humocard;
                break;
            case 9:
                i = b0h0.finsdk_ic_card_network_jcb;
                break;
            case 10:
                i = b0h0.finsdk_ic_card_network_maestro;
                break;
            case 11:
                i = b0h0.finsdk_ic_card_network_mastercard;
                break;
            case 12:
                if (!z) {
                    i = b0h0.finsdk_ic_card_network_mir;
                    break;
                } else {
                    i = b0h0.finsdk_ic_card_network_unknown;
                    break;
                }
            case 13:
                i = b0h0.finsdk_ic_card_network_unknown;
                break;
            case 14:
                i = b0h0.finsdk_ic_card_network_unknown;
                break;
            case 15:
                i = b0h0.finsdk_ic_card_network_unknown;
                break;
            case 16:
                i = b0h0.finsdk_ic_card_network_unionpay;
                break;
            case 17:
                i = b0h0.finsdk_ic_card_network_unknown;
                break;
            case 18:
                i = b0h0.finsdk_ic_card_network_uzcard;
                break;
            case 19:
                i = b0h0.finsdk_ic_card_network_visa;
                break;
            case 20:
                i = b0h0.finsdk_ic_card_network_visa_electron;
                break;
            default:
                w511.b();
                return null;
        }
        String lowerCase = cardNetwork.getStringCode().toLowerCase(Locale.ROOT);
        LinkedHashMap linkedHashMap = this.c;
        wj8 wj8Var = (linkedHashMap == null || (pj8Var = (pj8) linkedHashMap.get(lowerCase)) == null) ? null : pj8Var.a;
        if (theme == Theme.DAY) {
            if (wj8Var != null) {
                str = wj8Var.a;
            }
            str = null;
        } else {
            if (wj8Var != null) {
                str = wj8Var.b;
            }
            str = null;
        }
        if (str == null || evu0.J(str)) {
            str = null;
        }
        return new xj8(i, z ? null : str);
    }

    public fv50() {
        this(null, false, new lk8(0));
    }
}
