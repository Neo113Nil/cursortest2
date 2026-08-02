package com.yandex.quark.file.download.request;

import defpackage.au50;
import defpackage.kwu;
import defpackage.mdh;
import defpackage.sjh;
import defpackage.tje;
import defpackage.uyj;
import defpackage.wly0;
import defpackage.zwf0;
import kotlin.coroutines.Continuation;
import okhttp3.OkHttpClient;

/* loaded from: classes8.dex */
public final class a {
    public final OkHttpClient a;
    public final au50 b;
    public final zwf0 c;

    public a(OkHttpClient okHttpClient, au50 au50Var, zwf0 zwf0Var, wly0 wly0Var) {
        this.a = okHttpClient;
        this.b = au50Var;
        this.c = zwf0Var;
    }

    public final Object a(kwu kwuVar, boolean z, Continuation continuation) {
        sjh sjhVar = uyj.a;
        return tje.k0(mdh.b, new FileDownloadMimeTypeResolver$resolve$2(kwuVar, this, z, null), continuation);
    }
}
