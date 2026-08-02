package com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.network;

import com.yandex.fintechsdk.adapters.flex.sdk.impl.network.mapi.MapiClientFactory;
import defpackage.ah5;
import defpackage.lu00;
import defpackage.osu;
import defpackage.p85;
import defpackage.p8w;
import defpackage.tse;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import okhttp3.OkHttpClient;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0017\u001a\u00020\r2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/di/module/flex/network/FlexMapiModule;", "", "<init>", "()V", "Lp85;", "Landroidx/fragment/app/FragmentActivity;", "activityProvider", "Ltse;", "coroutineScope", "Lah5;", "extraHeadersProvider", "Losu;", "hostUrlProvider", "Lokhttp3/OkHttpClient;", "okHttpClient", "Llu00;", "provideMapiClient", "(Lp85;Ltse;Lah5;Losu;Lokhttp3/OkHttpClient;)Llu00;", "", "Lp8w;", "interceptors", "Lokhttp3/OkHttpClient$a;", "okHttpClientBuilder", "provideOkHttpClient", "(Ljava/util/Set;Lokhttp3/OkHttpClient$a;)Lokhttp3/OkHttpClient;", "impl-18-1-0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FlexMapiModule {
    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object provideMapiClient$getHostUrl(osu osuVar, Continuation continuation) {
        return osuVar.a();
    }

    public final lu00 provideMapiClient(p85 activityProvider, tse coroutineScope, ah5 extraHeadersProvider, osu hostUrlProvider, OkHttpClient okHttpClient) {
        return MapiClientFactory.INSTANCE.create(activityProvider, new FlexMapiModule$provideMapiClient$1(hostUrlProvider), okHttpClient, coroutineScope, extraHeadersProvider);
    }

    public final OkHttpClient provideOkHttpClient(Set<p8w> interceptors, OkHttpClient.a okHttpClientBuilder) {
        Iterator<T> it = interceptors.iterator();
        while (it.hasNext()) {
            okHttpClientBuilder.a((p8w) it.next());
        }
        return new OkHttpClient(okHttpClientBuilder);
    }
}
