package xsna;

import com.vk.push.common.HostInfoProvider;
import com.vk.push.core.network.http.HttpClient;
import com.vk.push.core.network.http.HttpRequest;
import com.vk.push.core.network.utils.ExtensionsKt;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.json.JSONObject;

/* compiled from: PushTokenApiImpl.kt */
/* loaded from: classes5.dex */
public final class rke0 {
    public final HttpClient a;
    public final HostInfoProvider b;

    public rke0(HttpClient httpClient, HostInfoProvider hostInfoProvider) {
        this.a = httpClient;
        this.b = hostInfoProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, ContinuationImpl continuationImpl) {
        qke0 qke0Var;
        int i;
        if (continuationImpl instanceof qke0) {
            qke0Var = (qke0) continuationImpl;
            int i2 = qke0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qke0Var.label = i2 - Integer.MIN_VALUE;
                Object obj = qke0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = qke0Var.label;
                if (i == 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    return ((Result) obj).d();
                }
                kotlin.a.a(obj);
                HttpRequest.Post post = new HttpRequest.Post(ExtensionsKt.getHostInfoHttpBuilder(this.b).addPathSegments("v1/projects/" + str2 + "/token:invalidate").build(), new JSONObject().put("token", str).toString());
                mnp mnpVar = mnp.k;
                qke0Var.label = 1;
                Object m108executeRequest0E7RQCE = this.a.m108executeRequest0E7RQCE(post, mnpVar, qke0Var);
                return m108executeRequest0E7RQCE == coroutineSingletons ? coroutineSingletons : m108executeRequest0E7RQCE;
            }
        }
        qke0Var = new qke0(this, continuationImpl);
        Object obj2 = qke0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = qke0Var.label;
        if (i == 0) {
        }
    }
}
