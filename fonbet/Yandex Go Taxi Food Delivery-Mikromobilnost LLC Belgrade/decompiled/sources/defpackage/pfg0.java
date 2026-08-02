package defpackage;

import android.net.Uri;
import com.squareup.moshi.Types;
import com.ybsdk.rconfig.CommonExperiment;
import com.ybsdk.rconfig.ExperimentApplyType;
import com.ybsdk.rconfig.configs.QrShortcutConfig;
import java.lang.reflect.ParameterizedType;
import kotlin.text.Regex;

/* loaded from: classes9.dex */
public abstract class pfg0 {
    public static final dfr a;

    static {
        byte[] bArr = tje.p;
        byte[] bArr2 = new byte[31];
        for (int i = 0; i < 31; i++) {
            bArr2[i] = (byte) (bArr[i] ^ tje.b[i % 8]);
        }
        String str = new String(bArr2, uza.a);
        ParameterizedType newParameterizedType = Types.newParameterizedType(CommonExperiment.class, QrShortcutConfig.class);
        Regex regex = gtu0.a;
        a = new dfr(str, newParameterizedType, new CommonExperiment(new QrShortcutConfig(true, "ybapp://screen.open/transfers_dashboard?source=app_shortcut&tokenization_product_id=wallet&fallback=".concat(Uri.encode("ybapp://screen.open/qr_scan?source=app_shortcut"))), ExperimentApplyType.COLD_START));
    }
}
