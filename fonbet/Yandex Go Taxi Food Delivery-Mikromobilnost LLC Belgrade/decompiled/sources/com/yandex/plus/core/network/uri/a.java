package com.yandex.plus.core.network.uri;

import android.net.Uri;
import defpackage.gs50;
import defpackage.ny61;
import defpackage.pg21;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class a implements c {
    public final pg21 a;

    public a(pg21 pg21Var) {
        this.a = pg21Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Uri.Builder builder, ContinuationImpl continuationImpl) {
        NetworkEndPointUriPreparer$prepare$1 networkEndPointUriPreparer$prepare$1;
        int i;
        gs50 gs50Var;
        if (continuationImpl instanceof NetworkEndPointUriPreparer$prepare$1) {
            networkEndPointUriPreparer$prepare$1 = (NetworkEndPointUriPreparer$prepare$1) continuationImpl;
            int i2 = networkEndPointUriPreparer$prepare$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                networkEndPointUriPreparer$prepare$1.label = i2 - Integer.MIN_VALUE;
                Object obj = networkEndPointUriPreparer$prepare$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = networkEndPointUriPreparer$prepare$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    networkEndPointUriPreparer$prepare$1.L$0 = builder;
                    networkEndPointUriPreparer$prepare$1.label = 1;
                    Uri url = this.a.a.getUrl();
                    String scheme = url.getScheme();
                    String host = url.getHost();
                    obj = (scheme == null || host == null) ? null : new gs50(scheme, host);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    builder = (Uri.Builder) networkEndPointUriPreparer$prepare$1.L$0;
                    kotlin.b.b(obj);
                }
                gs50Var = (gs50) obj;
                if (gs50Var != null) {
                    throw new Exception() { // from class: com.yandex.plus.core.network.uri.NetworkEndPointUriPreparer$EmptyEndPointException
                    };
                }
                builder.scheme(gs50Var.a).authority(gs50Var.b);
                return zy11.a;
            }
        }
        networkEndPointUriPreparer$prepare$1 = new NetworkEndPointUriPreparer$prepare$1(this, continuationImpl);
        Object obj2 = networkEndPointUriPreparer$prepare$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = networkEndPointUriPreparer$prepare$1.label;
        if (i != 0) {
        }
        gs50Var = (gs50) obj2;
        if (gs50Var != null) {
        }
    }
}
