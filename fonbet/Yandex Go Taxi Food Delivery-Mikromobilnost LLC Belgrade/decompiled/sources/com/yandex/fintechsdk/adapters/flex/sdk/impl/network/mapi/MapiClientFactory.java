package com.yandex.fintechsdk.adapters.flex.sdk.impl.network.mapi;

import androidx.fragment.app.FragmentActivity;
import com.yandex.fintechsdk.core.network.api.model.Header;
import core.network.mapi.client.a;
import defpackage.ah5;
import defpackage.bgo;
import defpackage.lu00;
import defpackage.mu00;
import defpackage.p85;
import defpackage.ru00;
import defpackage.scc;
import defpackage.su00;
import defpackage.tse;
import defpackage.vxh0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import okhttp3.OkHttpClient;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ;\u0010\u0014\u001a\u00020\u00132\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/network/mapi/MapiClientFactory;", "", "<init>", "()V", "Lp85;", "Landroidx/fragment/app/FragmentActivity;", "activityProvider", "Lah5;", "headersProvider", "", "Lru00;", "createHeaders", "(Lp85;Lah5;)Ljava/util/List;", "Lsu00;", "hostProvider", "Lokhttp3/OkHttpClient;", "okHttpClient", "Ltse;", "scope", "Llu00;", "create", "(Lp85;Lsu00;Lokhttp3/OkHttpClient;Ltse;Lah5;)Llu00;", "impl-18-1-0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class MapiClientFactory {
    public static final MapiClientFactory INSTANCE = new MapiClientFactory();

    private MapiClientFactory() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OkHttpClient create$lambda$0(OkHttpClient okHttpClient, bgo bgoVar) {
        return okHttpClient;
    }

    private final List<ru00> createHeaders(p85 activityProvider, final ah5 headersProvider) {
        FragmentActivity fragmentActivity = (FragmentActivity) activityProvider.a();
        final String string = fragmentActivity != null ? fragmentActivity.getString(vxh0.finsdk_host_divkit_version) : null;
        final String string2 = fragmentActivity != null ? fragmentActivity.getString(vxh0.finsdk_host_flex_version) : null;
        return scc.g(new ru00() { // from class: com.yandex.fintechsdk.adapters.flex.sdk.impl.network.mapi.MapiClientFactory$createHeaders$1
            @Override // defpackage.ru00
            public final Object getHeaders(Continuation<? super Map<String, String>> continuation) {
                return ah5.this.getHeaders();
            }
        }, new ru00() { // from class: com.yandex.fintechsdk.adapters.flex.sdk.impl.network.mapi.MapiClientFactory$createHeaders$2
            @Override // defpackage.ru00
            public final Object getHeaders(Continuation<? super Map<String, String>> continuation) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                String str = string;
                String str2 = string2;
                if (str != null) {
                }
                if (str2 != null) {
                    linkedHashMap.put(Header.FlexVersion.getKey(), str2);
                }
                return linkedHashMap;
            }
        });
    }

    public final lu00 create(p85 activityProvider, su00 hostProvider, OkHttpClient okHttpClient, tse scope, ah5 headersProvider) {
        return new MapiClientImpl(activityProvider, new a(hostProvider, createHeaders(activityProvider, headersProvider), new mu00(okHttpClient, 1)), scope);
    }
}
