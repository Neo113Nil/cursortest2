package com.yandex.passport.internal.methods;

import android.net.Uri;
import com.yandex.passport.api.PassportUidImpl;
import defpackage.scc;
import java.util.List;

/* loaded from: classes8.dex */
public final class v extends x2 {
    public final f3 b;
    public final q3 c;
    public final List d;
    public final a e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(PassportUidImpl passportUidImpl, Uri uri) {
        super(MethodRef.AcceptAuthInTrack);
        f3 f3Var = new f3(passportUidImpl);
        q3 q3Var = new q3(g.Q, uri);
        this.b = f3Var;
        this.c = q3Var;
        this.d = scc.g(f3Var, q3Var);
        this.e = a.b;
    }

    @Override // com.yandex.passport.internal.methods.x2
    public final List b() {
        return this.d;
    }

    @Override // com.yandex.passport.internal.methods.x2
    public final f c() {
        return this.e;
    }
}
