package com.google.firebase.sessions.settings;

import defpackage.fwi0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.json.JSONObject;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.video.m3.list_player_manager.impl.image.GlideBitmapDownloader;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.google.firebase.sessions.settings.RemoteSettingsFetcher$doConfigFetch$2", f = "RemoteSettingsFetcher.kt", l = {HProv.ALG_SID_GR3410_12_256, HProv.PROV_GOST_2001_DH, HProv.ALG_SID_SHA3_256}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class RemoteSettingsFetcher$doConfigFetch$2 extends SuspendLambda implements wls {
    final /* synthetic */ Map<String, String> $headerOptions;
    final /* synthetic */ wls $onFailure;
    final /* synthetic */ wls $onSuccess;
    int label;
    final /* synthetic */ fwi0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteSettingsFetcher$doConfigFetch$2(fwi0 fwi0Var, Map map, wls wlsVar, wls wlsVar2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fwi0Var;
        this.$headerOptions = map;
        this.$onSuccess = wlsVar;
        this.$onFailure = wlsVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RemoteSettingsFetcher$doConfigFetch$2(this.this$0, this.$headerOptions, this.$onSuccess, this.$onFailure, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RemoteSettingsFetcher$doConfigFetch$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c3, code lost:
    
        if (r8.invoke(r1, r7) == r0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d8, code lost:
    
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
            wls wlsVar = this.$onFailure;
            String message = e.getMessage();
            if (message == null) {
                message = e.toString();
            }
            this.label = 3;
        }
        if (i == 0) {
            kotlin.b.b(obj);
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) fwi0.a(this.this$0).openConnection();
            httpsURLConnection.setRequestMethod("GET");
            httpsURLConnection.setRequestProperty(GlideBitmapDownloader.ACCEPT_HEADER, "application/json");
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
                wls wlsVar2 = this.$onSuccess;
                this.label = 1;
                if (wlsVar2.invoke(jSONObject, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                wls wlsVar3 = this.$onFailure;
                String str = "Bad response code: " + responseCode;
                this.label = 2;
            }
        } else if (i == 1 || i == 2) {
            kotlin.b.b(obj);
        } else {
            if (i != 3) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
