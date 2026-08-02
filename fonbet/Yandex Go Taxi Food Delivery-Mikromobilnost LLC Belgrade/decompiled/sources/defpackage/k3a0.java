package defpackage;

import java.io.Serializable;
import java.util.Map;
import kotlin.Result;
import org.json.JSONObject;
import ru.yandex.tankerapp.domain.error.PaymentKitPluginError;

/* loaded from: classes5.dex */
public final class k3a0 {
    public static final k3a0 a = new k3a0();

    public static Object a(Object obj) {
        Object failure;
        Object failure2;
        try {
            Object obj2 = obj instanceof String ? obj : null;
            if (obj2 != null) {
                failure2 = (String) obj2;
            } else {
                if (!(obj instanceof Map)) {
                    obj = null;
                }
                if (obj == null || (failure2 = new JSONObject((Map) obj).toString()) == null) {
                    failure2 = new Result.Failure(PaymentKitPluginError.InvalidArgumentsError.a);
                }
            }
            failure = new Result(failure2);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Result result = (Result) (failure instanceof Result.Failure ? null : failure);
        return result != null ? result.getValue() : new Result.Failure(PaymentKitPluginError.InvalidArgumentsError.a);
    }

    public static Map b(Serializable serializable) {
        return (Map) hcx.a().c(Map.class, hcx.a().h(serializable));
    }
}
