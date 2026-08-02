package com.yandex.feed.advertisement;

import android.os.Build;
import defpackage.b64;
import defpackage.evu0;
import defpackage.h5z0;
import defpackage.je1;
import defpackage.jl40;
import defpackage.le1;
import defpackage.mvg;
import defpackage.ne1;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.ott.data.net.impl.ExtFunctionsKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.feed.advertisement.AdvertisementBillingSenderImpl$send$2", f = "AdvertisementBillingSenderImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class AdvertisementBillingSenderImpl$send$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $eventUrl;
    final /* synthetic */ Map<String, String> $headers;
    final /* synthetic */ boolean $sendReferer;
    final /* synthetic */ boolean $sendYaCookies;
    int label;
    final /* synthetic */ je1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvertisementBillingSenderImpl$send$2(String str, boolean z, je1 je1Var, Map map, boolean z2, Continuation continuation) {
        super(2, continuation);
        this.$eventUrl = str;
        this.$sendYaCookies = z;
        this.this$0 = je1Var;
        this.$headers = map;
        this.$sendReferer = z2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AdvertisementBillingSenderImpl$send$2(this.$eventUrl, this.$sendYaCookies, this.this$0, this.$headers, this.$sendReferer, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        AdvertisementBillingSenderImpl$send$2 advertisementBillingSenderImpl$send$2 = (AdvertisementBillingSenderImpl$send$2) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        advertisementBillingSenderImpl$send$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String string;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.$eventUrl).openConnection();
            Map<String, String> map = this.$headers;
            je1 je1Var = this.this$0;
            boolean z = this.$sendReferer;
            boolean z2 = this.$sendYaCookies;
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
                }
            }
            if (!jl40.c(ExtFunctionsKt.HEADER_USER_AGENT, map)) {
                je1Var.getClass();
                httpURLConnection.setRequestProperty(ExtFunctionsKt.HEADER_USER_AGENT, oyr.t(b64.v("Flex/1.0 (Android/", Build.VERSION.RELEASE, Extension.SEMICOLON_SPACE, Build.MODEL, "/"), Build.BRAND, Extension.C_BRAKE));
            }
            if (z && !evu0.J(je1Var.c) && !jl40.c("Referer", map)) {
                httpURLConnection.setRequestProperty("Referer", je1Var.c);
            }
            if (z2 && (string = je1Var.a.a.getString("cookie", null)) != null) {
                httpURLConnection.setRequestProperty("Cookie", string);
            }
            httpURLConnection.connect();
            if (this.$sendYaCookies) {
                le1 le1Var = this.this$0.e;
                Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                String string2 = this.this$0.a.a.getString("cookie", null);
                le1Var.getClass();
                String a = le1.a(string2, headerFields);
                ne1 ne1Var = this.this$0.a;
                if (!evu0.J(a)) {
                    ne1Var.a.edit().putString("cookie", a).apply();
                }
            }
        } catch (Exception e) {
            h5z0.a.e(e);
        }
        return zy11.a;
    }
}
