package com.yandex.delivery.libs.imageupload.impl.data;

import defpackage.fi9;
import defpackage.h3y;
import defpackage.lc21;
import kotlinx.coroutines.flow.e;

/* loaded from: classes11.dex */
public final class a {
    public final h3y a;
    public final lc21 b;

    public a(h3y h3yVar, lc21 lc21Var) {
        this.a = h3yVar;
        this.b = lc21Var;
    }

    public final fi9 a(String str, String str2, byte[] bArr) {
        return e.i(new UploadImageRepositoryImpl$uploadImage$1(bArr, str2, this, str, null));
    }
}
