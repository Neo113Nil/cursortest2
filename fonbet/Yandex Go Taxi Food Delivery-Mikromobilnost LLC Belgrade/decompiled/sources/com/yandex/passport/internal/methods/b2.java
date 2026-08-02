package com.yandex.passport.internal.methods;

import com.yandex.passport.api.PushPlatform;
import defpackage.scc;
import java.util.List;

/* loaded from: classes8.dex */
public final class b2 extends x2 {
    public final b b;
    public final h3 c;
    public final List d;
    public final d3 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(PushPlatform pushPlatform, String str) {
        super(MethodRef.OnNewPushToken);
        b bVar = new b(pushPlatform);
        h3 h3Var = new h3(str, 4);
        this.b = bVar;
        this.c = h3Var;
        this.d = scc.g(bVar, h3Var);
        this.e = d3.w;
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
