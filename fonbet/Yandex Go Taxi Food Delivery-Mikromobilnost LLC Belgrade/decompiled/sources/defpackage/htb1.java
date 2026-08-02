package defpackage;

import android.net.Uri;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.deeplink.generated.TransferStateAction;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes3.dex */
public abstract class htb1 {
    public static final int a(c7f c7fVar) {
        gtb1 gtb1Var = c7fVar.c;
        if (!(gtb1Var instanceof y6f)) {
            if (gtb1Var instanceof z6f) {
                return dzh0.ybsdk_pin_setting_code_hint;
            }
            if (jl40.l(gtb1Var, a7f.a)) {
                return dzh0.ybsdk_pin_code_successful_hint;
            }
            if (jl40.l(gtb1Var, b7f.a)) {
                return c7fVar.b(0) ? dzh0.ybsdk_pin_repeat_code_hint : dzh0.ybsdk_pin_weak_pin_hint;
            }
            w511.b();
            return 0;
        }
        y6f y6fVar = (y6f) gtb1Var;
        if (jl40.l(y6fVar, y6f.b)) {
            return dzh0.ybsdk_pin_code_error_hint;
        }
        if (jl40.l(y6fVar, y6f.d)) {
            return dzh0.ybsdk_pin_weak_code_error_hint;
        }
        if (jl40.l(y6fVar, y6f.c)) {
            return dzh0.ybsdk_pin_different_pin_hint;
        }
        w511.b();
        return 0;
    }

    public static final float b(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float c(long j) {
        return Float.intBitsToFloat((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
    }

    public static TransferStateAction d(Uri uri) {
        String queryParameter;
        String queryParameter2;
        String queryParameter3;
        String queryParameter4;
        String queryParameter5;
        String queryParameter6 = uri.getQueryParameter("scenario");
        if (queryParameter6 != null && (queryParameter = uri.getQueryParameter("direction")) != null && (queryParameter2 = uri.getQueryParameter("amount")) != null && (queryParameter3 = uri.getQueryParameter("state_header_title")) != null && (queryParameter4 = uri.getQueryParameter("state_image_light")) != null) {
            ThemedImageUrlEntity themedImageUrlEntity = new ThemedImageUrlEntity(queryParameter4, uri.getQueryParameter("state_image_light_dark"));
            String queryParameter7 = uri.getQueryParameter("state_title");
            if (queryParameter7 != null && (queryParameter5 = uri.getQueryParameter("state_description")) != null) {
                String queryParameter8 = uri.getQueryParameter("currency");
                if (queryParameter8 == null) {
                    queryParameter8 = "RUB";
                }
                String str = queryParameter8;
                String queryParameter9 = uri.getQueryParameter("timeout_header_title");
                String queryParameter10 = uri.getQueryParameter("timeout_image_light");
                return new TransferStateAction(queryParameter6, queryParameter, queryParameter2, queryParameter3, themedImageUrlEntity, queryParameter7, queryParameter5, str, queryParameter9, queryParameter10 != null ? new ThemedImageUrlEntity(queryParameter10, uri.getQueryParameter("timeout_image_light_dark")) : null, uri.getQueryParameter("timeout_title"), uri.getQueryParameter("timeout_description"), uri.getQueryParameter("target_agreement_id"), uri.getQueryParameter("source_agreement_id"), uri.getQueryParameter("target_id"), uri.getQueryParameter("plan_id"));
            }
        }
        return null;
    }
}
