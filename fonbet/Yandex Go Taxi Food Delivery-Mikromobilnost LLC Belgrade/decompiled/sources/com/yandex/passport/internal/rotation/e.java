package com.yandex.passport.internal.rotation;

import defpackage.p53;
import defpackage.rbx;
import defpackage.sbx;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.KSerializer;

/* loaded from: classes15.dex */
public final class e {
    public static List a(String str) {
        rbx rbxVar = sbx.d;
        rbxVar.getClass();
        return (List) rbxVar.b(new p53(f.Companion.serializer(), 0), str);
    }

    public final String b(ArrayList arrayList) {
        return sbx.d.c(arrayList, new p53(serializer(), 0));
    }

    public final KSerializer serializer() {
        return d.a;
    }
}
