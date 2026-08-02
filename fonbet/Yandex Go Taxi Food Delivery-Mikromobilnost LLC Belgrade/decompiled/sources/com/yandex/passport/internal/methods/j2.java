package com.yandex.passport.internal.methods;

import android.os.Bundle;
import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.api.impl.PassportEnvironmentImpl;
import com.yandex.passport.internal.ui.webview.WebViewActivity;
import defpackage.scc;
import defpackage.xfo;
import java.util.List;

/* loaded from: classes8.dex */
public final class j2 extends x2 {
    public final f3 b;
    public final h3 c;
    public final b d;
    public final b e;
    public final List f;
    public final d3 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(Bundle bundle) {
        super(MethodRef.SendAuthToTrack);
        PassportUidImpl passportUidImpl = new PassportUidImpl(PassportEnvironmentImpl.from(bundle.getInt(WebViewActivity.KEY_ENVIRONMENT)), bundle.getLong("passport-uid"));
        String string = bundle.getString("track-id");
        if (string == null) {
            xfo.g("can't get required string track-id");
            throw null;
        }
        String c = n.y.c(bundle);
        String c2 = n.z.c(bundle);
        f3 f3Var = new f3(passportUidImpl);
        h3 h3Var = new h3(string, 7);
        b bVar = new b(c, 11);
        b bVar2 = new b(c2, 12);
        this.b = f3Var;
        this.c = h3Var;
        this.d = bVar;
        this.e = bVar2;
        this.f = scc.g(f3Var, h3Var, bVar, bVar2);
        this.g = d3.w;
    }

    @Override // com.yandex.passport.internal.methods.x2
    public final List b() {
        return this.f;
    }

    @Override // com.yandex.passport.internal.methods.x2
    public final f c() {
        return this.g;
    }
}
