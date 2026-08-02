package defpackage;

import com.google.protobuf.InvalidProtocolBufferException;
import com.yandex.go.payments.shared.business.accountcreation.corp.citysuggestdialog.CitySuggest;
import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.core.navigation.cicerone.androidx.FragmentScreen;
import com.ybsdk.core.transfer.utils.TransferScenario;
import com.ybsdk.feature.partnerselection.api.PartnerSelectionFeature$Companion$Entry;
import com.ybsdk.feature.partnerselection.internal.screens.partners.presentation.PartnersFragment;
import java.util.UUID;
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIBody;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.reprov.array.DerValue;
import ru.CryptoPro.ssl.Alerts;

/* loaded from: classes3.dex */
public abstract class o791 {
    public static final CitySuggest a = new CitySuggest();

    public static final void a(fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(638650219);
        if (btsVar.V(i & 1, i != 0)) {
            oeb1.c(btsVar, i9a1.f(c530.a));
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new gse(i, 15);
        }
    }

    public static void b(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (!i(b2)) {
            if ((((b2 + Alerts.alert_unrecognized_name) + (b << DerValue.tag_UniversalString)) >> 30) == 0 && !i(b3) && !i(b4)) {
                int i2 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
                cArr[i] = (char) ((i2 >>> 10) + 55232);
                cArr[i + 1] = (char) ((i2 & 1023) + 56320);
                return;
            }
        }
        throw InvalidProtocolBufferException.f();
    }

    public static boolean c(byte b) {
        return b >= 0;
    }

    public static void d(byte b, char[] cArr, int i) {
        cArr[i] = (char) b;
    }

    public static boolean e(byte b) {
        return b < -32;
    }

    public static void f(byte b, byte b2, char[] cArr, int i) {
        if (b < -62 || i(b2)) {
            throw InvalidProtocolBufferException.f();
        }
        cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
    }

    public static boolean g(byte b) {
        return b < -16;
    }

    public static void h(byte b, byte b2, byte b3, char[] cArr, int i) {
        if (i(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || i(b3)))) {
            throw InvalidProtocolBufferException.f();
        }
        cArr[i] = (char) (((b & PKIBody._CCP) << 12) | ((b2 & 63) << 6) | (b3 & 63));
    }

    public static boolean i(byte b) {
        return b > -65;
    }

    public static FragmentScreen j(ai90 ai90Var, String str, String str2, PartnerSelectionFeature$Companion$Entry partnerSelectionFeature$Companion$Entry, MoneyEntity moneyEntity, String str3, String str4, String str5, TransferScenario transferScenario, String str6, int i) {
        MoneyEntity moneyEntity2 = (i & 8) != 0 ? null : moneyEntity;
        String str7 = (i & 16) != 0 ? null : str3;
        String str8 = (i & 32) != 0 ? null : str4;
        String str9 = (i & 64) != 0 ? null : str5;
        TransferScenario transferScenario2 = (i & 256) != 0 ? null : transferScenario;
        String str10 = (i & 512) != 0 ? null : str6;
        mi90 mi90Var = ((ci90) ai90Var).b;
        if (str9 == null) {
            str9 = UUID.randomUUID().toString();
        }
        return mi90.a(new PartnersFragment.Arguments(str, str2, partnerSelectionFeature$Companion$Entry, moneyEntity2, str7, str8, str9, null, transferScenario2, str10, false, false, HProv.ALG_TYPE_SECURECHANNEL, null));
    }
}
