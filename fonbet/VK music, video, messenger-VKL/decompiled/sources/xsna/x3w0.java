package xsna;

import com.vk.push.core.network.http.HttpClient;
import com.vk.push.core.network.http.HttpRequest;
import com.vk.push.core.network.utils.UrlBuilder;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.json.JSONObject;
import ru.ok.android.api.methods.authV2.login.LoginApiConstants;
import ru.ok.android.sdk.SharedKt;

/* compiled from: VkpnsAuthApi.kt */
/* loaded from: classes5.dex */
public final class x3w0 implements q15 {
    public final HttpClient a;
    public final his0 b;

    public x3w0(HttpClient httpClient) {
        his0 his0Var = w65.d;
        this.a = httpClient;
        this.b = his0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // xsna.q15
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, String str3, String str4, ContinuationImpl continuationImpl) {
        v3w0 v3w0Var;
        int i;
        if (continuationImpl instanceof v3w0) {
            v3w0Var = (v3w0) continuationImpl;
            int i2 = v3w0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                v3w0Var.label = i2 - Integer.MIN_VALUE;
                Object obj = v3w0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = v3w0Var.label;
                if (i == 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    return ((Result) obj).d();
                }
                kotlin.a.a(obj);
                HttpRequest.Post post = new HttpRequest.Post(new UrlBuilder(this.b).addPathSegments("v1/token/new").build(), new JSONObject().put(SharedKt.PARAM_AUTH_TYPE, str).put(LoginApiConstants.RESULT_NAME_AUTH_TOKEN, str2).put("package_id", str3).put("pub_key", str4).toString());
                w3w0 w3w0Var = new w3w0(this);
                v3w0Var.label = 1;
                Object m108executeRequest0E7RQCE = this.a.m108executeRequest0E7RQCE(post, w3w0Var, v3w0Var);
                return m108executeRequest0E7RQCE == coroutineSingletons ? coroutineSingletons : m108executeRequest0E7RQCE;
            }
        }
        v3w0Var = new v3w0(this, continuationImpl);
        Object obj2 = v3w0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = v3w0Var.label;
        if (i == 0) {
        }
    }
}
