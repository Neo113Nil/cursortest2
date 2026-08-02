package com.yandex.go.flex.common.data.bdui;

import defpackage.i3y;
import defpackage.s76;
import defpackage.wg10;
import defpackage.xg10;
import kotlin.LazyThreadSafetyMode;

/* loaded from: classes.dex */
public final class c implements s76 {
    public final kotlinx.serialization.json.b a;
    public final wg10 b;
    public final i3y c;

    public c(kotlinx.serialization.json.b bVar) {
        wg10 wg10Var = xg10.a;
        this.a = bVar;
        this.b = wg10Var;
        this.c = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new JsonBody$string$2(0, bVar, kotlinx.serialization.json.b.class, "toString", "toString()Ljava/lang/String;", 0));
    }

    @Override // defpackage.s76
    public final kotlinx.serialization.json.b a() {
        return this.a;
    }

    @Override // defpackage.s76
    public final wg10 getContentType() {
        return this.b;
    }

    @Override // defpackage.s76
    public final String toString() {
        return (String) this.c.getValue();
    }
}
