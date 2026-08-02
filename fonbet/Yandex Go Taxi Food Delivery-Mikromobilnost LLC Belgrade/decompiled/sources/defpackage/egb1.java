package defpackage;

import android.content.Intent;
import android.net.Uri;
import com.yandex.payment.sdk.core.data.CardBinValidationConfig;
import com.yandex.payment.sdk.core.data.CardExpirationDateValidationConfig;
import com.yandex.payment.sdk.core.data.CardValidationConfig;
import com.yandex.payment.sdk.feature.flags.FeatureFlag;
import com.yandex.xplat.payment.sdk.InvalidArgumentError;
import com.ybsdk.feature.split.deposit.internal.data.network.dto.StatusScreenData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* loaded from: classes6.dex */
public abstract class egb1 {
    public static final vp8 a(CardValidationConfig cardValidationConfig) {
        qjd qjdVar;
        CardBinValidationConfig binConfig = cardValidationConfig.getBinConfig();
        qjd qjdVar2 = new qjd();
        if (apa1.e(FeatureFlag.CARD_NUMBER_ZERO_VALIDATION)) {
            qjdVar2.c(new o2u0());
        }
        qjdVar2.c(new l8h());
        qjdVar2.c(new wzz());
        List<Pair<String, String>> ranges$core_release = binConfig.getRanges$core_release();
        up8 up8Var = up8.b;
        if (ranges$core_release != null) {
            List<Pair<String, String>> ranges$core_release2 = binConfig.getRanges$core_release();
            ob8 ob8Var = new ob8();
            Iterator<T> it = ranges$core_release2.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                int i = 10;
                ArrayList arrayList = ob8Var.a;
                if (hasNext) {
                    Pair pair = (Pair) it.next();
                    String str = (String) pair.getFirst();
                    String str2 = (String) pair.getSecond();
                    Integer l = str.length() == 8 ? bvu0.l(10, str) : null;
                    if (l == null) {
                        throw new InvalidArgumentError("Card BIN must contain exactly 8 digits");
                    }
                    int intValue = l.intValue();
                    Integer l2 = str2.length() == 8 ? bvu0.l(10, str2) : null;
                    if (l2 == null) {
                        throw new InvalidArgumentError("Card BIN must contain exactly 8 digits");
                    }
                    int intValue2 = l2.intValue();
                    if (intValue2 < intValue) {
                        throw new InvalidArgumentError(b64.l("Invalid range specified: ", str2, " < ", str));
                    }
                    arrayList.add(new nb8(intValue, intValue2));
                } else {
                    String errorMessage = binConfig.getErrorMessage();
                    up8 up8Var2 = errorMessage != null ? new up8(errorMessage) : up8Var;
                    xcc.q(arrayList, new nnq0(new mq5(i), 1));
                    qjdVar2.c(new pb8(arrayList, up8Var2));
                }
            }
        }
        CardExpirationDateValidationConfig expirationDateConfig = cardValidationConfig.getExpirationDateConfig();
        if (expirationDateConfig.getAllowEndlessCards()) {
            qjdVar = new qjd();
            qjdVar.c(new n0o());
        } else {
            qjdVar = new qjd();
            qjdVar.c(new k8h(0));
        }
        if (expirationDateConfig.getMinExpirationYear() != null && expirationDateConfig.getMinExpirationMonth() != null) {
            String errorMessage2 = expirationDateConfig.getErrorMessage();
            if (errorMessage2 != null) {
                up8Var = new up8(errorMessage2);
            }
            int intValue3 = expirationDateConfig.getMinExpirationYear().intValue();
            int intValue4 = expirationDateConfig.getMinExpirationMonth().intValue();
            if (intValue4 < 1 || intValue4 > 12) {
                throw new InvalidArgumentError(oyr.i(intValue4, "Invalid month specified: "));
            }
            qjdVar.c(new wi8(intValue3 % 100, intValue4, up8Var));
        }
        return new vp8(qjdVar2, qjdVar, new j8h(), new rpi0(), new spi0());
    }

    public static final boolean b(c2l0 c2l0Var) {
        return c2l0Var.equals(new c2l0(c2l0Var.a, c2l0Var.b, c2l0Var.c, c2l0Var.d, c2l0Var.e, c2l0Var.f, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null));
    }

    public static final boolean c(Uri uri) {
        c2l0 g = hz00.E.g(uri);
        if (g == null) {
            return false;
        }
        return !(g.b == null && g.d == null && g.e == null) && b(g);
    }

    public static final boolean d(Intent intent) {
        Uri data = intent.getData();
        if ("route".equalsIgnoreCase(data != null ? data.getAuthority() : null)) {
            return true;
        }
        Uri data2 = intent.getData();
        if ("requirement".equalsIgnoreCase(data2 != null ? data2.getAuthority() : null)) {
            return true;
        }
        Uri data3 = intent.getData();
        if ("transport_routes".equalsIgnoreCase(data3 != null ? data3.getAuthority() : null)) {
            return true;
        }
        Uri data4 = intent.getData();
        if ("mobility_hub".equalsIgnoreCase(data4 != null ? data4.getAuthority() : null)) {
            return true;
        }
        Uri data5 = intent.getData();
        return data5 == null ? false : "geo".equalsIgnoreCase(data5.getScheme());
    }

    public static final a9u0 e(StatusScreenData statusScreenData, rr51 rr51Var) {
        return new a9u0(statusScreenData.getTitle(), statusScreenData.getSubtitle(), rr51Var, statusScreenData.getCloseAction());
    }
}
