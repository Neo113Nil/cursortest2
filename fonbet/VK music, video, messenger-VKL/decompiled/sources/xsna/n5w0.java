package xsna;

import com.vk.push.common.HostInfoProvider;
import com.vk.push.core.network.PusherHostProvider;
import com.vk.push.core.network.http.HttpClient;
import com.vk.push.core.network.http.HttpRequest;
import com.vk.push.core.network.model.ErrorStatus;
import com.vk.push.core.network.utils.ExtensionsKt;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.Regex;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.vje0;

/* compiled from: VkpnsPusherMessagesApi.kt */
/* loaded from: classes5.dex */
public final class n5w0 {
    public final HttpClient a;
    public final HostInfoProvider b;

    public n5w0(HttpClient httpClient) {
        if (qxi.b == null) {
            throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
        }
        PusherHostProvider pusherHostProvider = new PusherHostProvider();
        this.a = httpClient;
        this.b = pusherHostProvider;
    }

    public static final ArrayList a(n5w0 n5w0Var, String str) {
        vje0 aVar;
        ErrorStatus errorStatus;
        n5w0Var.getClass();
        JSONArray jSONArray = new JSONObject(str).getJSONArray("by_token");
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Regex regex = r9y.a;
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            String string = jSONObject.getString("token");
            if (jSONObject.has("error")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("error");
                String a = r9y.a(jSONObject2, "message");
                String str2 = "";
                if (a == null) {
                    a = "";
                }
                try {
                    String a2 = r9y.a(jSONObject2, "status");
                    if (a2 != null) {
                        str2 = a2;
                    }
                    errorStatus = ErrorStatus.valueOf(str2);
                } catch (Exception unused) {
                    errorStatus = ErrorStatus.UNSPECIFIED_ERROR;
                }
                aVar = new vje0.a(string, a, errorStatus);
            } else {
                try {
                    String string2 = jSONObject.getString("project_id");
                    JSONArray jSONArray2 = jSONObject.getJSONArray("messages");
                    ArrayList arrayList2 = new ArrayList(jSONArray2.length());
                    int length2 = jSONArray2.length();
                    for (int i2 = 0; i2 < length2; i2++) {
                        arrayList2.add(r9y.b(jSONArray2.getJSONObject(i2)));
                    }
                    aVar = new vje0.b(string, string2, jSONObject.optBoolean("partial_content", false), arrayList2);
                } catch (JSONException e) {
                    aVar = new vje0.a(string, String.valueOf(e.getMessage()));
                }
            }
            arrayList.add(aVar);
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ArrayList arrayList, ContinuationImpl continuationImpl) {
        l5w0 l5w0Var;
        int i;
        if (continuationImpl instanceof l5w0) {
            l5w0Var = (l5w0) continuationImpl;
            int i2 = l5w0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                l5w0Var.label = i2 - Integer.MIN_VALUE;
                Object obj = l5w0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = l5w0Var.label;
                if (i == 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    return ((Result) obj).d();
                }
                kotlin.a.a(obj);
                JSONArray jSONArray = new JSONArray();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    rst rstVar = (rst) it.next();
                    jSONArray.put(new JSONObject().put("project_id", rstVar.b).put("token", rstVar.a).put("min_syn", rstVar.c).put(SignalingProtocol.KEY_LIMIT, rstVar.d));
                }
                HttpRequest.Post post = new HttpRequest.Post(ExtensionsKt.getHostInfoHttpBuilder(this.b).addPathSegments("v1/projects/messages:get").build(), new JSONObject().put("requests", jSONArray).toString());
                m5w0 m5w0Var = new m5w0(this);
                l5w0Var.label = 1;
                Object m108executeRequest0E7RQCE = this.a.m108executeRequest0E7RQCE(post, m5w0Var, l5w0Var);
                return m108executeRequest0E7RQCE == coroutineSingletons ? coroutineSingletons : m108executeRequest0E7RQCE;
            }
        }
        l5w0Var = new l5w0(this, continuationImpl);
        Object obj2 = l5w0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = l5w0Var.label;
        if (i == 0) {
        }
    }
}
