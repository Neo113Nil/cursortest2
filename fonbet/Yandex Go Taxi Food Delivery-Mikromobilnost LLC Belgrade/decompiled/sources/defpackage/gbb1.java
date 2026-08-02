package defpackage;

import com.yandex.messaging.internal.authorized.j;
import com.yandex.messaging.internal.suspend.extensions.BridgeExtensionsKt$userComponentFlow$$inlined$disposableFlowWrapper$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import org.json.JSONObject;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes11.dex */
public abstract class gbb1 {
    public static final String a(String str, JSONObject jSONObject) {
        if (!jSONObject.has(str)) {
            return null;
        }
        String string = jSONObject.getString(str);
        if (string.length() > 0) {
            return string;
        }
        return null;
    }

    public static final bgr0 b(bgr0 bgr0Var, bgr0 bgr0Var2, float f) {
        long L = rzo.L(bgr0Var.a, f, bgr0Var2.a);
        long j = bgr0Var.b;
        long j2 = bgr0Var2.b;
        float d = cjb1.d(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 >> 32)), f);
        float d2 = cjb1.d(Float.intBitsToFloat((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)), Float.intBitsToFloat((int) (j2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)), f);
        return new bgr0(L, (Float.floatToRawIntBits(d) << 32) | (Float.floatToRawIntBits(d2) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), cjb1.d(bgr0Var.c, bgr0Var2.c, f));
    }

    public static final Object c(j jVar, ContinuationImpl continuationImpl) {
        return e.y(d(jVar), continuationImpl);
    }

    public static final fi9 d(j jVar) {
        return e.i(new BridgeExtensionsKt$userComponentFlow$$inlined$disposableFlowWrapper$1(null, jVar));
    }
}
