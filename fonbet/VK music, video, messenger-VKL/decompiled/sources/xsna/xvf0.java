package xsna;

import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.json.JSONObject;
import ru.ok.android.commons.http.Http;

/* compiled from: RemoteSettingsFetcher.kt */
@b6l(c = "com.google.firebase.sessions.settings.RemoteSettingsFetcher$doConfigFetch$2", f = "RemoteSettingsFetcher.kt", l = {TokenParametersOuterClass$TokenParameters.APPSETID_FIELD_NUMBER, TokenParametersOuterClass$TokenParameters.TOPICS_FIELD_NUMBER, TokenParametersOuterClass$TokenParameters.GPP_FIELD_NUMBER}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class xvf0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ Map<String, String> $headerOptions;
    final /* synthetic */ wzs<String, spj<? super s3q0>, Object> $onFailure;
    final /* synthetic */ wzs<JSONObject, spj<? super s3q0>, Object> $onSuccess;
    int label;
    final /* synthetic */ yvf0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public xvf0(yvf0 yvf0Var, Map<String, String> map, wzs<? super JSONObject, ? super spj<? super s3q0>, ? extends Object> wzsVar, wzs<? super String, ? super spj<? super s3q0>, ? extends Object> wzsVar2, spj<? super xvf0> spjVar) {
        super(2, spjVar);
        this.this$0 = yvf0Var;
        this.$headerOptions = map;
        this.$onSuccess = wzsVar;
        this.$onFailure = wzsVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new xvf0(this.this$0, this.$headerOptions, this.$onSuccess, this.$onFailure, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((xvf0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c4, code lost:
    
        if (r8.invoke(r1, r7) == r0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d9, code lost:
    
        if (r1.invoke(r3, r7) != r0) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [T, java.lang.String] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
        } catch (Exception e) {
            wzs<String, spj<? super s3q0>, Object> wzsVar = this.$onFailure;
            String message = e.getMessage();
            if (message == null) {
                message = e.toString();
            }
            this.label = 3;
        }
        if (i == 0) {
            kotlin.a.a(obj);
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) yvf0.b(this.this$0).openConnection();
            httpsURLConnection.setRequestMethod("GET");
            httpsURLConnection.setRequestProperty(Http.Header.ACCEPT, "application/json");
            for (Map.Entry<String, String> entry : this.$headerOptions.entrySet()) {
                httpsURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
            }
            int responseCode = httpsURLConnection.getResponseCode();
            if (responseCode == 200) {
                InputStream inputStream = httpsURLConnection.getInputStream();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                StringBuilder sb = new StringBuilder();
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                while (true) {
                    ?? readLine = bufferedReader.readLine();
                    ref$ObjectRef.element = readLine;
                    if (readLine == 0) {
                        break;
                    }
                    sb.append((String) readLine);
                }
                bufferedReader.close();
                inputStream.close();
                JSONObject jSONObject = new JSONObject(sb.toString());
                wzs<JSONObject, spj<? super s3q0>, Object> wzsVar2 = this.$onSuccess;
                this.label = 1;
                if (wzsVar2.invoke(jSONObject, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                wzs<String, spj<? super s3q0>, Object> wzsVar3 = this.$onFailure;
                String str = "Bad response code: " + responseCode;
                this.label = 2;
            }
        } else if (i == 1 || i == 2) {
            kotlin.a.a(obj);
        } else {
            if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        return s3q0.a;
    }
}
