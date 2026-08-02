package com.yandex.fintechsdk.adapters.flex.sdk.impl.network;

import defpackage.dyg;
import defpackage.jp50;
import defpackage.kc7;
import defpackage.n8j0;
import defpackage.p7j0;
import defpackage.tls;
import defpackage.tse;
import flex.network.cache.impl.a;
import java.io.InputStream;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\u000b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\n\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ_\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0012\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\r2\u0006\u0010\u0006\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b2\u001e\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00120\u0007H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0003J\u0017\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/network/NetworkCachingImpl;", "Ljp50;", "<init>", "()V", "Resource", "Lp7j0;", "networkDataModel", "Lkotlin/Function1;", "Ljava/io/InputStream;", "decoder", "Lkc7;", "load", "(Lp7j0;Ltls;)Lkc7;", "Error", "Ln8j0;", "", "saveForNextUse", "rawResponse", "Ldyg;", "save", "(Ln8j0;ZLjava/io/InputStream;Ltls;)Ldyg;", "Lzy11;", "invalidate", "delete", "(Lp7j0;)V", "impl-18-1-0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class NetworkCachingImpl implements jp50 {
    @Override // defpackage.jp50
    public void delete(p7j0 networkDataModel) {
    }

    @Override // defpackage.jp50
    public void invalidate() {
    }

    @Override // defpackage.jp50
    public <Resource> kc7 load(p7j0 networkDataModel, tls decoder) {
        return null;
    }

    @Override // defpackage.jp50
    public <Resource, Error> dyg save(n8j0 networkDataModel, boolean saveForNextUse, InputStream rawResponse, tls decoder) {
        return (dyg) decoder.invoke(rawResponse);
    }

    public a withAsync(flex.network.cache.a aVar, tse tseVar) {
        return new a(aVar, tseVar);
    }
}
