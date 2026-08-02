package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import defpackage.g8e;
import defpackage.oyo;
import defpackage.ryo;
import defpackage.vt10;
import defpackage.xxq;
import java.util.Map;

/* loaded from: classes11.dex */
public final class i extends ryo {
    @Override // defpackage.ryo
    public final int a(Map.Entry entry) {
        throw g8e.j(entry);
    }

    @Override // defpackage.ryo
    public final void b(oyo oyoVar, vt10 vt10Var, int i) {
        oyoVar.a(vt10Var, i);
    }

    @Override // defpackage.ryo
    public final xxq c(Object obj) {
        return ((GeneratedMessageLite.a) obj).extensions;
    }

    @Override // defpackage.ryo
    public final xxq d(Object obj) {
        GeneratedMessageLite.a aVar = (GeneratedMessageLite.a) obj;
        xxq xxqVar = aVar.extensions;
        if (xxqVar.b) {
            aVar.extensions = xxqVar.clone();
        }
        return aVar.extensions;
    }

    @Override // defpackage.ryo
    public final boolean e(vt10 vt10Var) {
        return vt10Var instanceof GeneratedMessageLite.a;
    }

    @Override // defpackage.ryo
    public final void f(Object obj) {
        ((GeneratedMessageLite.a) obj).extensions.g();
    }

    @Override // defpackage.ryo
    public final void g(Map.Entry entry) {
        throw g8e.j(entry);
    }
}
