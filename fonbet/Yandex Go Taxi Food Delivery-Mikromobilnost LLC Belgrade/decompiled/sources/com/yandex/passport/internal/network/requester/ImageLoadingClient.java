package com.yandex.passport.internal.network.requester;

import android.graphics.Bitmap;
import com.yandex.passport.legacy.lx.k;
import com.yandex.passport.legacy.lx.l;
import defpackage.d5j0;
import defpackage.g7w0;
import defpackage.mzz;
import defpackage.nci0;
import defpackage.t4j0;
import okhttp3.OkHttpClient;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.yandex.video.m3.ott.data.net.impl.ExtFunctionsKt;

@Deprecated
/* loaded from: classes15.dex */
public class ImageLoadingClient {
    private final OkHttpClient client;
    private final mzz memoryCache = new g7w0(SelfTester_JCP.ENCRYPT_CBC, 1);

    public ImageLoadingClient(OkHttpClient okHttpClient) {
        this.client = okHttpClient;
    }

    public static byte[] a(ImageLoadingClient imageLoadingClient, String str) {
        t4j0 t4j0Var = new t4j0();
        t4j0Var.h(str);
        t4j0Var.c.a(ExtFunctionsKt.HEADER_USER_AGENT, com.yandex.passport.common.web.a.a);
        return ((nci0) imageLoadingClient.client.newCall(new d5j0(t4j0Var))).execute().z.bytes();
    }

    public static /* synthetic */ Bitmap b(ImageLoadingClient imageLoadingClient, String str) {
        return (Bitmap) imageLoadingClient.memoryCache.c(str);
    }

    public final k d(String str) {
        int i = 0;
        l lVar = new l(new d(this, str, i));
        return new k(lVar, lVar, new e(this, str), i);
    }
}
