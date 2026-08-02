package com.yandex.passport.internal.network.requester;

import android.graphics.Bitmap;
import com.yandex.passport.internal.t;
import com.yandex.passport.legacy.lx.j;
import com.yandex.passport.legacy.lx.k;
import com.yandex.passport.legacy.lx.l;

/* loaded from: classes15.dex */
public final /* synthetic */ class e implements j, com.yandex.passport.legacy.lx.a {
    public final /* synthetic */ ImageLoadingClient a;
    public final /* synthetic */ String b;

    public /* synthetic */ e(ImageLoadingClient imageLoadingClient, String str) {
        this.a = imageLoadingClient;
        this.b = str;
    }

    @Override // com.yandex.passport.legacy.lx.j
    public Object a(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            return new l(new t(1, bitmap));
        }
        ImageLoadingClient imageLoadingClient = this.a;
        String str = this.b;
        l lVar = new l(new d(imageLoadingClient, str, 1));
        k kVar = new k(lVar, lVar, new com.yandex.passport.common.util.b(1), 2);
        return new k(kVar, kVar, new e(imageLoadingClient, str), 1);
    }

    @Override // com.yandex.passport.legacy.lx.a
    /* renamed from: a */
    public void mo290a(Object obj) {
        this.a.memoryCache.d(this.b, (Bitmap) obj);
    }
}
